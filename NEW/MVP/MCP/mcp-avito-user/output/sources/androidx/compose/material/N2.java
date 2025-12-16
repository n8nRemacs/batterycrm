package androidx.compose.material;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RadioButton.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/N2;", "Landroidx/compose/material/r7;", "Landroidx/compose/ui/graphics/T;", "selectedColor", "unselectedColor", "disabledColor", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N2 implements InterfaceC21325r7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32966a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32967b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32968c;

    public N2(long j12, long j13, long j14, C42822w c42822w) {
        this.f32966a = j12;
        this.f32967b = j13;
        this.f32968c = j14;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N2.class != obj.getClass()) {
            return false;
        }
        N2 n22 = (N2) obj;
        return androidx.compose.ui.graphics.T.d(this.f32966a, n22.f32966a) && androidx.compose.ui.graphics.T.d(this.f32967b, n22.f32967b) && androidx.compose.ui.graphics.T.d(this.f32968c, n22.f32968c);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f32968c) + androidx.appcompat.app.r.g(Long.hashCode(this.f32966a) * 31, 31, this.f32967b);
    }
}
