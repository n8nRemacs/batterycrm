package com.google.android.datatransport.cct.internal;

import VY0.c;
import com.google.android.datatransport.cct.internal.f;
import j.N;
import j.P;

/* compiled from: LogEvent.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class k {

    /* compiled from: LogEvent.java */
    @c.a
    public static abstract class a {
        @N
        public abstract k a();

        @N
        public abstract a b(@P Integer num);

        @N
        public abstract a c(long j12);

        @N
        public abstract a d(long j12);

        @N
        public abstract a e(@P NetworkConnectionInfo networkConnectionInfo);

        @N
        public abstract a f(long j12);
    }

    @N
    public static a h(@N String str) {
        f.b bVar = new f.b();
        bVar.f343029e = str;
        return bVar;
    }

    @N
    public static a i(@N byte[] bArr) {
        f.b bVar = new f.b();
        bVar.f343028d = bArr;
        return bVar;
    }

    @P
    public abstract Integer a();

    public abstract long b();

    public abstract long c();

    @P
    public abstract NetworkConnectionInfo d();

    @P
    public abstract byte[] e();

    @P
    public abstract String f();

    public abstract long g();
}
