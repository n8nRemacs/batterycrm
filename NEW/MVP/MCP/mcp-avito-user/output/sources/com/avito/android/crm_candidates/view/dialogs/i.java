package com.avito.android.crm_candidates.view.dialogs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmOptionsFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/dialogs/i;", "", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f129991a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f129992b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f129993c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f129994d;

    public i() {
        throw null;
    }

    public i(String str, String str2, Integer num, Y41.a aVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        num = (i12 & 4) != 0 ? null : num;
        this.f129991a = str;
        this.f129992b = str2;
        this.f129993c = num;
        this.f129994d = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f129991a, iVar.f129991a) && L.f(this.f129992b, iVar.f129992b) && L.f(this.f129993c, iVar.f129993c) && L.f(this.f129994d, iVar.f129994d);
    }

    public final int hashCode() {
        String str = this.f129991a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f129992b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f129993c;
        return this.f129994d.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptionAction(title=");
        sb2.append(this.f129991a);
        sb2.append(", description=");
        sb2.append(this.f129992b);
        sb2.append(", count=");
        sb2.append(this.f129993c);
        sb2.append(", action=");
        return r.v(sb2, this.f129994d, ')');
    }
}
