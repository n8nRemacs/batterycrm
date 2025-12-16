package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f62709l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62710m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62711n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f62712o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.q<q, A, Integer, G0> f62713p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.q<q, A, Integer, G0> f62714q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62715r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, androidx.compose.ui.v vVar, boolean z12, androidx.compose.foundation.interaction.m mVar, Y41.q qVar2, Y41.q qVar3, int i12) {
        super(2);
        this.f62709l = qVar;
        this.f62710m = vVar;
        this.f62711n = z12;
        this.f62712o = mVar;
        this.f62713p = qVar2;
        this.f62714q = qVar3;
        this.f62715r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62715r | 1);
        Y41.q<q, A, Integer, G0> qVar = this.f62714q;
        q qVar2 = this.f62709l;
        Y41.q<q, A, Integer, G0> qVar3 = this.f62713p;
        i.b(qVar2, this.f62710m, this.f62711n, this.f62712o, qVar3, qVar, a12, iA2);
        return G0.f406611a;
    }
}
