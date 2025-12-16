package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionButton f203886l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ActionButton actionButton) {
        super(2);
        this.f203886l = actionButton;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            String title = this.f203886l.getTitle();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(title, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
        }
        return G0.f406611a;
    }
}
