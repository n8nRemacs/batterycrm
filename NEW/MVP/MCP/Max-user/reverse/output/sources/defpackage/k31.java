package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class k31 extends ConstraintLayout {
    public static final /* synthetic */ int U0 = 0;
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final jtd I0;
    public final jtd J0;
    public final jtd K0;
    public final jtd L0;
    public final jtd M0;
    public j31 N0;
    public ms8 O0;
    public ms8 P0;
    public ms8 Q0;
    public ncg R0;
    public ncg S0;
    public a71 T0;

    public k31(Context context) {
        super(context, null);
        this.F0 = ipi.b(3, new l(29));
        int iE = ctd.e(48);
        this.G0 = ipi.b(3, new f31(this, 1));
        this.H0 = ipi.b(3, new o40(context, 5));
        jtd jtdVar = new jtd(context, 0);
        jtdVar.setId(eyc.call_dinamic);
        jtdVar.setLayoutParams(new kt3(-2, -2));
        final int i = 0;
        jtdVar.setListener(new gtd(this) { // from class: i31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // defpackage.gtd
            public final void a() {
                j31 j31Var;
                j31 j31Var2;
                j31 j31Var3;
                int i2 = i;
                ms8 ms8Var = ms8.a;
                ms8 ms8Var2 = ms8.c;
                ms8 ms8Var3 = ms8.d;
                ms8 ms8Var4 = ms8.o;
                ms8 ms8Var5 = ms8.b;
                k31 k31Var = this.b;
                switch (i2) {
                    case 0:
                        k31.v(k31Var);
                        return;
                    case 1:
                        ms8 ms8Var6 = k31Var.O0;
                        if (ms8Var6 == null || (j31Var = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal = ms8Var6.ordinal();
                        if (iOrdinal == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                        callBottomPanelWidget.z0().w(ms8Var);
                        return;
                    case 2:
                        ms8 ms8Var7 = k31Var.Q0;
                        if (ms8Var7 == null || (j31Var2 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal2 = ms8Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal2 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((ao6) j31Var2).b;
                        yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
                        callBottomPanelWidget2.z0().x(ms8Var);
                        return;
                    case 3:
                        ms8 ms8Var8 = k31Var.P0;
                        if (ms8Var8 == null || (j31Var3 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal3 = ms8Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal3 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((ao6) j31Var3).b;
                        yy7[] yy7VarArr3 = CallBottomPanelWidget.Z;
                        w31 w31VarZ0 = callBottomPanelWidget3.z0();
                        w31VarZ0.getClass();
                        boolean z = ms8Var == ms8Var5;
                        yx1 yx1Var = (yx1) w31VarZ0.X.getValue();
                        String strV = w31VarZ0.c.v();
                        yx1Var.getClass();
                        yx1.d(yx1Var, "HAND_RAISED", strV, null, Long.valueOf(z ? 1L : 0L), null, null, false, 244);
                        ((v11) w31VarZ0.v().l).i(z);
                        return;
                    default:
                        j31 j31Var4 = k31Var.N0;
                        if (j31Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((ao6) j31Var4).b;
                            yy7[] yy7VarArr4 = CallBottomPanelWidget.Z;
                            w31 w31VarZ02 = callBottomPanelWidget4.z0();
                            wo1 wo1Var = w31VarZ02.c;
                            qv1 qv1VarV = w31VarZ02.v();
                            u1e u1eVar = qv1VarV.i;
                            u1eVar.getClass();
                            t1e t1eVar = ((e2e) ((d2e) u1eVar).t0.getValue()).b;
                            if (fni.a(t1eVar != null ? t1eVar.c : null, ((onb) ((dob) qv1VarV.d).z0.getValue()).a.a.getId())) {
                                xfh.r(wo1Var.L0, mm1.D);
                                return;
                            } else {
                                xfh.r(wo1Var.L0, hm1.D);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        jtdVar.setImageSize(new ftd(iE, iE));
        jtdVar.setButtonPadding(kti.c(vw4.c() * 3.5d));
        this.I0 = jtdVar;
        jtd jtdVar2 = new jtd(context, 0);
        jtdVar2.setId(eyc.call_microphone);
        jtdVar2.setLayoutParams(new kt3(-2, -2));
        final int i2 = 1;
        jtdVar2.setListener(new gtd(this) { // from class: i31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // defpackage.gtd
            public final void a() {
                j31 j31Var;
                j31 j31Var2;
                j31 j31Var3;
                int i22 = i2;
                ms8 ms8Var = ms8.a;
                ms8 ms8Var2 = ms8.c;
                ms8 ms8Var3 = ms8.d;
                ms8 ms8Var4 = ms8.o;
                ms8 ms8Var5 = ms8.b;
                k31 k31Var = this.b;
                switch (i22) {
                    case 0:
                        k31.v(k31Var);
                        return;
                    case 1:
                        ms8 ms8Var6 = k31Var.O0;
                        if (ms8Var6 == null || (j31Var = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal = ms8Var6.ordinal();
                        if (iOrdinal == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                        callBottomPanelWidget.z0().w(ms8Var);
                        return;
                    case 2:
                        ms8 ms8Var7 = k31Var.Q0;
                        if (ms8Var7 == null || (j31Var2 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal2 = ms8Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal2 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((ao6) j31Var2).b;
                        yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
                        callBottomPanelWidget2.z0().x(ms8Var);
                        return;
                    case 3:
                        ms8 ms8Var8 = k31Var.P0;
                        if (ms8Var8 == null || (j31Var3 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal3 = ms8Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal3 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((ao6) j31Var3).b;
                        yy7[] yy7VarArr3 = CallBottomPanelWidget.Z;
                        w31 w31VarZ0 = callBottomPanelWidget3.z0();
                        w31VarZ0.getClass();
                        boolean z = ms8Var == ms8Var5;
                        yx1 yx1Var = (yx1) w31VarZ0.X.getValue();
                        String strV = w31VarZ0.c.v();
                        yx1Var.getClass();
                        yx1.d(yx1Var, "HAND_RAISED", strV, null, Long.valueOf(z ? 1L : 0L), null, null, false, 244);
                        ((v11) w31VarZ0.v().l).i(z);
                        return;
                    default:
                        j31 j31Var4 = k31Var.N0;
                        if (j31Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((ao6) j31Var4).b;
                            yy7[] yy7VarArr4 = CallBottomPanelWidget.Z;
                            w31 w31VarZ02 = callBottomPanelWidget4.z0();
                            wo1 wo1Var = w31VarZ02.c;
                            qv1 qv1VarV = w31VarZ02.v();
                            u1e u1eVar = qv1VarV.i;
                            u1eVar.getClass();
                            t1e t1eVar = ((e2e) ((d2e) u1eVar).t0.getValue()).b;
                            if (fni.a(t1eVar != null ? t1eVar.c : null, ((onb) ((dob) qv1VarV.d).z0.getValue()).a.a.getId())) {
                                xfh.r(wo1Var.L0, mm1.D);
                                return;
                            } else {
                                xfh.r(wo1Var.L0, hm1.D);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        jtdVar2.setImageSize(new ftd(iE, iE));
        jtdVar2.setButtonPadding(kti.c(vw4.c() * 3.5d));
        this.J0 = jtdVar2;
        jtd jtdVar3 = new jtd(context, 0);
        jtdVar3.setId(eyc.call_video);
        jtdVar3.setLayoutParams(new kt3(-2, -2));
        jtd.B(jtdVar3, yud.N0);
        final int i3 = 2;
        jtdVar3.setListener(new gtd(this) { // from class: i31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // defpackage.gtd
            public final void a() {
                j31 j31Var;
                j31 j31Var2;
                j31 j31Var3;
                int i22 = i3;
                ms8 ms8Var = ms8.a;
                ms8 ms8Var2 = ms8.c;
                ms8 ms8Var3 = ms8.d;
                ms8 ms8Var4 = ms8.o;
                ms8 ms8Var5 = ms8.b;
                k31 k31Var = this.b;
                switch (i22) {
                    case 0:
                        k31.v(k31Var);
                        return;
                    case 1:
                        ms8 ms8Var6 = k31Var.O0;
                        if (ms8Var6 == null || (j31Var = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal = ms8Var6.ordinal();
                        if (iOrdinal == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                        callBottomPanelWidget.z0().w(ms8Var);
                        return;
                    case 2:
                        ms8 ms8Var7 = k31Var.Q0;
                        if (ms8Var7 == null || (j31Var2 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal2 = ms8Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal2 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((ao6) j31Var2).b;
                        yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
                        callBottomPanelWidget2.z0().x(ms8Var);
                        return;
                    case 3:
                        ms8 ms8Var8 = k31Var.P0;
                        if (ms8Var8 == null || (j31Var3 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal3 = ms8Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal3 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((ao6) j31Var3).b;
                        yy7[] yy7VarArr3 = CallBottomPanelWidget.Z;
                        w31 w31VarZ0 = callBottomPanelWidget3.z0();
                        w31VarZ0.getClass();
                        boolean z = ms8Var == ms8Var5;
                        yx1 yx1Var = (yx1) w31VarZ0.X.getValue();
                        String strV = w31VarZ0.c.v();
                        yx1Var.getClass();
                        yx1.d(yx1Var, "HAND_RAISED", strV, null, Long.valueOf(z ? 1L : 0L), null, null, false, 244);
                        ((v11) w31VarZ0.v().l).i(z);
                        return;
                    default:
                        j31 j31Var4 = k31Var.N0;
                        if (j31Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((ao6) j31Var4).b;
                            yy7[] yy7VarArr4 = CallBottomPanelWidget.Z;
                            w31 w31VarZ02 = callBottomPanelWidget4.z0();
                            wo1 wo1Var = w31VarZ02.c;
                            qv1 qv1VarV = w31VarZ02.v();
                            u1e u1eVar = qv1VarV.i;
                            u1eVar.getClass();
                            t1e t1eVar = ((e2e) ((d2e) u1eVar).t0.getValue()).b;
                            if (fni.a(t1eVar != null ? t1eVar.c : null, ((onb) ((dob) qv1VarV.d).z0.getValue()).a.a.getId())) {
                                xfh.r(wo1Var.L0, mm1.D);
                                return;
                            } else {
                                xfh.r(wo1Var.L0, hm1.D);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        jtdVar3.setImageSize(new ftd(iE, iE));
        jtdVar3.setButtonPadding(kti.c(vw4.c() * 3.5d));
        this.K0 = jtdVar3;
        jtd jtdVar4 = new jtd(context, 0);
        jtdVar4.setId(j0b.x0);
        jtdVar4.setLayoutParams(new kt3(-2, -2));
        jtd.B(jtdVar4, i0b.I);
        final int i4 = 3;
        jtdVar4.setListener(new gtd(this) { // from class: i31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // defpackage.gtd
            public final void a() {
                j31 j31Var;
                j31 j31Var2;
                j31 j31Var3;
                int i22 = i4;
                ms8 ms8Var = ms8.a;
                ms8 ms8Var2 = ms8.c;
                ms8 ms8Var3 = ms8.d;
                ms8 ms8Var4 = ms8.o;
                ms8 ms8Var5 = ms8.b;
                k31 k31Var = this.b;
                switch (i22) {
                    case 0:
                        k31.v(k31Var);
                        return;
                    case 1:
                        ms8 ms8Var6 = k31Var.O0;
                        if (ms8Var6 == null || (j31Var = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal = ms8Var6.ordinal();
                        if (iOrdinal == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                        callBottomPanelWidget.z0().w(ms8Var);
                        return;
                    case 2:
                        ms8 ms8Var7 = k31Var.Q0;
                        if (ms8Var7 == null || (j31Var2 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal2 = ms8Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal2 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((ao6) j31Var2).b;
                        yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
                        callBottomPanelWidget2.z0().x(ms8Var);
                        return;
                    case 3:
                        ms8 ms8Var8 = k31Var.P0;
                        if (ms8Var8 == null || (j31Var3 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal3 = ms8Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal3 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((ao6) j31Var3).b;
                        yy7[] yy7VarArr3 = CallBottomPanelWidget.Z;
                        w31 w31VarZ0 = callBottomPanelWidget3.z0();
                        w31VarZ0.getClass();
                        boolean z = ms8Var == ms8Var5;
                        yx1 yx1Var = (yx1) w31VarZ0.X.getValue();
                        String strV = w31VarZ0.c.v();
                        yx1Var.getClass();
                        yx1.d(yx1Var, "HAND_RAISED", strV, null, Long.valueOf(z ? 1L : 0L), null, null, false, 244);
                        ((v11) w31VarZ0.v().l).i(z);
                        return;
                    default:
                        j31 j31Var4 = k31Var.N0;
                        if (j31Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((ao6) j31Var4).b;
                            yy7[] yy7VarArr4 = CallBottomPanelWidget.Z;
                            w31 w31VarZ02 = callBottomPanelWidget4.z0();
                            wo1 wo1Var = w31VarZ02.c;
                            qv1 qv1VarV = w31VarZ02.v();
                            u1e u1eVar = qv1VarV.i;
                            u1eVar.getClass();
                            t1e t1eVar = ((e2e) ((d2e) u1eVar).t0.getValue()).b;
                            if (fni.a(t1eVar != null ? t1eVar.c : null, ((onb) ((dob) qv1VarV.d).z0.getValue()).a.a.getId())) {
                                xfh.r(wo1Var.L0, mm1.D);
                                return;
                            } else {
                                xfh.r(wo1Var.L0, hm1.D);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        jtdVar4.setImageSize(new ftd(iE, iE));
        jtdVar4.setButtonPadding(kti.c(vw4.c() * 3.5d));
        this.L0 = jtdVar4;
        jtd jtdVar5 = new jtd(context, 0);
        jtdVar5.setId(eyc.call_cancel);
        jtdVar5.setLayoutParams(new kt3(-2, -2));
        jtd.B(jtdVar5, i0b.W);
        jtdVar5.setAccessibility(Integer.valueOf(d3d.call_cancel_accessibility));
        final int i5 = 4;
        jtdVar5.setListener(new gtd(this) { // from class: i31
            public final /* synthetic */ k31 b;

            {
                this.b = this;
            }

            @Override // defpackage.gtd
            public final void a() {
                j31 j31Var;
                j31 j31Var2;
                j31 j31Var3;
                int i22 = i5;
                ms8 ms8Var = ms8.a;
                ms8 ms8Var2 = ms8.c;
                ms8 ms8Var3 = ms8.d;
                ms8 ms8Var4 = ms8.o;
                ms8 ms8Var5 = ms8.b;
                k31 k31Var = this.b;
                switch (i22) {
                    case 0:
                        k31.v(k31Var);
                        return;
                    case 1:
                        ms8 ms8Var6 = k31Var.O0;
                        if (ms8Var6 == null || (j31Var = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal = ms8Var6.ordinal();
                        if (iOrdinal == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
                        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
                        callBottomPanelWidget.z0().w(ms8Var);
                        return;
                    case 2:
                        ms8 ms8Var7 = k31Var.Q0;
                        if (ms8Var7 == null || (j31Var2 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal2 = ms8Var7.ordinal();
                        if (iOrdinal2 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal2 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((ao6) j31Var2).b;
                        yy7[] yy7VarArr2 = CallBottomPanelWidget.Z;
                        callBottomPanelWidget2.z0().x(ms8Var);
                        return;
                    case 3:
                        ms8 ms8Var8 = k31Var.P0;
                        if (ms8Var8 == null || (j31Var3 = k31Var.N0) == null) {
                            return;
                        }
                        int iOrdinal3 = ms8Var8.ordinal();
                        if (iOrdinal3 == 0) {
                            ms8Var = ms8Var5;
                        } else if (iOrdinal3 != 1) {
                            if (iOrdinal3 == 2) {
                                ms8Var = ms8Var2;
                            } else if (iOrdinal3 == 3) {
                                ms8Var = ms8Var3;
                            } else {
                                if (iOrdinal3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ms8Var = ms8Var4;
                            }
                        }
                        CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((ao6) j31Var3).b;
                        yy7[] yy7VarArr3 = CallBottomPanelWidget.Z;
                        w31 w31VarZ0 = callBottomPanelWidget3.z0();
                        w31VarZ0.getClass();
                        boolean z = ms8Var == ms8Var5;
                        yx1 yx1Var = (yx1) w31VarZ0.X.getValue();
                        String strV = w31VarZ0.c.v();
                        yx1Var.getClass();
                        yx1.d(yx1Var, "HAND_RAISED", strV, null, Long.valueOf(z ? 1L : 0L), null, null, false, 244);
                        ((v11) w31VarZ0.v().l).i(z);
                        return;
                    default:
                        j31 j31Var4 = k31Var.N0;
                        if (j31Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((ao6) j31Var4).b;
                            yy7[] yy7VarArr4 = CallBottomPanelWidget.Z;
                            w31 w31VarZ02 = callBottomPanelWidget4.z0();
                            wo1 wo1Var = w31VarZ02.c;
                            qv1 qv1VarV = w31VarZ02.v();
                            u1e u1eVar = qv1VarV.i;
                            u1eVar.getClass();
                            t1e t1eVar = ((e2e) ((d2e) u1eVar).t0.getValue()).b;
                            if (fni.a(t1eVar != null ? t1eVar.c : null, ((onb) ((dob) qv1VarV.d).z0.getValue()).a.a.getId())) {
                                xfh.r(wo1Var.L0, mm1.D);
                                return;
                            } else {
                                xfh.r(wo1Var.L0, hm1.D);
                                return;
                            }
                        }
                        return;
                }
            }
        });
        jtdVar5.setMode(etd.c);
        jtdVar5.setImageSize(new ftd(iE, iE));
        jtdVar5.setButtonPadding(kti.c(vw4.c() * 3.5d));
        this.M0 = jtdVar5;
        kt3 kt3Var = new kt3(0, -2);
        float f = 8;
        kt3Var.setMarginStart(kti.d(vw4.c() * f));
        kt3Var.setMarginEnd(kti.d(vw4.c() * f));
        setLayoutParams(kt3Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        setPadding(kti.d(vw4.c() * f), ctd.e(f), ctd.e(f), kti.d(vw4.c() * 12));
        addView(jtdVar);
        addView(jtdVar2);
        addView(jtdVar3);
        addView(jtdVar4);
        addView(jtdVar5);
        ut3 ut3VarG = l5j.g(this);
        int id = jtdVar.getId();
        ut3VarG.d(id, 4, jtdVar3.getId(), 4);
        ut3VarG.d(id, 7, jtdVar2.getId(), 6);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, jtdVar3.getId(), 3);
        ut3VarG.g(id).d.V = 1;
        int id2 = jtdVar2.getId();
        ut3VarG.d(id2, 4, jtdVar3.getId(), 4);
        ut3VarG.d(id2, 7, jtdVar3.getId(), 6);
        ut3VarG.d(id2, 6, jtdVar.getId(), 7);
        ut3VarG.d(id2, 3, jtdVar3.getId(), 3);
        int id3 = jtdVar3.getId();
        ut3VarG.d(id3, 4, 0, 4);
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 7, jtdVar4.getId(), 6);
        ut3VarG.d(id3, 6, jtdVar2.getId(), 7);
        int id4 = jtdVar4.getId();
        ut3VarG.d(id4, 4, jtdVar3.getId(), 4);
        ut3VarG.d(id4, 6, jtdVar3.getId(), 7);
        ut3VarG.d(id4, 7, jtdVar5.getId(), 6);
        ut3VarG.d(id4, 3, jtdVar3.getId(), 3);
        int id5 = jtdVar5.getId();
        ut3VarG.d(id5, 4, jtdVar3.getId(), 4);
        ut3VarG.d(id5, 7, 0, 7);
        ut3VarG.d(id5, 6, jtdVar4.getId(), 7);
        ut3VarG.d(id5, 3, jtdVar3.getId(), 3);
        ut3VarG.a(this);
    }

    private final int getActualButtonsMargin() {
        return (this.M0.getVisibility() == 0 && this.L0.getVisibility() == 0 && this.K0.getVisibility() == 0 && this.J0.getVisibility() == 0 && this.I0.getVisibility() == 0) ? ctd.e(2) : ctd.e(4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final float[] getBgRadius() {
        return (float[]) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final View getContainer() {
        return (View) this.G0.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return kti.d(vw4.c() * 6) + measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final qz9 getMicrophoneOnDrawable() {
        return (qz9) this.H0.getValue();
    }

    public static void v(k31 k31Var) {
        j31 j31Var;
        Object next;
        List<CallsAudioDeviceInfo> availableAudioDevices;
        if (k31Var.T0 == null || (j31Var = k31Var.N0) == null) {
            return;
        }
        View container = k31Var.getContainer();
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((ao6) j31Var).b;
        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
        qv1 qv1VarV = callBottomPanelWidget.z0().v();
        w21 w21Var = (w21) qv1VarV.b;
        CallsAudioManager callsAudioManager = (CallsAudioManager) w21Var.c.get();
        Set setH0 = (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null) ? rd5.a : ue3.h0(availableAudioDevices);
        if (setH0.isEmpty()) {
            return;
        }
        if (setH0.size() >= 3) {
            y34 y34VarF = h6j.a(1).j().B(container).f();
            ArrayList arrayListU = callBottomPanelWidget.z0().u();
            ArrayList arrayList = new ArrayList(we3.q(arrayListU, 10));
            Iterator it = arrayListU.iterator();
            while (it.hasNext()) {
                a71 a71Var = (a71) it.next();
                arrayList.add(new b44(a71Var.getId(), a71Var.getTitle(), Integer.valueOf(w9b.X), Integer.valueOf(a71Var.getIcon()), Integer.valueOf(w9b.R)));
            }
            z34 z34VarBuild = y34VarF.o(arrayList).build();
            callBottomPanelWidget.X = z34VarBuild;
            z34VarBuild.u(callBottomPanelWidget);
            return;
        }
        CallsAudioDeviceInfo callsAudioDeviceInfoB = w21Var.b();
        Iterator it2 = setH0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((CallsAudioDeviceInfo) next).getDeviceType() != callsAudioDeviceInfoB.getDeviceType()) {
                    break;
                }
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) next;
        if (callsAudioDeviceInfo != null) {
            callsAudioDeviceInfoB = callsAudioDeviceInfo;
        }
        qv1VarV.l(callsAudioDeviceInfoB);
    }

    public static void x(jtd jtdVar, int i) {
        ViewGroup.LayoutParams layoutParams = jtdVar.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) == i) {
            ViewGroup.LayoutParams layoutParams2 = jtdVar.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) == i) {
                return;
            }
        }
        if (jtdVar.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams3 = jtdVar.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            jtdVar.setLayoutParams(marginLayoutParams);
        }
    }

    public static void z(jtd jtdVar, Drawable drawable, Drawable drawable2, ms8 ms8Var, s5g s5gVar, s5g s5gVar2) {
        v1a v1aVar = a93.s0;
        jtdVar.setVisibility(ms8Var != ms8.d ? 0 : 8);
        int iOrdinal = ms8Var.ordinal();
        if (iOrdinal == 0) {
            jtdVar.A(drawable2, v1aVar.B(jtdVar).c.getIcon().g);
            jtdVar.setMode(etd.d);
            jtdVar.setAccessibility(s5gVar2);
            return;
        }
        etd etdVar = etd.Z;
        if (iOrdinal == 1) {
            yeb yebVar = v1aVar.B(jtdVar).c;
            jtdVar.A(drawable, -1);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(s5gVar);
            return;
        }
        if (iOrdinal == 2) {
            jtdVar.A(drawable2, v1aVar.B(jtdVar).c.getIcon().g);
            jtdVar.setMode(etd.X);
            jtdVar.setAccessibility(s5gVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            jtdVar.A(drawable2, v1aVar.B(jtdVar).c.getIcon().c);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(s5gVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H0.e() && this.O0 == ms8.b) {
            getMicrophoneOnDrawable().start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.H0.e()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(a71 a71Var) {
        if (fni.a(this.T0, a71Var)) {
            return;
        }
        this.T0 = a71Var;
        int iA = a71Var.a();
        s5g contentDescription = a71Var.getContentDescription();
        Drawable drawableB = r34.b(getContext(), iA);
        z(this.I0, drawableB, drawableB, a71Var instanceof x61 ? ms8.a : ms8.b, contentDescription, contentDescription);
    }

    public final void setClickListener(j31 j31Var) {
        this.N0 = j31Var;
    }

    public final void setMicrophoneEnabled(ms8 ms8Var) {
        if (this.O0 == ms8Var) {
            return;
        }
        this.O0 = ms8Var;
        z(this.J0, getMicrophoneOnDrawable(), r34.b(getContext(), i0b.S).mutate(), ms8Var, new n5g(d3d.call_microphone_enabled_accessibility), new n5g(d3d.call_microphone_disabled_accessibility));
        if (ms8Var == ms8.b) {
            getMicrophoneOnDrawable().start();
        } else {
            getMicrophoneOnDrawable().stop();
        }
    }

    public final void setRaiseHand(ms8 ms8Var) {
        ms8 ms8Var2;
        ncg ncgVar;
        v1a v1aVar = a93.s0;
        ms8 ms8Var3 = this.P0;
        if (ms8Var3 == ms8Var) {
            return;
        }
        if (ms8Var3 != null && ms8Var3 == (ms8Var2 = ms8.b) && ms8Var != ms8Var2 && (ncgVar = this.S0) != null) {
            ncgVar.a();
        }
        this.P0 = ms8Var;
        int i = i0b.I;
        Drawable drawableMutate = r34.b(getContext(), i).mutate();
        Drawable drawableMutate2 = r34.b(getContext(), i).mutate();
        n5g n5gVar = new n5g(d3d.call_raise_hand_enabled_accessibility);
        n5g n5gVar2 = new n5g(d3d.call_raise_hand_disabled_accessibility);
        int i2 = ms8Var != ms8.d ? 0 : 8;
        jtd jtdVar = this.L0;
        jtdVar.setVisibility(i2);
        int iOrdinal = ms8Var.ordinal();
        etd etdVar = etd.Z;
        if (iOrdinal == 0) {
            yeb yebVar = v1aVar.B(jtdVar).c;
            jtdVar.A(drawableMutate2, -1);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(n5gVar2);
        } else if (iOrdinal == 1) {
            yeb yebVar2 = v1aVar.B(jtdVar).c;
            jtdVar.A(drawableMutate, -1);
            jtdVar.setMode(etd.Y);
            jtdVar.setAccessibility(n5gVar);
        } else if (iOrdinal == 2) {
            jtdVar.A(drawableMutate2, v1aVar.B(jtdVar).c.getIcon().g);
            jtdVar.setMode(etd.X);
            jtdVar.setAccessibility(n5gVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            jtdVar.A(drawableMutate2, v1aVar.B(jtdVar).c.getIcon().c);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(n5gVar2);
        }
        int actualButtonsMargin = getActualButtonsMargin();
        x(this.M0, actualButtonsMargin);
        x(jtdVar, actualButtonsMargin);
        x(this.K0, actualButtonsMargin);
        x(this.J0, actualButtonsMargin);
        x(this.I0, actualButtonsMargin);
    }

    public final void setVideoEnabled(ms8 ms8Var) {
        if (this.Q0 == ms8Var) {
            return;
        }
        this.Q0 = ms8Var;
        z(this.K0, r34.b(getContext(), i0b.u0).mutate(), r34.b(getContext(), i0b.s0).mutate(), ms8Var, new n5g(d3d.call_video_enabled_accessibility), new n5g(d3d.call_video_disabled_accessibility));
    }

    public final void setVolumeMicrophone(float f) {
        qz9 microphoneOnDrawable = getMicrophoneOnDrawable();
        ObjectAnimator objectAnimator = microphoneOnDrawable.Y;
        float fB = n7j.b(f, 0.0f, 1.0f);
        if (microphoneOnDrawable.s0 == fB) {
            return;
        }
        microphoneOnDrawable.s0 = fB;
        gg ggVar = microphoneOnDrawable.X;
        objectAnimator.setValues(PropertyValuesHolder.ofFloat(ggVar, ggVar.a, fB));
        objectAnimator.start();
        microphoneOnDrawable.invalidateSelf();
    }

    public final ncg w(ncg ncgVar, jtd jtdVar, n5g n5gVar, cm6 cm6Var, Integer num) {
        int[] iArr = new int[2];
        jtdVar.getLocationOnScreen(iArr);
        Point point = new Point((iArr[0] - (jtdVar.getWidth() / 2)) - kti.d(vw4.c() * 12), getContextHeight());
        if (ncgVar != null && ncgVar.isShowing()) {
            ncgVar.d(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            return ncgVar;
        }
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        int i = 0;
        ncg ncgVar2 = new ncg(getContext(), jtdVar, new f31(this, i), new g31(i), 0, 0, 96);
        ncgVar2.c(n5gVar);
        int i2 = num != null ? 0 : 8;
        ImageView imageView = ncgVar2.Y;
        imageView.setVisibility(i2);
        cm6 cm6Var2 = ncgVar2.d;
        imageView.setImageTintList(cm6Var2 != null ? ColorStateList.valueOf(((Number) cm6Var2.invoke()).intValue()) : null);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        TextView textView = ncgVar2.Z;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = num != null ? kti.d(8 * vw4.d().getDisplayMetrics().density) : 0;
        textView.setLayoutParams(marginLayoutParams);
        ncgVar2.d(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        ncgVar2.setOnDismissListener(new h31(0, cm6Var));
        return ncgVar2;
    }
}
