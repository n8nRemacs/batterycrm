package uV0;

import kotlin.Metadata;

/* compiled from: WebView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LuV0/o0;", "LEV0/c;", "<init>", "()V", "samples_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o0 implements EV0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o0 f440059a = new o0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f440060b = "WebView";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f440061c = "\n{\n    \"success\": {\n        \"components\": {},\n        \"functions\": {},\n        \"main\": {\n            \"params\": {\n                \"navBarTitle\": \"Компонент веб-вью\",\n                \"&webViewWidth\": \"wrapContent\",\n                \"&webViewHeight\": \"wrapContent\",\n                \"marker\": {\n                    \"functionType\": \"CreateMarker\"\n                }\n            },\n            \"rootComponent\": {\n                \"componentType\": \"Box\",\n                \"children\": [\n                    {\n                        \"componentType\": \"Column\",\n                        \"layout_alignment\": \"TopCenter\",\n                        \"children\": [\n                            {\n                                \"componentType\": \"Text\",\n                                \"layout_width\": \"wrapContent\",\n                                \"layout_height\": \"48\",\n                                \"layout_alignment\": \"CenterHorizontally\",\n                                \"text\": \"{{params.navBarTitle}}\",\n                                \"textAlign\": \"Center\",\n                                \"style\": {\n                                    \"styleName\": \"textH50\"\n                                }\n                            },\n                            {\n                                \"componentType\": \"WebView\",\n                                \"layout_width\": \"{{params.webViewWidth}}\",\n                                \"layout_height\": \"{{params.webViewHeight}}\",\n                                \"layout_padding\": {\n                                    \"all\": \"16\"\n                                },\n                                \"url\": \"https://www.google.com/search?q=%D0%BA%D0%BE%D1%82\",\n                                \"loadingPlaceholder\": {\n                                    \"title\": \"Загружаем веб-страницу\"\n                                },\n                                \"errorPlaceholder\": {\n                                    \"title\": null,\n                                    \"subtitle\": \"Не получилось загрузить страницу.\\nНажмите «Обновить» — это должно помочь.\"\n                                },\n                                \"onSuccess\": {\n                                    \"interactionType\": \"ShowToastBar\",\n                                    \"text\": \"Страница успешно загружена\"\n                                },\n                                \"onError\": {\n                                    \"interactionType\": \"ShowToastBar\",\n                                    \"text\": {\n                                        \"functionType\": \"JoinToString\",\n                                        \"separator\": \" \",\n                                        \"items\": [\n                                            \"Ошибка отображения страницы\",\n                                            \"{{args.isDisplayed}}\"\n                                        ]\n                                    }\n                                },\n                                \"onPostMessage\": {\n                                    \"interactionType\": \"ShowToastBar\",\n                                    \"text\": {\n                                        \"functionType\": \"JoinToString\",\n                                        \"separator\": \" \",\n                                        \"items\": [\n                                            \"Входящий POST-message:\",\n                                            \"{{args.type}}\"\n                                        ]\n                                    }\n                                },\n                                \"markers\": [\n                                    \"{{params.marker}}\"\n                                ]\n                            }\n                        ]\n                    }\n                ]\n            }\n        }\n    }\n}\n";

    @Override // EV0.c
    @Y61.k
    public final String d() {
        return f440061c;
    }

    @Override // EV0.c
    @Y61.k
    public final String getTitle() {
        return f440060b;
    }
}
