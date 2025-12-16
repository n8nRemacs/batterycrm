package com.avito.android.autoteka.items.reportGeneration;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReportGenerationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/reportGeneration/c;", "Lcom/avito/conveyor_item/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96965b;

    public c() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f96965b, ((c) obj).f96965b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF87412b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF87412b() {
        return this.f96965b;
    }

    public final int hashCode() {
        return this.f96965b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReportGenerationItem(stringId="), this.f96965b, ')');
    }

    public c(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_REPORT_GENERATION";
        }
        this.f96965b = str;
    }
}
