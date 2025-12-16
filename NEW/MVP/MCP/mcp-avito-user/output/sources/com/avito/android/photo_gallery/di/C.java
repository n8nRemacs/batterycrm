package com.avito.android.photo_gallery.di;

import Id.InterfaceC14060a;
import Uq.InterfaceC15558a;
import Zd.InterfaceC19542a;
import android.app.Application;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import java.util.Locale;
import kotlin.Metadata;
import lD.C43617a;
import ru.avito.messenger.MessengerApi;
import ur.C49102c;

/* compiled from: PhotoGalleryDependencies.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/di/C;", "Lcom/avito/android/di/h;", "Lcom/avito/android/advertising/di/d;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface C extends InterfaceC29971h, InterfaceC28344d {
    @Y61.k
    com.avito.android.permissions.z A();

    @Y61.k
    com.avito.android.deal_confirmation.sheet.k A3();

    @Y61.k
    C43617a C0();

    @Y61.k
    B2 D();

    @Y61.k
    C49102c G();

    @Y61.k
    com.avito.android.autoteka.data.b G6();

    @Y61.k
    MessengerApi K3();

    @Y61.k
    com.avito.android.player.router.a Nj();

    @Y61.k
    com.avito.android.progress_info_toast_bar.interactor.g O3();

    @Y61.k
    com.avito.android.favorite.l P0();

    @Y61.k
    C29640d Q();

    @Y61.k
    com.avito.android.autoteka.data.a T1();

    @Y61.k
    InterfaceC15558a U1();

    @Y61.k
    com.avito.android.permissions.u V();

    @Y61.k
    com.avito.android.analytics.provider.e Z0();

    @Y61.k
    com.avito.android.advert_core.price_with_delivery.c Z2();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    WL.a a1();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    SharedPhotosStorage b2();

    @Y61.k
    R0 c();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    l90.n e1();

    @Y61.k
    f90.n e2();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    E i();

    @Y61.k
    com.avito.android.util.C j();

    @Y61.k
    Application k();

    @Y61.k
    InterfaceC14060a k1();

    @Y61.k
    InterfaceC34398y l2();

    @Y61.k
    Locale locale();

    @Y61.k
    InterfaceC35741a1 n();

    @Y61.k
    SK0.b p();

    @Y61.k
    com.avito.android.progress_info_toast_bar.presenter.b s1();

    @Y61.k
    com.avito.android.player.router.e s4();

    @Y61.k
    com.avito.android.deep_linking.x t();

    @Y61.k
    com.avito.android.credits.installments.d v3();

    @Y61.k
    InterfaceC19542a x();
}
