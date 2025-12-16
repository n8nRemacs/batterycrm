package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/F;", "Landroidx/compose/ui/graphics/U;", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/ui/graphics/E;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/w;)V", "(JILkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F extends U {

    /* renamed from: c, reason: collision with root package name */
    public final long f39255c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39256d;

    /* JADX WARN: Illegal instructions before constructor call */
    public F(long j12, int i12, C42822w c42822w) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            G.f39257a.getClass();
            C22241a.e();
            porterDuffColorFilter = C22241a.d(V.j(j12), C22243b.a(i12));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(V.j(j12), C22243b.b(i12));
        }
        this(j12, i12, porterDuffColorFilter, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return T.d(this.f39255c, f12.f39255c) && E.a(this.f39256d, f12.f39256d);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = kotlin.w0.f410662c;
        int iHashCode = Long.hashCode(this.f39255c) * 31;
        E.a aVar2 = E.f39229b;
        return Integer.hashCode(this.f39256d) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        androidx.compose.foundation.H.z(this.f39255c, ", blendMode=", sb2);
        sb2.append((Object) E.b(this.f39256d));
        sb2.append(')');
        return sb2.toString();
    }

    public F(long j12, int i12, ColorFilter colorFilter, C42822w c42822w) {
        super(colorFilter);
        this.f39255c = j12;
        this.f39256d = i12;
    }
}
