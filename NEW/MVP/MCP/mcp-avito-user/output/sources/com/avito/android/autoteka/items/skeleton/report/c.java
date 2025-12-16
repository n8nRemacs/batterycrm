package com.avito.android.autoteka.items.skeleton.report;

import Y61.k;
import com.avito.android.autoteka.domain.AutotekaItems;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReportSkeletonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/skeleton/report/c;", "Lcom/avito/conveyor_item/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97027b;

    public c() {
        this(null, 1, null);
    }

    @Override // TV0.a
    public final long getId() {
        return getF86717b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF86717b() {
        return this.f97027b;
    }

    public c(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_REPORT_SKELETON";
        }
        this.f97027b = str;
    }
}
