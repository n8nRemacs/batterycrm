package com.avito.android.comfortable_deal.submitting.select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.submitting.select.mvi.entity.SubmittingSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import pq.C47129c;
import pq.InterfaceC47127a;

/* compiled from: SubmittingSelectActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/select/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "Lpq/a;", "Lcom/avito/android/comfortable_deal/submitting/select/mvi/entity/SubmittingSelectInternalAction;", "Lpq/c;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements com.avito.android.arch.mvi.a<InterfaceC47127a, SubmittingSelectInternalAction, C47129c> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SubmittingSelectInternalAction> b(InterfaceC47127a interfaceC47127a, C47129c c47129c) {
        InterfaceC47127a interfaceC47127a2 = interfaceC47127a;
        C47129c c47129c2 = c47129c;
        if (interfaceC47127a2.equals(InterfaceC47127a.C12291a.f428783a)) {
            return C43175k.G(new c(2, null));
        }
        if (interfaceC47127a2.equals(InterfaceC47127a.c.f428785a)) {
            return C43175k.G(new d(c47129c2, null));
        }
        if (interfaceC47127a2 instanceof InterfaceC47127a.d) {
            return C43175k.G(new e(interfaceC47127a2, null));
        }
        if (interfaceC47127a2 instanceof InterfaceC47127a.b) {
            return C43175k.G(new f(c47129c2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
