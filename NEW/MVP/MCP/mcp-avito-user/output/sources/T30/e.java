package T30;

import Y61.k;
import com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: NotificationPermissionMessengerDialogTestConfig.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LT30/e;", "Lu3/d;", "Lcom/avito/android/notifications_permission_messenger/ab_test/config/NotificationPermissionMessengerTestGroup;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends AbstractC48780d<NotificationPermissionMessengerTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final U30.a f15344a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f15345b = "notifications_enable_after_posting";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15346c = true;

    public e(@k U30.a aVar) {
        this.f15344a = aVar;
        Owners owners = Owners.f210476d;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF442140c() {
        return this.f15346c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF442139b() {
        return this.f15345b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        return NotificationPermissionMessengerTestGroup.f207903d;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return (NotificationPermissionMessengerTestGroup[]) ((AbstractC42734a) NotificationPermissionMessengerTestGroup.f207905f).toArray(new NotificationPermissionMessengerTestGroup[0]);
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return NotificationPermissionMessengerTestGroup.f207902c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        U30.a aVar = this.f15344a;
        aVar.getClass();
        n<Object> nVar = U30.a.f16148c[0];
        return ((Boolean) aVar.f16149b.a().invoke()).booleanValue();
    }
}
