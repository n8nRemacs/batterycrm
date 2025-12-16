package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/a;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174125a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f174126b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f174127c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f174128d;

    public a(@k String str, @l String str2, @k String str3, @k ArrayList arrayList) {
        this.f174125a = str;
        this.f174126b = str2;
        this.f174127c = arrayList;
        this.f174128d = str3;
    }

    public static a a(a aVar, ArrayList arrayList) {
        String str = aVar.f174125a;
        String str2 = aVar.f174126b;
        String str3 = aVar.f174128d;
        aVar.getClass();
        return new a(str, str2, str3, arrayList);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f174125a, aVar.f174125a) && L.f(this.f174126b, aVar.f174126b) && this.f174127c.equals(aVar.f174127c) && L.f(this.f174128d, aVar.f174128d);
    }

    public final int hashCode() {
        int iHashCode = this.f174125a.hashCode() * 31;
        String str = this.f174126b;
        return this.f174128d.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f174127c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvActualizationInfo(title=");
        sb2.append(this.f174125a);
        sb2.append(", subtitle=");
        sb2.append(this.f174126b);
        sb2.append(", blocks=");
        sb2.append(this.f174127c);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f174128d, ')');
    }
}
