package androidx.compose.material;

import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Ripple.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material/C7;", "Landroidx/compose/foundation/v1;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/a0;", "colorProducer", "<init>", "(ZFLandroidx/compose/ui/graphics/a0;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/T;", "color", "(ZFJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C7 implements InterfaceC21084v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32491a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32492b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22242a0 f32493c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32494d;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/T;", "invoke-0d7_KjU", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements InterfaceC22242a0 {
        public a() {
        }

        @Override // androidx.compose.ui.graphics.InterfaceC22242a0
        public final long a() {
            return C7.this.f32494d;
        }
    }

    public C7(boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, long j12) {
        this.f32491a = z12;
        this.f32492b = f12;
        this.f32493c = interfaceC22242a0;
        this.f32494d = j12;
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    @Y61.k
    public final InterfaceC22419k a(@Y61.k androidx.compose.foundation.interaction.k kVar) {
        InterfaceC22242a0 aVar = this.f32493c;
        if (aVar == null) {
            aVar = new a();
        }
        return new W2(kVar, this.f32491a, this.f32492b, aVar, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7)) {
            return false;
        }
        C7 c72 = (C7) obj;
        if (this.f32491a == c72.f32491a && androidx.compose.ui.unit.h.b(this.f32492b, c72.f32492b) && kotlin.jvm.internal.L.f(this.f32493c, c72.f32493c)) {
            return androidx.compose.ui.graphics.T.d(this.f32494d, c72.f32494d);
        }
        return false;
    }

    @Override // androidx.compose.foundation.InterfaceC21084v1
    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f32491a) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int iD2 = androidx.appcompat.app.r.d(this.f32492b, iHashCode, 31);
        InterfaceC22242a0 interfaceC22242a0 = this.f32493c;
        int iHashCode2 = interfaceC22242a0 != null ? interfaceC22242a0.hashCode() : 0;
        T.a aVar2 = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f32494d) + ((iD2 + iHashCode2) * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7(boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, C42822w c42822w) {
        this(z12, f12, interfaceC22242a0, androidx.compose.ui.graphics.T.f39330l);
        androidx.compose.ui.graphics.T.f39320b.getClass();
    }

    public C7(boolean z12, float f12, long j12, C42822w c42822w) {
        this(z12, f12, (InterfaceC22242a0) null, j12);
    }
}
