package AV0;

import kotlin.Metadata;

/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/i;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12991i implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C12991i f403a = new C12991i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f404b = "Delay";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f405c = "{\n  \"main\": {\n    \"params\": {\n      \"&delaySec\": 3,\n      \"&isInProgress\": false,\n      \"interactionGroup\": {\n        \"functionType\": \"CreateInteractionGroup\",\n        \"interactionScope\": {\n          \"functionType\": \"CreateInteractionScope\"\n        }\n      }\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Show Toastbar with delay:\",\n          \"style\": {\n            \"styleName\": \"textH50\"\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"top\": 16,\n            \"bottom\": 16\n          }\n        },\n        {\n          \"componentType\": \"Row\",\n          \"children\": [\n            {\n              \"componentType\": \"Text\",\n              \"text\": {\n                \"functionType\": \"JoinToString\",\n                \"items\": [\n                  \"{{delaySec}}\",\n                  \" second\"\n                ]\n              },\n              \"layout_margin\": {\n                \"start\": 16,\n                \"top\": 16\n              }\n            },\n            {\n              \"componentType\": \"Button\",\n              \"text\": \"-\",\n              \"layout_width\": \"wrapContent\",\n              \"layout_margin\": {\n                \"start\": 16,\n                \"top\": 8\n              },\n              \"style\": {\n                \"styleName\": \"buttonSecondarySmall\"\n              },\n              \"enabled\": {\n                \"functionType\": \"Compare\",\n                \"value1\": \"{{delaySec}}\",\n                \"clause\": \"More\",\n                \"value2\": 0\n              },\n              \"onClick\": {\n                \"interactionType\": \"Mutate\",\n                \"to\": \"{{delaySec}}\",\n                \"from\": {\n                  \"functionType\": \"Minus\",\n                  \"value1\": \"{{delaySec}}\",\n                  \"value2\": 1\n                }\n              }\n            },\n            {\n              \"componentType\": \"Button\",\n              \"text\": \"+\",\n              \"layout_width\": \"wrapContent\",\n              \"layout_margin\": {\n                \"start\": 8,\n                \"top\": 8\n              },\n              \"style\": {\n                \"styleName\": \"buttonSecondarySmall\"\n              },\n              \"onClick\": {\n                \"interactionType\": \"Mutate\",\n                \"to\": \"{{delaySec}}\",\n                \"from\": {\n                  \"functionType\": \"Plus\",\n                  \"value1\": \"{{delaySec}}\",\n                  \"value2\": 1\n                }\n              }\n            }\n          ]\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Start\",\n          \"loading\": \"{{isInProgress}}\",\n          \"onClick\": {\n            \"interactionType\": \"Sequence\",\n            \"items\": [\n              {\n                \"interactionType\": \"Mutate\",\n                \"to\": \"{{isInProgress}}\",\n                \"from\": true\n              },\n              {\n                \"interactionType\": \"Delay\",\n                \"interactionGroup\": \"{{interactionGroup}}\",\n                \"seconds\": \"{{delaySec}}\",\n                \"onFinished\": {\n                  \"interactionType\": \"Sequence\",\n                  \"items\": [\n                    {\n                      \"interactionType\": \"ShowToastBar\",\n                      \"text\": \"Hello!\"\n                    },\n                    {\n                      \"interactionType\": \"Mutate\",\n                      \"to\": \"{{isInProgress}}\",\n                      \"from\": false\n                    }\n                  ]\n                }\n              }\n            ]\n          },\n          \"style\": {\n            \"styleName\": \"buttonSecondarySmall\"\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Cancel\",\n          \"onClick\": {\n            \"interactionType\": \"Sequence\",\n            \"items\": [\n              {\n                \"interactionType\": \"Mutate\",\n                \"to\": \"{{isInProgress}}\",\n                \"from\": false\n              },\n              {\n                \"interactionType\": \"DisposeInteractionScope\",\n                \"interactionScope\": \"{{interactionGroup.interactionScope}}\"\n              }\n            ]\n          },\n          \"style\": {\n            \"styleName\": \"buttonSecondarySmall\"\n          },\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16,\n            \"top\": 8\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f405c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f404b;
    }
}
