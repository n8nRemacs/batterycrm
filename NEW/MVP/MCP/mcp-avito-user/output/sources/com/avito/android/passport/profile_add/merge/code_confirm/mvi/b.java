package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import androidx.compose.runtime.internal.P;
import b60.InterfaceC25416a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CodeConfirmActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lb60/a;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lb60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC25416a, CodeConfirmInternalAction, b60.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f212744a;

    @Inject
    public b(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar) {
        this.f212744a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CodeConfirmInternalAction> b(InterfaceC25416a interfaceC25416a, b60.c cVar) {
        InterfaceC25416a interfaceC25416a2 = interfaceC25416a;
        b60.c cVar2 = cVar;
        if (interfaceC25416a2 instanceof InterfaceC25416a.C1991a) {
            return C43175k.G(new a(cVar2, (InterfaceC25416a.C1991a) interfaceC25416a2, this, null));
        }
        if (!(interfaceC25416a2 instanceof InterfaceC25416a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25416a.b bVar = (InterfaceC25416a.b) interfaceC25416a2;
        return this.f212744a.c(bVar.f56909a, bVar.f56910b);
    }
}
