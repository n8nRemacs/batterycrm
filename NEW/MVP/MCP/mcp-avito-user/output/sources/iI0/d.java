package II0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.JobOnboardingButton;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PanelConfigState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LII0/d;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final GI0.a f8102a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f8103b;

    /* compiled from: PanelConfigState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LII0/d$a;", "", "a", "b", "c", "d", "LII0/d$a$a;", "LII0/d$a$b;", "LII0/d$a$c;", "LII0/d$a$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PanelConfigState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/d$a$a;", "LII0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: II0.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0457a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f8104a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f8105b;

            public C0457a(@k ApiError apiError, @l Throwable th2) {
                this.f8104a = apiError;
                this.f8105b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0457a)) {
                    return false;
                }
                C0457a c0457a = (C0457a) obj;
                return L.f(this.f8104a, c0457a.f8104a) && L.f(this.f8105b, c0457a.f8105b);
            }

            public final int hashCode() {
                int iHashCode = this.f8104a.hashCode() * 31;
                Throwable th2 = this.f8105b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(error=");
                sb2.append(this.f8104a);
                sb2.append(", cause=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f8105b, ')');
            }
        }

        /* compiled from: PanelConfigState.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/d$a$b;", "LII0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ArrayList f8106a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final PanelConfigItem.a f8107b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final PanelConfigItem.a f8108c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final PanelConfigItem.a f8109d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final JobOnboardingButton f8110e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final PanelConfigItem.d f8111f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final PanelConfigItem.d f8112g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final PanelConfigItem.a f8113h;

            /* renamed from: i, reason: collision with root package name */
            @l
            public final PanelConfigItem.d f8114i;

            /* renamed from: j, reason: collision with root package name */
            @l
            public final b.a f8115j;

            /* renamed from: k, reason: collision with root package name */
            @l
            public final List<DeepLink> f8116k;

            /* renamed from: l, reason: collision with root package name */
            @k
            public final kotlin.collections.builders.b f8117l;

            public b(@l ArrayList arrayList, @l PanelConfigItem.a aVar, @l PanelConfigItem.a aVar2, @l PanelConfigItem.a aVar3, @l JobOnboardingButton jobOnboardingButton, @l PanelConfigItem.d dVar, @l PanelConfigItem.d dVar2, @l PanelConfigItem.a aVar4, @l PanelConfigItem.d dVar3, @l b.a aVar5, @l List list) {
                this.f8106a = arrayList;
                this.f8107b = aVar;
                this.f8108c = aVar2;
                this.f8109d = aVar3;
                this.f8110e = jobOnboardingButton;
                this.f8111f = dVar;
                this.f8112g = dVar2;
                this.f8113h = aVar4;
                this.f8114i = dVar3;
                this.f8115j = aVar5;
                this.f8116k = list;
                kotlin.collections.builders.b bVarT = C42745f0.t();
                bVarT.addAll((Collection) (arrayList == null ? C42784z0.f406748b : arrayList));
                if (aVar != null) {
                    bVarT.add(aVar);
                }
                if (aVar2 != null) {
                    bVarT.add(aVar2);
                }
                if (aVar4 != null) {
                    bVarT.add(aVar4);
                }
                if (dVar != null) {
                    bVarT.add(dVar);
                }
                if (dVar2 != null) {
                    bVarT.add(dVar2);
                }
                if (dVar3 != null) {
                    bVarT.add(dVar3);
                }
                if (aVar3 != null) {
                    bVarT.add(aVar3);
                }
                this.f8117l = C42745f0.p(bVarT);
            }

            public static b a(b bVar, PanelConfigItem.a aVar, int i12) {
                if ((i12 & 4) != 0) {
                    aVar = bVar.f8108c;
                }
                return new b(bVar.f8106a, bVar.f8107b, aVar, bVar.f8109d, bVar.f8110e, bVar.f8111f, bVar.f8112g, bVar.f8113h, bVar.f8114i, (i12 & 512) != 0 ? bVar.f8115j : null, (i12 & 1024) != 0 ? bVar.f8116k : null);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f8106a, bVar.f8106a) && L.f(this.f8107b, bVar.f8107b) && L.f(this.f8108c, bVar.f8108c) && L.f(this.f8109d, bVar.f8109d) && L.f(this.f8110e, bVar.f8110e) && L.f(this.f8111f, bVar.f8111f) && L.f(this.f8112g, bVar.f8112g) && L.f(this.f8113h, bVar.f8113h) && L.f(this.f8114i, bVar.f8114i) && L.f(this.f8115j, bVar.f8115j) && L.f(this.f8116k, bVar.f8116k);
            }

            public final int hashCode() {
                ArrayList arrayList = this.f8106a;
                int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
                PanelConfigItem.a aVar = this.f8107b;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                PanelConfigItem.a aVar2 = this.f8108c;
                int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
                PanelConfigItem.a aVar3 = this.f8109d;
                int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
                JobOnboardingButton jobOnboardingButton = this.f8110e;
                int iHashCode5 = (iHashCode4 + (jobOnboardingButton == null ? 0 : jobOnboardingButton.hashCode())) * 31;
                PanelConfigItem.d dVar = this.f8111f;
                int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
                PanelConfigItem.d dVar2 = this.f8112g;
                int iHashCode7 = (iHashCode6 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                PanelConfigItem.a aVar4 = this.f8113h;
                int iHashCode8 = (iHashCode7 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
                PanelConfigItem.d dVar3 = this.f8114i;
                int iHashCode9 = (iHashCode8 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
                b.a aVar5 = this.f8115j;
                int iHashCode10 = (iHashCode9 + (aVar5 == null ? 0 : aVar5.f313259a.hashCode())) * 31;
                List<DeepLink> list = this.f8116k;
                return iHashCode10 + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(serviceBookingBlocks=");
                sb2.append(this.f8106a);
                sb2.append(", vasPlanBalanceBlock=");
                sb2.append(this.f8107b);
                sb2.append(", smbStatsBlock=");
                sb2.append(this.f8108c);
                sb2.append(", jobOnboardingBlock=");
                sb2.append(this.f8109d);
                sb2.append(", jobOnboardingButton=");
                sb2.append(this.f8110e);
                sb2.append(", publishBalanceBlock=");
                sb2.append(this.f8111f);
                sb2.append(", vasBalanceBlock=");
                sb2.append(this.f8112g);
                sb2.append(", promoBlock=");
                sb2.append(this.f8113h);
                sb2.append(", cpxBalanceBlock=");
                sb2.append(this.f8114i);
                sb2.append(", serviceNps=");
                sb2.append(this.f8115j);
                sb2.append(", uxFeedbackDeepLinks=");
                return H.p(sb2, this.f8116k, ')');
            }
        }

        /* compiled from: PanelConfigState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/d$a$c;", "LII0/d$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<HI0.a> f8118a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(@k List<? extends HI0.a> list) {
                this.f8118a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f8118a, ((c) obj).f8118a);
            }

            public final int hashCode() {
                return this.f8118a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Loading(loadingItems="), this.f8118a, ')');
            }
        }

        /* compiled from: PanelConfigState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/d$a$d;", "LII0/d$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: II0.d$a$d, reason: collision with other inner class name */
        public static final /* data */ class C0458d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0458d f8119a = new C0458d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C0458d);
            }

            public final int hashCode() {
                return 1370621864;
            }

            @k
            public final String toString() {
                return "None";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static d a(d dVar, a aVar) {
        GI0.a aVar2 = dVar.f8102a;
        dVar.getClass();
        return new d(aVar2, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f8102a, dVar.f8102a) && L.f(this.f8103b, dVar.f8103b);
    }

    public final int hashCode() {
        GI0.a aVar = this.f8102a;
        return this.f8103b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "PanelConfigState(itemsConfig=" + this.f8102a + ", viewState=" + this.f8103b + ')';
    }

    public d(@l GI0.a aVar, @k a aVar2) {
        this.f8102a = aVar;
        this.f8103b = aVar2;
    }

    public /* synthetic */ d(GI0.a aVar, a aVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar, (i12 & 2) != 0 ? a.C0458d.f8119a : aVar2);
    }
}
