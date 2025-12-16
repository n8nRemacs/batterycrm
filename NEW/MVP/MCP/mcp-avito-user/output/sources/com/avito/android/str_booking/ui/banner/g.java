package com.avito.android.str_booking.ui.banner;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.str_booking.network.models.sections.BannerContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/banner/g;", "Lcom/avito/android/str_booking/ui/banner/d;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.str_booking.mvi.entity.a, G0> f285929b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public i f285930c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        this.f285929b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText description;
        List<Attribute> attributes;
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        this.f285930c = iVar;
        iVar.CW(cVar);
        BannerContent bannerContent = cVar.f285926b;
        if (bannerContent != null && (description = bannerContent.getDescription()) != null && (attributes = description.getAttributes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : attributes) {
                if (obj instanceof FontAttribute) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42745f0.h(((FontAttribute) it.next()).getParameters(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof FontParameter.ColorParameter) {
                    arrayList3.add(next);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                FontParameter.ColorParameter colorParameter = (FontParameter.ColorParameter) it3.next();
                iVar.pA(new UniversalColor(colorParameter.getColorKey(), colorParameter.getColorDark(), colorParameter.getColor()));
            }
        }
        iVar.Ru(bannerContent, new e(this));
        iVar.iQ(cVar, new f(this));
    }

    @Override // com.avito.android.str_booking.ui.banner.d
    public final void X7(boolean z12) {
        i iVar = this.f285930c;
        if (iVar != null) {
            iVar.X7(z12);
        }
    }
}
