package com.avito.android.cart_sheet_after_adding.ui;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29343i extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29343i(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
        super(2);
        this.f115609l = cartSheetAfterAddingDialogFragment;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = this.f115609l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) cartSheetAfterAddingDialogFragment.f115467m0.getValue(), androidx.compose.runtime.internal.r.c(-1169306638, new C29342h(cartSheetAfterAddingDialogFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
