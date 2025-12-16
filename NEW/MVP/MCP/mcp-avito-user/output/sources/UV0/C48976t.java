package uV0;

import kotlin.Metadata;

/* compiled from: DescriptionList.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/t;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uV0.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48976t implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C48976t f440068a = new C48976t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440069b = "DescriptionList";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440070c = "{\n  \"components\": {\n    \"DescriptionListExample\": {\n      \"params\": {\n        \"styleName\": \"descriptionListSmall\",\n        \"children\": []\n      },\n      \"rootComponent\": {\n        \"componentType\": \"DescriptionList\",\n        \"style\": {\n          \"styleName\": \"{{styleName}}\",\n          \"iconColor\": {\n            \"light\": \"#FF6163\",\n            \"dark\": \"#F24954\"\n          }\n        },\n        \"children\": \"{{children}}\",\n        \"layout_width\": \"wrapContent\",\n        \"layout_height\": \"wrapContent\",\n        \"layout_margin\": {\n          \"start\": 16,\n          \"end\": 10,\n          \"top\": 10,\n          \"bottom\": 16\n        }\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"itemsState\": [\n        {\n          \"children\": [\n            {\n              \"title\": \"Style\",\n              \"description\": \"DescriptionListSmall\",\n              \"icon\": {\n                \"name\": \"attentionRound16\"\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListSmall\"\n        },\n        {\n          \"children\": [\n            {\n              \"title\": \"Style\",\n              \"description\": \"DescriptionListMedium\",\n              \"icon\": {\n                \"name\": \"attentionRound20\"\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListMedium\"\n        },\n        {\n          \"children\": [\n            {\n              \"title\": \"Style\",\n              \"description\": \"DescriptionListLarge\",\n              \"icon\": {\n                \"name\": \"attentionRound24\"\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListLarge\"\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": {\n        \"functionType\": \"Map\",\n        \"items\": \"{{itemsState}}\",\n        \"!template\": {\n          \"componentType\": \"Column\",\n          \"layout_margin\": {\n            \"start\": 10,\n            \"end\": 10,\n            \"top\": 10,\n            \"bottom\": 0\n          },\n          \"children\": [\n            {\n              \"componentType\": \"DescriptionListExample\",\n              \"children\": \"{{it.children}}\",\n              \"styleName\": \"{{it.style}}\",\n              \"layout_margin\": {\n                \"top\": 12,\n                \"bottom\": 0,\n                \"start\": 8,\n                \"end\": 8\n              }\n            }\n          ]\n        }\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440070c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440069b;
    }
}
