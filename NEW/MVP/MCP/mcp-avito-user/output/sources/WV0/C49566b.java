package wV0;

import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV0/b;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wV0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49566b implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C49566b f441476a = new C49566b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f441477b = "AspectRatio";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f441478c = "{\n  \"components\": {\n    \"CommonGradient\": {\n      \"params\": {\n        \"text\": \"\",\n        \"width\": null,\n        \"height\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Surface\",\n            \"layout_width\": \"{{width}}\",\n            \"layout_height\": \"{{height}}\",\n            \"border\": {\n              \"width\": \"1\",\n              \"color\": {\n                \"light\": \"#7D7D7D\",\n                \"dark\": \"#000000\"\n              }\n            },\n            \"backgroundColor\": {\n              \"light\": \"#91bdfd\",\n              \"dark\": \"#91bdfd\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"layout_margin\": {\n              \"top\": 8,\n              \"start\": 8,\n              \"end\": 8\n            },\n            \"text\": {\n              \"functionType\": \"JoinToString\",\n              \"separator\": \" \",\n              \"items\": [\n                \"{{text}}\",\n                \"width:\",\n                \"{{width}}\",\n                \"height:\",\n                \"{{height}}\"\n              ]\n            },\n            \"layout_width\": \"{{width}}\",\n            \"layout_height\": \"{{height}}\"\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"AspectRatio\",\n          \"layout_width\": \"fillMax\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"backgroundColor\": {\n            \"light\": \"#3D3D3D\",\n            \"dark\": \"#B2B2B2\"\n          },\n          \"ratio\": {\n            \"x\": 4,\n            \"y\": 3,\n            \"mainAxis\": \"x\"\n          },\n          \"child\": {\n            \"componentType\": \"CommonGradient\",\n            \"text\": \"fillMax width, 4:3 by x axis\",\n            \"width\": \"fillMax\",\n            \"height\": \"fillMax\"\n          }\n        },\n        {\n          \"componentType\": \"AspectRatio\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"layout_width\": \"wrapContent\",\n          \"backgroundColor\": {\n            \"light\": \"#3D3D3D\",\n            \"dark\": \"#B2B2B2\"\n          },\n          \"ratio\": {\n            \"x\": 2,\n            \"y\": 1,\n            \"mainAxis\": \"x\"\n          },\n          \"child\": {\n            \"componentType\": \"CommonGradient\",\n            \"text\": \"wrapContent width, 2:1 by x axis\",\n            \"width\": 170,\n            \"height\": \"fillMax\"\n          }\n        },\n        {\n          \"componentType\": \"AspectRatio\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"layout_width\": \"150\",\n          \"backgroundColor\": {\n            \"light\": \"#3D3D3D\",\n            \"dark\": \"#B2B2B2\"\n          },\n          \"ratio\": {\n            \"x\": 1,\n            \"y\": 1,\n            \"mainAxis\": \"x\"\n          },\n          \"child\": {\n            \"componentType\": \"CommonGradient\",\n            \"text\": \"fixed width, 1:1 by x axis\",\n            \"width\": \"fillMax\",\n            \"height\": \"fillMax\"\n          }\n        },\n        {\n          \"componentType\": \"Box\",\n          \"layout_height\": \"220\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"children\": [\n            {\n              \"componentType\": \"AspectRatio\",\n              \"layout_height\": \"fillMax\",\n              \"layout_alignment\": \"TopStart\",\n              \"backgroundColor\": {\n                \"light\": \"#3D3D3D\",\n                \"dark\": \"#B2B2B2\"\n              },\n              \"ratio\": {\n                \"x\": 4,\n                \"y\": 3,\n                \"mainAxis\": \"y\"\n              },\n              \"child\": {\n                \"componentType\": \"CommonGradient\",\n                \"text\": \"fillMax height, 4:3 by y axis\",\n                \"width\": \"fillMax\",\n                \"height\": \"fillMax\"\n              }\n            }\n          ]\n        },\n        {\n          \"componentType\": \"AspectRatio\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"layout_height\": \"200\",\n          \"backgroundColor\": {\n            \"light\": \"#3D3D3D\",\n            \"dark\": \"#B2B2B2\"\n          },\n          \"ratio\": {\n            \"x\": 1,\n            \"y\": 2,\n            \"mainAxis\": \"y\"\n          },\n          \"child\": {\n            \"componentType\": \"CommonGradient\",\n            \"text\": \"wrapContent height, 1:2 by y axis\",\n            \"width\": \"fillMax\",\n            \"height\": \"fillMax\"\n          }\n        },\n        {\n          \"componentType\": \"AspectRatio\",\n          \"layout_margin\": {\n            \"bottom\": 8\n          },\n          \"layout_height\": \"120\",\n          \"backgroundColor\": {\n            \"light\": \"#3D3D3D\",\n            \"dark\": \"#B2B2B2\"\n          },\n          \"ratio\": {\n            \"x\": 1,\n            \"y\": 1,\n            \"mainAxis\": \"y\"\n          },\n          \"child\": {\n            \"componentType\": \"CommonGradient\",\n            \"text\": \"fixed height, 1:1 by y axis\",\n            \"width\": \"fillMax\",\n            \"height\": \"fillMax\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f441478c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f441477b;
    }
}
