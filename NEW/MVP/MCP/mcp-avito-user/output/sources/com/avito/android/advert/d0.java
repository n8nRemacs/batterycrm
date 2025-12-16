package com.avito.android.advert;

import android.view.View;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AdvertNavBarStyle;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import j.InterfaceC42150f;
import j.InterfaceC42158n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/d0;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d0 {

    /* compiled from: AdvertDetailsToolbarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ac(@Y61.k InterfaceC31171n interfaceC31171n, boolean z12);

    void Bc(float f12);

    void Cc(@InterfaceC42150f int i12, @InterfaceC42150f int i13);

    void Dc(boolean z12);

    void Ec(@Y61.l Long l12);

    void Fc();

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Gc();

    void Hc(@InterfaceC42150f int i12, @InterfaceC42150f int i13, @InterfaceC42158n int i14, boolean z12);

    void Ic(boolean z12);

    void Jc(@Y61.k UniversalColor universalColor, @Y61.k AdvertNavBarStyle.ThemeAppearance themeAppearance, @Y61.l String str, boolean z12);

    void Kc(@Y61.l UniversalImage universalImage, @Y61.k Y41.a<G0> aVar);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Lc();

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Mc();

    void Nc(@Y61.k AdvertDetailsStyle advertDetailsStyle, @Y61.l AdvertNavBarStyle advertNavBarStyle, boolean z12);

    void Oc(@Y61.k Throwable th2);

    void Pc(boolean z12, boolean z13);

    void Qc(@Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Rc();

    @Y61.k
    io.reactivex.rxjava3.core.z<View> Sc();

    boolean Tc();

    void Uc(@j.e0 int i12);

    void Vc(@Y61.k PrintableText printableText, @Y61.k Throwable th2);

    void Wc(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> Xc();

    void Yc(@Y61.k Y41.a aVar, @Y61.k String str, @Y61.k String str2);

    void Zc();

    void ad(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2, @Y61.k Y41.a<G0> aVar);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> bd();

    void cd();

    @Y61.k
    NavBar getView();

    void setFavorite(boolean z12);

    void wc(@Y61.k String str);

    void xc(boolean z12);

    void yc(@Y61.l com.avito.android.advert.navbar.e eVar);

    void zc(boolean z12);
}
