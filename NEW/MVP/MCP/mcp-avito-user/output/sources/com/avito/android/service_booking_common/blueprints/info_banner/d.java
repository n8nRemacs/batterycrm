package com.avito.android.service_booking_common.blueprints.info_banner;

import android.content.Context;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import qt0.C47442f;

/* compiled from: SbInfoBannerPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/info_banner/d;", "Lcom/avito/android/service_booking_common/blueprints/info_banner/c;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        C47442f c47442f = (C47442f) aVar;
        I5.a((TextView) fVar.f276433d.getValue(), c47442f.f429439b, false);
        j.a((TextView) fVar.f276434e.getValue(), c47442f.f429440c, null);
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        String str = c47442f.f429441d;
        if (str == null) {
            str = "";
        }
        int iB2 = com.avito.android.lib.util.f.b(str);
        Context context = fVar.f276431b;
        int iJ2 = C35835l0.j(iB2, context);
        c5258a.getClass();
        com.avito.android.lib.design.banner.a aVarA = com.avito.android.lib.design.banner.a.a(a.C5258a.b(iJ2, context), null, null, null, y6.b(12), y6.b(20), y6.b(16), y6.b(16), false, 0.0f, true, true, 8191759);
        Banner banner = fVar.f276432c;
        banner.setStyle(aVarA);
        String str2 = null;
        banner.setState(new TU.a(str2, null, R.layout.service_booking_item_info_banner_content, 3, null));
    }
}
