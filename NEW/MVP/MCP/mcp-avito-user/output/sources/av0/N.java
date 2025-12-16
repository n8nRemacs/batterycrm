package AV0;

import kotlin.Metadata;

/* compiled from: ShowComponentAsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/N;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class N implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final N f379a = new N();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f380b = "ShowComponentAsScreen";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f381c = "{\n  \"components\": {\n    \"FirstScreen\": {\n      \"params\": {\n        \"onClick\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"Первый экран\",\n            \"layout_alignment\": \"TopCenter\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_margin\": {\n              \"top\": 24\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Button\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_alignment\": \"Center\",\n            \"text\": \"Вперед\",\n            \"onClick\": \"{{onClick}}\"\n          }\n        ]\n      }\n    },\n    \"SecondScreen\": {\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"Второй экран\",\n            \"layout_alignment\": \"TopCenter\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_margin\": {\n              \"top\": 24\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Button\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_alignment\": \"Center\",\n            \"text\": \"Назад\",\n            \"onClick\": {\n              \"interactionType\": \"Back\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"FirstScreen\",\n      \"onClick\": {\n        \"interactionType\": \"ShowComponentAsScreen\",\n        \"component\": {\n          \"componentType\": \"SecondScreen\"\n        }\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f381c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f380b;
    }
}
