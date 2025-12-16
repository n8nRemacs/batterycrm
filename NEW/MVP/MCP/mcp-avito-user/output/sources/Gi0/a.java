package GI0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.JobOnboardingButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemsConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGI0/a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6414a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6415b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC0341a.C0342a f6416c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InterfaceC0341a.C0342a f6417d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InterfaceC0341a.C0342a f6418e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final InterfaceC0341a.C0342a f6419f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final InterfaceC0341a.b<InterfaceC0341a.d> f6420g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final InterfaceC0341a.c f6421h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final InterfaceC0341a.c f6422i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final InterfaceC0341a.c f6423j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final JobOnboardingButton f6424k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final List<DeepLink> f6425l;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z12, boolean z13, @l InterfaceC0341a.C0342a c0342a, @l InterfaceC0341a.C0342a c0342a2, @l InterfaceC0341a.C0342a c0342a3, @l InterfaceC0341a.C0342a c0342a4, @l InterfaceC0341a.b<InterfaceC0341a.d> bVar, @l InterfaceC0341a.c cVar, @l InterfaceC0341a.c cVar2, @l InterfaceC0341a.c cVar3, @l JobOnboardingButton jobOnboardingButton, @l List<? extends DeepLink> list) {
        this.f6414a = z12;
        this.f6415b = z13;
        this.f6416c = c0342a;
        this.f6417d = c0342a2;
        this.f6418e = c0342a3;
        this.f6419f = c0342a4;
        this.f6420g = bVar;
        this.f6421h = cVar;
        this.f6422i = cVar2;
        this.f6423j = cVar3;
        this.f6424k = jobOnboardingButton;
        this.f6425l = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6414a == aVar.f6414a && this.f6415b == aVar.f6415b && L.f(this.f6416c, aVar.f6416c) && L.f(this.f6417d, aVar.f6417d) && L.f(this.f6418e, aVar.f6418e) && L.f(this.f6419f, aVar.f6419f) && L.f(this.f6420g, aVar.f6420g) && L.f(this.f6421h, aVar.f6421h) && L.f(this.f6422i, aVar.f6422i) && L.f(this.f6423j, aVar.f6423j) && L.f(this.f6424k, aVar.f6424k) && L.f(this.f6425l, aVar.f6425l);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f6414a) * 31, 31, this.f6415b);
        InterfaceC0341a.C0342a c0342a = this.f6416c;
        int iHashCode = (i12 + (c0342a == null ? 0 : c0342a.hashCode())) * 31;
        InterfaceC0341a.C0342a c0342a2 = this.f6417d;
        int iHashCode2 = (iHashCode + (c0342a2 == null ? 0 : c0342a2.hashCode())) * 31;
        InterfaceC0341a.C0342a c0342a3 = this.f6418e;
        int iHashCode3 = (iHashCode2 + (c0342a3 == null ? 0 : c0342a3.hashCode())) * 31;
        InterfaceC0341a.C0342a c0342a4 = this.f6419f;
        int iHashCode4 = (iHashCode3 + (c0342a4 == null ? 0 : c0342a4.hashCode())) * 31;
        InterfaceC0341a.b<InterfaceC0341a.d> bVar = this.f6420g;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.f6431a.hashCode())) * 31;
        InterfaceC0341a.c cVar = this.f6421h;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        InterfaceC0341a.c cVar2 = this.f6422i;
        int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        InterfaceC0341a.c cVar3 = this.f6423j;
        int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        JobOnboardingButton jobOnboardingButton = this.f6424k;
        int iHashCode9 = (iHashCode8 + (jobOnboardingButton == null ? 0 : jobOnboardingButton.hashCode())) * 31;
        List<DeepLink> list = this.f6425l;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemsConfig(isSearchAvailable=");
        sb2.append(this.f6414a);
        sb2.append(", servicesNpsEnabled=");
        sb2.append(this.f6415b);
        sb2.append(", smbStatsBlock=");
        sb2.append(this.f6416c);
        sb2.append(", jobOnboardingBlock=");
        sb2.append(this.f6417d);
        sb2.append(", promoBlock=");
        sb2.append(this.f6418e);
        sb2.append(", vasPlanBalanceLackBlock=");
        sb2.append(this.f6419f);
        sb2.append(", serviceBookingBlock=");
        sb2.append(this.f6420g);
        sb2.append(", publishBalanceBlock=");
        sb2.append(this.f6421h);
        sb2.append(", vasBalanceBlock=");
        sb2.append(this.f6422i);
        sb2.append(", cpxBalanceBlock=");
        sb2.append(this.f6423j);
        sb2.append(", jobOnboardingButton=");
        sb2.append(this.f6424k);
        sb2.append(", uxFeedbackDeepLinks=");
        return H.p(sb2, this.f6425l, ')');
    }

    /* compiled from: ItemsConfig.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LGI0/a$a;", "", "a", "b", "c", "d", "LGI0/a$a$a;", "LGI0/a$a$b;", "LGI0/a$a$c;", "LGI0/a$a$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GI0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0341a {

        /* compiled from: ItemsConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"LGI0/a$a$b;", "LGI0/a$a;", "T", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: GI0.a$a$b */
        public static final /* data */ class b<T extends InterfaceC0341a> implements InterfaceC0341a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ArrayList f6431a;

            public b(@k ArrayList arrayList) {
                this.f6431a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f6431a.equals(((b) obj).f6431a);
            }

            public final int hashCode() {
                return this.f6431a.hashCode();
            }

            @k
            public final String toString() {
                return e.p(new StringBuilder("Composite(blocks="), this.f6431a, ')');
            }
        }

        /* compiled from: ItemsConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGI0/a$a$c;", "LGI0/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: GI0.a$a$c */
        public static final /* data */ class c implements InterfaceC0341a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f6432a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f6433b;

            public c(@k String str, @k String str2) {
                this.f6432a = str;
                this.f6433b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f6432a, cVar.f6432a) && L.f(this.f6433b, cVar.f6433b);
            }

            public final int hashCode() {
                return this.f6433b.hashCode() + (this.f6432a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FlatCard(header=");
                sb2.append(this.f6432a);
                sb2.append(", value=");
                return C22026a.c(sb2, this.f6433b, ')');
            }
        }

        /* compiled from: ItemsConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGI0/a$a$d;", "LGI0/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: GI0.a$a$d */
        public static final /* data */ class d implements InterfaceC0341a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f6434a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f6435b;

            /* renamed from: c, reason: collision with root package name */
            public final int f6436c;

            /* renamed from: d, reason: collision with root package name */
            public final int f6437d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final DeepLink f6438e;

            public d(int i12, int i13, @k DeepLink deepLink, @k String str, @k String str2) {
                this.f6434a = str;
                this.f6435b = str2;
                this.f6436c = i12;
                this.f6437d = i13;
                this.f6438e = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f6434a, dVar.f6434a) && L.f(this.f6435b, dVar.f6435b) && this.f6436c == dVar.f6436c && this.f6437d == dVar.f6437d && L.f(this.f6438e, dVar.f6438e);
            }

            public final int hashCode() {
                return this.f6438e.hashCode() + r.e(this.f6437d, r.e(this.f6436c, H.d(this.f6434a.hashCode() * 31, 31, this.f6435b), 31), 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ProgressCard(title=");
                sb2.append(this.f6434a);
                sb2.append(", subtitle=");
                sb2.append(this.f6435b);
                sb2.append(", totalProgress=");
                sb2.append(this.f6436c);
                sb2.append(", currentProgress=");
                sb2.append(this.f6437d);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f6438e, ')');
            }
        }

        /* compiled from: ItemsConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGI0/a$a$a;", "LGI0/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: GI0.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0342a implements InterfaceC0341a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f6426a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f6427b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f6428c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Image f6429d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final String f6430e;

            public C0342a(@l DeepLink deepLink, @l Image image, @k String str, @l String str2, @l String str3) {
                this.f6426a = str;
                this.f6427b = str2;
                this.f6428c = deepLink;
                this.f6429d = image;
                this.f6430e = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0342a)) {
                    return false;
                }
                C0342a c0342a = (C0342a) obj;
                return L.f(this.f6426a, c0342a.f6426a) && L.f(this.f6427b, c0342a.f6427b) && L.f(this.f6428c, c0342a.f6428c) && L.f(this.f6429d, c0342a.f6429d) && L.f(this.f6430e, c0342a.f6430e);
            }

            public final int hashCode() {
                int iHashCode = this.f6426a.hashCode() * 31;
                String str = this.f6427b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                DeepLink deepLink = this.f6428c;
                int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                Image image = this.f6429d;
                int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
                String str2 = this.f6430e;
                return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Card(title=");
                sb2.append(this.f6426a);
                sb2.append(", subtitle=");
                sb2.append(this.f6427b);
                sb2.append(", deepLink=");
                sb2.append(this.f6428c);
                sb2.append(", image=");
                sb2.append(this.f6429d);
                sb2.append(", badgeTitle=");
                return C22026a.c(sb2, this.f6430e, ')');
            }

            public /* synthetic */ C0342a(String str, String str2, DeepLink deepLink, Image image, String str3, int i12, C42822w c42822w) {
                this(deepLink, (i12 & 8) != 0 ? null : image, str, str2, (i12 & 16) != 0 ? null : str3);
            }
        }
    }
}
