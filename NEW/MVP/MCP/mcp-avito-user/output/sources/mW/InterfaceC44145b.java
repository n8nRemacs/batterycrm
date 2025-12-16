package mw;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lmw/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lmw/b$a;", "Lmw/b$b;", "Lmw/b$c;", "Lmw/b$d;", "Lmw/b$e;", "Lmw/b$f;", "Lmw/b$g;", "Lmw/b$h;", "Lmw/b$i;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mw.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44145b {

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmw/b$a;", "Lmw/b;", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$a */
    public static final class a implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414808a = new a();
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$b;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11849b implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414809a;

        public C11849b(@k DeepLink deepLink) {
            this.f414809a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11849b) && L.f(this.f414809a, ((C11849b) obj).f414809a);
        }

        public final int hashCode() {
            return this.f414809a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CloseWithAction(deeplink="), this.f414809a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$c;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$c */
    public static final /* data */ class c implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f414810a;

        public c(@l String str) {
            this.f414810a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f414810a, ((c) obj).f414810a);
        }

        public final int hashCode() {
            String str = this.f414810a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseWithToast(text="), this.f414810a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$d;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$d */
    public static final /* data */ class d implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414811a;

        public d(@k DeepLink deepLink) {
            this.f414811a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f414811a, ((d) obj).f414811a);
        }

        public final int hashCode() {
            return this.f414811a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeepLink(deepLink="), this.f414811a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$e;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$e */
    public static final /* data */ class e implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414812a;

        public e(@k String str) {
            this.f414812a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f414812a, ((e) obj).f414812a);
        }

        public final int hashCode() {
            return this.f414812a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RouteToPhoneVerification(phone="), this.f414812a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$f;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$f */
    public static final /* data */ class f implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f414813a;

        public f(@l String str) {
            this.f414813a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f414813a, ((f) obj).f414813a);
        }

        public final int hashCode() {
            String str = this.f414813a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowNameError(text="), this.f414813a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$g;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$g */
    public static final /* data */ class g implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f414814a;

        public g(@l String str) {
            this.f414814a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f414814a, ((g) obj).f414814a);
        }

        public final int hashCode() {
            String str = this.f414814a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPhoneError(text="), this.f414814a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$h;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$h */
    public static final /* data */ class h implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f414815a;

        public h(@l String str) {
            this.f414815a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f414815a, ((h) obj).f414815a);
        }

        public final int hashCode() {
            String str = this.f414815a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowQuestionError(text="), this.f414815a, ')');
        }
    }

    /* compiled from: DevelopmentsAdviceOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmw/b$i;", "Lmw/b;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.b$i */
    public static final /* data */ class i implements InterfaceC44145b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414816a;

        public i(@k String str) {
            this.f414816a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f414816a, ((i) obj).f414816a);
        }

        public final int hashCode() {
            return this.f414816a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRequestError(text="), this.f414816a, ')');
        }
    }
}
