package AV0;

import kotlin.Metadata;

/* compiled from: LaunchDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/r;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r f415a = new r();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f416b = "Launch";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f417c = "{\n  \"main\": {\n    \"params\": {\n      \"&text\": \"\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"id\": \"text\",\n          \"componentType\": \"Text\",\n          \"style\": {\n            \"styleName\": \"textM10\"\n          },\n          \"text\": \"{{text}}\",\n          \"layout_width\": \"fillMax\",\n          \"textAlign\": \"Start\",\n          \"layout_margin\": {\n            \"start\": 16,\n            \"end\": 16\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Launch as BottomSheet (max)\",\n          \"onClick\": {\n            \"interactionType\": \"Launch\",\n            \"key\": \"ru.avito://1/beduin/v2/universalPage/bottomSheet\",\n            \"params\": {\n              \"screenName\": \"LegalRequest\",\n              \"pagePath\": \"/api/1/legal/beduin/start\",\n              \"height\": \"max\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Launch as BottomSheet (half)\",\n          \"onClick\": {\n            \"interactionType\": \"Launch\",\n            \"key\": \"ru.avito://1/beduin/v2/universalPage/bottomSheet\",\n            \"params\": {\n              \"screenName\": \"LegalRequest\",\n              \"pagePath\": \"/api/1/legal/beduin/start\",\n              \"height\": \"half\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Launch as BottomSheet (fit)\",\n          \"onClick\": {\n            \"interactionType\": \"Launch\",\n            \"key\": \"ru.avito://1/beduin/v2/universalPage/bottomSheet\",\n            \"params\": {\n              \"screenName\": \"LegalRequest\",\n              \"pagePath\": \"/api/1/legal/beduin/start\",\n              \"height\": \"fit\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Launch as Screen\",\n          \"onClick\": {\n            \"interactionType\": \"Launch\",\n            \"key\": \"ru.avito://1/beduin/v2/universalPage\",\n            \"params\": {\n              \"screenName\": \"LegalRequest\",\n              \"pagePath\": \"/api/1/legal/beduin/start\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryLargeRound\"\n          },\n          \"text\": \"Launch Deeplink with result\",\n          \"onClick\": {\n            \"interactionType\": \"Launch\",\n            \"key\": \"ru.avito://1/beduin/v2/universalPage\",\n            \"params\": {\n              \"screenName\": \"LegalRequest\",\n              \"pagePath\": {\n                \"functionType\": \"FormatUri\",\n                \"path\": \"/api/1/start?v1=5\",\n                \"queryParams\": {\n                  \"v1\": \"replaced\",\n                  \"v2\": \"5+6/7\"\n                }\n              }\n            },\n            \"onResult\": {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{text}}\",\n              \"from\": \"DeepLink was launched\"\n            }\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f417c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f416b;
    }
}
