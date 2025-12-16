package com.avito.android.profile_phones.add_phone;

import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AddPhoneInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/n;", "Lcom/avito/android/profile_phones/validation/d;", "Lcom/avito/android/profile_phones/validation/a;", "Lcom/avito/android/code_confirmation/code_confirmation/phone_confirm/b;", "Lcom/avito/android/profile_phones/add_phone/raw_phones_list/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface n extends com.avito.android.profile_phones.validation.d, com.avito.android.profile_phones.validation.a, com.avito.android.code_confirmation.code_confirmation.phone_confirm.b, com.avito.android.profile_phones.add_phone.raw_phones_list.a {
    @Y61.k
    InterfaceC43160i c(@Y61.l LandlinePhoneVerificationViewModel.ResultStatus resultStatus, @Y61.l String str, @Y61.k String str2);

    @Y61.l
    Object d(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);
}
