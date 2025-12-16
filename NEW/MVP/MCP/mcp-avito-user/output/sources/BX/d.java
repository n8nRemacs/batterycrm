package BX;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.serp.Onboarding;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoyaltyEntryViewState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LBX/d;", "", "a", "b", "LBX/d$a;", "LBX/d$b;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Long f1452a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f1453b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Onboarding f1454c;

    /* compiled from: LoyaltyEntryViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBX/d$a;", "LBX/d;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f1455d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f1456e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f1457f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Onboarding f1458g;

        public a(@l Long l12, @l String str, @l String str2, @l Onboarding onboarding) {
            super(l12, str, str2, onboarding, null);
            this.f1455d = l12;
            this.f1456e = str;
            this.f1457f = str2;
            this.f1458g = onboarding;
        }

        @Override // BX.d
        @l
        /* renamed from: a, reason: from getter */
        public final Long getF1452a() {
            return this.f1455d;
        }

        @Override // BX.d
        @l
        /* renamed from: b, reason: from getter */
        public final Onboarding getF1454c() {
            return this.f1458g;
        }

        @Override // BX.d
        @l
        /* renamed from: c, reason: from getter */
        public final String getF1453b() {
            return this.f1457f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f1455d, aVar.f1455d) && L.f(this.f1456e, aVar.f1456e) && L.f(this.f1457f, aVar.f1457f) && L.f(this.f1458g, aVar.f1458g);
        }

        public final int hashCode() {
            Long l12 = this.f1455d;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f1456e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1457f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Onboarding onboarding = this.f1458g;
            return iHashCode3 + (onboarding != null ? onboarding.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(bonusesCount=" + this.f1455d + ", formattedBonusesCount=" + this.f1456e + ", uri=" + this.f1457f + ", onboarding=" + this.f1458g + ')';
        }
    }

    /* compiled from: LoyaltyEntryViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBX/d$b;", "LBX/d;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final b f1459d = new b();

        public b() {
            super(null, null, null, null, 15, null);
        }
    }

    public /* synthetic */ d(Long l12, String str, String str2, Onboarding onboarding, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : l12, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : onboarding, null);
    }

    @l
    /* renamed from: a, reason: from getter */
    public Long getF1452a() {
        return this.f1452a;
    }

    @l
    /* renamed from: b, reason: from getter */
    public Onboarding getF1454c() {
        return this.f1454c;
    }

    @l
    /* renamed from: c, reason: from getter */
    public String getF1453b() {
        return this.f1453b;
    }

    public d(Long l12, String str, String str2, Onboarding onboarding, C42822w c42822w) {
        this.f1452a = l12;
        this.f1453b = str2;
        this.f1454c = onboarding;
    }
}
