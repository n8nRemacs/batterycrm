package androidx.compose.material;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Button.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material/B2;", "Landroidx/compose/material/M1;", "Landroidx/compose/ui/graphics/T;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class B2 implements M1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32376a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32377b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32378c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32379d;

    public B2(long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f32376a = j12;
        this.f32377b = j13;
        this.f32378c = j14;
        this.f32379d = j15;
    }

    @Override // androidx.compose.material.M1
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-2133647540);
        return androidx.compose.foundation.H.g(z12 ? this.f32377b : this.f32379d, a12);
    }

    @Override // androidx.compose.material.M1
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 b(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(-655254499);
        return androidx.compose.foundation.H.g(z12 ? this.f32376a : this.f32378c, a12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B2.class != obj.getClass()) {
            return false;
        }
        B2 b22 = (B2) obj;
        return androidx.compose.ui.graphics.T.d(this.f32376a, b22.f32376a) && androidx.compose.ui.graphics.T.d(this.f32377b, b22.f32377b) && androidx.compose.ui.graphics.T.d(this.f32378c, b22.f32378c) && androidx.compose.ui.graphics.T.d(this.f32379d, b22.f32379d);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f32379d) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f32376a) * 31, 31, this.f32377b), 31, this.f32378c);
    }
}
