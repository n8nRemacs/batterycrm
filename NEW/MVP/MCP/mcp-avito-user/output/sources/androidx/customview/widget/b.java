package androidx.customview.widget;

import android.graphics.Rect;
import androidx.customview.widget.a;
import j.N;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: classes.dex */
class b {

    /* compiled from: FocusStrategy.java */
    public interface a<T> {
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC1772b<T, V> {
    }

    /* compiled from: FocusStrategy.java */
    public static class c<T> implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Rect f45370b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        public final Rect f45371c = new Rect();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f45372d;

        /* renamed from: e, reason: collision with root package name */
        public final a<T> f45373e;

        public c(boolean z12, a<T> aVar) {
            this.f45372d = z12;
            this.f45373e = aVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            a.C1771a c1771a = (a.C1771a) this.f45373e;
            Rect rect = this.f45370b;
            c1771a.a(t12, rect);
            Rect rect2 = this.f45371c;
            c1771a.a(t13, rect2);
            int i12 = rect.top;
            int i13 = rect2.top;
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
            int i14 = rect.left;
            int i15 = rect2.left;
            boolean z12 = this.f45372d;
            if (i14 < i15) {
                return z12 ? 1 : -1;
            }
            if (i14 > i15) {
                return z12 ? -1 : 1;
            }
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if (i16 < i17) {
                return -1;
            }
            if (i16 > i17) {
                return 1;
            }
            int i18 = rect.right;
            int i19 = rect2.right;
            if (i18 < i19) {
                return z12 ? 1 : -1;
            }
            if (i18 > i19) {
                return z12 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r9, @j.N android.graphics.Rect r10, @j.N android.graphics.Rect r11, @j.N android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = d(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i12, @N Rect rect, @N Rect rect2) {
        if (i12 != 17) {
            if (i12 != 33) {
                if (i12 != 66) {
                    if (i12 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i12, @N Rect rect, @N Rect rect2) {
        if (i12 == 17) {
            int i13 = rect.right;
            int i14 = rect2.right;
            return (i13 > i14 || rect.left >= i14) && rect.left > rect2.left;
        }
        if (i12 == 33) {
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            return (i15 > i16 || rect.top >= i16) && rect.top > rect2.top;
        }
        if (i12 == 66) {
            int i17 = rect.left;
            int i18 = rect2.left;
            return (i17 < i18 || rect.right <= i18) && rect.right < rect2.right;
        }
        if (i12 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i19 = rect.top;
        int i22 = rect2.top;
        return (i19 < i22 || rect.bottom <= i22) && rect.bottom < rect2.bottom;
    }

    public static int d(int i12, @N Rect rect, @N Rect rect2) {
        int i13;
        int i14;
        if (i12 == 17) {
            i13 = rect.left;
            i14 = rect2.right;
        } else if (i12 == 33) {
            i13 = rect.top;
            i14 = rect2.bottom;
        } else if (i12 == 66) {
            i13 = rect2.left;
            i14 = rect.right;
        } else {
            if (i12 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i13 = rect2.top;
            i14 = rect.bottom;
        }
        return Math.max(0, i13 - i14);
    }

    public static int e(int i12, @N Rect rect, @N Rect rect2) {
        if (i12 != 17) {
            if (i12 != 33) {
                if (i12 != 66) {
                    if (i12 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
