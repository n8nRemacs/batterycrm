package com.avito.android.job.interview.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sQ.C48095e;

/* compiled from: InvitationDraft.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/domain/i;", "", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<a> f174560a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C48095e f174561b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f174562c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f174563d;

    public i(@k List<a> list, @l C48095e c48095e, @l String str, boolean z12) {
        this.f174560a = list;
        this.f174561b = c48095e;
        this.f174562c = str;
        this.f174563d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f174560a, iVar.f174560a) && L.f(this.f174561b, iVar.f174561b) && L.f(this.f174562c, iVar.f174562c) && this.f174563d == iVar.f174563d;
    }

    public final int hashCode() {
        int iHashCode = this.f174560a.hashCode() * 31;
        C48095e c48095e = this.f174561b;
        int iHashCode2 = (iHashCode + (c48095e == null ? 0 : c48095e.hashCode())) * 31;
        String str = this.f174562c;
        return Boolean.hashCode(this.f174563d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InvitationDraft(dates=");
        sb2.append(this.f174560a);
        sb2.append(", location=");
        sb2.append(this.f174561b);
        sb2.append(", phone=");
        sb2.append(this.f174562c);
        sb2.append(", isValidLocation=");
        return r.x(sb2, this.f174563d, ')');
    }

    public /* synthetic */ i(List list, C48095e c48095e, String str, boolean z12, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : c48095e, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? true : z12);
    }
}
