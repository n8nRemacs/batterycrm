package com.avito.android.free_delivery.ui.re23;

import UE.a;
import Y41.l;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<UE.a, G0> f158911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f158912m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f158913n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158914o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i12, r rVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f158911l = lVar;
        this.f158912m = i12;
        this.f158913n = rVar;
        this.f158914o = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        boolean zBooleanValue = ((Boolean) this.f158914o.getF42167b()).booleanValue();
        int i12 = this.f158912m;
        l<UE.a, G0> lVar = this.f158911l;
        if (zBooleanValue) {
            lVar.invoke(new a.c(i12));
            this.f158913n.u(false);
        } else {
            lVar.invoke(new a.C1112a(i12));
        }
        return G0.f406611a;
    }
}
