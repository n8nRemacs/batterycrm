package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SliderTrack.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class x extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f62786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f62787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f62789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f62790p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f62791q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q qVar, v.a aVar, float f12, long j12, long j13, boolean z12, int i12) {
        super(2);
        this.f62786l = qVar;
        this.f62787m = aVar;
        this.f62788n = f12;
        this.f62789o = j12;
        this.f62790p = j13;
        this.f62791q = z12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(196609);
        q qVar = this.f62786l;
        float f12 = this.f62788n;
        long j12 = this.f62789o;
        y.b(qVar, this.f62787m, f12, j12, this.f62790p, this.f62791q, a12, iA2);
        return G0.f406611a;
    }
}
