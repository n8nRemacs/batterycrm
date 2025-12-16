package qt;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationCodeInputState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqt/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429389b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f429390c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f429391d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429392e;

    /* compiled from: JsxCvActualizationCodeInputState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqt/c$a;", "", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429393a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f429394b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f429393a == aVar.f429393a && L.f(this.f429394b, aVar.f429394b);
        }

        public final int hashCode() {
            return this.f429394b.hashCode() + (Boolean.hashCode(this.f429393a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CodeInputRetryButton(isEnabled=");
            sb2.append(this.f429393a);
            sb2.append(", text=");
            return AK.c.m(sb2, this.f429394b, ')');
        }

        public a(@k PrintableText printableText, boolean z12) {
            this.f429393a = z12;
            this.f429394b = printableText;
        }

        public /* synthetic */ a(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_actualization_retry_button_enabled, new Serializable[0]) : printableText, (i12 & 1) != 0 ? true : z12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(String str, a aVar, PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? new a(false, null, 3, 0 == true ? 1 : 0) : aVar, (i12 & 4) != 0 ? com.avito.android.printable_text.b.a() : printableText, (i12 & 8) != 0 ? false : z12);
    }

    public static c a(c cVar, a aVar, PrintableText printableText, boolean z12, int i12) {
        String str = cVar.f429389b;
        if ((i12 & 2) != 0) {
            aVar = cVar.f429390c;
        }
        if ((i12 & 4) != 0) {
            printableText = cVar.f429391d;
        }
        if ((i12 & 8) != 0) {
            z12 = cVar.f429392e;
        }
        cVar.getClass();
        return new c(str, aVar, printableText, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f429389b, cVar.f429389b) && L.f(this.f429390c, cVar.f429390c) && L.f(this.f429391d, cVar.f429391d) && this.f429392e == cVar.f429392e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f429392e) + com.avito.android.actions_sheet.a.f(this.f429391d, (this.f429390c.hashCode() + (this.f429389b.hashCode() * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationCodeInputState(phoneNumber=");
        sb2.append(this.f429389b);
        sb2.append(", button=");
        sb2.append(this.f429390c);
        sb2.append(", inputErrorText=");
        sb2.append(this.f429391d);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f429392e, ')');
    }

    public c(@k String str, @k a aVar, @k PrintableText printableText, boolean z12) {
        this.f429389b = str;
        this.f429390c = aVar;
        this.f429391d = printableText;
        this.f429392e = z12;
    }
}
