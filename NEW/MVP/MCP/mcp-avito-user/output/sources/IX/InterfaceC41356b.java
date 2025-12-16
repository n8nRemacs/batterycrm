package iX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LiX/b;", "", "a", "b", "c", "d", "LiX/b$a;", "LiX/b$b;", "LiX/b$c;", "LiX/b$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC41356b {

    /* compiled from: CriteriaOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiX/b$a;", "LiX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.b$a */
    public static final /* data */ class a implements InterfaceC41356b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f398537a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1099807157;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LiX/b$b;", "LiX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11380b implements InterfaceC41356b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11380b f398538a = new C11380b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11380b);
        }

        public final int hashCode() {
            return 174869304;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: CriteriaOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiX/b$c;", "LiX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.b$c */
    public static final /* data */ class c implements InterfaceC41356b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f398539a;

        public c(@k DeepLink deepLink) {
            this.f398539a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398539a, ((c) obj).f398539a);
        }

        public final int hashCode() {
            return this.f398539a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f398539a, ')');
        }
    }

    /* compiled from: CriteriaOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiX/b$d;", "LiX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: iX.b$d */
    public static final /* data */ class d implements InterfaceC41356b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398540a;

        public d(@k String str) {
            this.f398540a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f398540a, ((d) obj).f398540a);
        }

        public final int hashCode() {
            return this.f398540a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f398540a, ')');
        }
    }
}
