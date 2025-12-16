package com.avito.android.imv_goods_advert.di;

import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import android.app.Application;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.C34161r;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.advertising.di.InterfaceC28344d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deep_linking.x;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import com.avito.android.permissions.z;
import com.avito.android.photo_gallery.F;
import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import lD.C43617a;
import lE.C43624b;
import ru.avito.messenger.MessengerApi;
import t3.InterfaceC48490v;
import ur.C49102c;

/* compiled from: ImvGoodsAdvertDependencies.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/di/e;", "Lcom/avito/android/di/h;", "Lcom/avito/android/advertising/di/d;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface e extends InterfaceC29971h, InterfaceC28344d {
    @Y61.k
    z A();

    @Y61.k
    C43617a C0();

    @Y61.k
    B2 D();

    @Y61.k
    F F0();

    @Y61.k
    C49102c G();

    @oD.k
    @Y61.k
    u3.l<AutoMediaMotoWaterTestGroup> G5();

    @Y61.k
    C43624b J();

    @Y61.k
    InterfaceC14024a L();

    @Y61.k
    com.avito.android.progress_info_toast_bar.interactor.g O3();

    @Y61.k
    C29640d Q();

    @Y61.k
    hJ.i Y();

    @Y61.k
    com.avito.android.advert_core.price_with_delivery.c Z2();

    @Y61.k
    InterfaceC28373a a();

    @Y61.k
    WL.a a1();

    @Y61.k
    InterfaceC28481c b();

    @Y61.k
    R0 c();

    @Y61.k
    C34161r c6();

    @Y61.k
    InterfaceC35745a5 d();

    @Y61.k
    l90.n e1();

    @Y61.k
    InterfaceC35845m2 h();

    @Y61.k
    E i();

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
    AK0.l r();

    @Y61.k
    @InterfaceC48490v
    u3.l<SimpleTestGroupWithNone> r6();

    @Y61.k
    Gson s();

    @Y61.k
    com.avito.android.progress_info_toast_bar.presenter.b s1();

    @Y61.k
    x t();

    @Y61.k
    com.avito.android.pinch_to_zoom.b t1();

    @Y61.k
    MessengerApi t5();

    @Y61.k
    com.avito.android.credits.installments.d v3();
}
