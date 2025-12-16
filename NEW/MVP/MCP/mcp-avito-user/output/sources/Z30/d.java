package Z30;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.notifications_settings.deep_linking.ProfileNotificationsLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ProfileNotificationsDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LZ30/d;", "LKu/a;", "Lcom/avito/android/notifications_settings/deep_linking/ProfileNotificationsLink;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC14350a<ProfileNotificationsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ProfileNotificationsLink();
    }
}
