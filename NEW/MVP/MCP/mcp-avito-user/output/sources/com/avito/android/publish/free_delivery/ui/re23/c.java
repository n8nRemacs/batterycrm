package com.avito.android.publish.free_delivery.ui.re23;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.r;
import he0.InterfaceC40924a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40924a, G0> f235947l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f235948m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f235949n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f235950o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y41.l lVar, int i12, r rVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f235947l = lVar;
        this.f235948m = i12;
        this.f235949n = rVar;
        this.f235950o = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final G0 invoke() {
        boolean zBooleanValue = ((Boolean) this.f235950o.getF42167b()).booleanValue();
        int i12 = this.f235948m;
        Y41.l<InterfaceC40924a, G0> lVar = this.f235947l;
        if (zBooleanValue) {
            lVar.invoke(new InterfaceC40924a.c(i12));
            this.f235949n.u(false);
        } else {
            lVar.invoke(new InterfaceC40924a.C11265a(i12));
        }
        return G0.f406611a;
    }
}
