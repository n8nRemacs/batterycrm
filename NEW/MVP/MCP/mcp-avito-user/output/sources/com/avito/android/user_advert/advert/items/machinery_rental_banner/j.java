package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.C35402c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MachineryRentalBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/j;", "Lcom/avito/android/user_advert/advert/items/machinery_rental_banner/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f309591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f309592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f309593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f309594e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.configure_info.items.feature.e f309595f = new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 10);

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309596g;

    @Inject
    public j(@Y61.k m mVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f309591b = mVar;
        this.f309592c = aVar;
        this.f309593d = aVar2;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((o) eVar, (e) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.f
    public final void S3(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309596g = myAdvertDetailsActivity;
    }

    @Override // com.avito.android.user_advert.advert.items.machinery_rental_banner.f
    public final void e() {
        this.f309596g = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        o oVar = (o) eVar;
        e eVar2 = (e) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof C35402c : true) {
                obj = next;
            }
        }
        C35402c c35402c = (C35402c) (obj instanceof C35402c ? obj : null);
        if (c35402c != null) {
            oVar.ck(c35402c.f309299a);
        } else {
            k(oVar, eVar2);
        }
    }

    public final void k(@Y61.k o oVar, @Y61.k e eVar) {
        CharSequence charSequenceC;
        MyAdvertDetails.MachineryRentalBanner machineryRentalBanner = eVar.f309584d;
        UniversalColor backgroundColor = machineryRentalBanner.getBackgroundColor();
        if (backgroundColor != null) {
            oVar.v(backgroundColor);
        }
        oVar.setTitle(machineryRentalBanner.getTitle());
        CharSequence charSequenceC2 = null;
        if (L.f(machineryRentalBanner.getCloseButton(), Boolean.TRUE)) {
            oVar.ha(new h(this, eVar));
        } else {
            oVar.ha(null);
        }
        MyAdvertDetails.MachineryRentalBanner.ProgressBar progress = machineryRentalBanner.getProgress();
        oVar.tO(progress != null);
        if (progress != null) {
            oVar.MA(this.f309591b.f309600a.getString(R.string.machinery_banner_progress_bar_counter, Integer.valueOf(progress.getCurrentStep()), Integer.valueOf(progress.getCountSteps())), progress.getCurrentStep() / progress.getCountSteps(), progress.getColor(), progress.getTintColor());
        }
        if (machineryRentalBanner.getDescription() != null || machineryRentalBanner.getFooter() != null) {
            oVar.t(new i(this));
        }
        AttributedText description = machineryRentalBanner.getDescription();
        ArrayList arrayList = this.f309594e;
        com.avito.android.tariff.cpa.configure_info.items.feature.e eVar2 = this.f309595f;
        if (description != null) {
            arrayList.add(description);
            description.setOnDeepLinkClickListener(eVar2);
        }
        Context context = oVar.getContext();
        AttributedText description2 = machineryRentalBanner.getDescription();
        com.avito.android.util.text.a aVar = this.f309592c;
        if (description2 == null) {
            charSequenceC = null;
        } else {
            try {
                charSequenceC = aVar.c(context, description2);
            } catch (Exception unused) {
            }
        }
        oVar.r5(charSequenceC);
        MyAdvertDetails.MachineryRentalBanner.ActionButton actionButton = machineryRentalBanner.getActionButton();
        if (actionButton != null) {
            oVar.W00(new g(this, eVar), actionButton.getTitle(), actionButton.getStyle());
            oVar.ck(eVar.f309585e);
        } else {
            oVar.i70();
        }
        AttributedText footer = machineryRentalBanner.getFooter();
        if (footer != null) {
            arrayList.add(footer);
            footer.setOnDeepLinkClickListener(eVar2);
        }
        Context context2 = oVar.getContext();
        AttributedText footer2 = machineryRentalBanner.getFooter();
        if (footer2 != null) {
            try {
                charSequenceC2 = aVar.c(context2, footer2);
            } catch (Exception unused2) {
            }
        }
        oVar.Qe(charSequenceC2);
    }
}
