package com.avito.android.crm_paid_cvs.view.base;

import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.a;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CrmPaidCvsFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "selected", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<List<? extends OptionItem>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CrmPaidCvsFragment f130755l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FilterItem f130756m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CrmPaidCvsFragment crmPaidCvsFragment, FilterItem filterItem) {
        super(1);
        this.f130755l = crmPaidCvsFragment;
        this.f130756m = filterItem;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends OptionItem> list) {
        String str = this.f130756m.f130357b;
        CrmPaidCvsFragment.a aVar = CrmPaidCvsFragment.f130713C0;
        CrmPaidCvsFragment crmPaidCvsFragment = this.f130755l;
        crmPaidCvsFragment.r5().accept(new a.b(str, list));
        crmPaidCvsFragment.r5().accept(a.l.f130531a);
        com.avito.android.crm_paid_cvs.view.dialogs.b bVar = crmPaidCvsFragment.f130714A0;
        if (bVar != null) {
            bVar.dismiss();
        }
        crmPaidCvsFragment.f130714A0 = null;
        return G0.f406611a;
    }
}
