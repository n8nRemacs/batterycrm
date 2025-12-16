package com.avito.android.mortgage_invite.participant;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import p20.C46879d;
import p20.e;

/* compiled from: ParticipantScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C46879d f206008l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f206009m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C46879d c46879d, Y41.a<G0> aVar) {
        super(2);
        this.f206008l = c46879d;
        this.f206009m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            p20.e eVar = this.f206008l.f428149e;
            if (eVar instanceof e.a) {
                o20.c cVar = ((e.a) eVar).f428150a;
                com.akita.compose.component.button.t tVarO = com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.button.m.c(cVar.f419323c, this.f206009m, tVarO, R1.k(20, 0.0f, 2, R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7)), null, null, null, cVar.f419324d, false, null, a13, 3584, 880);
            }
        }
        return G0.f406611a;
    }
}
