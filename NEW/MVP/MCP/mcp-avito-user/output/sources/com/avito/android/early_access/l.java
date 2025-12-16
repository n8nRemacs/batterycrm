package com.avito.android.early_access;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.early_access.EarlyAccessDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessDialog f145392l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EarlyAccessDialog earlyAccessDialog) {
        super(2);
        this.f145392l = earlyAccessDialog;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            EarlyAccessDialog.a aVar = EarlyAccessDialog.f145055q0;
            EarlyAccessDialog earlyAccessDialog = this.f145392l;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(earlyAccessDialog.f5().getState(), a13);
            androidx.view.compose.h.a(false, new h(earlyAccessDialog), a13, 0, 1);
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) earlyAccessDialog.f145062n0.getValue(), androidx.compose.runtime.internal.r.c(1546305190, new k(interfaceC22204y1B, earlyAccessDialog), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
