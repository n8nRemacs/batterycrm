package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.input.internal.AbstractC20910p0;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.P1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/l0;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/platform/P1;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/foundation/text/input/internal/p0$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20902l0 extends v.d implements P1, InterfaceC22415i, InterfaceC22442w, AbstractC20910p0.a {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public AbstractC20910p0 f31165p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public C20985q1 f31166q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public C21011f1 f31167r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31168s = C22126m3.g(null);

    public C20902l0(@Y61.k AbstractC20910p0 abstractC20910p0, @Y61.k C20985q1 c20985q1, @Y61.k C21011f1 c21011f1) {
        this.f31165p = abstractC20910p0;
        this.f31166q = c20985q1;
        this.f31167r = c21011f1;
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((C22082i3) this.f31168s).setValue(abstractC22443w0);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        AbstractC20910p0 abstractC20910p0 = this.f31165p;
        if (abstractC20910p0.f31199a != null) {
            androidx.compose.foundation.internal.e.c("Expected textInputModifierNode to be null");
        }
        abstractC20910p0.f31199a = this;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f31165p.j(this);
    }

    @Y61.l
    public final InterfaceC22489j2 k2() {
        return (InterfaceC22489j2) C22417j.a(this, androidx.compose.ui.platform.Q0.f41207p);
    }
}
