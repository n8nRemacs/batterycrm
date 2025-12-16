package com.avito.android.job.cv_info_actualization.ui.items.radio;

import TP.a;
import Y41.l;
import Y61.k;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.util.I5;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationRadioPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/radio/e;", "LTV0/d;", "Lcom/avito/android/job/cv_info_actualization/ui/items/radio/i;", "Lcom/avito/android/job/cv_info_actualization/ui/items/radio/c;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a.AbstractC1070a, G0> f174302b;

    @Inject
    public e(@k l<a.AbstractC1070a, G0> lVar) {
        this.f174302b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        I5.a(iVar.f174312b, cVar.f174293c, false);
        I5.a(iVar.f174313c, cVar.f174294d, false);
        Button button = iVar.f174314d;
        com.avito.android.lib.design.button.b.a(button, cVar.f174296f, false);
        LinearLayout linearLayout = iVar.f174315e;
        linearLayout.removeAllViews();
        Iterator<T> it = cVar.f174297g.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l<a.AbstractC1070a, G0> lVar = this.f174302b;
            if (!zHasNext) {
                button.setOnClickListener(new h(0, cVar, lVar));
                return;
            }
            d dVar = (d) it.next();
            ListItemRadio listItemRadio = new ListItemRadio(linearLayout.getContext(), null);
            listItemRadio.setRadioAppearance(R.style.Design_Widget_RadioButton_Re23);
            listItemRadio.setTitle(dVar.f174300b);
            listItemRadio.setChecked(dVar.f174301c);
            listItemRadio.setOnClickListener(new g(lVar, cVar, dVar, 0));
            linearLayout.addView(listItemRadio);
        }
    }
}
