package com.avito.android.passport.profile_add.merge.domain;

import Y61.l;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PassportAccountsMergeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/a;", "", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.passport.profile_add.merge.domain.a$a, reason: collision with other inner class name */
    public static final class C6373a {
    }

    @Y61.k
    C43152f0 a(@Y61.k MergeFlow mergeFlow);

    @Y61.k
    C43152f0 b(@Y61.k PassportSelectBusinessVrfLink.Flow flow);

    @Y61.k
    InterfaceC43160i<CodeConfirmInternalAction> c(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    C43152f0 d(@l String str);

    @Y61.k
    InterfaceC43160i<CheckMergePossibilityInternalAction> e();

    @Y61.k
    InterfaceC43160i<SelectBusinessVrfInternalAction> f(int i12);

    @Y61.k
    InterfaceC43160i<CodeRequestInternalAction> g(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<CodeRequestInternalAction> h();
}
