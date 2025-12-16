package com.avito.beduin.v2.avito.component.stepper.state;

import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoStepperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/stepper/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f335160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f335163d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Mode f335164e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final WidthStrategy f335165f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f335166g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f335167h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<l> f335168i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f335169j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335170k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335171l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f335172m;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z12, int i12, int i13, int i14, @Y61.k Mode mode, @Y61.l WidthStrategy widthStrategy, @Y61.l Y41.l<? super Integer, G0> lVar, @Y61.l Y41.l<? super Integer, G0> lVar2, @Y61.k com.avito.beduin.v2.theme.l<l> lVar3, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f335160a = z12;
        this.f335161b = i12;
        this.f335162c = i13;
        this.f335163d = i14;
        this.f335164e = mode;
        this.f335165f = widthStrategy;
        this.f335166g = lVar;
        this.f335167h = lVar2;
        this.f335168i = lVar3;
        this.f335169j = z13;
        this.f335170k = aVar;
        this.f335171l = aVar2;
        this.f335172m = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335170k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335171l;
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
        return this.f335160a == aVar.f335160a && this.f335161b == aVar.f335161b && this.f335162c == aVar.f335162c && this.f335163d == aVar.f335163d && this.f335164e == aVar.f335164e && this.f335165f == aVar.f335165f && L.f(this.f335166g, aVar.f335166g) && L.f(this.f335167h, aVar.f335167h) && L.f(this.f335168i, aVar.f335168i) && this.f335169j == aVar.f335169j && L.f(this.f335170k, aVar.f335170k) && L.f(this.f335171l, aVar.f335171l) && L.f(this.f335172m, aVar.f335172m);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334324g() {
        return this.f335172m;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334321d() {
        return this.f335169j;
    }

    public final int hashCode() {
        int iHashCode = (this.f335164e.hashCode() + androidx.appcompat.app.r.e(this.f335163d, androidx.appcompat.app.r.e(this.f335162c, androidx.appcompat.app.r.e(this.f335161b, Boolean.hashCode(this.f335160a) * 31, 31), 31), 31)) * 31;
        WidthStrategy widthStrategy = this.f335165f;
        int iHashCode2 = (iHashCode + (widthStrategy == null ? 0 : widthStrategy.hashCode())) * 31;
        Y41.l<Integer, G0> lVar = this.f335166g;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Integer, G0> lVar2 = this.f335167h;
        int i12 = androidx.appcompat.app.r.i(C31685o.g(this.f335168i, (iHashCode3 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31, 31), 31, this.f335169j);
        Y41.a<G0> aVar = this.f335170k;
        int iHashCode4 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335171l;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335172m;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoStepperState(enabled=");
        sb2.append(this.f335160a);
        sb2.append(", currentValue=");
        sb2.append(this.f335161b);
        sb2.append(", maxValue=");
        sb2.append(this.f335162c);
        sb2.append(", minValue=");
        sb2.append(this.f335163d);
        sb2.append(", mode=");
        sb2.append(this.f335164e);
        sb2.append(", widthStrategy=");
        sb2.append(this.f335165f);
        sb2.append(", onIncrementClick=");
        sb2.append(this.f335166g);
        sb2.append(", onDecrementClick=");
        sb2.append(this.f335167h);
        sb2.append(", style=");
        sb2.append(this.f335168i);
        sb2.append(", visible=");
        sb2.append(this.f335169j);
        sb2.append(", onShow=");
        sb2.append(this.f335170k);
        sb2.append(", onHide=");
        sb2.append(this.f335171l);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335172m, ')');
    }
}
