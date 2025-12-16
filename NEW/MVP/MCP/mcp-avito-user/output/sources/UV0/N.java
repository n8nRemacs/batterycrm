package uV0;

import kotlin.Metadata;

/* compiled from: Radio.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/N;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class N implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final N f439999a = new N();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440000b = "Radio";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440001c = "{\n  \"components\": {\n    \"RadioExample\": {\n      \"params\": {\n        \"&value\": false,\n        \"style\": \"\",\n        \"label\": \"\",\n        \"error\": false,\n        \"textStyle\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Row\",\n        \"layout_margin\": {\n          \"start\": 10,\n          \"top\": 10\n        },\n        \"children\": [\n          {\n            \"componentType\": \"Radio\",\n            \"error\": \"{{error}}\",\n            \"checked\": \"{{value}}\",\n            \"onCheckedChange\": {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{value}}\",\n              \"from\": {\n                \"functionType\": \"Not\",\n                \"value\": \"{{value}}\"\n              }\n            },\n            \"style\": {\n              \"styleName\": \"{{style}}\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{label}}\",\n            \"style\": \"{{textStyle}}\",\n            \"layout_margin\": {\n              \"start\": 10\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"radioStyles\": [\n        {\n          \"style\": \"radioSmall\",\n          \"label\": \"small\"\n        },\n        {\n          \"style\": \"radioMedium\",\n          \"label\": \"medium\"\n        },\n        {\n          \"style\": \"radioLarge\",\n          \"label\": \"large\"\n        },\n        {\n          \"style\": \"radioSmall\",\n          \"label\": \"small\",\n          \"error\": true\n        },\n        {\n          \"style\": \"radioMedium\",\n          \"label\": \"medium\",\n          \"error\": true\n        },\n        {\n          \"style\": \"radioLarge\",\n          \"label\": \"large\",\n          \"error\": true\n        }\n      ],\n      \"radioWhiteStyles\": [\n        {\n          \"style\": \"radioWhiteSmall\",\n          \"label\": \"small\"\n        },\n        {\n          \"style\": \"radioWhiteMedium\",\n          \"label\": \"medium\"\n        },\n        {\n          \"style\": \"radioWhiteLarge\",\n          \"label\": \"large\"\n        },\n        {\n          \"style\": \"radioWhiteSmall\",\n          \"label\": \"small\",\n          \"error\": true\n        },\n        {\n          \"style\": \"radioWhiteMedium\",\n          \"label\": \"medium\",\n          \"error\": true\n        },\n        {\n          \"style\": \"radioWhiteLarge\",\n          \"label\": \"large\",\n          \"error\": true\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Column\",\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{radioStyles}}\",\n            \"!template\": {\n              \"componentType\": \"Row\",\n              \"layout_margin\": {\n                \"start\": 10,\n                \"top\": 5,\n                \"bottom\": 5\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"RadioExample\",\n                  \"style\": \"{{it.style}}\",\n                  \"label\": \"{{it.label}}\",\n                  \"error\": \"{{it.error}}\"\n                }\n              ]\n            }\n          }\n        },\n        {\n          \"componentType\": \"Column\",\n          \"backgroundColor\": \"#262624\",\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{radioWhiteStyles}}\",\n            \"!template\": {\n              \"componentType\": \"Row\",\n              \"layout_margin\": {\n                \"start\": 10,\n                \"top\": 5,\n                \"bottom\": 5\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"RadioExample\",\n                  \"style\": \"{{it.style}}\",\n                  \"label\": \"{{it.label}}\",\n                  \"error\": \"{{it.error}}\",\n                  \"textStyle\": {\n                    \"color\": {\n                      \"light\": \"#FFFFFF\",\n                      \"dark\": \"#FFFFFF\"\n                    }\n                  }\n                }\n              ]\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440001c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440000b;
    }
}
