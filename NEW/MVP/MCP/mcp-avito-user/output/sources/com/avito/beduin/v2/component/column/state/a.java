package com.avito.beduin.v2.component.column.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.HorizontalAlignment;
import com.avito.beduin.v2.engine.component.InterfaceC36246f;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ColumnState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/column/state/a;", "Lcom/avito/beduin/v2/engine/component/f;", "Lcom/avito/beduin/v2/component/column/state/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36246f<C10390a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f335613a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ET0.b f335614b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10390a> f335615c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335616d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f335617e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335618f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f335619g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f335620h;

    /* compiled from: ColumnState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/column/state/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/column/state/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.column.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10390a implements q<C10391a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f335621a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10391a f335622b;

        /* compiled from: ColumnState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/column/state/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.column.state.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10391a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final HorizontalAlignment f335623a;

            /* renamed from: b, reason: collision with root package name */
            public final int f335624b;

            /* renamed from: c, reason: collision with root package name */
            public final int f335625c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final ET0.b f335626d;

            /* renamed from: e, reason: collision with root package name */
            public final float f335627e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f335628f;

            public C10391a(@Y61.k HorizontalAlignment horizontalAlignment, int i12, int i13, @Y61.l ET0.b bVar, float f12, boolean z12) {
                this.f335623a = horizontalAlignment;
                this.f335624b = i12;
                this.f335625c = i13;
                this.f335626d = bVar;
                this.f335627e = f12;
                this.f335628f = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10391a)) {
                    return false;
                }
                C10391a c10391a = (C10391a) obj;
                return this.f335623a == c10391a.f335623a && this.f335624b == c10391a.f335624b && this.f335625c == c10391a.f335625c && L.f(this.f335626d, c10391a.f335626d) && Float.compare(this.f335627e, c10391a.f335627e) == 0 && this.f335628f == c10391a.f335628f;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f335625c, r.e(this.f335624b, this.f335623a.hashCode() * 31, 31), 31);
                ET0.b bVar = this.f335626d;
                return Boolean.hashCode(this.f335628f) + r.d(this.f335627e, (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(alignment=");
                sb2.append(this.f335623a);
                sb2.append(", width=");
                sb2.append(this.f335624b);
                sb2.append(", height=");
                sb2.append(this.f335625c);
                sb2.append(", margin=");
                sb2.append(this.f335626d);
                sb2.append(", weight=");
                sb2.append(this.f335627e);
                sb2.append(", layoutVisible=");
                return r.x(sb2, this.f335628f, ')');
            }
        }

        public C10390a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10391a c10391a) {
            this.f335621a = interfaceC36249i;
            this.f335622b = c10391a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f335622b.f335628f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10390a)) {
                return false;
            }
            C10390a c10390a = (C10390a) obj;
            return L.f(this.f335621a, c10390a.f335621a) && L.f(this.f335622b, c10390a.f335622b);
        }

        public final int hashCode() {
            return this.f335622b.hashCode() + (this.f335621a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335065a() {
            return this.f335621a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f335621a + ", params=" + this.f335622b + ')';
        }
    }

    public a(@Y61.k String str, @Y61.l ET0.b bVar, @Y61.k ET0.a<C10390a> aVar, @Y61.l Y41.a<G0> aVar2, boolean z12, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str2) {
        this.f335613a = str;
        this.f335614b = bVar;
        this.f335615c = aVar;
        this.f335616d = aVar2;
        this.f335617e = z12;
        this.f335618f = aVar3;
        this.f335619g = aVar4;
        this.f335620h = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f335618f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f335619g;
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
        return L.f(this.f335613a, aVar.f335613a) && L.f(this.f335614b, aVar.f335614b) && L.f(this.f335615c, aVar.f335615c) && L.f(this.f335616d, aVar.f335616d) && this.f335617e == aVar.f335617e && L.f(this.f335618f, aVar.f335618f) && L.f(this.f335619g, aVar.f335619g) && L.f(this.f335620h, aVar.f335620h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335051l() {
        return this.f335620h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335048i() {
        return this.f335617e;
    }

    public final int hashCode() {
        int iHashCode = this.f335613a.hashCode() * 31;
        ET0.b bVar = this.f335614b;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f335615c.f4014b, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Y41.a<G0> aVar = this.f335616d;
        int i12 = r.i((iG2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f335617e);
        Y41.a<G0> aVar2 = this.f335618f;
        int iHashCode2 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335619g;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f335620h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnState(backgroundColor=");
        sb2.append(this.f335613a);
        sb2.append(", padding=");
        sb2.append(this.f335614b);
        sb2.append(", children=");
        sb2.append(this.f335615c);
        sb2.append(", onClick=");
        sb2.append(this.f335616d);
        sb2.append(", visible=");
        sb2.append(this.f335617e);
        sb2.append(", onShow=");
        sb2.append(this.f335618f);
        sb2.append(", onHide=");
        sb2.append(this.f335619g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335620h, ')');
    }
}
