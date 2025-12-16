package com.avito.android.job.cv_info_actualization.ui.items.chips;

import TP.a;
import Y41.l;
import Y61.k;
import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationChipsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/chips/e;", "LTV0/d;", "Lcom/avito/android/job/cv_info_actualization/ui/items/chips/h;", "Lcom/avito/android/job/cv_info_actualization/ui/items/chips/d;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<h, d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a.AbstractC1070a, G0> f174250b;

    @Inject
    public e(@k l<a.AbstractC1070a, G0> lVar) {
        this.f174250b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        d dVar = (d) aVar;
        String str = dVar.f174244c;
        Chips chips = hVar.f174255b;
        chips.setTitle(str);
        String str2 = dVar.f174245d;
        if (str2 == null) {
            str2 = "";
        }
        chips.setSubtitle(str2);
        chips.setSelectStrategy(dVar.f174248g);
        chips.setHint(dVar.f174247f);
        chips.j();
        List<a> list = dVar.f174246e;
        chips.setData(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((a) obj).f174238d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            chips.q((a) it.next(), true);
        }
        chips.setChipsSelectedListener(new g(hVar, dVar, this.f174250b));
    }
}
