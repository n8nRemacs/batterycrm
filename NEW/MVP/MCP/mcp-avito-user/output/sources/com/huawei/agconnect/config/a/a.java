package com.huawei.agconnect.config.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class a extends com.huawei.agconnect.b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f363135a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f363136b = new Object();

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName can not be empty");
        }
        synchronized (f363136b) {
            try {
                HashMap map = f363135a;
                if (((com.huawei.agconnect.b) map.get(packageName)) == null) {
                    a aVar = new a();
                    XZ0.a.d(context, packageName);
                    map.put(packageName, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
