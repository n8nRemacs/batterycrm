package c40;

import Y61.k;
import Y61.l;
import com.avito.android.notifications_settings.toggle.NotificationsSettingsToggleItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lc40/a;", "", "a", "b", "c", "Lc40/a$a;", "Lc40/a$b;", "Lc40/a$c;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26936a {

    /* compiled from: NotificationsSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc40/a$a;", "Lc40/a;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c40.a$a, reason: collision with other inner class name */
    public static final class C2028a implements InterfaceC26936a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C2028a f57631a = new C2028a();
    }

    /* compiled from: NotificationsSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc40/a$b;", "Lc40/a;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c40.a$b */
    public static final class b implements InterfaceC26936a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f57632a = new b();
    }

    /* compiled from: NotificationsSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc40/a$c;", "Lc40/a;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c40.a$c */
    public static final /* data */ class c implements InterfaceC26936a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NotificationsSettingsToggleItem f57633a;

        public c(@k NotificationsSettingsToggleItem notificationsSettingsToggleItem) {
            this.f57633a = notificationsSettingsToggleItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f57633a, ((c) obj).f57633a);
        }

        public final int hashCode() {
            return this.f57633a.hashCode();
        }

        @k
        public final String toString() {
            return "ToggleChange(notificationsSettingsToggleItem=" + this.f57633a + ')';
        }
    }
}
