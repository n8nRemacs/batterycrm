package com.akita.compose.component.circular_counter;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CircularCounterStyle.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/akita/compose/component/circular_counter/d;", "", "Lcom/akita/compose/foundation/p;", "backgroundThemeColor", "progressRailColor", "Landroidx/compose/ui/unit/h;", "progressWidth", "diameter", "contentIconSize", "Lcom/akita/compose/foundation/r;", "contentAppearance", "<init>", "(Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;FFFLcom/akita/compose/foundation/r;Lkotlin/jvm/internal/w;)V", "circular-counter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f61020a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f61021b;

    /* renamed from: c, reason: collision with root package name */
    public final float f61022c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61023d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61024e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final r f61025f;

    public d(p pVar, p pVar2, float f12, float f13, float f14, r rVar, C42822w c42822w) {
        this.f61020a = pVar;
        this.f61021b = pVar2;
        this.f61022c = f12;
        this.f61023d = f13;
        this.f61024e = f14;
        this.f61025f = rVar;
    }

    public static d a(d dVar, p pVar) {
        p pVar2 = dVar.f61021b;
        float f12 = dVar.f61022c;
        float f13 = dVar.f61023d;
        float f14 = dVar.f61024e;
        r rVar = dVar.f61025f;
        dVar.getClass();
        return new d(pVar, pVar2, f12, f13, f14, rVar, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f61020a, dVar.f61020a) && L.f(this.f61021b, dVar.f61021b) && h.b(this.f61022c, dVar.f61022c) && h.b(this.f61023d, dVar.f61023d) && h.b(this.f61024e, dVar.f61024e) && L.f(this.f61025f, dVar.f61025f);
    }

    public final int hashCode() {
        int iB2 = s.b(this.f61021b, this.f61020a.hashCode() * 31, 31);
        h.a aVar = h.f42849c;
        return this.f61025f.hashCode() + androidx.appcompat.app.r.d(this.f61024e, androidx.appcompat.app.r.d(this.f61023d, androidx.appcompat.app.r.d(this.f61022c, iB2, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CircularCounterStyle(backgroundThemeColor=");
        sb2.append(this.f61020a);
        sb2.append(", progressRailColor=");
        sb2.append(this.f61021b);
        sb2.append(", progressWidth=");
        H.u(this.f61022c, ", diameter=", sb2);
        H.u(this.f61023d, ", contentIconSize=", sb2);
        H.u(this.f61024e, ", contentAppearance=", sb2);
        sb2.append(this.f61025f);
        sb2.append(')');
        return sb2.toString();
    }
}
