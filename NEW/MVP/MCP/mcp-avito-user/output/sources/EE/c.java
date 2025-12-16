package ee;

import Wd.InterfaceC15745b;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CompleteRegistrationState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lee/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f395277g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f395278h = new c(new b(false, null, null), "", "", new InterfaceC15745b.C1278b(), InputType.f93479b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f395279b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f395280c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f395281d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15745b.C1278b f395282e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InputType f395283f;

    /* compiled from: CompleteRegistrationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lee/c$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CompleteRegistrationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/c$b;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395284a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f395285b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f395286c;

        public b() {
            this(false, null, null, 7, null);
        }

        public static b a(b bVar, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                z12 = bVar.f395284a;
            }
            PrintableText printableText = (i12 & 2) != 0 ? bVar.f395285b : null;
            PrintableText printableText2 = (i12 & 4) != 0 ? bVar.f395286c : null;
            bVar.getClass();
            return new b(z12, printableText, printableText2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f395284a == bVar.f395284a && L.f(this.f395285b, bVar.f395285b) && L.f(this.f395286c, bVar.f395286c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f395284a) * 31;
            PrintableText printableText = this.f395285b;
            int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
            PrintableText printableText2 = this.f395286c;
            return iHashCode2 + (printableText2 != null ? printableText2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(isLoading=");
            sb2.append(this.f395284a);
            sb2.append(", nameError=");
            sb2.append(this.f395285b);
            sb2.append(", passwordError=");
            return AK.c.m(sb2, this.f395286c, ')');
        }

        public b(boolean z12, @l PrintableText printableText, @l PrintableText printableText2) {
            this.f395284a = z12;
            this.f395285b = printableText;
            this.f395286c = printableText2;
        }

        public /* synthetic */ b(boolean z12, PrintableText printableText, PrintableText printableText2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : printableText, (i12 & 4) != 0 ? null : printableText2);
        }
    }

    public c(@k b bVar, @k String str, @k String str2, @k InterfaceC15745b.C1278b c1278b, @k InputType inputType) {
        this.f395279b = bVar;
        this.f395280c = str;
        this.f395281d = str2;
        this.f395282e = c1278b;
        this.f395283f = inputType;
    }

    public static c a(c cVar, b bVar, String str, String str2, InputType inputType, int i12) {
        if ((i12 & 1) != 0) {
            bVar = cVar.f395279b;
        }
        b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            str = cVar.f395280c;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = cVar.f395281d;
        }
        String str4 = str2;
        InterfaceC15745b.C1278b c1278b = cVar.f395282e;
        if ((i12 & 16) != 0) {
            inputType = cVar.f395283f;
        }
        cVar.getClass();
        return new c(bVar2, str3, str4, c1278b, inputType);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f395279b, cVar.f395279b) && L.f(this.f395280c, cVar.f395280c) && L.f(this.f395281d, cVar.f395281d) && L.f(this.f395282e, cVar.f395282e) && this.f395283f == cVar.f395283f;
    }

    public final int hashCode() {
        return this.f395283f.hashCode() + ((this.f395282e.hashCode() + H.d(H.d(this.f395279b.hashCode() * 31, 31, this.f395280c), 31, this.f395281d)) * 31);
    }

    @k
    public final String toString() {
        return "CompleteRegistrationState(viewState=" + this.f395279b + ", name=" + this.f395280c + ", password=" + this.f395281d + ", tracker=" + this.f395282e + ", focusedInput=" + this.f395283f + ')';
    }
}
