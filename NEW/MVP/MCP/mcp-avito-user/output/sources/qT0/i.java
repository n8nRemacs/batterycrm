package qt0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbPriceListItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqt0/i;", "Lcom/avito/conveyor_item/a;", "a", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429447b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f429448c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f429449d;

    /* compiled from: SbPriceListItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/i$a;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429450a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f429451b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f429452c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f429453d;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
            this.f429450a = str;
            this.f429451b = str2;
            this.f429452c = str3;
            this.f429453d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429450a, aVar.f429450a) && L.f(this.f429451b, aVar.f429451b) && L.f(this.f429452c, aVar.f429452c) && this.f429453d == aVar.f429453d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f429453d) + H.d(H.d(this.f429450a.hashCode() * 31, 31, this.f429451b), 31, this.f429452c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Value(id=");
            sb2.append(this.f429450a);
            sb2.append(", title=");
            sb2.append(this.f429451b);
            sb2.append(", price=");
            sb2.append(this.f429452c);
            sb2.append(", isBold=");
            return r.x(sb2, this.f429453d, ')');
        }
    }

    public i(@Y61.k String str, @l String str2, @Y61.k ArrayList arrayList) {
        this.f429447b = str;
        this.f429448c = str2;
        this.f429449d = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f429447b, iVar.f429447b) && L.f(this.f429448c, iVar.f429448c) && this.f429449d.equals(iVar.f429449d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return getF236852b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236852b() {
        return this.f429447b;
    }

    public final int hashCode() {
        int iHashCode = this.f429447b.hashCode() * 31;
        String str = this.f429448c;
        return this.f429449d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbPriceListItem(stringId=");
        sb2.append(this.f429447b);
        sb2.append(", title=");
        sb2.append(this.f429448c);
        sb2.append(", values=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f429449d, ')');
    }
}
