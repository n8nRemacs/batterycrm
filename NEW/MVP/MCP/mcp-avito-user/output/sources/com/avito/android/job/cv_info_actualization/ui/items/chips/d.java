package com.avito.android.job.cv_info_actualization.ui.items.chips;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.design.chips.SelectStrategy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationChipsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/chips/d;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174243b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174244c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174245d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<a> f174246e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f174247f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SelectStrategy f174248g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f174249h;

    public d() {
        throw null;
    }

    public d(String str, String str2, String str3, List list, String str4, SelectStrategy selectStrategy, String str5, int i12, C42822w c42822w) {
        str5 = (i12 & 64) != 0 ? str : str5;
        this.f174243b = str;
        this.f174244c = str2;
        this.f174245d = str3;
        this.f174246e = list;
        this.f174247f = str4;
        this.f174248g = selectStrategy;
        this.f174249h = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f174243b, dVar.f174243b) && L.f(this.f174244c, dVar.f174244c) && L.f(this.f174245d, dVar.f174245d) && L.f(this.f174246e, dVar.f174246e) && L.f(this.f174247f, dVar.f174247f) && this.f174248g == dVar.f174248g && L.f(this.f174249h, dVar.f174249h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83915c() {
        return getF272592b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272592b() {
        return this.f174249h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f174243b.hashCode() * 31, 31, this.f174244c);
        String str = this.f174245d;
        int iE2 = H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f174246e);
        String str2 = this.f174247f;
        return this.f174249h.hashCode() + ((this.f174248g.hashCode() + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationChipsItem(formGroupId=");
        sb2.append(this.f174243b);
        sb2.append(", title=");
        sb2.append(this.f174244c);
        sb2.append(", subtitle=");
        sb2.append(this.f174245d);
        sb2.append(", items=");
        sb2.append(this.f174246e);
        sb2.append(", hint=");
        sb2.append(this.f174247f);
        sb2.append(", selectStrategy=");
        sb2.append(this.f174248g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f174249h, ')');
    }
}
