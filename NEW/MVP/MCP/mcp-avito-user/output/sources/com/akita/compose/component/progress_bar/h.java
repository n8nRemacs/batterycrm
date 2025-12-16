package com.akita.compose.component.progress_bar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgressBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f62394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f62395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f62396n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f62397o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f62398p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f62399q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f62400r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f62401s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, long j12, long j13, v vVar, float f12, float f13, float f14, int i12) {
        super(2);
        this.f62394l = aVar;
        this.f62395m = j12;
        this.f62396n = j13;
        this.f62397o = vVar;
        this.f62398p = f12;
        this.f62399q = f13;
        this.f62400r = f14;
        this.f62401s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62401s | 1);
        float f12 = this.f62398p;
        float f13 = this.f62399q;
        j.d(this.f62394l, this.f62395m, this.f62396n, this.f62397o, f12, f13, this.f62400r, a12, iA2);
        return G0.f406611a;
    }
}
