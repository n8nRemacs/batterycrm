package com.avito.android.crm_paid_cvs.view.base;

import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.view.base.CrmPaidCvsFiltersFragment;
import ft.InterfaceC40476a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CrmPaidCvsFiltersFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/crm_paid_cvs/dto/OptionItem;", "selectedOptions", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<List<? extends OptionItem>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CrmPaidCvsFiltersFragment f130753l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FilterItem f130754m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment, FilterItem filterItem) {
        super(1);
        this.f130753l = crmPaidCvsFiltersFragment;
        this.f130754m = filterItem;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends OptionItem> list) {
        String str = this.f130754m.f130357b;
        CrmPaidCvsFiltersFragment.a aVar = CrmPaidCvsFiltersFragment.f130689t0;
        CrmPaidCvsFiltersFragment crmPaidCvsFiltersFragment = this.f130753l;
        crmPaidCvsFiltersFragment.q5().accept(new InterfaceC40476a.e(str, list));
        com.avito.android.crm_paid_cvs.view.dialogs.b bVar = crmPaidCvsFiltersFragment.f130695s0;
        if (bVar != null) {
            bVar.dismiss();
        }
        crmPaidCvsFiltersFragment.f130695s0 = null;
        return G0.f406611a;
    }
}
