package one.me.calls.ui.ui.incoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bsb;
import defpackage.bwf;
import defpackage.e51;
import defpackage.eb1;
import defpackage.eyc;
import defpackage.fb1;
import defpackage.fm1;
import defpackage.g51;
import defpackage.g56;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.hb1;
import defpackage.ho7;
import defpackage.i6;
import defpackage.ipi;
import defpackage.j2e;
import defpackage.jva;
import defpackage.k18;
import defpackage.l38;
import defpackage.lb1;
import defpackage.ln;
import defpackage.m0b;
import defpackage.m3;
import defpackage.mb1;
import defpackage.mfh;
import defpackage.ms8;
import defpackage.nha;
import defpackage.o27;
import defpackage.q;
import defpackage.qsb;
import defpackage.rs1;
import defpackage.rsb;
import defpackage.rt5;
import defpackage.s2i;
import defpackage.ss1;
import defpackage.tcf;
import defpackage.toc;
import defpackage.tv1;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vs1;
import defpackage.wqi;
import defpackage.yy7;
import defpackage.z44;
import defpackage.zo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Lnha;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "v1a", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallIncomingScreen extends Widget implements nha, j2e {
    public static final v1a s0;
    public static final /* synthetic */ yy7[] t0;
    public final k18 X;
    public final Object Y;
    public final k18 Z;
    public final tv1 a;
    public final bsb b;
    public final k18 c;
    public final bbd d;
    public final k18 o;

    static {
        toc tocVar = new toc(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0);
        vid.a.getClass();
        t0 = new yy7[]{tocVar};
        s0 = new v1a(15);
    }

    public CallIncomingScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        e51 e51Var = e51.a;
        this.a = e51Var.b();
        rsb rsbVar = rsb.a;
        this.b = new bsb(rsbVar.a());
        this.c = createViewModelLazy(mb1.class, new q(14, new m3(bundle, this, 11)));
        this.d = viewBinding(eyc.call_incoming_avatar);
        this.o = rsbVar.a();
        this.X = fm1.c();
        this.Y = ipi.b(3, new i6(24, this));
        this.Z = e51Var.getAccessor().d(26);
        gu5 gu5Var = (gu5) ((rt5) ((bwf) fm1.d()).getValue());
        if (((Boolean) gu5Var.K.D(gu5Var, gu5.S[25])).booleanValue()) {
            this.lifecycleOwner.p().a(new o27(rsbVar.a(), e51Var.getAccessor().d(26), this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y0(one.me.calls.ui.ui.incoming.CallIncomingScreen r17) {
        /*
            r0 = r17
            mb1 r1 = r0.A0()
            r2 = 1
            r1.u0 = r2
            tv1 r1 = r0.a
            bsb r3 = r0.b
            java.lang.Object r4 = r0.Y
            java.lang.Object r4 = r4.getValue()
            r6 = r4
            s2i r6 = (defpackage.s2i) r6
            qsb r4 = r3.b()
            java.lang.String[] r7 = defpackage.qsb.j
            boolean r4 = r4.c(r7)
            r16 = 0
            if (r4 == 0) goto L27
        L24:
            r3 = r16
            goto L89
        L27:
            qsb r4 = r3.b()
            java.lang.String[] r5 = defpackage.qsb.h
            boolean r4 = r4.c(r5)
            if (r4 == 0) goto L51
            qsb r4 = r3.b()
            java.lang.String[] r8 = defpackage.qsb.m
            boolean r4 = r4.c(r8)
            if (r4 != 0) goto L51
            qsb r4 = r3.b()
            boolean r4 = r4.c(r8)
            if (r4 != 0) goto L24
            qsb r3 = r3.b()
            r3.m(r6)
            goto L88
        L51:
            qsb r4 = r3.b()
            boolean r4 = r4.c(r5)
            if (r4 != 0) goto L6c
            qsb r4 = r3.b()
            java.lang.String[] r5 = defpackage.qsb.m
            boolean r4 = r4.c(r5)
            if (r4 == 0) goto L6c
            boolean r3 = r3.c(r6)
            goto L89
        L6c:
            qsb r5 = r3.b()
            r5.getClass()
            int r11 = defpackage.i4d.permissions_calls_audio_video_request_title
            int r10 = defpackage.i4d.permissions_calls_audio_video_request
            wrb r13 = new wrb
            int r3 = defpackage.y9b.c
            r13.<init>(r3)
            r14 = 0
            r15 = 320(0x140, float:4.48E-43)
            r8 = 182(0xb6, float:2.55E-43)
            r9 = 0
            r12 = 0
            defpackage.qsb.f(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L88:
            r3 = r2
        L89:
            if (r3 == 0) goto La8
            k18 r3 = r0.X
            java.lang.Object r3 = r3.getValue()
            yx1 r3 = (defpackage.yx1) r3
            hw1 r1 = (defpackage.hw1) r1
            mb4 r4 = r1.l()
            java.lang.String r4 = r4.c
            mb4 r1 = r1.l()
            boolean r1 = r1.i
            java.lang.String r5 = "BEFORE_JOIN"
            r3.g(r4, r5, r1)
            r16 = r2
        La8:
            if (r16 == 0) goto Lab
            return
        Lab:
            mb1 r0 = r0.A0()
            r0.t(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.incoming.CallIncomingScreen.y0(one.me.calls.ui.ui.incoming.CallIncomingScreen):void");
    }

    public final mb1 A0() {
        return (mb1) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g51 g51Var = new g51(layoutInflater.getContext(), null);
        g51Var.setId(eyc.call_screen_incoming_container_id);
        g51Var.setBackgroundColor(a93.s0.B(g51Var).c.b().l);
        vs1 vs1Var = new vs1(g51Var.getContext(), 0);
        vs1Var.setId(eyc.call_incoming_avatar);
        vs1Var.setMode(rs1.a);
        vs1Var.setBackgroundState(ss1.b);
        vs1Var.setListener(new eb1(this));
        g51Var.addView(vs1Var, -1, -1);
        return g51Var;
    }

    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        zo1 zo1Var = (zo1) this.Z.getValue();
        ln lnVarRequireActivity = requireActivity();
        zo1Var.getClass();
        zo1.d(lnVarRequireActivity);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        int iOrdinal = ((lb1) A0().Z.getValue()).ordinal();
        if (iOrdinal == 0) {
            if (i == 160 && qsb.s((qsb) this.o.getValue(), (s2i) this.Y.getValue(), strArr, iArr, qsb.h, m0b.F, m0b.E, 192)) {
                A0().t(false);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z0(i, strArr, iArr);
            return;
        }
        String name = CallIncomingScreen.class.getName();
        StringBuilder sbM = ho7.m(i, "incoming call permission strategy 1: requestCode=", " permissions=");
        sbM.append(strArr);
        sbM.append(" grantResults=");
        sbM.append(iArr);
        wqi.c(name, sbM.toString(), new Object[0]);
        bsb bsbVar = this.b;
        bsbVar.getClass();
        if (i == 160 || i == 182 || i == 159 || i == 183) {
            if (i == 183 && bsbVar.b().c(qsb.m)) {
                A0().u(true);
            } else {
                z0(i, strArr, iArr);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        mfh.g(requireActivity(), true);
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, 2));
        }
        gw0.w(new g56(aw0.a(A0().t0, getViewLifecycleOwner().p(), l38.d), new fb1(null, this), 1), getViewLifecycleScope());
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    public final void z0(int i, String[] strArr, int[] iArr) {
        boolean zS;
        Object value;
        String name = CallIncomingScreen.class.getName();
        StringBuilder sbM = ho7.m(i, "incoming call permission strategy 2: requestCode=", " permissions=");
        sbM.append(strArr);
        sbM.append(" grantResults=");
        sbM.append(iArr);
        wqi.c(name, sbM.toString(), new Object[0]);
        bsb bsbVar = this.b;
        bsbVar.getClass();
        if (i == 160 || i == 182 || i == 159) {
            qsb qsbVarB = bsbVar.b();
            String[] strArr2 = qsb.h;
            if (qsbVarB.c(strArr2)) {
                zS = true;
            } else {
                boolean z = i == 182 && !bsbVar.b().c(qsb.m);
                zS = qsb.s((qsb) this.o.getValue(), (s2i) this.Y.getValue(), strArr, iArr, strArr2, z ? m0b.D : m0b.F, z ? m0b.C : m0b.E, 192);
            }
            boolean z2 = bsbVar.b().c(qsb.m) && ((i == 182 || i == 159) || A0().u0);
            if (zS) {
                A0().t(z2);
                return;
            }
            if (z2) {
                mb1 mb1VarA0 = A0();
                Object value2 = mb1VarA0.t0.getValue();
                hb1 hb1Var = value2 instanceof hb1 ? (hb1) value2 : null;
                if (hb1Var == null) {
                    return;
                }
                tcf tcfVar = mb1VarA0.s0;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, hb1.a(hb1Var, null, mb1VarA0.X.a(true) == ms8.b, null, null, 125)));
            }
        }
    }
}
