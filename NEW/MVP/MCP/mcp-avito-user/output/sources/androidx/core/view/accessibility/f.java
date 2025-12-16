package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.i;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f44999a;

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo
    public int f45000b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f45001c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f45002e = new a(1, (String) null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f45003f = new a(2, (String) null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f45004g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f45005h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f45006i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f45007j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f45008k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f45009l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f45010m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f45011n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f45012o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f45013p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f45014q;

        /* renamed from: r, reason: collision with root package name */
        public static final a f45015r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f45016s;

        /* renamed from: a, reason: collision with root package name */
        public final Object f45017a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45018b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<? extends i.a> f45019c;

        /* renamed from: d, reason: collision with root package name */
        @RestrictTo
        public final androidx.core.view.accessibility.i f45020d;

        static {
            new a(4, (String) null);
            new a(8, (String) null);
            f45004g = new a(16, (String) null);
            new a(32, (String) null);
            f45005h = new a(64, (String) null);
            f45006i = new a(128, (String) null);
            new a(i.b.class, 256);
            new a(i.b.class, 512);
            new a(i.c.class, 1024);
            new a(i.c.class, 2048);
            f45007j = new a(4096, (String) null);
            f45008k = new a(8192, (String) null);
            new a(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
            new a(32768, (String) null);
            new a(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR, (String) null);
            new a(i.g.class, 131072);
            f45009l = new a(262144, (String) null);
            f45010m = new a(524288, (String) null);
            f45011n = new a(1048576, (String) null);
            new a(i.h.class, 2097152);
            int i12 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, i.e.class);
            f45012o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f45013p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f45014q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f45015r = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new a(i12 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new a(i12 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new a(i12 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new a(i12 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f45016s = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, i.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, i.d.class);
            new a(i12 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(i12 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i12 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new a(i12 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i12 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new a(i12 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new a(i12 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new a(i12 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new a(i12 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i12, String str) {
            this(null, i12, str, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f45017a).getId();
        }

        public final boolean equals(@P Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f45017a;
            Object obj3 = this.f45017a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f45017a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @N
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String strD = f.d(this.f45018b);
            if (strD.equals("ACTION_UNKNOWN")) {
                Object obj = this.f45017a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(strD);
            return sb2.toString();
        }

        public a(Class cls, int i12) {
            this(null, i12, null, null, cls);
        }

        public a(Object obj, int i12, String str, androidx.core.view.accessibility.i iVar, Class cls) {
            this.f45018b = i12;
            this.f45020d = iVar;
            if (obj == null) {
                this.f45017a = new AccessibilityNodeInfo.AccessibilityAction(i12, str);
            } else {
                this.f45017a = obj;
            }
            this.f45019c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @X
    public static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @X
    public static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @X
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    @X
    public static class e {
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.accessibility.f$f, reason: collision with other inner class name */
    public static class C1754f {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.CollectionInfo f45021a;

        /* compiled from: AccessibilityNodeInfoCompat.java */
        /* renamed from: androidx.core.view.accessibility.f$f$a */
        public static final class a {
        }

        public C1754f(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f45021a = collectionInfo;
        }

        public static C1754f a(int i12, int i13, int i14) {
            return new C1754f(AccessibilityNodeInfo.CollectionInfo.obtain(i12, i13, false, i14));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.CollectionItemInfo f45022a;

        /* compiled from: AccessibilityNodeInfoCompat.java */
        public static final class a {
        }

        public g(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f45022a = collectionItemInfo;
        }

        public static g a(int i12, int i13, int i14, int i15, boolean z12) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, i13, i14, i15, false, z12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class h {
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static final class i {
    }

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f44999a = accessibilityNodeInfo;
    }

    public static String d(int i12) {
        if (i12 == 1) {
            return "ACTION_FOCUS";
        }
        if (i12 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i12) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i12) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i12) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i12) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void a(int i12) {
        this.f44999a.addAction(i12);
    }

    public final void b(a aVar) {
        this.f44999a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45017a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i12) {
        Bundle extras = this.f44999a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i12) == i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f44999a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f45001c == fVar.f45001c && this.f45000b == fVar.f45000b;
    }

    @Deprecated
    public final void f(Rect rect) {
        this.f44999a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean zIsEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListC = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListC2 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListC3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListC4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i12 = 0; i12 < arrayListC.size(); i12++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(((Integer) arrayListC4.get(i12)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListC.get(i12)).intValue(), ((Integer) arrayListC2.get(i12)).intValue(), ((Integer) arrayListC3.get(i12)).intValue());
        }
        return spannableString;
    }

    public final void h(a aVar) {
        this.f44999a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f45017a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(boolean z12) {
        this.f44999a.setAccessibilityFocused(z12);
    }

    public final void j(Rect rect) {
        this.f44999a.setBoundsInScreen(rect);
    }

    public final void k(CharSequence charSequence) {
        this.f44999a.setClassName(charSequence);
    }

    public final void l(boolean z12) {
        this.f44999a.setClickable(z12);
    }

    public final void m(C1754f c1754f) {
        this.f44999a.setCollectionInfo(c1754f == null ? null : c1754f.f45021a);
    }

    public final void n(g gVar) {
        this.f44999a.setCollectionItemInfo(gVar == null ? null : gVar.f45022a);
    }

    public final void o(CharSequence charSequence) {
        this.f44999a.setContentDescription(charSequence);
    }

    public final void p(boolean z12) {
        this.f44999a.setDismissable(z12);
    }

    public final void q(boolean z12) {
        int i12 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        if (i12 >= 28) {
            accessibilityNodeInfo.setHeading(z12);
            return;
        }
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | (z12 ? 2 : 0));
        }
    }

    public final void r(@P String str) {
        this.f44999a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final void s(boolean z12) {
        int i12 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        if (i12 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z12);
            return;
        }
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z12 ? 1 : 0) | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
        }
    }

    public final void t(boolean z12) {
        this.f44999a.setScrollable(z12);
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            d.b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(g());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(i12 >= 30 ? b.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; tooltipText: ");
        sb2.append(i12 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(i12 >= 33 ? c.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(i12 >= 34 ? d.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb2.append("; granularScrollingSupported: ");
        sb2.append(e(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(i12 >= 33 ? c.b(accessibilityNodeInfo) : e(8388608));
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(i12 >= 34 ? d.d(accessibilityNodeInfo) : e(64));
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(new a(actionList.get(i13), 0, null, null, null));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            a aVar = (a) arrayList.get(i14);
            String strD = d(aVar.a());
            if (strD.equals("ACTION_UNKNOWN")) {
                Object obj = aVar.f45017a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(strD);
            if (i14 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void u(@P CharSequence charSequence) {
        int i12 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f44999a;
        if (i12 >= 30) {
            b.b(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void v(CharSequence charSequence) {
        this.f44999a.setText(charSequence);
    }
}
