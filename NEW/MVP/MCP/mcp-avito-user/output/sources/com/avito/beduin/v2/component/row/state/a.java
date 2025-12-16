package com.avito.beduin.v2.component.row.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.VerticalAlignment;
import com.avito.beduin.v2.engine.component.InterfaceC36246f;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RowState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/row/state/a;", "Lcom/avito/beduin/v2/engine/component/f;", "Lcom/avito/beduin/v2/component/row/state/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36246f<C10422a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336162a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ET0.b f336163b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10422a> f336164c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336165d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f336166e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336167f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336168g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f336169h;

    /* compiled from: RowState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/row/state/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/row/state/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.row.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10422a implements q<C10423a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f336170a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10423a f336171b;

        /* compiled from: RowState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/row/state/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.row.state.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10423a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final VerticalAlignment f336172a;

            /* renamed from: b, reason: collision with root package name */
            public final int f336173b;

            /* renamed from: c, reason: collision with root package name */
            public final int f336174c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final ET0.b f336175d;

            /* renamed from: e, reason: collision with root package name */
            public final float f336176e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f336177f;

            public C10423a(@Y61.k VerticalAlignment verticalAlignment, int i12, int i13, @Y61.l ET0.b bVar, float f12, boolean z12) {
                this.f336172a = verticalAlignment;
                this.f336173b = i12;
                this.f336174c = i13;
                this.f336175d = bVar;
                this.f336176e = f12;
                this.f336177f = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10423a)) {
                    return false;
                }
                C10423a c10423a = (C10423a) obj;
                return this.f336172a == c10423a.f336172a && this.f336173b == c10423a.f336173b && this.f336174c == c10423a.f336174c && L.f(this.f336175d, c10423a.f336175d) && Float.compare(this.f336176e, c10423a.f336176e) == 0 && this.f336177f == c10423a.f336177f;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f336174c, r.e(this.f336173b, this.f336172a.hashCode() * 31, 31), 31);
                ET0.b bVar = this.f336175d;
                return Boolean.hashCode(this.f336177f) + r.d(this.f336176e, (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(alignment=");
                sb2.append(this.f336172a);
                sb2.append(", width=");
                sb2.append(this.f336173b);
                sb2.append(", height=");
                sb2.append(this.f336174c);
                sb2.append(", margin=");
                sb2.append(this.f336175d);
                sb2.append(", weight=");
                sb2.append(this.f336176e);
                sb2.append(", layoutVisible=");
                return r.x(sb2, this.f336177f, ')');
            }
        }

        public C10422a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10423a c10423a) {
            this.f336170a = interfaceC36249i;
            this.f336171b = c10423a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f336171b.f336177f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10422a)) {
                return false;
            }
            C10422a c10422a = (C10422a) obj;
            return L.f(this.f336170a, c10422a.f336170a) && L.f(this.f336171b, c10422a.f336171b);
        }

        public final int hashCode() {
            return this.f336171b.hashCode() + (this.f336170a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335065a() {
            return this.f336170a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f336170a + ", params=" + this.f336171b + ')';
        }
    }

    public a(@Y61.k String str, @Y61.l ET0.b bVar, @Y61.k ET0.a<C10422a> aVar, @Y61.l Y41.a<G0> aVar2, boolean z12, @Y61.l Y41.a<G0> aVar3, @Y61.l Y41.a<G0> aVar4, @Y61.l String str2) {
        this.f336162a = str;
        this.f336163b = bVar;
        this.f336164c = aVar;
        this.f336165d = aVar2;
        this.f336166e = z12;
        this.f336167f = aVar3;
        this.f336168g = aVar4;
        this.f336169h = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f336167f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f336168g;
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
        return L.f(this.f336162a, aVar.f336162a) && L.f(this.f336163b, aVar.f336163b) && L.f(this.f336164c, aVar.f336164c) && L.f(this.f336165d, aVar.f336165d) && this.f336166e == aVar.f336166e && L.f(this.f336167f, aVar.f336167f) && L.f(this.f336168g, aVar.f336168g) && L.f(this.f336169h, aVar.f336169h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF335051l() {
        return this.f336169h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335048i() {
        return this.f336166e;
    }

    public final int hashCode() {
        int iHashCode = this.f336162a.hashCode() * 31;
        ET0.b bVar = this.f336163b;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f336164c.f4014b, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Y41.a<G0> aVar = this.f336165d;
        int i12 = r.i((iG2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f336166e);
        Y41.a<G0> aVar2 = this.f336167f;
        int iHashCode2 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f336168g;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str = this.f336169h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowState(backgroundColor=");
        sb2.append(this.f336162a);
        sb2.append(", padding=");
        sb2.append(this.f336163b);
        sb2.append(", children=");
        sb2.append(this.f336164c);
        sb2.append(", onClick=");
        sb2.append(this.f336165d);
        sb2.append(", visible=");
        sb2.append(this.f336166e);
        sb2.append(", onShow=");
        sb2.append(this.f336167f);
        sb2.append(", onHide=");
        sb2.append(this.f336168g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f336169h, ')');
    }
}
