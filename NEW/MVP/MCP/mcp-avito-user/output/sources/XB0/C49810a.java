package xB0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuDialogFragment;
import com.avito.android.tariff.cpx.info.sf.menu.deeplink.TariffCpxInfoSfMenuLink;
import com.avito.android.tariff.cpx.info.sf.menu.domain.TariffCpxInfoSfMenuContent;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoSfMenuDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LxB0/a;", "Lev/b;", "Lcom/avito/android/tariff/cpx/info/sf/menu/deeplink/TariffCpxInfoSfMenuLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49810a extends AbstractC40162b<TariffCpxInfoSfMenuLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f442294d;

    @Inject
    public C49810a(@k a.d dVar) {
        this.f442294d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TariffCpxInfoSfMenuDialogFragment.a aVar = TariffCpxInfoSfMenuDialogFragment.f296742o0;
        TariffCpxInfoSfMenuContent tariffCpxInfoSfMenuContent = new TariffCpxInfoSfMenuContent(((TariffCpxInfoSfMenuLink) deepLink).f296774b);
        aVar.getClass();
        TariffCpxInfoSfMenuDialogFragment tariffCpxInfoSfMenuDialogFragment = new TariffCpxInfoSfMenuDialogFragment();
        tariffCpxInfoSfMenuDialogFragment.f296750n0.setValue(tariffCpxInfoSfMenuDialogFragment, TariffCpxInfoSfMenuDialogFragment.f296743p0[0], tariffCpxInfoSfMenuContent);
        this.f442294d.w1(tariffCpxInfoSfMenuDialogFragment, "TariffCpxInfoSfMenuDialogFragment");
        return AbstractC14250d.c.f9171c;
    }
}
