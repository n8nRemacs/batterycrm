package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2Tabs.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.SegmentsBlock f261306l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261307m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f261308n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(BbipPrivateV2State.SegmentsBlock segmentsBlock, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f261306l = segmentsBlock;
        this.f261307m = vVar;
        this.f261308n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(49);
        Y41.l<Integer, G0> lVar = this.f261308n;
        z.a(this.f261306l, this.f261307m, lVar, a12, iA2);
        return G0.f406611a;
    }
}
