package com.akita.compose.component.button;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f60751l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f60753n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f60754o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Integer f60755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f60756q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f60757r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60758s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f60759t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12, Y41.a aVar, t tVar, v vVar, Integer num, boolean z12, boolean z13, r rVar, int i13, int i14) {
        super(2);
        this.f60751l = i12;
        this.f60752m = aVar;
        this.f60753n = tVar;
        this.f60754o = vVar;
        this.f60755p = num;
        this.f60756q = z12;
        this.f60757r = z13;
        this.f60758s = i13;
        this.f60759t = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60758s | 1);
        boolean z12 = this.f60756q;
        m.a(this.f60751l, this.f60752m, this.f60753n, this.f60754o, this.f60755p, z12, this.f60757r, a12, iA2, this.f60759t);
        return G0.f406611a;
    }
}
