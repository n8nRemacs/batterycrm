package MX;

import Y61.k;
import android.app.Activity;
import com.avito.android.bottom_navigation.A;
import com.avito.android.bottom_navigation.C;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.BxContentIntentFactory;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: MallRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMX/b;", "LMX/a;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Activity f10712a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BxContentIntentFactory f10713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f10714c;

    @Inject
    public b(@k Activity activity, @k BxContentIntentFactory bxContentIntentFactory, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f10712a = activity;
        this.f10713b = bxContentIntentFactory;
        this.f10714c = aVar;
    }

    @Override // MX.a
    public final void a(@k SearchParams searchParams) {
        this.f10712a.startActivity(this.f10713b.b(searchParams, (8355838 & 2) != 0 ? null : null, (8355838 & 8) != 0 ? null : null, (8355838 & 16) != 0 ? PresentationType.INSTANCE.defaultValue() : null, (8355838 & 64) != 0 ? null : null, (8355838 & 128) != 0 ? SerpSpaceType.Default : null, (8355838 & 256) != 0 ? false : false, (8355838 & 512) != 0 ? null : null, (8355838 & 1024) != 0 ? null : null, (8355838 & 2048) != 0 ? null : null, (8355838 & 4096) != 0 ? null : null, (8355838 & 8192) != 0 ? null : null, (8355838 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null, false, (65536 & 8355838) != 0 ? null : null, (131072 & 8355838) != 0 ? null : null, (262144 & 8355838) != 0 ? null : null, (524288 & 8355838) != 0 ? null : null, (1048576 & 8355838) != 0 ? null : null, (2097152 & 8355838) != 0 ? null : null, (8355838 & 4194304) != 0 ? NavigationScreenAction.f107100b : null));
    }

    @Override // MX.a
    public final void b() {
        A a12 = C.a(this.f10712a);
        if (a12 != null) {
            ((BottomNavigationFragment) a12).t5();
        }
    }

    @Override // MX.a
    public final void c(@k DeepLink deepLink) {
        b.a.a(this.f10714c, deepLink, null, null, 6);
    }
}
