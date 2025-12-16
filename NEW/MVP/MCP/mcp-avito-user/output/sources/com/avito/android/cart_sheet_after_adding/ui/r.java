package com.avito.android.cart_sheet_after_adding.ui;

import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.G0;
import kotlin.Metadata;
import tn.InterfaceC48692a;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newQuantity", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gn.g f115651l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115652m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gn.g gVar, Y41.l<Object, G0> lVar) {
        super(1);
        this.f115651l = gVar;
        this.f115652m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        gn.g gVar = this.f115651l;
        Stepper stepper = gVar.f396834j;
        this.f115652m.invoke(new InterfaceC48692a.b(gVar.f396825a, stepper.f116271b, iIntValue, stepper.f116272c, null));
        return G0.f406611a;
    }
}
