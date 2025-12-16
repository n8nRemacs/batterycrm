package com.avito.android.crm_paid_cvs.view.list_items.list_option;

import Y41.l;
import Y61.k;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ListOptionPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/list_option/h;", "Lcom/avito/android/crm_paid_cvs/view/list_items/list_option/f;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<OptionItem, G0> f130935b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@k l<? super OptionItem, G0> lVar) {
        this.f130935b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        OptionItem optionItem = (OptionItem) aVar;
        aVar2.setTitle(optionItem.f130370b);
        aVar2.Md(optionItem.f130371c, optionItem.f130372d);
        aVar2.A0(new g(this, optionItem));
    }
}
