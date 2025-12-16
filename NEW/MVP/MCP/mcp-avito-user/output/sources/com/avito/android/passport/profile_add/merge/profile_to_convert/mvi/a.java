package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity.ProfileToConvertInternalAction;
import e60.C39958c;
import e60.InterfaceC39956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileToConvertActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Le60/a;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "Le60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC39956a, ProfileToConvertInternalAction, C39958c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ProfileToConvertInternalAction> b(InterfaceC39956a interfaceC39956a, C39958c c39958c) {
        Object openDeepLink;
        InterfaceC39956a interfaceC39956a2 = interfaceC39956a;
        C39958c c39958c2 = c39958c;
        if (interfaceC39956a2.equals(InterfaceC39956a.C11053a.f394957a)) {
            String str = c39958c2.f394962b;
            openDeepLink = str != null ? new ProfileToConvertInternalAction.Continue(str) : ProfileToConvertInternalAction.ContinueWithoutSelectionClicked.f213152b;
        } else if (interfaceC39956a2 instanceof InterfaceC39956a.c) {
            openDeepLink = new ProfileToConvertInternalAction.ItemSelected(((InterfaceC39956a.c) interfaceC39956a2).f394959a);
        } else {
            if (!(interfaceC39956a2 instanceof InterfaceC39956a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            openDeepLink = new ProfileToConvertInternalAction.OpenDeepLink(((InterfaceC39956a.b) interfaceC39956a2).f394958a);
        }
        return new C43210w(openDeepLink);
    }
}
