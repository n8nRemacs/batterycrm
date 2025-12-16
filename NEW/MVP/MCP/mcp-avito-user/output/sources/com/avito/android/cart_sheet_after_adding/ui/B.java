package com.avito.android.cart_sheet_after_adding.ui;

import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.G0;
import kotlin.Metadata;
import tn.InterfaceC48692a;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newQuantity", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gn.i f115452l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115453m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f115454n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(int i12, Y41.l lVar, gn.i iVar) {
        super(1);
        this.f115452l = iVar;
        this.f115453m = lVar;
        this.f115454n = i12;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        gn.i iVar = this.f115452l;
        Stepper stepper = iVar.f396843g;
        int i12 = stepper.f116271b;
        Integer numValueOf = Integer.valueOf(this.f115454n);
        this.f115453m.invoke(new InterfaceC48692a.b(iVar.f396837a, i12, iIntValue, stepper.f116272c, numValueOf));
        return G0.f406611a;
    }
}
