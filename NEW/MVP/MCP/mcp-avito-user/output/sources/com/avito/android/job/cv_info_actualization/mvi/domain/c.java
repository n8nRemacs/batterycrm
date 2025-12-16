package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/c;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174137a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f174138b;

    public c(@k String str, @k DeepLink deepLink) {
        this.f174137a = str;
        this.f174138b = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f174137a, cVar.f174137a) && L.f(this.f174138b, cVar.f174138b);
    }

    public final int hashCode() {
        return this.f174138b.hashCode() + (this.f174137a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvActualizationInfoBlockAction(text=");
        sb2.append(this.f174137a);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f174138b, ')');
    }
}
