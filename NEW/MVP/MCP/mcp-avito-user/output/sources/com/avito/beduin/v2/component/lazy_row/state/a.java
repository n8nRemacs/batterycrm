package com.avito.beduin.v2.component.lazy_row.state;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.engine.component.InterfaceC36245e;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LazyRowState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a;", "Lcom/avito/beduin/v2/engine/component/e;", "Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36245e<C10413a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ET0.a<C10413a> f336066a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f336067b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<G0> f336068c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ET0.b f336069d;

    /* renamed from: e, reason: collision with root package name */
    public final int f336070e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.l<ScrollType, G0> f336071f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final q<Integer, Integer, ScrollType, G0> f336072g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f336073h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.a<G0> f336074i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f336075j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f336076k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f336077l;

    /* compiled from: LazyRowState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/lazy_row/state/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.lazy_row.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10413a implements com.avito.beduin.v2.engine.component.q<C10414a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC36249i f336078a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C10414a f336079b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f336080c;

        /* compiled from: LazyRowState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_row.state.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10414a {

            /* renamed from: a, reason: collision with root package name */
            public final int f336081a;

            /* renamed from: b, reason: collision with root package name */
            public final int f336082b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final ET0.b f336083c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f336084d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f336085e;

            public C10414a(int i12, int i13, @l ET0.b bVar, @l String str, boolean z12) {
                this.f336081a = i12;
                this.f336082b = i13;
                this.f336083c = bVar;
                this.f336084d = str;
                this.f336085e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10414a)) {
                    return false;
                }
                C10414a c10414a = (C10414a) obj;
                return this.f336081a == c10414a.f336081a && this.f336082b == c10414a.f336082b && L.f(this.f336083c, c10414a.f336083c) && L.f(this.f336084d, c10414a.f336084d) && this.f336085e == c10414a.f336085e;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f336082b, Integer.hashCode(this.f336081a) * 31, 31);
                ET0.b bVar = this.f336083c;
                int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                String str = this.f336084d;
                return Boolean.hashCode(this.f336085e) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(width=");
                sb2.append(this.f336081a);
                sb2.append(", height=");
                sb2.append(this.f336082b);
                sb2.append(", margin=");
                sb2.append(this.f336083c);
                sb2.append(", itemType=");
                sb2.append(this.f336084d);
                sb2.append(", layoutVisible=");
                return r.x(sb2, this.f336085e, ')');
            }
        }

        public C10413a(@k InterfaceC36249i interfaceC36249i, @k C10414a c10414a) {
            this.f336078a = interfaceC36249i;
            this.f336079b = c10414a;
            String str = c10414a.f336084d;
            this.f336080c = str == null ? interfaceC36249i.m() : str;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f336079b.f336085e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10413a)) {
                return false;
            }
            C10413a c10413a = (C10413a) obj;
            return L.f(this.f336078a, c10413a.f336078a) && L.f(this.f336079b, c10413a.f336079b);
        }

        public final int hashCode() {
            return this.f336079b.hashCode() + (this.f336078a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF336078a() {
            return this.f336078a;
        }

        @k
        public final String toString() {
            return "Child(component=" + this.f336078a + ", params=" + this.f336079b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k ET0.a<C10413a> aVar, @k String str, @l Y41.a<G0> aVar2, @l ET0.b bVar, int i12, @l Y41.l<? super ScrollType, G0> lVar, @l q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, boolean z12, @l Y41.a<G0> aVar3, @l Y41.a<G0> aVar4, @l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @l String str2) {
        this.f336066a = aVar;
        this.f336067b = str;
        this.f336068c = aVar2;
        this.f336069d = bVar;
        this.f336070e = i12;
        this.f336071f = lVar;
        this.f336072g = qVar;
        this.f336073h = z12;
        this.f336074i = aVar3;
        this.f336075j = aVar4;
        this.f336076k = cVar;
        this.f336077l = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f336074i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f336075j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f336076k;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f336066a, aVar.f336066a) && L.f(this.f336067b, aVar.f336067b) && L.f(this.f336068c, aVar.f336068c) && L.f(this.f336069d, aVar.f336069d) && this.f336070e == aVar.f336070e && L.f(this.f336071f, aVar.f336071f) && L.f(this.f336072g, aVar.f336072g) && this.f336073h == aVar.f336073h && L.f(this.f336074i, aVar.f336074i) && L.f(this.f336075j, aVar.f336075j) && L.f(this.f336076k, aVar.f336076k) && L.f(this.f336077l, aVar.f336077l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF335998l() {
        return this.f336077l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF335994h() {
        return this.f336073h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f336066a.f4014b.hashCode() * 31, 31, this.f336067b);
        Y41.a<G0> aVar = this.f336068c;
        int iHashCode = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ET0.b bVar = this.f336069d;
        int iE2 = r.e(this.f336070e, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Y41.l<ScrollType, G0> lVar = this.f336071f;
        int iHashCode2 = (iE2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        q<Integer, Integer, ScrollType, G0> qVar = this.f336072g;
        int i12 = r.i((iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f336073h);
        Y41.a<G0> aVar2 = this.f336074i;
        int iHashCode3 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f336075j;
        int iHashCode4 = (Arrays.hashCode(this.f336076k.f336915a) + ((iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31)) * 31;
        String str = this.f336077l;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LazyRowState(children=");
        sb2.append(this.f336066a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f336067b);
        sb2.append(", onPrefetch=");
        sb2.append(this.f336068c);
        sb2.append(", padding=");
        sb2.append(this.f336069d);
        sb2.append(", prerenderItems=");
        sb2.append(this.f336070e);
        sb2.append(", onScrollStart=");
        sb2.append(this.f336071f);
        sb2.append(", onScrollEnd=");
        sb2.append(this.f336072g);
        sb2.append(", visible=");
        sb2.append(this.f336073h);
        sb2.append(", onShow=");
        sb2.append(this.f336074i);
        sb2.append(", onHide=");
        sb2.append(this.f336075j);
        sb2.append(", markers=");
        sb2.append(this.f336076k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f336077l, ')');
    }
}
