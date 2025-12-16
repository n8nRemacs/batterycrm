package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import j.N;
import j.P;
import j.X;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final AccessibilityNodeProvider f45023a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final g f45024a;

        public a(g gVar) {
            this.f45024a = gVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i12) {
            f fVarB = this.f45024a.b(i12);
            if (fVarB == null) {
                return null;
            }
            return fVarB.f44999a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i12) {
            this.f45024a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i12) {
            f fVarC = this.f45024a.c(i12);
            if (fVarC == null) {
                return null;
            }
            return fVarC.f44999a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i12, int i13, Bundle bundle) {
            return this.f45024a.d(i12, i13, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    @X
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i12, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f45024a.a(i12, new f(accessibilityNodeInfo), str, bundle);
        }
    }

    public g() {
        this.f45023a = new b(this);
    }

    @P
    public f b(int i12) {
        return null;
    }

    @P
    public f c(int i12) {
        return null;
    }

    public boolean d(int i12, int i13, @P Bundle bundle) {
        return false;
    }

    public g(@P AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f45023a = accessibilityNodeProvider;
    }

    public void a(int i12, @N f fVar, @N String str, @P Bundle bundle) {
    }
}
