package com.avito.android.publish.slots.cv_upload.item.cv_upload_banner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cv_upload_banner/d;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243416c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f243417d;

    public d(@k String str, @k String str2, @k ArrayList arrayList) {
        this.f243415b = str;
        this.f243416c = str2;
        this.f243417d = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f243415b, dVar.f243415b) && L.f(this.f243416c, dVar.f243416c) && this.f243417d.equals(dVar.f243417d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF243284b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243284b() {
        return this.f243415b;
    }

    public final int hashCode() {
        return this.f243417d.hashCode() + H.d(this.f243415b.hashCode() * 31, 31, this.f243416c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvUploadBannerItem(stringId=");
        sb2.append(this.f243415b);
        sb2.append(", title=");
        sb2.append(this.f243416c);
        sb2.append(", actions=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f243417d, ')');
    }
}
