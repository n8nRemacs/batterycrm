package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.runtime.C22126m3;
import com.avito.android.cart_sheet_after_adding.ui.components.C29335a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cart_sheet_after_adding.ui.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29344j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CartSheetAfterAddingDialogFragment f115610l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29344j(CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment) {
        super(2);
        this.f115610l = cartSheetAfterAddingDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = this.f115610l;
            C29335a.a(((gn.e) C22126m3.b(((com.avito.android.cart_sheet_after_adding.mvi.p) cartSheetAfterAddingDialogFragment.f115463i0.getValue()).getState(), a13).getF42167b()).f396823f, cartSheetAfterAddingDialogFragment.f5(), a13, 0);
        }
        return G0.f406611a;
    }
}
