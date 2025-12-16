package com.google.android.datatransport.cct.internal;

import VY0.c;
import com.google.android.datatransport.cct.internal.g;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;
import rZ0.InterfaceC47620a;

/* compiled from: LogRequest.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class l {

    /* compiled from: LogRequest.java */
    @c.a
    public static abstract class a {
        @N
        public abstract l a();

        @N
        public abstract a b(@P ClientInfo clientInfo);

        @N
        public abstract a c(@P ArrayList arrayList);

        @N
        public abstract a d(@P Integer num);

        @N
        public abstract a e(@P String str);

        @N
        public abstract a f();

        @N
        public abstract a g(long j12);

        @N
        public abstract a h(long j12);
    }

    @N
    public static a a() {
        return new g.b();
    }

    @P
    public abstract ClientInfo b();

    @P
    @InterfaceC47620a.InterfaceC12382a
    public abstract List<k> c();

    @P
    public abstract Integer d();

    @P
    public abstract String e();

    @P
    public abstract QosTier f();

    public abstract long g();

    public abstract long h();
}
