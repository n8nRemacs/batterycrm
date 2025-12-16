package com.avito.android.autoteka.items.fullScreenError.report;

import Y61.k;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReportErrorItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/report/c;", "Lcom/avito/conveyor_item/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96807b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f96808c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f96809d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f96810e;

    public c(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_REPORT_ERROR";
        }
        this.f96807b = str;
        this.f96808c = printableText;
        this.f96809d = printableText2;
        this.f96810e = printableText3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94474b() {
        return getF96818b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96818b() {
        return this.f96807b;
    }
}
