package com.avito.android.mortgage_invite.lead;

import androidx.compose.runtime.A;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationLeadScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205927l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.a<G0> aVar) {
        super(2);
        this.f205927l = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            String strC = u0.i.c(a13, R.string.application_lead_navbar_title);
            Y41.a<G0> aVar = this.f205927l;
            com.akita.compose.component.navbar.t.d(strC, null, null, 0, aVar, androidx.compose.runtime.internal.r.c(-887611682, new m(aVar), a13), a13, 196608, 14);
        }
        return G0.f406611a;
    }
}
