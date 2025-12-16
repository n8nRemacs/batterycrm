package androidx.compose.material;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@InterfaceC21154e4
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/G2;", "Landroidx/compose/material/d2;", "Landroidx/compose/ui/graphics/T;", "backgroundColor", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class G2 implements InterfaceC21139d2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32653a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32654b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32655c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32656d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32657e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32658f;

    public G2(long j12, long j13, long j14, long j15, long j16, long j17, C42822w c42822w) {
        this.f32653a = j12;
        this.f32654b = j13;
        this.f32655c = j14;
        this.f32656d = j15;
        this.f32657e = j16;
        this.f32658f = j17;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G2.class != obj.getClass()) {
            return false;
        }
        G2 g22 = (G2) obj;
        return androidx.compose.ui.graphics.T.d(this.f32653a, g22.f32653a) && androidx.compose.ui.graphics.T.d(this.f32654b, g22.f32654b) && androidx.compose.ui.graphics.T.d(this.f32655c, g22.f32655c) && androidx.compose.ui.graphics.T.d(this.f32656d, g22.f32656d) && androidx.compose.ui.graphics.T.d(this.f32657e, g22.f32657e) && androidx.compose.ui.graphics.T.d(this.f32658f, g22.f32658f);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f32658f) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f32653a) * 31, 31, this.f32654b), 31, this.f32655c), 31, this.f32656d), 31, this.f32657e);
    }
}
