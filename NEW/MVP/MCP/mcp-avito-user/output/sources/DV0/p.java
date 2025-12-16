package DV0;

import kotlin.Metadata;

/* compiled from: SayHello.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDV0/p;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f3208a = new p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f3209b = "SayHello";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f3210c = "{\n  \"functions\": {\n    \"Padding\": {\n      \"params\": {\n        \"all\": 0,\n        \"horizontal\": \"{{all}}\",\n        \"vertical\": \"{{all}}\",\n        \"top\": \"{{vertical}}\",\n        \"bottom\": \"{{vertical}}\",\n        \"start\": \"{{horizontal}}\",\n        \"end\": \"{{horizontal}}\"\n      },\n      \"result\": \"{{params}}\"\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"text\": \"\",\n      \"wasHelloClicked\": false\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Box\",\n      \"children\": [\n        {\n          \"componentType\": \"Column\",\n          \"layout_alignment\": \"Center\",\n          \"children\": [\n            {\n              \"componentType\": \"Text\",\n              \"id\": \"@id/text\",\n              \"style\": {\n                \"styleName\": \"textH10\"\n              },\n              \"textAlign\": \"Center\",\n              \"layout_width\": \"fillMax\",\n              \"text\": \"{{text}}\",\n              \"layout_margin\": {\n                \"functionType\": \"Padding\",\n                \"horizontal\": 16,\n                \"vertical\": 8\n              }\n            },\n            {\n              \"componentType\": \"Row\",\n              \"layout_margin\": {\n                \"functionType\": \"Padding\",\n                \"start\": 16,\n                \"end\": 8\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"Button\",\n                  \"id\": \"@id/hello_button\",\n                  \"text\": \"Say Hello\",\n                  \"style\": {\n                    \"styleName\": \"buttonOverlayPrimaryLarge\"\n                  },\n                  \"layout_weight\": 1,\n                  \"onClick\": {\n                    \"interactionType\": \"StatePatch\",\n                    \"patch\": {\n                      \"text\": \"Hello World!\",\n                      \"wasHelloClicked\": true\n                    }\n                  },\n                  \"layout_margin\": {\n                    \"functionType\": \"Padding\",\n                    \"end\": 8\n                  }\n                },\n                {\n                  \"componentType\": \"Button\",\n                  \"id\": \"@id/buy_button\",\n                  \"text\": \"Say Bye\",\n                  \"layout_weight\": 1,\n                  \"visible\": \"{{wasHelloClicked}}\",\n                  \"onClick\": {\n                    \"interactionType\": \"StatePatch\",\n                    \"patch\": {\n                      \"text\": \"Bye World!\",\n                      \"wasHelloClicked\": false\n                    }\n                  },\n                  \"layout_margin\": {\n                    \"functionType\": \"Padding\",\n                    \"end\": 8\n                  }\n                }\n              ]\n            }\n          ]\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f3210c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f3209b;
    }
}
