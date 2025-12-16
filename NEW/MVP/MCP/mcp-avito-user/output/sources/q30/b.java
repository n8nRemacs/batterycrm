package Q30;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationPermissionInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LQ30/b;", "", "a", "b", "c", "LQ30/b$a;", "LQ30/b$b;", "LQ30/b$c;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationPermissionInfoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ30/b$a;", "LQ30/b;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13445a = new a();
    }

    /* compiled from: NotificationPermissionInfoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ30/b$b;", "LQ30/b;", "<init>", "()V", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q30.b$b, reason: collision with other inner class name */
    public static final class C0884b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0884b f13446a = new C0884b();
    }

    /* compiled from: NotificationPermissionInfoOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ30/b$c;", "LQ30/b;", "_avito_notifications-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13447a;

        public c(@k String str) {
            this.f13447a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13447a, ((c) obj).f13447a);
        }

        public final int hashCode() {
            return this.f13447a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RequestPermission(permission="), this.f13447a, ')');
        }
    }
}
