package com.avito.beduin.v2.component.gridlayout.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.Arrangement;
import com.avito.beduin.v2.engine.component.InterfaceC36246f;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridLayoutState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c;", "Lcom/avito/beduin/v2/engine/component/f;", "Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements InterfaceC36246f<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335840a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335842c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Arrangement f335843d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ET0.h f335844e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final t f335845f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a> f335846g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335847h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f335848i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335849j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335850k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f335851l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f335852m;

    /* compiled from: GridLayoutState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/gridlayout/state/c$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.beduin.v2.engine.component.q<C10399a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f335853a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10399a f335854b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f335855c;

        /* compiled from: GridLayoutState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.gridlayout.state.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10399a {

            /* renamed from: a, reason: collision with root package name */
            public final int f335856a;

            /* renamed from: b, reason: collision with root package name */
            public final int f335857b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final ET0.b f335858c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Integer f335859d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f335860e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f335861f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final String f335862g;

            public C10399a(int i12, int i13, @Y61.l ET0.b bVar, @Y61.l Integer num, boolean z12, boolean z13, @Y61.l String str) {
                this.f335856a = i12;
                this.f335857b = i13;
                this.f335858c = bVar;
                this.f335859d = num;
                this.f335860e = z12;
                this.f335861f = z13;
                this.f335862g = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10399a)) {
                    return false;
                }
                C10399a c10399a = (C10399a) obj;
                return this.f335856a == c10399a.f335856a && this.f335857b == c10399a.f335857b && L.f(this.f335858c, c10399a.f335858c) && L.f(this.f335859d, c10399a.f335859d) && this.f335860e == c10399a.f335860e && this.f335861f == c10399a.f335861f && L.f(this.f335862g, c10399a.f335862g);
            }

            public final int hashCode() {
                int iE2 = androidx.appcompat.app.r.e(this.f335857b, Integer.hashCode(this.f335856a) * 31, 31);
                ET0.b bVar = this.f335858c;
                int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                Integer num = this.f335859d;
                int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f335860e), 31, this.f335861f);
                String str = this.f335862g;
                return i12 + (str != null ? str.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(width=");
                sb2.append(this.f335856a);
                sb2.append(", height=");
                sb2.append(this.f335857b);
                sb2.append(", margin=");
                sb2.append(this.f335858c);
                sb2.append(", span=");
                sb2.append(this.f335859d);
                sb2.append(", isSticky=");
                sb2.append(this.f335860e);
                sb2.append(", layoutVisible=");
                sb2.append(this.f335861f);
                sb2.append(", itemType=");
                return C22026a.c(sb2, this.f335862g, ')');
            }
        }

        public a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10399a c10399a) {
            this.f335853a = interfaceC36249i;
            this.f335854b = c10399a;
            String str = c10399a.f335862g;
            this.f335855c = str == null ? interfaceC36249i.getF336566c() : str;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f335854b.f335861f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f335853a, aVar.f335853a) && L.f(this.f335854b, aVar.f335854b);
        }

        public final int hashCode() {
            return this.f335854b.hashCode() + (this.f335853a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335853a() {
            return this.f335853a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f335853a + ", params=" + this.f335854b + ')';
        }
    }

    public c(@Y61.k String str, @Y61.l Y41.a<G0> aVar, boolean z12, @Y61.k Arrangement arrangement, @Y61.k ET0.h hVar, @Y61.k t tVar, @Y61.k ET0.a<a> aVar2, @Y61.l Y41.a<G0> aVar3, boolean z13, @Y61.l Y41.a<G0> aVar4, @Y61.l Y41.a<G0> aVar5, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l String str2) {
        this.f335840a = str;
        this.f335841b = aVar;
        this.f335842c = z12;
        this.f335843d = arrangement;
        this.f335844e = hVar;
        this.f335845f = tVar;
        this.f335846g = aVar2;
        this.f335847h = aVar3;
        this.f335848i = z13;
        this.f335849j = aVar4;
        this.f335850k = aVar5;
        this.f335851l = cVar;
        this.f335852m = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335849j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335850k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f335851l;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f335840a, cVar.f335840a) && L.f(this.f335841b, cVar.f335841b) && this.f335842c == cVar.f335842c && this.f335843d == cVar.f335843d && L.f(this.f335844e, cVar.f335844e) && L.f(this.f335845f, cVar.f335845f) && L.f(this.f335846g, cVar.f335846g) && L.f(this.f335847h, cVar.f335847h) && this.f335848i == cVar.f335848i && L.f(this.f335849j, cVar.f335849j) && L.f(this.f335850k, cVar.f335850k) && L.f(this.f335851l, cVar.f335851l) && L.f(this.f335852m, cVar.f335852m);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF336371l() {
        return this.f335852m;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336368i() {
        return this.f335848i;
    }

    public final int hashCode() {
        int iHashCode = this.f335840a.hashCode() * 31;
        Y41.a<G0> aVar = this.f335841b;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f335846g.f4014b, (this.f335845f.hashCode() + ((this.f335844e.hashCode() + ((this.f335843d.hashCode() + androidx.appcompat.app.r.i((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f335842c)) * 31)) * 31)) * 31, 31);
        Y41.a<G0> aVar2 = this.f335847h;
        int i12 = androidx.appcompat.app.r.i((iG2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f335848i);
        Y41.a<G0> aVar3 = this.f335849j;
        int iHashCode2 = (i12 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f335850k;
        int iHashCode3 = (iHashCode2 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f335851l;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : Arrays.hashCode(cVar.f336915a))) * 31;
        String str = this.f335852m;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GridLayoutState(backgroundColor=");
        sb2.append(this.f335840a);
        sb2.append(", onPrefetch=");
        sb2.append(this.f335841b);
        sb2.append(", reverse=");
        sb2.append(this.f335842c);
        sb2.append(", arrangement=");
        sb2.append(this.f335843d);
        sb2.append(", spacing=");
        sb2.append(this.f335844e);
        sb2.append(", spanCount=");
        sb2.append(this.f335845f);
        sb2.append(", children=");
        sb2.append(this.f335846g);
        sb2.append(", onClick=");
        sb2.append(this.f335847h);
        sb2.append(", visible=");
        sb2.append(this.f335848i);
        sb2.append(", onShow=");
        sb2.append(this.f335849j);
        sb2.append(", onHide=");
        sb2.append(this.f335850k);
        sb2.append(", markers=");
        sb2.append(this.f335851l);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335852m, ')');
    }
}
