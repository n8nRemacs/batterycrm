package bM;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.server_time.f;
import com.squareup.anvil.annotations.ContributesBinding;
import hM.InterfaceC40849a;
import jM.InterfaceC42283a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import nJ.y;
import nJ.z;
import pM.InterfaceC46977a;

/* compiled from: IacProblemBannerInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbM/a;", "LjM/a;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: bM.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25526a implements InterfaceC42283a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC46977a f57041a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40849a f57042b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f57043c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f57044d;

    @Inject
    public C25526a(@k InterfaceC46977a interfaceC46977a, @k InterfaceC40849a interfaceC40849a, @k InterfaceC28373a interfaceC28373a, @k f fVar) {
        this.f57041a = interfaceC46977a;
        this.f57042b = interfaceC40849a;
        this.f57043c = interfaceC28373a;
        this.f57044d = fVar;
    }

    @Override // jM.InterfaceC42283a
    public final boolean a() {
        return this.f57042b.c(NotificationsSettings.Section.SECTION_MESSENGER) <= this.f57044d.now() && !this.f57041a.b().isEmpty();
    }

    @Override // jM.InterfaceC42283a
    public final void b(@k String str) {
        if (str.equals(NotificationsSettings.Section.SECTION_MESSENGER)) {
            this.f57043c.c(new y(str));
        }
    }

    @Override // jM.InterfaceC42283a
    public final void c() {
        this.f57043c.c(new z(NotificationsSettings.Section.SECTION_MESSENGER));
    }

    @Override // jM.InterfaceC42283a
    public final void d() {
        this.f57042b.e(TimeUnit.DAYS.toMillis(5L) + this.f57044d.now(), NotificationsSettings.Section.SECTION_MESSENGER);
    }
}
