package fh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.custom_params.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormSelectItemMviState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lfh0/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C40423b extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f396047i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C40423b f396048j = new C40423b(com.avito.android.printable_text.b.f(""), null, C42784z0.f406748b, null, false, null, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f396049b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f396050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f396051d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396052e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f396053f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final m.a f396054g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f396055h;

    /* compiled from: RatingFormSelectItemMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfh0/b$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fh0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40423b(@k PrintableText printableText, @l String str, @k List list, @l String str2, boolean z12, @l m.a aVar, boolean z13) {
        this.f396049b = printableText;
        this.f396050c = str;
        this.f396051d = list;
        this.f396052e = str2;
        this.f396053f = z12;
        this.f396054g = aVar;
        this.f396055h = z13;
    }

    public static C40423b a(C40423b c40423b, PrintableText printableText, String str, List list, String str2, boolean z12, m.a aVar, boolean z13, int i12) {
        PrintableText printableText2 = (i12 & 1) != 0 ? c40423b.f396049b : printableText;
        String str3 = (i12 & 2) != 0 ? c40423b.f396050c : str;
        List list2 = (i12 & 4) != 0 ? c40423b.f396051d : list;
        String str4 = (i12 & 8) != 0 ? c40423b.f396052e : str2;
        c40423b.getClass();
        boolean z14 = (i12 & 32) != 0 ? c40423b.f396053f : z12;
        m.a aVar2 = (i12 & 64) != 0 ? c40423b.f396054g : aVar;
        boolean z15 = (i12 & 128) != 0 ? c40423b.f396055h : z13;
        c40423b.getClass();
        return new C40423b(printableText2, str3, list2, str4, z14, aVar2, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40423b)) {
            return false;
        }
        C40423b c40423b = (C40423b) obj;
        return L.f(this.f396049b, c40423b.f396049b) && L.f(this.f396050c, c40423b.f396050c) && L.f(this.f396051d, c40423b.f396051d) && L.f(this.f396052e, c40423b.f396052e) && this.f396053f == c40423b.f396053f && L.f(this.f396054g, c40423b.f396054g) && this.f396055h == c40423b.f396055h;
    }

    public final int hashCode() {
        int iHashCode = this.f396049b.hashCode() * 31;
        String str = this.f396050c;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f396051d);
        String str2 = this.f396052e;
        int i12 = r.i(r.i((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false), 31, this.f396053f);
        m.a aVar = this.f396054g;
        return Boolean.hashCode(this.f396055h) + ((i12 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormSelectItemMviState(title=");
        sb2.append(this.f396049b);
        sb2.append(", subtitle=");
        sb2.append(this.f396050c);
        sb2.append(", items=");
        sb2.append(this.f396051d);
        sb2.append(", nextPage=");
        sb2.append(this.f396052e);
        sb2.append(", overScrolled=false, shouldShowSearchInput=");
        sb2.append(this.f396053f);
        sb2.append(", searchInfo=");
        sb2.append(this.f396054g);
        sb2.append(", hasPreselectedItem=");
        return r.x(sb2, this.f396055h, ')');
    }
}
