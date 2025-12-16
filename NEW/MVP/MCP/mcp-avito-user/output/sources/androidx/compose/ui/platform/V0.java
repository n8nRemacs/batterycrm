package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: SoftwareKeyboardController.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/V0;", "Landroidx/compose/ui/platform/j2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 implements InterfaceC22489j2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.Y f41289a;

    public V0(@Y61.k androidx.compose.ui.text.input.Y y12) {
        this.f41289a = y12;
    }

    @Override // androidx.compose.ui.platform.InterfaceC22489j2
    public final void hide() {
        this.f41289a.f42388a.e();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22489j2
    public final void show() {
        androidx.compose.ui.text.input.Y y12 = this.f41289a;
        if (y12.f42389b.get() != null) {
            y12.f42388a.h();
        }
    }
}
