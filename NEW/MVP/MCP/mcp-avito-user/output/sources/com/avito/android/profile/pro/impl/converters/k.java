package com.avito.android.profile.pro.impl.converters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.pro.impl.interactor.model.ProfileTabWidget;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import com.avito.conveyor_item.ParcelableItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ProfileProGeoBannerItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/converters/k;", "Lcom/avito/android/profile/pro/impl/converters/j;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements InterfaceC33355j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E90.a f222456a;

    @Inject
    public k(@Y61.k E90.a aVar) {
        this.f222456a = aVar;
    }

    @Override // com.avito.android.profile.pro.impl.converters.InterfaceC33355j
    @Y61.k
    public final List<ParcelableItem> a(@Y61.k ProfileTabWidget.f fVar) {
        DeepLink deepLink;
        if (this.f222456a.a(fVar.f222787b)) {
            return C42784z0.f406748b;
        }
        PrintableText printableTextF = com.avito.android.printable_text.b.f(fVar.f222788c);
        PrintableText printableTextF2 = com.avito.android.printable_text.b.f(fVar.f222789d);
        ProfileTabWidget.f.a aVar = fVar.f222791f;
        return Collections.singletonList(new ProfileProGeoBannerItem(fVar.f222787b, printableTextF, printableTextF2, fVar.f222790e, (aVar == null || (deepLink = aVar.f222794a) == null) ? null : new ProfileProGeoBannerItem.Action(deepLink, com.avito.android.printable_text.b.f(aVar.f222795b)), fVar.f222792g, fVar.f222793h));
    }
}
