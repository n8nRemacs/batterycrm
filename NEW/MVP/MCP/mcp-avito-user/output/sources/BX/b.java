package BX;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.serp.Onboarding;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoyaltyEntryViewInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LBX/b;", "", "a", "b", "c", "LBX/b$a;", "LBX/b$b;", "LBX/b$c;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: LoyaltyEntryViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBX/b$a;", "LBX/b;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f1445a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f1446b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f1447c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Onboarding f1448d;

        public a(@l Long l12, @l String str, @l String str2, @l Onboarding onboarding) {
            this.f1445a = l12;
            this.f1446b = str;
            this.f1447c = str2;
            this.f1448d = onboarding;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f1445a, aVar.f1445a) && L.f(this.f1446b, aVar.f1446b) && L.f(this.f1447c, aVar.f1447c) && L.f(this.f1448d, aVar.f1448d);
        }

        public final int hashCode() {
            Long l12 = this.f1445a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f1446b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1447c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Onboarding onboarding = this.f1448d;
            return iHashCode3 + (onboarding != null ? onboarding.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(bonusesCount=" + this.f1445a + ", formattedBonusesCount=" + this.f1446b + ", uri=" + this.f1447c + ", onboarding=" + this.f1448d + ')';
        }
    }

    /* compiled from: LoyaltyEntryViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBX/b$b;", "LBX/b;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BX.b$b, reason: collision with other inner class name */
    public static final class C0057b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0057b f1449a = new C0057b();
    }

    /* compiled from: LoyaltyEntryViewInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBX/b$c;", "LBX/b;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1450a = new c();
    }
}
