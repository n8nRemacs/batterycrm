package com.akita.compose.foundation.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Surface.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f63730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f63731m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f63732n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63733o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63734p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f63735q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63736r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63737s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, h1 h1Var, float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, Y41.p pVar3, int i12, int i13) {
        super(2);
        this.f63730l = vVar;
        this.f63731m = h1Var;
        this.f63732n = f12;
        this.f63733o = pVar;
        this.f63734p = pVar2;
        this.f63735q = pVar3;
        this.f63736r = i12;
        this.f63737s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63736r | 1);
        com.akita.compose.foundation.p pVar = this.f63734p;
        n.a(this.f63730l, this.f63731m, this.f63732n, this.f63733o, pVar, this.f63735q, a12, iA2, this.f63737s);
        return G0.f406611a;
    }
}
