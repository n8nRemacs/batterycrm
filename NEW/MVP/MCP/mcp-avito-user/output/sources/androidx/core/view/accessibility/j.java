package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.os.q;
import j.N;
import j.X;

/* compiled from: AccessibilityWindowInfoCompat.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityWindowInfo f45025a;

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class a {
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class b {
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class c {
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class d {
        public static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class e {
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @X
    public static class f {
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public j() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f45025a = d.a();
        } else {
            this.f45025a = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        AccessibilityWindowInfo accessibilityWindowInfo = ((j) obj).f45025a;
        AccessibilityWindowInfo accessibilityWindowInfo2 = this.f45025a;
        return accessibilityWindowInfo2 == null ? accessibilityWindowInfo == null : accessibilityWindowInfo2.equals(accessibilityWindowInfo);
    }

    public final int hashCode() {
        AccessibilityWindowInfo accessibilityWindowInfo = this.f45025a;
        if (accessibilityWindowInfo == null) {
            return 0;
        }
        return accessibilityWindowInfo.hashCode();
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        AccessibilityWindowInfo accessibilityWindowInfo = this.f45025a;
        accessibilityWindowInfo.getBoundsInScreen(rect);
        sb2.append(accessibilityWindowInfo.getId());
        sb2.append(", type=");
        int type = accessibilityWindowInfo.getType();
        sb2.append(type != 1 ? type != 2 ? type != 3 ? type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb2.append(", layer=");
        sb2.append(accessibilityWindowInfo.getLayer());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(accessibilityWindowInfo.isFocused());
        sb2.append(", active=");
        sb2.append(accessibilityWindowInfo.isActive());
        sb2.append(", hasParent=");
        AccessibilityWindowInfo parent = accessibilityWindowInfo.getParent();
        sb2.append((parent != null ? new j(parent) : null) != null);
        sb2.append(", hasChildren=");
        sb2.append(accessibilityWindowInfo.getChildCount() > 0);
        sb2.append(", transitionTime=");
        int i12 = Build.VERSION.SDK_INT;
        sb2.append(i12 >= 34 ? f.b(accessibilityWindowInfo) : 0L);
        sb2.append(", locales=");
        sb2.append(i12 >= 34 ? q.g(f.a(accessibilityWindowInfo)) : q.f44804b);
        sb2.append(']');
        return sb2.toString();
    }

    public j(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.f45025a = accessibilityWindowInfo;
    }
}
