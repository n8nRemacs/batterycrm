package com.avito.android.categories_global.compose;

import Ln.C14417b;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoriesScreenContentUi.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C14417b.a f116336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C14417b.a aVar, Y41.a<G0> aVar2) {
        super(2);
        this.f116336l = aVar;
        this.f116337m = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C14417b.a aVar = this.f116336l;
            if (aVar != null) {
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.button.m.c(aVar.f10111a, this.f116337m, com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13), R1.i(C20588k2.d(v.f42878y1, 1.0f), 10), null, null, null, false, false, null, a13, 3584, 1008);
            }
        }
        return G0.f406611a;
    }
}
