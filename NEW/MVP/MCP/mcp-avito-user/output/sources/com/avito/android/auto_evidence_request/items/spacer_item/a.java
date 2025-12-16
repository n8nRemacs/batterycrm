package com.avito.android.auto_evidence_request.items.spacer_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpacerItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/spacer_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95189c;

    public a(@k String str, int i12) {
        this.f95188b = str;
        this.f95189c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f95188b, aVar.f95188b) && this.f95189c == aVar.f95189c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85286b() {
        return getF88913b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88913b() {
        return this.f95188b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95189c) + (this.f95188b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpacerItem(stringId=");
        sb2.append(this.f95188b);
        sb2.append(", value=");
        return r.t(sb2, this.f95189c, ')');
    }
}
