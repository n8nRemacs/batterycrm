package pH;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: GigApplyState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/d;", "", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pH.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C46956d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f428318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<AttributedText> f428319b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f428320c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f428321d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f428322e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f428323f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f428324g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f428325h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f428326i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f428327j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f428328k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f428329l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Date f428330m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Date f428331n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f428332o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f428333p;

    public C46956d(boolean z12, @Y61.k List<AttributedText> list, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.k String str7, @Y61.k String str8, @Y61.k String str9, @Y61.l String str10, @Y61.l Date date, @Y61.l Date date2, boolean z13, boolean z14) {
        this.f428318a = z12;
        this.f428319b = list;
        this.f428320c = str;
        this.f428321d = str2;
        this.f428322e = str3;
        this.f428323f = str4;
        this.f428324g = str5;
        this.f428325h = str6;
        this.f428326i = str7;
        this.f428327j = str8;
        this.f428328k = str9;
        this.f428329l = str10;
        this.f428330m = date;
        this.f428331n = date2;
        this.f428332o = z13;
        this.f428333p = z14;
    }

    public static C46956d a(C46956d c46956d, boolean z12, boolean z13, int i12) {
        boolean z14;
        boolean z15;
        boolean z16 = (i12 & 1) != 0 ? c46956d.f428318a : z12;
        List<AttributedText> list = c46956d.f428319b;
        String str = c46956d.f428320c;
        String str2 = c46956d.f428321d;
        String str3 = c46956d.f428322e;
        String str4 = c46956d.f428323f;
        String str5 = c46956d.f428324g;
        String str6 = c46956d.f428325h;
        String str7 = c46956d.f428326i;
        String str8 = c46956d.f428327j;
        String str9 = c46956d.f428328k;
        String str10 = c46956d.f428329l;
        Date date = c46956d.f428330m;
        Date date2 = c46956d.f428331n;
        boolean z17 = c46956d.f428332o;
        if ((i12 & 32768) != 0) {
            z14 = z17;
            z15 = c46956d.f428333p;
        } else {
            z14 = z17;
            z15 = z13;
        }
        c46956d.getClass();
        return new C46956d(z16, list, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, date, date2, z14, z15);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46956d)) {
            return false;
        }
        C46956d c46956d = (C46956d) obj;
        return this.f428318a == c46956d.f428318a && L.f(this.f428319b, c46956d.f428319b) && L.f(this.f428320c, c46956d.f428320c) && L.f(this.f428321d, c46956d.f428321d) && L.f(this.f428322e, c46956d.f428322e) && L.f(this.f428323f, c46956d.f428323f) && L.f(this.f428324g, c46956d.f428324g) && L.f(this.f428325h, c46956d.f428325h) && L.f(this.f428326i, c46956d.f428326i) && L.f(this.f428327j, c46956d.f428327j) && L.f(this.f428328k, c46956d.f428328k) && L.f(this.f428329l, c46956d.f428329l) && L.f(this.f428330m, c46956d.f428330m) && L.f(this.f428331n, c46956d.f428331n) && this.f428332o == c46956d.f428332o && this.f428333p == c46956d.f428333p;
    }

    public final int hashCode() {
        int iE2 = H.e(Boolean.hashCode(this.f428318a) * 31, 31, this.f428319b);
        String str = this.f428320c;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f428321d;
        int iD2 = H.d(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f428322e), 31, this.f428323f);
        String str3 = this.f428324g;
        int iD3 = H.d(H.d(H.d(H.d((iD2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f428325h), 31, this.f428326i), 31, this.f428327j), 31, this.f428328k);
        String str4 = this.f428329l;
        int iHashCode2 = (iD3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.f428330m;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f428331n;
        return Boolean.hashCode(this.f428333p) + androidx.appcompat.app.r.i((iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31, 31, this.f428332o);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigApplyState(loading=");
        sb2.append(this.f428318a);
        sb2.append(", applyRules=");
        sb2.append(this.f428319b);
        sb2.append(", disclaimerUrl=");
        sb2.append(this.f428320c);
        sb2.append(", promotionUrl=");
        sb2.append(this.f428321d);
        sb2.append(", address=");
        sb2.append(this.f428322e);
        sb2.append(", date=");
        sb2.append(this.f428323f);
        sb2.append(", iconUrl=");
        sb2.append(this.f428324g);
        sb2.append(", name=");
        sb2.append(this.f428325h);
        sb2.append(", timePeriodWithPrice=");
        sb2.append(this.f428326i);
        sb2.append(", title=");
        sb2.append(this.f428327j);
        sb2.append(", totalPrice=");
        sb2.append(this.f428328k);
        sb2.append(", buttonTitle=");
        sb2.append(this.f428329l);
        sb2.append(", startTime=");
        sb2.append(this.f428330m);
        sb2.append(", endTime=");
        sb2.append(this.f428331n);
        sb2.append(", isSlotStarted=");
        sb2.append(this.f428332o);
        sb2.append(", isButtonEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f428333p, ')');
    }

    public /* synthetic */ C46956d(boolean z12, List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, list, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, date, date2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z13, (i12 & 32768) != 0 ? true : z14);
    }
}
