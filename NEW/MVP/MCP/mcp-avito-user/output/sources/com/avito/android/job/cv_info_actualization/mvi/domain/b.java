package com.avito.android.job.cv_info_actualization.mvi.domain;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvActualizationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/domain/b;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CvActualizationInfoBlockType f174129a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f174130b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174131c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174132d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f174133e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f174134f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f174135g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final c f174136h;

    public b(@k CvActualizationInfoBlockType cvActualizationInfoBlockType, @k e eVar, @k String str, @l String str2, @l String str3, @k ArrayList arrayList, @k List list, @l c cVar) {
        this.f174129a = cvActualizationInfoBlockType;
        this.f174130b = eVar;
        this.f174131c = str;
        this.f174132d = str2;
        this.f174133e = str3;
        this.f174134f = arrayList;
        this.f174135g = list;
        this.f174136h = cVar;
    }

    public static b a(b bVar, List list) {
        return new b(bVar.f174129a, bVar.f174130b, bVar.f174131c, bVar.f174132d, bVar.f174133e, bVar.f174134f, list, bVar.f174136h);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f174129a == bVar.f174129a && this.f174130b.equals(bVar.f174130b) && L.f(this.f174131c, bVar.f174131c) && L.f(this.f174132d, bVar.f174132d) && L.f(this.f174133e, bVar.f174133e) && this.f174134f.equals(bVar.f174134f) && L.f(this.f174135g, bVar.f174135g) && L.f(this.f174136h, bVar.f174136h);
    }

    public final int hashCode() {
        int iD2 = H.d((this.f174130b.hashCode() + (this.f174129a.hashCode() * 31)) * 31, 31, this.f174131c);
        String str = this.f174132d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f174133e;
        int iE2 = H.e(androidx.compose.ui.graphics.colorspace.e.g(this.f174134f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f174135g);
        c cVar = this.f174136h;
        return iE2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CvActualizationInfoBlock(type=" + this.f174129a + ", blockOptions=" + this.f174130b + ", title=" + this.f174131c + ", subtitle=" + this.f174132d + ", tipText=" + this.f174133e + ", items=" + this.f174134f + ", initialSelect=" + this.f174135g + ", action=" + this.f174136h + ')';
    }
}
