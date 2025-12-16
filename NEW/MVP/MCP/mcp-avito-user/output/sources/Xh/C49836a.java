package xH;

import Ju.AbstractC14250d;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.gig_motivations_list.GigMotivationsListDeeplink;
import com.avito.android.gig_motivations_list.ui.MotivationsListActivity;
import com.avito.android.gig_motivations_list.ui.MotivationsListOpenParams;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: GigMotivationsListDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LxH/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/gig_motivations_list/GigMotivationsListDeeplink;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49836a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<GigMotivationsListDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f442315g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f442316h;

    @Inject
    public C49836a(@k R0 r02, @k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        super(r02);
        this.f442315g = context;
        this.f442316h = interfaceC4053a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f442316h.R(new Intent(this.f442315g, (Class<?>) MotivationsListActivity.class).putExtra("open_params", new MotivationsListOpenParams()), com.avito.android.deeplink_handler.view.b.f134588l);
        j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
