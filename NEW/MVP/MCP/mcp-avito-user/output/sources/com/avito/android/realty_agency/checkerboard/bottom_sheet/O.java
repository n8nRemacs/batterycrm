package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LotsListSortingBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f250980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LotSortingType f250981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(Y41.l<? super InterfaceC19559a, G0> lVar, LotSortingType lotSortingType) {
        super(1);
        this.f250980l = lVar;
        this.f250981m = lotSortingType;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f250980l.invoke(new InterfaceC19559a.d.b(this.f250981m));
        return G0.f406611a;
    }
}
