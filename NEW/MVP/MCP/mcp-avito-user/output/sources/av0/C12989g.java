package AV0;

import kotlin.Metadata;

/* compiled from: Copy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/g;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12989g implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C12989g f400a = new C12989g();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f401b = "Copy";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f402c = "{\n  \"main\": {\n    \"params\": {\n      \"textToCopy\": \"Text to copy\",\n      \"&inputText\": \"\"\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": [\n        {\n          \"componentType\": \"Text\",\n          \"text\": \"{{textToCopy}}\",\n          \"layout_margin\": {\n            \"all\": 16\n          }\n        },\n        {\n          \"componentType\": \"Button\",\n          \"text\": \"Copy\",\n          \"layout_margin\": {\n            \"all\": 16\n          },\n          \"onClick\": {\n            \"interactionType\": \"Copy\",\n            \"value\": \"{{textToCopy}}\"\n          }\n        },\n        {\n          \"componentType\": \"Input\",\n          \"text\": \"{{inputText}}\",\n          \"placeholder\": \"Paste here\",\n          \"layout_margin\": {\n            \"all\": 16\n          },\n          \"onTextChanged\": {\n            \"interactionType\": \"Mutate\",\n            \"to\": \"{{inputText}}\",\n            \"from\": \"{{args.text}}\"\n          }\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f402c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f401b;
    }
}
