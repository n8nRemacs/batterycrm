package com.avito.android.auto_contacts.presentation.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContactPackagesScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.q<InterfaceC20793y, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoContactsPackagesState f94991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AutoContactsPackagesState autoContactsPackagesState) {
        super(3);
        this.f94991l = autoContactsPackagesState;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(v.f42878y1, 0.0f, 12, 0.0f, 8, 5);
            String str = this.f94991l.f94880b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65231b, vVarM, false, 0L, null, 0, 0, false, null, a13, 0, 1016);
        }
        return G0.f406611a;
    }
}
