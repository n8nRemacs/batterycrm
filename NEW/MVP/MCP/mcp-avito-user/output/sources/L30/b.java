package L30;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.notifications_permission.presentation.NotificationPermissionInfoDialogActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationPermissionInfoScreenIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LL30/b;", "LL30/a;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f9768a;

    @Inject
    public b(@k Context context) {
        this.f9768a = context;
    }

    @Override // L30.a
    @k
    public final Intent a() {
        return new Intent(this.f9768a, (Class<?>) NotificationPermissionInfoDialogActivity.class);
    }
}
