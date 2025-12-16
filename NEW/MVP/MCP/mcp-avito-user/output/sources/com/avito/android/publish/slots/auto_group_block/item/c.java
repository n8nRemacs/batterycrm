package com.avito.android.publish.slots.auto_group_block.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoGroupBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/item/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243100c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243101d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f243102e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f243103f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f243104g;

    public c(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.f243099b = str;
        this.f243100c = str2;
        this.f243101d = str3;
        this.f243102e = str4;
        this.f243103f = str5;
        this.f243104g = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243099b, cVar.f243099b) && L.f(this.f243100c, cVar.f243100c) && L.f(this.f243101d, cVar.f243101d) && L.f(this.f243102e, cVar.f243102e) && L.f(this.f243103f, cVar.f243103f) && L.f(this.f243104g, cVar.f243104g);
    }

    @Override // TV0.a
    public final long getId() {
        return getF223480b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f243099b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f243099b.hashCode() * 31, 31, this.f243100c);
        String str = this.f243101d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f243102e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f243103f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f243104g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoGroupBlockItem(stringId=");
        sb2.append(this.f243099b);
        sb2.append(", slotId=");
        sb2.append(this.f243100c);
        sb2.append(", title=");
        sb2.append(this.f243101d);
        sb2.append(", tooltipText=");
        sb2.append(this.f243102e);
        sb2.append(", buttonText=");
        sb2.append(this.f243103f);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f243104g, ')');
    }
}
