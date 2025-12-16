package com.avito.android.passport.profile_add.merge.code_request.mvi;

import androidx.compose.runtime.internal.P;
import c60.InterfaceC26947a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CodeRequestActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_request/mvi/k;", "Lcom/avito/android/arch/mvi/a;", "Lc60/a;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lc60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements com.avito.android.arch.mvi.a<InterfaceC26947a, CodeRequestInternalAction, c60.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f212894a;

    @Inject
    public k(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar) {
        this.f212894a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CodeRequestInternalAction> b(InterfaceC26947a interfaceC26947a, c60.c cVar) {
        InterfaceC26947a interfaceC26947a2 = interfaceC26947a;
        c60.c cVar2 = cVar;
        boolean zEquals = interfaceC26947a2.equals(InterfaceC26947a.b.f57649a);
        com.avito.android.passport.profile_add.merge.domain.a aVar = this.f212894a;
        if (zEquals) {
            return aVar.h();
        }
        if (interfaceC26947a2.equals(InterfaceC26947a.c.f57650a)) {
            return C43175k.G(new j(cVar2, null));
        }
        if (interfaceC26947a2 instanceof InterfaceC26947a.d) {
            return aVar.g(((InterfaceC26947a.d) interfaceC26947a2).f57651a);
        }
        if (interfaceC26947a2 instanceof InterfaceC26947a.C2030a) {
            return new C43210w(new CodeRequestInternalAction.DeepLinkAction(((InterfaceC26947a.C2030a) interfaceC26947a2).f57648a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
