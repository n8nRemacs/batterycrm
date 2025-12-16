package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "Landroidx/compose/ui/graphics/U;", "Landroidx/compose/ui/graphics/T;", "multiply", "add", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JJLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22320y0 extends U {

    /* renamed from: c, reason: collision with root package name */
    public final long f40035c;

    /* renamed from: d, reason: collision with root package name */
    public final long f40036d;

    public C22320y0(long j12, long j13, C42822w c42822w) {
        this(j12, j13, new LightingColorFilter(V.j(j12), V.j(j13)), null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22320y0)) {
            return false;
        }
        C22320y0 c22320y0 = (C22320y0) obj;
        return T.d(this.f40035c, c22320y0.f40035c) && T.d(this.f40036d, c22320y0.f40036d);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f40036d) + (Long.hashCode(this.f40035c) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LightingColorFilter(multiply=");
        androidx.compose.foundation.H.z(this.f40035c, ", add=", sb2);
        sb2.append((Object) T.j(this.f40036d));
        sb2.append(')');
        return sb2.toString();
    }

    public C22320y0(long j12, long j13, ColorFilter colorFilter, C42822w c42822w) {
        super(colorFilter);
        this.f40035c = j12;
        this.f40036d = j13;
    }
}
