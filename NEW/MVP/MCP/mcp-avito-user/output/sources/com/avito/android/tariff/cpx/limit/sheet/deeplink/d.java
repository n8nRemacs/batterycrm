package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.limit.sheet.TariffCpxLimitFragment;
import com.avito.android.tariff.cpx.limit.sheet.deeplink.TariffCpxLimitShowLink;
import com.avito.android.tariff.cpx.limit.sheet.domain.TariffCpxLimitContent;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import rv.C47919b;

/* compiled from: TariffCpxLimitShowHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/d;", "Lev/a;", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitShowLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC40161a<TariffCpxLimitShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f297267f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f297268g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f297269h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f297270i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: TariffCpxLimitShowHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("tariff_cpx_info_advance_key_deeplink", DeepLink.class) : bundle.getParcelable("tariff_cpx_info_advance_key_deeplink"));
            d dVar = d.this;
            if (deepLink == null) {
                dVar.j(TariffCpxLimitShowLink.b.a.f297264b);
            } else {
                dVar.i(TariffCpxLimitShowLink.b.C9066b.f297265b, dVar.f297269h, deepLink);
            }
        }
    }

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.d dVar, @k a.f fVar) {
        this.f297267f = dVar;
        this.f297268g = fVar;
        this.f297269h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TariffCpxLimitFragment.a aVar = TariffCpxLimitFragment.f297225w0;
        TariffCpxLimitContent tariffCpxLimitContent = new TariffCpxLimitContent(((TariffCpxLimitShowLink) deepLink).f297263b);
        aVar.getClass();
        TariffCpxLimitFragment tariffCpxLimitFragment = new TariffCpxLimitFragment();
        tariffCpxLimitFragment.f297232m0.setValue(tariffCpxLimitFragment, TariffCpxLimitFragment.f297226x0[0], tariffCpxLimitContent);
        this.f297267f.w1(tariffCpxLimitFragment, "TariffCpxInfoLimitShowDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f297270i.b(this.f297268g.l1("TariffCpxInfoLimitShowDeeplinkHandler_" + this.f395444b).t0(new a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f297270i.e();
    }
}
