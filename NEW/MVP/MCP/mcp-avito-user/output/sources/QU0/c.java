package qu0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ServiceFeeConditionsState.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lqu0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final d f429476m = new d(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final c f429477n = new c(false, true, null, -1, null, null, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f429478b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429479c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f429480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f429481e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final f f429482f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f429483g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final g f429484h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<b> f429485i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final a f429486j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C12344c f429487k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final e f429488l;

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$a;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f429489a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final N f429490b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f429491c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f429492d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k Y41.a aVar, @k AttributedText attributedText, @k String str, @l String str2) {
            this.f429489a = attributedText;
            this.f429490b = (N) aVar;
            this.f429491c = str;
            this.f429492d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f429489a, aVar.f429489a) && L.f(this.f429490b, aVar.f429490b) && L.f(this.f429491c, aVar.f429491c) && L.f(this.f429492d, aVar.f429492d);
        }

        public final int hashCode() {
            int iD2 = H.d((this.f429490b.hashCode() + (this.f429489a.hashCode() * 31)) * 31, 31, this.f429491c);
            String str = this.f429492d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Banner(description=");
            sb2.append(this.f429489a);
            sb2.append(", tint=");
            sb2.append(this.f429490b);
            sb2.append(", text=");
            sb2.append(this.f429491c);
            sb2.append(", iconSymbol=");
            return C22026a.c(sb2, this.f429492d, ')');
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$b;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429493a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f429494b;

        public b(@k String str, @l String str2) {
            this.f429493a = str;
            this.f429494b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f429493a, bVar.f429493a) && L.f(this.f429494b, bVar.f429494b);
        }

        public final int hashCode() {
            int iHashCode = this.f429493a.hashCode() * 31;
            String str = this.f429494b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BulletsItem(text=");
            sb2.append(this.f429493a);
            sb2.append(", iconSymbol=");
            return C22026a.c(sb2, this.f429494b, ')');
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$c;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qu0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12344c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429495a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f429496b;

        public C12344c(@k String str, @l DeepLink deepLink) {
            this.f429495a = str;
            this.f429496b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12344c)) {
                return false;
            }
            C12344c c12344c = (C12344c) obj;
            return L.f(this.f429495a, c12344c.f429495a) && L.f(this.f429496b, c12344c.f429496b);
        }

        public final int hashCode() {
            int iHashCode = this.f429495a.hashCode() * 31;
            DeepLink deepLink = this.f429496b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseButton(title=");
            sb2.append(this.f429495a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f429496b, ')');
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqu0/c$d;", "", "<init>", "()V", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$e;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f429497a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f429498b;

        public e(@k String str, @k DeepLink deepLink) {
            this.f429497a = str;
            this.f429498b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f429497a, eVar.f429497a) && L.f(this.f429498b, eVar.f429498b);
        }

        public final int hashCode() {
            return this.f429498b.hashCode() + (this.f429497a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContinueButton(title=");
            sb2.append(this.f429497a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f429498b, ')');
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$f;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        public final float f429499a;

        public f(float f12) {
            this.f429499a = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.f429499a, ((f) obj).f429499a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f429499a);
        }

        @k
        public final String toString() {
            return r.k(')', this.f429499a, new StringBuilder("NavBar(progress="));
        }
    }

    /* compiled from: ServiceFeeConditionsState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqu0/c$g;", "", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f429500a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f429501b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f429502c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f429503d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f429504e;

        public g(@l Image image, @k String str, @k String str2, @k String str3, @k String str4) {
            this.f429500a = image;
            this.f429501b = str;
            this.f429502c = str2;
            this.f429503d = str3;
            this.f429504e = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f429500a, gVar.f429500a) && L.f(this.f429501b, gVar.f429501b) && L.f(this.f429502c, gVar.f429502c) && L.f(this.f429503d, gVar.f429503d) && L.f(this.f429504e, gVar.f429504e);
        }

        public final int hashCode() {
            Image image = this.f429500a;
            return this.f429504e.hashCode() + H.d(H.d(H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f429501b), 31, this.f429502c), 31, this.f429503d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Snippet(image=");
            sb2.append(this.f429500a);
            sb2.append(", mainValue=");
            sb2.append(this.f429501b);
            sb2.append(", primaryTitle=");
            sb2.append(this.f429502c);
            sb2.append(", secondaryTitle=");
            sb2.append(this.f429503d);
            sb2.append(", status=");
            return C22026a.c(sb2, this.f429504e, ')');
        }
    }

    public c(boolean z12, boolean z13, @l Throwable th2, @InterfaceC42165v int i12, @l f fVar, @l AttributedText attributedText, @l g gVar, @l List<b> list, @l a aVar, @l C12344c c12344c, @l e eVar) {
        this.f429478b = z12;
        this.f429479c = z13;
        this.f429480d = th2;
        this.f429481e = i12;
        this.f429482f = fVar;
        this.f429483g = attributedText;
        this.f429484h = gVar;
        this.f429485i = list;
        this.f429486j = aVar;
        this.f429487k = c12344c;
        this.f429488l = eVar;
    }

    public static c a(c cVar, boolean z12, boolean z13, ApiException apiException, int i12, f fVar, AttributedText attributedText, g gVar, ArrayList arrayList, a aVar, C12344c c12344c, e eVar, int i13) {
        boolean z14 = (i13 & 1) != 0 ? cVar.f429478b : z12;
        boolean z15 = (i13 & 2) != 0 ? cVar.f429479c : z13;
        Throwable th2 = (i13 & 4) != 0 ? cVar.f429480d : apiException;
        int i14 = (i13 & 8) != 0 ? cVar.f429481e : i12;
        f fVar2 = (i13 & 16) != 0 ? cVar.f429482f : fVar;
        AttributedText attributedText2 = (i13 & 32) != 0 ? cVar.f429483g : attributedText;
        g gVar2 = (i13 & 64) != 0 ? cVar.f429484h : gVar;
        List<b> list = (i13 & 128) != 0 ? cVar.f429485i : arrayList;
        a aVar2 = (i13 & 256) != 0 ? cVar.f429486j : aVar;
        C12344c c12344c2 = (i13 & 512) != 0 ? cVar.f429487k : c12344c;
        e eVar2 = (i13 & 1024) != 0 ? cVar.f429488l : eVar;
        cVar.getClass();
        return new c(z14, z15, th2, i14, fVar2, attributedText2, gVar2, list, aVar2, c12344c2, eVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f429478b == cVar.f429478b && this.f429479c == cVar.f429479c && L.f(this.f429480d, cVar.f429480d) && this.f429481e == cVar.f429481e && L.f(this.f429482f, cVar.f429482f) && L.f(this.f429483g, cVar.f429483g) && L.f(this.f429484h, cVar.f429484h) && L.f(this.f429485i, cVar.f429485i) && L.f(this.f429486j, cVar.f429486j) && L.f(this.f429487k, cVar.f429487k) && L.f(this.f429488l, cVar.f429488l);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f429478b) * 31, 31, this.f429479c);
        Throwable th2 = this.f429480d;
        int iE2 = r.e(this.f429481e, (i12 + (th2 == null ? 0 : th2.hashCode())) * 31, 31);
        f fVar = this.f429482f;
        int iHashCode = (iE2 + (fVar == null ? 0 : Float.hashCode(fVar.f429499a))) * 31;
        AttributedText attributedText = this.f429483g;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        g gVar = this.f429484h;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<b> list = this.f429485i;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.f429486j;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C12344c c12344c = this.f429487k;
        int iHashCode6 = (iHashCode5 + (c12344c == null ? 0 : c12344c.hashCode())) * 31;
        e eVar = this.f429488l;
        return iHashCode6 + (eVar != null ? eVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ServiceFeeConditionsState(isClosable=" + this.f429478b + ", isLoading=" + this.f429479c + ", error=" + this.f429480d + ", navigationIcon=" + this.f429481e + ", navBar=" + this.f429482f + ", title=" + this.f429483g + ", snippet=" + this.f429484h + ", bullets=" + this.f429485i + ", banner=" + this.f429486j + ", closeButton=" + this.f429487k + ", continueButton=" + this.f429488l + ')';
    }
}
