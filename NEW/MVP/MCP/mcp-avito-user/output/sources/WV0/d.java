package wV0;

import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwV0/d;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f441479a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f441480b = "Box";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f441481c = "{\n    \"components\": {},\n    \"functions\": {},\n    \"main\": {\n        \"params\": {\n            \"alignments\": [\n                \"TopCenter\",\n                \"TopStart\",\n                \"TopEnd\",\n                \"Center\",\n                \"CenterStart\",\n                \"CenterEnd\",\n                \"BottomCenter\",\n                \"BottomStart\",\n                \"BottomEnd\"\n            ]\n        },\n        \"rootComponent\": {\n            \"componentType\": \"LazyColumn\",\n            \"children\": [\n                {\n                    \"componentType\": \"Box\",\n                    \"children\": [\n                        {\n                            \"componentType\": \"Box\",\n                            \"layout_height\": \"300\",\n                            \"children\": {\n                                \"functionType\": \"Map\",\n                                \"items\": \"{{params.alignments}}\",\n                                \"!template\": {\n                                    \"componentType\": \"Button\",\n                                    \"layout_width\": \"wrapContent\",\n                                    \"layout_alignment\": \"{{it}}\",\n                                    \"layout_padding\": {\n                                        \"start\": 8,\n                                        \"end\": 8,\n                                        \"top\": 8,\n                                        \"bottom\": 8\n                                    },\n                                    \"text\": \"alignment\",\n                                    \"subtitle\": \"{{it}}\",\n                                    \"style\": {\n                                        \"styleName\": \"buttonPrimarySmallTwoRows\"\n                                    }\n                                }\n                            },\n                            \"backgroundColor\": {\n                                \"light\": \"#D4F0FF\",\n                                \"dark\": \"#D4F0FF\"\n                            }\n                        }\n                    ]\n                }\n            ]\n        }\n    }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f441481c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f441480b;
    }
}
