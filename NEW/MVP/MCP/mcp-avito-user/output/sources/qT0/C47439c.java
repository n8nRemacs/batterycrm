package qt0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SbCheckPriceGroupItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lqt0/c;", "Lcom/avito/conveyor_item/a;", "Lqt0/a;", "a", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47439c implements com.avito.conveyor_item.a, InterfaceC47437a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f429400b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f429401c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f429402d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429403e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<a> f429404f;

    /* compiled from: SbCheckPriceGroupItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/c$a;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429405a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f429406b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f429407c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f429408d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f429409e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DetailsSheetLink f429410f;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, boolean z12, @l DetailsSheetLink detailsSheetLink) {
            this.f429405a = str;
            this.f429406b = str2;
            this.f429407c = str3;
            this.f429408d = str4;
            this.f429409e = z12;
            this.f429410f = detailsSheetLink;
        }

        public static a a(a aVar, boolean z12, int i12) {
            if ((i12 & 16) != 0) {
                z12 = aVar.f429409e;
            }
            return new a(aVar.f429405a, aVar.f429406b, aVar.f429407c, aVar.f429408d, z12, aVar.f429410f);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429405a, aVar.f429405a) && L.f(this.f429406b, aVar.f429406b) && L.f(this.f429407c, aVar.f429407c) && L.f(this.f429408d, aVar.f429408d) && this.f429409e == aVar.f429409e && L.f(this.f429410f, aVar.f429410f);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(H.d(H.d(this.f429405a.hashCode() * 31, 31, this.f429406b), 31, this.f429407c), 31, this.f429408d), 31, this.f429409e);
            DetailsSheetLink detailsSheetLink = this.f429410f;
            return i12 + (detailsSheetLink == null ? 0 : detailsSheetLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "Value(id=" + this.f429405a + ", groupId=" + this.f429406b + ", title=" + this.f429407c + ", price=" + this.f429408d + ", isChecked=" + this.f429409e + ", infoDeepLink=" + this.f429410f + ')';
        }
    }

    public C47439c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k List list, boolean z12) {
        this.f429400b = str;
        this.f429401c = str2;
        this.f429402d = str3;
        this.f429403e = z12;
        this.f429404f = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C47439c b(C47439c c47439c, boolean z12, ArrayList arrayList, int i12) {
        String str = c47439c.f429400b;
        String str2 = c47439c.f429401c;
        String str3 = c47439c.f429402d;
        if ((i12 & 8) != 0) {
            z12 = c47439c.f429403e;
        }
        boolean z13 = z12;
        List list = arrayList;
        if ((i12 & 16) != 0) {
            list = c47439c.f429404f;
        }
        c47439c.getClass();
        return new C47439c(str, str2, str3, list, z13);
    }

    @Override // qt0.InterfaceC47437a
    public final <T extends InterfaceC47437a> boolean a(@l List<? extends T> list) {
        InterfaceC47437a interfaceC47437a;
        Object next;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC47437a interfaceC47437a2 = (InterfaceC47437a) next;
                if ((interfaceC47437a2 instanceof C47439c) && L.f(((C47439c) interfaceC47437a2).f429400b, this.f429400b)) {
                    break;
                }
            }
            interfaceC47437a = (InterfaceC47437a) next;
        } else {
            interfaceC47437a = null;
        }
        C47439c c47439c = interfaceC47437a instanceof C47439c ? (C47439c) interfaceC47437a : null;
        return (L.f(c47439c != null ? c47439c.f429401c : null, this.f429401c) && L.f(c47439c.f429402d, this.f429402d) && L.f(c47439c.f429404f, this.f429404f)) ? false : true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47439c)) {
            return false;
        }
        C47439c c47439c = (C47439c) obj;
        return L.f(this.f429400b, c47439c.f429400b) && L.f(this.f429401c, c47439c.f429401c) && L.f(this.f429402d, c47439c.f429402d) && this.f429403e == c47439c.f429403e && L.f(this.f429404f, c47439c.f429404f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268775b() {
        return getF268777c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF268777c() {
        return this.f429400b;
    }

    public final int hashCode() {
        return this.f429404f.hashCode() + r.i(H.d(H.d(this.f429400b.hashCode() * 31, 31, this.f429401c), 31, this.f429402d), 31, this.f429403e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbCheckPriceGroupItem(stringId=");
        sb2.append(this.f429400b);
        sb2.append(", paramId=");
        sb2.append(this.f429401c);
        sb2.append(", title=");
        sb2.append(this.f429402d);
        sb2.append(", isCollapsed=");
        sb2.append(this.f429403e);
        sb2.append(", values=");
        return H.p(sb2, this.f429404f, ')');
    }
}
