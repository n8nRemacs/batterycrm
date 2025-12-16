package com.avito.beduin.v2.component.flexlayout.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.component.common.AxisAlignment;
import com.avito.beduin.v2.engine.component.InterfaceC36246f;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlexLayoutState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/flexlayout/state/b;", "Lcom/avito/beduin/v2/engine/component/f;", "Lcom/avito/beduin/v2/component/flexlayout/state/b$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements InterfaceC36246f<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335732a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335733b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Arrangement f335734c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AxisAlignment f335735d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ET0.h f335736e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ET0.b f335737f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a> f335738g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335739h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f335740i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335741j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335742k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f335743l;

    /* compiled from: FlexLayoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/flexlayout/state/b$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/flexlayout/state/b$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements q<C10393a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f335744a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10393a f335745b;

        /* compiled from: FlexLayoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/flexlayout/state/b$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.flexlayout.state.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10393a {

            /* renamed from: a, reason: collision with root package name */
            public final int f335746a;

            /* renamed from: b, reason: collision with root package name */
            public final int f335747b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final ET0.b f335748c;

            /* renamed from: d, reason: collision with root package name */
            public final float f335749d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f335750e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f335751f;

            public C10393a(int i12, int i13, @Y61.l ET0.b bVar, float f12, @Y61.l String str, boolean z12) {
                this.f335746a = i12;
                this.f335747b = i13;
                this.f335748c = bVar;
                this.f335749d = f12;
                this.f335750e = str;
                this.f335751f = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10393a)) {
                    return false;
                }
                C10393a c10393a = (C10393a) obj;
                return this.f335746a == c10393a.f335746a && this.f335747b == c10393a.f335747b && L.f(this.f335748c, c10393a.f335748c) && Float.compare(this.f335749d, c10393a.f335749d) == 0 && L.f(this.f335750e, c10393a.f335750e) && this.f335751f == c10393a.f335751f;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f335747b, Integer.hashCode(this.f335746a) * 31, 31);
                ET0.b bVar = this.f335748c;
                int iD2 = r.d(this.f335749d, (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
                String str = this.f335750e;
                return Boolean.hashCode(this.f335751f) + ((iD2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(width=");
                sb2.append(this.f335746a);
                sb2.append(", height=");
                sb2.append(this.f335747b);
                sb2.append(", margin=");
                sb2.append(this.f335748c);
                sb2.append(", weight=");
                sb2.append(this.f335749d);
                sb2.append(", itemType=");
                sb2.append(this.f335750e);
                sb2.append(", layoutVisible=");
                return r.x(sb2, this.f335751f, ')');
            }
        }

        public a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10393a c10393a) {
            this.f335744a = interfaceC36249i;
            this.f335745b = c10393a;
            if (c10393a.f335750e == null) {
                interfaceC36249i.m();
            }
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f335745b.f335751f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f335744a, aVar.f335744a) && L.f(this.f335745b, aVar.f335745b);
        }

        public final int hashCode() {
            return this.f335745b.hashCode() + (this.f335744a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335532a() {
            return this.f335744a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f335744a + ", params=" + this.f335745b + ')';
        }
    }

    public b(@Y61.k String str, boolean z12, @Y61.k Arrangement arrangement, @Y61.k AxisAlignment axisAlignment, @Y61.k ET0.h hVar, @Y61.l ET0.b bVar, @Y61.k ET0.a<a> aVar, @Y61.l Y41.a<G0> aVar2, boolean z13, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str2) {
        this.f335732a = str;
        this.f335733b = z12;
        this.f335734c = arrangement;
        this.f335735d = axisAlignment;
        this.f335736e = hVar;
        this.f335737f = bVar;
        this.f335738g = aVar;
        this.f335739h = aVar2;
        this.f335740i = z13;
        this.f335741j = aVar3;
        this.f335742k = aVar4;
        this.f335743l = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335741j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335742k;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f335732a, bVar.f335732a) && this.f335733b == bVar.f335733b && this.f335734c == bVar.f335734c && this.f335735d == bVar.f335735d && L.f(this.f335736e, bVar.f335736e) && L.f(this.f335737f, bVar.f335737f) && L.f(this.f335738g, bVar.f335738g) && L.f(this.f335739h, bVar.f335739h) && this.f335740i == bVar.f335740i && L.f(this.f335741j, bVar.f335741j) && L.f(this.f335742k, bVar.f335742k) && L.f(this.f335743l, bVar.f335743l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335400i() {
        return this.f335743l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335397f() {
        return this.f335740i;
    }

    public final int hashCode() {
        int iHashCode = (this.f335736e.hashCode() + ((this.f335735d.hashCode() + ((this.f335734c.hashCode() + r.i(this.f335732a.hashCode() * 31, 31, this.f335733b)) * 31)) * 31)) * 31;
        ET0.b bVar = this.f335737f;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f335738g.f4014b, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Y41.a<G0> aVar = this.f335739h;
        int i12 = r.i((iG2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f335740i);
        Y41.a<G0> aVar2 = this.f335741j;
        int iHashCode2 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335742k;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f335743l;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexLayoutState(backgroundColor=");
        sb2.append(this.f335732a);
        sb2.append(", reverse=");
        sb2.append(this.f335733b);
        sb2.append(", arrangement=");
        sb2.append(this.f335734c);
        sb2.append(", crossAxisAlignment=");
        sb2.append(this.f335735d);
        sb2.append(", spacing=");
        sb2.append(this.f335736e);
        sb2.append(", padding=");
        sb2.append(this.f335737f);
        sb2.append(", children=");
        sb2.append(this.f335738g);
        sb2.append(", onClick=");
        sb2.append(this.f335739h);
        sb2.append(", visible=");
        sb2.append(this.f335740i);
        sb2.append(", onShow=");
        sb2.append(this.f335741j);
        sb2.append(", onHide=");
        sb2.append(this.f335742k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335743l, ')');
    }
}
