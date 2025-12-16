package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SegmentedControlState f62560m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f62561n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62562o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<q, G0> f62563p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12, SegmentedControlState segmentedControlState, z zVar, androidx.compose.ui.v vVar, Y41.l lVar, int i13) {
        super(2);
        this.f62559l = i12;
        this.f62560m = segmentedControlState;
        this.f62561n = zVar;
        this.f62562o = vVar;
        this.f62563p = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Y41.l<q, G0> lVar = this.f62563p;
        SegmentedControlState segmentedControlState = this.f62560m;
        z zVar = this.f62561n;
        p.b(this.f62559l, segmentedControlState, zVar, this.f62562o, lVar, a12, iA2);
        return G0.f406611a;
    }
}
