package com.avito.android.tariff.cpx.info.advance.deeplink;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment;
import com.avito.android.tariff.deeplink.TariffCpxInfoAdvanceShowLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: TariffCpxInfoAdvanceShowDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/advance/deeplink/e;", "Lev/a;", "Lcom/avito/android/tariff/deeplink/TariffCpxInfoAdvanceShowLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40161a<TariffCpxInfoAdvanceShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f296303f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f296304g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f296305h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f296306i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: TariffCpxInfoAdvanceShowDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("tariff_cpx_info_advance_key_deeplink", DeepLink.class) : bundle.getParcelable("tariff_cpx_info_advance_key_deeplink"));
            e eVar = e.this;
            if (deepLink == null) {
                eVar.j(TariffCpxInfoAdvanceShowLink.b.a.f297383b);
            } else {
                eVar.i(TariffCpxInfoAdvanceShowLink.b.C9078b.f297384b, eVar.f296305h, deepLink);
            }
        }
    }

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.d dVar, @k a.f fVar) {
        this.f296303f = dVar;
        this.f296304g = fVar;
        this.f296305h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TariffCpxInfoAdvanceDialogFragment.f296263n0.getClass();
        TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment = new TariffCpxInfoAdvanceDialogFragment();
        tariffCpxInfoAdvanceDialogFragment.setArguments(C22777e.b(new Q("tariff_cpx_info_advance_key_content", ((TariffCpxInfoAdvanceShowLink) deepLink).f297382b)));
        this.f296303f.w1(tariffCpxInfoAdvanceDialogFragment, "TariffCpxInfoAdvanceShowDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f296306i.b(this.f296304g.l1("TariffCpxInfoAdvanceShowDeeplinkHandler_" + this.f395444b).t0(new a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f296306i.e();
    }
}
