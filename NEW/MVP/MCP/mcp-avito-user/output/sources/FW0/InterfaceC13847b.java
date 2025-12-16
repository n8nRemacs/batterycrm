package Fw0;

import Y61.k;
import Y61.l;
import com.avito.android.silent_update.permissions.SilentUpdatePermissions;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PermissionsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LFw0/b;", "", "a", "b", "c", "d", "LFw0/b$a;", "LFw0/b$b;", "LFw0/b$c;", "LFw0/b$d;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13847b {

    /* compiled from: PermissionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFw0/b$a;", "LFw0/b;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fw0.b$a */
    public static final /* data */ class a implements InterfaceC13847b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6034a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 270060423;
        }

        @k
        public final String toString() {
            return "RequestDozeModePermission";
        }
    }

    /* compiled from: PermissionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFw0/b$b;", "LFw0/b;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fw0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0309b implements InterfaceC13847b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0309b f6035a = new C0309b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0309b);
        }

        public final int hashCode() {
            return 47238347;
        }

        @k
        public final String toString() {
            return "RequestInstallPermission";
        }
    }

    /* compiled from: PermissionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFw0/b$c;", "LFw0/b;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fw0.b$c */
    public static final /* data */ class c implements InterfaceC13847b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6036a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 251417003;
        }

        @k
        public final String toString() {
            return "RequestStoragePermission";
        }
    }

    /* compiled from: PermissionsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFw0/b$d;", "LFw0/b;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fw0.b$d */
    public static final /* data */ class d implements InterfaceC13847b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SilentUpdatePermissions f6037a;

        public d(@k SilentUpdatePermissions silentUpdatePermissions) {
            this.f6037a = silentUpdatePermissions;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f6037a, ((d) obj).f6037a);
        }

        public final int hashCode() {
            return this.f6037a.hashCode();
        }

        @k
        public final String toString() {
            return "SendPermissionsResultAndFinish(permissions=" + this.f6037a + ')';
        }
    }
}
