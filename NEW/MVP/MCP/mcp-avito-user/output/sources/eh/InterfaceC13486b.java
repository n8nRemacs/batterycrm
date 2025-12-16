package Eh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LimitIncreaseOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LEh/b;", "", "a", "b", "c", "d", "LEh/b$a;", "LEh/b$b;", "LEh/b$c;", "LEh/b$d;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13486b {

    /* compiled from: LimitIncreaseOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/b$a;", "LEh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.b$a */
    public static final /* data */ class a implements InterfaceC13486b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f4170a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -203776966;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: LimitIncreaseOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEh/b$b;", "LEh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0247b implements InterfaceC13486b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0247b f4171a = new C0247b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0247b);
        }

        public final int hashCode() {
            return -1159656076;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: LimitIncreaseOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/b$c;", "LEh/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.b$c */
    public static final /* data */ class c implements InterfaceC13486b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4172a;

        public c(@k DeepLink deepLink) {
            this.f4172a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4172a, ((c) obj).f4172a);
        }

        public final int hashCode() {
            return this.f4172a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f4172a, ')');
        }
    }

    /* compiled from: LimitIncreaseOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEh/b$d;", "LEh/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eh.b$d */
    public static final /* data */ class d implements InterfaceC13486b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4173a;

        public d(@k String str) {
            this.f4173a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4173a, ((d) obj).f4173a);
        }

        public final int hashCode() {
            return this.f4173a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPostError(errorMessage="), this.f4173a, ')');
        }
    }
}
