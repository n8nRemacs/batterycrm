package com.avito.beduin.v2.avito.component.text.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTextState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.avito.component.text.state.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36232a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335334c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextAlign f335335d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<j> f335336e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ET0.b f335337f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C f335338g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f335339h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335340i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335341j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f335342k;

    public C36232a(@Y61.k String str, boolean z12, int i12, @Y61.k TextAlign textAlign, @Y61.k com.avito.beduin.v2.theme.l<j> lVar, @Y61.l ET0.b bVar, @Y61.l C c12, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str2) {
        this.f335332a = str;
        this.f335333b = z12;
        this.f335334c = i12;
        this.f335335d = textAlign;
        this.f335336e = lVar;
        this.f335337f = bVar;
        this.f335338g = c12;
        this.f335339h = z13;
        this.f335340i = aVar;
        this.f335341j = aVar2;
        this.f335342k = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335340i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335341j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36232a)) {
            return false;
        }
        C36232a c36232a = (C36232a) obj;
        return L.f(this.f335332a, c36232a.f335332a) && this.f335333b == c36232a.f335333b && this.f335334c == c36232a.f335334c && this.f335335d == c36232a.f335335d && L.f(this.f335336e, c36232a.f335336e) && L.f(this.f335337f, c36232a.f335337f) && L.f(this.f335338g, c36232a.f335338g) && this.f335339h == c36232a.f335339h && L.f(this.f335340i, c36232a.f335340i) && L.f(this.f335341j, c36232a.f335341j) && L.f(this.f335342k, c36232a.f335342k);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334395g() {
        return this.f335342k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334392d() {
        return this.f335339h;
    }

    public final int hashCode() {
        int iG2 = C31685o.g(this.f335336e, (this.f335335d.hashCode() + androidx.appcompat.app.r.e(this.f335334c, androidx.appcompat.app.r.i(this.f335332a.hashCode() * 31, 31, this.f335333b), 31)) * 31, 31);
        ET0.b bVar = this.f335337f;
        int iHashCode = (iG2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C c12 = this.f335338g;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (c12 == null ? 0 : c12.hashCode())) * 31, 31, this.f335339h);
        Y41.a<G0> aVar = this.f335340i;
        int iHashCode2 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335341j;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335342k;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTextState(text=");
        sb2.append(this.f335332a);
        sb2.append(", truncate=");
        sb2.append(this.f335333b);
        sb2.append(", maxLines=");
        sb2.append(this.f335334c);
        sb2.append(", textAlign=");
        sb2.append(this.f335335d);
        sb2.append(", style=");
        sb2.append(this.f335336e);
        sb2.append(", padding=");
        sb2.append(this.f335337f);
        sb2.append(", expandableText=");
        sb2.append(this.f335338g);
        sb2.append(", visible=");
        sb2.append(this.f335339h);
        sb2.append(", onShow=");
        sb2.append(this.f335340i);
        sb2.append(", onHide=");
        sb2.append(this.f335341j);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335342k, ')');
    }
}
