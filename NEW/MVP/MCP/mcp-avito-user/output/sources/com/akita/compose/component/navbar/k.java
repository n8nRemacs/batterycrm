package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62249l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f62250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f62251n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62252o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62253p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62254q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62255r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.compose.ui.v vVar, u uVar, int i12, Y41.a aVar, C22096n c22096n, int i13, int i14) {
        super(2);
        this.f62249l = vVar;
        this.f62250m = uVar;
        this.f62251n = i12;
        this.f62252o = aVar;
        this.f62253p = c22096n;
        this.f62254q = i13;
        this.f62255r = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62254q | 1);
        int i12 = this.f62251n;
        t.b(this.f62249l, this.f62250m, i12, this.f62252o, this.f62253p, a12, iA2, this.f62255r);
        return G0.f406611a;
    }
}
