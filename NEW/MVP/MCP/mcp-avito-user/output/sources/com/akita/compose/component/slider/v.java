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
final class v extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f62774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f62775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62776n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f62777o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f62778p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62779q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62780r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, v.a aVar, float f12, long j12, long j13, int i12, int i13) {
        super(2);
        this.f62774l = qVar;
        this.f62775m = aVar;
        this.f62776n = f12;
        this.f62777o = j12;
        this.f62778p = j13;
        this.f62779q = i12;
        this.f62780r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62779q | 1);
        float f12 = this.f62776n;
        y.a(this.f62774l, this.f62775m, f12, this.f62777o, this.f62778p, a12, iA2, this.f62780r);
        return G0.f406611a;
    }
}
