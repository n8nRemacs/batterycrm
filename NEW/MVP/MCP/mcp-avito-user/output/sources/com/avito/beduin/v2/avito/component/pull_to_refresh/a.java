package com.avito.beduin.v2.avito.component.pull_to_refresh;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.engine.component.F;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoPullToRefreshState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a;", "Lcom/avito/beduin/v2/engine/component/c;", "Lcom/avito/beduin/v2/engine/component/F;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c, F<C10377a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<i> f334850a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334852c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Boolean f334853d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C10377a f334854e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f334855f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334856g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334857h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f334858i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f334859j;

    /* compiled from: AvitoPullToRefreshState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.pull_to_refresh.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10377a implements q<C10378a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f334860a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10378a f334861b;

        /* compiled from: AvitoPullToRefreshState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/pull_to_refresh/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.avito.component.pull_to_refresh.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10378a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final ET0.b f334862a;

            public C10378a(@Y61.l ET0.b bVar) {
                this.f334862a = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10378a) && L.f(this.f334862a, ((C10378a) obj).f334862a);
            }

            public final int hashCode() {
                ET0.b bVar = this.f334862a;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Params(margin=" + this.f334862a + ')';
            }
        }

        public C10377a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10378a c10378a) {
            this.f334860a = interfaceC36249i;
            this.f334861b = c10378a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10377a)) {
                return false;
            }
            C10377a c10377a = (C10377a) obj;
            return L.f(this.f334860a, c10377a.f334860a) && L.f(this.f334861b, c10377a.f334861b);
        }

        public final int hashCode() {
            return this.f334861b.hashCode() + (this.f334860a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF334860a() {
            return this.f334860a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f334860a + ", params=" + this.f334861b + ')';
        }
    }

    public a(@Y61.k com.avito.beduin.v2.theme.l<i> lVar, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l Boolean bool, @Y61.l C10377a c10377a, boolean z13, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @Y61.l String str) {
        this.f334850a = lVar;
        this.f334851b = z12;
        this.f334852c = aVar;
        this.f334853d = bool;
        this.f334854e = c10377a;
        this.f334855f = z13;
        this.f334856g = aVar2;
        this.f334857h = aVar3;
        this.f334858i = cVar;
        this.f334859j = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334856g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334857h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f334858i;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f334850a, aVar.f334850a) && this.f334851b == aVar.f334851b && L.f(this.f334852c, aVar.f334852c) && L.f(this.f334853d, aVar.f334853d) && L.f(this.f334854e, aVar.f334854e) && this.f334855f == aVar.f334855f && L.f(this.f334856g, aVar.f334856g) && L.f(this.f334857h, aVar.f334857h) && L.f(this.f334858i, aVar.f334858i) && L.f(this.f334859j, aVar.f334859j);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334859j() {
        return this.f334859j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334855f() {
        return this.f334855f;
    }

    public final int hashCode() {
        int i12 = r.i(this.f334850a.hashCode() * 31, 31, this.f334851b);
        Y41.a<G0> aVar = this.f334852c;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f334853d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C10377a c10377a = this.f334854e;
        int i13 = r.i((iHashCode2 + (c10377a == null ? 0 : c10377a.hashCode())) * 31, 31, this.f334855f);
        Y41.a<G0> aVar2 = this.f334856g;
        int iHashCode3 = (i13 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f334857h;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar = this.f334858i;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : Arrays.hashCode(cVar.f336915a))) * 31;
        String str = this.f334859j;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoPullToRefreshState(style=");
        sb2.append(this.f334850a);
        sb2.append(", isRefreshing=");
        sb2.append(this.f334851b);
        sb2.append(", onRefresh=");
        sb2.append(this.f334852c);
        sb2.append(", disableScrollWhileRefreshing=");
        sb2.append(this.f334853d);
        sb2.append(", child=");
        sb2.append(this.f334854e);
        sb2.append(", visible=");
        sb2.append(this.f334855f);
        sb2.append(", onShow=");
        sb2.append(this.f334856g);
        sb2.append(", onHide=");
        sb2.append(this.f334857h);
        sb2.append(", markers=");
        sb2.append(this.f334858i);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334859j, ')');
    }
}
