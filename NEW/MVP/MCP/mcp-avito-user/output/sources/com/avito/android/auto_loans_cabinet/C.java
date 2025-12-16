package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* compiled from: AutoLoanCabinetViewLoanDetailsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class C extends kotlin.jvm.internal.H implements Y41.a<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f95311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f95312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(T t12, com.akita.compose.component.bottom_sheet.I i12, Y41.l<? super InterfaceC14305a, G0> lVar) {
        super(0, L.a.class, "hideBottomSheet", "AutoLoanCabinetViewLoanDetailsBottomSheet$hideBottomSheet(Lkotlinx/coroutines/CoroutineScope;Lcom/akita/compose/component/bottom_sheet/BottomSheetState;Lkotlin/jvm/functions/Function1;)V", 0);
        this.f95311b = t12;
        this.f95312c = i12;
        this.f95313d = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<InterfaceC14305a, G0> lVar = this.f95313d;
        ((V0) C43259k.d(this.f95311b, null, null, new G(this.f95312c, null), 3)).k(new H(lVar));
        return G0.f406611a;
    }
}
