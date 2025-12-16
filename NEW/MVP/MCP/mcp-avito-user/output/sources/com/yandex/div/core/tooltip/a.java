package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* compiled from: DivTooltipAnimation.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.tooltip.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10861a {
        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[4] = 4;
            iArr[3] = 5;
            iArr[5] = 6;
        }
    }

    public static final TransitionSet a(DivTooltip divTooltip, com.yandex.div.json.expressions.e eVar) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new m(divTooltip.f372142g.a(eVar), null, 2, null)).setInterpolator((TimeInterpolator) new com.yandex.div.core.animation.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Transition] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.m] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.k] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.TransitionSet] */
    public static final Transition b(DivAnimation divAnimation, DivTooltip.Position position, boolean z12, com.yandex.div.json.expressions.e eVar) {
        ?? fade;
        Transition duration;
        Double dA2;
        Double dA3;
        int iOrdinal = divAnimation.f371269e.a(eVar).ordinal();
        if (iOrdinal != 0) {
            com.yandex.div.json.expressions.b<Double> bVar = divAnimation.f371266b;
            com.yandex.div.json.expressions.b<Double> bVar2 = divAnimation.f371271g;
            if (iOrdinal == 1) {
                if (z12) {
                    bVar = bVar2;
                }
                fade = new m(position, (bVar == null || (dA2 = bVar.a(eVar)) == null) ? null : Float.valueOf((float) dA2.doubleValue()));
            } else if (iOrdinal == 2) {
                if (z12) {
                    bVar = bVar2;
                }
                float fDoubleValue = 1.0f;
                if (bVar != null && (dA3 = bVar.a(eVar)) != null) {
                    fDoubleValue = (float) dA3.doubleValue();
                }
                fade = new k(fDoubleValue);
            } else if (iOrdinal == 3) {
                fade = 0;
            } else if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                fade = 0;
            } else {
                fade = new TransitionSet();
                List<DivAnimation> list = divAnimation.f371268d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(b((DivAnimation) it.next(), position, z12, eVar));
                    }
                }
            }
        } else {
            fade = new Fade();
        }
        if (fade == 0 || (duration = fade.setDuration(divAnimation.f371265a.a(eVar).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(com.yandex.div.core.util.c.b(divAnimation.f371267c.a(eVar)));
    }
}
