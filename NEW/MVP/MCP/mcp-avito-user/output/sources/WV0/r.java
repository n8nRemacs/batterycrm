package wV0;

import kotlin.Metadata;

/* compiled from: LazyRow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV0/r;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r f441500a = new r();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f441501b = "LazyRow";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f441502c = "{\n  \"main\": {\n    \"params\": {\n      \"items\": [\n        \"item 0\",\n        \"item 1\",\n        \"item 2\",\n        \"item 3\",\n        \"item 4\",\n        \"item 5\",\n        \"item 6\",\n        \"item 7\",\n        \"item 8\",\n        \"item 9\"\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Box\",\n      \"children\": [\n        {\n          \"componentType\": \"LazyRow\",\n          \"padding\": {\n            \"start\": 16\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Surface\",\n              \"layout_width\": 150,\n              \"layout_height\": 200,\n              \"layout_margin\": {\n                \"all\": 16\n              },\n              \"shape\": {\n                \"cornerLeftTop\": {\n                  \"radius\": 25\n                },\n                \"cornerLeftBottom\": {\n                  \"radius\": 25\n                },\n                \"cornerRightTop\": {\n                  \"radius\": 25\n                },\n                \"cornerRightBottom\": {\n                  \"radius\": 25\n                }\n              },\n              \"backgroundColor\": {\n                \"light\": \"#F2F1F0\",\n                \"dark\": \"#262624\"\n              },\n              \"children\": [\n                {\n                  \"componentType\": \"Text\",\n                  \"text\": \"{{it}}\",\n                  \"layout_height\": \"fillMax\",\n                  \"textAlign\": \"Center\",\n                  \"layout_margin\": {\n                    \"top\": 8\n                  }\n                }\n              ]\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f441502c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f441501b;
    }
}
