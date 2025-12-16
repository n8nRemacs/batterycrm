package com.avito.android.job.cv_info_actualization.ui.items.error;

import TP.a;
import Y41.l;
import Y61.k;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsxCvInfoActualizationErrorPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/error/e;", "LTV0/d;", "Lcom/avito/android/job/cv_info_actualization/ui/items/error/g;", "Lcom/avito/android/job/cv_info_actualization/ui/items/error/c;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a.AbstractC1070a, G0> f174265b;

    @Inject
    public e(@k l<a.AbstractC1070a, G0> lVar) {
        this.f174265b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        TextView textView = gVar.f174269c;
        I5.a(textView, cVar.f174261c.k0(textView.getContext()), false);
        TextView textView2 = gVar.f174270d;
        I5.a(textView2, cVar.f174262d.k0(textView2.getContext()), false);
        ImageView imageView = gVar.f174268b;
        imageView.setImageResource(C35835l0.j(cVar.f174260b, imageView.getContext()));
        Button button = gVar.f174271e;
        com.avito.android.lib.design.button.b.a(button, cVar.f174263e.k0(button.getContext()), false);
        button.setOnClickListener(new ViewOnClickListenerC31042l(2, this.f174265b));
    }
}
