package com.avito.beduin.v2.avito.component.time_line.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTimeLineState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/time_line/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10381a> f335392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335393b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335394c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<k> f335395d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ET0.b f335396e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f335397f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335398g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335399h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f335400i;

    /* compiled from: AvitoTimeLineState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/time_line/state/a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.time_line.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10381a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f335401a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f335402b;

        public C10381a(@Y61.l String str, @Y61.l String str2) {
            this.f335401a = str;
            this.f335402b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10381a)) {
                return false;
            }
            C10381a c10381a = (C10381a) obj;
            return L.f(this.f335401a, c10381a.f335401a) && L.f(this.f335402b, c10381a.f335402b);
        }

        public final int hashCode() {
            String str = this.f335401a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f335402b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TimeLineItem(text=");
            sb2.append(this.f335401a);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.f335402b, ')');
        }
    }

    public a(@Y61.k ET0.a<C10381a> aVar, int i12, boolean z12, @Y61.k com.avito.beduin.v2.theme.l<k> lVar, @Y61.l ET0.b bVar, boolean z13, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f335392a = aVar;
        this.f335393b = i12;
        this.f335394c = z12;
        this.f335395d = lVar;
        this.f335396e = bVar;
        this.f335397f = z13;
        this.f335398g = aVar2;
        this.f335399h = aVar3;
        this.f335400i = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335398g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335399h;
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
        return L.f(this.f335392a, aVar.f335392a) && this.f335393b == aVar.f335393b && this.f335394c == aVar.f335394c && L.f(this.f335395d, aVar.f335395d) && L.f(this.f335396e, aVar.f335396e) && this.f335397f == aVar.f335397f && L.f(this.f335398g, aVar.f335398g) && L.f(this.f335399h, aVar.f335399h) && L.f(this.f335400i, aVar.f335400i);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335400i() {
        return this.f335400i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335397f() {
        return this.f335397f;
    }

    public final int hashCode() {
        int iG2 = C31685o.g(this.f335395d, r.i(r.e(this.f335393b, this.f335392a.f4014b.hashCode() * 31, 31), 31, this.f335394c), 31);
        ET0.b bVar = this.f335396e;
        int i12 = r.i((iG2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f335397f);
        Y41.a<G0> aVar = this.f335398g;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335399h;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f335400i;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTimeLineState(items=");
        sb2.append(this.f335392a);
        sb2.append(", currentItemIndex=");
        sb2.append(this.f335393b);
        sb2.append(", scrollToCurrentIndex=");
        sb2.append(this.f335394c);
        sb2.append(", style=");
        sb2.append(this.f335395d);
        sb2.append(", contentInsets=");
        sb2.append(this.f335396e);
        sb2.append(", visible=");
        sb2.append(this.f335397f);
        sb2.append(", onShow=");
        sb2.append(this.f335398g);
        sb2.append(", onHide=");
        sb2.append(this.f335399h);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335400i, ')');
    }
}
