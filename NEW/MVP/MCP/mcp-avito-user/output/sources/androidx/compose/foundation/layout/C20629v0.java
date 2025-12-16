package androidx.compose.foundation.layout;

import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/v0;", "Landroidx/compose/ui/node/M0;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20629v0 extends v.d implements androidx.compose.ui.node.M0 {

    /* renamed from: p, reason: collision with root package name */
    public float f28754p;

    @Override // androidx.compose.ui.node.M0
    public final Object r(androidx.compose.ui.unit.d dVar, Object obj) {
        C20558d2 c20558d2 = obj instanceof C20558d2 ? (C20558d2) obj : null;
        if (c20558d2 == null) {
            c20558d2 = new C20558d2(0.0f, false, null, null, 15, null);
        }
        L0 l02 = c20558d2.f28597d;
        if (l02 == null) {
            float f12 = this.f28754p;
            l02 = new L0();
            l02.f28366a = f12;
        }
        c20558d2.f28597d = l02;
        l02.f28366a = this.f28754p;
        return c20558d2;
    }
}
