package kX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LkX/b;", "", "a", "b", "c", "d", "LkX/b$a;", "LkX/b$b;", "LkX/b$c;", "LkX/b$d;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC42641b {

    /* compiled from: CriteriaGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/b$a;", "LkX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.b$a */
    public static final /* data */ class a implements InterfaceC42641b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f406364a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1196315150;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: CriteriaGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkX/b$b;", "LkX/b;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11619b implements InterfaceC42641b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11619b f406365a = new C11619b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11619b);
        }

        public final int hashCode() {
            return 1919968543;
        }

        @k
        public final String toString() {
            return "NavigateToMain";
        }
    }

    /* compiled from: CriteriaGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/b$c;", "LkX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.b$c */
    public static final /* data */ class c implements InterfaceC42641b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f406366a;

        public c(@k DeepLink deepLink) {
            this.f406366a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f406366a, ((c) obj).f406366a);
        }

        public final int hashCode() {
            return this.f406366a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f406366a, ')');
        }
    }

    /* compiled from: CriteriaGrayOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LkX/b$d;", "LkX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kX.b$d */
    public static final /* data */ class d implements InterfaceC42641b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406367a;

        public d(@k String str) {
            this.f406367a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f406367a, ((d) obj).f406367a);
        }

        public final int hashCode() {
            return this.f406367a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f406367a, ')');
        }
    }
}
