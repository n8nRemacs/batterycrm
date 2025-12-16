package com.yandex.runtime.i18n;

import j.N;
import j.P;

/* loaded from: classes8.dex */
public class I18nManagerFactory {
    @N
    public static native I18nManager getI18nManagerInstance();

    @N
    public static native String getLocale();

    public static native void setLocale(@P String str);
}
