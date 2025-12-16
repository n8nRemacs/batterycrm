package com.google.android.datatransport.runtime.backends;

import VY0.c;
import com.google.android.datatransport.runtime.backends.a;
import j.P;
import java.util.ArrayList;

/* compiled from: BackendRequest.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class g {

    /* compiled from: BackendRequest.java */
    @c.a
    public static abstract class a {
        public abstract g a();

        public abstract a b(ArrayList arrayList);

        public abstract a c(@P byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<com.google.android.datatransport.runtime.j> b();

    @P
    public abstract byte[] c();
}
