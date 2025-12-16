package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2PresetCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class t extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.g f261290l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f261291m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261292n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f261293o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(BbipPrivateV2State.g gVar, int i12, androidx.compose.ui.v vVar, int i13) {
        super(2);
        this.f261290l = gVar;
        this.f261291m = i12;
        this.f261292n = vVar;
        this.f261293o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f261293o | 1);
        u.d(this.f261290l, this.f261291m, this.f261292n, a12, iA2);
        return G0.f406611a;
    }
}
