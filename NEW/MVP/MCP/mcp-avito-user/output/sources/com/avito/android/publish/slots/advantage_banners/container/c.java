package com.avito.android.publish.slots.advantage_banners.container;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvantageContainerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/container/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f243009c;

    public c(@k String str, @k ArrayList arrayList) {
        this.f243008b = str;
        this.f243009c = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243008b, cVar.f243008b) && this.f243009c.equals(cVar.f243009c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF238671b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF238671b() {
        return this.f243008b;
    }

    public final int hashCode() {
        return this.f243009c.hashCode() + (this.f243008b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvantageContainerItem(stringId=");
        sb2.append(this.f243008b);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f243009c, ')');
    }
}
