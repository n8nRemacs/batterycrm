package com.avito.beduin.v2.avito.component.switcher.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSwitcherState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/switcher/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f335224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335225b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335226c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f335227d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<j> f335228e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f335229f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335230g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335231h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f335232i;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z12, boolean z13, boolean z14, @Y61.l Y41.l<? super Boolean, G0> lVar, @Y61.k com.avito.beduin.v2.theme.l<j> lVar2, boolean z15, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f335224a = z12;
        this.f335225b = z13;
        this.f335226c = z14;
        this.f335227d = lVar;
        this.f335228e = lVar2;
        this.f335229f = z15;
        this.f335230g = aVar;
        this.f335231h = aVar2;
        this.f335232i = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335230g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335231h;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f335224a == aVar.f335224a && this.f335225b == aVar.f335225b && this.f335226c == aVar.f335226c && L.f(this.f335227d, aVar.f335227d) && L.f(this.f335228e, aVar.f335228e) && this.f335229f == aVar.f335229f && L.f(this.f335230g, aVar.f335230g) && L.f(this.f335231h, aVar.f335231h) && L.f(this.f335232i, aVar.f335232i);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335439m() {
        return this.f335232i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335436j() {
        return this.f335229f;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(Boolean.hashCode(this.f335224a) * 31, 31, this.f335225b), 31, this.f335226c);
        Y41.l<Boolean, G0> lVar = this.f335227d;
        int i13 = r.i(C31685o.g(this.f335228e, (i12 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31), 31, this.f335229f);
        Y41.a<G0> aVar = this.f335230g;
        int iHashCode = (i13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335231h;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335232i;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSwitcherState(checked=");
        sb2.append(this.f335224a);
        sb2.append(", enabled=");
        sb2.append(this.f335225b);
        sb2.append(", error=");
        sb2.append(this.f335226c);
        sb2.append(", onCheckedChange=");
        sb2.append(this.f335227d);
        sb2.append(", style=");
        sb2.append(this.f335228e);
        sb2.append(", visible=");
        sb2.append(this.f335229f);
        sb2.append(", onShow=");
        sb2.append(this.f335230g);
        sb2.append(", onHide=");
        sb2.append(this.f335231h);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335232i, ')');
    }
}
