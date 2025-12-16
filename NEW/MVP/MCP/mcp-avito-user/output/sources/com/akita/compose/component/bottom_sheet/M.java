package com.akita.compose.component.bottom_sheet;

import kotlin.Metadata;

/* compiled from: BottomSheetState.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/I;", "invoke", "()Lcom/akita/compose/component/bottom_sheet/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class M extends kotlin.jvm.internal.N implements Y41.a<I> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f60536n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<SheetValue, Boolean> f60537o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(boolean z12, float f12, androidx.compose.ui.unit.d dVar, Y41.l<? super SheetValue, Boolean> lVar) {
        super(0);
        this.f60534l = z12;
        this.f60535m = f12;
        this.f60536n = dVar;
        this.f60537o = lVar;
    }

    @Override // Y41.a
    public final I invoke() {
        SheetValue sheetValue = SheetValue.f60561b;
        return new I(this.f60534l, this.f60535m, this.f60536n, sheetValue, this.f60537o);
    }
}
