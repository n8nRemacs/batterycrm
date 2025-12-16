package rw0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lrw0/m;", "", "a", "b", "Lrw0/m$a;", "Lrw0/m$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f437230a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f437231b;

    /* compiled from: PromoCodeInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/m$a;", "Lrw0/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f437232c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f437233d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, String str2, int i12, C42822w c42822w) {
            str2 = (i12 & 2) != 0 ? null : str2;
            super(str, str2, null);
            this.f437232c = str;
            this.f437233d = str2;
        }

        @Override // rw0.m
        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getF437231b() {
            return this.f437233d;
        }

        @Override // rw0.m
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF437230a() {
            return this.f437232c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437232c, aVar.f437232c) && L.f(this.f437233d, aVar.f437233d);
        }

        public final int hashCode() {
            String str = this.f437232c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f437233d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Disabled(subtitle=");
            sb2.append(this.f437232c);
            sb2.append(", percent=");
            return C22026a.c(sb2, this.f437233d, ')');
        }
    }

    /* compiled from: PromoCodeInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/m$b;", "Lrw0/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f437234c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f437235d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final List<CostInfo> f437236e;

        public b(@Y61.l String str, @Y61.l String str2, @Y61.l List<CostInfo> list) {
            super(str, str2, null);
            this.f437234c = str;
            this.f437235d = str2;
            this.f437236e = list;
        }

        @Override // rw0.m
        @Y61.l
        /* renamed from: a, reason: from getter */
        public final String getF437231b() {
            return this.f437235d;
        }

        @Override // rw0.m
        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getF437230a() {
            return this.f437234c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f437234c, bVar.f437234c) && L.f(this.f437235d, bVar.f437235d) && L.f(this.f437236e, bVar.f437236e);
        }

        public final int hashCode() {
            String str = this.f437234c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f437235d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<CostInfo> list = this.f437236e;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Enabled(subtitle=");
            sb2.append(this.f437234c);
            sb2.append(", percent=");
            sb2.append(this.f437235d);
            sb2.append(", costInfo=");
            return H.p(sb2, this.f437236e, ')');
        }
    }

    public m(String str, String str2, C42822w c42822w) {
        this.f437230a = str;
        this.f437231b = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public String getF437231b() {
        return this.f437231b;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public String getF437230a() {
        return this.f437230a;
    }
}
