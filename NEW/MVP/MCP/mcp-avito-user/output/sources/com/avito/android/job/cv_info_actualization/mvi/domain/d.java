package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/d;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174139a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174140b;

    public d(@k String str, @k String str2) {
        this.f174139a = str;
        this.f174140b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174139a, dVar.f174139a) && L.f(this.f174140b, dVar.f174140b);
    }

    public final int hashCode() {
        return this.f174140b.hashCode() + (this.f174139a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvActualizationInfoBlockItem(value=");
        sb2.append(this.f174139a);
        sb2.append(", label=");
        return C22026a.c(sb2, this.f174140b, ')');
    }
}
