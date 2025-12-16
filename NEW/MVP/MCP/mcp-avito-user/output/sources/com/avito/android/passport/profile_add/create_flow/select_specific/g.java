package com.avito.android.passport.profile_add.create_flow.select_specific;

import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C32961c;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectSpecificItemsFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/g;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/f;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {
    @Inject
    public g() {
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.f
    @k
    public final ArrayList a(@k List list, @l Integer num, boolean z12, @k ProfileCreateExtendedFlow profileCreateExtendedFlow) {
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
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile) {
            i12 = R.string.passport_add_profile_select_specific_subtitle;
        } else {
            if (!(profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.passport_add_profile_select_specific_verification_subtitle;
        }
        com.avito.android.passport.profile_add.create_flow.select_specific.recycler.k kVar = new com.avito.android.passport.profile_add.create_flow.select_specific.recycler.k(com.avito.android.printable_text.b.c(i13, new Serializable[0]), com.avito.android.printable_text.b.c(i12, new Serializable[0]));
        List<SpecificVo> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (SpecificVo specificVo : list2) {
            arrayList.add(new u(specificVo, num != null && specificVo.f211653b == num.intValue(), z12, String.valueOf(specificVo.f211653b)));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(kVar);
        arrayList2.addAll(arrayList);
        if (z12) {
            arrayList2.add(C32961c.f211777b);
        }
        return arrayList2;
    }
}
