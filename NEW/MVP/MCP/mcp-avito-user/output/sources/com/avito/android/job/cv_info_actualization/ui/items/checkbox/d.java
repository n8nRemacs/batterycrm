package com.avito.android.job.cv_info_actualization.ui.items.checkbox;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationCheckboxListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/checkbox/d;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174227a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f174229c;

    public d(@k String str, @k String str2, boolean z12) {
        this.f174227a = str;
        this.f174228b = str2;
        this.f174229c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174227a, dVar.f174227a) && L.f(this.f174228b, dVar.f174228b) && this.f174229c == dVar.f174229c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174229c) + H.d(this.f174227a.hashCode() * 31, 31, this.f174228b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationCheckboxListItem(id=");
        sb2.append(this.f174227a);
        sb2.append(", title=");
        sb2.append(this.f174228b);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f174229c, ')');
    }
}
