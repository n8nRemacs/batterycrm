package uV0;

import kotlin.Metadata;

/* compiled from: Spinner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/Y;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Y implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y f440014a = new Y();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440015b = "Spinner";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440016c = "{\n  \"main\": {\n    \"params\": {\n      \"spinnerStyles\": [\n        \"spinnerDarkSmall\",\n        \"spinnerDarkMedium\",\n        \"spinnerDarkLarge\"\n      ],\n      \"spinnerStylesLight\": [\n        \"spinnerLightSmall\",\n        \"spinnerLightMedium\",\n        \"spinnerLightLarge\"\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": {\n        \"functionType\": \"CombineArrays\",\n        \"arrays\": [\n          {\n            \"functionType\": \"Map\",\n            \"items\": \"{{spinnerStyles}}\",\n            \"!template\": {\n              \"componentType\": \"Spinner\",\n              \"layout_margin\": {\n                \"vertical\": 16\n              },\n              \"style\": {\n                \"styleName\": \"{{it}}\"\n              }\n            }\n          },\n          {\n            \"functionType\": \"Map\",\n            \"items\": \"{{spinnerStylesLight}}\",\n            \"!template\": {\n              \"componentType\": \"Column\",\n              \"backgroundColor\": \"#D4F0FF\",\n              \"children\": [\n                {\n                  \"componentType\": \"Spinner\",\n                  \"layout_margin\": {\n                    \"vertical\": 16\n                  },\n                  \"style\": {\n                    \"styleName\": \"{{it}}\"\n                  }\n                }\n              ]\n            }\n          }\n        ]\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440016c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440015b;
    }
}
