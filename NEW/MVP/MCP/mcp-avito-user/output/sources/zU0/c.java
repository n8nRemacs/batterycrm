package Zu0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServicesOnboardingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LZu0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f20555h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f20556i = new c(C42784z0.f406748b, null, null, null, null, true, 16, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<d> f20557b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a f20558c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f20559d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f20560e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ApiError f20561f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20562g;

    /* compiled from: ServicesOnboardingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu0/c$a;", "", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20563a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f20564b;

        public a(@k String str, @l DeepLink deepLink) {
            this.f20563a = str;
            this.f20564b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f20563a, aVar.f20563a) && L.f(this.f20564b, aVar.f20564b);
        }

        public final int hashCode() {
            int iHashCode = this.f20563a.hashCode() * 31;
            DeepLink deepLink = this.f20564b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f20563a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f20564b, ')');
        }
    }

    /* compiled from: ServicesOnboardingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZu0/c$b;", "", "<init>", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ServicesOnboardingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu0/c$c;", "", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zu0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1471c {

        /* renamed from: a, reason: collision with root package name */
        public final int f20565a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20566b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Map<String, String> f20567c;

        public C1471c(int i12, int i13, @l Map<String, String> map) {
            this.f20565a = i12;
            this.f20566b = i13;
            this.f20567c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1471c)) {
                return false;
            }
            C1471c c1471c = (C1471c) obj;
            return this.f20565a == c1471c.f20565a && this.f20566b == c1471c.f20566b && L.f(this.f20567c, c1471c.f20567c);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f20566b, Integer.hashCode(this.f20565a) * 31, 31);
            Map<String, String> map = this.f20567c;
            return iE2 + (map == null ? 0 : map.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Event(id=");
            sb2.append(this.f20565a);
            sb2.append(", version=");
            sb2.append(this.f20566b);
            sb2.append(", params=");
            return r.w(sb2, this.f20567c, ')');
        }
    }

    /* compiled from: ServicesOnboardingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu0/c$d;", "Lcom/avito/conveyor_item/a;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements com.avito.conveyor_item.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f20568b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalImage f20569c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f20570d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final AttributedText f20571e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final C1471c f20572f;

        public d(@k String str, @k UniversalImage universalImage, @k String str2, @k AttributedText attributedText, @l C1471c c1471c) {
            this.f20568b = str;
            this.f20569c = universalImage;
            this.f20570d = str2;
            this.f20571e = attributedText;
            this.f20572f = c1471c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f20568b, dVar.f20568b) && L.f(this.f20569c, dVar.f20569c) && L.f(this.f20570d, dVar.f20570d) && L.f(this.f20571e, dVar.f20571e) && L.f(this.f20572f, dVar.f20572f);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF124012b() {
            return getF285028b().hashCode();
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF285028b() {
            return this.f20568b;
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(H.d(com.avito.android.actions_sheet.a.a(this.f20568b.hashCode() * 31, 31, this.f20569c), 31, this.f20570d), 31, this.f20571e);
            C1471c c1471c = this.f20572f;
            return iB2 + (c1471c == null ? 0 : c1471c.hashCode());
        }

        @k
        public final String toString() {
            return "OnboardingStep(stringId=" + this.f20568b + ", image=" + this.f20569c + ", title=" + this.f20570d + ", description=" + this.f20571e + ", stepOpenedEvent=" + this.f20572f + ')';
        }
    }

    public /* synthetic */ c(List list, a aVar, a aVar2, a aVar3, ApiError apiError, boolean z12, int i12, C42822w c42822w) {
        this(list, aVar, aVar2, aVar3, (i12 & 16) != 0 ? null : apiError, z12);
    }

    public static c a(c cVar, a aVar, ApiError apiError, boolean z12, int i12) {
        List<d> list = cVar.f20557b;
        if ((i12 & 2) != 0) {
            aVar = cVar.f20558c;
        }
        a aVar2 = aVar;
        a aVar3 = cVar.f20559d;
        a aVar4 = cVar.f20560e;
        if ((i12 & 16) != 0) {
            apiError = cVar.f20561f;
        }
        ApiError apiError2 = apiError;
        if ((i12 & 32) != 0) {
            z12 = cVar.f20562g;
        }
        cVar.getClass();
        return new c(list, aVar2, aVar3, aVar4, apiError2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f20557b, cVar.f20557b) && L.f(this.f20558c, cVar.f20558c) && L.f(this.f20559d, cVar.f20559d) && L.f(this.f20560e, cVar.f20560e) && L.f(this.f20561f, cVar.f20561f) && this.f20562g == cVar.f20562g;
    }

    public final int hashCode() {
        int iHashCode = this.f20557b.hashCode() * 31;
        a aVar = this.f20558c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f20559d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f20560e;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        ApiError apiError = this.f20561f;
        return Boolean.hashCode(this.f20562g) + ((iHashCode4 + (apiError != null ? apiError.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesOnboardingState(steps=");
        sb2.append(this.f20557b);
        sb2.append(", activeAction=");
        sb2.append(this.f20558c);
        sb2.append(", finishOnboardingAction=");
        sb2.append(this.f20559d);
        sb2.append(", localNextAction=");
        sb2.append(this.f20560e);
        sb2.append(", error=");
        sb2.append(this.f20561f);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f20562g, ')');
    }

    public c(@k List<d> list, @l a aVar, @l a aVar2, @l a aVar3, @l ApiError apiError, boolean z12) {
        this.f20557b = list;
        this.f20558c = aVar;
        this.f20559d = aVar2;
        this.f20560e = aVar3;
        this.f20561f = apiError;
        this.f20562g = z12;
    }
}
