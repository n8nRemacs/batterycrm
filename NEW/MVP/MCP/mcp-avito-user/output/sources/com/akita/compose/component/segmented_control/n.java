package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SegmentedControlState f62583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f62584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62585o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62586p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<q, G0> f62587q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62588r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, SegmentedControlState segmentedControlState, z zVar, C22096n c22096n, androidx.compose.ui.v vVar, Y41.l lVar, int i13) {
        super(2);
        this.f62582l = i12;
        this.f62583m = segmentedControlState;
        this.f62584n = zVar;
        this.f62585o = c22096n;
        this.f62586p = vVar;
        this.f62587q = lVar;
        this.f62588r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62588r | 1);
        Y41.l<q, G0> lVar = this.f62587q;
        C22096n c22096n = this.f62585o;
        p.a(this.f62582l, this.f62583m, this.f62584n, c22096n, this.f62586p, lVar, a12, iA2);
        return G0.f406611a;
    }
}
