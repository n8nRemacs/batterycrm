package ML0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: StickersEditState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LML0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final C0676c f10600s = new C0676c(null);

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final c f10601t = new c(false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10602b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10603c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f10604d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Float f10605e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f10606f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f10607g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f10608h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f10609i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final g f10610j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<h> f10611k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f10612l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f10613m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final d f10614n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final e f10615o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final a f10616p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final b f10617q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Set<String> f10618r;

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10619a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f10620b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f10619a = str;
            this.f10620b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f10619a, aVar.f10619a) && L.f(this.f10620b, aVar.f10620b);
        }

        public final int hashCode() {
            return this.f10620b.hashCode() + (this.f10619a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f10619a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f10620b, ')');
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$b;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10621a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f10622b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f10623c;

        public b(@l Image image, @k String str, @l AttributedText attributedText) {
            this.f10621a = str;
            this.f10622b = attributedText;
            this.f10623c = image;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f10621a, bVar.f10621a) && L.f(this.f10622b, bVar.f10622b) && L.f(this.f10623c, bVar.f10623c);
        }

        public final int hashCode() {
            int iHashCode = this.f10621a.hashCode() * 31;
            AttributedText attributedText = this.f10622b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            Image image = this.f10623c;
            return iHashCode2 + (image != null ? image.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangesBlock(title=");
            sb2.append(this.f10621a);
            sb2.append(", description=");
            sb2.append(this.f10622b);
            sb2.append(", icon=");
            return AK.c.o(sb2, this.f10623c, ')');
        }
    }

    /* compiled from: StickersEditState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LML0/c$c;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ML0.c$c, reason: collision with other inner class name */
    public static final class C0676c {
        public /* synthetic */ C0676c(C42822w c42822w) {
            this();
        }

        public C0676c() {
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$d;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f10624a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10625b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10626c;

        public d() {
            this(null, false, false, 7, null);
        }

        public static d a(d dVar, String str, boolean z12, boolean z13, int i12) {
            if ((i12 & 1) != 0) {
                str = dVar.f10624a;
            }
            if ((i12 & 2) != 0) {
                z12 = dVar.f10625b;
            }
            if ((i12 & 4) != 0) {
                z13 = dVar.f10626c;
            }
            dVar.getClass();
            return new d(str, z12, z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f10624a, dVar.f10624a) && this.f10625b == dVar.f10625b && this.f10626c == dVar.f10626c;
        }

        public final int hashCode() {
            String str = this.f10624a;
            return Boolean.hashCode(this.f10626c) + r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f10625b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContinueButtonState(title=");
            sb2.append(this.f10624a);
            sb2.append(", isLoading=");
            sb2.append(this.f10625b);
            sb2.append(", isStylePrimary=");
            return r.x(sb2, this.f10626c, ')');
        }

        public d(@l String str, boolean z12, boolean z13) {
            this.f10624a = str;
            this.f10625b = z12;
            this.f10626c = z13;
        }

        public /* synthetic */ d(String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$e;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f10627a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f10628b;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f10627a == eVar.f10627a && L.f(this.f10628b, eVar.f10628b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f10627a) * 31;
            String str = this.f10628b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContinueFlowState(clicksCounter=");
            sb2.append(this.f10627a);
            sb2.append(", alertMessageText=");
            return C22026a.c(sb2, this.f10628b, ')');
        }

        public e(int i12, @l String str) {
            this.f10627a = i12;
            this.f10628b = str;
        }

        public /* synthetic */ e(int i12, String str, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$f;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f10629a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f10630b;

        public f(int i12, @k AttributedText attributedText) {
            this.f10629a = i12;
            this.f10630b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f10629a == fVar.f10629a && L.f(this.f10630b, fVar.f10630b);
        }

        public final int hashCode() {
            return this.f10630b.hashCode() + (Integer.hashCode(this.f10629a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(changesCount=");
            sb2.append(this.f10629a);
            sb2.append(", message=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f10630b, ')');
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$g;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10631a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<f> f10632b;

        public g(@k String str, @k List<f> list) {
            this.f10631a = str;
            this.f10632b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f10631a, gVar.f10631a) && L.f(this.f10632b, gVar.f10632b);
        }

        public final int hashCode() {
            return this.f10632b.hashCode() + (this.f10631a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Service(title=");
            sb2.append(this.f10631a);
            sb2.append(", descriptions=");
            return H.p(sb2, this.f10632b, ')');
        }
    }

    /* compiled from: StickersEditState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LML0/c$h;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f10633a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f10634b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f10635c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f10636d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f10637e;

        public /* synthetic */ h(String str, String str2, String str3, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(str, str2, z12, str3, (i12 & 16) != 0 ? true : z13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f10633a, hVar.f10633a) && L.f(this.f10634b, hVar.f10634b) && L.f(this.f10635c, hVar.f10635c) && this.f10636d == hVar.f10636d && this.f10637e == hVar.f10637e;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f10633a.hashCode() * 31, 31, this.f10634b);
            String str = this.f10635c;
            return Boolean.hashCode(this.f10637e) + r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f10636d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Sticker(id=");
            sb2.append(this.f10633a);
            sb2.append(", title=");
            sb2.append(this.f10634b);
            sb2.append(", descriptionForSeller=");
            sb2.append(this.f10635c);
            sb2.append(", isSelected=");
            sb2.append(this.f10636d);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f10637e, ')');
        }

        public h(@k String str, @k String str2, boolean z12, @l String str3, boolean z13) {
            this.f10633a = str;
            this.f10634b = str2;
            this.f10635c = str3;
            this.f10636d = z12;
            this.f10637e = z13;
        }
    }

    public c(boolean z12, boolean z13, @l String str, @l Float f12, @l String str2, @l AttributedText attributedText, @l Image image, @l Integer num, @l g gVar, @l List<h> list, @l String str3, @l String str4, @l d dVar, @l e eVar, @l a aVar, @l b bVar, @l Set<String> set) {
        this.f10602b = z12;
        this.f10603c = z13;
        this.f10604d = str;
        this.f10605e = f12;
        this.f10606f = str2;
        this.f10607g = attributedText;
        this.f10608h = image;
        this.f10609i = num;
        this.f10610j = gVar;
        this.f10611k = list;
        this.f10612l = str3;
        this.f10613m = str4;
        this.f10614n = dVar;
        this.f10615o = eVar;
        this.f10616p = aVar;
        this.f10617q = bVar;
        this.f10618r = set;
    }

    public static c a(c cVar, boolean z12, boolean z13, String str, Float f12, String str2, AttributedText attributedText, Image image, Integer num, g gVar, List list, String str3, String str4, d dVar, e eVar, a aVar, b bVar, Set set, int i12) {
        boolean z14 = (i12 & 1) != 0 ? cVar.f10602b : z12;
        boolean z15 = (i12 & 2) != 0 ? cVar.f10603c : z13;
        String str5 = (i12 & 4) != 0 ? cVar.f10604d : str;
        Float f13 = (i12 & 8) != 0 ? cVar.f10605e : f12;
        String str6 = (i12 & 16) != 0 ? cVar.f10606f : str2;
        AttributedText attributedText2 = (i12 & 32) != 0 ? cVar.f10607g : attributedText;
        Image image2 = (i12 & 64) != 0 ? cVar.f10608h : image;
        Integer num2 = (i12 & 128) != 0 ? cVar.f10609i : num;
        g gVar2 = (i12 & 256) != 0 ? cVar.f10610j : gVar;
        List list2 = (i12 & 512) != 0 ? cVar.f10611k : list;
        String str7 = (i12 & 1024) != 0 ? cVar.f10612l : str3;
        String str8 = (i12 & 2048) != 0 ? cVar.f10613m : str4;
        d dVar2 = (i12 & 4096) != 0 ? cVar.f10614n : dVar;
        e eVar2 = (i12 & 8192) != 0 ? cVar.f10615o : eVar;
        a aVar2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cVar.f10616p : aVar;
        b bVar2 = (i12 & 32768) != 0 ? cVar.f10617q : bVar;
        Set set2 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? cVar.f10618r : set;
        cVar.getClass();
        return new c(z14, z15, str5, f13, str6, attributedText2, image2, num2, gVar2, list2, str7, str8, dVar2, eVar2, aVar2, bVar2, set2);
    }

    @k
    public final Set<String> c() {
        Set<String> setP0;
        List<h> list = this.f10611k;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((h) obj).f10636d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).f10633a);
            }
            setP0 = C42745f0.P0(arrayList2);
        } else {
            setP0 = null;
        }
        return setP0 == null ? B0.f406639b : setP0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10602b == cVar.f10602b && this.f10603c == cVar.f10603c && L.f(this.f10604d, cVar.f10604d) && L.f(this.f10605e, cVar.f10605e) && L.f(this.f10606f, cVar.f10606f) && L.f(this.f10607g, cVar.f10607g) && L.f(this.f10608h, cVar.f10608h) && L.f(this.f10609i, cVar.f10609i) && L.f(this.f10610j, cVar.f10610j) && L.f(this.f10611k, cVar.f10611k) && L.f(this.f10612l, cVar.f10612l) && L.f(this.f10613m, cVar.f10613m) && L.f(this.f10614n, cVar.f10614n) && L.f(this.f10615o, cVar.f10615o) && L.f(this.f10616p, cVar.f10616p) && L.f(this.f10617q, cVar.f10617q) && L.f(this.f10618r, cVar.f10618r);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f10602b) * 31, 31, this.f10603c);
        String str = this.f10604d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Float f12 = this.f10605e;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str2 = this.f10606f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f10607g;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f10608h;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.f10609i;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        g gVar = this.f10610j;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<h> list = this.f10611k;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f10612l;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10613m;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d dVar = this.f10614n;
        int iHashCode11 = (iHashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f10615o;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        a aVar = this.f10616p;
        int iHashCode13 = (iHashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f10617q;
        int iHashCode14 = (iHashCode13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Set<String> set = this.f10618r;
        return iHashCode14 + (set != null ? set.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickersEditState(isClosable=");
        sb2.append(this.f10602b);
        sb2.append(", isLoading=");
        sb2.append(this.f10603c);
        sb2.append(", error=");
        sb2.append(this.f10604d);
        sb2.append(", progress=");
        sb2.append(this.f10605e);
        sb2.append(", title=");
        sb2.append(this.f10606f);
        sb2.append(", description=");
        sb2.append(this.f10607g);
        sb2.append(", icon=");
        sb2.append(this.f10608h);
        sb2.append(", maxSelectedCount=");
        sb2.append(this.f10609i);
        sb2.append(", service=");
        sb2.append(this.f10610j);
        sb2.append(", stickers=");
        sb2.append(this.f10611k);
        sb2.append(", emptyActionTitle=");
        sb2.append(this.f10612l);
        sb2.append(", selectedActionTitle=");
        sb2.append(this.f10613m);
        sb2.append(", continueButton=");
        sb2.append(this.f10614n);
        sb2.append(", continueFlow=");
        sb2.append(this.f10615o);
        sb2.append(", action=");
        sb2.append(this.f10616p);
        sb2.append(", changesBlock=");
        sb2.append(this.f10617q);
        sb2.append(", preselectedIds=");
        return AK.c.u(sb2, this.f10618r, ')');
    }
}
