package com.avito.android.job.interview.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InvitationDraft.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/domain/a;", "", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f174539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f174540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f174541c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174542d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f174543e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f174544f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f174545g;

    public a(@k String str, int i12, int i13, @l String str2, @l String str3, @l String str4, boolean z12) {
        this.f174539a = str;
        this.f174540b = i12;
        this.f174541c = i13;
        this.f174542d = str2;
        this.f174543e = str3;
        this.f174544f = str4;
        this.f174545g = z12;
    }

    public static a a(a aVar, String str, int i12, int i13, String str2, String str3, String str4, boolean z12, int i14) {
        String str5 = (i14 & 1) != 0 ? aVar.f174539a : str;
        int i15 = (i14 & 2) != 0 ? aVar.f174540b : i12;
        int i16 = (i14 & 4) != 0 ? aVar.f174541c : i13;
        String str6 = (i14 & 8) != 0 ? aVar.f174542d : str2;
        String str7 = (i14 & 16) != 0 ? aVar.f174543e : str3;
        String str8 = (i14 & 32) != 0 ? aVar.f174544f : str4;
        boolean z13 = (i14 & 64) != 0 ? aVar.f174545g : z12;
        aVar.getClass();
        return new a(str5, i15, i16, str6, str7, str8, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f174539a, aVar.f174539a) && this.f174540b == aVar.f174540b && this.f174541c == aVar.f174541c && L.f(this.f174542d, aVar.f174542d) && L.f(this.f174543e, aVar.f174543e) && L.f(this.f174544f, aVar.f174544f) && this.f174545g == aVar.f174545g;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f174541c, r.e(this.f174540b, this.f174539a.hashCode() * 31, 31), 31);
        String str = this.f174542d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f174543e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f174544f;
        return Boolean.hashCode(this.f174545g) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateEntry(dateTitle=");
        sb2.append(this.f174539a);
        sb2.append(", month=");
        sb2.append(this.f174540b);
        sb2.append(", day=");
        sb2.append(this.f174541c);
        sb2.append(", timeTitle=");
        sb2.append(this.f174542d);
        sb2.append(", fromTime=");
        sb2.append(this.f174543e);
        sb2.append(", toTime=");
        sb2.append(this.f174544f);
        sb2.append(", isValid=");
        return r.x(sb2, this.f174545g, ')');
    }

    public /* synthetic */ a(String str, int i12, int i13, String str2, String str3, String str4, boolean z12, int i14, C42822w c42822w) {
        this(str, i12, i13, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? true : z12);
    }
}
