package zk;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.btob_business_trip.models.AdvantageInfo;
import com.avito.android.btob_business_trip.models.ConditionsInfo;
import com.avito.android.btob_business_trip.models.OnboardingInfo;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lzk/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C50579c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f444201e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C50579c f444202f = new C50579c(null, null, b.C12972b.f444208a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final OnboardingInfo f444203b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SelectItemsInfo f444204c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f444205d;

    /* compiled from: B2bBusinessTripInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/c$a;", "", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: B2bBusinessTripInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lzk/c$b;", "", "<init>", "()V", "a", "b", "c", "Lzk/c$b$a;", "Lzk/c$b$b;", "Lzk/c$b$c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zk.c$b */
    public static abstract class b {

        /* compiled from: B2bBusinessTripInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzk/c$b$a;", "Lzk/c$b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: zk.c$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f444206a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiError f444207b;

            public a(@k ApiError apiError, @k String str) {
                super(null);
                this.f444206a = str;
                this.f444207b = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f444206a, aVar.f444206a) && L.f(this.f444207b, aVar.f444207b);
            }

            public final int hashCode() {
                return this.f444207b.hashCode() + (this.f444206a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(message=");
                sb2.append(this.f444206a);
                sb2.append(", error=");
                return AK.c.n(sb2, this.f444207b, ')');
            }
        }

        /* compiled from: B2bBusinessTripInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk/c$b$b;", "Lzk/c$b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: zk.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12972b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C12972b f444208a = new C12972b();

            public C12972b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C12972b);
            }

            public final int hashCode() {
                return -1098612959;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: B2bBusinessTripInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzk/c$b$c;", "Lzk/c$b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: zk.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C12973c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f444209a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f444210b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final List<AdvantageInfo> f444211c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ConditionsInfo f444212d;

            public C12973c(@k String str, @k String str2, @k List<AdvantageInfo> list, @k ConditionsInfo conditionsInfo) {
                super(null);
                this.f444209a = str;
                this.f444210b = str2;
                this.f444211c = list;
                this.f444212d = conditionsInfo;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12973c)) {
                    return false;
                }
                C12973c c12973c = (C12973c) obj;
                return L.f(this.f444209a, c12973c.f444209a) && L.f(this.f444210b, c12973c.f444210b) && L.f(this.f444211c, c12973c.f444211c) && L.f(this.f444212d, c12973c.f444212d);
            }

            public final int hashCode() {
                return this.f444212d.hashCode() + H.e(H.d(this.f444209a.hashCode() * 31, 31, this.f444210b), 31, this.f444211c);
            }

            @k
            public final String toString() {
                return "OnboardingContent(title=" + this.f444209a + ", buttonTitle=" + this.f444210b + ", advantages=" + this.f444211c + ", conditions=" + this.f444212d + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public C50579c(@l OnboardingInfo onboardingInfo, @l SelectItemsInfo selectItemsInfo, @k b bVar) {
        this.f444203b = onboardingInfo;
        this.f444204c = selectItemsInfo;
        this.f444205d = bVar;
    }

    public static C50579c a(C50579c c50579c, b bVar) {
        OnboardingInfo onboardingInfo = c50579c.f444203b;
        SelectItemsInfo selectItemsInfo = c50579c.f444204c;
        c50579c.getClass();
        return new C50579c(onboardingInfo, selectItemsInfo, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50579c)) {
            return false;
        }
        C50579c c50579c = (C50579c) obj;
        return L.f(this.f444203b, c50579c.f444203b) && L.f(this.f444204c, c50579c.f444204c) && L.f(this.f444205d, c50579c.f444205d);
    }

    public final int hashCode() {
        OnboardingInfo onboardingInfo = this.f444203b;
        int iHashCode = (onboardingInfo == null ? 0 : onboardingInfo.hashCode()) * 31;
        SelectItemsInfo selectItemsInfo = this.f444204c;
        return this.f444205d.hashCode() + ((iHashCode + (selectItemsInfo != null ? selectItemsInfo.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "B2bBusinessTripInfoState(onboardingContent=" + this.f444203b + ", selectItemsInfo=" + this.f444204c + ", viewState=" + this.f444205d + ')';
    }
}
