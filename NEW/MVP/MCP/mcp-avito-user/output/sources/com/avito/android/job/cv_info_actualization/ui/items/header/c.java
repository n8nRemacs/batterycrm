package com.avito.android.job.cv_info_actualization.ui.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174276b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f174277c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f174278d;

    public c(String str, String str2, String str3, int i12, C42822w c42822w) {
        str3 = (i12 & 4) != 0 ? "HEADER_ITEM" : str3;
        this.f174276b = str;
        this.f174277c = str2;
        this.f174278d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f174276b, cVar.f174276b) && L.f(this.f174277c, cVar.f174277c) && L.f(this.f174278d, cVar.f174278d);
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
        return this.f174278d;
    }

    public final int hashCode() {
        int iHashCode = this.f174276b.hashCode() * 31;
        String str = this.f174277c;
        return this.f174278d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationHeaderItem(title=");
        sb2.append(this.f174276b);
        sb2.append(", subtitle=");
        sb2.append(this.f174277c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f174278d, ')');
    }
}
