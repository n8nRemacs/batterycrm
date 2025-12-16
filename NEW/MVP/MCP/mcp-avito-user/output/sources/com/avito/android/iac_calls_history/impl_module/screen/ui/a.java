package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.runtime.A;
import com.akita.compose.component.navbar.t;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164875l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a<G0> aVar) {
        super(2);
        this.f164875l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            t.d(u0.i.c(a13, R.string.iac_calls_history_screen_title), null, null, 0, this.f164875l, null, a13, 0, 46);
        }
        return G0.f406611a;
    }
}
