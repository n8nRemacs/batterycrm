package com.avito.android.gig_slot_show_qr.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.gig_slot_show_qr.mvi.o;
import com.avito.android.gig_slot_show_qr.ui.screens.k;
import com.avito.android.gig_slot_show_qr.ui.screens.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: GigSlotShowQrFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f160933l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f160934m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f160935n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f160936o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a aVar, Y41.a aVar2, Y41.a aVar3, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f160933l = aVar;
        this.f160934m = aVar2;
        this.f160935n = aVar3;
        this.f160936o = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            o oVar = (o) this.f160936o.getF42167b();
            boolean z12 = oVar instanceof o.a;
            Y41.a<G0> aVar = this.f160933l;
            if (z12) {
                a13.C(215275263);
                n.a((o.a) oVar, aVar, this.f160934m, a13, 0);
                a13.h();
            } else if (L.f(oVar, o.b.f160916a)) {
                a13.C(215567779);
                com.avito.android.gig_slot_show_qr.ui.screens.i.a(aVar, this.f160935n, a13, 0);
                a13.h();
            } else if (L.f(oVar, o.c.f160917a)) {
                a13.C(215826071);
                k.a(aVar, a13, 0);
                a13.h();
            } else {
                a13.C(215995765);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
