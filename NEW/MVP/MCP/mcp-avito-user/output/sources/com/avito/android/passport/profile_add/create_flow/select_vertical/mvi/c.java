package com.avito.android.passport.profile_add.create_flow.select_vertical.mvi;

import U50.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_specific.SpecificVo;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.entity.SelectVerticalInternalAction;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameArgs;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SelectVerticalActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LU50/a;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalInternalAction;", "LU50/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<U50.a, SelectVerticalInternalAction, U50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.create_flow.select_vertical.i f211938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.domain.interactor.h f211939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final M50.a f211940c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SelectVerticalArguments f211941d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<Q<Integer, Integer>> f211942e;

    @Inject
    public c(@Y61.k com.avito.android.passport.profile_add.create_flow.select_vertical.i iVar, @Y61.k com.avito.android.passport.profile_add.domain.interactor.h hVar, @Y61.k M50.a aVar, @Y61.k SelectVerticalArguments selectVerticalArguments, @Y61.k Z1<Q<Integer, Integer>> z12) {
        this.f211938a = iVar;
        this.f211939b = hVar;
        this.f211940c = aVar;
        this.f211941d = selectVerticalArguments;
        this.f211942e = z12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectVerticalInternalAction> b(U50.a aVar, U50.c cVar) {
        InterfaceC43160i<SelectVerticalInternalAction> c43152f0;
        U50.a aVar2 = aVar;
        U50.c cVar2 = cVar;
        if (aVar2 instanceof a.f) {
            return this.f211938a.a();
        }
        if (aVar2 instanceof a.C1100a) {
            c43152f0 = new C43210w(new SelectVerticalInternalAction.Navigate(Navigation.Back.f211366b));
        } else {
            boolean z12 = aVar2 instanceof a.b;
            SelectVerticalArguments selectVerticalArguments = this.f211941d;
            if (z12) {
                this.f211940c.d(cVar2.f16195d, selectVerticalArguments.f211808d, AnalyticScreen.f211213f);
                c43152f0 = new C43210w(new SelectVerticalInternalAction.Navigate(new Navigation.Close(false, null, 3, null)));
            } else {
                if (aVar2 instanceof a.g) {
                    return new C43210w(new SelectVerticalInternalAction.SelectVertical(((a.g) aVar2).f16186a));
                }
                boolean z13 = aVar2 instanceof a.c;
                X50.e eVar = cVar2.f16197f;
                if (!z13) {
                    if (aVar2 instanceof a.d) {
                        return new C43210w(new SelectVerticalInternalAction.OpenVerticalDisablingInfoBottomSheet(((a.d) aVar2).f16183a));
                    }
                    if (!(aVar2 instanceof a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f211940c.a(eVar != null ? Integer.valueOf(eVar.f18590a) : null, null, cVar2.f16195d, selectVerticalArguments.f211808d, AnalyticScreen.f211213f);
                    return C43175k.w();
                }
                if (eVar == null) {
                    c43152f0 = new C43210w(SelectVerticalInternalAction.EmptySelectError.f211956b);
                } else {
                    List<X50.d> list = eVar.f18593d;
                    Object[] objArr = list.size() > 1;
                    int i12 = eVar.f18590a;
                    if (objArr == false) {
                        Integer numValueOf = Integer.valueOf(i12);
                        X50.d dVar = (X50.d) C42745f0.G(list);
                        this.f211940c.c(numValueOf, dVar != null ? Integer.valueOf(dVar.f18587a) : null, cVar2.f16195d, selectVerticalArguments.f211808d, AnalyticScreen.f211213f);
                    }
                    Z1<Q<Integer, Integer>> z14 = this.f211942e;
                    Q<Integer, Integer> value = z14.getValue();
                    Integer num = value.f406619b;
                    Integer num2 = value.f406620c;
                    if (list.size() <= 1) {
                        Integer numValueOf2 = Integer.valueOf(i12);
                        X50.d dVar2 = (X50.d) C42745f0.G(list);
                        z14.setValue(new Q<>(numValueOf2, dVar2 != null ? Integer.valueOf(dVar2.f18587a) : null));
                    } else if (num == null || num.intValue() != i12 || num2 == null) {
                        Q<Integer, Integer> q12 = cVar2.f16198g;
                        if (q12 == null || q12.f406619b.intValue() != i12) {
                            Integer num3 = eVar.f18594e;
                            if (num3 != null) {
                                z14.setValue(new Q<>(Integer.valueOf(i12), num3));
                            } else {
                                z14.setValue(new Q<>(Integer.valueOf(i12), null));
                            }
                        } else {
                            z14.setValue(new Q<>(Integer.valueOf(i12), q12.f406620c));
                        }
                    }
                    if (objArr == true) {
                        String str = selectVerticalArguments.f211806b;
                        List<X50.d> list2 = list;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                        for (X50.d dVar3 : list2) {
                            arrayList.add(new SpecificVo(dVar3.f18587a, dVar3.f18589c));
                        }
                        c43152f0 = new C43210w(new SelectVerticalInternalAction.Navigate(new Navigation.SelectSpecific(new SelectSpecificArguments(str, eVar.f18590a, eVar.f18591b, arrayList, selectVerticalArguments.f211807c, selectVerticalArguments.f211808d, cVar2.f16194c, cVar2.f16195d, selectVerticalArguments.f211809e))));
                    } else if (selectVerticalArguments.f211809e) {
                        X50.d dVar4 = (X50.d) C42745f0.w0(list);
                        c43152f0 = new C43210w(new SelectVerticalInternalAction.Navigate(new Navigation.Close(true, new ExtendedProfileCreationResult.OnlySelectVerticalAndSpecific(eVar.f18590a, dVar4 != null ? Integer.valueOf(dVar4.f18587a) : null, eVar.f18591b, dVar4 != null ? dVar4.f18589c : null, list.size() > 1))));
                    } else {
                        ProfileCreateExtendedFlow profileCreateExtendedFlow = selectVerticalArguments.f211807c;
                        if ((profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Merge) || (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.BusinessVrf)) {
                            c43152f0 = new C43152f0(C43175k.G(new a(this, (ProfileCreateExtendedFlow.Passport) profileCreateExtendedFlow, eVar, cVar2.f16195d, null)), new b(3, null));
                        } else {
                            X50.d dVar5 = (X50.d) C42745f0.G(list);
                            c43152f0 = new C43210w(new SelectVerticalInternalAction.Navigate(new Navigation.SetProfileName(new SetProfileNameArgs(eVar.f18590a, dVar5 != null ? Integer.valueOf(dVar5.f18587a) : null, selectVerticalArguments.f211806b, selectVerticalArguments.f211807c, selectVerticalArguments.f211808d, cVar2.f16194c, cVar2.f16195d))));
                        }
                    }
                }
            }
        }
        return c43152f0;
    }
}
