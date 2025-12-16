package uV0;

import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/W;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class W implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final W f440011a = new W();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440012b = "Slider";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440013c = "{\n  \"components\": {\n    \"SliderItem\": {\n      \"params\": {\n        \"title\": null,\n        \"sliderStyle\": null,\n        \"step\": null,\n        \"backgroundColor\": null,\n        \"&value\": 0\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"layout_margin\": {\n              \"start\": 8,\n              \"end\": 8,\n              \"top\": 32\n            },\n            \"layout_padding\": {\n              \"start\": 8,\n              \"end\": 8,\n              \"top\": 32\n            },\n            \"text\": \"{{params.title}}\",\n            \"style\": {\n              \"styleName\": \"textH20\"\n            }\n          },\n          {\n            \"componentType\": \"Slider\",\n            \"layout_margin\": {\n              \"start\": 16,\n              \"end\": 16,\n              \"top\": 8,\n              \"bottom\": 8\n            },\n            \"layout_padding\": {\n              \"start\": 16,\n              \"end\": 16,\n              \"top\": 8,\n              \"bottom\": 8\n            },\n            \"value\": \"{{params.value}}\",\n            \"step\": \"{{params.step}}\",\n            \"min\": 1,\n            \"max\": 100,\n            \"onChange\": {\n              \"interactionType\": \"Mutate\",\n              \"to\": \"{{params.value}}\",\n              \"from\": \"{{args.value}}\",\n              \"format\": \"finalData\"\n            },\n            \"style\": \"{{params.sliderStyle}}\"\n          }\n        ],\n        \"backgroundColor\": \"{{params.backgroundColor}}\"\n      }\n    }\n  },\n  \"functions\": {},\n  \"main\": {\n    \"params\": {},\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": [\n        {\n          \"componentType\": \"SliderItem\",\n          \"title\": \"Стиль sliderDefault\",\n          \"sliderStyle\": {\n            \"styleName\": \"sliderDefault\"\n          },\n          \"step\": 1\n        },\n        {\n          \"componentType\": \"SliderItem\",\n          \"title\": \"Стиль sliderInverse\",\n          \"sliderStyle\": {\n            \"styleName\": \"sliderInverse\"\n          },\n          \"step\": 1,\n          \"backgroundColor\": \"#808080\"\n        },\n        {\n          \"componentType\": \"SliderItem\",\n          \"title\": \"Стиль sliderOverlay\",\n          \"sliderStyle\": {\n            \"styleName\": \"sliderOverlay\"\n          },\n          \"step\": 1,\n          \"backgroundColor\": \"#808080\"\n        },\n        {\n          \"componentType\": \"SliderItem\",\n          \"title\": \"Step = 50\",\n          \"sliderStyle\": {\n            \"styleName\": \"sliderDefault\"\n          },\n          \"step\": 50\n        },\n        {\n          \"componentType\": \"SliderItem\",\n          \"title\": \"Step = 20\",\n          \"sliderStyle\": {\n            \"styleName\": \"sliderDefault\"\n          },\n          \"step\": 20\n        }\n      ]\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440013c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440012b;
    }
}
