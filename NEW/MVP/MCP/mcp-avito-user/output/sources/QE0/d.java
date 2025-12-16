package QE0;

import QE0.e;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQE0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f13620k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final d f13621l;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13622b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f13623c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f13624d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SearchParametersEntry.SearchParametersBlock.Sort f13625e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final P2<OE0.b> f13626f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final P2<RatingDetailsResult> f13627g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Uri f13628h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<RatingDetailsEntry> f13629i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final e f13630j;

    /* compiled from: TravelGuestProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/d$a;", "", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        P2.c cVar = P2.c.f318721a;
        f13621l = new d("", null, null, null, cVar, cVar, null, C42784z0.f406748b, e.c.f13634a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @l String str2, @l String str3, @l SearchParametersEntry.SearchParametersBlock.Sort sort, @k P2<? super OE0.b> p22, @k P2<? super RatingDetailsResult> p23, @l Uri uri, @k List<? extends RatingDetailsEntry> list, @k e eVar) {
        this.f13622b = str;
        this.f13623c = str2;
        this.f13624d = str3;
        this.f13625e = sort;
        this.f13626f = p22;
        this.f13627g = p23;
        this.f13628h = uri;
        this.f13629i = list;
        this.f13630j = eVar;
    }

    public static d a(d dVar, String str, String str2, String str3, SearchParametersEntry.SearchParametersBlock.Sort sort, P2 p22, P2 p23, Uri uri, List list, e eVar, int i12) {
        String str4 = (i12 & 1) != 0 ? dVar.f13622b : str;
        String str5 = (i12 & 2) != 0 ? dVar.f13623c : str2;
        String str6 = (i12 & 4) != 0 ? dVar.f13624d : str3;
        SearchParametersEntry.SearchParametersBlock.Sort sort2 = (i12 & 8) != 0 ? dVar.f13625e : sort;
        P2 p24 = (i12 & 16) != 0 ? dVar.f13626f : p22;
        P2 p25 = (i12 & 32) != 0 ? dVar.f13627g : p23;
        Uri uri2 = (i12 & 64) != 0 ? dVar.f13628h : uri;
        List list2 = (i12 & 128) != 0 ? dVar.f13629i : list;
        e eVar2 = (i12 & 256) != 0 ? dVar.f13630j : eVar;
        dVar.getClass();
        return new d(str4, str5, str6, sort2, p24, p25, uri2, list2, eVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f13622b, dVar.f13622b) && L.f(this.f13623c, dVar.f13623c) && L.f(this.f13624d, dVar.f13624d) && L.f(this.f13625e, dVar.f13625e) && L.f(this.f13626f, dVar.f13626f) && L.f(this.f13627g, dVar.f13627g) && L.f(this.f13628h, dVar.f13628h) && L.f(this.f13629i, dVar.f13629i) && L.f(this.f13630j, dVar.f13630j);
    }

    public final int hashCode() {
        int iHashCode = this.f13622b.hashCode() * 31;
        String str = this.f13623c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13624d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchParametersEntry.SearchParametersBlock.Sort sort = this.f13625e;
        int iHashCode4 = (this.f13627g.hashCode() + ((this.f13626f.hashCode() + ((iHashCode3 + (sort == null ? 0 : sort.hashCode())) * 31)) * 31)) * 31;
        Uri uri = this.f13628h;
        return this.f13630j.hashCode() + H.e((iHashCode4 + (uri != null ? uri.hashCode() : 0)) * 31, 31, this.f13629i);
    }

    @k
    public final String toString() {
        return "TravelGuestProfileState(userKey=" + this.f13622b + ", context=" + this.f13623c + ", bookingId=" + this.f13624d + ", reviewSorting=" + this.f13625e + ", coreLoadingState=" + this.f13626f + ", reviewsLoadingState=" + this.f13627g + ", reviewsNextPage=" + this.f13628h + ", reviewEntries=" + this.f13629i + ", viewState=" + this.f13630j + ')';
    }
}
