package yV0;

import kotlin.Metadata;

/* compiled from: ConditionFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyV0/i;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yV0.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50186i implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C50186i f443141a = new C50186i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f443142b = "Condition Functions";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f443143c = "{\n  \"components\": {\n    \"Example\": {\n      \"params\": {\n        \"functionName\": \"\",\n        \"result\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{functionName}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{result}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textL20\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"&selectedId\": 0,\n      \"options\": [\n        {\n          \"identifier\": 0,\n          \"title\": \"Option A\"\n        },\n        {\n          \"identifier\": 1,\n          \"title\": \"Option B\"\n        },\n        {\n          \"identifier\": 2,\n          \"title\": \"Option C\"\n        },\n        {\n          \"identifier\": 3,\n          \"title\": \"Option D\"\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Select option:\",\n          \"layout_margin\": {\n            \"top\": 24,\n            \"start\": 16\n          },\n          \"style\": {\n            \"styleName\": \"textL20\"\n          }\n        },\n        {\n          \"componentType\": \"Select\",\n          \"onSelect\": {\n            \"interactionType\": \"Mutate\",\n            \"from\": \"{{args.identifier}}\",\n            \"to\": \"{{selectedId}}\"\n          },\n          \"options\": \"{{options}}\",\n          \"selectedOptionId\": \"{{selectedId}}\",\n          \"bottomSheetTitle\": \"Select option\",\n          \"style\": {\n            \"styleName\": \"selectDefaultMedium\"\n          },\n          \"layout_margin\": {\n            \"all\": 16\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Condition\",\n          \"result\": {\n            \"functionType\": \"Condition\",\n            \"value\": {\n              \"functionType\": \"Compare\",\n              \"value1\": \"{{selectedId}}\",\n              \"value2\": 0,\n              \"clause\": \"Equals\"\n            },\n            \"trueResult\": \"Option A is selected\",\n            \"falseResult\": \"Option A is not selected\"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"When\",\n          \"result\": {\n            \"functionType\": \"When\",\n            \"cases\": [\n              {\n                \"condition\": {\n                  \"functionType\": \"CheckEquals\",\n                  \"value1\": \"{{selectedId}}\",\n                  \"value2\": 0\n                },\n                \"result\": \"Option A is selected\"\n              },\n              {\n                \"condition\": {\n                  \"functionType\": \"CheckEquals\",\n                  \"value1\": \"{{selectedId}}\",\n                  \"value2\": 1\n                },\n                \"result\": \"Option B is selected\"\n              },\n              {\n                \"condition\": {\n                  \"functionType\": \"CheckEquals\",\n                  \"value1\": \"{{selectedId}}\",\n                  \"value2\": 2\n                },\n                \"result\": \"Option C is selected\"\n              },\n              {\n                \"result\": \"Option D is selected\"\n              }\n            ]\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Switch\",\n          \"result\": {\n            \"functionType\": \"Switch\",\n            \"value\": \"{{selectedId}}\",\n            \"0\": \"Option A is selected\",\n            \"1\": \"Option B is selected\",\n            \"2\": \"Option C is selected\",\n            \"else\": \"Option D is selected\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f443143c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f443142b;
    }
}
