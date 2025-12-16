package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import T50.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_specific.SpecificVo;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.entity.SelectSpecificInternalAction;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectSpecificActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LT50/a;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/mvi/entity/SelectSpecificInternalAction;", "LT50/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<T50.a, SelectSpecificInternalAction, T50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.h f211725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M50.a f211726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectSpecificArguments f211727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<Q<Integer, Integer>> f211728d;

    @Inject
    public c(@Y61.k com.avito.android.passport.profile_add.domain.interactor.h hVar, @Y61.k M50.a aVar, @Y61.k SelectSpecificArguments selectSpecificArguments, @Y61.k Z1<Q<Integer, Integer>> z12) {
        this.f211725a = hVar;
        this.f211726b = aVar;
        this.f211727c = selectSpecificArguments;
        this.f211728d = z12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectSpecificInternalAction> b(T50.a aVar, T50.c cVar) {
        InterfaceC43160i<SelectSpecificInternalAction> c43152f0;
        Object next;
        T50.a aVar2 = aVar;
        T50.c cVar2 = cVar;
        if (aVar2 instanceof a.C1046a) {
            return new C43210w(new SelectSpecificInternalAction.Navigate(Navigation.Back.f211366b));
        }
        boolean z12 = aVar2 instanceof a.b;
        SelectSpecificArguments selectSpecificArguments = this.f211727c;
        if (z12) {
            this.f211726b.d(selectSpecificArguments.f211622i, selectSpecificArguments.f211620g, AnalyticScreen.f211213f);
            return new C43210w(new SelectSpecificInternalAction.Navigate(new Navigation.Close(false, null, 3, null)));
        }
        if (aVar2 instanceof a.d) {
            this.f211726b.a(Integer.valueOf(selectSpecificArguments.f211616c), cVar2.f15374e, selectSpecificArguments.f211622i, selectSpecificArguments.f211620g, AnalyticScreen.f211213f);
            return C43175k.w();
        }
        if (aVar2 instanceof a.e) {
            c43152f0 = new C43210w(new SelectSpecificInternalAction.SelectSpecific(((a.e) aVar2).f15366a));
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Integer num = cVar2.f15374e;
            if (num == null) {
                return new C43210w(SelectSpecificInternalAction.EmptySelectError.f211740b);
            }
            int iIntValue = num.intValue();
            this.f211728d.setValue(new Q<>(Integer.valueOf(selectSpecificArguments.f211616c), num));
            this.f211726b.c(Integer.valueOf(selectSpecificArguments.f211616c), num, selectSpecificArguments.f211622i, selectSpecificArguments.f211620g, AnalyticScreen.f211213f);
            if (selectSpecificArguments.f211623j) {
                List<SpecificVo> list = selectSpecificArguments.f211618e;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((SpecificVo) next).f211653b == iIntValue) {
                        break;
                    }
                }
                SpecificVo specificVo = (SpecificVo) next;
                c43152f0 = new C43210w(new SelectSpecificInternalAction.Navigate(new Navigation.Close(true, new ExtendedProfileCreationResult.OnlySelectVerticalAndSpecific(selectSpecificArguments.f211616c, num, selectSpecificArguments.f211617d, specificVo != null ? specificVo.f211654c : null, list.size() > 1))));
            } else {
                ProfileCreateExtendedFlow profileCreateExtendedFlow = selectSpecificArguments.f211619f;
                c43152f0 = ((profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Merge) || (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.BusinessVrf)) ? new C43152f0(C43175k.G(new a(this, (ProfileCreateExtendedFlow.Passport) profileCreateExtendedFlow, iIntValue, null)), new b(3, null)) : new C43210w(new SelectSpecificInternalAction.Navigate(new Navigation.SetProfileName(new SetProfileNameArgs(selectSpecificArguments.f211616c, num, selectSpecificArguments.f211615b, selectSpecificArguments.f211619f, selectSpecificArguments.f211620g, selectSpecificArguments.f211621h, selectSpecificArguments.f211622i))));
            }
        }
        return c43152f0;
    }
}
