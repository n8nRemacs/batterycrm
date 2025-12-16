package com.akita.compose.component.navbar.internal;

import Y41.p;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62234l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f62236n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h1 f62237o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f62238p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62239q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62240r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, T1 t12, h1 h1Var, v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f62234l = pVar;
        this.f62235m = pVar2;
        this.f62236n = t12;
        this.f62237o = h1Var;
        this.f62238p = vVar;
        this.f62239q = c22096n;
        this.f62240r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62240r | 1);
        C22096n c22096n = this.f62239q;
        T1 t12 = this.f62236n;
        h1 h1Var = this.f62237o;
        f.a(this.f62234l, this.f62235m, t12, h1Var, this.f62238p, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
