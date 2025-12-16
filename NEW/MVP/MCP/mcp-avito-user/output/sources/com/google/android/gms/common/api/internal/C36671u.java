package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.C36616a.b;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36671u<A extends C36616a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    @RX0.a
    public final AbstractC36669t<A, L> f349216a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C f349217b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Runnable f349218c;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.u$a */
    public static class a<A extends C36616a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC36673v f349219a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC36673v f349220b;

        /* renamed from: d, reason: collision with root package name */
        public C36658n f349222d;

        /* renamed from: e, reason: collision with root package name */
        public Feature[] f349223e;

        /* renamed from: g, reason: collision with root package name */
        public int f349225g;

        /* renamed from: c, reason: collision with root package name */
        public final Q0 f349221c = Q0.f349052b;

        /* renamed from: f, reason: collision with root package name */
        public boolean f349224f = true;

        public a() {
        }

        @j.N
        @RX0.a
        public final C36671u<A, L> a() {
            C36729v.a("Must set register function", this.f349219a != null);
            C36729v.a("Must set unregister function", this.f349220b != null);
            C36729v.a("Must set holder", this.f349222d != null);
            C36658n.a aVar = this.f349222d.f349180c;
            C36729v.k(aVar, "Key must not be null");
            return new C36671u<>(new R0(this, this.f349222d, this.f349223e, this.f349224f, this.f349225g), new S0(this, aVar), this.f349221c, null);
        }

        public /* synthetic */ a(T0 t02) {
        }
    }

    public /* synthetic */ C36671u(AbstractC36669t abstractC36669t, C c12, Runnable runnable, U0 u02) {
        this.f349216a = abstractC36669t;
        this.f349217b = c12;
        this.f349218c = runnable;
    }
}
