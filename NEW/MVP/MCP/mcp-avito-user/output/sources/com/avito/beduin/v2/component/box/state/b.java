package com.avito.beduin.v2.component.box.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.Alignments;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import com.avito.beduin.v2.theme.r;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BoxState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/box/state/b;", "Lcom/avito/beduin/v2/component/box/state/a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements com.avito.beduin.v2.component.box.state.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ET0.a<? extends a> f335568a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r f335569b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f335570c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ET0.b f335571d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335572e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335573f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335574g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f335575h;

    /* compiled from: BoxState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/box/state/b$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/box/state/b$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements q<C10388a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC36249i f335576a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C10388a f335577b;

        /* compiled from: BoxState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/box/state/b$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.box.state.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10388a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Alignments f335578a;

            /* renamed from: b, reason: collision with root package name */
            public final int f335579b;

            /* renamed from: c, reason: collision with root package name */
            public final int f335580c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final ET0.b f335581d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f335582e;

            public C10388a(@k Alignments alignments, int i12, int i13, @l ET0.b bVar, boolean z12) {
                this.f335578a = alignments;
                this.f335579b = i12;
                this.f335580c = i13;
                this.f335581d = bVar;
                this.f335582e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10388a)) {
                    return false;
                }
                C10388a c10388a = (C10388a) obj;
                return this.f335578a == c10388a.f335578a && this.f335579b == c10388a.f335579b && this.f335580c == c10388a.f335580c && L.f(this.f335581d, c10388a.f335581d) && this.f335582e == c10388a.f335582e;
            }

            public final int hashCode() {
                int iE2 = androidx.appcompat.app.r.e(this.f335580c, androidx.appcompat.app.r.e(this.f335579b, this.f335578a.hashCode() * 31, 31), 31);
                ET0.b bVar = this.f335581d;
                return Boolean.hashCode(this.f335582e) + ((iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(alignment=");
                sb2.append(this.f335578a);
                sb2.append(", width=");
                sb2.append(this.f335579b);
                sb2.append(", height=");
                sb2.append(this.f335580c);
                sb2.append(", margin=");
                sb2.append(this.f335581d);
                sb2.append(", layoutVisible=");
                return androidx.appcompat.app.r.x(sb2, this.f335582e, ')');
            }
        }

        public a(@k InterfaceC36249i interfaceC36249i, @k C10388a c10388a) {
            this.f335576a = interfaceC36249i;
            this.f335577b = c10388a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f335577b.f335582e;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335065a() {
            return this.f335576a;
        }
    }

    public b(@k ET0.a<? extends a> aVar, @k r rVar, boolean z12, @l ET0.b bVar, @l Y41.a<G0> aVar2, @l Y41.a<G0> aVar3, @l Y41.a<G0> aVar4, @l String str) {
        this.f335568a = aVar;
        this.f335569b = rVar;
        this.f335570c = z12;
        this.f335571d = bVar;
        this.f335572e = aVar2;
        this.f335573f = aVar3;
        this.f335574g = aVar4;
        this.f335575h = str;
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    /* renamed from: a, reason: from getter */
    public final ET0.b getF335571d() {
        return this.f335571d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f335573f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f335574g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f335568a, bVar.f335568a) && L.f(this.f335569b, bVar.f335569b) && this.f335570c == bVar.f335570c && L.f(this.f335571d, bVar.f335571d) && L.f(this.f335572e, bVar.f335572e) && L.f(this.f335573f, bVar.f335573f) && L.f(this.f335574g, bVar.f335574g) && L.f(this.f335575h, bVar.f335575h);
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @k
    /* renamed from: getBackgroundColor, reason: from getter */
    public final r getF335569b() {
        return this.f335569b;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36245e
    /* renamed from: getChildren, reason: from getter */
    public final ET0.a getF335568a() {
        return this.f335568a;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF335051l() {
        return this.f335575h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335048i() {
        return this.f335570c;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f335569b.hashCode() + (this.f335568a.f4014b.hashCode() * 31)) * 31, 31, this.f335570c);
        ET0.b bVar = this.f335571d;
        int iHashCode = (i12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Y41.a<G0> aVar = this.f335572e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f335573f;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335574g;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f335575h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxState(children=");
        sb2.append(this.f335568a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f335569b);
        sb2.append(", visible=");
        sb2.append(this.f335570c);
        sb2.append(", padding=");
        sb2.append(this.f335571d);
        sb2.append(", onClick=");
        sb2.append(this.f335572e);
        sb2.append(", onShow=");
        sb2.append(this.f335573f);
        sb2.append(", onHide=");
        sb2.append(this.f335574g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335575h, ')');
    }

    @Override // com.avito.beduin.v2.component.box.state.a
    @l
    public final Y41.a<G0> u() {
        return this.f335572e;
    }
}
