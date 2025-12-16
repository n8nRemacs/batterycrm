package AV0;

import kotlin.Metadata;

/* compiled from: DetachedBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/c;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12985c implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C12985c f394a = new C12985c();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f395b = "DetachedBottomSheet";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f396c = "{\n  \"main\": {\n    \"params\": {\n      \"&text\": \"Hidden\",\n      \"_delayGroup\": {\n        \"functionType\": \"CreateInteractionGroup\",\n        \"interactionScope\": {\n            \"functionType\": \"CreateInteractionScope\"\n        }\n      },\n      \"_bottomSheetState\": {\n        \"functionType\": \"CreateBottomSheetState\",\n        \"onShow\": {\n          \"interactionType\": \"Sequence\",\n          \"items\": [\n            {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{text}}\",\n              \"from\": \"Is showing\"\n            },\n            {\n              \"interactionType\": \"Delay\",\n              \"seconds\": 5,\n              \"interactionGroup\": \"{{_delayGroup}}\",\n              \"onFinished\": {\n                \"interactionType\": \"Delegate\",\n                \"to\": {\n                   \"functionType\": \"Condition\",\n                   \"value\": \"{{_bottomSheetState.isShown}}\",\n                   \"trueResult\": \"{{_bottomSheetState.hide}}\"\n                }\n              }\n            },\n            {\n              \"interactionType\": \"SendAnalyticsEvent\",\n              \"eventId\": \"100\",\n              \"version\": \"1\",\n              \"params\": {\n                \"name\": \"open bottom sheet\"\n              }\n            }\n          ]\n        },\n        \"onDismiss\": {\n          \"interactionType\": \"Sequence\",\n          \"items\": [\n            {\n              \"interactionType\": \"DisposeInteractionScope\",\n              \"interactionScope\": \"{{_delayGroup.interactionScope}}\"\n            },\n            {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{text}}\",\n              \"from\": \"Was dismissed\"\n            },\n            {\n              \"interactionType\": \"SendAnalyticsEvent\",\n              \"eventId\": \"200\",\n              \"version\": \"2\",\n              \"params\": {\n                \"name\": \"hide bottom sheet\"\n              }\n            }\n          ]\n        },\n        \"content\": {\n          \"componentType\": \"Column\",\n          \"children\": [\n            {\n              \"componentType\": \"Text\",\n              \"layout_margin\": {\n                \"all\": 16\n              },\n              \"text\": \"BottomSheet Demo\",\n              \"style\": {\n                \"styleName\": \"textH30\"\n              }\n            },\n            {\n              \"componentType\": \"Button\",\n              \"id\": \"@id/close_button\",\n              \"text\": \"Close\",\n              \"onClick\": \"{{_bottomSheetState.hide}}\",\n              \"layout_margin\": {\n                \"all\": 16\n              },\n              \"style\": {\n                \"styleName\": \"buttonAccentSecondaryMedium\"\n              }\n            }]  \n        }\n      }\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"id\": \"@id/title\",\n          \"text\": \"{{text}}\",\n          \"style\": {\n            \"styleName\": \"textH40\"\n          },\n          \"textAlign\": \"Center\",\n          \"layout_margin\": {\n            \"top\": 8\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"id\": \"@id/show_button\",\n          \"text\": \"Show BottomSheet\",\n          \"layout_width\": \"fillMax\",\n          \"onClick\": \"{{_bottomSheetState.show}}\",\n          \"style\": {\n            \"styleName\": \"buttonAccentSecondaryMedium\"\n          },\n          \"layout_margin\": {\n            \"horizontal\": 16,\n            \"top\": 8\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f396c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f395b;
    }
}
