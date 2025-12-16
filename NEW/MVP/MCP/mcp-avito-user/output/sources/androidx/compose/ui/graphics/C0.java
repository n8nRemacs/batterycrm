package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/C0;", "Landroidx/compose/ui/graphics/Z0;", "renderEffect", "Ll0/g;", "offset", "<init>", "(Landroidx/compose/ui/graphics/Z0;JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0 extends Z0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Z0 f39219b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39220c;

    public C0(Z0 z02, long j12, C42822w c42822w) {
        super(null);
        this.f39219b = z02;
        this.f39220c = j12;
    }

    @Override // androidx.compose.ui.graphics.Z0
    @Y61.k
    @j.X
    public final RenderEffect b() {
        b1.f39350a.getClass();
        Z0 z02 = this.f39219b;
        long j12 = this.f39220c;
        return z02 == null ? RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L))) : RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), z02.a());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return kotlin.jvm.internal.L.f(this.f39219b, c02.f39219b) && l0.g.d(this.f39220c, c02.f39220c);
    }

    public final int hashCode() {
        Z0 z02 = this.f39219b;
        int iHashCode = z02 != null ? z02.hashCode() : 0;
        g.a aVar = l0.g.f413384b;
        return Long.hashCode(this.f39220c) + (iHashCode * 31);
    }

    @Y61.k
    public final String toString() {
        return "OffsetEffect(renderEffect=" + this.f39219b + ", offset=" + ((Object) l0.g.l(this.f39220c)) + ')';
    }
}
