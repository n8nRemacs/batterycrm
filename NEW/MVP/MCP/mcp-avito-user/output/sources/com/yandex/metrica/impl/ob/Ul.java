package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class Ul {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, C38737cm> f379743a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map<String, Sl> f379744b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f379745c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f379746d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f379747e = 0;

    @j.N
    public static Sl a(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return Sl.a();
        }
        Sl sl2 = f379744b.get(str);
        if (sl2 == null) {
            synchronized (f379746d) {
                try {
                    sl2 = f379744b.get(str);
                    if (sl2 == null) {
                        sl2 = new Sl(str);
                        f379744b.put(str, sl2);
                    }
                } finally {
                }
            }
        }
        return sl2;
    }

    @j.N
    public static C38737cm b(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return C38737cm.a();
        }
        C38737cm c38737cm = f379743a.get(str);
        if (c38737cm == null) {
            synchronized (f379745c) {
                try {
                    c38737cm = f379743a.get(str);
                    if (c38737cm == null) {
                        c38737cm = new C38737cm(str);
                        f379743a.put(str, c38737cm);
                    }
                } finally {
                }
            }
        }
        return c38737cm;
    }

    @j.N
    public static C38737cm a() {
        return C38737cm.a();
    }
}
