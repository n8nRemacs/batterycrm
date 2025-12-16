package com.avito.beduin.v2.avito.component.button.banner;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.F;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.component.q;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoBannerState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/banner/a;", "Lcom/avito/beduin/v2/engine/component/c;", "Lcom/avito/beduin/v2/engine/component/F;", "Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c, F<C10369a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f333907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<m> f333909c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C10369a f333910d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f333911e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333912f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f333913g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f333914h;

    /* compiled from: AvitoBannerState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/banner/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/avito/component/button/banner/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.button.banner.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10369a implements q<C10370a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f333915a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C10370a f333916b;

        /* compiled from: AvitoBannerState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/button/banner/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.avito.component.button.banner.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10370a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final ET0.b f333917a;

            public C10370a(@Y61.l ET0.b bVar) {
                this.f333917a = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10370a) && L.f(this.f333917a, ((C10370a) obj).f333917a);
            }

            public final int hashCode() {
                ET0.b bVar = this.f333917a;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Params(margin=" + this.f333917a + ')';
            }
        }

        public C10369a(@Y61.k InterfaceC36249i interfaceC36249i, @Y61.k C10370a c10370a) {
            this.f333915a = interfaceC36249i;
            this.f333916b = c10370a;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10369a)) {
                return false;
            }
            C10369a c10369a = (C10369a) obj;
            return L.f(this.f333915a, c10369a.f333915a) && L.f(this.f333916b, c10369a.f333916b);
        }

        public final int hashCode() {
            return this.f333916b.hashCode() + (this.f333915a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @Y61.k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF333915a() {
            return this.f333915a;
        }

        @Y61.k
        public final String toString() {
            return "Child(component=" + this.f333915a + ", params=" + this.f333916b + ')';
        }
    }

    public a(@Y61.l String str, @Y61.l Y41.a<G0> aVar, @Y61.k com.avito.beduin.v2.theme.l<m> lVar, @Y61.l C10369a c10369a, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str2) {
        this.f333907a = str;
        this.f333908b = aVar;
        this.f333909c = lVar;
        this.f333910d = c10369a;
        this.f333911e = z12;
        this.f333912f = aVar2;
        this.f333913g = aVar3;
        this.f333914h = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f333912f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f333913g;
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
        return L.f(this.f333907a, aVar.f333907a) && L.f(this.f333908b, aVar.f333908b) && L.f(this.f333909c, aVar.f333909c) && L.f(this.f333910d, aVar.f333910d) && this.f333911e == aVar.f333911e && L.f(this.f333912f, aVar.f333912f) && L.f(this.f333913g, aVar.f333913g) && L.f(this.f333914h, aVar.f333914h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF333914h() {
        return this.f333914h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF333911e() {
        return this.f333911e;
    }

    public final int hashCode() {
        String str = this.f333907a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Y41.a<G0> aVar = this.f333908b;
        int iG2 = C31685o.g(this.f333909c, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        C10369a c10369a = this.f333910d;
        int i12 = r.i((iG2 + (c10369a == null ? 0 : c10369a.hashCode())) * 31, 31, this.f333911e);
        Y41.a<G0> aVar2 = this.f333912f;
        int iHashCode2 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f333913g;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str2 = this.f333914h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoBannerState(title=");
        sb2.append(this.f333907a);
        sb2.append(", onCloseButtonClick=");
        sb2.append(this.f333908b);
        sb2.append(", style=");
        sb2.append(this.f333909c);
        sb2.append(", child=");
        sb2.append(this.f333910d);
        sb2.append(", visible=");
        sb2.append(this.f333911e);
        sb2.append(", onShow=");
        sb2.append(this.f333912f);
        sb2.append(", onHide=");
        sb2.append(this.f333913g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f333914h, ')');
    }
}
