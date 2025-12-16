package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class jr9 extends y0f implements nr9 {
    public final ts9 X;
    public final a37 Y;
    public final ukd Z;
    public final kv9 o;
    public final kce s0;
    public final js0 t0;
    public final xu9 u0;
    public final yu9 v0;
    public final f8a w0;
    public final ArrayList x0;

    public jr9(ExecutorService executorService, kv9 kv9Var, ts9 ts9Var, a37 a37Var, ukd ukdVar, kce kceVar, js0 js0Var, xu9 xu9Var, yu9 yu9Var) {
        super(executorService);
        this.o = kv9Var;
        this.X = ts9Var;
        this.Y = a37Var;
        this.Z = ukdVar;
        this.s0 = kceVar;
        this.t0 = js0Var;
        this.u0 = xu9Var;
        this.v0 = yu9Var;
        this.w0 = new f8a(20);
        this.x0 = new ArrayList(20);
    }

    @Override // defpackage.l98
    public final void F(List list, Runnable runnable) {
        super.F(list, new se5(this, list, runnable, 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: I */
    public final void y(d2f d2fVar) {
        d2fVar.E();
        y27 y27Var = d2fVar instanceof y27 ? (y27) d2fVar : null;
        if (y27Var != null) {
            a37 a37Var = this.Y;
            a37Var.getClass();
            ((bi9) y27Var).O(null, null);
            a37Var.b.remove(y27Var);
        }
    }

    public final long J(long j) {
        int i;
        ArrayList arrayList = this.x0;
        if (!arrayList.isEmpty()) {
            f8a f8aVar = this.w0;
            if (f8aVar.e != 0) {
                int size = arrayList.size();
                ve3.n(arrayList.size(), size);
                int i2 = size - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > i2) {
                        i = -(i3 + 1);
                        break;
                    }
                    i = (i3 + i2) >>> 1;
                    int iC = fni.c(((MessageModel) arrayList.get(i)).c, j);
                    if (iC >= 0) {
                        if (iC <= 0) {
                            break;
                        }
                        i2 = i - 1;
                    } else {
                        i3 = i + 1;
                    }
                }
                if (i < 0) {
                    int i4 = sj9.b;
                } else {
                    int iB = f8aVar.b(i);
                    i = iB >= 0 ? f8aVar.c[iB] : -1;
                    if (i < 0) {
                        return sj9.a;
                    }
                    int i5 = sj9.b;
                }
                return (4294967295L & i) | (i << 32);
            }
        }
        return sj9.a;
    }

    public final int K(long j) {
        long J = J(j);
        int i = sj9.b;
        int i2 = (int) (J >> 32);
        if (i2 >= 0) {
            return (int) (J & 4294967295L);
        }
        if (J == sj9.a) {
            return j();
        }
        int iAbs = Math.abs(i2) - 1;
        f8a f8aVar = this.w0;
        int iB = f8aVar.b(iAbs);
        int i3 = iB >= 0 ? f8aVar.c[iB] : -1;
        return i3 >= 0 ? i3 : j();
    }

    public final MessageModel L() {
        iv ivVar = this.d;
        t98 t98Var = ivVar.f.size() > 0 ? (t98) C(ve3.i(ivVar.f)) : null;
        if (t98Var instanceof MessageModel) {
            return (MessageModel) t98Var;
        }
        return null;
    }

    public final MessageModel M(int i) {
        t98 t98VarG = G(i);
        if (t98VarG instanceof MessageModel) {
            return (MessageModel) t98VarG;
        }
        return null;
    }

    @Override // defpackage.nr9
    public final List b() {
        return this.x0;
    }

    @Override // defpackage.nr9
    public final int f(long j) {
        long J = J(j);
        int i = sj9.b;
        if (((int) (J >> 32)) < 0) {
            return -1;
        }
        return (int) (J & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, k18] */
    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        CharSequence charSequenceX;
        d2f d2fVar = (d2f) midVar;
        t98 t98Var = (t98) C(i);
        if (!(d2fVar instanceof en9)) {
            if (d2fVar instanceof ag2) {
                ((ag2) d2fVar).z((bg2) t98Var);
                return;
            }
            return;
        }
        MessageModel messageModel = (MessageModel) t98Var;
        en9 en9Var = (en9) d2fVar;
        boolean z = en9Var instanceof bi9;
        bi9 bi9Var = z ? (bi9) en9Var : null;
        if (bi9Var != null) {
            ViewGroup viewGroup = bi9Var.I0;
            View view = bi9Var.a;
            kv9 kv9Var = this.o;
            f8j.d(view, 300L, new yh9(kv9Var, bi9Var));
            if (viewGroup instanceof ii9) {
                GestureDetector gestureDetector = new GestureDetector(((uh9) view).getContext(), new of3(bi9Var, new zh9(bi9Var, kv9Var)));
                gestureDetector.setIsLongpressEnabled(true);
                viewGroup.setOnTouchListener(new or6(gestureDetector, 1));
                viewGroup.setOnClickListener(null);
            } else {
                viewGroup.setOnTouchListener(null);
                f8j.d(viewGroup, 300L, new yh9(bi9Var, kv9Var));
            }
            wad wadVar = viewGroup != 0 ? (wad) viewGroup : null;
            if (wadVar != null) {
                wadVar.setOnClickListener(new zh9(kv9Var, bi9Var));
            }
            d72 d72Var = new d72(kv9Var, 5, bi9Var);
            viewGroup.setOnLongClickListener(d72Var);
            ((uh9) view).setOnLongClickListener(d72Var);
            zk9 zk9Var = viewGroup instanceof zk9 ? (zk9) viewGroup : null;
            if (zk9Var != null) {
                int i2 = 0;
                int i3 = 2;
                zk9Var.setReplyClickListener(new rw(i3, kv9Var, sh9.class, "onReplyClick", "onReplyClick(JJ)V", i2, 28));
                zk9Var.setForwardClickListener(new rw(i3, kv9Var, sh9.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;J)V", i2, 29));
            }
            ai9 ai9Var = new ai9(kv9Var, 0, bi9Var);
            y4g y4gVar = viewGroup instanceof y4g ? (y4g) viewGroup : null;
            if (y4gVar != null) {
                y4gVar.setTextMessageLinkClickListener(ai9Var);
            }
            z78 z78Var = viewGroup instanceof z78 ? (z78) viewGroup : null;
            if (z78Var != null) {
                z78Var.setOnLinkLongClickListener(new s7c(kv9Var, bi9Var));
            }
        }
        t44 t44Var = en9Var instanceof t44 ? (t44) en9Var : null;
        if (t44Var != null) {
            t44Var.I0 = this.Z;
        }
        wga wgaVar = en9Var instanceof wga ? (wga) en9Var : null;
        if (wgaVar != null) {
            wgaVar.V0 = this.s0;
        }
        bi9 bi9Var2 = z ? (bi9) en9Var : null;
        ViewParent viewParent = bi9Var2 != null ? bi9Var2.I0 : null;
        wad wadVar2 = viewParent instanceof wad ? (wad) viewParent : null;
        if (wadVar2 != null) {
            wadVar2.setChipObserver(new dq4(this, 27, en9Var));
        }
        en9Var.F(messageModel, list);
        y27 y27Var = en9Var instanceof y27 ? (y27) en9Var : null;
        if (y27Var != null) {
            a37 a37Var = this.Y;
            a37Var.b.add(y27Var);
            if (a37Var.c) {
                a37Var.c = !((bi9) y27Var).O(a37Var.d, new rw(2, a37Var, a37.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 23));
            }
            ((bi9) ((y27) en9Var)).O(a37Var.d, new ir9(2, this.Y, z27.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 0));
        }
        bi9 bi9Var3 = z ? (bi9) en9Var : null;
        xu9 xu9Var = this.u0;
        if (bi9Var3 != null) {
            ?? r3 = bi9Var3.N0;
            if (r3.e()) {
                ((bm7) r3.getValue()).setClickListener(xu9Var);
            }
        }
        y2i y2iVar = en9Var instanceof y2i ? (y2i) en9Var : null;
        if (y2iVar != null) {
            ai9 ai9Var2 = new ai9(this, 1, messageModel);
            h88 h88Var = y2iVar.I0;
            h88Var.a = ai9Var2;
            v32 v32Var = y2iVar.J0;
            if (v32Var != null && (charSequenceX = v32Var.X()) != null) {
                h88Var.c(charSequenceX);
            }
            ((x2i) y2iVar.a).setKeyboardListener(xu9Var);
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == j7b.e) {
            zf2 zf2Var = new zf2(viewGroup.getContext());
            ag2 ag2Var = new ag2(zf2Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
            marginLayoutParams.setMargins(iD, iD, iD, iD);
            zf2Var.setLayoutParams(marginLayoutParams);
            return ag2Var;
        }
        int i2 = (-2013265921) & i;
        int i3 = (-2130706433) & i;
        int i4 = 4;
        if (i3 == -2147483635) {
            Context context = viewGroup.getContext();
            return new y40(context, new g34(context), i4);
        }
        int i5 = 2;
        if (i3 == -2147483647) {
            Context context2 = viewGroup.getContext();
            return new y40(context2, new uf1(context2), i5);
        }
        int i6 = 6;
        int i7 = 0;
        int i8 = 1;
        int i9 = 8;
        if (i2 == 0) {
            h16 h16Var = new h16(viewGroup.getContext());
            t44 t44Var = new t44(h16Var);
            h16Var.setMaxWidth(kti.d(276 * vw4.d().getDisplayMetrics().density));
            h16Var.setMinHeight(kti.d(20 * vw4.d().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            float f = 24;
            marginLayoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
            marginLayoutParams2.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
            h16Var.setGravity(17);
            h16Var.setLayoutParams(marginLayoutParams2);
            t5g t5gVar = dpg.a;
            vz2.g.b(h16Var, t75.b);
            h16Var.setTextAlignment(4);
            h16Var.setGravity(17);
            h16Var.setMovementMethod(LinkMovementMethod.getInstance());
            float f2 = 6;
            float f3 = 1;
            h16Var.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f4 = vw4.d().getDisplayMetrics().density * 10.0f;
            float[] fArr = new float[8];
            while (i7 < 8) {
                fArr[i7] = f4;
                i7++;
            }
            gradientDrawable.setCornerRadii(fArr);
            h16Var.setBackground(gradientDrawable);
            return t44Var;
        }
        if (fn9.e(i2)) {
            return new y2i(viewGroup.getContext());
        }
        int i10 = 3;
        ts9 ts9Var = this.X;
        if (i3 == -2147483638) {
            Context context3 = viewGroup.getContext();
            return new y40(context3, new wz3(context3, ts9Var), i10);
        }
        if (i3 == -2147483640) {
            Context context4 = viewGroup.getContext();
            return new y40(context4, new kr6(context4), i6);
        }
        if (i3 == -2147483636) {
            Context context5 = viewGroup.getContext();
            return new wga(context5, new vga(context5));
        }
        if (i3 == -2147483637) {
            Context context6 = viewGroup.getContext();
            return new y40(context6, new wue(context6, ts9Var), 7);
        }
        if (i3 == -2147483639) {
            Context context7 = viewGroup.getContext();
            return new y40(context7, new ww5(context7), 5);
        }
        if (!fn9.c(i2) && fn9.b(i2) && !fn9.a(i2)) {
            return new ge3(viewGroup.getContext(), ts9Var, 2);
        }
        if (fn9.c(i2) && fn9.b(i2) && !fn9.a(i2)) {
            return new ge3(viewGroup.getContext(), ts9Var, 3);
        }
        if (!fn9.c(i2) && fn9.a(i2)) {
            return new ge3(viewGroup.getContext(), ts9Var, 0);
        }
        if (fn9.c(i2) && fn9.a(i2)) {
            return new ge3(viewGroup.getContext(), ts9Var, 1);
        }
        if (!fn9.c(i2) && fn9.d(i2) && !fn9.a(i2)) {
            Context context8 = viewGroup.getContext();
            return new y40(context8, new v3f(context8), 13);
        }
        if (fn9.c(i2) && fn9.d(i2) && !fn9.a(i2)) {
            Context context9 = viewGroup.getContext();
            return new y40(context9, new x3f(context9), 10);
        }
        if (fn9.c(i2)) {
            Context context10 = viewGroup.getContext();
            return new y40(context10, new x4g(context10), 9);
        }
        if (i3 == -2147483645) {
            Context context11 = viewGroup.getContext();
            return new y40(context11, new cn0(context11), i8);
        }
        if (i3 == -2147483641) {
            return new y40(viewGroup.getContext(), new dff(viewGroup.getContext(), new uk8(viewGroup.getContext(), 1)), i9);
        }
        if (i3 == -2147483644) {
            return new y40(viewGroup.getContext(), new dff(viewGroup.getContext(), new uk8(viewGroup.getContext(), 0)), i9);
        }
        if (i3 == -2147483643) {
            return new y40(viewGroup.getContext(), new dff(viewGroup.getContext(), new uk8(viewGroup.getContext(), 2)), i9);
        }
        if (i2 >= 0 && (i & 8) != 0) {
            Context context12 = viewGroup.getContext();
            return new y40(context12, new s40(context12, ts9Var, this.v0), i7);
        }
        if (i3 != -2147483642) {
            return i3 == -2147483634 ? new y40(viewGroup.getContext(), ts9Var) : new y40(viewGroup.getContext(), ts9Var);
        }
        Context context13 = viewGroup.getContext();
        return new y40(context13, new v6h(context13, ts9Var), 12);
    }
}
