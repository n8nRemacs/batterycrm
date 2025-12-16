package androidx.compose.ui.focus;

import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FocusChangedModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/d;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22219d extends v.d implements InterfaceC22224i {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super f0, G0> f39160p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public FocusStateImpl f39161q;

    public C22219d() {
        throw null;
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@Y61.k FocusStateImpl focusStateImpl) {
        if (kotlin.jvm.internal.L.f(this.f39161q, focusStateImpl)) {
            return;
        }
        this.f39161q = focusStateImpl;
        this.f39160p.invoke(focusStateImpl);
    }
}
