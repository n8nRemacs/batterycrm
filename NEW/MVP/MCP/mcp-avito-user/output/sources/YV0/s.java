package yV0;

import kotlin.Metadata;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyV0/s;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f443156a = new s();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f443157b = "String Functions";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f443158c = "{\n  \"features\": {\n    \"enableStraightResolve\": true\n  },\n  \"components\": {\n    \"Example\": {\n      \"params\": {\n        \"functionName\": \"\",\n        \"result\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{functionName}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{result}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textL20\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"&string\": \" a,b,c,d,e,F,G,H \"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Initial string\",\n          \"layout_margin\": {\n            \"top\": 24,\n            \"start\": 16\n          },\n          \"style\": {\n            \"styleName\": \"textH40\"\n          }\n        },\n        {\n          \"componentType\": \"Input\",\n          \"layout_width\": \"fillMax\",\n          \"text\": \"{{string}}\",\n          \"clearButton\": true,\n          \"onTextChanged\": {\n            \"interactionType\": \"Mutate\",\n            \"from\": \"{{args.text}}\",\n            \"to\": \"{{string}}\"\n          },\n          \"layout_margin\": {\n            \"all\": 16\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"MaxLength - 10\",\n          \"result\": {\n            \"functionType\": \"MaxLength\",\n            \"value\": \"{{string}}\",\n            \"length\": 10\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"StringLength\",\n          \"result\": {\n            \"functionType\": \"StringLength\",\n            \"string\": \"{{string}}\"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Substring - start 1, end 10\",\n          \"result\": {\n            \"functionType\": \"Substring\",\n            \"value\": \"{{string}}\",\n            \"start\": 1,\n            \"end\": 10\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"ContainsSubstring - 'A,'\",\n          \"result\": {\n            \"functionType\": \"ContainsSubstring\",\n            \"value\": \"{{string}}\",\n            \"substring\": \"A,\",\n            \"ignoreCase\": true\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"ToLowerCase\",\n          \"result\": {\n            \"functionType\": \"ToLowerCase\",\n            \"value\": \"{{string}}\"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"ToUpperCase\",\n          \"result\": {\n            \"functionType\": \"ToUpperCase\",\n            \"value\": \"{{string}}\"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Replace - 'a,' by 'z-'\",\n          \"result\": {\n            \"functionType\": \"Replace\",\n            \"source\": \"{{string}}\",\n            \"oldValue\": \"a,\",\n            \"newValue\": \"z - \"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Split\",\n          \"result\": {\n            \"functionType\": \"JoinToString\",\n            \"items\": {\n              \"functionType\": \"Split\",\n              \"value\": \"{{string}}\",\n              \"delimiter\": \",\"\n            }\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Trim\",\n          \"result\": {\n            \"functionType\": \"Trim\",\n            \"value\": \"{{string}}\",\n            \"position\": \"all\"\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"CharAt - 3\",\n          \"result\": {\n            \"functionType\": \"CharAt\",\n            \"value\": \"{{string}}\",\n            \"index\": 3\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"MapChars - space added\",\n          \"result\": {\n            \"functionType\": \"MapChars\",\n            \"value\": \"{{string}}\",\n            \"!template\": {\n              \"functionType\": \"JoinToString\",\n              \"items\": [\n                \"{{it}}\",\n                \" \"\n              ]\n            }\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f443158c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f443157b;
    }
}
