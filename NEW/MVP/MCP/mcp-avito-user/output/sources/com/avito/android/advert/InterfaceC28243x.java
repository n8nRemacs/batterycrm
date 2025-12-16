package com.avito.android.advert;

import android.os.Parcelable;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/x;", "Lcom/avito/android/advert/navbar/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28243x extends com.avito.android.advert.navbar.b {

    /* compiled from: AdvertDetailsToolbarPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.x$a */
    public static final class a {
    }

    void c0();

    @Y61.k
    Kundle d0();

    void e0();

    void j0(@Y61.k Z0 z02);

    void k0(@Y61.l Parcelable parcelable);

    void l0(@Y61.k InterfaceC31171n interfaceC31171n);

    void m0(@Y61.k d0 d0Var, @Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l AdvertNavBarStyle advertNavBarStyle);

    @Y61.k
    com.avito.android.advert.navbar.c n0(@Y61.k com.avito.konveyor.a aVar);

    void o0(boolean z12);

    void p0(@Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.k AdvertDetails advertDetails, @Y61.l String str, boolean z12);
}
