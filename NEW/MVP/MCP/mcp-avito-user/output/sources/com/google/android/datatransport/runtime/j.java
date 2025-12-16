package com.google.android.datatransport.runtime;

import VY0.c;
import com.google.android.datatransport.runtime.b;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class j {

    /* compiled from: EventInternal.java */
    @c.a
    public static abstract class a {
        public final void a(String str, String str2) {
            ((HashMap) c()).put(str, str2);
        }

        public abstract j b();

        public abstract Map<String, String> c();

        public abstract a d(Integer num);

        public abstract a e(i iVar);

        public abstract a f(long j12);

        public abstract a g(String str);

        public abstract a h(long j12);
    }

    public static a a() {
        b.C10562b c10562b = new b.C10562b();
        c10562b.f343084f = new HashMap();
        return c10562b;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    @P
    public abstract Integer d();

    public abstract i e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public final a j() {
        b.C10562b c10562b = new b.C10562b();
        c10562b.g(h());
        c10562b.f343080b = d();
        c10562b.e(e());
        c10562b.f(f());
        c10562b.h(i());
        c10562b.f343084f = new HashMap(c());
        return c10562b;
    }
}
