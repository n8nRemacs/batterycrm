package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.f;
import androidx.core.view.accessibility.i;
import com.avito.android.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22808a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f44990c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f44991a;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f44992b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    public static final class C1751a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C22808a f44993a;

        public C1751a(C22808a c22808a) {
            this.f44993a = c22808a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f44993a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.g gVarB = this.f44993a.b(view);
            if (gVarB != null) {
                return gVarB.f45023a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f44993a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.f fVar = new androidx.core.view.accessibility.f(accessibilityNodeInfo);
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            Boolean boolC = new C22815d0(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).c(view);
            fVar.s(boolC != null && boolC.booleanValue());
            Boolean boolC2 = new C22821g0(R.id.tag_accessibility_heading, Boolean.class, 0, 28).c(view);
            fVar.q(boolC2 != null && boolC2.booleanValue());
            CharSequence charSequenceH = C22823h0.h(view);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceH);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceH);
            }
            fVar.u(new C22819f0(R.id.tag_state_description, CharSequence.class, 64, 30).c(view));
            this.f44993a.d(view, fVar);
            accessibilityNodeInfo.getText();
            List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i12 = 0; i12 < listEmptyList.size(); i12++) {
                fVar.b((f.a) listEmptyList.get(i12));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f44993a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f44993a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i12, Bundle bundle) {
            return this.f44993a.g(view, i12, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i12) {
            this.f44993a.h(view, i12);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f44993a.i(view, accessibilityEvent);
        }
    }

    public C22808a() {
        this(f44990c);
    }

    public boolean a(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
        return this.f44991a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @j.P
    public androidx.core.view.accessibility.g b(@j.N View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f44991a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new androidx.core.view.accessibility.g(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
        this.f44991a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(@j.N View view, @j.N androidx.core.view.accessibility.f fVar) {
        this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
    }

    public void e(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
        this.f44991a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(@j.N ViewGroup viewGroup, @j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
        return this.f44991a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(@j.N View view, int i12, @j.P Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z12 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= listEmptyList.size()) {
                break;
            }
            f.a aVar = (f.a) listEmptyList.get(i13);
            if (aVar.a() == i12) {
                androidx.core.view.accessibility.i iVar = aVar.f45020d;
                if (iVar != null) {
                    Class<? extends i.a> cls = aVar.f45019c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = iVar.c(view);
                }
            } else {
                i13++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f44991a.performAccessibilityAction(view, i12, bundle);
        }
        if (zPerformAccessibilityAction || i12 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i14 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i14)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i15 = 0;
            while (true) {
                if (clickableSpanArr == null || i15 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i15])) {
                    clickableSpan.onClick(view);
                    z12 = true;
                    break;
                }
                i15++;
            }
        }
        return z12;
    }

    public void h(@j.N View view, int i12) {
        this.f44991a.sendAccessibilityEvent(view, i12);
    }

    public void i(@j.N View view, @j.N AccessibilityEvent accessibilityEvent) {
        this.f44991a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @RestrictTo
    public C22808a(@j.N View.AccessibilityDelegate accessibilityDelegate) {
        this.f44991a = accessibilityDelegate;
        this.f44992b = new C1751a(this);
    }
}
