package AV0;

import kotlin.Metadata;

/* compiled from: SetStatusBarContentAppearance.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/L;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final L f376a = new L();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f377b = "SetStatusBarContentAppearance";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f378c = "{\n  \"components\": {\n    \"SelectablePropsComponent\": {\n      \"params\": {\n        \"onShow\": null,\n        \"title\": \"\",\n        \"children\": []\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"layout_margin\": {\n              \"top\": 12,\n              \"bottom\": 8\n            },\n            \"layout_padding\": {\n              \"top\": 12,\n              \"bottom\": 8\n            },\n            \"text\": \"{{params.title}}\",\n            \"style\": {\n              \"styleName\": \"textH60\"\n            }\n          },\n          {\n            \"componentType\": \"Chips\",\n            \"displayView\": \"SingleLineScrollable\",\n            \"children\": \"{{params.children}}\",\n            \"style\": {\n              \"styleName\": \"chipsSmall\"\n            }\n          }\n        ],\n        \"onShow\": \"{{params.onShow}}\"\n      }\n    }\n  },\n  \"functions\": {},\n  \"main\": {\n    \"params\": {\n      \"values\": [\n        \"auto\",\n        \"light\",\n        \"dark\"\n      ],\n      \"&value\": {\n        \"functionType\": \"ArrayGet\",\n        \"array\": \"{{params.values}}\",\n        \"index\": 0\n      }\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"SelectablePropsComponent\",\n          \"onShow\": {\n            \"interactionType\": \"SetStatusBarContentAppearance\",\n            \"value\": \"{{params.value}}\"\n          },\n          \"title\": \"Status bar content appearance\",\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{params.values}}\",\n            \"template\": {\n              \"modifiers\": [\n                {\n                  \"modifierType\": \"raw\"\n                }\n              ],\n              \"value\": {\n                \"title\": {\n                  \"functionType\": \"ToString\",\n                  \"value\": \"{{it}}\"\n                },\n                \"isEnabled\": true,\n                \"isSelected\": {\n                  \"functionType\": \"CheckEquals\",\n                  \"value1\": \"{{params.value}}\",\n                  \"value2\": \"{{it}}\"\n                },\n                \"isActive\": true,\n                \"onChange\": {\n                  \"interactionType\": \"Sequence\",\n                  \"items\": [\n                    {\n                      \"interactionType\": \"Mutate\",\n                      \"to\": \"{{params.value}}\",\n                      \"from\": \"{{it}}\",\n                      \"format\": \"finalData\"\n                    },\n                    {\n                      \"interactionType\": \"Delegate\",\n                      \"targetArgs\": {\n                        \"value\": \"{{params.value}}\"\n                      },\n                      \"to\": {\n                        \"interactionType\": \"SetStatusBarContentAppearance\",\n                        \"value\": \"{{args.value}}\"\n                      }\n                    }\n                  ]\n                }\n              }\n            }\n          }\n        }\n      ],\n      \"padding\": {\n        \"start\": 16,\n        \"end\": 16,\n        \"top\": 16,\n        \"bottom\": 16\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f378c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f377b;
    }
}
