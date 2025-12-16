package yV0;

import kotlin.Metadata;

/* compiled from: CastFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyV0/e;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yV0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50182e implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C50182e f443135a = new C50182e();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f443136b = "Cast Functions";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f443137c = "{\n  \"components\": {\n    \"Example\": {\n      \"params\": {\n        \"functionName\": \"\",\n        \"result\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{functionName}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textH40\"\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{result}}\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"bottom\": 12\n            },\n            \"style\": {\n              \"styleName\": \"textL20\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"value\": \"some data\",\n      \"&mutable_value\": \"{{value}}\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"NumbersOnly - [1, 2, a, abc, 4]\",\n          \"result\": {\n            \"functionType\": \"JoinToString\",\n            \"items\": {\n              \"functionType\": \"Map\",\n              \"items\": [\n                1,\n                \"2\",\n                \"a\",\n                \"abc\",\n                4\n              ],\n              \"!template\": {\n                \"functionType\": \"NumbersOnly\",\n                \"value\": \"{{it}}\"\n              }\n            },\n            \"separator\": \", \"\n          },\n          \"layout_margin\": {\n            \"top\": 24\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"ToInt - 3.14\",\n          \"result\": {\n            \"functionType\": \"ToInt\",\n            \"value\": 3.14\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"ToFloat - 10\",\n          \"result\": {\n            \"functionType\": \"ToFloat\",\n            \"value\": 10\n          }\n        },\n        {\n          \"componentType\": \"Example\",\n          \"functionName\": \"Unwrap mutable variable\",\n          \"result\": {\n            \"functionType\": \"CheckSame\",\n            \"value1\": {\n              \"functionType\": \"Unwrap\",\n              \"value\": \"{{mutable_value}}\"\n            },\n            \"value2\": \"{{value}}\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f443137c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f443136b;
    }
}
