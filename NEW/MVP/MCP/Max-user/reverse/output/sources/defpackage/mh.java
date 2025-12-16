package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.InflateException;

/* loaded from: classes2.dex */
public final class mh {
    public static final s6b c = new s6b(4);
    public final Context a;
    public final Resources b;

    public mh(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01eb, code lost:
    
        if (r23 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ed, code lost:
    
        if (r6 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ef, code lost:
    
        if (r24 != 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f1, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r23.playTogether((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0205, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0206, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r23.playSequentially((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021a, code lost:
    
        return r7;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.content.res.XmlResourceParser r22, android.animation.AnimatorSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh.a(android.content.res.XmlResourceParser, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public final void b(ValueAnimator valueAnimator, XmlResourceParser xmlResourceParser) {
        sh nhVar;
        String str;
        String str2;
        dh dhVar = dh.d;
        Context context = this.a;
        valueAnimator.setInterpolator((TimeInterpolator) dhVar.G(context, xmlResourceParser));
        valueAnimator.setDuration(((Number) ch.o.G(context, xmlResourceParser)).longValue());
        valueAnimator.setStartDelay(((Number) ch.v0.G(context, xmlResourceParser)).longValue());
        valueAnimator.setRepeatCount(((Number) ch.t0.G(context, xmlResourceParser)).intValue());
        valueAnimator.setRepeatMode(((Number) ch.u0.G(context, xmlResourceParser)).intValue());
        String str3 = (String) ch.Y.G(context, xmlResourceParser);
        sh shVar = (sh) fh.d.G(context, xmlResourceParser);
        sh shVar2 = (sh) fh.o.G(context, xmlResourceParser);
        sh shVar3 = (sh) ch.w0.G(context, xmlResourceParser);
        if ((shVar instanceof nh) || (shVar2 instanceof nh)) {
            nhVar = new nh(0);
        } else {
            boolean z = shVar3 instanceof rh;
            nhVar = shVar3;
            if (z) {
                nhVar = new oh(0.0f);
            }
        }
        boolean z2 = nhVar instanceof oh;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        if (nhVar instanceof qh) {
            boolean z3 = shVar instanceof qh;
            qh qhVar = z3 ? (qh) shVar : null;
            xob[] xobVarArrE = (qhVar == null || (str2 = qhVar.a) == null) ? null : ve3.e(str2);
            boolean z4 = shVar2 instanceof qh;
            qh qhVar2 = z4 ? (qh) shVar2 : null;
            xob[] xobVarArrE2 = (qhVar2 == null || (str = qhVar2.a) == null) ? null : ve3.e(str);
            if (xobVarArrE != null || xobVarArrE2 != null) {
                if (xobVarArrE != null) {
                    voc vocVar = new voc();
                    if (xobVarArrE2 == null) {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, vocVar, xobVarArrE);
                    } else {
                        if (!ve3.b(xobVarArrE, xobVarArrE2)) {
                            qh qhVar3 = z3 ? (qh) shVar : null;
                            String str4 = qhVar3 != null ? qhVar3.a : null;
                            qh qhVar4 = z4 ? (qh) shVar2 : null;
                            throw new InflateException(wy1.i("Can't morph from ", str4, " to ", qhVar4 != null ? qhVar4.a : null));
                        }
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, vocVar, xobVarArrE, xobVarArrE2);
                    }
                } else if (xobVarArrE2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, new voc(), xobVarArrE2);
                }
            }
        } else {
            ArgbEvaluator argbEvaluator = nhVar instanceof nh ? new ArgbEvaluator() : null;
            if (z2) {
                if (shVar != null) {
                    float f = ((oh) shVar).a;
                    propertyValuesHolderOfInt = shVar2 != null ? PropertyValuesHolder.ofFloat(str3, f, ((oh) shVar2).a) : PropertyValuesHolder.ofFloat(str3, f);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str3, 0.0f, ((oh) shVar2).a);
                }
            } else if (shVar != null) {
                int i = shVar instanceof nh ? ((nh) shVar).a : ((ph) shVar).a;
                if (shVar2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, i, shVar2 instanceof nh ? ((nh) shVar2).a : ((ph) shVar2).a);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, i);
                }
            } else if (shVar2 != null) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, shVar2 instanceof nh ? ((nh) shVar2).a : ((ph) shVar2).a);
            }
            if (propertyValuesHolderOfInt != null && argbEvaluator != null) {
                propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
            }
        }
        if (propertyValuesHolderOfInt != null) {
            valueAnimator.setValues(propertyValuesHolderOfInt);
        }
    }
}
