package yV0;

import kotlin.Metadata;

/* compiled from: StructureFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyV0/u;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final u f443159a = new u();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f443160b = "Structure Functions";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f443161c = "{\n  \"components\": {\n    \"Example\": {\n      \"params\": {\n        \"functionName\": \"\",\n        \"result\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{functionName}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{result}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textL20\"\n            }\n          }\n        ]\n      }\n    },\n    \"ExampleForStruct\": {\n      \"params\": {\n        \"functionName\": \"\",\n        \"struct\": null,\n        \"keys\": []\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Example\",\n        \"functionName\": \"{{functionName}}\",\n        \"result\": {\n          \"functionType\": \"JoinToString\",\n          \"separator\": \", \",\n          \"items\": {\n            \"functionType\": \"Map\",\n            \"items\": \"{{keys}}\",\n            \"!template\": {\n              \"functionType\": \"JoinToString\",\n              \"separator\": \" : \",\n              \"items\": [\n                \"{{it}}\",\n                {\n                  \"functionType\": \"StructureGet\",\n                  \"structure\": \"{{struct}}\",\n                  \"key\": \"{{it}}\"\n                }\n              ]\n            }\n          }\n        }\n      }\n    }\n  },\n  \"main\": {\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"ExampleForStruct\",\n          \"functionName\": \"MergeStructs {a:A; b:B} and {c:C; d:D}\",\n          \"struct\": {\n            \"functionType\": \"MergeStructs\",\n            \"base\": {\n              \"a\": \"A\",\n              \"b\": \"B\"\n            },\n            \"patch\": {\n              \"c\": \"C\",\n              \"d\": \"D\"\n            }\n          },\n          \"keys\": [\n            \"a\",\n            \"b\",\n            \"c\",\n            \"d\"\n          ],\n          \"layout_margin\": {\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"ExampleForStruct\",\n          \"functionName\": \"ToStructure - [a:A, b:B, c:C, d:D]\",\n          \"struct\": {\n            \"functionType\": \"ToStructure\",\n            \"entities\": [\n              {\n                \"key\": \"a\",\n                \"value\": \"A\"\n              },\n              {\n                \"key\": \"b\",\n                \"value\": \"B\"\n              },\n              {\n                \"key\": \"c\",\n                \"value\": \"C\"\n              },\n              {\n                \"key\": \"d\",\n                \"value\": \"D\"\n              }\n            ]\n          },\n          \"keys\": [\n            \"a\",\n            \"b\",\n            \"c\",\n            \"d\"\n          ]\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"StructureGet - {a:{b:{c:value found}}}\",\n          \"result\": {\n            \"functionType\": \"StructureGet\",\n            \"structure\": {\n              \"a\": {\n                \"b\": {\n                  \"c\": \"value found\"\n                }\n              }\n            },\n            \"key\": \"a.b.c\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f443161c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f443160b;
    }
}
