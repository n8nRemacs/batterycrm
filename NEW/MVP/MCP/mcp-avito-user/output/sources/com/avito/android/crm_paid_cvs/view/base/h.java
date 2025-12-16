package com.avito.android.crm_paid_cvs.view.base;

import android.os.Bundle;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.a;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFragment;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CrmPaidCvsFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CrmPaidCvsFragment f130765l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CrmPaidCvsFragment crmPaidCvsFragment) {
        super(2);
        this.f130765l = crmPaidCvsFragment;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (str.equals("FILTER_RESULT")) {
            CrmPaidCvsFragment crmPaidCvsFragment = this.f130765l;
            crmPaidCvsFragment.getParentFragmentManager().g("FILTER_RESULT");
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("FILTER_ARG");
            if (parcelableArrayList != null) {
                CrmPaidCvsFragment.a aVar = CrmPaidCvsFragment.f130713C0;
                crmPaidCvsFragment.r5().accept(new a.C3878a(parcelableArrayList));
                CrmPaidCvsFragment.q5(crmPaidCvsFragment);
            }
        }
        return G0.f406611a;
    }
}
