package M30;

import Y61.k;
import com.avito.android.P;
import com.avito.android.notifications_permission.ab_test.config.NotificationPermissionInfoTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: NotificationPermissionDialogTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LM30/e;", "Lu3/d;", "Lcom/avito/android/notifications_permission/ab_test/config/NotificationPermissionInfoTestGroup;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC48780d<NotificationPermissionInfoTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P f10372a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f10373b = "notification_permission_info_dialog";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10374c = true;

    public e(@k P p12) {
        this.f10372a = p12;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF10374c() {
        return this.f10374c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF10373b() {
        return this.f10373b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return NotificationPermissionInfoTestGroup.f207821d;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return NotificationPermissionInfoTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return NotificationPermissionInfoTestGroup.f207820c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        P p12 = this.f10372a;
        p12.getClass();
        n<Object> nVar = P.f67370w0[72];
        return ((Boolean) p12.f67407f0.a().invoke()).booleanValue();
    }
}
