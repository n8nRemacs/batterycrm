package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControlIndicator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f62552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62555o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f62556p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, com.akita.compose.foundation.p pVar, float f12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f62552l = dVar;
        this.f62553m = pVar;
        this.f62554n = f12;
        this.f62555o = vVar;
        this.f62556p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        g.a(this.f62552l, this.f62553m, this.f62554n, this.f62555o, a12, C22066f2.a(this.f62556p | 1));
        return G0.f406611a;
    }
}
