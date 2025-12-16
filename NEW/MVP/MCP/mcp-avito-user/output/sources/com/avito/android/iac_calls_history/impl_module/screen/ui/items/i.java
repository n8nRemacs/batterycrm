package com.avito.android.iac_calls_history.impl_module.screen.ui.items;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoadingCallsHistoryItemUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f164932l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i12) {
        super(2);
        this.f164932l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f164932l | 1);
        B bE2 = a12.E(-447766712);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            c.f164915a.getClass();
            com.akita.compose.theme.re23.c.a(false, c.f164916b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(iA2);
        }
        return G0.f406611a;
    }
}
