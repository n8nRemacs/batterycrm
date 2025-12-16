package um;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lum/a;", "", "<init>", "()V", "a", "b", "Lum/a$a;", "Lum/a$b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: um.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC49075a {

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/a$a;", "Lum/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: um.a$a, reason: collision with other inner class name */
    public static final class C12726a extends AbstractC49075a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12726a f440226a = new C12726a();

        public C12726a() {
            super(null);
        }
    }

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lum/a$b;", "Lum/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: um.a$b */
    public static final /* data */ class b extends AbstractC49075a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.campaigns_sale_search.konveyor.search_item.a f440227a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f440228b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f440229c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f440230d;

        public b(@k com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar, @l Integer num, @l String str, boolean z12) {
            super(null);
            this.f440227a = aVar;
            this.f440228b = num;
            this.f440229c = str;
            this.f440230d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440227a, bVar.f440227a) && L.f(this.f440228b, bVar.f440228b) && L.f(this.f440229c, bVar.f440229c) && this.f440230d == bVar.f440230d;
        }

        public final int hashCode() {
            int iHashCode = this.f440227a.hashCode() * 31;
            Integer num = this.f440228b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f440229c;
            return Boolean.hashCode(this.f440230d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Visible(item=");
            sb2.append(this.f440227a);
            sb2.append(", discount=");
            sb2.append(this.f440228b);
            sb2.append(", validationResult=");
            sb2.append(this.f440229c);
            sb2.append(", isButtonLoading=");
            return r.x(sb2, this.f440230d, ')');
        }
    }

    public /* synthetic */ AbstractC49075a(C42822w c42822w) {
        this();
    }

    public AbstractC49075a() {
    }
}
