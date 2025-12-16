package com.akita.compose.component.chips;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/akita/compose/component/chips/y;", "", "Landroidx/compose/ui/unit/h;", "horizontalSpacing", "verticalSpacing", "Lcom/akita/compose/component/chips/y$a;", "selectedStyle", "unselectedStyle", "notActiveStyle", "<init>", "(FFLcom/akita/compose/component/chips/y$a;Lcom/akita/compose/component/chips/y$a;Lcom/akita/compose/component/chips/y$a;Lkotlin/jvm/internal/w;)V", "a", "chips_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final float f60983a;

    /* renamed from: b, reason: collision with root package name */
    public final float f60984b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f60985c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f60986d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f60987e;

    public y(float f12, float f13, a aVar, a aVar2, a aVar3, C42822w c42822w) {
        this.f60983a = f12;
        this.f60984b = f13;
        this.f60985c = aVar;
        this.f60986d = aVar2;
        this.f60987e = aVar3;
    }

    public static y b(y yVar, float f12, a aVar, a aVar2, int i12) {
        if ((i12 & 1) != 0) {
            f12 = yVar.f60983a;
        }
        float f13 = f12;
        float f14 = yVar.f60984b;
        if ((i12 & 4) != 0) {
            aVar = yVar.f60985c;
        }
        a aVar3 = aVar;
        if ((i12 & 8) != 0) {
            aVar2 = yVar.f60986d;
        }
        a aVar4 = yVar.f60987e;
        yVar.getClass();
        return new y(f13, f14, aVar3, aVar2, aVar4, null);
    }

    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(boolean z12, boolean z13, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-327727331);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(z12 ? this.f60985c : !z13 ? this.f60987e : this.f60986d, a12);
        a12.h();
        return interfaceC22204y1M;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return androidx.compose.ui.unit.h.b(this.f60983a, yVar.f60983a) && androidx.compose.ui.unit.h.b(this.f60984b, yVar.f60984b) && L.f(this.f60985c, yVar.f60985c) && L.f(this.f60986d, yVar.f60986d) && L.f(this.f60987e, yVar.f60987e);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f60987e.hashCode() + ((this.f60986d.hashCode() + ((this.f60985c.hashCode() + androidx.appcompat.app.r.d(this.f60984b, Float.hashCode(this.f60983a) * 31, 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChipsStyle(horizontalSpacing=");
        H.u(this.f60983a, ", verticalSpacing=", sb2);
        H.u(this.f60984b, ", selectedStyle=", sb2);
        sb2.append(this.f60985c);
        sb2.append(", unselectedStyle=");
        sb2.append(this.f60986d);
        sb2.append(", notActiveStyle=");
        sb2.append(this.f60987e);
        sb2.append(')');
        return sb2.toString();
    }

    /* compiled from: ChipsStyle.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/akita/compose/component/chips/y$a;", "", "Lcom/akita/compose/component/button/t;", "buttonStyle", "Landroidx/compose/ui/unit/h;", "overlayItemTopPadding", "overlayItemRightPadding", "borderWidth", "Lcom/akita/compose/foundation/c;", "borderColor", "<init>", "(Lcom/akita/compose/component/button/t;FFFLcom/akita/compose/foundation/c;Lkotlin/jvm/internal/w;)V", "chips_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.akita.compose.component.button.t f60988a;

        /* renamed from: b, reason: collision with root package name */
        public final float f60989b;

        /* renamed from: c, reason: collision with root package name */
        public final float f60990c;

        /* renamed from: d, reason: collision with root package name */
        public final float f60991d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final com.akita.compose.foundation.c f60992e;

        public a(com.akita.compose.component.button.t tVar, float f12, float f13, float f14, com.akita.compose.foundation.c cVar, C42822w c42822w) {
            this.f60988a = tVar;
            this.f60989b = f12;
            this.f60990c = f13;
            this.f60991d = f14;
            this.f60992e = cVar;
        }

        @InterfaceC22132o
        @Y61.k
        public final InterfaceC22204y1 a(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
            com.akita.compose.foundation.p pVar;
            a12.C(-1016131572);
            if (z12) {
                com.akita.compose.foundation.c cVar = this.f60992e;
                pVar = cVar != null ? cVar.f63575a : null;
            } else {
                com.akita.compose.foundation.p.f63635e.getClass();
                pVar = com.akita.compose.foundation.p.f63636f;
            }
            if (pVar == null) {
                com.akita.compose.foundation.p.f63635e.getClass();
                pVar = com.akita.compose.foundation.p.f63636f;
            }
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(pVar, a12);
            a12.h();
            return interfaceC22204y1M;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f60988a, aVar.f60988a) && androidx.compose.ui.unit.h.b(this.f60989b, aVar.f60989b) && androidx.compose.ui.unit.h.b(this.f60990c, aVar.f60990c) && androidx.compose.ui.unit.h.b(this.f60991d, aVar.f60991d) && L.f(this.f60992e, aVar.f60992e);
        }

        public final int hashCode() {
            int iHashCode = this.f60988a.hashCode() * 31;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            int iD2 = androidx.appcompat.app.r.d(this.f60991d, androidx.appcompat.app.r.d(this.f60990c, androidx.appcompat.app.r.d(this.f60989b, iHashCode, 31), 31), 31);
            com.akita.compose.foundation.c cVar = this.f60992e;
            return iD2 + (cVar == null ? 0 : cVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipsItemStyle(buttonStyle=");
            sb2.append(this.f60988a);
            sb2.append(", overlayItemTopPadding=");
            H.u(this.f60989b, ", overlayItemRightPadding=", sb2);
            H.u(this.f60990c, ", borderWidth=", sb2);
            H.u(this.f60991d, ", borderColor=", sb2);
            sb2.append(this.f60992e);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(com.akita.compose.component.button.t tVar, float f12, float f13, float f14, com.akita.compose.foundation.c cVar, int i12, C42822w c42822w) {
            if ((i12 & 8) != 0) {
                f14 = 0;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
            }
            this(tVar, f12, f13, f14, (i12 & 16) != 0 ? null : cVar, null);
        }
    }
}
