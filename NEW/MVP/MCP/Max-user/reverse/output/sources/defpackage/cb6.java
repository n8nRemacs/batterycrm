package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;

/* loaded from: classes2.dex */
public final class cb6 implements oze {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public cb6(d92 d92Var) {
        this.a = d92Var;
        zkb zkbVar = new zkb(5, this);
        this.b = zkbVar;
        oze ozeVarBuild = ((SignalingTransportBuilder) d92Var.b).build(new s0f(false, null, null));
        q0f q0fVar = ozeVarBuild instanceof q0f ? (q0f) ozeVarBuild : null;
        if (q0fVar != null) {
            q0fVar.setListener(zkbVar);
        }
        this.c = ozeVarBuild;
        this.f = new ReentrantLock();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.cb6 r7, defpackage.pd6 r8, defpackage.q44 r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.za6
            if (r0 == 0) goto L16
            r0 = r9
            za6 r0 = (defpackage.za6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            za6 r0 = new za6
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.g8j.b(r9)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            cb6 r7 = r0.d
            defpackage.g8j.b(r9)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            goto L64
        L3b:
            r8 = move-exception
            goto L5f
        L3d:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r7.d     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            k18 r9 = (defpackage.k18) r9     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            hwa r9 = (defpackage.hwa) r9     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            java.lang.Object r1 = r7.b     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            java.lang.Object r5 = r7.a     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            yi5 r5 = (defpackage.yi5) r5     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            r0.d = r7     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            r0.Y = r3     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            java.lang.Object r9 = defpackage.d8j.c(r9, r8, r1, r5, r0)     // Catch: java.lang.Throwable -> L3b java.util.concurrent.CancellationException -> L5d
            if (r9 != r4) goto L64
            goto L8e
        L5d:
            r7 = move-exception
            goto L8f
        L5f:
            ipd r9 = new ipd
            r9.<init>(r8)
        L64:
            java.lang.Throwable r8 = defpackage.kpd.a(r9)
            if (r8 == 0) goto L73
            java.lang.Object r1 = r7.b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "Not updated folder due to error"
            defpackage.wqi.e(r1, r3, r8)
        L73:
            defpackage.g8j.b(r9)
            qd6 r9 = (defpackage.qd6) r9
            va4 r7 = r7.f()
            long r5 = r9.d
            dh2 r8 = r9.c
            r9 = 0
            r0.d = r9
            r0.Y = r2
            java.lang.Object r7 = r7.m(r5, r8, r0)
            if (r7 != r4) goto L8c
            goto L8e
        L8c:
            qqg r4 = defpackage.qqg.a
        L8e:
            return r4
        L8f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb6.a(cb6, pd6, q44):java.lang.Object");
    }

    public static boolean b(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int iC = j7g.c(context, fvc.colorControlHighlight);
        int iB = j7g.b(context, fvc.colorButtonNormal);
        int[] iArr = j7g.b;
        int[] iArr2 = j7g.d;
        int iG = rf3.g(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, j7g.c, j7g.f}, new int[]{iB, iG, rf3.g(iC, i), i});
    }

    public static LayerDrawable g(eod eodVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = eodVar.d(context, oxc.abc_star_black_48dp);
        Drawable drawableD2 = eodVar.d(context, oxc.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static void k(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = ko.b;
        }
        drawableMutate.setColorFilter(ko.c(i, mode));
    }

    public static pd6 l(f86 f86Var, String str, n8a n8aVar) {
        String str2 = f86Var.a;
        if (str == null) {
            str = f86Var.b.toString();
        }
        String str3 = str;
        n8a n8aVar2 = f86Var.t0;
        if (n8aVar == null) {
            n8aVar = dsi.i(f86Var.o);
        }
        return new pd6(str2, str3, n8aVar, n8aVar2, f86Var.d, f86Var.s0, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0198 A[LOOP:0: B:34:0x0192->B:36:0x0198, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.q44 r18) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb6.c(q44):java.lang.Object");
    }

    @Override // defpackage.oze
    public void dispose() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            oze ozeVar = (oze) this.c;
            this.c = null;
            this.d = null;
            this.e = null;
            reentrantLock.unlock();
            q0f q0fVar = ozeVar instanceof q0f ? (q0f) ozeVar : null;
            if (q0fVar != null) {
                q0fVar.setListener(null);
            }
            if (ozeVar != null) {
                ozeVar.dispose();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void e() {
        vwf vwfVar = (vwf) this.b;
        ArrayDeque arrayDeque = (ArrayDeque) this.e;
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (!vwfVar.a.hasMessages(0)) {
            vwfVar.getClass();
            twf twfVarB = vwf.b();
            Message messageObtainMessage = vwfVar.a.obtainMessage(0);
            twfVarB.a = messageObtainMessage;
            Handler handler = vwfVar.a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            twfVarB.a();
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public va4 f() {
        return (va4) ((k18) this.e).getValue();
    }

    public ColorStateList h(Context context, int i) {
        if (i == oxc.abc_edit_text_material) {
            return z7.c(context, rvc.abc_tint_edittext);
        }
        if (i == oxc.abc_switch_track_mtrl_alpha) {
            return z7.c(context, rvc.abc_tint_switch_track);
        }
        if (i != oxc.abc_switch_thumb_material) {
            if (i == oxc.abc_btn_default_mtrl_shape) {
                return d(context, j7g.c(context, fvc.colorButtonNormal));
            }
            if (i == oxc.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == oxc.abc_btn_colored_material) {
                return d(context, j7g.c(context, fvc.colorAccent));
            }
            if (i == oxc.abc_spinner_mtrl_am_alpha || i == oxc.abc_spinner_textfield_background_material) {
                return z7.c(context, rvc.abc_tint_spinner);
            }
            if (b(i, (int[]) this.b)) {
                return j7g.d(context, fvc.colorControlNormal);
            }
            if (b(i, (int[]) this.e)) {
                return z7.c(context, rvc.abc_tint_default);
            }
            if (b(i, (int[]) this.f)) {
                return z7.c(context, rvc.abc_tint_btn_checkable);
            }
            if (i == oxc.abc_seekbar_thumb_material) {
                return z7.c(context, rvc.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = j7g.d(context, fvc.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = j7g.b;
            iArr2[0] = j7g.b(context, fvc.colorSwitchThumbNormal);
            iArr[1] = j7g.e;
            iArr2[1] = j7g.c(context, fvc.colorControlActivated);
            iArr[2] = j7g.f;
            iArr2[2] = j7g.c(context, fvc.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = j7g.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = j7g.e;
            iArr2[1] = j7g.c(context, fvc.colorControlActivated);
            iArr[2] = j7g.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void i(int i, oa8 oa8Var) {
        ((ArrayDeque) this.f).add(new mn1(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.d), i, oa8Var, 12));
    }

    public void j(int i, oa8 oa8Var) {
        i(i, oa8Var);
        e();
    }

    @Override // defpackage.oze
    public void registerListener(nze nzeVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            this.d = nzeVar;
            oze ozeVar = (oze) this.c;
            if (ozeVar != null) {
                ozeVar.registerListener(nzeVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.oze
    public void restart(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            oze ozeVar = (oze) this.c;
            if (ozeVar != null) {
                ozeVar.restart(str);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.oze
    public void send(String str) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            oze ozeVar = (oze) this.c;
            if (ozeVar != null) {
                ozeVar.send(str);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.oze
    public void updateActivityTimeout(long j) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            this.e = Long.valueOf(j);
            oze ozeVar = (oze) this.c;
            if (ozeVar != null) {
                ozeVar.updateActivityTimeout(j);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public cb6(y6d y6dVar, dj1 dj1Var, xo8 xo8Var, sf1 sf1Var, qf1 qf1Var, y8g y8gVar) {
        this.a = y6dVar;
        this.b = dj1Var;
        this.c = xo8Var;
        this.d = sf1Var;
        this.e = qf1Var;
        this.f = y8gVar;
    }

    public cb6(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.d = k18Var;
        this.e = k18Var2;
        this.f = k18Var3;
        this.a = k18Var4;
        this.b = k18Var5;
        this.c = k18Var6;
    }

    public cb6(k18 k18Var, k18 k18Var2, lzf lzfVar, a84 a84Var, k18 k18Var3, yi5 yi5Var) {
        this.a = yi5Var;
        this.b = cb6.class.getName();
        this.c = d7j.a(((q2b) lzfVar).b().plus(a84Var));
        this.d = k18Var2;
        this.e = k18Var;
        this.f = k18Var3;
    }

    public cb6() {
        this.a = new int[]{oxc.abc_textfield_search_default_mtrl_alpha, oxc.abc_textfield_default_mtrl_alpha, oxc.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{oxc.abc_ic_commit_search_api_mtrl_alpha, oxc.abc_seekbar_tick_mark_material, oxc.abc_ic_menu_share_mtrl_alpha, oxc.abc_ic_menu_copy_mtrl_am_alpha, oxc.abc_ic_menu_cut_mtrl_alpha, oxc.abc_ic_menu_selectall_mtrl_alpha, oxc.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{oxc.abc_textfield_activated_mtrl_alpha, oxc.abc_textfield_search_activated_mtrl_alpha, oxc.abc_cab_background_top_mtrl_alpha, oxc.abc_text_cursor_material, oxc.abc_text_select_handle_left_mtrl, oxc.abc_text_select_handle_middle_mtrl, oxc.abc_text_select_handle_right_mtrl};
        this.d = new int[]{oxc.abc_popup_background_mtrl_mult, oxc.abc_cab_background_internal_bg, oxc.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{oxc.abc_tab_indicator_material, oxc.abc_textfield_search_material};
        this.f = new int[]{oxc.abc_btn_check_material, oxc.abc_btn_radio_material, oxc.abc_btn_check_material_anim, oxc.abc_btn_radio_material_anim};
    }

    public cb6(Looper looper, kwf kwfVar, qa8 qa8Var) {
        this(new CopyOnWriteArraySet(), looper, kwfVar, qa8Var);
    }

    public cb6(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, kwf kwfVar, qa8 qa8Var) {
        this.a = kwfVar;
        this.d = copyOnWriteArraySet;
        this.c = qa8Var;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = kwfVar.a(looper, new dn3(5, this));
    }
}
