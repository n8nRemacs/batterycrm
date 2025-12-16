package com.akita.compose.component.close_button;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CloseButtonStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/akita/compose/component/close_button/c;", "", "Landroidx/compose/ui/unit/h;", "size", "Lcom/akita/compose/foundation/p;", "tint", "", "iconRes", "<init>", "(FLcom/akita/compose/foundation/p;ILkotlin/jvm/internal/w;)V", "close-button_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f61034a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f61035b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61036c;

    public c(float f12, p pVar, @InterfaceC42165v int i12, C42822w c42822w) {
        this.f61034a = f12;
        this.f61035b = pVar;
        this.f61036c = i12;
    }

    public static c a(c cVar, float f12) {
        p pVar = cVar.f61035b;
        int i12 = cVar.f61036c;
        cVar.getClass();
        return new c(f12, pVar, i12, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.b(this.f61034a, cVar.f61034a) && L.f(this.f61035b, cVar.f61035b) && this.f61036c == cVar.f61036c;
    }

    public final int hashCode() {
        h.a aVar = h.f42849c;
        return Integer.hashCode(this.f61036c) + s.b(this.f61035b, Float.hashCode(this.f61034a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloseButtonStyle(size=");
        H.u(this.f61034a, ", tint=", sb2);
        sb2.append(this.f61035b);
        sb2.append(", iconRes=");
        return r.t(sb2, this.f61036c, ')');
    }
}
