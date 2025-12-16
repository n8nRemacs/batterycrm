package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import kotlin.G0;
import kotlin.Metadata;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "event", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.key.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f127955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC48707a, G0> f127956m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(androidx.compose.ui.focus.r rVar, Y41.l<? super InterfaceC48707a, G0> lVar) {
        super(1);
        this.f127955l = rVar;
        this.f127956m = lVar;
    }

    @Override // Y41.l
    public final Boolean invoke(androidx.compose.ui.input.key.c cVar) {
        boolean z12 = false;
        if (((int) (androidx.compose.ui.input.key.i.a(cVar.f40068a.getKeyCode()) >> 32)) == 4) {
            this.f127955l.u(false);
            this.f127956m.invoke(InterfaceC48707a.f.f439469a);
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
