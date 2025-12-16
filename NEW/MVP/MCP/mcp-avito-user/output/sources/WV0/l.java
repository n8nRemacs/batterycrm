package wV0;

import kotlin.Metadata;

/* compiled from: HorizontalPager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV0/l;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f441491a = new l();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f441492b = "HorizontalPager";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f441493c = "{\n  \"components\": {\n    \"Item\": {\n      \"params\": {\n        \"text\": \"\"\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Button\",\n            \"layout_height\": \"100\",\n            \"style\": {\n              \"styleName\": \"buttonAccentSecondaryLargeRound\"\n            },\n            \"text\": \"{{text}}\"\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"items\": [\n        \"First item\",\n        \"Second item\",\n        \"Third item\",\n        \"Fourth item\"\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Horizontal Pager without horizontal padding and spicing\",\n          \"layout_margin\": {\n            \"top\": 10,\n            \"bottom\": 10,\n            \"start\": 5\n          }\n        },\n        {\n          \"componentType\": \"HorizontalPager\",\n          \"itemSpacing\": 0,\n          \"padding\": {\n            \"start\": 0,\n            \"end\": 0\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\"\n            }\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Horizontal Pager with horizontal padding and without spicing\",\n          \"layout_margin\": {\n            \"top\": 10,\n            \"bottom\": 10,\n            \"start\": 5\n          }\n        },\n        {\n          \"componentType\": \"HorizontalPager\",\n          \"itemSpacing\": 0,\n          \"padding\": {\n            \"start\": 20,\n            \"end\": 20\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\"\n            }\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Horizontal Pager with horizontal padding and spicing\",\n          \"layout_margin\": {\n            \"top\": 10,\n            \"bottom\": 10,\n            \"start\": 5\n          }\n        },\n        {\n          \"componentType\": \"HorizontalPager\",\n          \"itemSpacing\": 10,\n          \"padding\": {\n            \"start\": 20,\n            \"end\": 20\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\"\n            }\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Horizontal Pager with only start padding and spicing\",\n          \"layout_margin\": {\n            \"top\": 10,\n            \"bottom\": 10,\n            \"start\": 5\n          }\n        },\n        {\n          \"componentType\": \"HorizontalPager\",\n          \"itemSpacing\": 10,\n          \"padding\": {\n            \"start\": 20\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\"\n            }\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Horizontal Pager with only end padding and spicing with current page 3\",\n          \"layout_margin\": {\n            \"top\": 10,\n            \"bottom\": 10,\n            \"start\": 5\n          }\n        },\n        {\n          \"componentType\": \"HorizontalPager\",\n          \"itemSpacing\": 10,\n          \"padding\": {\n            \"end\": 20\n          },\n          \"currentIndex\": 2,\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\"\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f441493c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f441492b;
    }
}
