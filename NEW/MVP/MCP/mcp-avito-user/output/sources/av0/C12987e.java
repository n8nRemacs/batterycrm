package AV0;

import kotlin.Metadata;

/* compiled from: Close.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/e;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12987e implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C12987e f397a = new C12987e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f398b = "Close";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f399c = "{\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n      {\n          \"componentType\": \"Button\",\n          \"text\": \"Close\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 24,\n            \"bottom\": 16\n          },\n          \"onClick\": {\n            \"interactionType\": \"Close\"\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Close with success\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 24,\n            \"bottom\": 16\n          },\n          \"onClick\": {\n            \"interactionType\": \"Close\",\n            \"status\": \"success\",\n            \"params\": {\n              \"value1\": \"Only PrimitiveData must be in params' fields\",\n              \"result2\": 1\n            }\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 8,\n            \"bottom\": 16\n          },\n          \"text\": \"Close with cancel\",\n          \"onClick\": {\n            \"interactionType\": \"Close\",\n            \"status\": \"cancel\"\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 8,\n            \"top\": 8,\n            \"bottom\": 16\n          },\n          \"text\": \"Close with error\",\n          \"onClick\": {\n            \"interactionType\": \"Close\",\n            \"status\": \"error\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f399c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f398b;
    }
}
