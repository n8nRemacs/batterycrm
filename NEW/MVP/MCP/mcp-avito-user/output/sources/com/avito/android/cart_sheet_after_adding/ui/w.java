package com.avito.android.cart_sheet_after_adding.ui;

import android.content.Context;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22501m2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class w extends kotlin.jvm.internal.N implements Y41.q<X, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gn.h f115659l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gn.h hVar) {
        super(3);
        this.f115659l = hVar;
    }

    @Override // Y41.q
    public final G0 invoke(X x12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            String strK0 = this.f115659l.f396835a.k0((Context) a13.o(AndroidCompositionLocals_androidKt.f41069b));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(strK0, com.akita.compose.theme.re23.b.f63988f.f65234e, C22501m2.a(androidx.compose.ui.v.f42878y1, "feedTitle"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
        }
        return G0.f406611a;
    }
}
