package Db0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDb0/a;", "", "a", "b", "c", "d", "LDb0/a$a;", "LDb0/a$b;", "LDb0/a$c;", "LDb0/a$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Db0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13382a {

    /* compiled from: ProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDb0/a$a;", "LDb0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Db0.a$a, reason: collision with other inner class name */
    public static final class C0171a implements InterfaceC13382a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0171a f3253a = new C0171a();

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: ProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDb0/a$b;", "LDb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Db0.a$b */
    public static final /* data */ class b implements InterfaceC13382a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3254a;

        public b(@k DeepLink deepLink) {
            this.f3254a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3254a, ((b) obj).f3254a);
        }

        public final int hashCode() {
            return this.f3254a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f3254a, ')');
        }
    }

    /* compiled from: ProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDb0/a$c;", "LDb0/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Db0.a$c */
    public static final class c implements InterfaceC13382a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f3255a = new c();

        @k
        public final String toString() {
            return "ReloadData";
        }
    }

    /* compiled from: ProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDb0/a$d;", "LDb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Db0.a$d */
    public static final /* data */ class d implements InterfaceC13382a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3256a;

        public d(int i12) {
            this.f3256a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f3256a == ((d) obj).f3256a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3256a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("TabClicked(tabIndex="), this.f3256a, ')');
        }
    }
}
