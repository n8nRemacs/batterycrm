package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.C22082i3;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/G0;", "invoke", "(Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ml extends kotlin.jvm.internal.N implements Y41.l<Lifecycle.Event, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManagerAccessibilityStateChangeListenerC21722m9 f35156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f35157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(AccessibilityManagerAccessibilityStateChangeListenerC21722m9 accessibilityManagerAccessibilityStateChangeListenerC21722m9, AccessibilityManager accessibilityManager) {
        super(1);
        this.f35156l = accessibilityManagerAccessibilityStateChangeListenerC21722m9;
        this.f35157m = accessibilityManager;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            AccessibilityManagerAccessibilityStateChangeListenerC21722m9 accessibilityManagerAccessibilityStateChangeListenerC21722m9 = this.f35156l;
            accessibilityManagerAccessibilityStateChangeListenerC21722m9.getClass();
            AccessibilityManager accessibilityManager = this.f35157m;
            boolean zIsEnabled = accessibilityManager.isEnabled();
            ((C22082i3) accessibilityManagerAccessibilityStateChangeListenerC21722m9.f36830b).setValue(Boolean.valueOf(zIsEnabled));
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            ((C22082i3) accessibilityManagerAccessibilityStateChangeListenerC21722m9.f36831c).setValue(Boolean.valueOf(zIsTouchExplorationEnabled));
            accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC21722m9);
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC21722m9);
        }
        return kotlin.G0.f406611a;
    }
}
