package com.avito.android.delivery_tarifikator.presentation.konveyor.item.verticalspace;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerticalSpaceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/verticalspace/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f135519b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f135520c;

    public c(int i12, String str, int i13, C42822w c42822w) {
        str = (i13 & 2) != 0 ? UUID.randomUUID().toString() : str;
        this.f135519b = i12;
        this.f135520c = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f135519b == cVar.f135519b && L.f(this.f135520c, cVar.f135520c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84603b() {
        return getF135520c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135520c() {
        return this.f135520c;
    }

    public final int hashCode() {
        return this.f135520c.hashCode() + (Integer.hashCode(this.f135519b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalSpaceItem(height=");
        sb2.append(this.f135519b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f135520c, ')');
    }
}
