package org.folio.rest;


/**
 * @author shale
 *
 */

//@RunWith(VertxUnitRunner.class)
public class TestClient {

/*  private static Vertx      vertx;
  private ArrayList<String> urls;
  int                       port;
  ConfigurationsClient cc = null;
  TenantClient ac = null;

  @Before
  public void setUp(TestContext context) throws IOException {
    vertx = Vertx.vertx();

    try {
      setupPostgres();
    } catch (Exception e) {
      e.printStackTrace();
    }
    Async async = context.async();
    DeploymentOptions options = new DeploymentOptions().setConfig(new JsonObject().put("http.port",
      port = NetworkUtils.nextFreePort()));
    vertx.deployVerticle(RestVerticle.class.getName(), options, context.asyncAssertSuccess(id -> {
      async.complete();
    }));

    cc = new ConfigurationsClient("localhost", port, "harvard");

  }

  private static void setupPostgres() throws Exception {
    PostgresClient.setIsEmbedded(true);
    PostgresClient.getInstance(vertx).startEmbeddedPostgres();
  }

  @After
  public void tearDown(TestContext context) {
    vertx.close(context.asyncAssertSuccess());
  }

  @Test
  public void test(TestContext context){

    try {
      Async async = context.async(2);
      ac = new TenantClient("localhost", port, "harvard");
      ac.post(reply -> {
          try {
            postConfigs(async, context);
          } catch (Exception e) {
            e.printStackTrace();
          }
        });
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public void getConfigs(Async async, TestContext context) {
    cc.getEntries("module==CIRCULATION", 0, 10, "en", response -> {
      response.bodyHandler(body -> {
        System.out.println(body);
        if(response.statusCode() == 500){
          context.fail("status " + response.statusCode());
        }
        else{
          async.countDown();
        }
        ac.delete( reply -> {
          reply.bodyHandler( body2 -> {
            System.out.println(body2);
            async.countDown();
          });
        });
      });
    });
  }

  public void postConfigs(Async async, TestContext context) throws Exception {
    String content = getFile("kv_configuration.sample");
    Config conf =  new ObjectMapper().readValue(content, Config.class);
    cc.postEntries(null, conf, reply -> {
      reply.bodyHandler( handler -> {
        try {
          System.out.println(new String(handler.getBytes(), "UTF8"));
          async.countDown();
          getConfigs(async, context);
        } catch (Exception e) {
          e.printStackTrace();
          async.complete();
        }
      });
      System.out.println(reply.statusCode());
      System.out.println(reply.getHeader("Location"));
    });
  }

  private static String getFile(String filename) throws IOException {
    return IOUtils.toString(TestClient.class.getClassLoader().getResourceAsStream(filename), "UTF-8");
  }*/

}
