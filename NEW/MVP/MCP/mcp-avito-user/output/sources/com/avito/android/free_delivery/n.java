package com.avito.android.free_delivery;

import UE.a;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UE.a, G0> f158813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f158814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f158815n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158816o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.l lVar, int i12, androidx.compose.ui.focus.r rVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f158813l = lVar;
        this.f158814m = i12;
        this.f158815n = rVar;
        this.f158816o = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        boolean zBooleanValue = ((Boolean) this.f158816o.getF42167b()).booleanValue();
        int i12 = this.f158814m;
        Y41.l<UE.a, G0> lVar = this.f158813l;
        if (zBooleanValue) {
            lVar.invoke(new a.c(i12));
            this.f158815n.u(false);
        } else {
            lVar.invoke(new a.C1112a(i12));
        }
        return G0.f406611a;
    }
}
