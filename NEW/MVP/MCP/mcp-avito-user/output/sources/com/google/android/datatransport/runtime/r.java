package com.google.android.datatransport.runtime;

import VY0.c;
import android.util.Base64;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.d;
import j.P;

/* compiled from: TransportContext.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class r {

    /* compiled from: TransportContext.java */
    @c.a
    public static abstract class a {
        public abstract r a();

        public abstract a b(String str);

        public abstract a c(@P byte[] bArr);

        @RestrictTo
        public abstract a d(Priority priority);
    }

    public static a a() {
        d.b bVar = new d.b();
        bVar.f343128c = Priority.f342916b;
        return bVar;
    }

    public abstract String b();

    @P
    public abstract byte[] c();

    @RestrictTo
    public abstract Priority d();

    @RestrictTo
    public final r e(Priority priority) {
        a aVarA = a();
        aVarA.b(b());
        aVarA.d(priority);
        ((d.b) aVarA).f343127b = c();
        return aVarA.a();
    }

    public final String toString() {
        String strB = b();
        Priority priorityD = d();
        String strEncodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(strB);
        sb2.append(", ");
        sb2.append(priorityD);
        sb2.append(", ");
        return AK.c.s(sb2, strEncodeToString, ")");
    }
}
