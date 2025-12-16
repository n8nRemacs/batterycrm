package com.akita.compose.component.multiselect;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Multiselect.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62159l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62160m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f62161n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f62162o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f62163p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f62164q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f62165r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l<d, G0> f62166s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f62167t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, Y41.a aVar2, g gVar, v vVar, String str, boolean z12, boolean z13, l lVar, int i12) {
        super(2);
        this.f62159l = aVar;
        this.f62160m = aVar2;
        this.f62161n = gVar;
        this.f62162o = vVar;
        this.f62163p = str;
        this.f62164q = z12;
        this.f62165r = z13;
        this.f62166s = lVar;
        this.f62167t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62167t | 1);
        String str = this.f62163p;
        boolean z12 = this.f62164q;
        c.a(this.f62159l, this.f62160m, this.f62161n, this.f62162o, str, z12, this.f62165r, this.f62166s, a12, iA2);
        return G0.f406611a;
    }
}
