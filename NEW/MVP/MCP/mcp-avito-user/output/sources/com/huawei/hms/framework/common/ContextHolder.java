package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes7.dex */
public class ContextHolder {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f363455a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f363456b;

    public static Context getAppContext() {
        return f363455a;
    }

    public static Context getKitContext() {
        return f363456b;
    }

    public static Context getResourceContext() {
        return getKitContext() != null ? getKitContext() : getAppContext();
    }

    public static void setAppContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sAppContext == null");
        f363455a = context.getApplicationContext();
    }

    public static void setKitContext(Context context) {
        CheckParamUtils.checkNotNull(context, "sKitContext == null");
        f363456b = context;
    }
}
