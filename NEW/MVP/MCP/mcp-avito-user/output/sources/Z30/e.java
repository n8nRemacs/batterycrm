package Z30;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.notifications_settings.deep_linking.ProfileNotificationsLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileNotificationsLinkSyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LZ30/e;", "Lev/b;", "Lcom/avito/android/notifications_settings/deep_linking/ProfileNotificationsLink;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC40162b<ProfileNotificationsLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y30.a f19848d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f19849e;

    @Inject
    public e(@k Y30.a aVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f19848d = aVar;
        this.f19849e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f19849e.R(this.f19848d.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
