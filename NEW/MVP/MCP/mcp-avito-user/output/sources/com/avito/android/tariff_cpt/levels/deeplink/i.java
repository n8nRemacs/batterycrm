package com.avito.android.tariff_cpt.levels.deeplink;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpt.TariffCptLevelsLinkV3;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_cpt.levels.TariffCptLevelsFragment;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: TariffCptLevelsDeeplinkHandlerV3.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/deeplink/i;", "Lev/a;", "Lcom/avito/android/cpt/TariffCptLevelsLinkV3;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends AbstractC40161a<TariffCptLevelsLinkV3> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f298558f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f298559g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298560h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f298561i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f298562j = "TariffCptLevelsDeeplinkHandler" + this.f395444b;

    /* compiled from: TariffCptLevelsDeeplinkHandlerV3.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Bundle bundle = ((C47919b) obj).f437159b;
            DeepLink deepLink = (DeepLink) (bundle == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("tariff_cpt_levels_deeplink_key", DeepLink.class) : bundle.getParcelable("tariff_cpt_levels_deeplink_key"));
            i iVar = i.this;
            if (deepLink == null) {
                iVar.j(TariffCptLevelsLinkV3.b.a.f126196b);
            } else {
                iVar.i(TariffCptLevelsLinkV3.b.C3750b.f126197b, iVar.f298560h, deepLink);
            }
        }
    }

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k a.f fVar) {
        this.f298558f = dVar;
        this.f298559g = fVar;
        this.f298560h = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        TariffCptLevelsFragment.a aVar = TariffCptLevelsFragment.f298504x0;
        String str2 = ((TariffCptLevelsLinkV3) deepLink).f126195b;
        aVar.getClass();
        this.f298558f.w1(TariffCptLevelsFragment.a.a(str2), this.f298562j);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f298561i.b(this.f298559g.l1(this.f298562j).t0(new a()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f298561i.e();
    }
}
