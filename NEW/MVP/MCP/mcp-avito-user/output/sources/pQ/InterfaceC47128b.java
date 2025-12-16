package pq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rp.C47701d;

/* compiled from: SubmittingSelectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lpq/b;", "", "a", "b", "c", "d", "Lpq/b$a;", "Lpq/b$b;", "Lpq/b$c;", "Lpq/b$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC47128b {

    /* compiled from: SubmittingSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq/b$a;", "Lpq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq.b$a */
    public static final /* data */ class a implements InterfaceC47128b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f428787a;

        public a(boolean z12) {
            this.f428787a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f428787a == ((a) obj).f428787a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f428787a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavigateBack(withResult="), this.f428787a, ')');
        }
    }

    /* compiled from: SubmittingSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq/b$b;", "Lpq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12292b implements InterfaceC47128b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f428788a;

        public C12292b(@l DeepLink deepLink) {
            this.f428788a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12292b) && L.f(this.f428788a, ((C12292b) obj).f428788a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f428788a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NavigateNext(nextDeeplink="), this.f428788a, ')');
        }
    }

    /* compiled from: SubmittingSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq/b$c;", "Lpq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq.b$c */
    public static final /* data */ class c implements InterfaceC47128b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<C47701d> f428789a;

        public c(@k List<C47701d> list) {
            this.f428789a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428789a, ((c) obj).f428789a);
        }

        public final int hashCode() {
            return this.f428789a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OpenBottomSheet(items="), this.f428789a, ')');
        }
    }

    /* compiled from: SubmittingSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq/b$d;", "Lpq/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq.b$d */
    public static final /* data */ class d implements InterfaceC47128b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=null)";
        }
    }
}
