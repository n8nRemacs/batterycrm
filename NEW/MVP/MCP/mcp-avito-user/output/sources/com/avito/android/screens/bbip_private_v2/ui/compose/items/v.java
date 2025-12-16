package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2PresetCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.g f261300l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f261301m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f261302n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T1 f261303o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261304p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f261305q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(BbipPrivateV2State.g gVar, int i12, float f12, T1 t12, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f261300l = gVar;
        this.f261301m = i12;
        this.f261302n = f12;
        this.f261303o = t12;
        this.f261304p = vVar;
        this.f261305q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        u.e(this.f261300l, this.f261301m, this.f261302n, this.f261303o, this.f261304p, a12, C22066f2.a(this.f261305q | 1));
        return G0.f406611a;
    }
}
