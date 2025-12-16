package com.avito.android.re_agent_landing.landing.items.info_block;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InfoBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/info_block/c;", "Lcom/avito/conveyor_item/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250769b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250770c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250771d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f250772e;

    public c(String str, String str2, String str3, UniversalImage universalImage, int i12, C42822w c42822w) {
        this.f250769b = (i12 & 1) != 0 ? "info_block_item" : str;
        this.f250770c = str2;
        this.f250771d = str3;
        this.f250772e = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f250769b, cVar.f250769b) && L.f(this.f250770c, cVar.f250770c) && L.f(this.f250771d, cVar.f250771d) && L.f(this.f250772e, cVar.f250772e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return getF217937b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217937b() {
        return this.f250769b;
    }

    public final int hashCode() {
        return this.f250772e.hashCode() + H.d(H.d(this.f250769b.hashCode() * 31, 31, this.f250770c), 31, this.f250771d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoBlockItem(stringId=");
        sb2.append(this.f250769b);
        sb2.append(", title=");
        sb2.append(this.f250770c);
        sb2.append(", description=");
        sb2.append(this.f250771d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f250772e, ')');
    }
}
