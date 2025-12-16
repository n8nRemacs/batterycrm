package com.avito.beduin.v2.avito.component.chips.state;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.component.common.HorizontalAlignment;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoChipsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/chips/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DisplayView f334050a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ET0.a<C10371a> f334051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, G0> f334052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<n> f334053d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334054e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334055f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334056g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f334057h;

    /* compiled from: AvitoChipsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/chips/state/a$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.avito.component.chips.state.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10371a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f334058a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f334059b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f334060c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f334061d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f334062e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final HorizontalAlignment f334063f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Y41.l<Boolean, G0> f334064g;

        /* JADX WARN: Multi-variable type inference failed */
        public C10371a(@Y61.l String str, boolean z12, boolean z13, boolean z14, @Y61.l String str2, @Y61.l HorizontalAlignment horizontalAlignment, @Y61.l Y41.l<? super Boolean, G0> lVar) {
            this.f334058a = str;
            this.f334059b = z12;
            this.f334060c = z13;
            this.f334061d = z14;
            this.f334062e = str2;
            this.f334063f = horizontalAlignment;
            this.f334064g = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10371a)) {
                return false;
            }
            C10371a c10371a = (C10371a) obj;
            return L.f(this.f334058a, c10371a.f334058a) && this.f334059b == c10371a.f334059b && this.f334060c == c10371a.f334060c && this.f334061d == c10371a.f334061d && L.f(this.f334062e, c10371a.f334062e) && this.f334063f == c10371a.f334063f && L.f(this.f334064g, c10371a.f334064g);
        }

        public final int hashCode() {
            String str = this.f334058a;
            int i12 = r.i(r.i(r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f334059b), 31, this.f334060c), 31, this.f334061d);
            String str2 = this.f334062e;
            int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            HorizontalAlignment horizontalAlignment = this.f334063f;
            int iHashCode2 = (iHashCode + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
            Y41.l<Boolean, G0> lVar = this.f334064g;
            return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Child(title=");
            sb2.append(this.f334058a);
            sb2.append(", isEnabled=");
            sb2.append(this.f334059b);
            sb2.append(", isSelected=");
            sb2.append(this.f334060c);
            sb2.append(", isActive=");
            sb2.append(this.f334061d);
            sb2.append(", icon=");
            sb2.append(this.f334062e);
            sb2.append(", iconAlignment=");
            sb2.append(this.f334063f);
            sb2.append(", onChange=");
            return H.l(sb2, this.f334064g, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k DisplayView displayView, @Y61.k ET0.a<C10371a> aVar, @Y61.l Y41.l<? super Integer, G0> lVar, @Y61.k com.avito.beduin.v2.theme.l<n> lVar2, boolean z12, @Y61.l Y41.a<G0> aVar2, @Y61.l Y41.a<G0> aVar3, @Y61.l String str) {
        this.f334050a = displayView;
        this.f334051b = aVar;
        this.f334052c = lVar;
        this.f334053d = lVar2;
        this.f334054e = z12;
        this.f334055f = aVar2;
        this.f334056g = aVar3;
        this.f334057h = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334055f;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334056g;
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
        return this.f334050a == aVar.f334050a && L.f(this.f334051b, aVar.f334051b) && L.f(this.f334052c, aVar.f334052c) && L.f(this.f334053d, aVar.f334053d) && this.f334054e == aVar.f334054e && L.f(this.f334055f, aVar.f334055f) && L.f(this.f334056g, aVar.f334056g) && L.f(this.f334057h, aVar.f334057h);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334688p() {
        return this.f334057h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334685m() {
        return this.f334054e;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f334051b.f4014b, this.f334050a.hashCode() * 31, 31);
        Y41.l<Integer, G0> lVar = this.f334052c;
        int i12 = r.i(C31685o.g(this.f334053d, (iG2 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31), 31, this.f334054e);
        Y41.a<G0> aVar = this.f334055f;
        int iHashCode = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334056g;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334057h;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoChipsState(displayView=");
        sb2.append(this.f334050a);
        sb2.append(", children=");
        sb2.append(this.f334051b);
        sb2.append(", onScrollChange=");
        sb2.append(this.f334052c);
        sb2.append(", style=");
        sb2.append(this.f334053d);
        sb2.append(", visible=");
        sb2.append(this.f334054e);
        sb2.append(", onShow=");
        sb2.append(this.f334055f);
        sb2.append(", onHide=");
        sb2.append(this.f334056g);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334057h, ')');
    }
}
