package one.me.sdk.messagewrite;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.ak9;
import defpackage.ap9;
import defpackage.aw0;
import defpackage.az;
import defpackage.b1e;
import defpackage.b9h;
import defpackage.bbd;
import defpackage.bk9;
import defpackage.bl8;
import defpackage.bp9;
import defpackage.c83;
import defpackage.cp9;
import defpackage.d53;
import defpackage.dfh;
import defpackage.dp8;
import defpackage.dp9;
import defpackage.dqi;
import defpackage.ep9;
import defpackage.f6j;
import defpackage.f7f;
import defpackage.fed;
import defpackage.fk9;
import defpackage.fni;
import defpackage.fp8;
import defpackage.fp9;
import defpackage.fqf;
import defpackage.g31;
import defpackage.g44;
import defpackage.g4i;
import defpackage.g56;
import defpackage.gp9;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gzc;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.i9h;
import defpackage.ik9;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iv8;
import defpackage.jp9;
import defpackage.k18;
import defpackage.kg6;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.m31;
import defpackage.mab;
import defpackage.mn9;
import defpackage.mp9;
import defpackage.mqf;
import defpackage.muc;
import defpackage.n5g;
import defpackage.ncg;
import defpackage.no9;
import defpackage.np9;
import defpackage.o6i;
import defpackage.on9;
import defpackage.oo9;
import defpackage.op9;
import defpackage.ox3;
import defpackage.pab;
import defpackage.pb3;
import defpackage.pe8;
import defpackage.po9;
import defpackage.pp9;
import defpackage.qn9;
import defpackage.qo9;
import defpackage.qp9;
import defpackage.qqg;
import defpackage.qsb;
import defpackage.ro9;
import defpackage.s2i;
import defpackage.sd8;
import defpackage.sn0;
import defpackage.sn9;
import defpackage.so9;
import defpackage.tcf;
import defpackage.tj9;
import defpackage.tk4;
import defpackage.to9;
import defpackage.toc;
import defpackage.tva;
import defpackage.tzc;
import defpackage.u45;
import defpackage.ub3;
import defpackage.ucf;
import defpackage.ue3;
import defpackage.uo9;
import defpackage.vid;
import defpackage.vmf;
import defpackage.vo9;
import defpackage.vpi;
import defpackage.vw4;
import defpackage.wo9;
import defpackage.wz7;
import defpackage.xo9;
import defpackage.xz7;
import defpackage.y8h;
import defpackage.yj9;
import defpackage.yo9;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z34;
import defpackage.z41;
import defpackage.z5j;
import defpackage.zj9;
import defpackage.zo9;
import defpackage.zpf;
import defpackage.zud;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/MessageWriteWidget;", "Lone/me/sdk/arch/Widget;", "Lwz7;", "Lg44;", "Ltj9;", "Lub3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessageWriteWidget extends Widget implements wz7, g44, tj9, ub3 {
    public static final /* synthetic */ yy7[] L0 = {new toc(MessageWriteWidget.class, "rootView", "getRootView()Landroid/widget/LinearLayout;", 0), ho7.d(vid.a, MessageWriteWidget.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0), new toc(MessageWriteWidget.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new toc(MessageWriteWidget.class, "menuRecyclerView", "getMenuRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(MessageWriteWidget.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0), new toc(MessageWriteWidget.class, "recordControlsContainer", "getRecordControlsContainer()Landroid/view/ViewGroup;", 0), new toc(MessageWriteWidget.class, "recordControlsRouter", "getRecordControlsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final sn0 A0;
    public final bbd B0;
    public final bbd C0;
    public dp8 D0;
    public z34 E0;
    public final tcf F0;
    public ncg G0;
    public final k18 H0;
    public final Object I0;
    public final Object J0;
    public int K0;
    public final sd8 X;
    public final k18 Y;
    public final k18 Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final Object v0;
    public final bbd w0;
    public final bbd x0;
    public final bbd y0;
    public final bbd z0;

    public MessageWriteWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb("arg_scope_id", new b1e(str))));
    }

    public static final void A0(MessageWriteWidget messageWriteWidget, sn9 sn9Var) {
        if (sn9Var == null) {
            messageWriteWidget.L0(sn9Var);
            return;
        }
        messageWriteWidget.C0().setRightOuterIconActionState(new yj9());
        messageWriteWidget.C0().setRightInnerIconVisible(true);
        if (dqi.r(messageWriteWidget.A0) && messageWriteWidget.I0().K0.a.getValue() != null) {
            messageWriteWidget.C0().setText(null);
        }
        messageWriteWidget.L0(sn9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void N0(defpackage.muc r3, boolean r4) {
        /*
            android.widget.TextView r0 = r3.getTitleView()
            float r0 = defpackage.b6g.e(r0)
            int r0 = defpackage.kpi.r(r0)
            r1 = 0
            if (r4 == 0) goto L20
            android.widget.TextView r2 = r3.getTitleView()
            xzg r2 = defpackage.b6g.a(r2)
            if (r2 == 0) goto L1c
            int r2 = r2.a
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 != r0) goto L20
            return
        L20:
            if (r4 == 0) goto L3c
            android.widget.TextView r4 = r3.getTitleView()
            xzg r4 = defpackage.b6g.a(r4)
            if (r4 == 0) goto L2e
            int r1 = r4.a
        L2e:
            if (r1 == r0) goto L3c
            xzg r4 = new xzg
            android.content.Context r1 = r3.getContext()
            kk4 r2 = defpackage.kk4.z0
            r4.<init>(r1, r0, r2)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            android.widget.TextView r3 = r3.getTitleView()
            defpackage.b6g.d(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.MessageWriteWidget.N0(muc, boolean):void");
    }

    public static final void y0(MessageWriteWidget messageWriteWidget, mn9 mn9Var) {
        az azVar;
        sn0 sn0Var = messageWriteWidget.A0;
        String str = null;
        CharSequence charSequence = mn9Var != null ? mn9Var.b : null;
        if (mn9Var == null) {
            charSequence = null;
        }
        if (mn9Var == null) {
            messageWriteWidget.C0().setRightOuterIconActionState(new yj9());
            messageWriteWidget.C0().setText(null);
            messageWriteWidget.C0().setRightInnerIconVisible(true);
        } else {
            messageWriteWidget.C0().setRightOuterIconActionState(mn9Var.d ? ak9.a : bk9.a);
            if (mn9Var.e) {
                messageWriteWidget.C0().setText(charSequence);
            }
            messageWriteWidget.C0().setRightInnerIconVisible(false);
        }
        messageWriteWidget.J0().v(charSequence);
        messageWriteWidget.L0(mn9Var != null ? mn9Var.c : null);
        if (!dqi.r(sn0Var)) {
            if (sn0Var.e()) {
                messageWriteWidget.F0().setImageClickListener(null);
                return;
            }
            return;
        }
        messageWriteWidget.F0().setCounter((Integer) null);
        if (mn9Var != null && (azVar = mn9Var.c.d) != null) {
            str = azVar.c;
        }
        if (str != null && str.length() != 0) {
            messageWriteWidget.F0().setDrawOverlay(true);
        }
        messageWriteWidget.F0().setImageClickListener(new ro9(messageWriteWidget, 1));
    }

    public static final void z0(MessageWriteWidget messageWriteWidget, on9 on9Var) {
        qn9 qn9Var;
        Integer num;
        qn9 qn9Var2;
        sn9 sn9Var = on9Var != null ? on9Var.e : null;
        CharSequence charSequence = (on9Var == null || (qn9Var2 = on9Var.d) == null) ? null : qn9Var2.a;
        int iIntValue = (on9Var == null || (qn9Var = on9Var.d) == null || (num = qn9Var.b) == null) ? 0 : num.intValue();
        if ((on9Var != null ? on9Var.d : null) != null && !fni.a(messageWriteWidget.C0().getText(), charSequence)) {
            messageWriteWidget.C0().setText(charSequence);
            messageWriteWidget.C0().h(iIntValue);
        }
        messageWriteWidget.C0().setRightInnerIconVisible(sn9Var == null);
        messageWriteWidget.C0().setRightOuterIconActionState(sn9Var == null ? new yj9() : zj9.a);
        messageWriteWidget.L0(sn9Var);
    }

    public final void B0(boolean z) {
        if (isAttached()) {
            yy7[] yy7VarArr = L0;
            yy7 yy7Var = yy7VarArr[5];
            bbd bbdVar = this.B0;
            ((ViewGroup) bbdVar.D(this, yy7Var)).setClipChildren(z);
            ((ViewGroup) bbdVar.D(this, yy7VarArr[5])).setClipToPadding(z);
            yy7 yy7Var2 = yy7VarArr[1];
            bbd bbdVar2 = this.x0;
            ((FrameLayout) bbdVar2.D(this, yy7Var2)).setClipChildren(z);
            ((FrameLayout) bbdVar2.D(this, yy7VarArr[1])).setClipToPadding(z);
            H0().setClipChildren(z);
            H0().setClipToPadding(z);
            ViewParent parent = H0().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
            }
            ViewParent parent2 = H0().getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.setClipToPadding(z);
            }
            ViewParent parent3 = H0().getParent().getParent();
            ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(z);
            }
            ViewParent parent4 = H0().getParent().getParent();
            ViewGroup viewGroup4 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
            if (viewGroup4 != null) {
                viewGroup4.setClipToPadding(z);
            }
        }
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        fqf fqfVar;
        Object value;
        zpf zpfVar = (zpf) ue3.I(J0().K0.b());
        if (zpfVar == null || (fqfVar = zpfVar.b) == null) {
            return;
        }
        String str = (String) ue3.J(i, fqfVar.X);
        if (str != null) {
            mqf mqfVarJ0 = J0();
            fqf fqfVar2 = new fqf(fqfVar.a, fqfVar.b, fqfVar.c, str, fqfVar.o, fqfVar.X, fqfVar.Y);
            tcf tcfVar = mqfVarJ0.H0;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, fqfVar2));
        }
        J0().J0.setValue(null);
    }

    public final ik9 C0() {
        return (ik9) this.y0.D(this, L0[2]);
    }

    public final bl8 D0() {
        return (bl8) this.o.getValue();
    }

    public final qsb E0() {
        return (qsb) this.Z.getValue();
    }

    public final muc F0() {
        yy7 yy7Var = L0[4];
        return (muc) this.A0.getValue();
    }

    public final c83 G0() {
        return (c83) this.C0.D(this, L0[6]);
    }

    public final LinearLayout H0() {
        return (LinearLayout) this.w0.D(this, L0[0]);
    }

    public final no9 I0() {
        return (no9) this.a.getValue();
    }

    public final mqf J0() {
        return (mqf) this.b.getValue();
    }

    public final int K0() {
        boolean zC = E0().c(qsb.m);
        boolean zC2 = E0().c(qsb.h);
        return (zC || !zC2) ? (zC2 || !zC) ? pab.j : pab.d : pab.i;
    }

    public final void L0(sn9 sn9Var) {
        int i = this.K0;
        this.K0 = sn9Var != null ? sn9Var.a : 0;
        sn0 sn0Var = this.A0;
        if (sn9Var == null && dqi.r(sn0Var)) {
            F0().setVisibility(8);
            return;
        }
        if (sn9Var == null || dqi.r(sn0Var)) {
            if (sn9Var != null) {
                P0(F0(), sn9Var);
                C0().requestFocus();
                if (i != this.K0) {
                    C0().e(true);
                    return;
                }
                return;
            }
            return;
        }
        View viewRequireView = requireView();
        LinearLayout linearLayout = viewRequireView instanceof LinearLayout ? (LinearLayout) viewRequireView : null;
        if (linearLayout != null) {
            dqi.a(linearLayout, F0(), 0);
        }
        P0(F0(), sn9Var);
        F0().setVisibility(0);
        C0().requestFocus();
        C0().e(true);
    }

    public final void M0(CharSequence charSequence) {
        if ((charSequence == null || vmf.F(charSequence)) && !I0().w()) {
            return;
        }
        no9 no9VarI0 = I0();
        yy7[] yy7VarArr = no9.X0;
        no9VarI0.E(charSequence, false);
        C0().setText(null);
    }

    public final void O0(n5g n5gVar, boolean z) {
        muc mucVarF0 = F0();
        int i = 2;
        mucVarF0.getLocationOnScreen(new int[2]);
        WindowInsets rootWindowInsets = requireView().getRootWindowInsets();
        int i2 = 0;
        int i3 = rootWindowInsets != null ? g4i.h(null, rootWindowInsets).a.f(7).d : 0;
        int i4 = xz7.a;
        Point point = new Point(kti.d(6 * vw4.d().getDisplayMetrics().density), u45.q(4, vw4.d().getDisplayMetrics().density, F0().getHeight() + C0().getHeight() + i3 + (xz7.b(xz7.c) ? xz7.a(getContext()) : 0)));
        ncg ncgVar = this.G0;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        ncg ncgVar2 = new ncg(getContext(), mucVarF0, new oo9(this, i), (g31) null, 0, 1, 56);
        ncgVar2.c(n5gVar);
        ncgVar2.d(point, 8388691, z ? 2500L : 800L);
        ncgVar2.setOnDismissListener(new qo9(this, i2));
        this.G0 = ncgVar2;
    }

    public final void P0(muc mucVar, sn9 sn9Var) {
        Drawable drawableA;
        boolean z = sn9Var.c;
        Integer num = sn9Var.f;
        N0(mucVar, z);
        CharSequence charSequenceB = sn9Var.b.b(mucVar.getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        mucVar.setTitle(charSequenceB);
        mucVar.setAttachDescription(sn9Var.d);
        mucVar.setDrawOverlay(false);
        if (!sn9Var.g) {
            mucVar.setStartIconClickListener(null);
            mucVar.setStartIconDrawable(null);
            return;
        }
        if (num != null) {
            drawableA = f6j.a(mucVar.getContext(), num.intValue());
        } else {
            drawableA = null;
        }
        mucVar.setStartIconDrawable(drawableA);
        if (num == null || sn9Var.a != 3) {
            return;
        }
        no9 no9VarI0 = I0();
        pe8 pe8Var = (pe8) ((pb3) no9VarI0.c.getValue());
        if (!((Boolean) pe8Var.J0.D(pe8Var, pe8.U0[23])).booleanValue()) {
            no9VarI0.L0.m(null, qqg.a);
        }
        mucVar.setStartIconClickListener(new kg6(this, 18, sn9Var));
    }

    @Override // defpackage.wz7
    public final void V() {
        fk9 fk9Var = C0().d;
        fk9Var.setShowSoftInputOnFocus(true);
        fk9Var.setOnFocusChangeListener(null);
    }

    @Override // defpackage.wz7
    public final void k() {
        C0().e(false);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        po9 po9Var = new po9(this, 5);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(mab.y);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        po9Var.invoke(linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ncg ncgVar = this.G0;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        this.G0 = null;
        k();
        this.D0 = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        f7f f7fVar;
        f7f f7fVar2;
        int[] iArr2 = iArr;
        super.onRequestPermissionsResult(i, strArr, iArr);
        int i2 = 0;
        if (i == 160) {
            int length = iArr2.length;
            while (i2 < length) {
                if (iArr2[i2] == -1) {
                    qsb.s(E0(), new s2i(this, 1), strArr, iArr2, qsb.h, pab.b, pab.c, 192);
                    return;
                } else {
                    i2++;
                    iArr2 = iArr;
                }
            }
            return;
        }
        if (i != 181) {
            return;
        }
        int length2 = iArr2.length;
        while (i2 < length2) {
            if (iArr2[i2] == -1) {
                boolean zC = E0().c(qsb.h);
                k18 k18Var = this.s0;
                k18 k18Var2 = this.d;
                if (!zC && (f7fVar2 = (f7f) ((fed) k18Var2.getValue()).b.invoke()) != null) {
                    b9h b9hVar = (b9h) k18Var.getValue();
                    b9hVar.getClass();
                    b9h.a(b9hVar, 4, null, f7fVar2, null, y8h.MIC_PERMISSION, 0, 104);
                }
                if (!E0().c(qsb.m) && (f7fVar = (f7f) ((fed) k18Var2.getValue()).b.invoke()) != null) {
                    b9h b9hVar2 = (b9h) k18Var.getValue();
                    b9hVar2.getClass();
                    b9h.a(b9hVar2, 4, null, f7fVar, null, y8h.CAMERA_PERMISSION, 0, 104);
                }
                qsb.s(E0(), new s2i(this, 1), strArr, iArr2, qsb.q, K0(), pab.h, 192);
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r14v92, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        boolean z;
        d53 d53Var = I0().R0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        int i = 1;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new yo9(null, this, view), 1), getViewLifecycleScope());
        int i2 = 2;
        gw0.w(new g56(aw0.a(new z41(xz7.f, this.F0, new m31(3, null, 2), 3), getViewLifecycleOwner().p(), l38Var), new qp9(null, this), 1), getViewLifecycleScope());
        ik9 ik9VarC0 = C0();
        int i3 = 0;
        final po9 po9Var = new po9(this, i3);
        ik9VarC0.getClass();
        String[] strArr = {"image/webp", "image/jpeg", "image/png", "image/gif", "image/heic", "image/heif", "image/avif"};
        fk9 fk9Var = ik9VarC0.d;
        tva tvaVar = new tva() { // from class: vj9
            @Override // defpackage.tva
            public final f34 a(View view2, f34 f34Var) {
                c34 iv6Var;
                c34 iv6Var2;
                Pair pairCreate;
                e34 e34Var = f34Var.a;
                ClipData clipDataA = e34Var.a();
                Uri uri = null;
                if (clipDataA.getItemCount() == 1) {
                    boolean z2 = clipDataA.getItemAt(0).getUri() != null;
                    f34 f34Var2 = z2 ? f34Var : null;
                    if (z2) {
                        f34Var = null;
                    }
                    pairCreate = Pair.create(f34Var2, f34Var);
                } else {
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    for (int i4 = 0; i4 < clipDataA.getItemCount(); i4++) {
                        ClipData.Item itemAt = clipDataA.getItemAt(i4);
                        if (itemAt.getUri() != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(itemAt);
                        } else {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(itemAt);
                        }
                    }
                    Pair pairCreate2 = arrayList == null ? Pair.create(null, clipDataA) : arrayList2 == null ? Pair.create(clipDataA, null) : Pair.create(f34.a(clipDataA.getDescription(), arrayList), f34.a(clipDataA.getDescription(), arrayList2));
                    if (pairCreate2.first == null) {
                        pairCreate = Pair.create(null, f34Var);
                    } else if (pairCreate2.second == null) {
                        pairCreate = Pair.create(f34Var, null);
                    } else {
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            iv6Var = new iv6(f34Var);
                        } else {
                            d34 d34Var = new d34();
                            d34Var.b = e34Var.a();
                            d34Var.c = e34Var.h();
                            d34Var.d = e34Var.getFlags();
                            d34Var.o = e34Var.b();
                            d34Var.X = e34Var.getExtras();
                            iv6Var = d34Var;
                        }
                        iv6Var.e((ClipData) pairCreate2.first);
                        f34 f34VarBuild = iv6Var.build();
                        if (i5 >= 31) {
                            iv6Var2 = new iv6(f34Var);
                        } else {
                            d34 d34Var2 = new d34();
                            d34Var2.b = e34Var.a();
                            d34Var2.c = e34Var.h();
                            d34Var2.d = e34Var.getFlags();
                            d34Var2.o = e34Var.b();
                            d34Var2.X = e34Var.getExtras();
                            iv6Var2 = d34Var2;
                        }
                        iv6Var2.e((ClipData) pairCreate2.second);
                        pairCreate = Pair.create(f34VarBuild, iv6Var2.build());
                    }
                }
                f34 f34Var3 = (f34) pairCreate.first;
                f34 f34Var4 = (f34) pairCreate.second;
                if (f34Var3 != null) {
                    e34 e34Var2 = f34Var3.a;
                    if (e34Var2.a().getItemCount() > 0) {
                        uri = e34Var2.a().getItemAt(0).getUri();
                    }
                }
                if (uri != null) {
                    po9Var.invoke(uri);
                }
                return f34Var4;
            }
        };
        WeakHashMap weakHashMap = hfh.a;
        if (Build.VERSION.SDK_INT >= 31) {
            dfh.c(fk9Var, strArr, tvaVar);
        } else {
            int i4 = 0;
            while (true) {
                if (i4 >= 7) {
                    z = false;
                    break;
                } else {
                    if (strArr[i4].startsWith("*")) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            z5j.a("A MIME type set here must not start with *: " + Arrays.toString(strArr), !z);
            fk9Var.setTag(gzc.tag_on_receive_content_mime_types, strArr);
            fk9Var.setTag(gzc.tag_on_receive_content_listener, tvaVar);
        }
        mqf mqfVarJ0 = J0();
        mqfVarJ0.R0 = new ox3(mqfVarJ0, i2, this);
        gw0.w(new g56(aw0.a(C0().getMessageState(), getViewLifecycleOwner().p(), l38Var), new zo9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(C0().getMessagePosition(), new np9(null, this), 1), getViewLifecycleScope());
        int i5 = 12;
        gw0.w(new g56(aw0.a(new d53(J0().E0, i5), getViewLifecycleOwner().p(), l38Var), new ap9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(J0().K0, new op9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(J0().I0, i5), getViewLifecycleOwner().p(), l38Var), new bp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new d53(((fp8) this.c.getValue()).b, i5), new pp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(I0().E0, getViewLifecycleOwner().p(), l38Var), new cp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(I0().A0, getViewLifecycleOwner().p(), l38Var), new dp9(null, this), 1), getViewLifecycleScope());
        vpi.b(new g56(I0().U0, new mp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new jp9(I0().I0, this, i3), getViewLifecycleOwner().p(), l38Var), new ep9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new jp9(I0().K0, this, i), getViewLifecycleOwner().p(), l38Var), new fp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new jp9(I0().Q0, this, i2), getViewLifecycleOwner().p(), l38Var), new gp9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(I0().M0, i5), getViewLifecycleOwner().p(), l38Var), new so9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(I0().T0, i5), getViewLifecycleOwner().p(), l38Var), new to9(null, this), 1), getViewLifecycleScope());
        if (((Boolean) ((i9h) this.H0.getValue()).a.getValue()).booleanValue()) {
            gw0.w(new g56(aw0.a(I0().V0, getViewLifecycleOwner().p(), l38Var), new uo9(null, this), 1), getViewLifecycleScope());
        }
        gw0.w(new g56(aw0.a(((fed) this.d.getValue()).X, getViewLifecycleOwner().p(), l38Var), new vo9(null, this), 1), getViewLifecycleScope());
        if (((Boolean) this.J0.getValue()).booleanValue()) {
            gw0.w(new g56(aw0.a(D0().Y, getViewLifecycleOwner().p(), l38Var), new wo9(null, this), 1), getViewLifecycleScope());
            gw0.w(new g56(aw0.a(D0().Z, getViewLifecycleOwner().p(), l38Var), new xo9(null, this), 1), getViewLifecycleScope());
        }
    }

    public MessageWriteWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        Object objA = yvi.a(bundle, "arg_scope_id", b1e.class);
        if (objA != null) {
            this.a = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, no9.class, null);
            Object objA2 = yvi.a(bundle, "arg_scope_id", b1e.class);
            if (objA2 != null) {
                this.b = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA2)).a, mqf.class, null);
                Object objA3 = yvi.a(bundle, "arg_scope_id", b1e.class);
                if (objA3 != null) {
                    this.c = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA3)).a, fp8.class, null);
                    Object objA4 = yvi.a(bundle, "arg_scope_id", b1e.class);
                    if (objA4 != null) {
                        this.d = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA4)).a, fed.class, null);
                        this.o = createViewModelLazy(bl8.class, new iv8(11, new oo9(this, 0)));
                        o6i o6iVar = o6i.a;
                        this.X = (sd8) o6iVar.getAccessor().c(493);
                        this.Y = o6iVar.getAccessor().d(61);
                        this.Z = o6iVar.getAccessor().d(10);
                        this.s0 = o6iVar.getAccessor().d(161);
                        this.t0 = o6iVar.getAccessor().d(48);
                        this.u0 = o6iVar.getAccessor().d(500);
                        this.v0 = ipi.b(3, new oo9(this, 4));
                        this.w0 = viewBinding(mab.y);
                        this.x0 = viewBinding(mab.w);
                        this.y0 = viewBinding(zud.Z);
                        this.z0 = viewBinding(tzc.writebar__miui_menu);
                        this.A0 = binding(new oo9(this, 5));
                        int i = mab.x;
                        this.B0 = viewBinding(i);
                        this.C0 = childSlotRouter(i);
                        this.F0 = ucf.a(Boolean.FALSE);
                        this.H0 = o6iVar.getAccessor().d(499);
                        this.I0 = ipi.b(3, new oo9(this, 6));
                        this.J0 = ipi.b(3, new oo9(this, 7));
                        return;
                    }
                    throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
                }
                throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
            }
            throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
