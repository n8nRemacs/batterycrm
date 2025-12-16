package Ov;

import Ov.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Tariff.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOv/a;", "LOv/k;", "Lcom/avito/android/printable_text/PrintableText;", "name", "LOv/l$c;", "tariffId", "", "isSelectable", "isPriceEditable", "areDaysEditable", "isCustom", "", "description", "<init>", "(Lcom/avito/android/printable_text/PrintableText;Ljava/lang/String;ZZZZLjava/lang/String;Lkotlin/jvm/internal/w;)V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ov.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14738a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f12660a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f12661b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12662c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12663d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12664e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12665f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f12666g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f12667h;

    public C14738a(PrintableText printableText, String str, boolean z12, boolean z13, boolean z14, boolean z15, String str2, C42822w c42822w) {
        this.f12660a = printableText;
        this.f12661b = str;
        this.f12662c = z12;
        this.f12663d = z13;
        this.f12664e = z14;
        this.f12665f = z15;
        this.f12666g = str2;
        this.f12667h = str;
    }

    @Override // Ov.k
    /* renamed from: a, reason: from getter */
    public final boolean getF12675h() {
        return this.f12664e;
    }

    @Override // Ov.k
    /* renamed from: b, reason: from getter */
    public final boolean getF12673f() {
        return this.f12662c;
    }

    @Override // Ov.k
    public final l c() {
        return l.c.a(this.f12661b);
    }

    @Override // Ov.k
    /* renamed from: d, reason: from getter */
    public final boolean getF12674g() {
        return this.f12663d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14738a)) {
            return false;
        }
        C14738a c14738a = (C14738a) obj;
        return L.f(this.f12660a, c14738a.f12660a) && L.f(this.f12661b, c14738a.f12661b) && this.f12662c == c14738a.f12662c && this.f12663d == c14738a.f12663d && this.f12664e == c14738a.f12664e && this.f12665f == c14738a.f12665f && L.f(this.f12666g, c14738a.f12666g);
    }

    @Override // Ov.k
    @Y61.l
    /* renamed from: getDescription, reason: from getter */
    public final String getF12670c() {
        return this.f12666g;
    }

    @Override // Ov.k
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final PrintableText getF12669b() {
        return this.f12660a;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(r.i(H.d(this.f12660a.hashCode() * 31, 31, this.f12661b), 31, this.f12662c), 31, this.f12663d), 31, this.f12664e), 31, this.f12665f);
        String str = this.f12666g;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTariff(name=");
        sb2.append(this.f12660a);
        sb2.append(", tariffId=");
        sb2.append((Object) ("TermsType(termsType=" + this.f12661b + ')'));
        sb2.append(", isSelectable=");
        sb2.append(this.f12662c);
        sb2.append(", isPriceEditable=");
        sb2.append(this.f12663d);
        sb2.append(", areDaysEditable=");
        sb2.append(this.f12664e);
        sb2.append(", isCustom=");
        sb2.append(this.f12665f);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f12666g, ')');
    }
}
