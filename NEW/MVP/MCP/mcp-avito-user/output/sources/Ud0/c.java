package UD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49580d;

/* compiled from: TariffLfPublicationLevelState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LUD0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f16276j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final c f16277k = new c("", null, C42784z0.f406748b, null, null, null, true, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f16278b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f16279c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<b> f16280d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f16281e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C49580d f16282f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f16283g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16284h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16285i;

    /* compiled from: TariffLfPublicationLevelState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUD0/c$a;", "", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffLfPublicationLevelState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LUD0/c$b;", "Lcom/akita/compose/component/chips/b;", "a", "b", "c", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC27333b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f16286b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16287c;

        /* renamed from: d, reason: collision with root package name */
        public final long f16288d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<a> f16289e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final C1110b f16290f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final C1111c f16291g;

        /* compiled from: TariffLfPublicationLevelState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/c$b$a;", "", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f16292a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f16293b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f16294c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f16295d;

            public a(@k String str, @l String str2, @l String str3, @l DeepLink deepLink) {
                this.f16292a = str;
                this.f16293b = str2;
                this.f16294c = str3;
                this.f16295d = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f16292a, aVar.f16292a) && L.f(this.f16293b, aVar.f16293b) && L.f(this.f16294c, aVar.f16294c) && L.f(this.f16295d, aVar.f16295d);
            }

            public final int hashCode() {
                int iHashCode = this.f16292a.hashCode() * 31;
                String str = this.f16293b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f16294c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                DeepLink deepLink = this.f16295d;
                return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Feature(title=");
                sb2.append(this.f16292a);
                sb2.append(", statusIconName=");
                sb2.append(this.f16293b);
                sb2.append(", hintIconName=");
                sb2.append(this.f16294c);
                sb2.append(", hintIconUri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f16295d, ')');
            }
        }

        /* compiled from: TariffLfPublicationLevelState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/c$b$b;", "", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: UD0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1110b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f16296a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f16297b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f16298c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f16299d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final AttributedText f16300e;

            public C1110b(@k String str, @l String str2, @l DeepLink deepLink, @l String str3, @l AttributedText attributedText) {
                this.f16296a = str;
                this.f16297b = str2;
                this.f16298c = str3;
                this.f16299d = deepLink;
                this.f16300e = attributedText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1110b)) {
                    return false;
                }
                C1110b c1110b = (C1110b) obj;
                return L.f(this.f16296a, c1110b.f16296a) && L.f(this.f16297b, c1110b.f16297b) && L.f(this.f16298c, c1110b.f16298c) && L.f(this.f16299d, c1110b.f16299d) && L.f(this.f16300e, c1110b.f16300e);
            }

            public final int hashCode() {
                int iHashCode = this.f16296a.hashCode() * 31;
                String str = this.f16297b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f16298c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                DeepLink deepLink = this.f16299d;
                int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                AttributedText attributedText = this.f16300e;
                return iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LevelInfo(price=");
                sb2.append(this.f16296a);
                sb2.append(", bonuses=");
                sb2.append(this.f16297b);
                sb2.append(", hintIconName=");
                sb2.append(this.f16298c);
                sb2.append(", hintIconUri=");
                sb2.append(this.f16299d);
                sb2.append(", description=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f16300e, ')');
            }
        }

        /* compiled from: TariffLfPublicationLevelState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUD0/c$b$c;", "", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: UD0.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C1111c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f16301a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f16302b;

            public C1111c(@k String str, @l String str2) {
                this.f16301a = str;
                this.f16302b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1111c)) {
                    return false;
                }
                C1111c c1111c = (C1111c) obj;
                return L.f(this.f16301a, c1111c.f16301a) && L.f(this.f16302b, c1111c.f16302b);
            }

            public final int hashCode() {
                int iHashCode = this.f16301a.hashCode() * 31;
                String str = this.f16302b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PriceInfo(price=");
                sb2.append(this.f16301a);
                sb2.append(", oldPrice=");
                return C22026a.c(sb2, this.f16302b, ')');
            }
        }

        public b(@k String str, boolean z12, long j12, @k List<a> list, @k C1110b c1110b, @k C1111c c1111c) {
            this.f16286b = str;
            this.f16287c = z12;
            this.f16288d = j12;
            this.f16289e = list;
            this.f16290f = c1110b;
            this.f16291g = c1111c;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        /* renamed from: c */
        public final Integer getF60871f() {
            return null;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @InterfaceC42165v
        @l
        /* renamed from: d */
        public final Integer getF60870e() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16286b, bVar.f16286b) && this.f16287c == bVar.f16287c && this.f16288d == bVar.f16288d && L.f(this.f16289e, bVar.f16289e) && L.f(this.f16290f, bVar.f16290f) && L.f(this.f16291g, bVar.f16291g);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF17940b() {
            return this.f16286b;
        }

        public final int hashCode() {
            return this.f16291g.hashCode() + ((this.f16290f.hashCode() + H.e(r.g(r.i(this.f16286b.hashCode() * 31, 31, this.f16287c), 31, this.f16288d), 31, this.f16289e)) * 31);
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isActive */
        public final boolean getF99070e() {
            return true;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isEnabled */
        public final boolean getF442841e() {
            return true;
        }

        @Override // com.akita.compose.component.chips.InterfaceC27333b
        /* renamed from: isSelected, reason: from getter */
        public final boolean getF17943e() {
            return this.f16287c;
        }

        @k
        public final String toString() {
            return "Level(title=" + this.f16286b + ", isSelected=" + this.f16287c + ", levelId=" + this.f16288d + ", features=" + this.f16289e + ", levelInfo=" + this.f16290f + ", priceInfo=" + this.f16291g + ')';
        }
    }

    public c(@k String str, @l AttributedText attributedText, @k List<b> list, @l String str2, @l C49580d c49580d, @l Throwable th2, boolean z12, boolean z13) {
        this.f16278b = str;
        this.f16279c = attributedText;
        this.f16280d = list;
        this.f16281e = str2;
        this.f16282f = c49580d;
        this.f16283g = th2;
        this.f16284h = z12;
        this.f16285i = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Throwable] */
    public static c a(c cVar, ArrayList arrayList, ApiException apiException, boolean z12, boolean z13, int i12) {
        String str = cVar.f16278b;
        AttributedText attributedText = cVar.f16279c;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = cVar.f16280d;
        }
        List list2 = list;
        String str2 = cVar.f16281e;
        C49580d c49580d = cVar.f16282f;
        ApiException apiException2 = apiException;
        if ((i12 & 32) != 0) {
            apiException2 = cVar.f16283g;
        }
        ApiException apiException3 = apiException2;
        if ((i12 & 64) != 0) {
            z12 = cVar.f16284h;
        }
        boolean z14 = z12;
        if ((i12 & 128) != 0) {
            z13 = cVar.f16285i;
        }
        cVar.getClass();
        return new c(str, attributedText, list2, str2, c49580d, apiException3, z14, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f16278b, cVar.f16278b) && L.f(this.f16279c, cVar.f16279c) && L.f(this.f16280d, cVar.f16280d) && L.f(this.f16281e, cVar.f16281e) && L.f(this.f16282f, cVar.f16282f) && L.f(this.f16283g, cVar.f16283g) && this.f16284h == cVar.f16284h && this.f16285i == cVar.f16285i;
    }

    public final int hashCode() {
        int iHashCode = this.f16278b.hashCode() * 31;
        AttributedText attributedText = this.f16279c;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f16280d);
        String str = this.f16281e;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        C49580d c49580d = this.f16282f;
        int iHashCode3 = (iHashCode2 + (c49580d == null ? 0 : c49580d.hashCode())) * 31;
        Throwable th2 = this.f16283g;
        return Boolean.hashCode(this.f16285i) + r.i((iHashCode3 + (th2 != null ? th2.hashCode() : 0)) * 31, 31, this.f16284h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffLfPublicationLevelState(title=");
        sb2.append(this.f16278b);
        sb2.append(", description=");
        sb2.append(this.f16279c);
        sb2.append(", levels=");
        sb2.append(this.f16280d);
        sb2.append(", totalInfoTitle=");
        sb2.append(this.f16281e);
        sb2.append(", nextButton=");
        sb2.append(this.f16282f);
        sb2.append(", error=");
        sb2.append(this.f16283g);
        sb2.append(", isMainLoading=");
        sb2.append(this.f16284h);
        sb2.append(", isNextLoading=");
        return r.x(sb2, this.f16285i, ')');
    }
}
