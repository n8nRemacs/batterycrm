package com.akita.compose.component.slider;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SliderStyle.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/akita/compose/component/slider/s;", "", "Landroidx/compose/ui/unit/h;", "trackHeight", "Lcom/akita/compose/foundation/p;", "trackColor", "activeTrackColor", "thumbColor", "thumbSize", "<init>", "(FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FLkotlin/jvm/internal/w;)V", "slider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f62759a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62761c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.foundation.p f62762d;

    /* renamed from: e, reason: collision with root package name */
    public final float f62763e;

    public s(float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.p pVar3, float f13, C42822w c42822w) {
        this.f62759a = f12;
        this.f62760b = pVar;
        this.f62761c = pVar2;
        this.f62762d = pVar3;
        this.f62763e = f13;
    }

    public static s a(s sVar, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.p pVar3, int i12) {
        float f12 = sVar.f62759a;
        if ((i12 & 4) != 0) {
            pVar2 = sVar.f62761c;
        }
        com.akita.compose.foundation.p pVar4 = pVar2;
        if ((i12 & 8) != 0) {
            pVar3 = sVar.f62762d;
        }
        float f13 = sVar.f62763e;
        sVar.getClass();
        return new s(f12, pVar, pVar4, pVar3, f13, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return androidx.compose.ui.unit.h.b(this.f62759a, sVar.f62759a) && L.f(this.f62760b, sVar.f62760b) && L.f(this.f62761c, sVar.f62761c) && L.f(this.f62762d, sVar.f62762d) && androidx.compose.ui.unit.h.b(this.f62763e, sVar.f62763e);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f62763e) + com.akita.compose.component.accordion.s.b(this.f62762d, com.akita.compose.component.accordion.s.b(this.f62761c, com.akita.compose.component.accordion.s.b(this.f62760b, Float.hashCode(this.f62759a) * 31, 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderStyle(trackHeight=");
        H.u(this.f62759a, ", trackColor=", sb2);
        sb2.append(this.f62760b);
        sb2.append(", activeTrackColor=");
        sb2.append(this.f62761c);
        sb2.append(", thumbColor=");
        sb2.append(this.f62762d);
        sb2.append(", thumbSize=");
        return H.h(')', this.f62763e, sb2);
    }
}
