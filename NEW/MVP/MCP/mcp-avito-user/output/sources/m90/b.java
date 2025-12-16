package M90;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveItemsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LM90/b;", "", "a", "b", "c", "LM90/b$a;", "LM90/b$b;", "LM90/b$c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ProfileRemoveItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM90/b$a;", "LM90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f10423a;

        public a(@k DeepLink deepLink) {
            this.f10423a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10423a, ((a) obj).f10423a);
        }

        public final int hashCode() {
            return this.f10423a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f10423a, ')');
        }
    }

    /* compiled from: ProfileRemoveItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LM90/b$b;", "LM90/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: M90.b$b, reason: collision with other inner class name */
    public static final class C0661b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0661b f10424a = new C0661b();
    }

    /* compiled from: ProfileRemoveItemsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LM90/b$c;", "LM90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ProfileRemovalScreen f10425a;

        public c(@k ProfileRemovalScreen profileRemovalScreen) {
            this.f10425a = profileRemovalScreen;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f10425a, ((c) obj).f10425a);
        }

        public final int hashCode() {
            return this.f10425a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(screen=" + this.f10425a + ')';
        }
    }
}
