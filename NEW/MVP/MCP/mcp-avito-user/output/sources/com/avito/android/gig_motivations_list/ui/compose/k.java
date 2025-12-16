package com.avito.android.gig_motivations_list.ui.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import wH.C49507c;

/* compiled from: MotivationsListContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f160323l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12) {
        super(2);
        this.f160323l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f160323l | 1);
        androidx.compose.runtime.B bE2 = a12.E(840612197);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            l.b(new C49507c(null, null, null, C42784z0.f406748b, "Помогут заработать больше"), j.f160322l, bE2, 56);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(iA2);
        }
        return G0.f406611a;
    }
}
