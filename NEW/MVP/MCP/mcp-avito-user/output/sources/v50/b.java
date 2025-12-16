package V50;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SetProfileNameOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LV50/b;", "", "a", "b", "c", "LV50/b$a;", "LV50/b$b;", "LV50/b$c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV50/b$a;", "LV50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16917a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f16918b;

        public a(@k DeepLink deepLink, @k String str) {
            this.f16917a = deepLink;
            this.f16918b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16917a, aVar.f16917a) && L.f(this.f16918b, aVar.f16918b);
        }

        public final int hashCode() {
            return this.f16918b.hashCode() + (this.f16917a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f16917a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f16918b, ')');
        }
    }

    /* compiled from: SetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV50/b$b;", "LV50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: V50.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1164b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Navigation f16919a;

        public C1164b(@k Navigation navigation2) {
            this.f16919a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1164b) && L.f(this.f16919a, ((C1164b) obj).f16919a);
        }

        public final int hashCode() {
            return this.f16919a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(navigation=" + this.f16919a + ')';
        }
    }

    /* compiled from: SetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV50/b$c;", "LV50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f16920a;

        public c(@k Throwable th2) {
            this.f16920a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16920a, ((c) obj).f16920a);
        }

        public final int hashCode() {
            return this.f16920a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f16920a, ')');
        }
    }
}
