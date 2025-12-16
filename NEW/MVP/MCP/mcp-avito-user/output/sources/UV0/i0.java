package uV0;

import kotlin.Metadata;

/* compiled from: TimeLine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/i0;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i0 implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i0 f440041a = new i0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440042b = "Time lines";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440043c = "\n{\n    \"main\": {\n        \"rootComponent\": {\n            \"componentType\": \"Column\",\n            \"children\": [\n                {\n                    \"componentType\": \"TimeLine\",\n                    \"items\": [\n                        {\n                            \"text\": \"Первый\"\n                        },\n                        {\n                            \"text\": \"Второй\"\n                        }\n                    ],\n                    \"currentItemIndex\": 1,\n                    \"contentInsets\": {\n                        \"start\": 16,\n                        \"end\": 16\n                    }\n                },\n                {\n                    \"componentType\": \"TimeLine\",\n                    \"items\": [\n                        {\n                            \"text\": \"Первый\"\n                        },\n                        {\n                            \"text\": \"Второй\",\n                            \"icon\": \"courier24\"\n                        },\n                        {\n                            \"text\": \"Третий\"\n                        }\n                    ],\n                    \"currentItemIndex\": 1,\n                    \"contentInsets\": {\n                        \"start\": 16,\n                        \"end\": 16\n                    }\n                },\n                {\n                    \"componentType\": \"TimeLine\",\n                    \"items\": [\n                        {\n                            \"text\": \"Первый\"\n                        },\n                        {\n                            \"text\": \"Второй\"\n                        },\n                        {\n                            \"text\": \"Третий\"\n                        },\n                        {\n                            \"text\": \"Четвертый\",\n                            \"icon\": \"courier24\"\n                        },\n                        {\n                            \"text\": \"Пятый\"\n                        }\n                    ],\n                    \"currentItemIndex\": 3,\n                    \"contentInsets\": {\n                        \"start\": 16,\n                        \"end\": 16\n                    }\n                }\n            ]\n        }\n    }\n}\n";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440043c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440042b;
    }
}
