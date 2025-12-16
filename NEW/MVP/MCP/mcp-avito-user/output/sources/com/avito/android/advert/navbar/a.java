package com.avito.android.advert.navbar;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNavBarData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Image f80805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80806b;

    public a(int i12, @Y61.k Image image) {
        this.f80805a = image;
        this.f80806b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f80805a, aVar.f80805a) && this.f80806b == aVar.f80806b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80806b) + (this.f80805a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGalleryImagePreview(image=");
        sb2.append(this.f80805a);
        sb2.append(", position=");
        return androidx.appcompat.app.r.t(sb2, this.f80806b, ')');
    }
}
