package com.avito.android.crm_paid_cvs.view.base;

import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.a;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CrmPaidCvsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/dto/CvStatus;", "currentStatus", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_paid_cvs/dto/CvStatus;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class n extends N implements Y41.l<CvStatus, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CrmPaidCvsFragment f130777l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CvItem f130778m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CrmPaidCvsFragment crmPaidCvsFragment, CvItem cvItem) {
        super(1);
        this.f130777l = crmPaidCvsFragment;
        this.f130778m = cvItem;
    }

    @Override // Y41.l
    public final G0 invoke(CvStatus cvStatus) {
        CrmPaidCvsFragment.a aVar = CrmPaidCvsFragment.f130713C0;
        this.f130777l.r5().accept(new a.e(this.f130778m, cvStatus));
        return G0.f406611a;
    }
}
