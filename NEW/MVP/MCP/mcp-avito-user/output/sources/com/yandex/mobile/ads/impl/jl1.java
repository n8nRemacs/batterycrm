package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.Navigation;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class jl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f386914a;

    /* renamed from: b, reason: collision with root package name */
    static final String f386915b;

    static {
        Locale locale = Locale.US;
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onCollapse", Navigation.CONFIG, "AdPerformActionsJSI").replace("JSON.stringify()", "");
        String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%2$s) { \n      %3$s.%1$s(JSON.stringify(%2$s)); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onExpand", Navigation.CONFIG, "AdPerformActionsJSI").replace("JSON.stringify()", "");
        f386915b = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "getBannerInfo", "AdPerformActionsJSI");
        f386914a = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", "onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI");
    }
}
