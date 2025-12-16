package Q30;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: NotificationPermissionInfoAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LQ30/a;", "", "a", "b", "c", "d", "LQ30/a$a;", "LQ30/a$b;", "LQ30/a$c;", "LQ30/a$d;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: NotificationPermissionInfoAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ30/a$a;", "LQ30/a;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q30.a$a, reason: collision with other inner class name */
    public static final class C0883a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0883a f13441a = new C0883a();
    }

    /* compiled from: NotificationPermissionInfoAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ30/a$b;", "LQ30/a;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13442a = new b();
    }

    /* compiled from: NotificationPermissionInfoAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ30/a$c;", "LQ30/a;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13443a;

        public c(boolean z12) {
            this.f13443a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f13443a == ((c) obj).f13443a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13443a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PermissionGrantedResult(isGranted="), this.f13443a, ')');
        }
    }

    /* compiled from: NotificationPermissionInfoAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ30/a$d;", "LQ30/a;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13444a = new d();
    }
}
