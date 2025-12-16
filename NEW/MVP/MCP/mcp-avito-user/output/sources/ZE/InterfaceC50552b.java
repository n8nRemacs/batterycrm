package ze;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackagesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lze/b;", "", "a", "b", "Lze/b$a;", "Lze/b$b;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC50552b {

    /* compiled from: AutoContactsPackagesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze/b$a;", "Lze/b;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze.b$a */
    public static final /* data */ class a implements InterfaceC50552b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f444107a;

        public a(@k DeepLink deepLink) {
            this.f444107a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f444107a, ((a) obj).f444107a);
        }

        public final int hashCode() {
            return this.f444107a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeepLink(deepLink="), this.f444107a, ')');
        }
    }

    /* compiled from: AutoContactsPackagesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze/b$b;", "Lze/b;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze.b$b, reason: collision with other inner class name */
    public static final class C12960b implements InterfaceC50552b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12960b f444108a = new C12960b();
    }
}
