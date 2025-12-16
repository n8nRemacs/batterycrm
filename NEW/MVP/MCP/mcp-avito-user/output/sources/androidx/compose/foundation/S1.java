package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: PlatformMagnifier.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/S1;", "Landroidx/compose/foundation/R1;", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class S1 implements R1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final S1 f26841b = new S1();

    /* compiled from: PlatformMagnifier.android.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/S1$a;", "Landroidx/compose/foundation/Q1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    public static class a implements Q1 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Magnifier f26842a;

        public a(@Y61.k Magnifier magnifier) {
            this.f26842a = magnifier;
        }

        @Override // androidx.compose.foundation.Q1
        public final long a() {
            long height = (this.f26842a.getHeight() & 4294967295L) | (this.f26842a.getWidth() << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            return height;
        }

        @Override // androidx.compose.foundation.Q1
        public void b(long j12, long j13, float f12) {
            this.f26842a.show(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }

        @Override // androidx.compose.foundation.Q1
        public final void c() {
            this.f26842a.update();
        }

        @Override // androidx.compose.foundation.Q1
        public final void dismiss() {
            this.f26842a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.R1
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.foundation.R1
    public final Q1 b(View view, boolean z12, long j12, float f12, float f13, boolean z13, androidx.compose.ui.unit.d dVar, float f14) {
        return new a(new Magnifier(view));
    }
}
