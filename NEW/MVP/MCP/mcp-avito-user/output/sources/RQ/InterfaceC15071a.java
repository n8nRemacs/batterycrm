package Rq;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LRq/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LRq/a$a;", "LRq/a$b;", "LRq/a$c;", "LRq/a$d;", "LRq/a$e;", "LRq/a$f;", "LRq/a$g;", "LRq/a$h;", "LRq/a$i;", "LRq/a$j;", "LRq/a$k;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15071a {

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$a;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0984a implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14658a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f14659b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f14660c;

        public C0984a(@Y61.k DeepLink deepLink, @l Integer num, @l String str) {
            this.f14658a = deepLink;
            this.f14659b = num;
            this.f14660c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0984a)) {
                return false;
            }
            C0984a c0984a = (C0984a) obj;
            return L.f(this.f14658a, c0984a.f14658a) && L.f(this.f14659b, c0984a.f14659b) && L.f(this.f14660c, c0984a.f14660c);
        }

        public final int hashCode() {
            int iHashCode = this.f14658a.hashCode() * 31;
            Integer num = this.f14659b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f14660c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddMore(link=");
            sb2.append(this.f14658a);
            sb2.append(", itemsLimit=");
            sb2.append(this.f14659b);
            sb2.append(", limitedErrorText=");
            return C22026a.c(sb2, this.f14660c, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/a$b;", "LRq/a;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$b */
    public static final /* data */ class b implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f14661a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1801538918;
        }

        @Y61.k
        public final String toString() {
            return "HideBottomSheet";
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/a$c;", "LRq/a;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$c */
    public static final /* data */ class c implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f14662a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1715505687;
        }

        @Y61.k
        public final String toString() {
            return "LeaveScreen";
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$d;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$d */
    public static final /* data */ class d implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14663a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.comparison.items.header_item.b f14664b;

        public d(int i12, @Y61.k com.avito.android.comparison.items.header_item.b bVar) {
            this.f14663a = i12;
            this.f14664b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f14663a == dVar.f14663a && L.f(this.f14664b, dVar.f14664b);
        }

        public final int hashCode() {
            return this.f14664b.hashCode() + (Integer.hashCode(this.f14663a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "LockItem(itemPosition=" + this.f14663a + ", item=" + this.f14664b + ')';
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$e;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$e */
    public static final /* data */ class e implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f14665a;

        public e(@Y61.k ArrayList arrayList) {
            this.f14665a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f14665a.equals(((e) obj).f14665a);
        }

        public final int hashCode() {
            return this.f14665a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("OpenBottomSheet(buttons="), this.f14665a, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$f;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$f */
    public static final /* data */ class f implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.comparison.items.header_item.b f14666a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14667b;

        public f(@Y61.k com.avito.android.comparison.items.header_item.b bVar, @Y61.k DeepLink deepLink) {
            this.f14666a = bVar;
            this.f14667b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f14666a, fVar.f14666a) && L.f(this.f14667b, fVar.f14667b);
        }

        public final int hashCode() {
            return this.f14667b.hashCode() + (this.f14666a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenCallLink(item=");
            sb2.append(this.f14666a);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f14667b, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$g;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$g */
    public static final /* data */ class g implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14668a;

        public g(@Y61.k DeepLink deepLink) {
            this.f14668a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f14668a, ((g) obj).f14668a);
        }

        public final int hashCode() {
            return this.f14668a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenLink(link="), this.f14668a, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$h;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$h */
    public static final /* data */ class h implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f14669a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14670b;

        public h(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f14669a = str;
            this.f14670b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f14669a, hVar.f14669a) && L.f(this.f14670b, hVar.f14670b);
        }

        public final int hashCode() {
            return this.f14670b.hashCode() + (this.f14669a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenMessageLink(comparisonId=");
            sb2.append(this.f14669a);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f14670b, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/a$i;", "LRq/a;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$i */
    public static final /* data */ class i implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f14671a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 229273839;
        }

        @Y61.k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$k;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$k */
    public static final /* data */ class k implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14674a;

        public k(boolean z12) {
            this.f14674a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f14674a == ((k) obj).f14674a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14674a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("ShowJustDiff(needShowJustDiff="), this.f14674a, ')');
        }
    }

    /* compiled from: ComparisonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/a$j;", "LRq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.a$j */
    public static final /* data */ class j implements InterfaceC15071a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f14672a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f14673b;

        public j(@Y61.k String str, @l String str2) {
            this.f14672a = str;
            this.f14673b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f14672a, jVar.f14672a) && L.f(this.f14673b, jVar.f14673b);
        }

        public final int hashCode() {
            int iHashCode = this.f14672a.hashCode() * 31;
            String str = this.f14673b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveComparisonItem(comparisonItemId=");
            sb2.append(this.f14672a);
            sb2.append(", searchContext=");
            return C22026a.c(sb2, this.f14673b, ')');
        }

        public /* synthetic */ j(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }
}
