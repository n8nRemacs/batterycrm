package com.avito.beduin.v2.avito.component.description_list.state;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDescriptionListState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "b", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10373a> f334227a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<m> f334228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334229c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334230d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334231e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f334232f;

    /* compiled from: AvitoDescriptionListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list/state/a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.description_list.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10373a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334233a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334234b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final b f334235c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Y41.a<G0> f334236d;

        public C10373a(@Y61.k String str, @Y61.k String str2, @Y61.l b bVar, @Y61.l Y41.a<G0> aVar) {
            this.f334233a = str;
            this.f334234b = str2;
            this.f334235c = bVar;
            this.f334236d = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10373a)) {
                return false;
            }
            C10373a c10373a = (C10373a) obj;
            return L.f(this.f334233a, c10373a.f334233a) && L.f(this.f334234b, c10373a.f334234b) && L.f(this.f334235c, c10373a.f334235c) && L.f(this.f334236d, c10373a.f334236d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f334233a.hashCode() * 31, 31, this.f334234b);
            b bVar = this.f334235c;
            int iHashCode = (iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Y41.a<G0> aVar = this.f334236d;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Child(title=");
            sb2.append(this.f334233a);
            sb2.append(", description=");
            sb2.append(this.f334234b);
            sb2.append(", icon=");
            sb2.append(this.f334235c);
            sb2.append(", onIconClick=");
            return r.v(sb2, this.f334236d, ')');
        }
    }

    /* compiled from: AvitoDescriptionListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list/state/a$b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334237a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f334238b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.theme.r f334239c;

        public b(@Y61.k String str, @Y61.l String str2, @Y61.k com.avito.beduin.v2.theme.r rVar) {
            this.f334237a = str;
            this.f334238b = str2;
            this.f334239c = rVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f334237a, bVar.f334237a) && L.f(this.f334238b, bVar.f334238b) && L.f(this.f334239c, bVar.f334239c);
        }

        public final int hashCode() {
            int iHashCode = this.f334237a.hashCode() * 31;
            String str = this.f334238b;
            return this.f334239c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "LocalIcon(name=" + this.f334237a + ", themeName=" + this.f334238b + ", color=" + this.f334239c + ')';
        }
    }

    public a(@Y61.k ET0.a<C10373a> aVar, @Y61.k com.avito.beduin.v2.theme.l<m> lVar, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f334227a = aVar;
        this.f334228b = lVar;
        this.f334229c = z12;
        this.f334230d = aVar2;
        this.f334231e = aVar3;
        this.f334232f = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334230d;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334231e;
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
        return L.f(this.f334227a, aVar.f334227a) && L.f(this.f334228b, aVar.f334228b) && this.f334229c == aVar.f334229c && L.f(this.f334230d, aVar.f334230d) && L.f(this.f334231e, aVar.f334231e) && L.f(this.f334232f, aVar.f334232f);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334232f() {
        return this.f334232f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334229c() {
        return this.f334229c;
    }

    public final int hashCode() {
        int i12 = r.i(C31685o.g(this.f334228b, this.f334227a.f4014b.hashCode() * 31, 31), 31, this.f334229c);
        Y41.a<G0> aVar = this.f334230d;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334231e;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334232f;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDescriptionListState(children=");
        sb2.append(this.f334227a);
        sb2.append(", style=");
        sb2.append(this.f334228b);
        sb2.append(", visible=");
        sb2.append(this.f334229c);
        sb2.append(", onShow=");
        sb2.append(this.f334230d);
        sb2.append(", onHide=");
        sb2.append(this.f334231e);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334232f, ')');
    }
}
