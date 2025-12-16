package com.avito.android.mortgage.pre_approval.result.mvi.builders;

import JZ.o;
import X00.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PreApprovalResultViewStateBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/builders/f;", "Lcom/avito/android/mortgage/pre_approval/result/mvi/builders/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f202091a;

    @Inject
    public f(@k a aVar) {
        this.f202091a = aVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.result.mvi.builders.e
    @k
    public final X00.a a(@k X00.a aVar) {
        boolean z12 = aVar instanceof a.c;
        a aVar2 = this.f202091a;
        if (z12) {
            a.c cVar = (a.c) aVar;
            return a.c.i(cVar, null, null, null, null, new X00.b(null, aVar2.a(cVar)), 31);
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        o oVar = bVar.f18103d;
        return a.b.i(bVar, null, null, false, null, new X00.b(oVar == null ? com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_error_action, new Serializable[0]) : com.avito.android.printable_text.b.f(oVar.getActionText()), aVar2.b(bVar)), 15);
    }
}
