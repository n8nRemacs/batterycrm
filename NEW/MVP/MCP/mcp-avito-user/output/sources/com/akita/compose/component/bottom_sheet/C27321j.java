package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.C22082i3;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.component.bottom_sheet.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27321j extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f60640l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f60641m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.H f60642n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27321j(androidx.compose.ui.window.H h12, I i12, kotlinx.coroutines.T t12) {
        super(0);
        this.f60640l = i12;
        this.f60641m = t12;
        this.f60642n = h12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        I i12 = this.f60640l;
        SheetValue sheetValue = (SheetValue) ((C22082i3) i12.f60524d.f27968g).getF42167b();
        SheetValue sheetValue2 = SheetValue.f60562c;
        kotlinx.coroutines.T t12 = this.f60641m;
        if (sheetValue == sheetValue2 && i12.f60524d.c().f(SheetValue.f60563d)) {
            C43259k.d(t12, null, null, new C27319h(i12, null), 3);
        } else if (this.f60642n.f43023a) {
            C43259k.d(t12, null, null, new C27320i(i12, null), 3);
        }
        return G0.f406611a;
    }
}
