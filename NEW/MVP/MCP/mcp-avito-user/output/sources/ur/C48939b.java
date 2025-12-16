package uR;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lf_levels.LfLevelsFragment;
import com.avito.android.lf_levels.deeplink.LfLevelsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LfLevelsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LuR/b;", "Lev/a;", "Lcom/avito/android/lf_levels/deeplink/LfLevelsLink;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48939b extends AbstractC40161a<LfLevelsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f439963f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f439964g = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C48939b(@k a.d dVar) {
        this.f439963f = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LfLevelsFragment.a aVar = LfLevelsFragment.f175291w0;
        String str2 = ((LfLevelsLink) deepLink).f175328b;
        aVar.getClass();
        this.f439963f.w1(LfLevelsFragment.a.a(str2), "TariffLfLevelsDeeplinkHandler_" + this.f395444b);
        j(AbstractC14250d.c.f9171c);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f439964g.e();
    }
}
