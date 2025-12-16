package k4;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_details.AdvertDetailsStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lk4/e;", "", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C42501e {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final b f406078d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C42501e f406079e = new C42501e(C42784z0.f406748b, null, AdvertDetailsStyle.f84409c);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a> f406080a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdvertDetailsWithMeta f406081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdvertDetailsStyle f406082c;

    /* compiled from: AdvertDetailsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk4/e$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406083a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f406084b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k List<? extends com.avito.conveyor_item.a> list) {
            this.f406083a = str;
            this.f406084b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f406083a, aVar.f406083a) && L.f(this.f406084b, aVar.f406084b);
        }

        public final int hashCode() {
            return this.f406084b.hashCode() + (this.f406083a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Block(identifier=");
            sb2.append(this.f406083a);
            sb2.append(", items=");
            return H.p(sb2, this.f406084b, ')');
        }
    }

    /* compiled from: AdvertDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk4/e$b;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k4.e$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public C42501e(@k List<a> list, @l AdvertDetailsWithMeta advertDetailsWithMeta, @k AdvertDetailsStyle advertDetailsStyle) {
        this.f406080a = list;
        this.f406081b = advertDetailsWithMeta;
        this.f406082c = advertDetailsStyle;
    }

    public static C42501e a(C42501e c42501e, List list, AdvertDetailsWithMeta advertDetailsWithMeta, AdvertDetailsStyle advertDetailsStyle, int i12) {
        if ((i12 & 1) != 0) {
            list = c42501e.f406080a;
        }
        if ((i12 & 2) != 0) {
            advertDetailsWithMeta = c42501e.f406081b;
        }
        if ((i12 & 4) != 0) {
            advertDetailsStyle = c42501e.f406082c;
        }
        c42501e.getClass();
        return new C42501e(list, advertDetailsWithMeta, advertDetailsStyle);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42501e)) {
            return false;
        }
        C42501e c42501e = (C42501e) obj;
        return L.f(this.f406080a, c42501e.f406080a) && L.f(this.f406081b, c42501e.f406081b) && this.f406082c == c42501e.f406082c;
    }

    public final int hashCode() {
        int iHashCode = this.f406080a.hashCode() * 31;
        AdvertDetailsWithMeta advertDetailsWithMeta = this.f406081b;
        return this.f406082c.hashCode() + ((iHashCode + (advertDetailsWithMeta == null ? 0 : advertDetailsWithMeta.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsState(blocks=" + this.f406080a + ", advertDetails=" + this.f406081b + ", style=" + this.f406082c + ')';
    }
}
