package com.avito.android.lib.beduin_v2.beduin_item.stateless;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/stateless/a;", "Lcom/avito/conveyor_item/a;", "_design-modules_beduin-v2_beduin-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f175461b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f175462c;

    public a(@k String str, @k String str2) {
        this.f175461b = str;
        this.f175462c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f175461b, aVar.f175461b) && L.f(this.f175462c, aVar.f175462c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF170227b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF170227b() {
        return this.f175461b;
    }

    public final int hashCode() {
        return this.f175462c.hashCode() + (this.f175461b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItem(stringId=");
        sb2.append(this.f175461b);
        sb2.append(", viewType=");
        return C22026a.c(sb2, this.f175462c, ')');
    }
}
