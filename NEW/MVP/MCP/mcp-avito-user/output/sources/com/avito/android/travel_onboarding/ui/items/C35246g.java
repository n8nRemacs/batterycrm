package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.Q0;
import com.avito.android.travel_onboarding.models.TravelOnboardingButtonViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import p0.InterfaceC44967a;

/* compiled from: ButtonWithSubtitle.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.travel_onboarding.ui.items.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35246g {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l String str2, @Y61.k Y41.a aVar, @Y61.k TravelOnboardingButtonViewType travelOnboardingButtonViewType, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        com.akita.compose.component.button.t tVarF2;
        androidx.compose.runtime.B bE2 = a12.E(192289764);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | (bE2.B(str2) ? 32 : 16);
        if ((i12 & 896) == 0) {
            i14 |= bE2.u(aVar) ? 256 : 128;
        }
        if (((i14 | (bE2.B(travelOnboardingButtonViewType) ? 2048 : 1024)) & 46811) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC44967a interfaceC44967a = (InterfaceC44967a) bE2.o(Q0.f41203l);
            bE2.C(-176702482);
            int iOrdinal = travelOnboardingButtonViewType.ordinal();
            if (iOrdinal == 0) {
                bE2.C(-46451775);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarF2 = com.akita.compose.theme.re23.b.c(bE2).f2();
                bE2.X(false);
            } else {
                if (iOrdinal != 1) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(-46536843, bE2, false);
                }
                bE2.C(-46448861);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarF2 = com.akita.compose.theme.re23.b.c(bE2).M();
                bE2.X(false);
            }
            com.akita.compose.component.button.t tVar = tVarF2;
            bE2.X(false);
            com.akita.compose.component.button.m.b(new C35240a(aVar, interfaceC44967a), tVar, vVar, false, null, androidx.compose.runtime.internal.r.c(1601520168, new C35241b(str, str2), bE2), bE2, 197056, 24);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C35242c(str, str2, aVar, travelOnboardingButtonViewType, vVar, i12);
        }
    }
}
