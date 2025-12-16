package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Z0;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/x;", "Landroidx/compose/ui/graphics/I;", "Landroidx/compose/ui/graphics/C0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public RenderEffect f39347a;

    public /* synthetic */ Z0(C42822w c42822w) {
        this();
    }

    @Y61.k
    @j.X
    public final RenderEffect a() {
        RenderEffect renderEffect = this.f39347a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f39347a = renderEffectB;
        return renderEffectB;
    }

    @Y61.k
    @j.X
    public abstract RenderEffect b();

    public Z0() {
    }
}
