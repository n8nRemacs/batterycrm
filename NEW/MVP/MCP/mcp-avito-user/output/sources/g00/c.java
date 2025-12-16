package G00;

import G00.b;
import G00.e;
import JZ.i;
import JZ.u;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: PersonFormState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG00/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f6142r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final c f6143s;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6144b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f6145c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f6146d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f6147e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f6148f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f6149g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6150h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6151i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f6152j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final List<LZ.c> f6153k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final u f6154l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final i f6155m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6156n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final G00.a f6157o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final b f6158p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final e f6159q;

    /* compiled from: PersonFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG00/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f6143s = new c("", "", null, "personal", "", c42784z0, 0, false, "", c42784z0, null, null, false, null, b.c.f6139a, new e.c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0));
    }

    public c(@k String str, @k String str2, @l String str3, @k String str4, @k String str5, @k List<String> list, int i12, boolean z12, @k String str6, @k List<LZ.c> list2, @l u uVar, @l i iVar, boolean z13, @l G00.a aVar, @k b bVar, @k e eVar) {
        this.f6144b = str;
        this.f6145c = str2;
        this.f6146d = str3;
        this.f6147e = str4;
        this.f6148f = str5;
        this.f6149g = list;
        this.f6150h = i12;
        this.f6151i = z12;
        this.f6152j = str6;
        this.f6153k = list2;
        this.f6154l = uVar;
        this.f6155m = iVar;
        this.f6156n = z13;
        this.f6157o = aVar;
        this.f6158p = bVar;
        this.f6159q = eVar;
    }

    public static c a(c cVar, String str, String str2, String str3, String str4, String str5, List list, int i12, boolean z12, String str6, List list2, u uVar, i iVar, boolean z13, G00.a aVar, b bVar, e eVar, int i13) {
        String str7 = (i13 & 1) != 0 ? cVar.f6144b : str;
        String str8 = (i13 & 2) != 0 ? cVar.f6145c : str2;
        String str9 = (i13 & 4) != 0 ? cVar.f6146d : str3;
        String str10 = (i13 & 8) != 0 ? cVar.f6147e : str4;
        String str11 = (i13 & 16) != 0 ? cVar.f6148f : str5;
        List list3 = (i13 & 32) != 0 ? cVar.f6149g : list;
        int i14 = (i13 & 64) != 0 ? cVar.f6150h : i12;
        boolean z14 = (i13 & 128) != 0 ? cVar.f6151i : z12;
        String str12 = (i13 & 256) != 0 ? cVar.f6152j : str6;
        List list4 = (i13 & 512) != 0 ? cVar.f6153k : list2;
        u uVar2 = (i13 & 1024) != 0 ? cVar.f6154l : uVar;
        i iVar2 = (i13 & 2048) != 0 ? cVar.f6155m : iVar;
        boolean z15 = (i13 & 4096) != 0 ? cVar.f6156n : z13;
        G00.a aVar2 = (i13 & 8192) != 0 ? cVar.f6157o : aVar;
        b bVar2 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f6158p : bVar;
        e eVar2 = (i13 & 32768) != 0 ? cVar.f6159q : eVar;
        cVar.getClass();
        return new c(str7, str8, str9, str10, str11, list3, i14, z14, str12, list4, uVar2, iVar2, z15, aVar2, bVar2, eVar2);
    }

    @k
    public final String c() {
        return this.f6149g.get(this.f6150h);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6144b, cVar.f6144b) && L.f(this.f6145c, cVar.f6145c) && L.f(this.f6146d, cVar.f6146d) && L.f(this.f6147e, cVar.f6147e) && L.f(this.f6148f, cVar.f6148f) && L.f(this.f6149g, cVar.f6149g) && this.f6150h == cVar.f6150h && this.f6151i == cVar.f6151i && L.f(this.f6152j, cVar.f6152j) && L.f(this.f6153k, cVar.f6153k) && L.f(this.f6154l, cVar.f6154l) && L.f(this.f6155m, cVar.f6155m) && this.f6156n == cVar.f6156n && L.f(this.f6157o, cVar.f6157o) && L.f(this.f6158p, cVar.f6158p) && L.f(this.f6159q, cVar.f6159q);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f6144b.hashCode() * 31, 31, this.f6145c);
        String str = this.f6146d;
        int iE2 = H.e(H.d(r.i(r.e(this.f6150h, H.e(H.d(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6147e), 31, this.f6148f), 31, this.f6149g), 31), 31, this.f6151i), 31, this.f6152j), 31, this.f6153k);
        u uVar = this.f6154l;
        int iHashCode = (iE2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        i iVar = this.f6155m;
        int i12 = r.i((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f6156n);
        G00.a aVar = this.f6157o;
        return this.f6159q.hashCode() + ((this.f6158p.hashCode() + ((i12 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "PersonFormState(applicationId=" + this.f6144b + ", applicantId=" + this.f6145c + ", applicantType=" + this.f6146d + ", flowType=" + this.f6147e + ", screenTitle=" + this.f6148f + ", steps=" + this.f6149g + ", currentStepIdx=" + this.f6150h + ", needCheckAccess=" + this.f6151i + ", stepTitle=" + this.f6152j + ", contentList=" + this.f6153k + ", verificationBanner=" + this.f6154l + ", actionBanner=" + this.f6155m + ", shouldScrollToNextError=" + this.f6156n + ", errorsCounterState=" + this.f6157o + ", loadingState=" + this.f6158p + ", viewState=" + this.f6159q + ')';
    }
}
