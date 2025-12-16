package com.avito.android.screens.bbip_private_v2.ui.compose.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2ScreenPreviews.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f261348l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i12) {
        super(2);
        this.f261348l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f261348l | 1);
        BbipPrivateV2State.SegmentsBlock segmentsBlock = g.f261353a;
        B bE2 = a12.E(1556259390);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            i.f261362a.getClass();
            com.akita.compose.theme.re23.c.a(false, i.f261363b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(iA2);
        }
        return G0.f406611a;
    }
}
