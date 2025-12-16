package com.avito.android.job.cv_info_actualization.ui.items.radio;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvInfoActualizationRadioItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/radio/c;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174292b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f174293c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f174294d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f174295e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f174296f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<d> f174297g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f174298h;

    public c() {
        throw null;
    }

    public c(String str, String str2, String str3, DeepLink deepLink, String str4, List list, String str5, int i12, C42822w c42822w) {
        str5 = (i12 & 64) != 0 ? str : str5;
        this.f174292b = str;
        this.f174293c = str2;
        this.f174294d = str3;
        this.f174295e = deepLink;
        this.f174296f = str4;
        this.f174297g = list;
        this.f174298h = str5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f174292b, cVar.f174292b) && L.f(this.f174293c, cVar.f174293c) && L.f(this.f174294d, cVar.f174294d) && L.f(this.f174295e, cVar.f174295e) && L.f(this.f174296f, cVar.f174296f) && L.f(this.f174297g, cVar.f174297g) && L.f(this.f174298h, cVar.f174298h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF137846b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137846b() {
        return this.f174298h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f174292b.hashCode() * 31, 31, this.f174293c);
        String str = this.f174294d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f174295e;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.f174296f;
        return this.f174298h.hashCode() + H.e((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f174297g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvInfoActualizationRadioItem(formGroupId=");
        sb2.append(this.f174292b);
        sb2.append(", title=");
        sb2.append(this.f174293c);
        sb2.append(", subtitle=");
        sb2.append(this.f174294d);
        sb2.append(", action=");
        sb2.append(this.f174295e);
        sb2.append(", actionTitle=");
        sb2.append(this.f174296f);
        sb2.append(", listItems=");
        sb2.append(this.f174297g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f174298h, ')');
    }
}
