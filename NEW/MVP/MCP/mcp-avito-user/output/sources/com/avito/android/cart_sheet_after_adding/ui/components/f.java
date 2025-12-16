package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f115531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(3);
        this.f115531l = str;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        String strS = AK.c.s(new StringBuilder(), this.f115531l, " за шт.");
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65244o;
        long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(a13);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.p.b(strS, rVar, C22501m2.a(R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 6, 0.0f, 0.0f, 13), "mainItem-stepperMessage"), false, jC2, null, 0, 0, false, null, a13, 384, 1000);
        return G0.f406611a;
    }
}
