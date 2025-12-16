package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.str_booking.network.models.sections.AttributedTextSection;
import com.avito.android.str_booking.network.models.sections.BannerSection;
import com.avito.android.str_booking.network.models.sections.ButtonsSection;
import com.avito.android.str_booking.network.models.sections.CalculationSection;
import com.avito.android.str_booking.network.models.sections.DetailsSection;
import com.avito.android.str_booking.network.models.sections.GallerySection;
import com.avito.android.str_booking.network.models.sections.InfoSection;
import com.avito.android.str_booking.network.models.sections.ItemInfoSection;
import com.avito.android.str_booking.network.models.sections.LocationSection;
import com.avito.android.str_booking.network.models.sections.PromoBannerSection;
import com.avito.android.str_booking.network.models.sections.ScreenTitleSection;
import com.avito.android.str_booking.network.models.sections.UserInfoSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/items_converter/p;", "Lcom/avito/android/str_booking/domain/items_converter/o;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_booking.domain.items_converter.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35076p implements InterfaceC35075o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f285638a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35065e f285639b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35080u f285640c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A f285641d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f285642e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final r f285643f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final D f285644g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35072l f285645h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final x f285646i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35061a f285647j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final J f285648k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35068h f285649l;

    @Inject
    public C35076p(@Y61.k M m12, @Y61.k InterfaceC35065e interfaceC35065e, @Y61.k InterfaceC35080u interfaceC35080u, @Y61.k A a12, @Y61.k T t12, @Y61.k r rVar, @Y61.k D d12, @Y61.k InterfaceC35072l interfaceC35072l, @Y61.k x xVar, @Y61.k InterfaceC35061a interfaceC35061a, @Y61.k J j12, @Y61.k InterfaceC35068h interfaceC35068h) {
        this.f285638a = m12;
        this.f285639b = interfaceC35065e;
        this.f285640c = interfaceC35080u;
        this.f285641d = a12;
        this.f285642e = t12;
        this.f285643f = rVar;
        this.f285644g = d12;
        this.f285645h = interfaceC35072l;
        this.f285646i = xVar;
        this.f285647j = interfaceC35061a;
        this.f285648k = j12;
        this.f285649l = interfaceC35068h;
    }

    @Override // com.avito.android.str_booking.domain.items_converter.InterfaceC35075o
    @Y61.k
    public final ArrayList a(@Y61.k List list, boolean z12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ux0.d dVar = (Ux0.d) it.next();
            com.avito.conveyor_item.a aVarA = dVar instanceof GallerySection ? this.f285640c.a((GallerySection) dVar) : dVar instanceof ScreenTitleSection ? this.f285638a.a((ScreenTitleSection) dVar) : dVar instanceof BannerSection ? this.f285639b.a((BannerSection) dVar) : dVar instanceof ButtonsSection ? this.f285649l.a((ButtonsSection) dVar) : dVar instanceof ItemInfoSection ? this.f285641d.a((ItemInfoSection) dVar) : dVar instanceof UserInfoSection ? this.f285642e.a((UserInfoSection) dVar, z12) : dVar instanceof DetailsSection ? this.f285643f.a((DetailsSection) dVar) : dVar instanceof LocationSection ? this.f285644g.a((LocationSection) dVar) : dVar instanceof CalculationSection ? this.f285645h.a((CalculationSection) dVar) : dVar instanceof InfoSection ? this.f285646i.a((InfoSection) dVar) : dVar instanceof AttributedTextSection ? this.f285647j.a((AttributedTextSection) dVar) : dVar instanceof PromoBannerSection ? this.f285648k.a((PromoBannerSection) dVar) : null;
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }
}
