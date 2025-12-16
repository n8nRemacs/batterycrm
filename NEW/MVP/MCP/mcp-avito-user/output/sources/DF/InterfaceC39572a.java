package dF;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumContactHistoryAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LdF/a;", "", "a", "b", "c", "LdF/a$a;", "LdF/a$b;", "LdF/a$c;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39572a {

    /* compiled from: FreemiumContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdF/a$a;", "LdF/a;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dF.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11018a implements InterfaceC39572a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11018a f393753a = new C11018a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11018a);
        }

        public final int hashCode() {
            return 43734424;
        }

        @k
        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: FreemiumContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdF/a$b;", "LdF/a;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dF.a$b */
    public static final /* data */ class b implements InterfaceC39572a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f393754a;

        public b(@k DeepLink deepLink) {
            this.f393754a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f393754a, ((b) obj).f393754a);
        }

        public final int hashCode() {
            return this.f393754a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClick(deepLink="), this.f393754a, ')');
        }
    }

    /* compiled from: FreemiumContactHistoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdF/a$c;", "LdF/a;", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dF.a$c */
    public static final /* data */ class c implements InterfaceC39572a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f393755a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1084808189;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }
}
