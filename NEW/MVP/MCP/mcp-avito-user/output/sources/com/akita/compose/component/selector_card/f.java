package com.akita.compose.component.selector_card;

import Y41.p;
import Y41.q;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.shape.n;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f62648l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62649m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f62650n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SelectorCardState f62651o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f62652p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f62653q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f62654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62656t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f62657u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ T1 f62658v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q<InterfaceC20640y, A, Integer, G0> f62659w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C22096n f62660x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f62661y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f62662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z12, Y41.a aVar, v vVar, SelectorCardState selectorCardState, m mVar, boolean z13, float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, n nVar, T1 t12, q qVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f62648l = z12;
        this.f62649m = aVar;
        this.f62650n = vVar;
        this.f62651o = selectorCardState;
        this.f62652p = mVar;
        this.f62653q = z13;
        this.f62654r = f12;
        this.f62655s = pVar;
        this.f62656t = pVar2;
        this.f62657u = nVar;
        this.f62658v = t12;
        this.f62659w = qVar;
        this.f62660x = c22096n;
        this.f62661y = i12;
        this.f62662z = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62661y | 1);
        int iA3 = C22066f2.a(this.f62662z);
        q<InterfaceC20640y, A, Integer, G0> qVar = this.f62659w;
        SelectorCardState selectorCardState = this.f62651o;
        n nVar = this.f62657u;
        T1 t12 = this.f62658v;
        g.b(this.f62648l, this.f62649m, this.f62650n, selectorCardState, this.f62652p, this.f62653q, this.f62654r, this.f62655s, this.f62656t, nVar, t12, qVar, this.f62660x, a12, iA2, iA3);
        return G0.f406611a;
    }
}
