package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.C22711a;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: EdgeEffectCompat.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/i1;", "Landroid/widget/EdgeEffect;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20530i1 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f28131a;

    /* renamed from: b, reason: collision with root package name */
    public float f28132b;

    public C20530i1(@Y61.k Context context) {
        super(context);
        androidx.compose.ui.unit.d dVarA = C22711a.a(context);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        this.f28131a = dVarA.getF42846b() * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i12) {
        this.f28132b = 0.0f;
        super.onAbsorb(i12);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f12, float f13) {
        this.f28132b = 0.0f;
        super.onPull(f12, f13);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f28132b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f12) {
        this.f28132b = 0.0f;
        super.onPull(f12);
    }
}
