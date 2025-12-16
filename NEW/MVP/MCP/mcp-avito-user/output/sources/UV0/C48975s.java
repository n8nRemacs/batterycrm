package uV0;

import kotlin.Metadata;

/* compiled from: DescriptionListParameterLine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/s;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uV0.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48975s implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C48975s f440065a = new C48975s();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440066b = "DescriptionListParameterLine";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440067c = "{\n  \"components\": {\n    \"DescriptionListParameterLineExample\": {\n      \"params\": {\n        \"styleName\": \"descriptionListParameterLineSmall\",\n        \"children\": []\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{styleName}}\",\n            \"style\": {\n              \"styleName\": \"textH50\"\n            },\n            \"layout_margin\": {\n              \"all\": 8\n            }\n          },\n          {\n            \"componentType\": \"DescriptionListParameterLine\",\n            \"style\": {\n              \"styleName\": \"{{styleName}}\"\n            },\n            \"lineStyle\": \"dotted\",\n            \"children\": \"{{children}}\",\n            \"layout_margin\": {\n              \"all\": 16\n            }\n          },\n          {\n            \"componentType\": \"DescriptionListParameterLine\",\n            \"style\": {\n              \"styleName\": \"{{styleName}}\"\n            },\n            \"lineStyle\": \"solid\",\n            \"children\": \"{{children}}\",\n            \"layout_margin\": {\n              \"all\": 16\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"itemsState\": [\n        {\n          \"children\": [\n            {\n              \"title\": \"Title\",\n              \"description\": \"Description\",\n              \"icon\": {\n                \"name\": \"attentionRound16\",\n                \"color\": {\n                  \"light\": \"#FF6163\",\n                  \"dark\": \"#F24954\"\n                }\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListParameterLineSmall\"\n        },\n        {\n          \"children\": [\n            {\n              \"title\": \"Title\",\n              \"description\": \"Description\",\n              \"icon\": {\n                \"name\": \"attentionRound20\",\n                \"color\": {\n                  \"light\": \"#FF6163\",\n                  \"dark\": \"#F24954\"\n                }\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListParameterLineMedium\"\n        },\n        {\n          \"children\": [\n            {\n              \"title\": \"Title\",\n              \"description\": \"Description\",\n              \"icon\": {\n                \"name\": \"attentionRound24\",\n                \"color\": {\n                  \"light\": \"#FF6163\",\n                  \"dark\": \"#F24954\"\n                }\n              },\n              \"onIconClick\": {\n                \"interactionType\": \"ShowToastBar\",\n                \"text\": \"Icon clicked\"\n              }\n            }\n          ],\n          \"style\": \"descriptionListParameterLineLarge\"\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": {\n        \"functionType\": \"Map\",\n        \"items\": \"{{itemsState}}\",\n        \"!template\": {\n          \"componentType\": \"Column\",\n          \"layout_margin\": {\n            \"horizontal\": 10,\n            \"top\": 10,\n            \"bottom\": 0\n          },\n          \"children\": [\n            {\n              \"componentType\": \"DescriptionListParameterLineExample\",\n              \"children\": \"{{it.children}}\",\n              \"styleName\": \"{{it.style}}\",\n              \"layout_margin\": {\n                \"top\": 12,\n                \"bottom\": 0,\n                \"horizontal\": 10\n              }\n            }\n          ]\n        }\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440067c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440066b;
    }
}
