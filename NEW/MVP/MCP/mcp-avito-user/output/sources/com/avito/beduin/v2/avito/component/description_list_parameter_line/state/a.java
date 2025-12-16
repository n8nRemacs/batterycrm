package com.avito.beduin.v2.avito.component.description_list_parameter_line.state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDescriptionListParameterLineState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10374a> f334270a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<n> f334271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DescriptionListLineStyle f334272c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334273d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334274e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334275f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f334276g;

    /* compiled from: AvitoDescriptionListParameterLineState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.description_list_parameter_line.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10374a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334277a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334278b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final b f334279c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Y41.a<G0> f334280d;

        public C10374a(@Y61.k String str, @Y61.k String str2, @Y61.l b bVar, @Y61.l Y41.a<G0> aVar) {
            this.f334277a = str;
            this.f334278b = str2;
            this.f334279c = bVar;
            this.f334280d = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10374a)) {
                return false;
            }
            C10374a c10374a = (C10374a) obj;
            return L.f(this.f334277a, c10374a.f334277a) && L.f(this.f334278b, c10374a.f334278b) && L.f(this.f334279c, c10374a.f334279c) && L.f(this.f334280d, c10374a.f334280d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f334277a.hashCode() * 31, 31, this.f334278b);
            b bVar = this.f334279c;
            int iHashCode = (iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Y41.a<G0> aVar = this.f334280d;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Child(title=");
            sb2.append(this.f334277a);
            sb2.append(", description=");
            sb2.append(this.f334278b);
            sb2.append(", icon=");
            sb2.append(this.f334279c);
            sb2.append(", onIconClick=");
            return androidx.appcompat.app.r.v(sb2, this.f334280d, ')');
        }
    }

    /* compiled from: AvitoDescriptionListParameterLineState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/a$b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334281a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f334282b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.r f334283c;

        public b(@Y61.k String str, @Y61.l String str2, @Y61.k com.avito.beduin.v2.theme.r rVar) {
            this.f334281a = str;
            this.f334282b = str2;
            this.f334283c = rVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f334281a, bVar.f334281a) && L.f(this.f334282b, bVar.f334282b) && L.f(this.f334283c, bVar.f334283c);
        }

        public final int hashCode() {
            int iHashCode = this.f334281a.hashCode() * 31;
            String str = this.f334282b;
            return this.f334283c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "LocalIcon(name=" + this.f334281a + ", themeName=" + this.f334282b + ", color=" + this.f334283c + ')';
        }
    }

    public a(@Y61.k ET0.a<C10374a> aVar, @Y61.k com.avito.beduin.v2.theme.l<n> lVar, @Y61.k DescriptionListLineStyle descriptionListLineStyle, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f334270a = aVar;
        this.f334271b = lVar;
        this.f334272c = descriptionListLineStyle;
        this.f334273d = z12;
        this.f334274e = aVar2;
        this.f334275f = aVar3;
        this.f334276g = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334274e;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334275f;
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
        return L.f(this.f334270a, aVar.f334270a) && L.f(this.f334271b, aVar.f334271b) && this.f334272c == aVar.f334272c && this.f334273d == aVar.f334273d && L.f(this.f334274e, aVar.f334274e) && L.f(this.f334275f, aVar.f334275f) && L.f(this.f334276g, aVar.f334276g);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334276g() {
        return this.f334276g;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334273d() {
        return this.f334273d;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f334272c.hashCode() + C31685o.g(this.f334271b, this.f334270a.f4014b.hashCode() * 31, 31)) * 31, 31, this.f334273d);
        Y41.a<G0> aVar = this.f334274e;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334275f;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334276g;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDescriptionListParameterLineState(children=");
        sb2.append(this.f334270a);
        sb2.append(", style=");
        sb2.append(this.f334271b);
        sb2.append(", lineStyle=");
        sb2.append(this.f334272c);
        sb2.append(", visible=");
        sb2.append(this.f334273d);
        sb2.append(", onShow=");
        sb2.append(this.f334274e);
        sb2.append(", onHide=");
        sb2.append(this.f334275f);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334276g, ')');
    }
}
