package com.akita.compose.component.bottom_sheet;

import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.component.bottom_sheet.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27327p extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f60684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.H f60685m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f60686n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27327p(androidx.compose.ui.window.H h12, I i12, kotlinx.coroutines.T t12) {
        super(0);
        this.f60684l = i12;
        this.f60685m = h12;
        this.f60686n = t12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        I i12 = this.f60684l;
        if (i12.f60523c.invoke(SheetValue.f60561b).booleanValue() && this.f60685m.f43024b) {
            C43259k.d(this.f60686n, null, null, new C27326o(i12, null), 3);
        }
        return G0.f406611a;
    }
}
