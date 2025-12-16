package AV0;

import kotlin.Metadata;

/* compiled from: Sequence.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/H;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class H implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final H f370a = new H();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f371b = "Sequence";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f372c = "{\n  \"main\": {\n    \"params\": {\n      \"&param\": \"Not initialized!\",\n      \"&processedParam\": \"Empty\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Input parameters of all Interactions inside one Sequence are resolved before they are executed. Therefore, you need to access the parameter that was changed in this Sequence using a Delegate\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Input parameter:\",\n          \"style\": {\n            \"styleName\": \"textH50\"\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"{{param}}\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Processed parameter:\",\n          \"style\": {\n            \"styleName\": \"textH50\"\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"{{processedParam}}\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_width\": \"fillMax\",\n          \"layout_margin\": {\n            \"all\": 16\n          },\n          \"style\": {\n            \"styleName\": \"buttonSecondarySmall\"\n          },\n          \"text\": \"Without Delegate\",\n          \"onClick\": {\n            \"interactionType\": \"Sequence\",\n            \"items\": [\n              {\n                \"interactionType\": \"Mutate\",\n                \"from\": \"Initialized - without delegate\",\n                \"to\": \"{{param}}\"\n              },\n              {\n                \"interactionType\": \"Mutate\",\n                \"from\": {\n                  \"functionType\": \"JoinToString\",\n                  \"items\": [\n                    \"{{param}}\",\n                    \" - processed\"\n                  ]\n                },\n                \"to\": \"{{processedParam}}\"\n              }\n            ]\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"layout_width\": \"fillMax\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16\n          },\n          \"style\": {\n            \"styleName\": \"buttonSecondarySmall\"\n          },\n          \"text\": \"With Delegate\",\n          \"onClick\": {\n            \"interactionType\": \"Sequence\",\n            \"items\": [\n              {\n                \"interactionType\": \"Mutate\",\n                \"from\": \"Initialized - with delegate\",\n                \"to\": \"{{param}}\"\n              },\n              {\n                \"interactionType\": \"Delegate\",\n                \"to\": {\n                  \"interactionType\": \"Mutate\",\n                  \"from\": {\n                    \"functionType\": \"JoinToString\",\n                    \"items\": [\n                      \"{{param}}\",\n                      \" - processed\"\n                    ]\n                  },\n                  \"to\": \"{{processedParam}}\"\n                }\n              }\n            ]\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f372c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f371b;
    }
}
