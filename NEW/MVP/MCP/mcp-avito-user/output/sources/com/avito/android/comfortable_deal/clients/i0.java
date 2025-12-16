package com.avito.android.comfortable_deal.clients;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.InterfaceC22196w1;
import kotlin.Metadata;

/* compiled from: ClientsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i0 extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f120228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f120229m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f120230n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(w0 w0Var, InterfaceC22196w1 interfaceC22196w1, InterfaceC22196w1 interfaceC22196w12) {
        super(0);
        this.f120228l = w0Var;
        this.f120229m = interfaceC22196w1;
        this.f120230n = interfaceC22196w12;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        InterfaceC22196w1 interfaceC22196w1 = this.f120229m;
        int iE2 = interfaceC22196w1.e();
        w0 w0Var = this.f120228l;
        int iH2 = w0Var.h();
        InterfaceC22196w1 interfaceC22196w12 = this.f120230n;
        boolean z12 = false;
        if (iE2 == iH2 ? interfaceC22196w12.e() >= w0Var.i() : interfaceC22196w1.e() > w0Var.h()) {
            z12 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z12);
        interfaceC22196w1.L3(w0Var.h());
        interfaceC22196w12.L3(w0Var.i());
        return boolValueOf;
    }
}
