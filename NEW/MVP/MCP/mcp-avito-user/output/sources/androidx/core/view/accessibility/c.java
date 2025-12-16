package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import j.N;
import j.W;
import j.X;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public interface a {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public static abstract class b implements a {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC1753c implements AccessibilityManager.AccessibilityStateChangeListener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC1753c)) {
                return false;
            }
            ((AccessibilityManagerAccessibilityStateChangeListenerC1753c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z12) {
            throw null;
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    @X
    public static class d {
    }

    /* compiled from: AccessibilityManagerCompat.java */
    public interface e {
        void onTouchExplorationStateChanged(boolean z12);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final e f44998b;

        public f(@N e eVar) {
            this.f44998b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f44998b.equals(((f) obj).f44998b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f44998b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z12) {
            this.f44998b.onTouchExplorationStateChanged(z12);
        }
    }

    @W
    @Deprecated
    public static void a(@N AccessibilityManager accessibilityManager, @N e eVar) {
        accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @W
    @Deprecated
    public static void b(@N AccessibilityManager accessibilityManager, @N e eVar) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
