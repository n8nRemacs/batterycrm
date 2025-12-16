package com.akita.compose.component.bottom_sheet;

import kotlin.Metadata;

/* compiled from: BottomSheetState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/bottom_sheet/SheetValue;", "savedValue", "Lcom/akita/compose/component/bottom_sheet/I;", "invoke", "(Lcom/akita/compose/component/bottom_sheet/SheetValue;)Lcom/akita/compose/component/bottom_sheet/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<SheetValue, I> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60530m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f60531n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<SheetValue, Boolean> f60532o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(boolean z12, float f12, androidx.compose.ui.unit.d dVar, Y41.l<? super SheetValue, Boolean> lVar) {
        super(1);
        this.f60529l = z12;
        this.f60530m = f12;
        this.f60531n = dVar;
        this.f60532o = lVar;
    }

    @Override // Y41.l
    public final I invoke(SheetValue sheetValue) {
        return new I(this.f60529l, this.f60530m, this.f60531n, sheetValue, this.f60532o);
    }
}
