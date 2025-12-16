package com.avito.beduin.v2.component.scroll_container.state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.InterfaceC36245e;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScrollContainerState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/scroll_container/state/d;", "Lcom/avito/beduin/v2/engine/component/e;", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d implements InterfaceC36245e<a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<a> f336193a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f336195c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f336196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f336197e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ET0.b f336198f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f336199g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f336200h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336201i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f336202j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f336203k;

    /* compiled from: ScrollContainerState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/scroll_container/state/d$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/scroll_container/state/d$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.beduin.v2.engine.component.q<C10424a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f336204a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10424a f336205b;

        /* compiled from: ScrollContainerState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/scroll_container/state/d$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.scroll_container.state.d$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10424a {

            /* renamed from: a, reason: collision with root package name */
            public final int f336206a;

            /* renamed from: b, reason: collision with root package name */
            public final int f336207b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final ET0.b f336208c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f336209d;

            public C10424a(int i12, int i13, @Y61.l ET0.b bVar, boolean z12) {
                this.f336206a = i12;
                this.f336207b = i13;
                this.f336208c = bVar;
                this.f336209d = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10424a)) {
                    return false;
                }
                C10424a c10424a = (C10424a) obj;
                return this.f336206a == c10424a.f336206a && this.f336207b == c10424a.f336207b && L.f(this.f336208c, c10424a.f336208c) && this.f336209d == c10424a.f336209d;
            }

            public final int hashCode() {
                int iE2 = androidx.appcompat.app.r.e(this.f336207b, Integer.hashCode(this.f336206a) * 31, 31);
                ET0.b bVar = this.f336208c;
                return Boolean.hashCode(this.f336209d) + ((iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(width=");
                sb2.append(this.f336206a);
                sb2.append(", height=");
                sb2.append(this.f336207b);
                sb2.append(", margin=");
                sb2.append(this.f336208c);
                sb2.append(", layoutVisible=");
                return androidx.appcompat.app.r.x(sb2, this.f336209d, ')');
            }
        }

        public a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10424a c10424a) {
            this.f336204a = interfaceC36249i;
            this.f336205b = c10424a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f336205b.f336209d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f336204a, aVar.f336204a) && L.f(this.f336205b, aVar.f336205b);
        }

        public final int hashCode() {
            return this.f336205b.hashCode() + (this.f336204a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF336078a() {
            return this.f336204a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f336204a + ", params=" + this.f336205b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k ET0.a<a> aVar, @Y61.k String str, @Y61.l Y41.l<? super Integer, G0> lVar, @Y61.l Integer num, int i12, @Y61.l ET0.b bVar, @Y61.l Y41.l<? super Boolean, G0> lVar2, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str2) {
        this.f336193a = aVar;
        this.f336194b = str;
        this.f336195c = lVar;
        this.f336196d = num;
        this.f336197e = i12;
        this.f336198f = bVar;
        this.f336199g = lVar2;
        this.f336200h = z12;
        this.f336201i = aVar2;
        this.f336202j = aVar3;
        this.f336203k = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f336201i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f336202j;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f336193a, dVar.f336193a) && L.f(this.f336194b, dVar.f336194b) && L.f(this.f336195c, dVar.f336195c) && L.f(this.f336196d, dVar.f336196d) && this.f336197e == dVar.f336197e && L.f(this.f336198f, dVar.f336198f) && L.f(this.f336199g, dVar.f336199g) && this.f336200h == dVar.f336200h && L.f(this.f336201i, dVar.f336201i) && L.f(this.f336202j, dVar.f336202j) && L.f(this.f336203k, dVar.f336203k);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF336077l() {
        return this.f336203k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336073h() {
        return this.f336200h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f336193a.f4014b.hashCode() * 31, 31, this.f336194b);
        Y41.l<Integer, G0> lVar = this.f336195c;
        int iE2 = androidx.appcompat.app.r.e(this.f336197e, (this.f336196d.hashCode() + ((iD2 + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31, 31);
        ET0.b bVar = this.f336198f;
        int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar2 = this.f336199g;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31, 31, this.f336200h);
        Y41.a<G0> aVar = this.f336201i;
        int iHashCode2 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f336202j;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f336203k;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollContainerState(children=");
        sb2.append(this.f336193a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f336194b);
        sb2.append(", onPageSelected=");
        sb2.append(this.f336195c);
        sb2.append(", itemSpacing=");
        sb2.append(this.f336196d);
        sb2.append(", currentIndex=");
        sb2.append(this.f336197e);
        sb2.append(", padding=");
        sb2.append(this.f336198f);
        sb2.append(", onPaginationAvailable=");
        sb2.append(this.f336199g);
        sb2.append(", visible=");
        sb2.append(this.f336200h);
        sb2.append(", onShow=");
        sb2.append(this.f336201i);
        sb2.append(", onHide=");
        sb2.append(this.f336202j);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f336203k, ')');
    }
}
