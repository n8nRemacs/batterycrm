package CN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientEditState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCN0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f2146j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f2147b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f2148c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f2149d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f2150e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f2151f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f2152g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2153h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2154i;

    /* compiled from: ClientEditState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCN0/c$a;", "", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, boolean z12, boolean z13, @k String str6) {
        this.f2147b = str;
        this.f2148c = str2;
        this.f2149d = str3;
        this.f2150e = str4;
        this.f2151f = str5;
        this.f2152g = str6;
        this.f2153h = z12;
        this.f2154i = z13;
    }

    public static c a(c cVar, String str, String str2, String str3, String str4, String str5, boolean z12, boolean z13, int i12) {
        String str6 = (i12 & 1) != 0 ? cVar.f2147b : str;
        String str7 = (i12 & 2) != 0 ? cVar.f2148c : str2;
        String str8 = (i12 & 4) != 0 ? cVar.f2149d : str3;
        String str9 = (i12 & 8) != 0 ? cVar.f2150e : str4;
        String str10 = (i12 & 16) != 0 ? cVar.f2151f : str5;
        String str11 = cVar.f2152g;
        boolean z14 = (i12 & 64) != 0 ? cVar.f2153h : z12;
        boolean z15 = (i12 & 128) != 0 ? cVar.f2154i : z13;
        cVar.getClass();
        return new c(str6, str7, str8, str9, str10, z14, z15, str11);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f2147b, cVar.f2147b) && L.f(this.f2148c, cVar.f2148c) && L.f(this.f2149d, cVar.f2149d) && L.f(this.f2150e, cVar.f2150e) && L.f(this.f2151f, cVar.f2151f) && L.f(this.f2152g, cVar.f2152g) && this.f2153h == cVar.f2153h && this.f2154i == cVar.f2154i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2154i) + r.i(H.d(H.d(H.d(H.d(H.d(this.f2147b.hashCode() * 31, 31, this.f2148c), 31, this.f2149d), 31, this.f2150e), 31, this.f2151f), 31, this.f2152g), 31, this.f2153h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientEditState(firstName=");
        sb2.append(this.f2147b);
        sb2.append(", lastName=");
        sb2.append(this.f2148c);
        sb2.append(", middleName=");
        sb2.append(this.f2149d);
        sb2.append(", phone=");
        sb2.append(this.f2150e);
        sb2.append(", email=");
        sb2.append(this.f2151f);
        sb2.append(", id=");
        sb2.append(this.f2152g);
        sb2.append(", isLoading=");
        sb2.append(this.f2153h);
        sb2.append(", isSaveButtonEnabled=");
        return r.x(sb2, this.f2154i, ')');
    }
}
