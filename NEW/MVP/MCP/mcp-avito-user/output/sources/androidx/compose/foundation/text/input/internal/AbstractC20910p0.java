package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.Metadata;

/* compiled from: LegacyPlatformTextInputServiceAdapter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/p0;", "Landroidx/compose/ui/text/input/P;", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20910p0 implements androidx.compose.ui.text.input.P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public C20902l0 f31199a;

    /* compiled from: LegacyPlatformTextInputServiceAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/p0$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.p0$a */
    public interface a {
    }

    @Override // androidx.compose.ui.text.input.P
    public final void e() {
        InterfaceC22489j2 interfaceC22489j2K2;
        C20902l0 c20902l0 = this.f31199a;
        if (c20902l0 == null || (interfaceC22489j2K2 = c20902l0.k2()) == null) {
            return;
        }
        interfaceC22489j2K2.hide();
    }

    @Override // androidx.compose.ui.text.input.P
    public final void h() {
        InterfaceC22489j2 interfaceC22489j2K2;
        C20902l0 c20902l0 = this.f31199a;
        if (c20902l0 == null || (interfaceC22489j2K2 = c20902l0.k2()) == null) {
            return;
        }
        interfaceC22489j2K2.show();
    }

    public abstract void i();

    public final void j(@Y61.k C20902l0 c20902l0) {
        if (this.f31199a != c20902l0) {
            androidx.compose.foundation.internal.e.c("Expected textInputModifierNode to be " + c20902l0 + " but was " + this.f31199a);
        }
        this.f31199a = null;
    }
}
