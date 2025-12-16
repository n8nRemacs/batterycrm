package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AccessibilityIterators.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22454b {

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/b$a;", "Landroidx/compose/ui/platform/b$f;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$a */
    public static abstract class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public String f41390a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final int[] f41391b = new int[2];

        @Y61.l
        public final int[] c(int i12, int i13) {
            if (i12 < 0 || i13 < 0 || i12 == i13) {
                return null;
            }
            int[] iArr = this.f41391b;
            iArr[0] = i12;
            iArr[1] = i13;
            return iArr;
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/b$b;", "Landroidx/compose/ui/platform/b$a;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$b, reason: collision with other inner class name */
    public static class C1676b extends a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f41392d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public static C1676b f41393e;

        /* renamed from: c, reason: collision with root package name */
        public final BreakIterator f41394c;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/b$b$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/b$b;", "instance", "Landroidx/compose/ui/platform/b$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.b$b$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public C1676b(Locale locale, C42822w c42822w) {
            this.f41394c = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] a(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            int length = str.length();
            if (length <= 0 || i12 >= length) {
                return null;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            do {
                BreakIterator breakIterator = this.f41394c;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i12)) {
                    BreakIterator breakIterator2 = this.f41394c;
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    int iFollowing = breakIterator2.following(i12);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return c(i12, iFollowing);
                }
                BreakIterator breakIterator3 = this.f41394c;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                i12 = breakIterator3.following(i12);
            } while (i12 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] b(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            int length = str.length();
            if (length <= 0 || i12 <= 0) {
                return null;
            }
            if (i12 > length) {
                i12 = length;
            }
            do {
                BreakIterator breakIterator = this.f41394c;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                if (breakIterator.isBoundary(i12)) {
                    BreakIterator breakIterator2 = this.f41394c;
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    int iPreceding = breakIterator2.preceding(i12);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return c(iPreceding, i12);
                }
                BreakIterator breakIterator3 = this.f41394c;
                if (breakIterator3 == null) {
                    breakIterator3 = null;
                }
                i12 = breakIterator3.preceding(i12);
            } while (i12 != -1);
            return null;
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/b$c;", "Landroidx/compose/ui/platform/b$a;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$c */
    public static final class c extends a {

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public static c f41396e;

        /* renamed from: c, reason: collision with root package name */
        public androidx.compose.ui.text.o0 f41399c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f41395d = new a(null);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final ResolvedTextDirection f41397f = ResolvedTextDirection.f42626c;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final ResolvedTextDirection f41398g = ResolvedTextDirection.f42625b;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b$c$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "Landroidx/compose/ui/platform/b$c;", "lineInstance", "Landroidx/compose/ui/platform/b$c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.b$c$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] a(int i12) {
            int iD2;
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.length() <= 0) {
                return null;
            }
            String str2 = this.f41390a;
            if (str2 == null) {
                str2 = null;
            }
            if (i12 >= str2.length()) {
                return null;
            }
            ResolvedTextDirection resolvedTextDirection = f41397f;
            if (i12 < 0) {
                androidx.compose.ui.text.o0 o0Var = this.f41399c;
                if (o0Var == null) {
                    o0Var = null;
                }
                iD2 = o0Var.f42527b.d(0);
            } else {
                androidx.compose.ui.text.o0 o0Var2 = this.f41399c;
                if (o0Var2 == null) {
                    o0Var2 = null;
                }
                int iD3 = o0Var2.f42527b.d(i12);
                iD2 = d(iD3, resolvedTextDirection) == i12 ? iD3 : iD3 + 1;
            }
            androidx.compose.ui.text.o0 o0Var3 = this.f41399c;
            if (o0Var3 == null) {
                o0Var3 = null;
            }
            if (iD2 >= o0Var3.f42527b.f41921f) {
                return null;
            }
            return c(d(iD2, resolvedTextDirection), d(iD2, f41398g) + 1);
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] b(int i12) {
            int iD2;
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.length() <= 0 || i12 <= 0) {
                return null;
            }
            String str2 = this.f41390a;
            if (str2 == null) {
                str2 = null;
            }
            int length = str2.length();
            ResolvedTextDirection resolvedTextDirection = f41398g;
            if (i12 > length) {
                androidx.compose.ui.text.o0 o0Var = this.f41399c;
                if (o0Var == null) {
                    o0Var = null;
                }
                String str3 = this.f41390a;
                if (str3 == null) {
                    str3 = null;
                }
                iD2 = o0Var.f42527b.d(str3.length());
            } else {
                androidx.compose.ui.text.o0 o0Var2 = this.f41399c;
                if (o0Var2 == null) {
                    o0Var2 = null;
                }
                int iD3 = o0Var2.f42527b.d(i12);
                iD2 = d(iD3, resolvedTextDirection) + 1 == i12 ? iD3 : iD3 - 1;
            }
            if (iD2 < 0) {
                return null;
            }
            return c(d(iD2, f41397f), d(iD2, resolvedTextDirection) + 1);
        }

        public final int d(int i12, ResolvedTextDirection resolvedTextDirection) {
            androidx.compose.ui.text.o0 o0Var = this.f41399c;
            if (o0Var == null) {
                o0Var = null;
            }
            int i13 = o0Var.i(i12);
            androidx.compose.ui.text.o0 o0Var2 = this.f41399c;
            if (o0Var2 == null) {
                o0Var2 = null;
            }
            if (resolvedTextDirection != o0Var2.j(i13)) {
                androidx.compose.ui.text.o0 o0Var3 = this.f41399c;
                return (o0Var3 != null ? o0Var3 : null).i(i12);
            }
            return androidx.compose.ui.text.o0.f(this.f41399c != null ? r5 : null, i12) - 1;
        }

        public c() {
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/b$d;", "Landroidx/compose/ui/platform/b$a;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$d */
    public static final class d extends a {

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public static d f41401f;

        /* renamed from: c, reason: collision with root package name */
        public androidx.compose.ui.text.o0 f41404c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.compose.ui.semantics.u f41405d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final a f41400e = new a(null);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final ResolvedTextDirection f41402g = ResolvedTextDirection.f42626c;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final ResolvedTextDirection f41403h = ResolvedTextDirection.f42625b;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/b$d$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionEnd", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "DirectionStart", "Landroidx/compose/ui/platform/b$d;", "pageInstance", "Landroidx/compose/ui/platform/b$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.b$d$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] a(int i12) {
            int iE2;
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.length() <= 0) {
                return null;
            }
            String str2 = this.f41390a;
            if (str2 == null) {
                str2 = null;
            }
            if (i12 >= str2.length()) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.u uVar = this.f41405d;
                if (uVar == null) {
                    uVar = null;
                }
                l0.j jVarE = uVar.e();
                int iRound = Math.round(jVarE.f413393d - jVarE.f413391b);
                if (i12 <= 0) {
                    i12 = 0;
                }
                androidx.compose.ui.text.o0 o0Var = this.f41404c;
                if (o0Var == null) {
                    o0Var = null;
                }
                int iD2 = o0Var.f42527b.d(i12);
                androidx.compose.ui.text.o0 o0Var2 = this.f41404c;
                if (o0Var2 == null) {
                    o0Var2 = null;
                }
                float f12 = o0Var2.f42527b.f(iD2) + iRound;
                androidx.compose.ui.text.o0 o0Var3 = this.f41404c;
                androidx.compose.ui.text.o0 o0Var4 = o0Var3 == null ? null : o0Var3;
                if (o0Var3 == null) {
                    o0Var3 = null;
                }
                if (f12 < o0Var4.f42527b.f(o0Var3.f42527b.f41921f - 1)) {
                    androidx.compose.ui.text.o0 o0Var5 = this.f41404c;
                    iE2 = (o0Var5 != null ? o0Var5 : null).f42527b.e(f12);
                } else {
                    androidx.compose.ui.text.o0 o0Var6 = this.f41404c;
                    iE2 = (o0Var6 != null ? o0Var6 : null).f42527b.f41921f;
                }
                return c(i12, d(iE2 - 1, f41403h) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] b(int i12) {
            int iE2;
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.length() <= 0 || i12 <= 0) {
                return null;
            }
            try {
                androidx.compose.ui.semantics.u uVar = this.f41405d;
                if (uVar == null) {
                    uVar = null;
                }
                l0.j jVarE = uVar.e();
                int iRound = Math.round(jVarE.f413393d - jVarE.f413391b);
                String str2 = this.f41390a;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i12) {
                    i12 = length;
                }
                androidx.compose.ui.text.o0 o0Var = this.f41404c;
                if (o0Var == null) {
                    o0Var = null;
                }
                int iD2 = o0Var.f42527b.d(i12);
                androidx.compose.ui.text.o0 o0Var2 = this.f41404c;
                if (o0Var2 == null) {
                    o0Var2 = null;
                }
                float f12 = o0Var2.f42527b.f(iD2) - iRound;
                if (f12 > 0.0f) {
                    androidx.compose.ui.text.o0 o0Var3 = this.f41404c;
                    if (o0Var3 == null) {
                        o0Var3 = null;
                    }
                    iE2 = o0Var3.f42527b.e(f12);
                } else {
                    iE2 = 0;
                }
                String str3 = this.f41390a;
                if (i12 == (str3 != null ? str3 : null).length() && iE2 < iD2) {
                    iE2++;
                }
                return c(d(iE2, f41402g), i12);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final int d(int i12, ResolvedTextDirection resolvedTextDirection) {
            androidx.compose.ui.text.o0 o0Var = this.f41404c;
            if (o0Var == null) {
                o0Var = null;
            }
            int i13 = o0Var.i(i12);
            androidx.compose.ui.text.o0 o0Var2 = this.f41404c;
            if (o0Var2 == null) {
                o0Var2 = null;
            }
            if (resolvedTextDirection != o0Var2.j(i13)) {
                androidx.compose.ui.text.o0 o0Var3 = this.f41404c;
                return (o0Var3 != null ? o0Var3 : null).i(i12);
            }
            return androidx.compose.ui.text.o0.f(this.f41404c != null ? r5 : null, i12) - 1;
        }

        public d() {
            new Rect();
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/b$e;", "Landroidx/compose/ui/platform/b$a;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$e */
    public static final class e extends a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f41406c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public static e f41407d;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/b$e$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/b$e;", "instance", "Landroidx/compose/ui/platform/b$e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.b$e$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] a(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            int length = str.length();
            if (length <= 0 || i12 >= length) {
                return null;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            while (i12 < length) {
                String str2 = this.f41390a;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.charAt(i12) != '\n' || e(i12)) {
                    break;
                }
                i12++;
            }
            if (i12 >= length) {
                return null;
            }
            int i13 = i12 + 1;
            while (i13 < length && !d(i13)) {
                i13++;
            }
            return c(i12, i13);
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] b(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            int length = str.length();
            if (length <= 0 || i12 <= 0) {
                return null;
            }
            if (i12 > length) {
                i12 = length;
            }
            while (i12 > 0) {
                String str2 = this.f41390a;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.charAt(i12 - 1) != '\n' || d(i12)) {
                    break;
                }
                i12--;
            }
            if (i12 <= 0) {
                return null;
            }
            int i13 = i12 - 1;
            while (i13 > 0 && !e(i13)) {
                i13--;
            }
            return c(i13, i12);
        }

        public final boolean d(int i12) {
            if (i12 > 0) {
                String str = this.f41390a;
                if (str == null) {
                    str = null;
                }
                if (str.charAt(i12 - 1) != '\n') {
                    String str2 = this.f41390a;
                    if (str2 == null) {
                        str2 = null;
                    }
                    if (i12 != str2.length()) {
                        String str3 = this.f41390a;
                        if ((str3 != null ? str3 : null).charAt(i12) == '\n') {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final boolean e(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.charAt(i12) != '\n') {
                if (i12 == 0) {
                    return true;
                }
                String str2 = this.f41390a;
                if ((str2 != null ? str2 : null).charAt(i12 - 1) == '\n') {
                    return true;
                }
            }
            return false;
        }

        public e() {
        }
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/b$f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$f */
    public interface f {
        @Y61.l
        int[] a(int i12);

        @Y61.l
        int[] b(int i12);
    }

    /* compiled from: AccessibilityIterators.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/b$g;", "Landroidx/compose/ui/platform/b$a;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b$g */
    public static final class g extends a {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f41408d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public static g f41409e;

        /* renamed from: c, reason: collision with root package name */
        public final BreakIterator f41410c;

        /* compiled from: AccessibilityIterators.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/b$g$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/b$g;", "instance", "Landroidx/compose/ui/platform/b$g;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.b$g$a */
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public g(Locale locale, C42822w c42822w) {
            this.f41410c = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] a(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (str.length() <= 0) {
                return null;
            }
            String str2 = this.f41390a;
            if (str2 == null) {
                str2 = null;
            }
            if (i12 >= str2.length()) {
                return null;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            while (!e(i12) && (!e(i12) || (i12 != 0 && e(i12 - 1)))) {
                BreakIterator breakIterator = this.f41410c;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                i12 = breakIterator.following(i12);
                if (i12 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f41410c;
            if (breakIterator2 == null) {
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i12);
            if (iFollowing == -1 || !d(iFollowing)) {
                return null;
            }
            return c(i12, iFollowing);
        }

        @Override // androidx.compose.ui.platform.C22454b.f
        @Y61.l
        public final int[] b(int i12) {
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            int length = str.length();
            if (length <= 0 || i12 <= 0) {
                return null;
            }
            if (i12 > length) {
                i12 = length;
            }
            while (i12 > 0 && !e(i12 - 1) && !d(i12)) {
                BreakIterator breakIterator = this.f41410c;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                i12 = breakIterator.preceding(i12);
                if (i12 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f41410c;
            if (breakIterator2 == null) {
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i12);
            if (iPreceding == -1 || !e(iPreceding) || (iPreceding != 0 && e(iPreceding - 1))) {
                return null;
            }
            return c(iPreceding, i12);
        }

        public final boolean d(int i12) {
            if (i12 > 0 && e(i12 - 1)) {
                String str = this.f41390a;
                if (str == null) {
                    str = null;
                }
                if (i12 == str.length() || !e(i12)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e(int i12) {
            if (i12 < 0) {
                return false;
            }
            String str = this.f41390a;
            if (str == null) {
                str = null;
            }
            if (i12 >= str.length()) {
                return false;
            }
            String str2 = this.f41390a;
            return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i12));
        }
    }
}
