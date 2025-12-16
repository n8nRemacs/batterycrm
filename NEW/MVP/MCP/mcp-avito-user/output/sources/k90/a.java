package K90;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LK90/a;", "", "a", "b", "c", "d", "LK90/a$a;", "LK90/a$b;", "LK90/a$c;", "LK90/a$d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ProfileRemoveAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/a$a;", "LK90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K90.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0556a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9282a;

        public C0556a(@k DeepLink deepLink) {
            this.f9282a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0556a) && L.f(this.f9282a, ((C0556a) obj).f9282a);
        }

        public final int hashCode() {
            return this.f9282a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkAction(deeplink="), this.f9282a, ')');
        }
    }

    /* compiled from: ProfileRemoveAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK90/a$b;", "LK90/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f9283a = new b();
    }

    /* compiled from: ProfileRemoveAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/a$c;", "LK90/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ProfileRemovalScreen f9284a;

        public c(@k ProfileRemovalScreen profileRemovalScreen) {
            this.f9284a = profileRemovalScreen;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9284a, ((c) obj).f9284a);
        }

        public final int hashCode() {
            return this.f9284a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(screen=" + this.f9284a + ')';
        }
    }

    /* compiled from: ProfileRemoveAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK90/a$d;", "LK90/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f9285a = new d();
    }
}
