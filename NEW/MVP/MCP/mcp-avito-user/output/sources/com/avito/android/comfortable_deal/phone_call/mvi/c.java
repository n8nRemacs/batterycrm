package com.avito.android.comfortable_deal.phone_call.mvi;

import Zp.C19585c;
import Zp.InterfaceC19583a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.phone_call.mvi.entity.PhoneCallInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneCallActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LZp/a;", "Lcom/avito/android/comfortable_deal/phone_call/mvi/entity/PhoneCallInternalAction;", "LZp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC19583a, PhoneCallInternalAction, C19585c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f122491a;

    @Inject
    public c(@Y61.k com.avito.android.comfortable_deal.repository.a aVar) {
        this.f122491a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhoneCallInternalAction> b(InterfaceC19583a interfaceC19583a, C19585c c19585c) {
        InterfaceC19583a interfaceC19583a2 = interfaceC19583a;
        C19585c c19585c2 = c19585c;
        if (interfaceC19583a2.equals(InterfaceC19583a.C1464a.f20492a)) {
            return C43175k.G(new a(c19585c2, null));
        }
        if (interfaceC19583a2.equals(InterfaceC19583a.b.f20493a)) {
            return C43175k.G(new b(this, c19585c2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
