package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Shapes.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Ge;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ge {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f34791a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f34792b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f34793c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f34794d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f34795e;

    public Ge() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ge)) {
            return false;
        }
        Ge ge2 = (Ge) obj;
        return kotlin.jvm.internal.L.f(this.f34791a, ge2.f34791a) && kotlin.jvm.internal.L.f(this.f34792b, ge2.f34792b) && kotlin.jvm.internal.L.f(this.f34793c, ge2.f34793c) && kotlin.jvm.internal.L.f(this.f34794d, ge2.f34794d) && kotlin.jvm.internal.L.f(this.f34795e, ge2.f34795e);
    }

    public final int hashCode() {
        return this.f34795e.hashCode() + ((this.f34794d.hashCode() + ((this.f34793c.hashCode() + ((this.f34792b.hashCode() + (this.f34791a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Shapes(extraSmall=" + this.f34791a + ", small=" + this.f34792b + ", medium=" + this.f34793c + ", large=" + this.f34794d + ", extraLarge=" + this.f34795e + ')';
    }

    public Ge(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, androidx.compose.foundation.shape.e eVar4, androidx.compose.foundation.shape.e eVar5, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            Fe.f34735a.getClass();
            eVar = Fe.f34736b;
        }
        if ((i12 & 2) != 0) {
            Fe.f34735a.getClass();
            eVar2 = Fe.f34737c;
        }
        if ((i12 & 4) != 0) {
            Fe.f34735a.getClass();
            eVar3 = Fe.f34738d;
        }
        if ((i12 & 8) != 0) {
            Fe.f34735a.getClass();
            eVar4 = Fe.f34739e;
        }
        if ((i12 & 16) != 0) {
            Fe.f34735a.getClass();
            eVar5 = Fe.f34740f;
        }
        this.f34791a = eVar;
        this.f34792b = eVar2;
        this.f34793c = eVar3;
        this.f34794d = eVar4;
        this.f34795e = eVar5;
    }
}
