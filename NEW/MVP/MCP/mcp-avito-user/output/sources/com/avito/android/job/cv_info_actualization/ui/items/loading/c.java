package com.avito.android.job.cv_info_actualization.ui.items.loading;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationLoadingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/loading/c;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174286b;

    public c() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f174286b, ((c) obj).f174286b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF170863b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170863b() {
        return this.f174286b;
    }

    public final int hashCode() {
        return this.f174286b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("JsxCvInfoActualizationLoadingItem(stringId="), this.f174286b, ')');
    }

    public c(String str, int i12, C42822w c42822w) {
        this.f174286b = (i12 & 1) != 0 ? "LOADING_ITEM" : str;
    }
}
