package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.profile_add.merge.select_business_vrf.SelectBusinessVrfOpenParams;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportNotChosenItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportNotFoundSelectBusinessItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessListItem;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.PassportSelectBusinessSingleReqItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import g60.InterfaceC40537a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectBusinessVrfActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lg60/a;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lg60/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40537a, SelectBusinessVrfInternalAction, g60.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectBusinessVrfOpenParams f213416a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport.profile_add.merge.domain.a f213417b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213418c;

    /* compiled from: SelectBusinessVrfActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6398a {
        static {
            int[] iArr = new int[PassportSelectBusinessVrfLink.Flow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PassportSelectBusinessVrfLink.Flow flow = PassportSelectBusinessVrfLink.Flow.f211124b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PassportSelectBusinessVrfLink.Flow flow2 = PassportSelectBusinessVrfLink.Flow.f211124b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@Y61.k SelectBusinessVrfOpenParams selectBusinessVrfOpenParams, @Y61.k com.avito.android.passport.profile_add.merge.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f213416a = selectBusinessVrfOpenParams;
        this.f213417b = aVar;
        this.f213418c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectBusinessVrfInternalAction> b(InterfaceC40537a interfaceC40537a, g60.c cVar) {
        List listSingletonList;
        InterfaceC40537a interfaceC40537a2 = interfaceC40537a;
        g60.c cVar2 = cVar;
        if (interfaceC40537a2.equals(InterfaceC40537a.b.f396288a)) {
            return new C43210w(SelectBusinessVrfInternalAction.Close.f213432b);
        }
        if (interfaceC40537a2 instanceof InterfaceC40537a.c) {
            return C43175k.G(new c(interfaceC40537a2, this, null));
        }
        boolean zEquals = interfaceC40537a2.equals(InterfaceC40537a.C11190a.f396287a);
        Integer num = cVar2.f396307i;
        SelectBusinessVrfOpenParams selectBusinessVrfOpenParams = this.f213416a;
        com.avito.android.passport.profile_add.merge.domain.a aVar = this.f213417b;
        if (zEquals) {
            int iOrdinal = selectBusinessVrfOpenParams.f213365b.ordinal();
            if (iOrdinal == 0) {
                return new C43210w(num != null ? new SelectBusinessVrfInternalAction.OpenDeepLink(new ProfileCreateExtendedLink(new ProfileCreateExtendedLink.Flow.BusinessVrf(num.toString()), null, false), null, 2, null) : SelectBusinessVrfInternalAction.NoChoiceError.f213443b);
            }
            if (iOrdinal == 1) {
                return num != null ? new b(aVar.d(num.toString())) : new C43210w(SelectBusinessVrfInternalAction.NoChoiceError.f213443b);
            }
            if (iOrdinal == 2) {
                return num != null ? aVar.f(num.intValue()) : new C43210w(SelectBusinessVrfInternalAction.NoChoiceError.f213443b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (interfaceC40537a2.equals(InterfaceC40537a.f.f396292a)) {
            return aVar.b(selectBusinessVrfOpenParams.f213365b);
        }
        if (!(interfaceC40537a2 instanceof InterfaceC40537a.e)) {
            if (!(interfaceC40537a2 instanceof InterfaceC40537a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            List<PassportSelectBusinessListItem> list = cVar2.f396305g;
            ArrayList arrayList = new ArrayList();
            for (com.avito.conveyor_item.a aVarA : list) {
                if (aVarA instanceof PassportSelectBusinessItem) {
                    PassportSelectBusinessItem passportSelectBusinessItem = (PassportSelectBusinessItem) aVarA;
                    int i12 = passportSelectBusinessItem.f213501c;
                    Integer num2 = ((InterfaceC40537a.d) interfaceC40537a2).f396290a;
                    aVarA = PassportSelectBusinessItem.a(passportSelectBusinessItem, num2 != null && i12 == num2.intValue(), false, 19);
                } else if (!(aVarA instanceof PassportNotFoundSelectBusinessItem)) {
                    if (!(aVarA instanceof PassportNotChosenItem) && !(aVarA instanceof PassportSelectBusinessSingleReqItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarA = null;
                }
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
            return new C43210w(new SelectBusinessVrfInternalAction.ItemClick(arrayList, ((InterfaceC40537a.d) interfaceC40537a2).f396290a));
        }
        String str = ((InterfaceC40537a.e) interfaceC40537a2).f396291a;
        boolean zK2 = C43066x.K(str);
        List<K50.a> list2 = cVar2.f396306h;
        if (zK2) {
            listSingletonList = d.a(list2, num);
        } else {
            List listSingletonList2 = Collections.singletonList(new FontAttribute("boldAttr", str, Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD))));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (C43066x.q(C42745f0.O(((K50.a) obj).a(), null, null, null, null, 63), str, true)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                K50.a aVar2 = (K50.a) it.next();
                arrayList3.add(new PassportSelectBusinessItem(new AttributedText(C43066x.a0(C42745f0.O(aVar2.a(), null, null, null, null, 63), str, "{{boldAttr}}", false), listSingletonList2, 1), aVar2.getUserIdFrom(), num != null && aVar2.getUserIdFrom() == num.intValue(), false, String.valueOf(aVar2.getUserIdFrom())));
            }
            listSingletonList = arrayList3;
        }
        if (listSingletonList.isEmpty()) {
            listSingletonList = Collections.singletonList(new PassportNotFoundSelectBusinessItem(null, 1, null));
        }
        return new C43210w(new SelectBusinessVrfInternalAction.NewSearch(listSingletonList));
    }
}
