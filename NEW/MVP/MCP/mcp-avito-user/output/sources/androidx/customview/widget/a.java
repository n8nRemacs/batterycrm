package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.q1;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import androidx.core.view.accessibility.g;
import androidx.customview.widget.b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends C22808a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f45356n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, BeduinInputModel.MIN_TEXT_VERSION, BeduinInputModel.MIN_TEXT_VERSION);

    /* renamed from: o, reason: collision with root package name */
    public static final b.a<f> f45357o = new C1771a();

    /* renamed from: p, reason: collision with root package name */
    public static final b.InterfaceC1772b<q1<f>, f> f45358p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f45363h;

    /* renamed from: i, reason: collision with root package name */
    public final View f45364i;

    /* renamed from: j, reason: collision with root package name */
    public c f45365j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f45359d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f45360e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f45361f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f45362g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f45366k = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: l, reason: collision with root package name */
    public int f45367l = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: m, reason: collision with root package name */
    public int f45368m = BeduinInputModel.MIN_TEXT_VERSION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    public class C1771a implements b.a<f> {
        public final void a(Object obj, Rect rect) {
            ((f) obj).f(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class b implements b.InterfaceC1772b<q1<f>, f> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class c extends g {
        public c() {
        }

        @Override // androidx.core.view.accessibility.g
        public final f b(int i12) {
            return new f(AccessibilityNodeInfo.obtain(a.this.r(i12).f44999a));
        }

        @Override // androidx.core.view.accessibility.g
        public final f c(int i12) {
            a aVar = a.this;
            int i13 = i12 == 2 ? aVar.f45366k : aVar.f45367l;
            if (i13 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i13);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
        @Override // androidx.core.view.accessibility.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(int r8, int r9, android.os.Bundle r10) {
            /*
                r7 = this;
                androidx.customview.widget.a r0 = androidx.customview.widget.a.this
                android.view.View r1 = r0.f45364i
                r2 = -1
                if (r8 == r2) goto L64
                r2 = 1
                if (r9 == r2) goto L5f
                r3 = 2
                if (r9 == r3) goto L5a
                r3 = 64
                r4 = 0
                r5 = 65536(0x10000, float:9.1835E-41)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r9 == r3) goto L2f
                r3 = 128(0x80, float:1.8E-43)
                if (r9 == r3) goto L1f
                boolean r8 = r0.s(r8, r9, r10)
                goto L6a
            L1f:
                int r9 = r0.f45366k
                if (r9 != r8) goto L2c
                r0.f45366k = r6
                r1.invalidate()
                r0.x(r8, r5)
                goto L2d
            L2c:
                r2 = r4
            L2d:
                r8 = r2
                goto L6a
            L2f:
                android.view.accessibility.AccessibilityManager r9 = r0.f45363h
                boolean r10 = r9.isEnabled()
                if (r10 == 0) goto L2c
                boolean r9 = r9.isTouchExplorationEnabled()
                if (r9 != 0) goto L3e
                goto L2c
            L3e:
                int r9 = r0.f45366k
                if (r9 == r8) goto L2c
                if (r9 == r6) goto L4e
                r0.f45366k = r6
                android.view.View r10 = r0.f45364i
                r10.invalidate()
                r0.x(r9, r5)
            L4e:
                r0.f45366k = r8
                r1.invalidate()
                r9 = 32768(0x8000, float:4.5918E-41)
                r0.x(r8, r9)
                goto L2d
            L5a:
                boolean r8 = r0.j(r8)
                goto L6a
            L5f:
                boolean r8 = r0.w(r8)
                goto L6a
            L64:
                java.util.WeakHashMap<android.view.View, androidx.core.view.A0> r8 = androidx.core.view.C22823h0.f45055a
                boolean r8 = r1.performAccessibilityAction(r9, r10)
            L6a:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.a.c.d(int, int, android.os.Bundle):boolean");
        }
    }

    public a(@N View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f45364i = view;
        this.f45363h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.C22808a
    public final g b(View view) {
        if (this.f45365j == null) {
            this.f45365j = new c();
        }
        return this.f45365j;
    }

    @Override // androidx.core.view.C22808a
    public final void d(View view, f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
        t(fVar);
    }

    public final boolean j(int i12) {
        if (this.f45367l != i12) {
            return false;
        }
        this.f45367l = BeduinInputModel.MIN_TEXT_VERSION;
        v(i12, false);
        x(i12, 8);
        return true;
    }

    public final AccessibilityEvent k(int i12, int i13) {
        View view = this.f45364i;
        if (i12 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i13);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i13);
        f fVarR = r(i12);
        accessibilityEventObtain2.getText().add(fVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = fVarR.f44999a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i12);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    @N
    public final f l(int i12) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        fVar.k("android.view.View");
        Rect rect = f45356n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        fVar.j(rect);
        fVar.f45000b = -1;
        View view = this.f45364i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i12, fVar);
        if (fVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f45360e;
        fVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        fVar.f45001c = i12;
        accessibilityNodeInfoObtain.setSource(view, i12);
        if (this.f45366k == i12) {
            fVar.i(true);
            fVar.a(128);
        } else {
            fVar.i(false);
            fVar.a(64);
        }
        boolean z12 = this.f45367l == i12;
        if (z12) {
            fVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            fVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z12);
        int[] iArr = this.f45362g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f45359d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            fVar.f(rect3);
            if (fVar.f45000b != -1) {
                f fVar2 = new f(AccessibilityNodeInfo.obtain());
                for (int i13 = fVar.f45000b; i13 != -1; i13 = fVar2.f45000b) {
                    fVar2.f45000b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = fVar2.f44999a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i13, fVar2);
                    fVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f45361f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                fVar.j(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            fVar.f44999a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return fVar;
    }

    public final boolean m(@N MotionEvent motionEvent) {
        int i12;
        AccessibilityManager accessibilityManager = this.f45363h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN2 = n(motionEvent.getX(), motionEvent.getY());
            int i13 = this.f45368m;
            if (i13 != iN2) {
                this.f45368m = iN2;
                x(iN2, 128);
                x(i13, 256);
            }
            return iN2 != Integer.MIN_VALUE;
        }
        if (action != 10 || (i12 = this.f45368m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f45368m = BeduinInputModel.MIN_TEXT_VERSION;
            x(i12, 256);
        }
        return true;
    }

    public abstract int n(float f12, float f13);

    public abstract void o(ArrayList arrayList);

    public final void p(int i12) {
        View view;
        ViewParent parent;
        if (i12 == Integer.MIN_VALUE || !this.f45363h.isEnabled() || (parent = (view = this.f45364i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i12, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r20, @j.P android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.a.q(int, android.graphics.Rect):boolean");
    }

    @N
    public final f r(int i12) {
        if (i12 != -1) {
            return l(i12);
        }
        View view = this.f45364i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        f fVar = new f(accessibilityNodeInfoObtain);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            fVar.f44999a.addChild(view, ((Integer) arrayList.get(i13)).intValue());
        }
        return fVar;
    }

    public abstract boolean s(int i12, int i13, @P Bundle bundle);

    public abstract void u(int i12, @N f fVar);

    public final boolean w(int i12) {
        int i13;
        View view = this.f45364i;
        if ((!view.isFocused() && !view.requestFocus()) || (i13 = this.f45367l) == i12) {
            return false;
        }
        if (i13 != Integer.MIN_VALUE) {
            j(i13);
        }
        if (i12 == Integer.MIN_VALUE) {
            return false;
        }
        this.f45367l = i12;
        v(i12, true);
        x(i12, 8);
        return true;
    }

    public final void x(int i12, int i13) {
        View view;
        ViewParent parent;
        if (i12 == Integer.MIN_VALUE || !this.f45363h.isEnabled() || (parent = (view = this.f45364i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i12, i13));
    }

    public void t(@N f fVar) {
    }

    public void v(int i12, boolean z12) {
    }
}
