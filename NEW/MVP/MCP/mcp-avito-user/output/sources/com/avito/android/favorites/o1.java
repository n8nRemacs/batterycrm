package com.avito.android.favorites;

import com.avito.android.favorites.InterfaceC30665h1;
import kotlin.Metadata;

/* compiled from: FavoritesView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "()Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class o1 extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x1 f157418l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(x1 x1Var) {
        super(0);
        this.f157418l = x1Var;
    }

    @Override // Y41.a
    public final com.avito.android.lib.design.bottom_sheet.d invoke() {
        x1 x1Var = this.f157418l;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(x1Var.f157598b.getContext(), 0, 2, null);
        InterfaceC30683q0 interfaceC30683q0 = x1Var.f157600d;
        com.avito.android.favorites.compose.items_remove_sheet_global.m.e(new m1(0, interfaceC30683q0, InterfaceC30665h1.b.class, "onRemoveAllClicked", "onRemoveAllClicked()V", 0), new n1(0, interfaceC30683q0, InterfaceC30665h1.b.class, "onRemoveInactiveClicked", "onRemoveInactiveClicked()V", 0), dVar);
        return dVar;
    }
}
