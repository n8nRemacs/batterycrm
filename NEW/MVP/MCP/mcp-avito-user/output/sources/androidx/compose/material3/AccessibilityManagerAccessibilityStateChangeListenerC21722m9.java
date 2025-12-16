package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/m9;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/runtime/I3;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class AccessibilityManagerAccessibilityStateChangeListenerC21722m9 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, androidx.compose.runtime.I3<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36830b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36831c;

    public AccessibilityManagerAccessibilityStateChangeListenerC21722m9() {
        Boolean bool = Boolean.FALSE;
        this.f36830b = C22126m3.g(bool);
        this.f36831c = C22126m3.g(bool);
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final Boolean getF42167b() {
        return Boolean.valueOf(((Boolean) ((C22082i3) this.f36830b).getF42167b()).booleanValue() && ((Boolean) ((C22082i3) this.f36831c).getF42167b()).booleanValue());
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z12) {
        ((C22082i3) this.f36830b).setValue(Boolean.valueOf(z12));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z12) {
        ((C22082i3) this.f36831c).setValue(Boolean.valueOf(z12));
    }
}
