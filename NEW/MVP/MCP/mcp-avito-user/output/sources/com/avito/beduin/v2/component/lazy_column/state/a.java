package com.avito.beduin.v2.component.lazy_column.state;

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

/* compiled from: LazyColumnState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/state/a;", "Lcom/avito/beduin/v2/engine/component/e;", "Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36245e<C10406a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ET0.a<C10406a> f335987a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f335988b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335989c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ET0.b f335990d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335991e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.l<ScrollType, G0> f335992f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final q<Integer, Integer, ScrollType, G0> f335993g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f335994h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335995i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f335996j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> f335997k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f335998l;

    /* compiled from: LazyColumnState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/state/a$a;", "Lcom/avito/beduin/v2/engine/component/q;", "Lcom/avito/beduin/v2/component/lazy_column/state/a$a$a;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.lazy_column.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10406a implements com.avito.beduin.v2.engine.component.q<C10407a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC36249i f335999a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C10407a f336000b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f336001c;

        /* compiled from: LazyColumnState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/state/a$a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_column.state.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C10407a {

            /* renamed from: a, reason: collision with root package name */
            public final int f336002a;

            /* renamed from: b, reason: collision with root package name */
            public final int f336003b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final ET0.b f336004c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f336005d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f336006e;

            public C10407a(int i12, int i13, @l ET0.b bVar, @l String str, boolean z12) {
                this.f336002a = i12;
                this.f336003b = i13;
                this.f336004c = bVar;
                this.f336005d = str;
                this.f336006e = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10407a)) {
                    return false;
                }
                C10407a c10407a = (C10407a) obj;
                return this.f336002a == c10407a.f336002a && this.f336003b == c10407a.f336003b && L.f(this.f336004c, c10407a.f336004c) && L.f(this.f336005d, c10407a.f336005d) && this.f336006e == c10407a.f336006e;
            }

            public final int hashCode() {
                int iE2 = r.e(this.f336003b, Integer.hashCode(this.f336002a) * 31, 31);
                ET0.b bVar = this.f336004c;
                int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                String str = this.f336005d;
                return Boolean.hashCode(this.f336006e) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(width=");
                sb2.append(this.f336002a);
                sb2.append(", height=");
                sb2.append(this.f336003b);
                sb2.append(", margin=");
                sb2.append(this.f336004c);
                sb2.append(", itemType=");
                sb2.append(this.f336005d);
                sb2.append(", layoutVisible=");
                return r.x(sb2, this.f336006e, ')');
            }
        }

        public C10406a(@k InterfaceC36249i interfaceC36249i, @k C10407a c10407a) {
            this.f335999a = interfaceC36249i;
            this.f336000b = c10407a;
            String str = c10407a.f336005d;
            this.f336001c = str == null ? interfaceC36249i.m() : str;
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        public final boolean a() {
            return this.f336000b.f336006e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10406a)) {
                return false;
            }
            C10406a c10406a = (C10406a) obj;
            return L.f(this.f335999a, c10406a.f335999a) && L.f(this.f336000b, c10406a.f336000b);
        }

        public final int hashCode() {
            return this.f336000b.hashCode() + (this.f335999a.hashCode() * 31);
        }

        @Override // com.avito.beduin.v2.engine.component.InterfaceC36244d
        @k
        /* renamed from: r0, reason: from getter */
        public final InterfaceC36249i getF335999a() {
            return this.f335999a;
        }

        @k
        public final String toString() {
            return "Child(component=" + this.f335999a + ", params=" + this.f336000b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k ET0.a<C10406a> aVar, @k String str, @l Y41.a<G0> aVar2, @l ET0.b bVar, int i12, @l Y41.l<? super ScrollType, G0> lVar, @l q<? super Integer, ? super Integer, ? super ScrollType, G0> qVar, boolean z12, @l Y41.a<G0> aVar3, @l Y41.a<G0> aVar4, @l com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar, @l String str2) {
        this.f335987a = aVar;
        this.f335988b = str;
        this.f335989c = aVar2;
        this.f335990d = bVar;
        this.f335991e = i12;
        this.f335992f = lVar;
        this.f335993g = qVar;
        this.f335994h = z12;
        this.f335995i = aVar3;
        this.f335996j = aVar4;
        this.f335997k = cVar;
        this.f335998l = str2;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> b() {
        return this.f335995i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @l
    public final Y41.a<G0> d() {
        return this.f335996j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return this.f335997k;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f335987a, aVar.f335987a) && L.f(this.f335988b, aVar.f335988b) && L.f(this.f335989c, aVar.f335989c) && L.f(this.f335990d, aVar.f335990d) && this.f335991e == aVar.f335991e && L.f(this.f335992f, aVar.f335992f) && L.f(this.f335993g, aVar.f335993g) && this.f335994h == aVar.f335994h && L.f(this.f335995i, aVar.f335995i) && L.f(this.f335996j, aVar.f335996j) && L.f(this.f335997k, aVar.f335997k) && L.f(this.f335998l, aVar.f335998l);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @l
    /* renamed from: getTag, reason: from getter */
    public final String getF336077l() {
        return this.f335998l;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF336073h() {
        return this.f335994h;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f335987a.f4014b.hashCode() * 31, 31, this.f335988b);
        Y41.a<G0> aVar = this.f335989c;
        int iHashCode = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ET0.b bVar = this.f335990d;
        int iE2 = r.e(this.f335991e, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Y41.l<ScrollType, G0> lVar = this.f335992f;
        int iHashCode2 = (iE2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        q<Integer, Integer, ScrollType, G0> qVar = this.f335993g;
        int i12 = r.i((iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f335994h);
        Y41.a<G0> aVar2 = this.f335995i;
        int iHashCode3 = (i12 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f335996j;
        int iHashCode4 = (Arrays.hashCode(this.f335997k.f336915a) + ((iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31)) * 31;
        String str = this.f335998l;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LazyColumnState(children=");
        sb2.append(this.f335987a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f335988b);
        sb2.append(", onPrefetch=");
        sb2.append(this.f335989c);
        sb2.append(", padding=");
        sb2.append(this.f335990d);
        sb2.append(", prerenderItems=");
        sb2.append(this.f335991e);
        sb2.append(", onScrollStart=");
        sb2.append(this.f335992f);
        sb2.append(", onScrollEnd=");
        sb2.append(this.f335993g);
        sb2.append(", visible=");
        sb2.append(this.f335994h);
        sb2.append(", onShow=");
        sb2.append(this.f335995i);
        sb2.append(", onHide=");
        sb2.append(this.f335996j);
        sb2.append(", markers=");
        sb2.append(this.f335997k);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f335998l, ')');
    }
}
