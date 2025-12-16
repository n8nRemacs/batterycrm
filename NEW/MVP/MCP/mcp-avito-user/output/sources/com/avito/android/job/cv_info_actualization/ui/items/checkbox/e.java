package com.avito.android.job.cv_info_actualization.ui.items.checkbox;

import TP.a;
import Y41.l;
import Y61.k;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import zC0.ViewOnClickListenerC50436a;

/* compiled from: JsxCvInfoActualizationCheckboxPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/e;", "LTV0/d;", "Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/g;", "Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/c;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a.AbstractC1070a, G0> f174230b;

    @Inject
    public e(@k l<a.AbstractC1070a, G0> lVar) {
        this.f174230b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        I5.a(gVar.f174233b, cVar.f174223c, false);
        I5.a(gVar.f174234c, cVar.f174224d, false);
        LinearLayout linearLayout = gVar.f174235d;
        linearLayout.removeAllViews();
        for (d dVar : cVar.f174225e) {
            ListItemCheckbox listItemCheckbox = new ListItemCheckbox(linearLayout.getContext(), null);
            listItemCheckbox.setTitle(dVar.f174228b);
            listItemCheckbox.setChecked(dVar.f174229c);
            listItemCheckbox.setCheckboxStyle(R.style.Design_Widget_Checkbox_Re23);
            listItemCheckbox.setOnClickListener(new ViewOnClickListenerC50436a(this.f174230b, cVar, dVar, 1));
            linearLayout.addView(listItemCheckbox);
        }
    }
}
