package com.avito.android.wallet.pin.impl.settings.mvi;

import androidx.compose.runtime.A;
import com.akita.compose.component.toggle.r;
import kP0.C42617c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletSecuritySettingsScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C42617c f328885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f328886m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C42617c c42617c, Y41.a<G0> aVar) {
        super(2);
        this.f328885l = c42617c;
        this.f328886m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r.a(this.f328885l.f406272b.f406270c, this.f328886m, com.akita.compose.theme.re23.b.s(a13).getF66730b(), null, null, null, a13, 0, 120);
        }
        return G0.f406611a;
    }
}
