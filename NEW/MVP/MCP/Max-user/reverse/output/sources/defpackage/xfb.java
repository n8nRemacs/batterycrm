package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class xfb extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ yfb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfb(yfb yfbVar, int i, boolean z) {
        super(12, (Object) null);
        this.c = i;
        this.d = yfbVar;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        OneMeButton oneMeButton;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        switch (this.c) {
            case 0:
                yeb yebVarY = (yeb) obj2;
                if (fni.a((yeb) obj, yebVarY)) {
                    return;
                }
                yfb yfbVar = this.d;
                if (yebVarY == null) {
                    yebVarY = a93.s0.y(yfbVar);
                }
                yfbVar.onThemeChanged(yebVarY);
                return;
            case 1:
                if (((qfb) obj) != ((qfb) obj2)) {
                    yfb yfbVar2 = this.d;
                    yfbVar2.m();
                    yfbVar2.l();
                    if (yfbVar2.h()) {
                        return;
                    }
                    yfbVar2.requestLayout();
                    return;
                }
                return;
            case 2:
                ofb ofbVar = (ofb) obj2;
                if (fni.a((ofb) obj, ofbVar)) {
                    return;
                }
                yfb yfbVar3 = this.d;
                yfb.d(yfbVar3, ofbVar);
                yfbVar3.l();
                if (yfbVar3.h()) {
                    return;
                }
                yfbVar3.requestLayout();
                return;
            case 3:
                final mfb mfbVar = (mfb) obj2;
                mfb mfbVar2 = (mfb) obj;
                yfb yfbVar4 = this.d;
                if ((yfbVar4.getForm() == qfb.a || yfbVar4.getForm() == qfb.c) && !fni.a(mfbVar2, mfbVar)) {
                    yfbVar4.removeView(yfbVar4.z0);
                    Context context = yfbVar4.getContext();
                    yeb customTheme = yfbVar4.getCustomTheme();
                    OneMeButton oneMeButton2 = null;
                    if (mfbVar instanceof gfb) {
                        oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(yud.f0));
                        final int i = 0;
                        f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: ccg
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i) {
                                    case 0:
                                        ((gfb) mfbVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((hfb) mfbVar).a.invoke(view);
                                        break;
                                    default:
                                        ((kfb) mfbVar).a.b.invoke(view);
                                        break;
                                }
                            }
                        });
                    } else if (mfbVar instanceof hfb) {
                        oneMeButton = new OneMeButton(context, null);
                        oneMeButton.setCustomTheme(customTheme);
                        oneMeButton.d(Integer.valueOf(yud.s0));
                        final int i2 = 1;
                        f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: ccg
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        ((gfb) mfbVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((hfb) mfbVar).a.invoke(view);
                                        break;
                                    default:
                                        ((kfb) mfbVar).a.b.invoke(view);
                                        break;
                                }
                            }
                        });
                    } else if (mfbVar instanceof kfb) {
                        rfb rfbVar = ((kfb) mfbVar).a;
                        OneMeButton oneMeButton3 = new OneMeButton(context, null);
                        oneMeButton3.setCustomTheme(customTheme);
                        oneMeButton3.d(Integer.valueOf(rfbVar.a));
                        final int i3 = 2;
                        f8j.d(oneMeButton3, 300L, new View.OnClickListener() { // from class: ccg
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        ((gfb) mfbVar).a.invoke(view);
                                        break;
                                    case 1:
                                        ((hfb) mfbVar).a.invoke(view);
                                        break;
                                    default:
                                        ((kfb) mfbVar).a.b.invoke(view);
                                        break;
                                }
                            }
                        });
                        oneMeButton = oneMeButton3;
                    } else {
                        if (!(mfbVar instanceof jfb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oneMeButton = null;
                    }
                    if (oneMeButton != null) {
                        oneMeButton.setId(zud.Q);
                        oneMeButton2 = oneMeButton;
                    }
                    yfbVar4.z0 = oneMeButton2;
                    if (oneMeButton2 != null) {
                        yfbVar4.addView(oneMeButton2);
                        jfi.a(oneMeButton2, kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
                    }
                    yfbVar4.l();
                    if (yfbVar4.h()) {
                        return;
                    }
                    yfbVar4.requestLayout();
                    return;
                }
                return;
            case 4:
                imb imbVar = (imb) obj2;
                yfb yfbVar5 = this.d;
                int iOrdinal = yfbVar5.getForm().ordinal();
                if (iOrdinal == 0) {
                    iIntValue = imbVar != null ? ((Number) imbVar.a).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
                    iIntValue2 = imbVar != null ? ((Number) imbVar.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iIntValue3 = imbVar != null ? ((Number) imbVar.a).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density);
                        iIntValue2 = imbVar != null ? ((Number) imbVar.b).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density);
                        yfbVar5.setPadding(iIntValue3, 0, iIntValue2, 0);
                        return;
                    }
                    iIntValue = imbVar != null ? ((Number) imbVar.a).intValue() : kti.d(16 * vw4.d().getDisplayMetrics().density);
                    iIntValue2 = imbVar != null ? ((Number) imbVar.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
                }
                iIntValue3 = iIntValue;
                yfbVar5.setPadding(iIntValue3, 0, iIntValue2, 0);
                return;
            default:
                yfb yfbVar6 = this.d;
                ?? r1 = yfbVar6.u0;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    yfbVar6.l();
                }
                if (r1.e()) {
                    iwe iweVar = (iwe) r1.getValue();
                    ewe eweVar = iweVar.b;
                    if (!zBooleanValue) {
                        eweVar.d();
                        iweVar.c = false;
                        iweVar.invalidate();
                        return;
                    } else {
                        iweVar.c = true;
                        if (zBooleanValue) {
                            eweVar.c();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfb(yfb yfbVar, int i) {
        super(12, qfb.a);
        this.c = i;
        switch (i) {
            case 2:
                this.d = yfbVar;
                super(12, jfb.a);
                break;
            case 3:
                this.d = yfbVar;
                super(12, jfb.a);
                break;
            case 4:
            default:
                this.d = yfbVar;
                break;
            case 5:
                Boolean bool = Boolean.FALSE;
                this.d = yfbVar;
                super(12, bool);
                break;
        }
    }
}
