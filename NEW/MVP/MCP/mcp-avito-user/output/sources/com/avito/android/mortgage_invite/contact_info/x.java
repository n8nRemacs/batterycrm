package com.avito.android.mortgage_invite.contact_info;

import a20.C19669a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.unit.h;
import b20.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContactInfoScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b20.d f205791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b20.d dVar, Y41.a<G0> aVar) {
        super(2);
        this.f205791l = dVar;
        this.f205792m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            b20.e eVar = this.f205791l.f56848f;
            if (eVar instanceof e.a) {
                C19669a c19669a = ((e.a) eVar).f56849a;
                com.akita.compose.component.button.t tVarO = com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.button.m.c(c19669a.f20712d, this.f205792m, tVarO, R1.k(20, 0.0f, 2, R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7)), null, null, null, c19669a.f20713e, c19669a.f20716h, null, a13, 3584, 624);
            }
        }
        return G0.f406611a;
    }
}
