package com.avito.android.category.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.category.mvi.entity.OverlayState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: CategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f116527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12) {
        super(2);
        this.f116527l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f116527l | 1);
        B bE2 = a12.E(-1326181375);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            b.b(OverlayState.f116683c, C42784z0.f406748b, null, f.f116524l, g.f116525l, h.f116526l, bE2, 224694);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(iA2);
        }
        return G0.f406611a;
    }
}
