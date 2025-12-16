package com.avito.android.passport.profile_add.create_flow.select_vertical;

import com.avito.android.R;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.C32965c;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectVerticalItemsFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.a
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.l X50.e eVar, boolean z12, @Y61.k ProfileCreateExtendedFlow profileCreateExtendedFlow) {
        Integer numValueOf;
        int i12;
        boolean z13 = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Merge;
        int i13 = R.string.passport_add_profile_title;
        if (!z13) {
            if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Create) {
                i13 = R.string.passport_add_profile_new_title;
            } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.BusinessVrf) {
                i13 = R.string.passport_select_specific_business_vrf_title;
            } else if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.Upgrade ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile.BusinessRegistrationUpgrade)) {
                if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = R.string.passport_add_profile_verification_title;
            }
        }
        boolean z14 = profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.BusinessVrf;
        if (z14) {
            numValueOf = null;
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile) {
            numValueOf = Integer.valueOf(R.string.passport_add_profile_select_vertical_subtitle);
        } else {
            if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R.string.passport_add_profile_select_vertical_verification_subtitle);
        }
        if (z14) {
            i12 = R.string.passport_select_specific_business_vrf_description;
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport.Create) {
            i12 = R.string.passport_select_specific_profile_creation_description;
        } else {
            if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.passport_add_profile_select_vertical_limitation;
        }
        com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.k kVar = new com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.k(com.avito.android.printable_text.b.c(i13, new Serializable[0]), numValueOf != null ? com.avito.android.printable_text.b.c(numValueOf.intValue(), new Serializable[0]) : com.avito.android.printable_text.b.a(), com.avito.android.printable_text.b.c(i12, new Serializable[0]));
        List<X50.e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (X50.e eVar2 : list2) {
            arrayList.add(new u(eVar2, eVar != null && eVar2.f18590a == eVar.f18590a, z12 && !eVar2.f18595f, String.valueOf(eVar2.f18590a)));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(kVar);
        arrayList2.addAll(arrayList);
        if (z12) {
            arrayList2.add(C32965c.f212000b);
        }
        return arrayList2;
    }
}
