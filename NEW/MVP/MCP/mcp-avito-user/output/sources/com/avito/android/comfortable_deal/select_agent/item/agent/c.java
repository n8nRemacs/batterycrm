package com.avito.android.comfortable_deal.select_agent.item.agent;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AgentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/item/agent/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f122715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f122716c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f122717d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f122718e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f122719f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f122720g;

    public c(@k String str, @k String str2, @k String str3, @l Image image, boolean z12, boolean z13) {
        this.f122715b = str;
        this.f122716c = str2;
        this.f122717d = str3;
        this.f122718e = image;
        this.f122719f = z12;
        this.f122720g = z13;
    }

    public static c a(c cVar, boolean z12, boolean z13, int i12) {
        String str = cVar.f122715b;
        String str2 = cVar.f122716c;
        String str3 = cVar.f122717d;
        Image image = cVar.f122718e;
        if ((i12 & 16) != 0) {
            z12 = cVar.f122719f;
        }
        boolean z14 = z12;
        if ((i12 & 32) != 0) {
            z13 = cVar.f122720g;
        }
        cVar.getClass();
        return new c(str, str2, str3, image, z14, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f122715b, cVar.f122715b) && L.f(this.f122716c, cVar.f122716c) && L.f(this.f122717d, cVar.f122717d) && L.f(this.f122718e, cVar.f122718e) && this.f122719f == cVar.f122719f && this.f122720g == cVar.f122720g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83915c() {
        return getF108380b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF108380b() {
        return this.f122715b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f122715b.hashCode() * 31, 31, this.f122716c), 31, this.f122717d);
        Image image = this.f122718e;
        return Boolean.hashCode(this.f122720g) + r.i((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f122719f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentItem(stringId=");
        sb2.append(this.f122715b);
        sb2.append(", name=");
        sb2.append(this.f122716c);
        sb2.append(", phone=");
        sb2.append(this.f122717d);
        sb2.append(", avatar=");
        sb2.append(this.f122718e);
        sb2.append(", isSelected=");
        sb2.append(this.f122719f);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f122720g, ')');
    }

    public /* synthetic */ c(String str, String str2, String str3, Image image, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, image, z12, (i12 & 32) != 0 ? true : z13);
    }
}
