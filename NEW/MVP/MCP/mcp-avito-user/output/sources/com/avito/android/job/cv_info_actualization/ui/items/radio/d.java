package com.avito.android.job.cv_info_actualization.ui.items.radio;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationRadioListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/radio/d;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174299a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174300b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f174301c;

    public d(@k String str, @k String str2, boolean z12) {
        this.f174299a = str;
        this.f174300b = str2;
        this.f174301c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174299a, dVar.f174299a) && L.f(this.f174300b, dVar.f174300b) && this.f174301c == dVar.f174301c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174301c) + H.d(this.f174299a.hashCode() * 31, 31, this.f174300b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationRadioListItem(id=");
        sb2.append(this.f174299a);
        sb2.append(", title=");
        sb2.append(this.f174300b);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f174301c, ')');
    }
}
