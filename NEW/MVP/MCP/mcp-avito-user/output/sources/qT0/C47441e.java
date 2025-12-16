package qt0;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SbGeoReferenceBlockItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lqt0/e;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qt0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47441e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429426b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f429427c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f429428d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f429429e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f429430f;

    /* compiled from: SbGeoReferenceBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/e$b;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.e$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f429437a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f429438b;

        public b(@l String str, @l DeepLink deepLink) {
            this.f429437a = str;
            this.f429438b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f429437a, bVar.f429437a) && L.f(this.f429438b, bVar.f429438b);
        }

        public final int hashCode() {
            String str = this.f429437a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeepLink deepLink = this.f429438b;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RedirectMapItem(address=");
            sb2.append(this.f429437a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f429438b, ')');
        }
    }

    public C47441e(@l String str, @l String str2, @l ArrayList arrayList, @l b bVar, @Y61.k String str3) {
        this.f429426b = str;
        this.f429427c = str2;
        this.f429428d = arrayList;
        this.f429429e = bVar;
        this.f429430f = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47441e)) {
            return false;
        }
        C47441e c47441e = (C47441e) obj;
        return L.f(this.f429426b, c47441e.f429426b) && L.f(this.f429427c, c47441e.f429427c) && L.f(this.f429428d, c47441e.f429428d) && this.f429429e.equals(c47441e.f429429e) && L.f(this.f429430f, c47441e.f429430f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return getF301350b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF301350b() {
        return this.f429430f;
    }

    public final int hashCode() {
        String str = this.f429426b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f429427c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList = this.f429428d;
        return this.f429430f.hashCode() + ((this.f429429e.hashCode() + ((iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbGeoReferenceBlockItem(title=");
        sb2.append(this.f429426b);
        sb2.append(", address=");
        sb2.append(this.f429427c);
        sb2.append(", geoReferences=");
        sb2.append(this.f429428d);
        sb2.append(", redirectMap=");
        sb2.append(this.f429429e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f429430f, ')');
    }

    /* compiled from: SbGeoReferenceBlockItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqt0/e$a;", "", "a", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qt0.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<String> f429431a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f429432b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f429433c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C12341a f429434d;

        /* compiled from: SbGeoReferenceBlockItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt0/e$a$a;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qt0.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12341a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f429435a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f429436b;

            public C12341a(@l String str, @l String str2) {
                this.f429435a = str;
                this.f429436b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12341a)) {
                    return false;
                }
                C12341a c12341a = (C12341a) obj;
                return L.f(this.f429435a, c12341a.f429435a) && L.f(this.f429436b, c12341a.f429436b);
            }

            public final int hashCode() {
                String str = this.f429435a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f429436b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AfterWithIconItem(iconName=");
                sb2.append(this.f429435a);
                sb2.append(", text=");
                return C22026a.c(sb2, this.f429436b, ')');
            }
        }

        public a(@l List<String> list, @l String str, @l String str2, @l C12341a c12341a) {
            this.f429431a = list;
            this.f429432b = str;
            this.f429433c = str2;
            this.f429434d = c12341a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429431a, aVar.f429431a) && L.f(this.f429432b, aVar.f429432b) && L.f(this.f429433c, aVar.f429433c) && L.f(this.f429434d, aVar.f429434d);
        }

        public final int hashCode() {
            List<String> list = this.f429431a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f429432b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f429433c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C12341a c12341a = this.f429434d;
            return iHashCode3 + (c12341a != null ? c12341a.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "GeoReferenceItem(colors=" + this.f429431a + ", content=" + this.f429432b + ", after=" + this.f429433c + ", afterWithIcon=" + this.f429434d + ')';
        }

        public /* synthetic */ a(List list, String str, String str2, C12341a c12341a, int i12, C42822w c42822w) {
            this(list, str, str2, (i12 & 8) != 0 ? null : c12341a);
        }
    }
}
