package com.akita.compose.component.floating_container;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.modifier.f;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingContainerStyle.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/akita/compose/component/floating_container/c;", "", "Landroidx/compose/foundation/layout/T1;", "paddings", "Landroidx/compose/ui/unit/h;", "radius", "Lcom/akita/compose/foundation/p;", "backgroundColor", "Lcom/akita/compose/foundation/modifier/f;", "shadows", "<init>", "(Landroidx/compose/foundation/layout/T1;FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/modifier/f;Lkotlin/jvm/internal/w;)V", "floating-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f61576e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final T1 f61577a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61578b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f61579c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f61580d;

    static {
        f.a aVar = f.f63621c;
    }

    public c(T1 t12, float f12, p pVar, f fVar, C42822w c42822w) {
        this.f61577a = t12;
        this.f61578b = f12;
        this.f61579c = pVar;
        this.f61580d = fVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f61577a, cVar.f61577a) && h.b(this.f61578b, cVar.f61578b) && L.f(this.f61579c, cVar.f61579c) && L.f(this.f61580d, cVar.f61580d);
    }

    public final int hashCode() {
        int iHashCode = this.f61577a.hashCode() * 31;
        h.a aVar = h.f42849c;
        return this.f61580d.hashCode() + s.b(this.f61579c, r.d(this.f61578b, iHashCode, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FloatingContainerStyle(paddings=");
        sb2.append(this.f61577a);
        sb2.append(", radius=");
        H.u(this.f61578b, ", backgroundColor=", sb2);
        sb2.append(this.f61579c);
        sb2.append(", shadows=");
        sb2.append(this.f61580d);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(T1 t12, float f12, p pVar, f fVar, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            f.f63621c.getClass();
            fVar = f.f63622d;
        }
        this(t12, f12, pVar, fVar, null);
    }
}
