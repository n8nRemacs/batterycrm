package com.avito.android.travel_seller_banners;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35787f0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelSellerBannersResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_seller_banners/i;", "", "<init>", "()V", "_avito_travel-seller-banners_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f303305a = new i();

    @l
    public static BF0.a a(@k AF0.a aVar) {
        Integer numA;
        Integer numA2;
        AF0.c bannner = aVar.getBannner();
        Color color = null;
        if (bannner == null) {
            return null;
        }
        String id2 = bannner.getId();
        String title = bannner.getTitle();
        AttributedText subtitle = bannner.getSubtitle();
        AF0.d image = bannner.getImage();
        f303305a.getClass();
        UniversalImage universalImage = new UniversalImage(image.getValue(), image.getValueDark());
        AF0.b backgroundColor = bannner.getBackgroundColor();
        String value = backgroundColor.getValue();
        Color color2 = (value == null || (numA2 = C35787f0.a(value)) == null) ? null : new Color(numA2.intValue());
        String valueDark = backgroundColor.getValueDark();
        if (valueDark != null && (numA = C35787f0.a(valueDark)) != null) {
            color = new Color(numA.intValue());
        }
        return new BF0.a(id2, title, subtitle, universalImage, new UniversalColor(backgroundColor.getValueName(), color, color2), bannner.getDeeplink());
    }
}
