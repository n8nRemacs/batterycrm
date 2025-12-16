package com.avito.beduin.v2.avito.component.button.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoButtonState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.avito.component.button.state.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36216a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f333935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f333936b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f333937c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f333938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333939e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<l> f333940f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final v f333941g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final v f333942h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f333943i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333944j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333945k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f333946l;

    public C36216a(@Y61.k String str, @Y61.l String str2, boolean z12, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.k com.avito.beduin.v2.theme.l<l> lVar, @Y61.l v vVar, @Y61.l v vVar2, boolean z14, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str3) {
        this.f333935a = str;
        this.f333936b = str2;
        this.f333937c = z12;
        this.f333938d = z13;
        this.f333939e = aVar;
        this.f333940f = lVar;
        this.f333941g = vVar;
        this.f333942h = vVar2;
        this.f333943i = z14;
        this.f333944j = aVar2;
        this.f333945k = aVar3;
        this.f333946l = str3;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f333944j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f333945k;
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
        if (!(obj instanceof C36216a)) {
            return false;
        }
        C36216a c36216a = (C36216a) obj;
        return L.f(this.f333935a, c36216a.f333935a) && L.f(this.f333936b, c36216a.f333936b) && this.f333937c == c36216a.f333937c && this.f333938d == c36216a.f333938d && L.f(this.f333939e, c36216a.f333939e) && L.f(this.f333940f, c36216a.f333940f) && L.f(this.f333941g, c36216a.f333941g) && L.f(this.f333942h, c36216a.f333942h) && this.f333943i == c36216a.f333943i && L.f(this.f333944j, c36216a.f333944j) && L.f(this.f333945k, c36216a.f333945k) && L.f(this.f333946l, c36216a.f333946l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334344h() {
        return this.f333946l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334341e() {
        return this.f333943i;
    }

    public final int hashCode() {
        int iHashCode = this.f333935a.hashCode() * 31;
        String str = this.f333936b;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f333937c), 31, this.f333938d);
        Y41.a<G0> aVar = this.f333939e;
        int iG2 = C31685o.g(this.f333940f, (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        v vVar = this.f333941g;
        int iHashCode2 = (iG2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        v vVar2 = this.f333942h;
        int i13 = androidx.appcompat.app.r.i((iHashCode2 + (vVar2 == null ? 0 : vVar2.hashCode())) * 31, 31, this.f333943i);
        Y41.a<G0> aVar2 = this.f333944j;
        int iHashCode3 = (i13 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f333945k;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str2 = this.f333946l;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoButtonState(text=");
        sb2.append(this.f333935a);
        sb2.append(", subtitle=");
        sb2.append(this.f333936b);
        sb2.append(", enabled=");
        sb2.append(this.f333937c);
        sb2.append(", loading=");
        sb2.append(this.f333938d);
        sb2.append(", onClick=");
        sb2.append(this.f333939e);
        sb2.append(", style=");
        sb2.append(this.f333940f);
        sb2.append(", iconStart=");
        sb2.append(this.f333941g);
        sb2.append(", iconEnd=");
        sb2.append(this.f333942h);
        sb2.append(", visible=");
        sb2.append(this.f333943i);
        sb2.append(", onShow=");
        sb2.append(this.f333944j);
        sb2.append(", onHide=");
        sb2.append(this.f333945k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f333946l, ')');
    }
}
