package androidx.compose.material;

import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Chip.kt */
@androidx.compose.runtime.H0
@InterfaceC21154e4
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/O2;", "Landroidx/compose/material/d8;", "Landroidx/compose/ui/graphics/T;", "backgroundColor", "contentColor", "leadingIconColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O2 implements InterfaceC21145d8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32997b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32998c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32999d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33000e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33001f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33002g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33003h;

    /* renamed from: i, reason: collision with root package name */
    public final long f33004i;

    public O2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, C42822w c42822w) {
        this.f32996a = j12;
        this.f32997b = j13;
        this.f32998c = j14;
        this.f32999d = j15;
        this.f33000e = j16;
        this.f33001f = j17;
        this.f33002g = j18;
        this.f33003h = j19;
        this.f33004i = j22;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O2.class != obj.getClass()) {
            return false;
        }
        O2 o22 = (O2) obj;
        return androidx.compose.ui.graphics.T.d(this.f32996a, o22.f32996a) && androidx.compose.ui.graphics.T.d(this.f32997b, o22.f32997b) && androidx.compose.ui.graphics.T.d(this.f32998c, o22.f32998c) && androidx.compose.ui.graphics.T.d(this.f32999d, o22.f32999d) && androidx.compose.ui.graphics.T.d(this.f33000e, o22.f33000e) && androidx.compose.ui.graphics.T.d(this.f33001f, o22.f33001f) && androidx.compose.ui.graphics.T.d(this.f33002g, o22.f33002g) && androidx.compose.ui.graphics.T.d(this.f33003h, o22.f33003h) && androidx.compose.ui.graphics.T.d(this.f33004i, o22.f33004i);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f33004i) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f32996a) * 31, 31, this.f32997b), 31, this.f32998c), 31, this.f32999d), 31, this.f33000e), 31, this.f33001f), 31, this.f33002g), 31, this.f33003h);
    }
}
