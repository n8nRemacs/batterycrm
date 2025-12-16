package com.avito.android.publish.scanner;

import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecognitionErrorDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner/f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f239210a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PrintableText f239211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f239212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PrintableText f239213d;

    public f(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.k PrintableText printableText3, @Y61.k PrintableText printableText4) {
        this.f239210a = printableText;
        this.f239211b = printableText2;
        this.f239212c = printableText3;
        this.f239213d = printableText4;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f239210a, fVar.f239210a) && L.f(this.f239211b, fVar.f239211b) && L.f(this.f239212c, fVar.f239212c) && L.f(this.f239213d, fVar.f239213d);
    }

    public final int hashCode() {
        int iHashCode = this.f239210a.hashCode() * 31;
        PrintableText printableText = this.f239211b;
        return this.f239213d.hashCode() + com.avito.android.actions_sheet.a.f(this.f239212c, (iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecognizeErrorTexts(title=");
        sb2.append(this.f239210a);
        sb2.append(", message=");
        sb2.append(this.f239211b);
        sb2.append(", retryButtonLabel=");
        sb2.append(this.f239212c);
        sb2.append(", cancelButtonLabel=");
        return AK.c.m(sb2, this.f239213d, ')');
    }
}
