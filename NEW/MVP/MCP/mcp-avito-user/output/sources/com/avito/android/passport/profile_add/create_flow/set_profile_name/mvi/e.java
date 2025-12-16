package com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi;

import V50.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameInternalAction;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.mvi.entity.SetProfileNameState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SetProfileNameActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LV50/a;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameInternalAction;", "Lcom/avito/android/passport/profile_add/create_flow/set_profile_name/mvi/entity/SetProfileNameState;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<V50.a, SetProfileNameInternalAction, SetProfileNameState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M50.a f212138a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SetProfileNameArgs f212139b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<String> f212140c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f212141d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.a f212142e;

    @Inject
    public e(@Y61.k M50.a aVar, @Y61.k SetProfileNameArgs setProfileNameArgs, @Y61.k Z1<String> z12, @Y61.k R0 r02, @Y61.k com.avito.android.passport.profile_add.domain.interactor.a aVar2) {
        this.f212138a = aVar;
        this.f212139b = setProfileNameArgs;
        this.f212140c = z12;
        this.f212141d = r02;
        this.f212142e = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SetProfileNameInternalAction> b(V50.a aVar, SetProfileNameState setProfileNameState) {
        InterfaceC43160i<SetProfileNameInternalAction> interfaceC43160iI;
        V50.a aVar2 = aVar;
        SetProfileNameState setProfileNameState2 = setProfileNameState;
        if (aVar2 instanceof a.C1163a) {
            return new C43210w(new SetProfileNameInternalAction.Navigate(Navigation.Back.f211366b));
        }
        boolean z12 = aVar2 instanceof a.b;
        SetProfileNameArgs setProfileNameArgs = this.f212139b;
        if (z12) {
            this.f212138a.d(setProfileNameArgs.f212038h, setProfileNameArgs.f212036f, AnalyticScreen.f211214g);
            return new C43210w(new SetProfileNameInternalAction.Navigate(new Navigation.Close(false, null, 3, null)));
        }
        if (aVar2 instanceof a.e) {
            Integer numValueOf = Integer.valueOf(setProfileNameArgs.f212032b);
            AnalyticScreen analyticScreen = AnalyticScreen.f211214g;
            this.f212138a.a(numValueOf, setProfileNameArgs.f212033c, setProfileNameArgs.f212038h, setProfileNameArgs.f212036f, analyticScreen);
            return C43175k.w();
        }
        if (aVar2 instanceof a.f) {
            String str = ((a.f) aVar2).f16916a;
            this.f212140c.setValue(str);
            interfaceC43160iI = new C43210w(new SetProfileNameInternalAction.OnTyped(str));
        } else {
            if (!(aVar2 instanceof a.c)) {
                if (!(aVar2 instanceof a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.d dVar = (a.d) aVar2;
                return C43175k.G(new c(dVar.f16913a, dVar.f16914b, this, null));
            }
            if (setProfileNameState2.f212158d.length() == 0) {
                return new C43210w(SetProfileNameInternalAction.EmptyNameError.f212145b);
            }
            this.f212138a.c(Integer.valueOf(setProfileNameArgs.f212032b), setProfileNameArgs.f212033c, setProfileNameArgs.f212038h, setProfileNameArgs.f212036f, AnalyticScreen.f211214g);
            interfaceC43160iI = C43175k.I(this.f212141d.a(), new C43152f0(C43175k.G(new a(this, setProfileNameState2, null)), new b(3, null)));
        }
        return interfaceC43160iI;
    }
}
