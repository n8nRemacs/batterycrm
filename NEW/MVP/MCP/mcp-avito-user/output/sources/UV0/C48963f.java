package uV0;

import kotlin.Metadata;

/* compiled from: Banner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/f;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uV0.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48963f implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C48963f f440032a = new C48963f();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440033b = "Banner";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440034c = "{\n  \"components\": {\n    \"BannerChild\": {\n      \"params\": {\n        \"subtitle\": \"View from the mountain\\nseems to reach infinity -\\nYet little is seen\",\n        \"buttonStyle\": \"buttonPrimaryLarge\"\n      },\n      \"rootComponent\": {\n        \"componentType\": \"Column\",\n        \"children\": [\n          {\n            \"componentType\": \"Text\",\n            \"text\": \"{{subtitle}}\",\n            \"style\": {\n              \"styleName\": \"textM10\"\n            }\n          },\n          {\n            \"componentType\": \"Button\",\n            \"text\": \"{{buttonStyle}}\",\n            \"style\": {\n              \"styleName\": \"{{buttonStyle}}\"\n            }\n          }\n        ]\n      }\n    }\n  },\n  \"main\": {\n    \"params\": {\n      \"bannerStyles\": [\n        \"bannerWhite\",\n        \"bannerBlue\",\n        \"bannerGreen\",\n        \"bannerRed\",\n        \"bannerOrange\",\n        \"bannerBeige\",\n        \"bannerViolet\",\n        \"bannerWarmgray\",\n        \"bannerDefault\"\n      ]\n    },\n    \"rootComponent\": {\n      \"componentType\": \"LazyColumn\",\n      \"children\": {\n        \"functionType\": \"Map\",\n        \"items\": \"{{bannerStyles}}\",\n        \"!template\": {\n          \"componentType\": \"Banner\",\n          \"title\": \"{{it}}\",\n          \"style\": {\n            \"styleName\": \"{{it}}\",\n            \"closable\": \"true\"\n          },\n          \"onCloseButtonClick\": {\n            \"interactionType\": \"ShowToastBar\",\n            \"text\": {\n              \"functionType\": \"JoinToString\",\n              \"separator\": \" \",\n              \"items\": [\n                \"{{it}}\",\n                \"close button clicked\"\n              ]\n            }\n          },\n          \"child\": {\n            \"componentType\": \"BannerChild\"\n          }\n        }\n      }\n    }\n  }\n}";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440034c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440033b;
    }
}
