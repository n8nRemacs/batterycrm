package com.avito.android.publish.slots.no_car.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NoCarSlotItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/no_car/item/b;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244656c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f244657d;

    public b(@k String str, @k String str2, @k String str3) {
        this.f244655b = str;
        this.f244656c = str2;
        this.f244657d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f244655b, bVar.f244655b) && L.f(this.f244656c, bVar.f244656c) && L.f(this.f244657d, bVar.f244657d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF243637b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243637b() {
        return this.f244655b;
    }

    public final int hashCode() {
        return this.f244657d.hashCode() + H.d(this.f244655b.hashCode() * 31, 31, this.f244656c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoCarSlotItem(stringId=");
        sb2.append(this.f244655b);
        sb2.append(", link=");
        sb2.append(this.f244656c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f244657d, ')');
    }
}
