package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Nl extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManagerAccessibilityStateChangeListenerC21722m9 f35214l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f35215m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nl(AccessibilityManagerAccessibilityStateChangeListenerC21722m9 accessibilityManagerAccessibilityStateChangeListenerC21722m9, AccessibilityManager accessibilityManager) {
        super(0);
        this.f35214l = accessibilityManagerAccessibilityStateChangeListenerC21722m9;
        this.f35215m = accessibilityManager;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        AccessibilityManagerAccessibilityStateChangeListenerC21722m9 accessibilityManagerAccessibilityStateChangeListenerC21722m9 = this.f35214l;
        accessibilityManagerAccessibilityStateChangeListenerC21722m9.getClass();
        AccessibilityManager accessibilityManager = this.f35215m;
        accessibilityManager.removeTouchExplorationStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC21722m9);
        accessibilityManager.removeAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC21722m9);
        return kotlin.G0.f406611a;
    }
}
