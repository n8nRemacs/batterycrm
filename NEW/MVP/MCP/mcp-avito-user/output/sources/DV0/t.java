package DV0;

import kotlin.Metadata;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDV0/t;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t f3214a = new t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f3215b = "Timer";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f3216c = "{\n  \"main\": {\n    \"params\": {\n      \"ready\": true,\n      \"sec\": {\n        \"functionType\": \"ObserveMutation\",\n        \"&mutable\": 0,\n        \"onMutate\": {\n          \"interactionType\": \"Delay\",\n          \"millis\": 1000,\n          \"onFinished\": {\n            \"functionType\": \"Condition\",\n            \"value\": {\n              \"functionType\": \"Compare\",\n              \"value1\": \"{{args.target}}\",\n              \"clause\": \"More\",\n              \"value2\": 0\n            },\n            \"trueResult\": {\n              \"interactionType\": \"Mutate\",\n              \"from\": {\n                \"functionType\": \"Minus\",\n                \"value1\": \"{{args.target}}\",\n                \"value2\": 1\n              },\n              \"to\": \"{{sec}}\"\n            },\n            \"falseResult\": {\n              \"interactionType\": \"StatePatch\",\n              \"patch\": {\n                \"ready\": true\n              }\n            }\n          }\n        }\n      },\n      \"realMin\": {\n        \"functionType\": \"Divide\",\n        \"value1\": \"{{sec}}\",\n        \"value2\": 60\n      },\n      \"realSec\": {\n        \"functionType\": \"Minus\",\n        \"value1\": \"{{sec}}\",\n        \"value2\": {\n          \"functionType\": \"Multiply\",\n          \"value1\": \"{{realMin}}\",\n          \"value2\": \"60\"\n        }\n      }\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"padding\": {\n            \"start\": 8,\n            \"top\": 8,\n            \"end\": 8,\n            \"bottom\": 8\n          },\n          \"style\": {\n            \"styleName\": \"textH10\",\n            \"size\": 120,\n            \"lineHeight\": 120\n          },\n          \"layout_weight\": 1,\n          \"textAlign\": \"Center\",\n          \"text\": {\n            \"functionType\": \"JoinToString\",\n            \"items\": [\n              {\n                \"functionType\": \"Condition\",\n                \"value\": {\n                  \"functionType\": \"Compare\",\n                  \"value1\": \"{{realMin}}\",\n                  \"clause\": \"Less\",\n                  \"value2\": 10\n                },\n                \"trueResult\": \"0\",\n                \"falseResult\": \"\"\n              },\n              \"{{realMin}}\",\n              \":\",\n              {\n                \"functionType\": \"Condition\",\n                \"value\": {\n                  \"functionType\": \"Compare\",\n                  \"value1\": \"{{realSec}}\",\n                  \"clause\": \"Less\",\n                  \"value2\": 10\n                },\n                \"trueResult\": \"0\",\n                \"falseResult\": \"\"\n              },\n              \"{{realSec}}\"\n            ]\n          },\n          \"textSize\": 22\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Start\",\n          \"loading\": {\n            \"functionType\": \"Not\",\n            \"value\": \"{{ready}}\"\n          },\n          \"onClick\": {\n            \"interactionType\": \"Sequence\",\n            \"items\": [\n              {\n                \"interactionType\": \"StatePatch\",\n                \"patch\": {\n                  \"ready\": false\n                }\n              },\n              {\n                \"interactionType\": \"Mutate\",\n                \"to\": \"{{sec}}\",\n                \"from\": 12\n              }\n            ]\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"bottom\": 16\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f3216c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f3215b;
    }
}
