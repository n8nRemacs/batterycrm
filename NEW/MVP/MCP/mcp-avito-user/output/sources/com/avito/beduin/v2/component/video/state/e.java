package com.avito.beduin.v2.component.video.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/e;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final a f336360a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336361b;

    /* renamed from: c, reason: collision with root package name */
    public final float f336362c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f336363d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<PlayerState, G0> f336364e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.l<MediaState, G0> f336365f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f336366g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336367h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f336368i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336369j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336370k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f336371l;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.l a aVar, boolean z12, float f12, boolean z13, @Y61.l Y41.l<? super PlayerState, G0> lVar, @Y61.l Y41.l<? super MediaState, G0> lVar2, @Y61.l Y41.l<? super String, G0> lVar3, @Y61.l Y41.a<G0> aVar2, boolean z14, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str) {
        this.f336360a = aVar;
        this.f336361b = z12;
        this.f336362c = f12;
        this.f336363d = z13;
        this.f336364e = lVar;
        this.f336365f = lVar2;
        this.f336366g = lVar3;
        this.f336367h = aVar2;
        this.f336368i = z14;
        this.f336369j = aVar3;
        this.f336370k = aVar4;
        this.f336371l = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f336369j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f336370k;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f336360a, eVar.f336360a) && this.f336361b == eVar.f336361b && Float.compare(this.f336362c, eVar.f336362c) == 0 && this.f336363d == eVar.f336363d && L.f(this.f336364e, eVar.f336364e) && L.f(this.f336365f, eVar.f336365f) && L.f(this.f336366g, eVar.f336366g) && L.f(this.f336367h, eVar.f336367h) && this.f336368i == eVar.f336368i && L.f(this.f336369j, eVar.f336369j) && L.f(this.f336370k, eVar.f336370k) && L.f(this.f336371l, eVar.f336371l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF336371l() {
        return this.f336371l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336368i() {
        return this.f336368i;
    }

    public final int hashCode() {
        a aVar = this.f336360a;
        int i12 = r.i(r.d(this.f336362c, r.i((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f336361b), 31), 31, this.f336363d);
        Y41.l<PlayerState, G0> lVar = this.f336364e;
        int iHashCode = (i12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<MediaState, G0> lVar2 = this.f336365f;
        int iHashCode2 = (iHashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Y41.l<String, G0> lVar3 = this.f336366g;
        int iHashCode3 = (iHashCode2 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f336367h;
        int i13 = r.i((iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f336368i);
        Y41.a<G0> aVar3 = this.f336369j;
        int iHashCode4 = (i13 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f336370k;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.f336371l;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoState(content=");
        sb2.append(this.f336360a);
        sb2.append(", playWhenReady=");
        sb2.append(this.f336361b);
        sb2.append(", volume=");
        sb2.append(this.f336362c);
        sb2.append(", loop=");
        sb2.append(this.f336363d);
        sb2.append(", onPlayerStateChanged=");
        sb2.append(this.f336364e);
        sb2.append(", onMediaStateChanged=");
        sb2.append(this.f336365f);
        sb2.append(", onError=");
        sb2.append(this.f336366g);
        sb2.append(", onClick=");
        sb2.append(this.f336367h);
        sb2.append(", visible=");
        sb2.append(this.f336368i);
        sb2.append(", onShow=");
        sb2.append(this.f336369j);
        sb2.append(", onHide=");
        sb2.append(this.f336370k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f336371l, ')');
    }
}
