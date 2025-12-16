package dq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.category_parameters.DisplayingImageParams;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq0/a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39779a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f394095a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f394096b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f394097c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f394098d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f394099e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f394100f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f394101g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f394102h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f394103i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f394104j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f394105k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f394106l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f394107m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f394108n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f394109o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f394110p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final DisplayingImageParams f394111q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Size f394112r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f394113s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final List<MultiselectParameter.Displaying.Group> f394114t;

    public C39779a(@k PrintableText printableText, boolean z12, @k PrintableText printableText2, boolean z13, boolean z14, boolean z15, @l String str, boolean z16, boolean z17, boolean z18, @k String str2, boolean z19, @l String str3, @l String str4, boolean z22, boolean z23, @l DisplayingImageParams displayingImageParams, @l Size size, boolean z24, @l List<MultiselectParameter.Displaying.Group> list) {
        this.f394095a = printableText;
        this.f394096b = z12;
        this.f394097c = printableText2;
        this.f394098d = z13;
        this.f394099e = z14;
        this.f394100f = z15;
        this.f394101g = str;
        this.f394102h = z16;
        this.f394103i = z17;
        this.f394104j = z18;
        this.f394105k = str2;
        this.f394106l = z19;
        this.f394107m = str3;
        this.f394108n = str4;
        this.f394109o = z22;
        this.f394110p = z23;
        this.f394111q = displayingImageParams;
        this.f394112r = size;
        this.f394113s = z24;
        this.f394114t = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39779a)) {
            return false;
        }
        C39779a c39779a = (C39779a) obj;
        return L.f(this.f394095a, c39779a.f394095a) && this.f394096b == c39779a.f394096b && L.f(this.f394097c, c39779a.f394097c) && this.f394098d == c39779a.f394098d && this.f394099e == c39779a.f394099e && this.f394100f == c39779a.f394100f && L.f(this.f394101g, c39779a.f394101g) && this.f394102h == c39779a.f394102h && this.f394103i == c39779a.f394103i && this.f394104j == c39779a.f394104j && L.f(this.f394105k, c39779a.f394105k) && this.f394106l == c39779a.f394106l && L.f(this.f394107m, c39779a.f394107m) && L.f(this.f394108n, c39779a.f394108n) && this.f394109o == c39779a.f394109o && this.f394110p == c39779a.f394110p && L.f(this.f394111q, c39779a.f394111q) && L.f(this.f394112r, c39779a.f394112r) && this.f394113s == c39779a.f394113s && L.f(this.f394114t, c39779a.f394114t);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(com.avito.android.actions_sheet.a.f(this.f394097c, r.i(this.f394095a.hashCode() * 31, 31, this.f394096b), 31), 31, this.f394098d), 31, this.f394099e), 31, this.f394100f);
        String str = this.f394101g;
        int i13 = r.i(H.d(r.i(r.i(r.i((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f394102h), 31, this.f394103i), 31, this.f394104j), 31, this.f394105k), 31, this.f394106l);
        String str2 = this.f394107m;
        int iHashCode = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f394108n;
        int i14 = r.i(r.i((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f394109o), 31, this.f394110p);
        DisplayingImageParams displayingImageParams = this.f394111q;
        int iHashCode2 = (i14 + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
        Size size = this.f394112r;
        int i15 = r.i((iHashCode2 + (size == null ? 0 : size.hashCode())) * 31, 31, this.f394113s);
        List<MultiselectParameter.Displaying.Group> list = this.f394114t;
        return i15 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Config(clearActionText=");
        sb2.append(this.f394095a);
        sb2.append(", showSearch=");
        sb2.append(this.f394096b);
        sb2.append(", submitButtonText=");
        sb2.append(this.f394097c);
        sb2.append(", needShowChips=");
        sb2.append(this.f394098d);
        sb2.append(", isCandy=");
        sb2.append(this.f394099e);
        sb2.append(", isChips=");
        sb2.append(this.f394100f);
        sb2.append(", itemsStyle=");
        sb2.append(this.f394101g);
        sb2.append(", multiSelect=");
        sb2.append(this.f394102h);
        sb2.append(", isFromFilters=");
        sb2.append(this.f394103i);
        sb2.append(", isPaginationSuggest=");
        sb2.append(this.f394104j);
        sb2.append(", requestId=");
        sb2.append(this.f394105k);
        sb2.append(", hasGroups=");
        sb2.append(this.f394106l);
        sb2.append(", defaultValue=");
        sb2.append(this.f394107m);
        sb2.append(", titlePattern=");
        sb2.append(this.f394108n);
        sb2.append(", withImage=");
        sb2.append(this.f394109o);
        sb2.append(", areGroupsCollapsible=");
        sb2.append(this.f394110p);
        sb2.append(", imageParams=");
        sb2.append(this.f394111q);
        sb2.append(", optionImageSize=");
        sb2.append(this.f394112r);
        sb2.append(", hideClear=");
        sb2.append(this.f394113s);
        sb2.append(", groups=");
        return H.p(sb2, this.f394114t, ')');
    }

    public /* synthetic */ C39779a(PrintableText printableText, boolean z12, PrintableText printableText2, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, boolean z18, String str2, boolean z19, String str3, String str4, boolean z22, boolean z23, DisplayingImageParams displayingImageParams, Size size, boolean z24, List list, int i12, C42822w c42822w) {
        this(printableText, z12, printableText2, z13, z14, z15, str, z16, z17, z18, str2, z19, str3, str4, z22, z23, displayingImageParams, size, (i12 & 262144) != 0 ? false : z24, list);
    }
}
