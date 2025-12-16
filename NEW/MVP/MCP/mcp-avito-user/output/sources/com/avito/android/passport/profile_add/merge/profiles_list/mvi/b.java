package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import f60.InterfaceC40238a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfilesListActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lf60/a;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lf60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40238a, ProfilesListInternalAction, f60.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f213268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MergeFlow f213269b;

    @Inject
    public b(@Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar, @Y61.k MergeFlow mergeFlow) {
        this.f213268a = aVar;
        this.f213269b = mergeFlow;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ProfilesListInternalAction> b(InterfaceC40238a interfaceC40238a, f60.c cVar) {
        InterfaceC43160i<ProfilesListInternalAction> aVar;
        InterfaceC40238a interfaceC40238a2 = interfaceC40238a;
        f60.c cVar2 = cVar;
        boolean zEquals = interfaceC40238a2.equals(InterfaceC40238a.e.f395665a);
        com.avito.android.passport.profile_add.merge.domain.a aVar2 = this.f213268a;
        if (zEquals) {
            return aVar2.a(this.f213269b);
        }
        if (interfaceC40238a2.equals(InterfaceC40238a.d.f395664a)) {
            aVar = new C43210w(ProfilesListInternalAction.Expand.f213274b);
        } else if (interfaceC40238a2.equals(InterfaceC40238a.C11126a.f395661a)) {
            aVar = new C43210w(ProfilesListInternalAction.Collapse.f213273b);
        } else {
            if (!interfaceC40238a2.equals(InterfaceC40238a.b.f395662a)) {
                if (interfaceC40238a2 instanceof InterfaceC40238a.c) {
                    return new C43210w(new ProfilesListInternalAction.OpenDeepLink(((InterfaceC40238a.c) interfaceC40238a2).f395663a));
                }
                throw new NoWhenBranchMatchedException();
            }
            BusinessVrfDuplication businessVrfDuplication = cVar2.f395678j;
            if (businessVrfDuplication != null) {
                return new C43210w(new ProfilesListInternalAction.SelectBusinessVrfDuplication(businessVrfDuplication));
            }
            List<MergeAccountsProfile> list = cVar2.f395677i;
            if (!list.isEmpty()) {
                return new C43210w(new ProfilesListInternalAction.SelectProfileToConvert(list));
            }
            aVar = new a(aVar2.d(null));
        }
        return aVar;
    }
}
