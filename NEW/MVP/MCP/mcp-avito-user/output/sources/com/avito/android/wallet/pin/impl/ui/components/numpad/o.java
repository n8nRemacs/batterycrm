package com.avito.android.wallet.pin.impl.ui.components.numpad;

import androidx.compose.runtime.A;
import androidx.compose.ui.text.style.s;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletPinNumPad.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f328972l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super(2);
        this.f328972l = str;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65245p;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i12 = androidx.compose.ui.text.style.i.f42678e;
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(a13);
            s.f42720b.getClass();
            int i13 = s.f42722d;
            com.akita.compose.foundation.ui.p.b(this.f328972l, rVar, null, false, jC2, androidx.compose.ui.text.style.i.a(i12), 2, i13, false, null, a13, 14155776, 780);
        }
        return G0.f406611a;
    }
}
