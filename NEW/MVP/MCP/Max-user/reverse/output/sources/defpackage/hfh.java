package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class hfh {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {gzc.accessibility_custom_action_0, gzc.accessibility_custom_action_1, gzc.accessibility_custom_action_2, gzc.accessibility_custom_action_3, gzc.accessibility_custom_action_4, gzc.accessibility_custom_action_5, gzc.accessibility_custom_action_6, gzc.accessibility_custom_action_7, gzc.accessibility_custom_action_8, gzc.accessibility_custom_action_9, gzc.accessibility_custom_action_10, gzc.accessibility_custom_action_11, gzc.accessibility_custom_action_12, gzc.accessibility_custom_action_13, gzc.accessibility_custom_action_14, gzc.accessibility_custom_action_15, gzc.accessibility_custom_action_16, gzc.accessibility_custom_action_17, gzc.accessibility_custom_action_18, gzc.accessibility_custom_action_19, gzc.accessibility_custom_action_20, gzc.accessibility_custom_action_21, gzc.accessibility_custom_action_22, gzc.accessibility_custom_action_23, gzc.accessibility_custom_action_24, gzc.accessibility_custom_action_25, gzc.accessibility_custom_action_26, gzc.accessibility_custom_action_27, gzc.accessibility_custom_action_28, gzc.accessibility_custom_action_29, gzc.accessibility_custom_action_30, gzc.accessibility_custom_action_31};
    public static final qeh e = new qeh();
    public static final seh f = new seh();

    public static dhh a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        dhh dhhVar = (dhh) a.get(view);
        if (dhhVar != null) {
            return dhhVar;
        }
        dhh dhhVar2 = new dhh(view);
        a.put(view, dhhVar2);
        return dhhVar2;
    }

    public static g4i b(View view, g4i g4iVar) {
        WindowInsets windowInsetsG = g4iVar.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = teh.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return g4i.h(view, windowInsetsA);
            }
        }
        return g4iVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = gfh.d;
        gfh gfhVar = (gfh) view.getTag(gzc.tag_unhandled_key_event_manager);
        if (gfhVar == null) {
            gfhVar = new gfh();
            gfhVar.a = null;
            gfhVar.b = null;
            gfhVar.c = null;
            view.setTag(gzc.tag_unhandled_key_event_manager, gfhVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = gfhVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = gfh.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (gfhVar.a == null) {
                            gfhVar.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = gfh.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                gfhVar.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    gfhVar.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = gfhVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (gfhVar.b == null) {
                    gfhVar.b = new SparseArray();
                }
                gfhVar.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return bfh.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        int i = gzc.tag_accessibility_pane_title;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = afh.b(view);
        } else {
            tag = view.getTag(i);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(gzc.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(gzc.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? dfh.a(view) : (String[]) view.getTag(gzc.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static g4i i(View view, g4i g4iVar) {
        WindowInsets windowInsetsG = g4iVar.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = teh.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return g4i.h(view, windowInsetsB);
            }
        }
        return g4iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f34 j(View view, f34 f34Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + f34Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return dfh.b(view, f34Var);
        }
        tva tvaVar = (tva) view.getTag(gzc.tag_on_receive_content_listener);
        uva uvaVar = e;
        if (tvaVar == null) {
            if (view instanceof uva) {
                uvaVar = (uva) view;
            }
            return uvaVar.b(f34Var);
        }
        f34 f34VarA = tvaVar.a(view, f34Var);
        if (f34VarA == null) {
            return null;
        }
        if (view instanceof uva) {
            uvaVar = (uva) view;
        }
        return uvaVar.b(f34VarA);
    }

    public static void k(View view, int i) {
        ArrayList arrayListF = f(view);
        for (int i2 = 0; i2 < arrayListF.size(); i2++) {
            if (((g5) arrayListF.get(i2)).a() == i) {
                arrayListF.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, g5 g5Var, v5 v5Var) {
        g5 g5Var2 = new g5(null, g5Var.b, null, v5Var, g5Var.c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        z4 z4Var = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof y4 ? ((y4) accessibilityDelegateD).a : new z4(accessibilityDelegateD);
        if (z4Var == null) {
            z4Var = new z4();
        }
        n(view, z4Var);
        k(view, g5Var2.a());
        f(view).add(g5Var2);
        h(view, 0);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            bfh.d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void n(View view, z4 z4Var) {
        if (z4Var == null && (d(view) instanceof y4)) {
            z4Var = new z4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(z4Var == null ? null : z4Var.b);
    }

    public static void o(View view, CharSequence charSequence) {
        new reh(gzc.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        seh sehVar = f;
        if (charSequence == null) {
            sehVar.a.remove(view);
            view.removeOnAttachStateChangeListener(sehVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(sehVar);
        } else {
            sehVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(sehVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(sehVar);
            }
        }
    }

    public static void p(View view, wa2 wa2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(wa2Var != null ? new p3i(wa2Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = o3i.e;
        Object tag = view.getTag(gzc.tag_on_apply_window_listener);
        if (wa2Var == null) {
            view.setTag(gzc.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener n3iVar = new n3i(view, wa2Var);
        view.setTag(gzc.tag_window_insets_animation_callback, n3iVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(n3iVar);
        }
    }
}
