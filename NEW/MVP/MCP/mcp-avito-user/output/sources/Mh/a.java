package MH;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_tutorials.GigTutorialsDeeplink;
import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import com.avito.android.gig_tutorials.gigtutorials.f;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GigTutorialsDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LMH/a;", "Lev/a;", "Lcom/avito/android/gig_tutorials/GigTutorialsDeeplink;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40161a<GigTutorialsDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f10536f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f10537g;

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k f fVar) {
        this.f10536f = interfaceC4053a;
        this.f10537g = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f10536f.R(this.f10537g.a(new GigTutorialsOpenParams(((GigTutorialsDeeplink) deepLink).f161098b)), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
    }
}
