package RF0;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateOption.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LRF0/e;", "", "<init>", "()V", "a", "b", "c", "LRF0/e$a;", "LRF0/e$b;", "LRF0/e$c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* compiled from: TrxPromoDateOption.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/e$a;", "LRF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14213a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f14214b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final g f14215c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f14216d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final g f14217e;

        public a(boolean z12, @Y61.k String str, @Y61.l g gVar, @Y61.k String str2, @Y61.l g gVar2) {
            super(null);
            this.f14213a = z12;
            this.f14214b = str;
            this.f14215c = gVar;
            this.f14216d = str2;
            this.f14217e = gVar2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14213a == aVar.f14213a && L.f(this.f14214b, aVar.f14214b) && L.f(this.f14215c, aVar.f14215c) && L.f(this.f14216d, aVar.f14216d) && L.f(this.f14217e, aVar.f14217e);
        }

        public final int hashCode() {
            int iD2 = H.d(Boolean.hashCode(this.f14213a) * 31, 31, this.f14214b);
            g gVar = this.f14215c;
            int iD3 = H.d((iD2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f14216d);
            g gVar2 = this.f14217e;
            return iD3 + (gVar2 != null ? gVar2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AllFreeOption(isSelected=" + this.f14213a + ", title=" + this.f14214b + ", icon=" + this.f14215c + ", selectedTitle=" + this.f14216d + ", selectedIcon=" + this.f14217e + ')';
        }
    }

    /* compiled from: TrxPromoDateOption.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/e$b;", "LRF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14218a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f14219b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final g f14220c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f14221d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final g f14222e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f14223f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final d f14224g;

        public b(boolean z12, @Y61.k String str, @Y61.l g gVar, @Y61.k String str2, @Y61.l g gVar2, @Y61.l String str3, @Y61.k d dVar) {
            super(null);
            this.f14218a = z12;
            this.f14219b = str;
            this.f14220c = gVar;
            this.f14221d = str2;
            this.f14222e = gVar2;
            this.f14223f = str3;
            this.f14224g = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14218a == bVar.f14218a && L.f(this.f14219b, bVar.f14219b) && L.f(this.f14220c, bVar.f14220c) && L.f(this.f14221d, bVar.f14221d) && L.f(this.f14222e, bVar.f14222e) && L.f(this.f14223f, bVar.f14223f) && L.f(this.f14224g, bVar.f14224g);
        }

        public final int hashCode() {
            int iD2 = H.d(Boolean.hashCode(this.f14218a) * 31, 31, this.f14219b);
            g gVar = this.f14220c;
            int iD3 = H.d((iD2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f14221d);
            g gVar2 = this.f14222e;
            int iHashCode = (iD3 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
            String str = this.f14223f;
            return this.f14224g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "BeforeDateOption(isSelected=" + this.f14218a + ", title=" + this.f14219b + ", icon=" + this.f14220c + ", selectedTitle=" + this.f14221d + ", selectedIcon=" + this.f14222e + ", selectedSingleDateTitle=" + this.f14223f + ", selectedTitleFormatter=" + this.f14224g + ')';
        }
    }

    /* compiled from: TrxPromoDateOption.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRF0/e$c;", "LRF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14225a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f14226b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final g f14227c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f14228d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final g f14229e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f14230f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final RF0.b f14231g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, String str, g gVar, String str2, g gVar2, DeepLink deepLink, RF0.b bVar, int i12, C42822w c42822w) {
            super(null);
            str2 = (i12 & 8) != 0 ? "" : str2;
            this.f14225a = z12;
            this.f14226b = str;
            this.f14227c = gVar;
            this.f14228d = str2;
            this.f14229e = gVar2;
            this.f14230f = deepLink;
            this.f14231g = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f14225a == cVar.f14225a && L.f(this.f14226b, cVar.f14226b) && L.f(this.f14227c, cVar.f14227c) && L.f(this.f14228d, cVar.f14228d) && L.f(this.f14229e, cVar.f14229e) && L.f(this.f14230f, cVar.f14230f) && L.f(this.f14231g, cVar.f14231g);
        }

        public final int hashCode() {
            int iD2 = H.d(Boolean.hashCode(this.f14225a) * 31, 31, this.f14226b);
            g gVar = this.f14227c;
            int iD3 = H.d((iD2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f14228d);
            g gVar2 = this.f14229e;
            int iHashCode = (iD3 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
            DeepLink deepLink = this.f14230f;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            RF0.b bVar = this.f14231g;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "DateRangeOption(isSelected=" + this.f14225a + ", title=" + this.f14226b + ", icon=" + this.f14227c + ", selectedTitle=" + this.f14228d + ", selectedIcon=" + this.f14229e + ", deeplink=" + this.f14230f + ", dateRangeOptionsFormat=" + this.f14231g + ')';
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public e() {
    }
}
