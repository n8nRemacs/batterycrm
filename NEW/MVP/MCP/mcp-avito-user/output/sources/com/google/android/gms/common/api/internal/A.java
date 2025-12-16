package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.C36616a.b;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public abstract class A<A extends C36616a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final Feature[] f348949a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f348950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348951c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    public static class a<A extends C36616a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC36673v f348952a;

        /* renamed from: c, reason: collision with root package name */
        public Feature[] f348954c;

        /* renamed from: b, reason: collision with root package name */
        public boolean f348953b = true;

        /* renamed from: d, reason: collision with root package name */
        public int f348955d = 0;

        public a() {
        }

        @j.N
        @RX0.a
        public final A<A, ResultT> a() {
            C36729v.a("execute parameter required", this.f348952a != null);
            return new C36630c1(this, this.f348954c, this.f348953b, this.f348955d);
        }

        public /* synthetic */ a(C36633d1 c36633d1) {
        }
    }

    @RX0.a
    @Deprecated
    public A() {
        this.f348949a = null;
        this.f348950b = false;
        this.f348951c = 0;
    }

    @j.N
    @RX0.a
    public static <A extends C36616a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    @RX0.a
    public abstract void b(@j.N A a12, @j.N C37028k<ResultT> c37028k);

    @RX0.a
    public A(@j.P Feature[] featureArr, boolean z12, int i12) {
        this.f348949a = featureArr;
        boolean z13 = false;
        if (featureArr != null && z12) {
            z13 = true;
        }
        this.f348950b = z13;
        this.f348951c = i12;
    }
}
