package pH;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigApplyOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LpH/c;", "", "<init>", "()V", "a", "b", "c", "LpH/c$a;", "LpH/c$b;", "LpH/c$c;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC46955c {

    /* compiled from: GigApplyOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/c$a;", "LpH/c;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.c$a */
    public static final /* data */ class a extends AbstractC46955c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f428312a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 848931225;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: GigApplyOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/c$b;", "LpH/c;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.c$b */
    public static final /* data */ class b extends AbstractC46955c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f428313a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f428314b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f428315c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f428316d;

        public b(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l DeepLink deepLink) {
            super(null);
            this.f428313a = str;
            this.f428314b = str2;
            this.f428315c = str3;
            this.f428316d = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f428313a, bVar.f428313a) && L.f(this.f428314b, bVar.f428314b) && L.f(this.f428315c, bVar.f428315c) && L.f(this.f428316d, bVar.f428316d);
        }

        public final int hashCode() {
            int iHashCode = this.f428313a.hashCode() * 31;
            String str = this.f428314b;
            int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f428315c);
            DeepLink deepLink = this.f428316d;
            return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSheet(title=");
            sb2.append(this.f428313a);
            sb2.append(", description=");
            sb2.append(this.f428314b);
            sb2.append(", buttonTitle=");
            sb2.append(this.f428315c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f428316d, ')');
        }
    }

    /* compiled from: GigApplyOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpH/c$c;", "LpH/c;", "<init>", "()V", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pH.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12260c extends AbstractC46955c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12260c f428317a = new C12260c();

        public C12260c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12260c);
        }

        public final int hashCode() {
            return 1396535643;
        }

        @Y61.k
        public final String toString() {
            return "ShowErrorToast";
        }
    }

    public /* synthetic */ AbstractC46955c(C42822w c42822w) {
        this();
    }

    public AbstractC46955c() {
    }
}
