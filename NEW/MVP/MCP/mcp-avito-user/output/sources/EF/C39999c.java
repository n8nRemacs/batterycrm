package eF;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumRulesState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LeF/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eF.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C39999c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f395069g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C39999c f395070h;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f395071b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f395072c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C11063c f395073d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f395074e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f395075f;

    /* compiled from: FreemiumRulesState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeF/c$a;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395076a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f395077b;

        public a(@k String str, boolean z12) {
            this.f395076a = str;
            this.f395077b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395076a, aVar.f395076a) && this.f395077b == aVar.f395077b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395077b) + (this.f395076a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f395076a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f395077b, ')');
        }
    }

    /* compiled from: FreemiumRulesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeF/c$b;", "", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: FreemiumRulesState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeF/c$c;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eF.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11063c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395078a;

        /* renamed from: b, reason: collision with root package name */
        public final float f395079b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f395080c;

        public C11063c(@k String str, float f12, @k AttributedText attributedText) {
            this.f395078a = str;
            this.f395079b = f12;
            this.f395080c = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11063c)) {
                return false;
            }
            C11063c c11063c = (C11063c) obj;
            return L.f(this.f395078a, c11063c.f395078a) && Float.compare(this.f395079b, c11063c.f395079b) == 0 && L.f(this.f395080c, c11063c.f395080c);
        }

        public final int hashCode() {
            return this.f395080c.hashCode() + r.d(this.f395079b, this.f395078a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(counterText=");
            sb2.append(this.f395078a);
            sb2.append(", counterProgress=");
            sb2.append(this.f395079b);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f395080c, ')');
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f395070h = new C39999c(true, null, new C11063c("", 0.0f, new AttributedText("", c42784z0, 0, 4, null)), new AttributedText("", c42784z0, 0, 4, null), new a("", false));
    }

    public C39999c(boolean z12, @l Throwable th2, @k C11063c c11063c, @k AttributedText attributedText, @k a aVar) {
        this.f395071b = z12;
        this.f395072c = th2;
        this.f395073d = c11063c;
        this.f395074e = attributedText;
        this.f395075f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C39999c a(C39999c c39999c, boolean z12, ApiException apiException, a aVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c39999c.f395071b;
        }
        boolean z13 = z12;
        ApiException apiException2 = apiException;
        if ((i12 & 2) != 0) {
            apiException2 = c39999c.f395072c;
        }
        ApiException apiException3 = apiException2;
        C11063c c11063c = c39999c.f395073d;
        AttributedText attributedText = c39999c.f395074e;
        if ((i12 & 16) != 0) {
            aVar = c39999c.f395075f;
        }
        c39999c.getClass();
        return new C39999c(z13, apiException3, c11063c, attributedText, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39999c)) {
            return false;
        }
        C39999c c39999c = (C39999c) obj;
        return this.f395071b == c39999c.f395071b && L.f(this.f395072c, c39999c.f395072c) && L.f(this.f395073d, c39999c.f395073d) && L.f(this.f395074e, c39999c.f395074e) && L.f(this.f395075f, c39999c.f395075f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f395071b) * 31;
        Throwable th2 = this.f395072c;
        return this.f395075f.hashCode() + com.avito.android.actions_sheet.a.b((this.f395073d.hashCode() + ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31)) * 31, 31, this.f395074e);
    }

    @k
    public final String toString() {
        return "FreemiumRulesState(isLoading=" + this.f395071b + ", error=" + this.f395072c + ", header=" + this.f395073d + ", bodyText=" + this.f395074e + ", button=" + this.f395075f + ')';
    }
}
