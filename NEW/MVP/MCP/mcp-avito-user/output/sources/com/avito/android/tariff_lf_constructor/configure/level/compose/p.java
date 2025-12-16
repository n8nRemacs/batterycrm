package com.avito.android.tariff_lf_constructor.configure.level.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mD0.C43952d;

/* compiled from: ConstructorConfigureLevelScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class p extends N implements Y41.q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43952d f299788l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C43952d c43952d) {
        super(3);
        this.f299788l = c43952d;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            String str = this.f299788l.f414430e;
            if (str != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65232c;
                androidx.compose.ui.v vVarD = C20588k2.d(C22501m2.a(androidx.compose.ui.v.f42878y1, "ConstructorConfigureLevelScreenTitle"), 1.0f);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.p.b(str, rVar, R1.k(24, 0.0f, 2, vVarD), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                com.akita.compose.foundation.ui.g.a(16, null, a13, 6);
            }
        }
        return G0.f406611a;
    }
}
