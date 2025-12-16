package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PortfolioProjectSellerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class B extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv0.f f280283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280285n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(kv0.f fVar, com.avito.android.deeplink_handler.handler.composite.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f280283l = fVar;
        this.f280284m = aVar;
        this.f280285n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            kv0.f fVar = this.f280283l;
            String str = fVar.f413289b;
            if (str != null) {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.button.m.c(str, new A(fVar, this.f280284m, this.f280285n), com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13), R1.i(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), 10), null, null, null, false, false, null, a13, 3584, 1008);
            }
        }
        return G0.f406611a;
    }
}
