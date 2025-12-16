package com.avito.android.vas_performance.screens.visual_v2.ui.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VisualVasV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class j extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f321336l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f321336l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f321336l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1087488148);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C36063d.f321322a.getClass();
            com.akita.compose.theme.re23.c.a(false, C36063d.f321323b, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(iA2);
        }
        return G0.f406611a;
    }
}
