package AV0;

import kotlin.Metadata;

/* compiled from: Back.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/b;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12984b implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C12984b f391a = new C12984b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f392b = "Back";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f393c = "{\n  \"components\": {\n    \"FirstScreen\": {\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"Первый экран\",\n            \"layout_alignment\": \"TopCenter\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_margin\": {\n              \"top\": 24\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Button\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_alignment\": \"Center\",\n            \"text\": \"Вперед\",\n            \"onClick\": {\n              \"interactionType\": \"StatePatch\",\n              \"shouldAddToBackStack\": true,\n              \"patch\": {\n                \"screenId\": \"second\"\n              }\n            }\n          }\n        ]\n      }\n    },\n    \"SecondScreen\": {\n      \"rootComponent\": {\n        \"componentType\": \"Box\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"Второй экран\",\n            \"layout_alignment\": \"TopCenter\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_margin\": {\n              \"top\": 24\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Button\",\n            \"layout_width\": \"wrapContent\",\n            \"layout_alignment\": \"Center\",\n            \"text\": \"Назад\",\n            \"onClick\": {\n              \"interactionType\": \"Back\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"screenId\": \"first\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Box\",\n      \"children\": [\n        {\n          \"functionType\": \"Switch\",\n          \"value\": \"{{screenId}}\",\n          \"first\": {\n            \"componentType\": \"FirstScreen\",\n            \"layout_height\": \"fillMax\",\n            \"layout_width\": \"fillMax\"\n          },\n          \"second\": {\n            \"componentType\": \"SecondScreen\",\n            \"layout_height\": \"fillMax\",\n            \"layout_width\": \"fillMax\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f393c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f392b;
    }
}
