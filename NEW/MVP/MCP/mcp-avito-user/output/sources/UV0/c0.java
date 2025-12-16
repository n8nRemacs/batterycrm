package uV0;

import kotlin.Metadata;

/* compiled from: Switcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/c0;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c0 implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c0 f440023a = new c0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440024b = "Switcher";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440025c = "{\n  \"components\": {\n    \"SwitcherExample\": {\n      \"params\": {\n        \"&value\": false,\n        \"style\": \"\",\n        \"label\": \"\",\n        \"error\": false,\n        \"textStyle\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Row\",\n        \"layout_margin\": {\n          \"start\": 10,\n          \"top\": 10\n        },\n        \"children\": [\n          {\n            \"componentType\": \"Switcher\",\n            \"error\": \"{{error}}\",\n            \"checked\": \"{{value}}\",\n            \"style\": {\n              \"styleName\": \"{{style}}\"\n            },\n            \"onCheckedChange\": {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{value}}\",\n              \"from\": {\n                \"functionType\": \"Not\",\n                \"value\": \"{{value}}\"\n              }\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{label}}\",\n            \"style\": \"{{textStyle}}\",\n            \"layout_margin\": {\n              \"start\": 10\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"switcherStyles\": [\n        {\n          \"style\": \"switcherSmall\",\n          \"label\": \"small\"\n        },\n        {\n          \"style\": \"switcherMedium\",\n          \"label\": \"medium\"\n        },\n        {\n          \"style\": \"switcherLarge\",\n          \"label\": \"large\"\n        },\n        {\n          \"style\": \"switcherSmall\",\n          \"label\": \"small\",\n          \"error\": true\n        },\n        {\n          \"style\": \"switcherMedium\",\n          \"label\": \"medium\",\n          \"error\": true\n        },\n        {\n          \"style\": \"switcherLarge\",\n          \"label\": \"large\",\n          \"error\": true\n        }\n      ],\n      \"switcherWhiteStyles\": [\n        {\n          \"style\": \"switcherWhiteSmall\",\n          \"label\": \"small\"\n        },\n        {\n          \"style\": \"switcherWhiteMedium\",\n          \"label\": \"medium\"\n        },\n        {\n          \"style\": \"switcherWhiteLarge\",\n          \"label\": \"large\"\n        },\n        {\n          \"style\": \"switcherWhiteSmall\",\n          \"label\": \"small\",\n          \"error\": true\n        },\n        {\n          \"style\": \"switcherWhiteMedium\",\n          \"label\": \"medium\",\n          \"error\": true\n        },\n        {\n          \"style\": \"switcherWhiteLarge\",\n          \"label\": \"large\",\n          \"error\": true\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Column\",\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{switcherStyles}}\",\n            \"!template\": {\n              \"componentType\": \"Row\",\n              \"layout_margin\": {\n                \"start\": 10,\n                \"top\": 5,\n                \"bottom\": 5\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"SwitcherExample\",\n                  \"style\": \"{{it.style}}\",\n                  \"label\": \"{{it.label}}\",\n                  \"error\": \"{{it.error}}\"\n                }\n              ]\n            }\n          }\n        },\n        {\n          \"componentType\": \"Column\",\n          \"backgroundColor\": \"#262624\",\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{switcherWhiteStyles}}\",\n            \"!template\": {\n              \"componentType\": \"Row\",\n              \"layout_margin\": {\n                \"start\": 10,\n                \"top\": 5,\n                \"bottom\": 5\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"SwitcherExample\",\n                  \"style\": \"{{it.style}}\",\n                  \"label\": \"{{it.label}}\",\n                  \"error\": \"{{it.error}}\",\n                  \"textStyle\": {\n                    \"color\": {\n                      \"light\": \"#FFFFFF\",\n                      \"dark\": \"#FFFFFF\"\n                    }\n                  }\n                }\n              ]\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440025c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440024b;
    }
}
