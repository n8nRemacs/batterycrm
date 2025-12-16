package EN0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ClientRoomState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEN0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final a f3965s = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<DN0.b> f3966b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f3967c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DN0.b f3968d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f3969e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DN0.a f3970f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f3971g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f3972h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f3973i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f3974j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f3975k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f3976l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f3977m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3978n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3979o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final ApiError f3980p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3981q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final d f3982r;

    /* compiled from: ClientRoomState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEN0/c$a;", "", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(List list, String str, DN0.b bVar, String str2, DN0.a aVar, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z12, boolean z13, ApiError apiError, boolean z14, d dVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : bVar, str2, aVar, str3, str4, str5, str6, str7, str8, str9, z12, z13, apiError, z14, dVar);
    }

    public static c a(c cVar, List list, DN0.b bVar, DN0.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z12, boolean z13, ApiError apiError, d dVar, int i12) {
        List list2 = (i12 & 1) != 0 ? cVar.f3966b : list;
        String str8 = cVar.f3967c;
        DN0.b bVar2 = (i12 & 4) != 0 ? cVar.f3968d : bVar;
        String str9 = cVar.f3969e;
        DN0.a aVar2 = (i12 & 16) != 0 ? cVar.f3970f : aVar;
        String str10 = (i12 & 32) != 0 ? cVar.f3971g : str;
        String str11 = (i12 & 64) != 0 ? cVar.f3972h : str2;
        String str12 = (i12 & 128) != 0 ? cVar.f3973i : str3;
        String str13 = (i12 & 256) != 0 ? cVar.f3974j : str4;
        String str14 = (i12 & 512) != 0 ? cVar.f3975k : str5;
        String str15 = (i12 & 1024) != 0 ? cVar.f3976l : str6;
        String str16 = (i12 & 2048) != 0 ? cVar.f3977m : str7;
        boolean z14 = (i12 & 4096) != 0 ? cVar.f3978n : z12;
        boolean z15 = (i12 & 8192) != 0 ? cVar.f3979o : z13;
        ApiError apiError2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f3980p : apiError;
        boolean z16 = (32768 & i12) != 0 ? cVar.f3981q : true;
        d dVar2 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cVar.f3982r : dVar;
        cVar.getClass();
        return new c(list2, str8, bVar2, str9, aVar2, str10, str11, str12, str13, str14, str15, str16, z14, z15, apiError2, z16, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3966b, cVar.f3966b) && L.f(this.f3967c, cVar.f3967c) && L.f(this.f3968d, cVar.f3968d) && L.f(this.f3969e, cVar.f3969e) && L.f(this.f3970f, cVar.f3970f) && L.f(this.f3971g, cVar.f3971g) && L.f(this.f3972h, cVar.f3972h) && L.f(this.f3973i, cVar.f3973i) && L.f(this.f3974j, cVar.f3974j) && L.f(this.f3975k, cVar.f3975k) && L.f(this.f3976l, cVar.f3976l) && L.f(this.f3977m, cVar.f3977m) && this.f3978n == cVar.f3978n && this.f3979o == cVar.f3979o && L.f(this.f3980p, cVar.f3980p) && this.f3981q == cVar.f3981q && L.f(this.f3982r, cVar.f3982r);
    }

    public final int hashCode() {
        List<DN0.b> list = this.f3966b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f3967c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DN0.b bVar = this.f3968d;
        int iD2 = H.d((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f3969e);
        DN0.a aVar = this.f3970f;
        int iHashCode3 = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f3971g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3972h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3973i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3974j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3975k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f3976l;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f3977m;
        int i12 = r.i(r.i((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.f3978n), 31, this.f3979o);
        ApiError apiError = this.f3980p;
        return this.f3982r.hashCode() + r.i((i12 + (apiError != null ? apiError.hashCode() : 0)) * 31, 31, this.f3981q);
    }

    @k
    public final String toString() {
        return "ClientRoomState(availableCategories=" + this.f3966b + ", selectedCategoryId=" + this.f3967c + ", selectedCategory=" + this.f3968d + ", processId=" + this.f3969e + ", clientImage=" + this.f3970f + ", clientName=" + this.f3971g + ", clientPhone=" + this.f3972h + ", clientId=" + this.f3973i + ", clientFirstName=" + this.f3974j + ", clientLastName=" + this.f3975k + ", clientMiddleName=" + this.f3976l + ", clientEmail=" + this.f3977m + ", isEditable=" + this.f3978n + ", isLoading=" + this.f3979o + ", error=" + this.f3980p + ", needUpdateList=" + this.f3981q + ", viewState=" + this.f3982r + ')';
    }

    public c(@l List<DN0.b> list, @l String str, @l DN0.b bVar, @k String str2, @l DN0.a aVar, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, boolean z12, boolean z13, @l ApiError apiError, boolean z14, @k d dVar) {
        this.f3966b = list;
        this.f3967c = str;
        this.f3968d = bVar;
        this.f3969e = str2;
        this.f3970f = aVar;
        this.f3971g = str3;
        this.f3972h = str4;
        this.f3973i = str5;
        this.f3974j = str6;
        this.f3975k = str7;
        this.f3976l = str8;
        this.f3977m = str9;
        this.f3978n = z12;
        this.f3979o = z13;
        this.f3980p = apiError;
        this.f3981q = z14;
        this.f3982r = dVar;
    }
}
