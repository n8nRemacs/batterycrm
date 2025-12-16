package com.akita.compose.foundation;

import androidx.compose.foundation.H;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: Ripple.kt */
@F3
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/akita/compose/foundation/o;", "Landroidx/compose/foundation/v1;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/T;", "color", "<init>", "(ZFJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class o implements InterfaceC21084v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f63631a;

    /* renamed from: b, reason: collision with root package name */
    public final float f63632b;

    /* renamed from: c, reason: collision with root package name */
    public final long f63633c;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/T;", "invoke-0d7_KjU", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements InterfaceC22242a0 {
        public a() {
        }

        @Override // androidx.compose.ui.graphics.InterfaceC22242a0
        public final long a() {
            return o.this.f63633c;
        }
    }

    public o(boolean z12, float f12, long j12, C42822w c42822w) {
        this.f63631a = z12;
        this.f63632b = f12;
        this.f63633c = j12;
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    @Y61.k
    public final InterfaceC22419k a(@Y61.k androidx.compose.foundation.interaction.k kVar) {
        return new k(kVar, this.f63631a, this.f63632b, new a(), null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f63631a == oVar.f63631a && androidx.compose.ui.unit.h.b(this.f63632b, oVar.f63632b) && T.d(this.f63633c, oVar.f63633c);
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f63631a) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iD2 = androidx.appcompat.app.r.d(this.f63632b, iHashCode, 31);
        T.a aVar2 = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f63633c) + iD2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleNodeFactory(bounded=");
        sb2.append(this.f63631a);
        sb2.append(", radius=");
        H.u(this.f63632b, ", color=", sb2);
        sb2.append((Object) T.j(this.f63633c));
        sb2.append(')');
        return sb2.toString();
    }
}
