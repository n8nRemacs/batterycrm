package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;

/* compiled from: LotItemPreviewBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class D extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f250943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.bottom_sheet.I f250944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f250945n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250946o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Y41.l lVar, com.akita.compose.component.bottom_sheet.I i12, I i13, kotlinx.coroutines.T t12) {
        super(0);
        this.f250943l = t12;
        this.f250944m = i12;
        this.f250945n = i13;
        this.f250946o = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ((V0) C43259k.d(this.f250943l, null, null, new B(this.f250944m, null), 3)).k(new C(this.f250945n, this.f250946o));
        return G0.f406611a;
    }
}
