package com.avito.android.realty_agency.checkerboard.bottom_sheet;

import Zh0.InterfaceC19559a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LotItemPreviewBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class z extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f251081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC19559a, G0> f251082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(I i12, Y41.l<? super InterfaceC19559a, G0> lVar) {
        super(1);
        this.f251081l = i12;
        this.f251082m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Long l12 = this.f251081l.f250952a;
        if (l12 != null) {
            this.f251082m.invoke(new InterfaceC19559a.c.C1455c(l12.longValue()));
        }
        return G0.f406611a;
    }
}
