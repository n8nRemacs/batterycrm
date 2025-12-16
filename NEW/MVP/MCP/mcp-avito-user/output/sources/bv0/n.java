package BV0;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleFormPerf.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBV0/n;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n f1433a = new n();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f1434b = "SimpleForm";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f1435c = "{\n  \"main\": {\n    \"params\": {\n      \"&name\": \"\",\n      \"&surname\": \"\",\n      \"&age\": \"\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Введите данные пользователя\",\n          \"layout_padding\": {\n            \"horizontal\": 16,\n            \"vertical\": 16\n          },\n          \"style\": {\n            \"styleName\": \"textH40\"\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Имя\",\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Input\",\n          \"text\": \"{{name}}\",\n          \"clearButton\": true,\n          \"placeholder\": \"Введите имя\",\n          \"onTextChanged\": {\n            \"interactionType\": \"Mutate\",\n            \"to\": \"{{name}}\",\n            \"from\": \"{{args.text}}\"\n          },\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Фамилия\",\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Input\",\n          \"text\": \"{{surname}}\",\n          \"clearButton\": true,\n          \"placeholder\": \"Введите фамилию\",\n          \"onTextChanged\": {\n            \"interactionType\": \"Mutate\",\n            \"to\": \"{{surname}}\",\n            \"from\": \"{{args.text}}\"\n          },\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"Возраст\",\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Input\",\n          \"layout_width\": 80,\n          \"format\": \"numeric\",\n          \"text\": \"{{age}}\",\n          \"onTextChanged\": {\n            \"interactionType\": \"Mutate\",\n            \"to\": \"{{age}}\",\n            \"from\": \"{{args.text}}\"\n          },\n          \"layout_padding\": {\n            \"horizontal\": 16\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Сохранить\",\n          \"layout_padding\": {\n            \"horizontal\": 16,\n            \"vertical\": 16\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f1435c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f1434b;
    }
}
