package BA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LBA0/c;", "", "a", "b", "c", "d", "e", "LBA0/c$a;", "LBA0/c$b;", "LBA0/c$c;", "LBA0/c$d;", "LBA0/c$e;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/c$a;", "LBA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1224a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1178767962;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/c$b;", "LBA0/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f1225a;

        public b(@k ArrayList arrayList) {
            this.f1225a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1225a.equals(((b) obj).f1225a);
        }

        public final int hashCode() {
            return this.f1225a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("OpenVideoPicker(mimeTypes="), this.f1225a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/c$c;", "LBA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BA0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0044c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0044c f1226a = new C0044c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0044c);
        }

        public final int hashCode() {
            return -1633627055;
        }

        @k
        public final String toString() {
            return "ScrollToBottom";
        }
    }

    /* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/c$d;", "LBA0/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1227a;

        public d(@k String str) {
            this.f1227a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f1227a, ((d) obj).f1227a);
        }

        public final int hashCode() {
            return this.f1227a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f1227a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/c$e;", "LBA0/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f1228a;

        public e(@l DeepLink deepLink) {
            this.f1228a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f1228a, ((e) obj).f1228a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f1228a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SuccessFinish(redirectDeeplink="), this.f1228a, ')');
        }
    }
}
