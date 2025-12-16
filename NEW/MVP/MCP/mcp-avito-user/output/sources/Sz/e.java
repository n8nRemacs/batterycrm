package sz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendReportState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f438950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f438951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C48437b f438952d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C48437b f438953e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C48436a f438954f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AttributedText f438955g;

    public e(@k PrintableText printableText, @k AttributedText attributedText, @k C48437b c48437b, @k C48437b c48437b2, @k C48436a c48436a, @k AttributedText attributedText2) {
        this.f438950b = printableText;
        this.f438951c = attributedText;
        this.f438952d = c48437b;
        this.f438953e = c48437b2;
        this.f438954f = c48436a;
        this.f438955g = attributedText2;
    }

    public static e a(e eVar, C48437b c48437b, C48437b c48437b2, C48436a c48436a, int i12) {
        PrintableText printableText = eVar.f438950b;
        AttributedText attributedText = eVar.f438951c;
        if ((i12 & 4) != 0) {
            c48437b = eVar.f438952d;
        }
        C48437b c48437b3 = c48437b;
        if ((i12 & 8) != 0) {
            c48437b2 = eVar.f438953e;
        }
        C48437b c48437b4 = c48437b2;
        if ((i12 & 16) != 0) {
            c48436a = eVar.f438954f;
        }
        AttributedText attributedText2 = eVar.f438955g;
        eVar.getClass();
        return new e(printableText, attributedText, c48437b3, c48437b4, c48436a, attributedText2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f438950b, eVar.f438950b) && L.f(this.f438951c, eVar.f438951c) && L.f(this.f438952d, eVar.f438952d) && L.f(this.f438953e, eVar.f438953e) && L.f(this.f438954f, eVar.f438954f) && L.f(this.f438955g, eVar.f438955g);
    }

    public final int hashCode() {
        return this.f438955g.hashCode() + ((this.f438954f.hashCode() + ((this.f438953e.hashCode() + ((this.f438952d.hashCode() + com.avito.android.actions_sheet.a.b(this.f438950b.hashCode() * 31, 31, this.f438951c)) * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendReportState(title=");
        sb2.append(this.f438950b);
        sb2.append(", subtitle=");
        sb2.append(this.f438951c);
        sb2.append(", phoneInput=");
        sb2.append(this.f438952d);
        sb2.append(", descriptionInput=");
        sb2.append(this.f438953e);
        sb2.append(", action=");
        sb2.append(this.f438954f);
        sb2.append(", legal=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f438955g, ')');
    }
}
