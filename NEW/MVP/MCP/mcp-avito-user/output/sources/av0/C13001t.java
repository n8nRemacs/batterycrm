package AV0;

import kotlin.Metadata;

/* compiled from: MutateAll.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAV0/t;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: AV0.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C13001t implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C13001t f418a = new C13001t();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f419b = "MutateAll";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f420c = "{\n  \"components\": {\n    \"Item\": {\n      \"params\": {\n        \"title\": \"\",\n        \"&isChecked\": false,\n        \"onCheckedChange\": null\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Row\",\n        \"children\": [\n          {\n            \"componentType\": \"Switcher\",\n            \"checked\": \"{{isChecked}}\",\n            \"onCheckedChange\": \"{{onCheckedChange}}\",\n            \"layout_margin\": {\n              \"all\": 16\n            }\n          },\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{title}}\",\n            \"layout_margin\": {\n              \"all\": 16\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"list\": [\n        {\n          \"title\": \"CheckAll\",\n          \"&isChecked\": false,\n          \"onCheckedChange\": {\n            \"interactionType\": \"MutateAll\",\n            \"from\": \"{{args.checked}}\",\n            \"to\": {\n              \"functionType\": \"Map\",\n              \"items\": \"{{list}}\",\n              \"!template\": \"{{it.isChecked}}\"\n            }\n          }\n        },\n        {\n          \"title\": \"Option 1\",\n          \"&isChecked\": false\n        },\n        {\n          \"title\": \"Option 2\",\n          \"&isChecked\": false\n        },\n        {\n          \"title\": \"Option 3\",\n          \"&isChecked\": false\n        }\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"Column\",\n      \"children\": {\n        \"functionType\": \"Map\",\n        \"items\": \"{{list}}\",\n        \"!template\": {\n          \"componentType\": \"Item\",\n          \"title\": \"{{it.title}}\",\n          \"isChecked\": \"{{it.isChecked}}\",\n          \"onCheckedChange\": \"{{it.onCheckedChange}}\"\n        }\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f420c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f419b;
    }
}
