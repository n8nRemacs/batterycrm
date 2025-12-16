package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarAction.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f62199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f62200m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62201n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f62202o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f62203p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62204q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62205r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, int i12, Y41.a aVar, v.a aVar2, u uVar, int i13, int i14) {
        super(2);
        this.f62199l = iVar;
        this.f62200m = i12;
        this.f62201n = aVar;
        this.f62202o = aVar2;
        this.f62203p = uVar;
        this.f62204q = i13;
        this.f62205r = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62204q | 1);
        Y41.a<G0> aVar = this.f62201n;
        h.a(this.f62199l, this.f62200m, aVar, this.f62202o, this.f62203p, a12, iA2, this.f62205r);
        return G0.f406611a;
    }
}
