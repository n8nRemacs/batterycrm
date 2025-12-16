package xM0;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerificationContentPlaceholderState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxM0/b;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xM0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C49862b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f442417a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final PrintableText f442418b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final PrintableText f442419c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f442420d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f442421e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PrintableText f442422f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final View.OnClickListener f442423g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final View.OnClickListener f442424h;

    public C49862b(Integer num, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, PrintableText printableText4, PrintableText printableText5, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i12, C42822w c42822w) {
        onClickListener = (i12 & 64) != 0 ? null : onClickListener;
        onClickListener2 = (i12 & 128) != 0 ? null : onClickListener2;
        this.f442417a = num;
        this.f442418b = printableText;
        this.f442419c = printableText2;
        this.f442420d = printableText3;
        this.f442421e = printableText4;
        this.f442422f = printableText5;
        this.f442423g = onClickListener;
        this.f442424h = onClickListener2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49862b)) {
            return false;
        }
        C49862b c49862b = (C49862b) obj;
        return L.f(this.f442417a, c49862b.f442417a) && L.f(this.f442418b, c49862b.f442418b) && L.f(this.f442419c, c49862b.f442419c) && L.f(this.f442420d, c49862b.f442420d) && L.f(this.f442421e, c49862b.f442421e) && L.f(this.f442422f, c49862b.f442422f) && L.f(this.f442423g, c49862b.f442423g) && L.f(this.f442424h, c49862b.f442424h);
    }

    public final int hashCode() {
        Integer num = this.f442417a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PrintableText printableText = this.f442418b;
        int iHashCode2 = (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f442419c;
        int iHashCode3 = (iHashCode2 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
        PrintableText printableText3 = this.f442420d;
        int iHashCode4 = (iHashCode3 + (printableText3 == null ? 0 : printableText3.hashCode())) * 31;
        PrintableText printableText4 = this.f442421e;
        int iHashCode5 = (iHashCode4 + (printableText4 == null ? 0 : printableText4.hashCode())) * 31;
        PrintableText printableText5 = this.f442422f;
        int iHashCode6 = (iHashCode5 + (printableText5 == null ? 0 : printableText5.hashCode())) * 31;
        View.OnClickListener onClickListener = this.f442423g;
        int iHashCode7 = (iHashCode6 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View.OnClickListener onClickListener2 = this.f442424h;
        return iHashCode7 + (onClickListener2 != null ? onClickListener2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VerificationContentPlaceholderState(imgRes=" + this.f442417a + ", title=" + this.f442418b + ", subtitle=" + this.f442419c + ", errorCode=" + this.f442420d + ", firstButtonTitle=" + this.f442421e + ", secondButtonTitle=" + this.f442422f + ", firstButtonOnClickListener=" + this.f442423g + ", secondButtonOnClickListener=" + this.f442424h + ')';
    }
}
