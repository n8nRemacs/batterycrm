package com.avito.android.job.cv_info_actualization.ui.items.checkbox;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationCheckboxItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/c;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174222b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174223c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174224d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<d> f174225e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f174226f;

    public c() {
        throw null;
    }

    public c(String str, String str2, String str3, List list, String str4, int i12, C42822w c42822w) {
        str4 = (i12 & 16) != 0 ? str : str4;
        this.f174222b = str;
        this.f174223c = str2;
        this.f174224d = str3;
        this.f174225e = list;
        this.f174226f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f174222b, cVar.f174222b) && L.f(this.f174223c, cVar.f174223c) && L.f(this.f174224d, cVar.f174224d) && L.f(this.f174225e, cVar.f174225e) && L.f(this.f174226f, cVar.f174226f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79432j() {
        return getF163067b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163067b() {
        return this.f174226f;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f174222b.hashCode() * 31, 31, this.f174223c);
        String str = this.f174224d;
        return this.f174226f.hashCode() + H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f174225e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationCheckboxItem(formGroupId=");
        sb2.append(this.f174222b);
        sb2.append(", title=");
        sb2.append(this.f174223c);
        sb2.append(", subtitle=");
        sb2.append(this.f174224d);
        sb2.append(", values=");
        sb2.append(this.f174225e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f174226f, ')');
    }
}
