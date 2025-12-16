package Y30;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.notifications_settings.screen.NotificationsSettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationSettingsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY30/b;", "LY30/a;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f19291a;

    @Inject
    public b(@k Context context) {
        this.f19291a = context;
    }

    @Override // Y30.a
    @k
    public final Intent a() {
        return new Intent(this.f19291a, (Class<?>) NotificationsSettingsActivity.class);
    }
}
