package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f363867a;

    /* renamed from: b, reason: collision with root package name */
    private static Resources f363868b;

    public static int a(Context context, String str) {
        return a(context, str, "id");
    }

    public static int b(Context context, String str) {
        return a(context, str, "layout");
    }

    public static int c(Context context, String str) {
        return a(context, str, "string");
    }

    private static int a(Context context, String str, String str2) {
        if (f363868b == null) {
            f363868b = context.getResources();
        }
        return f363868b.getIdentifier(str, str2, a(context));
    }

    private static String a(Context context) {
        if (f363867a == null) {
            f363867a = context.getPackageName();
        }
        return f363867a;
    }
}
