package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import P50.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.create.duplication_finish.mvi.entity.BusinessVerificationDuplicationFinishInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BusinessVerificationDuplicationFinishActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LP50/a;", "Lcom/avito/android/passport/profile_add/create/duplication_finish/mvi/entity/BusinessVerificationDuplicationFinishInternalAction;", "LP50/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<P50.a, BusinessVerificationDuplicationFinishInternalAction, P50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create.duplication_finish.domain.a f211310a;

    @Inject
    public a(@Y61.k com.avito.android.passport.profile_add.create.duplication_finish.domain.a aVar) {
        this.f211310a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BusinessVerificationDuplicationFinishInternalAction> b(P50.a aVar, P50.c cVar) {
        P50.a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            return this.f211310a.a();
        }
        if (aVar2.equals(a.C0833a.f12830a)) {
            return new C43210w(BusinessVerificationDuplicationFinishInternalAction.Close.f211319b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
