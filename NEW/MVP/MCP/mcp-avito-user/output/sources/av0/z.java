package AV0;

import kotlin.Metadata;

/* compiled from: OpenWebLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/z;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final z f427a = new z();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f428b = "OpenWebLink";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f429c = "{\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Open web link\",\n          \"onClick\": {\n            \"interactionType\": \"OpenWebLink\",\n            \"url\": \"https://zibuhoker.ru/ifm/cats/cat1.png\"\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Open web link with params\",\n          \"onClick\": {\n            \"interactionType\": \"OpenWebLink\",\n            \"url\": \"https://yandex.ru/search/?text=funny%20dogs&param=paramValue\",\n            \"params\": {\n              \"text\": \"funny cats\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f429c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f428b;
    }
}
