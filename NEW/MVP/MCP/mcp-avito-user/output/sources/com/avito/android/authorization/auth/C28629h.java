package com.avito.android.authorization.auth;

import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.profile_phones.add_phone.AddPhoneFragment;
import com.avito.android.profile_phones.confirm_phone.ConfirmPhoneFragment;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.authorization.auth.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28629h implements androidx.view.result.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f93022b;

    @Override // androidx.view.result.a
    public final void a(Object obj) {
        switch (this.f93022b) {
            case 0:
                break;
            case 1:
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                break;
            case 2:
                AddPhoneFragment.a aVar = AddPhoneFragment.f226797F0;
                break;
            case 3:
                ConfirmPhoneFragment.a aVar2 = ConfirmPhoneFragment.f226969E0;
                break;
            default:
                PhonesListFragment.a aVar3 = PhonesListFragment.f227380K0;
                break;
        }
    }
}
