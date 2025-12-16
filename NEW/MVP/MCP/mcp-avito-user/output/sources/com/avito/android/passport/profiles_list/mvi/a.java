package com.avito.android.passport.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.passport.profiles_list.ProfilesListResult;
import com.avito.android.passport.profiles_list.mvi.entity.PassportProfilesListInternalAction;
import com.avito.android.passport.profiles_list.o;
import j60.C42206c;
import j60.InterfaceC42204a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PassportProfilesListActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profiles_list/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lj60/a;", "Lcom/avito/android/passport/profiles_list/mvi/entity/PassportProfilesListInternalAction;", "Lj60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42204a, PassportProfilesListInternalAction, C42206c> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f213815a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f213816b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f213817c;

    @Inject
    public a(@com.avito.android.passport.profiles_list.di.b boolean z12, @Y61.k o oVar, @Y61.k Z1<String> z13) {
        this.f213815a = z12;
        this.f213816b = oVar;
        this.f213817c = z13;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PassportProfilesListInternalAction> b(InterfaceC42204a interfaceC42204a, C42206c c42206c) {
        Object close;
        InterfaceC42204a interfaceC42204a2 = interfaceC42204a;
        C42206c c42206c2 = c42206c;
        if (interfaceC42204a2 instanceof InterfaceC42204a.b) {
            return this.f213816b.a();
        }
        ProfilesListResult profilesListResult = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (interfaceC42204a2.equals(InterfaceC42204a.C11547a.f405430a)) {
            char c12 = 1;
            if (this.f213815a) {
                close = new PassportProfilesListInternalAction.Close(profilesListResult, c12 == true ? 1 : 0, objArr3 == true ? 1 : 0);
            } else {
                close = new PassportProfilesListInternalAction.DeepLinkAction(new PassportAddProfileLink(c42206c2.f405443g.size() == 1));
            }
            return new C43210w(close);
        }
        if (!(interfaceC42204a2 instanceof InterfaceC42204a.c)) {
            if (interfaceC42204a2 instanceof InterfaceC42204a.d) {
                return new C43210w(new PassportProfilesListInternalAction.DeepLinkAction(new PassportSwitchProfileLink(((InterfaceC42204a.d) interfaceC42204a2).f405433a, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0)));
            }
            throw new NoWhenBranchMatchedException();
        }
        Z1<String> z12 = this.f213817c;
        String str = ((InterfaceC42204a.c) interfaceC42204a2).f405432a;
        z12.setValue(str);
        return new C43210w(new PassportProfilesListInternalAction.NewSearch(str));
    }
}
