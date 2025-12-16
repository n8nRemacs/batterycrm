package NM0;

import CM0.e;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.verification.verification_disclaimer.VerificationDisclaimerScreenData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LNM0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LNM0/c$a;", "LNM0/c$b;", "LNM0/c$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c extends q {

    /* compiled from: DisclaimerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNM0/c$a;", "LNM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f11389b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final e f11390c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f11389b, aVar.f11389b) && L.f(this.f11390c, aVar.f11390c);
        }

        public final int hashCode() {
            String str = this.f11389b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            e eVar = this.f11390c;
            return iHashCode + (eVar != null ? eVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Error(errorId=" + this.f11389b + ", screenData=" + this.f11390c + ')';
        }

        public a(@l e eVar, @l String str) {
            super(null);
            this.f11389b = str;
            this.f11390c = eVar;
        }

        public /* synthetic */ a(String str, e eVar, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : eVar, (i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: DisclaimerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNM0/c$b;", "LNM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final VerificationDisclaimerScreenData f11391b;

        public b(@k VerificationDisclaimerScreenData verificationDisclaimerScreenData) {
            super(null);
            this.f11391b = verificationDisclaimerScreenData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f11391b, ((b) obj).f11391b);
        }

        public final int hashCode() {
            return this.f11391b.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(screenData=" + this.f11391b + ')';
        }
    }

    /* compiled from: DisclaimerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNM0/c$c;", "LNM0/c;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: NM0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0731c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0731c f11392b = new C0731c();

        public C0731c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0731c);
        }

        public final int hashCode() {
            return 1394736766;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
