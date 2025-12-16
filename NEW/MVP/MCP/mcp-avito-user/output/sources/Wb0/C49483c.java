package wB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LwB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49483c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f441321f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C49483c f441322g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f441323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<b> f441324c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ApiError f441325d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441326e;

    /* compiled from: TariffCpxInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwB0/c$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wB0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TariffCpxInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwB0/c$b;", "", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wB0.c$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f441327a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f441328b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f441329c;

        /* compiled from: TariffCpxInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwB0/c$b$a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: wB0.c$b$a */
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final wZ.l f441330a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f441331b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AttributedText f441332c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final DeepLink f441333d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f441334e;

            public a(@l wZ.l lVar, @k String str, @k AttributedText attributedText, @l DeepLink deepLink, boolean z12) {
                this.f441330a = lVar;
                this.f441331b = str;
                this.f441332c = attributedText;
                this.f441333d = deepLink;
                this.f441334e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f441330a, aVar.f441330a) && L.f(this.f441331b, aVar.f441331b) && L.f(this.f441332c, aVar.f441332c) && L.f(this.f441333d, aVar.f441333d) && this.f441334e == aVar.f441334e;
            }

            public final int hashCode() {
                wZ.l lVar = this.f441330a;
                int iB2 = com.avito.android.actions_sheet.a.b(H.d((lVar == null ? 0 : lVar.hashCode()) * 31, 31, this.f441331b), 31, this.f441332c);
                DeepLink deepLink = this.f441333d;
                return Boolean.hashCode(this.f441334e) + ((iB2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LevelFeature(icon=");
                sb2.append(this.f441330a);
                sb2.append(", name=");
                sb2.append(this.f441331b);
                sb2.append(", description=");
                sb2.append(this.f441332c);
                sb2.append(", deeplink=");
                sb2.append(this.f441333d);
                sb2.append(", isEnabled=");
                return r.x(sb2, this.f441334e, ')');
            }
        }

        public b(@l AttributedText attributedText, @k List list, @l String str) {
            this.f441327a = attributedText;
            this.f441328b = str;
            this.f441329c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f441327a, bVar.f441327a) && L.f(this.f441328b, bVar.f441328b) && L.f(this.f441329c, bVar.f441329c);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f441327a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            String str = this.f441328b;
            return this.f441329c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FeatureGroup(name=");
            sb2.append(this.f441327a);
            sb2.append(", slug=");
            sb2.append(this.f441328b);
            sb2.append(", features=");
            return H.n(sb2, this.f441329c, ')');
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f441322g = new C49483c(c42784z0, c42784z0, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49483c(@k List<? extends com.avito.conveyor_item.a> list, @k List<b> list2, @l ApiError apiError, boolean z12) {
        this.f441323b = list;
        this.f441324c = list2;
        this.f441325d = apiError;
        this.f441326e = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C49483c a(C49483c c49483c, ArrayList arrayList, ApiError apiError, boolean z12, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = c49483c.f441323b;
        }
        List<b> list2 = c49483c.f441324c;
        if ((i12 & 4) != 0) {
            apiError = c49483c.f441325d;
        }
        if ((i12 & 8) != 0) {
            z12 = c49483c.f441326e;
        }
        c49483c.getClass();
        return new C49483c(list, list2, apiError, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49483c)) {
            return false;
        }
        C49483c c49483c = (C49483c) obj;
        return L.f(this.f441323b, c49483c.f441323b) && L.f(this.f441324c, c49483c.f441324c) && L.f(this.f441325d, c49483c.f441325d) && this.f441326e == c49483c.f441326e;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f441323b.hashCode() * 31, 31, this.f441324c);
        ApiError apiError = this.f441325d;
        return Boolean.hashCode(this.f441326e) + ((iE2 + (apiError == null ? 0 : apiError.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoState(items=");
        sb2.append(this.f441323b);
        sb2.append(", featureGroups=");
        sb2.append(this.f441324c);
        sb2.append(", error=");
        sb2.append(this.f441325d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f441326e, ')');
    }
}
