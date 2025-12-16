package com.avito.android.crm_paid_cvs.view.list_items.inline_filters;

import Y41.l;
import Y61.k;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFilterPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/inline_filters/f;", "Lcom/avito/android/crm_paid_cvs/view/list_items/inline_filters/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<FilterItem, G0> f130919b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super FilterItem, G0> lVar) {
        this.f130919b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        String str;
        h hVar = (h) eVar;
        FilterItem filterItem = (FilterItem) aVar;
        List<OptionItem> list = filterItem.f130360e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((OptionItem) obj).f130371c) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        boolean z12 = true;
        String str2 = filterItem.f130359d;
        if (size <= 1) {
            if (filterItem.f130358c != FilterItem.FilterType.f130367h) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((OptionItem) next).f130371c) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                OptionItem optionItem = (OptionItem) next;
                if (optionItem != null && (str = optionItem.f130370b) != null) {
                    str2 = str;
                }
            }
        }
        hVar.setText(str2);
        hVar.X8();
        if ((list instanceof Collection) && list.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((OptionItem) it2.next()).f130371c) {
                    break;
                }
            }
            z12 = false;
        }
        hVar.setSelected(z12);
        hVar.A0(new e(this, filterItem));
    }
}
