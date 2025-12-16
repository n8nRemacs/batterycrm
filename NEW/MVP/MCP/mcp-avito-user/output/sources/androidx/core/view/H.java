package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C22823h0;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f44934a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f44935b;

    /* renamed from: c, reason: collision with root package name */
    public final View f44936c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44937d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f44938e;

    public H(@j.N View view) {
        this.f44936c = view;
    }

    public final boolean a(float f12, float f13, boolean z12) {
        ViewParent viewParentE;
        if (!this.f44937d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return viewParentE.onNestedFling(this.f44936c, f12, f13, z12);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentE);
            return false;
        }
    }

    public final boolean b(float f12, float f13) {
        ViewParent viewParentE;
        if (!this.f44937d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return viewParentE.onNestedPreFling(this.f44936c, f12, f13);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentE);
            return false;
        }
    }

    public final boolean c(int i12, int i13, int i14, @j.P int[] iArr, @j.P int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f44937d || (viewParentE = e(i14)) == null) {
            return false;
        }
        if (i12 == 0 && i13 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f44936c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i15 = iArr2[0];
            i16 = iArr2[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr == null) {
            if (this.f44938e == null) {
                this.f44938e = new int[2];
            }
            iArr3 = this.f44938e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z12 = viewParentE instanceof I;
        View view2 = this.f44936c;
        if (z12) {
            ((I) viewParentE).onNestedPreScroll(view2, i12, i13, iArr3, i14);
        } else if (i14 == 0) {
            try {
                viewParentE.onNestedPreScroll(view2, i12, i13, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i15;
            iArr2[1] = iArr2[1] - i16;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i12, int i13, int i14, int i15, @j.P int[] iArr, int i16, @j.P int[] iArr2) {
        ViewParent viewParentE;
        int i17;
        int i18;
        int[] iArr3;
        if (!this.f44937d || (viewParentE = e(i16)) == null) {
            return false;
        }
        if (i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f44936c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i17 = iArr[0];
            i18 = iArr[1];
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (iArr2 == null) {
            if (this.f44938e == null) {
                this.f44938e = new int[2];
            }
            int[] iArr4 = this.f44938e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z12 = viewParentE instanceof J;
        View view2 = this.f44936c;
        if (z12) {
            ((J) viewParentE).onNestedScroll(view2, i12, i13, i14, i15, i16, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i14;
            iArr3[1] = iArr3[1] + i15;
            if (viewParentE instanceof I) {
                ((I) viewParentE).onNestedScroll(view2, i12, i13, i14, i15, i16);
            } else if (i16 == 0) {
                try {
                    viewParentE.onNestedScroll(view2, i12, i13, i14, i15);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i17;
            iArr[1] = iArr[1] - i18;
        }
        return true;
    }

    public final ViewParent e(int i12) {
        if (i12 == 0) {
            return this.f44934a;
        }
        if (i12 != 1) {
            return null;
        }
        return this.f44935b;
    }

    public final boolean f(int i12) {
        return e(i12) != null;
    }

    public final void g(boolean z12) {
        if (this.f44937d) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            C22823h0.d.t(this.f44936c);
        }
        this.f44937d = z12;
    }

    public final boolean h(int i12, int i13) {
        boolean zOnStartNestedScroll;
        if (f(i13)) {
            return true;
        }
        if (this.f44937d) {
            View view = this.f44936c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z12 = parent instanceof I;
                if (z12) {
                    zOnStartNestedScroll = ((I) parent).onStartNestedScroll(view2, view, i12, i13);
                } else if (i13 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i12);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i13 == 0) {
                        this.f44934a = parent;
                    } else if (i13 == 1) {
                        this.f44935b = parent;
                    }
                    if (z12) {
                        ((I) parent).onNestedScrollAccepted(view2, view, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i12);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void i(int i12) {
        ViewParent viewParentE = e(i12);
        if (viewParentE != null) {
            boolean z12 = viewParentE instanceof I;
            View view = this.f44936c;
            if (z12) {
                ((I) viewParentE).onStopNestedScroll(view, i12);
            } else if (i12 == 0) {
                try {
                    viewParentE.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i12 == 0) {
                this.f44934a = null;
            } else {
                if (i12 != 1) {
                    return;
                }
                this.f44935b = null;
            }
        }
    }
}
