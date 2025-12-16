package rK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.core.app.E;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import com.avito.android.notification.p;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SetupCallNotificationChannelTask.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrK/a;", "Lcom/avito/android/notification/p;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47556a implements p {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<IacNotificationChannelManager> f429752a;

    @Inject
    public C47556a(@k e<IacNotificationChannelManager> eVar) {
        this.f429752a = eVar;
    }

    @Override // com.avito.android.notification.p
    public final void a(@k E e12) {
        this.f429752a.get().a(e12);
    }
}
