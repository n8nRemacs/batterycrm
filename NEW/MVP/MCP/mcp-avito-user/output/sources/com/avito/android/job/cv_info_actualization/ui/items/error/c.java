package com.avito.android.job.cv_info_actualization.ui.items.error;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationErrorItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/error/c;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f174260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f174261c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f174262d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f174263e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f174264f;

    public c() {
        this(0, null, null, null, null, 31, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f174260b == cVar.f174260b && L.f(this.f174261c, cVar.f174261c) && L.f(this.f174262d, cVar.f174262d) && L.f(this.f174263e, cVar.f174263e) && L.f(this.f174264f, cVar.f174264f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return getF137415b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137415b() {
        return this.f174264f;
    }

    public final int hashCode() {
        return this.f174264f.hashCode() + com.avito.android.actions_sheet.a.f(this.f174263e, com.avito.android.actions_sheet.a.f(this.f174262d, com.avito.android.actions_sheet.a.f(this.f174261c, Integer.hashCode(this.f174260b) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationErrorItem(iconResAttr=");
        sb2.append(this.f174260b);
        sb2.append(", title=");
        sb2.append(this.f174261c);
        sb2.append(", subtitle=");
        sb2.append(this.f174262d);
        sb2.append(", buttonTitle=");
        sb2.append(this.f174263e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f174264f, ')');
    }

    public c(int i12, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, String str, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? R.attr.img_unknownError : i12;
        printableText = (i13 & 2) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_info_actualization_error_title, new Serializable[0]) : printableText;
        printableText2 = (i13 & 4) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_info_actualization_error_subtitle, new Serializable[0]) : printableText2;
        printableText3 = (i13 & 8) != 0 ? com.avito.android.printable_text.b.c(R.string.jsx_cv_info_actualization_error_button_text, new Serializable[0]) : printableText3;
        str = (i13 & 16) != 0 ? "ERROR_ITEM" : str;
        this.f174260b = i12;
        this.f174261c = printableText;
        this.f174262d = printableText2;
        this.f174263e = printableText3;
        this.f174264f = str;
    }
}
