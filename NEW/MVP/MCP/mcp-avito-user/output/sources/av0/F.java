package AV0;

import kotlin.Metadata;

/* compiled from: SendAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/F;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final F f367a = new F();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f368b = "SendAnalyticsEvent";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369c = "{\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Send analytics event\",\n          \"layout_margin\": {\n            \"all\": 16\n          },\n          \"onClick\": {\n            \"interactionType\": \"SendAnalyticsEvent\",\n            \"eventId\": \"2554617\",\n            \"version\": \"2\",\n            \"params\": {\n              \"id\": \"07da5c42-3aaa-4acf-b66a-27a999d9239c\",\n              \"name\": \"screen_name\"\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f369c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f368b;
    }
}
