package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.ui.platform.Q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblSelectorCardGrid.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bbl.screens.configure.v2.ui.items.cards.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28731c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28731c(int i12) {
        super(2);
        this.f99415l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(-222645390);
            float fJ2 = ((androidx.compose.ui.unit.d) a13.o(Q0.f41199h)).J(this.f99415l);
            a13.h();
            com.akita.compose.foundation.ui.g.a(fJ2, null, a13, 0);
        }
        return G0.f406611a;
    }
}
