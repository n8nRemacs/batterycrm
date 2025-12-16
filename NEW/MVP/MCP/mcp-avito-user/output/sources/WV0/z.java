package wV0;

import kotlin.Metadata;

/* compiled from: VerticalPager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV0/z;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f441512a = new z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f441513b = "VerticalPager";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f441514c = "{\n  \"components\": {\n    \"Item\": {\n      \"params\": {\n        \"text\": \"\"\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"backgroundColor\": {\n          \"light\": \"#8A8A8A\",\n          \"dark\": \"#8A8A8A\"\n        },\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{text}}\"\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"items\": [\n        \"First item\",\n        \"Second item\",\n        \"Third item\",\n        \"Fourth item\"\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Box\",\n      \"children\": [\n        {\n          \"componentType\": \"VerticalPager\",\n          \"layout_height\": \"fillMax\",\n          \"itemSpacing\": 10,\n          \"contentInsets\": {\n            \"bottom\": 32\n          },\n          \"children\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{items}}\",\n            \"!template\": {\n              \"componentType\": \"Item\",\n              \"text\": \"{{it}}\",\n              \"layout_width\": \"fillMax\",\n              \"layout_height\": \"fillMax\"\n            }\n          }\n        }\n      ]\n    }\n  }\n}\t\t";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f441514c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f441513b;
    }
}
