package BX;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoyaltyEntryViewAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LBX/a;", "", "a", "b", "c", "LBX/a$a;", "LBX/a$b;", "LBX/a$c;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: LoyaltyEntryViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBX/a$a;", "LBX/a;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BX.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0056a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0056a f1442a = new C0056a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0056a);
        }

        public final int hashCode() {
            return 1371390608;
        }

        @k
        public final String toString() {
            return "IconClick";
        }
    }

    /* compiled from: LoyaltyEntryViewAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBX/a$b;", "LBX/a;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1443a;

        public b(@k String str) {
            this.f1443a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f1443a, ((b) obj).f1443a);
        }

        public final int hashCode() {
            return this.f1443a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnboardingShown(onceShowId="), this.f1443a, ')');
        }
    }

    /* compiled from: LoyaltyEntryViewAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBX/a$c;", "LBX/a;", "<init>", "()V", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1444a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 166410997;
        }

        @k
        public final String toString() {
            return "ShowIcon";
        }
    }
}
