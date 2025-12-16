package com.akita.compose.component.bottom_sheet.internal;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f60617l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f60619n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f60620o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, Y41.a<G0> aVar, H h12, LayoutDirection layoutDirection) {
        super(0);
        this.f60617l = mVar;
        this.f60618m = aVar;
        this.f60619n = h12;
        this.f60620o = layoutDirection;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f60617l.o(this.f60618m, this.f60619n, this.f60620o);
        return G0.f406611a;
    }
}
