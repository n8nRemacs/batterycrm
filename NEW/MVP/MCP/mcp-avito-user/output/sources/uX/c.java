package UX;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MandatoryVerificationState.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LUX/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "LUX/c$b;", "LUX/c$c;", "LUX/c$d;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f16431c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f16432d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MandatoryVerificationData f16433b;

    /* compiled from: MandatoryVerificationState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUX/c$a;", "", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MandatoryVerificationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUX/c$b;", "LUX/c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final MandatoryVerificationData f16434e;

        public b() {
            this(null, 1, null);
        }

        @Override // UX.c
        @k
        /* renamed from: c, reason: from getter */
        public final MandatoryVerificationData getF16433b() {
            return this.f16434e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f16434e, ((b) obj).f16434e);
        }

        public final int hashCode() {
            return this.f16434e.hashCode();
        }

        @k
        public final String toString() {
            return "Error(data=" + this.f16434e + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(MandatoryVerificationData mandatoryVerificationData, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                c.f16431c.getClass();
                mandatoryVerificationData = c.f16432d.f16437e;
            }
            super(mandatoryVerificationData, null);
            this.f16434e = mandatoryVerificationData;
        }
    }

    /* compiled from: MandatoryVerificationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUX/c$c;", "LUX/c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UX.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1129c extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final MandatoryVerificationData f16435e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final UX.d f16436f;

        public C1129c(@k MandatoryVerificationData mandatoryVerificationData, @k UX.d dVar) {
            super(mandatoryVerificationData, null);
            this.f16435e = mandatoryVerificationData;
            this.f16436f = dVar;
        }

        @Override // UX.c
        @k
        /* renamed from: c, reason: from getter */
        public final MandatoryVerificationData getF16433b() {
            return this.f16435e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1129c)) {
                return false;
            }
            C1129c c1129c = (C1129c) obj;
            return L.f(this.f16435e, c1129c.f16435e) && L.f(this.f16436f, c1129c.f16436f);
        }

        public final int hashCode() {
            return this.f16436f.f16438b.hashCode() + (this.f16435e.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Loaded(data=" + this.f16435e + ", viewState=" + this.f16436f + ')';
        }
    }

    /* compiled from: MandatoryVerificationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUX/c$d;", "LUX/c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final MandatoryVerificationData f16437e;

        public d() {
            this(null, 1, null);
        }

        @Override // UX.c
        @k
        /* renamed from: c, reason: from getter */
        public final MandatoryVerificationData getF16433b() {
            return this.f16437e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f16437e, ((d) obj).f16437e);
        }

        public final int hashCode() {
            return this.f16437e.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(data=" + this.f16437e + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(MandatoryVerificationData mandatoryVerificationData, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                c.f16431c.getClass();
                mandatoryVerificationData = c.f16432d.f16437e;
            }
            this(mandatoryVerificationData);
        }

        public d(@k MandatoryVerificationData mandatoryVerificationData) {
            super(mandatoryVerificationData, null);
            this.f16437e = mandatoryVerificationData;
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f16432d = new d(new MandatoryVerificationData(new MandatoryVerificationData.Header("", new AttributedText("", c42784z0, 0, 4, null)), new MandatoryVerificationData.Benefits("", c42784z0), new MandatoryVerificationData.AccountVerification("", "", new MandatoryVerificationData.Button("", new NoMatchLink(), "", ""), false, null, "", null, 64, null), new MandatoryVerificationData.ObjectVerification("", new AttributedText("", c42784z0, 0, 4, null), "", "", new MandatoryVerificationData.Button("", new NoMatchLink(), "", ""), false, c42784z0, "", "", "", "", "", 0L, "", null, null, 49152, null), new MandatoryVerificationData.Button("", new NoMatchLink(), "", ""), new AttributedText("", c42784z0, 0, 4, null), 0L));
    }

    public c(MandatoryVerificationData mandatoryVerificationData, C42822w c42822w) {
        this.f16433b = mandatoryVerificationData;
    }

    @k
    /* renamed from: c, reason: from getter */
    public MandatoryVerificationData getF16433b() {
        return this.f16433b;
    }
}
