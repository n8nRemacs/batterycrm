package com.akita.compose.component.input;

import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20640y f61779l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f61780m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f61781n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61782o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f61783p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61784q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61785r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61786s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC20640y interfaceC20640y, long j12, long j13, Y41.a aVar, v.a aVar2, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f61779l = interfaceC20640y;
        this.f61780m = j12;
        this.f61781n = j13;
        this.f61782o = aVar;
        this.f61783p = aVar2;
        this.f61784q = c22096n;
        this.f61785r = i12;
        this.f61786s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61785r | 1);
        C22096n c22096n = this.f61784q;
        Y41.a<G0> aVar = this.f61782o;
        u.c(this.f61779l, this.f61780m, this.f61781n, aVar, this.f61783p, c22096n, a12, iA2, this.f61786s);
        return G0.f406611a;
    }
}
