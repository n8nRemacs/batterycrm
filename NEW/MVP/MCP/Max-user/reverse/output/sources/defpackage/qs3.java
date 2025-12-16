package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.Range;
import android.util.Size;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class qs3 implements tof, Provider, d4c, zbg, grf {
    public static final byte[] s0 = {0, 7, 8, 15};
    public static final byte[] t0 = {0, 119, -120, -1};
    public static final byte[] u0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public qs3(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new py0(20, false);
                int i2 = 24;
                this.c = new kce(i2);
                this.d = new kce(i2);
                this.o = new kce(i2);
                this.X = new kce(i2);
                this.Y = new kce(i2);
                this.Z = new s6b(8);
                break;
        }
    }

    public static byte[] e(int i, int i2, u62 u62Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) u62Var.i(i2);
        }
        return bArr;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = i(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = i(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = i(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = i(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = i(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205 A[LOOP:3: B:87:0x0158->B:119:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs3.l(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static b75 m(u62 u62Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = u62Var.i(8);
        u62Var.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrF = f();
        int[] iArrG = g();
        while (i10 > 0) {
            int i12 = u62Var.i(i7);
            int i13 = u62Var.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? iArrF : iArrG;
            if ((i13 & 1) != 0) {
                i5 = u62Var.i(i7);
                i6 = u62Var.i(i7);
                i2 = u62Var.i(i7);
                i4 = u62Var.i(i7);
                i3 = i10 - 6;
            } else {
                int i14 = u62Var.i(6) << i9;
                int i15 = u62Var.i(4) << 4;
                i2 = u62Var.i(4) << 4;
                i3 = i10 - 4;
                i4 = u62Var.i(i9) << 6;
                i5 = i14;
                i6 = i15;
            }
            if (i5 == 0) {
                i6 = i11;
                i2 = i6;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i2 - 128;
            iArr2[i12] = i((byte) (255 - (i4 & 255)), zxg.i((int) ((1.402d * d2) + d), 0, 255), zxg.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), zxg.i((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i11 = 0;
            i8 = i8;
            iArrG = iArrG;
            i7 = 8;
            i9 = 2;
        }
        return new b75(i8, iArr, iArrF, iArrG);
    }

    public static e75 n(u62 u62Var) {
        byte[] bArr;
        int i = u62Var.i(16);
        u62Var.t(4);
        int i2 = u62Var.i(2);
        boolean zH = u62Var.h();
        u62Var.t(1);
        byte[] bArr2 = zxg.b;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = u62Var.i(16);
                int i4 = u62Var.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    u62Var.l(i3, bArr2);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    u62Var.l(i4, bArr);
                }
            }
            return new e75(i, zH, bArr2, bArr);
        }
        u62Var.t(u62Var.i(8) * 16);
        bArr = bArr2;
        return new e75(i, zH, bArr2, bArr);
    }

    @Override // defpackage.d4c
    public void a() {
        ((d4c) this.d).a();
    }

    @Override // defpackage.d4c
    public void b() {
        ((d4c) this.d).b();
    }

    @Override // defpackage.d4c
    public ei4 c() {
        return ((d4c) this.d).c();
    }

    @Override // defpackage.d4c
    public void d(d3c d3cVar) {
        ((d4c) this.d).d(d3cVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        switch (this.a) {
            case 3:
                return h();
            default:
                String str = (String) this.b;
                Size size = (Size) this.o;
                z90 z90Var = (z90) this.X;
                int i = z90Var.d;
                Range range = (Range) this.Z;
                Range range2 = msf.p;
                int iIntValue = !Objects.equals(range, range2) ? ((Integer) range.clamp(Integer.valueOf(i))).intValue() : i;
                Integer numValueOf = Integer.valueOf(iIntValue);
                Integer numValueOf2 = Integer.valueOf(i);
                boolean zEquals = Objects.equals(range, range2);
                Object obj = range;
                if (!zEquals) {
                    obj = "<UNSPECIFIED>";
                }
                gri.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj));
                gri.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
                Range range3 = ((fc0) this.d).c;
                gri.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
                int iC = e2h.c(z90Var.c, ((u75) this.Y).b, z90Var.h, iIntValue, z90Var.d, size.getWidth(), z90Var.e, size.getHeight(), z90Var.f, range3);
                int i2 = z90Var.g;
                cc0 cc0VarA = e2h.a(i2, str);
                j35 j35VarD = bc0.d();
                j35VarD.b = str;
                f9g f9gVar = (f9g) this.c;
                if (f9gVar == null) {
                    throw new NullPointerException("Null inputTimebase");
                }
                j35VarD.d = f9gVar;
                j35VarD.o = size;
                j35VarD.t0 = Integer.valueOf(iC);
                j35VarD.Z = Integer.valueOf(iIntValue);
                j35VarD.c = Integer.valueOf(i2);
                j35VarD.Y = cc0VarA;
                return j35VarD.g();
        }
    }

    public kua h() {
        a93 a93Var = new a93(5);
        a93Var.o = (u5i) this.b;
        a93Var.Y = (u5i) this.d;
        a93Var.X = (u5i) this.o;
        a93Var.c = new xtd(14, this);
        ((eza) ((k18) this.c).getValue()).getClass();
        l5c l5cVar = (l5c) ((age) ((k18) this.Y).getValue());
        l5cVar.getClass();
        if (((int) l5cVar.m(PmsKey.f37debugmode, 0)) == 3) {
            a93Var.d = (wg1) this.Z;
        }
        return a93Var.c();
    }

    public long j(os3 os3Var) {
        long[] jArr = (long[]) ((Map) ((bwf) this.Y).getValue()).getOrDefault(os3Var, io5.a);
        int i = ((AtomicInteger) this.d).get();
        if (i >= 0 && i < jArr.length) {
            return jArr[i];
        }
        if (i < jArr.length) {
            return ys.u(jArr);
        }
        if (jArr.length != 0) {
            return jArr[jArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public long k() {
        lg8 lg8Var = lg8.d;
        os3 os3VarB = ((ur3) ((k18) this.c).getValue()).b();
        boolean z = false;
        if (((os3) ((AtomicReference) this.o).getAndSet(os3VarB)) != os3VarB) {
            String name = qs3.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "reset timeoutIndex", null);
            }
            ((AtomicInteger) this.d).set(0);
            z = true;
        }
        long j = j(os3VarB);
        if (z) {
            String name2 = qs3.class.getName();
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, name2, "connType=" + os3VarB + ", timeout = " + j, null);
            }
        }
        return j;
    }

    @Override // defpackage.zbg
    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    @Override // defpackage.d4c
    public void pause() {
        ((d4c) this.d).pause();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0279  */
    @Override // defpackage.tof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(byte[] r44, int r45, int r46, defpackage.sof r47, defpackage.fu3 r48) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs3.r(byte[], int, int, sof, fu3):void");
    }

    @Override // defpackage.tof
    public void reset() {
        switch (this.a) {
            case 1:
                m75 m75Var = (m75) this.Y;
                m75Var.c.clear();
                m75Var.d.clear();
                m75Var.e.clear();
                m75Var.f.clear();
                m75Var.g.clear();
                m75Var.h = null;
                m75Var.i = null;
                break;
            default:
                ((kce) this.c).b = null;
                ((kce) this.d).b = null;
                ((kce) this.o).b = null;
                ((kce) this.X).b = null;
                break;
        }
    }

    @Override // defpackage.tof
    public int u() {
        return 2;
    }

    public qs3(iv6 iv6Var, pje pjeVar, uyf uyfVar, qg8 qg8Var, qje qjeVar, v1a v1aVar) {
        this.a = 4;
        this.b = iv6Var;
        this.c = pjeVar;
        this.o = uyfVar;
        this.X = qg8Var;
        this.Y = qjeVar;
        this.Z = v1aVar;
        this.d = new AtomicInteger();
    }

    public qs3(k18 k18Var, age ageVar) {
        this.a = 0;
        this.b = ageVar;
        this.c = k18Var;
        this.d = new AtomicInteger(0);
        this.o = new AtomicReference(os3.b);
        this.X = new bwf(new ps3(0));
        this.Y = new bwf(new hk1(23, this));
        qha qhaVar = xhb.c;
        this.Z = new short[]{6, 17, 18, 19, 23, 101, 107, 108, 112, 113, 115};
    }

    public qs3(u5i u5iVar, u5i u5iVar2, u5i u5iVar3, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = 3;
        this.b = u5iVar;
        this.d = u5iVar2;
        this.o = u5iVar3;
        this.c = k18Var;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = new wg1();
    }

    public qs3(lzf lzfVar, v40 v40Var, l7a l7aVar, ContextScope contextScope, v7h v7hVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = 6;
        f50 f50Var = new f50(lzfVar, v40Var, l7aVar, contextScope, k18Var5);
        this.b = f50Var;
        j35 j35Var = new j35(contextScope, k18Var, k18Var2, k18Var3, k18Var4, k18Var5, lzfVar, v7hVar);
        this.c = j35Var;
        this.d = f50Var;
        uxb uxbVar = new uxb(new m36(new y3c(this, null), gw0.y(f50Var.Z, (gbd) j35Var.b)), this, 4);
        lcj lcjVar = yve.a;
        n0a n0aVar = n0a.a;
        hbd hbdVarC = gw0.C(uxbVar, contextScope, lcjVar, n0aVar);
        this.o = hbdVarC;
        tcf tcfVarA = ucf.a(n0aVar);
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        this.Z = gw0.C(gw0.y(f50Var.s0, (hbd) j35Var.t0), contextScope, yve.b, Float.valueOf(0.0f));
        zs0.e(new g56(hbdVarC, new x3c(this, null), 1), contextScope);
    }

    public qs3(String str, f9g f9gVar, fc0 fc0Var, Size size, z90 z90Var, u75 u75Var, Range range) {
        this.a = 8;
        this.b = str;
        this.c = f9gVar;
        this.d = fc0Var;
        this.o = size;
        this.X = z90Var;
        this.Y = u75Var;
        this.Z = range;
    }

    public qs3(pea peaVar) throws NoSuchFieldException, SecurityException {
        this.a = 7;
        py0 py0Var = (py0) peaVar.c;
        Toolbar toolbar = (Toolbar) peaVar.d;
        q1g q1gVar = (q1g) peaVar.b;
        int i = peaVar.a;
        WeakReference weakReference = (WeakReference) py0Var.c;
        WeakReference weakReference2 = (WeakReference) py0Var.b;
        if (weakReference.get() != null) {
        } else if (weakReference2.get() != null) {
            ((a) weakReference2.get()).getClass();
        } else {
            throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
        }
        rw4.a();
        this.b = py0Var;
        this.c = toolbar;
        this.d = q1gVar;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
        this.Y = toolbar.findViewById(q0d.toolbar);
        this.Z = toolbar.findViewById(q0d.toolbar__wrapper_title);
        TextView textView = (TextView) toolbar.findViewById(i);
        this.o = textView;
        if (textView != null) {
            new g6g(textView, lni.a(textView.getContext())).a();
        }
        this.X = (TextView) toolbar.findViewById(q0d.toolbar_subtitle);
        if (((TextView) this.o) != null) {
            toolbar.setContentInsetStartWithNavigation(0);
            TextView textView2 = (TextView) this.o;
            textView2.getContext();
            rw4.a();
            int i2 = (int) 8.0f;
            yni.b(textView2, vw4.b(i2));
            TextView textView3 = (TextView) this.X;
            if (textView3 != null) {
                ((TextView) this.o).getContext();
                rw4.a();
                yni.b(textView3, vw4.b(i2));
            }
        }
        TextView textView4 = (TextView) this.o;
        TextView textView5 = (TextView) this.X;
        int i3 = q1gVar.F;
        int i4 = q1gVar.M;
        int i5 = q1gVar.w;
        toolbar.setPopupTheme(q1gVar.j);
        toolbar.setBackgroundColor(q1gVar.N);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.mutate();
            navigationIcon.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        }
        Drawable overflowIcon = toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            cei.k(overflowIcon, i5);
        }
        try {
            Field declaredField = Toolbar.class.getDeclaredField("s0");
            declaredField.setAccessible(true);
            ((Drawable) declaredField.get(toolbar)).mutate().setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
        } catch (Exception e) {
            wqi.e("ThemeHelper", "applyToToolbar: ", e);
        }
        if (textView4 != null) {
            textView4.setTextColor(i3);
        }
        if (textView5 != null) {
            textView5.setTextColor(i4);
        }
        toolbar.m(q1d.menu_empty);
        toolbar.setOnMenuItemClickListener(this);
        u8j.a(toolbar, new gk0(11, this));
    }

    public qs3(List list) {
        this.a = 1;
        umb umbVar = new umb((byte[]) list.get(0));
        int iD = umbVar.D();
        int iD2 = umbVar.D();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.d = new Canvas();
        this.o = new c75(719, 575, 0, 719, 0, 575);
        this.X = new b75(0, new int[]{0, -1, -16777216, -8421505}, f(), g());
        this.Y = new m75(iD, iD2, 1);
    }
}
