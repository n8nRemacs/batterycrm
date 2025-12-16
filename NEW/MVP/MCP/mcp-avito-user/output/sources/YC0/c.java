package yC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import iC0.f;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoV2State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LyC0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f442978h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f442979i;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final e f442980b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f442981c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f442982d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f442983e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Throwable f442984f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f442985g;

    /* compiled from: CptInfoV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/c$a;", "", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CptInfoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/c$b;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f442986a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f442987b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f442988c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f442989d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f442990e;

        public b(@k f fVar, @k String str, @l AttributedText attributedText, @l DeepLink deepLink, boolean z12) {
            this.f442986a = fVar;
            this.f442987b = str;
            this.f442988c = attributedText;
            this.f442989d = deepLink;
            this.f442990e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f442986a, bVar.f442986a) && L.f(this.f442987b, bVar.f442987b) && L.f(this.f442988c, bVar.f442988c) && L.f(this.f442989d, bVar.f442989d) && this.f442990e == bVar.f442990e;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f442986a.hashCode() * 31, 31, this.f442987b);
            AttributedText attributedText = this.f442988c;
            int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeepLink deepLink = this.f442989d;
            return Boolean.hashCode(this.f442990e) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CptInfoLevelFeature(icon=");
            sb2.append(this.f442986a);
            sb2.append(", name=");
            sb2.append(this.f442987b);
            sb2.append(", description=");
            sb2.append(this.f442988c);
            sb2.append(", deeplink=");
            sb2.append(this.f442989d);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f442990e, ')');
        }
    }

    /* compiled from: CptInfoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/c$c;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12894c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f442991a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f442992b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f442993c;

        public C12894c(@l AttributedText attributedText, @k List list, @l String str) {
            this.f442991a = attributedText;
            this.f442992b = str;
            this.f442993c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12894c)) {
                return false;
            }
            C12894c c12894c = (C12894c) obj;
            return L.f(this.f442991a, c12894c.f442991a) && L.f(this.f442992b, c12894c.f442992b) && L.f(this.f442993c, c12894c.f442993c);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f442991a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            String str = this.f442992b;
            return this.f442993c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CptInfoLevelFeatureGroup(name=");
            sb2.append(this.f442991a);
            sb2.append(", slug=");
            sb2.append(this.f442992b);
            sb2.append(", features=");
            return H.n(sb2, this.f442993c, ')');
        }
    }

    /* compiled from: CptInfoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/c$d;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f442994a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final iC0.e f442995b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f442996c;

        public d(@InterfaceC42150f int i12, @l iC0.e eVar, @k DeepLink deepLink) {
            this.f442994a = i12;
            this.f442995b = eVar;
            this.f442996c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f442994a == dVar.f442994a && L.f(this.f442995b, dVar.f442995b) && L.f(this.f442996c, dVar.f442996c);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f442994a) * 31;
            iC0.e eVar = this.f442995b;
            return this.f442996c.hashCode() + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HelpButton(icon=");
            sb2.append(this.f442994a);
            sb2.append(", color=");
            sb2.append(this.f442995b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f442996c, ')');
        }
    }

    /* compiled from: CptInfoV2State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/c$e;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f442997a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final d f442998b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f442999c;

        public e(@k String str, @l d dVar, boolean z12) {
            this.f442997a = str;
            this.f442998b = dVar;
            this.f442999c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f442997a, eVar.f442997a) && L.f(this.f442998b, eVar.f442998b) && this.f442999c == eVar.f442999c;
        }

        public final int hashCode() {
            int iHashCode = this.f442997a.hashCode() * 31;
            d dVar = this.f442998b;
            return Boolean.hashCode(this.f442999c) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavBarData(title=");
            sb2.append(this.f442997a);
            sb2.append(", helpButton=");
            sb2.append(this.f442998b);
            sb2.append(", showTopInfo=");
            return r.x(sb2, this.f442999c, ')');
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f442979i = new c(null, c42784z0, c42784z0, null, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l e eVar, @k List<? extends com.avito.conveyor_item.a> list, @k List<C12894c> list2, @l String str, @l Throwable th2, boolean z12) {
        this.f442980b = eVar;
        this.f442981c = list;
        this.f442982d = list2;
        this.f442983e = str;
        this.f442984f = th2;
        this.f442985g = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public static c a(c cVar, e eVar, ArrayList arrayList, String str, Throwable th2, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            eVar = cVar.f442980b;
        }
        e eVar2 = eVar;
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = cVar.f442981c;
        }
        List list2 = list;
        ?? r32 = cVar.f442982d;
        if ((i12 & 8) != 0) {
            str = cVar.f442983e;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            th2 = cVar.f442984f;
        }
        Throwable th3 = th2;
        if ((i12 & 32) != 0) {
            z12 = cVar.f442985g;
        }
        cVar.getClass();
        return new c(eVar2, list2, r32, str2, th3, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f442980b, cVar.f442980b) && L.f(this.f442981c, cVar.f442981c) && L.f(this.f442982d, cVar.f442982d) && L.f(this.f442983e, cVar.f442983e) && L.f(this.f442984f, cVar.f442984f) && this.f442985g == cVar.f442985g;
    }

    public final int hashCode() {
        e eVar = this.f442980b;
        int iA2 = C23088b.a(H.e((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f442981c), 31, this.f442982d);
        String str = this.f442983e;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.f442984f;
        return Boolean.hashCode(this.f442985g) + ((iHashCode + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptInfoV2State(navBarData=");
        sb2.append(this.f442980b);
        sb2.append(", items=");
        sb2.append(this.f442981c);
        sb2.append(", featureGroups=");
        sb2.append(this.f442982d);
        sb2.append(", remoteContext=");
        sb2.append(this.f442983e);
        sb2.append(", error=");
        sb2.append(this.f442984f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f442985g, ')');
    }
}
