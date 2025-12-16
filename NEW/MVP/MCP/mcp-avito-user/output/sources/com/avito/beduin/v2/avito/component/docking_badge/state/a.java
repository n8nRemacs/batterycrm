package com.avito.beduin.v2.avito.component.docking_badge.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoDockingBadgeGroupState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/docking_badge/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n[] f334318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f334319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334320c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334321d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334322e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334323f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f334324g;

    public a(@Y61.k n[] nVarArr, int i12, int i13, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334318a = nVarArr;
        this.f334319b = i12;
        this.f334320c = i13;
        this.f334321d = z12;
        this.f334322e = aVar;
        this.f334323f = aVar2;
        this.f334324g = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334322e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334323f;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Arrays.equals(this.f334318a, aVar.f334318a) && this.f334319b == aVar.f334319b && this.f334321d == aVar.f334321d && this.f334320c == aVar.f334320c;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334344h() {
        return this.f334324g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334341e() {
        return this.f334321d;
    }

    public final int hashCode() {
        return androidx.appcompat.app.r.i(((Arrays.hashCode(this.f334318a) * 31) + this.f334319b) * 31, 31, this.f334321d) + this.f334320c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDockingBadgeGroupState(badges=");
        sb2.append(Arrays.toString(this.f334318a));
        sb2.append(", verticalSpacing=");
        sb2.append(this.f334319b);
        sb2.append(", numberOfLines=");
        sb2.append(this.f334320c);
        sb2.append(", visible=");
        sb2.append(this.f334321d);
        sb2.append(", onShow=");
        sb2.append(this.f334322e);
        sb2.append(", onHide=");
        sb2.append(this.f334323f);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334324g, ')');
    }
}
