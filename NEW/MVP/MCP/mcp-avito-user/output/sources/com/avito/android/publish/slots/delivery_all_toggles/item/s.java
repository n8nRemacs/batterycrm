package com.avito.android.publish.slots.delivery_all_toggles.item;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryAllTogglesFeaturesAdapter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/s;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Image f243547a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f243548b;

    public s(@Y61.l Image image, @Y61.l String str) {
        this.f243547a = image;
        this.f243548b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f243547a, sVar.f243547a) && L.f(this.f243548b, sVar.f243548b);
    }

    public final int hashCode() {
        Image image = this.f243547a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.f243548b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureItem(icon=");
        sb2.append(this.f243547a);
        sb2.append(", label=");
        return C22026a.c(sb2, this.f243548b, ')');
    }
}
