package com.avito.android.publish.slots.delivery_summary.item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySummarySlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Image f243573a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f243574b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f243575c;

    public b(@Y61.l Image image, @Y61.k String str, @Y61.k String str2) {
        this.f243573a = image;
        this.f243574b = str;
        this.f243575c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f243573a, bVar.f243573a) && L.f(this.f243574b, bVar.f243574b) && L.f(this.f243575c, bVar.f243575c);
    }

    public final int hashCode() {
        Image image = this.f243573a;
        return this.f243575c.hashCode() + H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f243574b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliverySummaryAdvert(icon=");
        sb2.append(this.f243573a);
        sb2.append(", title=");
        sb2.append(this.f243574b);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f243575c, ')');
    }
}
