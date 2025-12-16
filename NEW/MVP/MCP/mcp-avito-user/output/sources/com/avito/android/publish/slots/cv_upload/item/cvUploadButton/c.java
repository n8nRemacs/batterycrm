package com.avito.android.publish.slots.cv_upload.item.cvUploadButton;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cv_upload/item/cvUploadButton/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243399b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243400c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f243401d;

    public c(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f243399b = str;
        this.f243400c = str2;
        this.f243401d = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243399b, cVar.f243399b) && L.f(this.f243400c, cVar.f243400c) && L.f(this.f243401d, cVar.f243401d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF238629b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF238629b() {
        return this.f243399b;
    }

    public final int hashCode() {
        return this.f243401d.hashCode() + H.d(this.f243399b.hashCode() * 31, 31, this.f243400c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvUploadButtonItem(stringId=");
        sb2.append(this.f243399b);
        sb2.append(", text=");
        sb2.append(this.f243400c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f243401d, ')');
    }
}
