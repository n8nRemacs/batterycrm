package AV0;

import kotlin.Metadata;

/* compiled from: SetResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/J;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final J f373a = new J();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f374b = "SetResult";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f375c = "{\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Set result - success\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 24,\n            \"bottom\": 16\n          },\n          \"onClick\": {\n            \"interactionType\": \"SetResult\",\n            \"status\": \"success\",\n            \"params\": {\n              \"value1\": \"Only PrimitiveData must be in params' fields\",\n              \"result2\": 1\n            }\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 8,\n            \"bottom\": 16\n          },\n          \"text\": \"Set result - cancel\",\n          \"onClick\": {\n            \"interactionType\": \"SetResult\",\n            \"status\": \"cancel\",\n            \"params\": {\n              \"value1\": \"Only PrimitiveData must be in params' fields\",\n              \"result2\": 1\n            }\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 8,\n            \"bottom\": 16\n          },\n          \"text\": \"Set result - error\",\n          \"onClick\": {\n            \"interactionType\": \"SetResult\",\n            \"status\": \"error\",\n            \"params\": {\n              \"value1\": \"Only PrimitiveData must be in params' fields\",\n              \"result2\": 1\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f375c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f374b;
    }
}
