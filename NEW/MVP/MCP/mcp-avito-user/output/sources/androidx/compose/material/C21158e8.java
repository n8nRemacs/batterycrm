package androidx.compose.material;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Shapes.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/e8;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21158e8 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f33550a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f33551b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.shape.e f33552c;

    public C21158e8() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21158e8)) {
            return false;
        }
        C21158e8 c21158e8 = (C21158e8) obj;
        return kotlin.jvm.internal.L.f(this.f33550a, c21158e8.f33550a) && kotlin.jvm.internal.L.f(this.f33551b, c21158e8.f33551b) && kotlin.jvm.internal.L.f(this.f33552c, c21158e8.f33552c);
    }

    public final int hashCode() {
        return this.f33552c.hashCode() + ((this.f33551b.hashCode() + (this.f33550a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Shapes(small=" + this.f33550a + ", medium=" + this.f33551b + ", large=" + this.f33552c + ')';
    }

    public C21158e8(androidx.compose.foundation.shape.e eVar, androidx.compose.foundation.shape.e eVar2, androidx.compose.foundation.shape.e eVar3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            eVar = androidx.compose.foundation.shape.o.a(4);
        }
        if ((i12 & 2) != 0) {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            eVar2 = androidx.compose.foundation.shape.o.a(4);
        }
        if ((i12 & 4) != 0) {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            eVar3 = androidx.compose.foundation.shape.o.a(0);
        }
        this.f33550a = eVar;
        this.f33551b = eVar2;
        this.f33552c = eVar3;
    }
}
