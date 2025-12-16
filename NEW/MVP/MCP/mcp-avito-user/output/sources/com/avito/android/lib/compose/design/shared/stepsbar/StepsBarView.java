package com.avito.android.lib.compose.design.shared.stepsbar;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: StepsBarView.kt */
@P
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\b'\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/stepsbar/StepsBarView;", "Landroidx/compose/ui/platform/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/avito/android/lib/compose/design/shared/stepsbar/b;", "steps", "Lkotlin/G0;", "setSteps", "(Ljava/util/List;)V", "getCurrentStep", "()Lcom/avito/android/lib/compose/design/shared/stepsbar/b;", "", "stepPosition", "setStepPosition", "(I)V", "visibleStepsCount", "setVisibleStepsCount", "", "currentStepProgressValue", "setCurrentStepProgressValue", "(Ljava/lang/Float;)V", "", "lastStepHasProgressDone", "setLastStepHasProgressDone", "(Z)V", "showInfo", "setShowInfo", "infoAlpha", "setInfoAlpha", "(F)V", "lastInfoHasEndAlignment", "setLastInfoEndAlignment", "Landroidx/compose/ui/unit/h;", "progressHeight", "setProgressHeight-0680j_4", "setProgressHeight", "_design-modules_compose_shared_stepsbar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StepsBarView extends AbstractC22450a {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<List<com.avito.android.lib.compose.design.shared.stepsbar.b>> f177692j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Integer> f177693k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Integer> f177694l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Float> f177695m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f177696n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f177697o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Float> f177698p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f177699q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<h> f177700r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<g> f177701s;

    /* compiled from: StepsBarView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                StepsBarView stepsBarView = StepsBarView.this;
                d.c(null, (List) ((C22082i3) stepsBarView.f177692j).getF42167b(), ((InterfaceC22196w1) stepsBarView.f177693k).getF42167b().intValue(), ((InterfaceC22196w1) stepsBarView.f177694l).getF42167b().intValue(), (Float) ((C22082i3) stepsBarView.f177695m).getF42167b(), ((Boolean) ((C22082i3) stepsBarView.f177696n).getF42167b()).booleanValue(), ((Boolean) ((C22082i3) stepsBarView.f177697o).getF42167b()).booleanValue(), ((InterfaceC22192v1) stepsBarView.f177698p).getF42167b().floatValue(), ((Boolean) ((C22082i3) stepsBarView.f177699q).getF42167b()).booleanValue(), ((h) ((C22082i3) stepsBarView.f177700r).getF42167b()).f42852b, (g) ((C22082i3) stepsBarView.f177701s).getF42167b(), a13, 64, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StepsBarView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            StepsBarView.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    public /* synthetic */ StepsBarView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public static void j(StepsBarView stepsBarView, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, int i12) {
        if ((i12 & 1) != 0) {
            pVar = null;
        }
        if ((i12 & 2) != 0) {
            pVar2 = null;
        }
        C22082i3 c22082i3 = (C22082i3) stepsBarView.f177701s;
        g gVar = (g) c22082i3.getF42167b();
        if (pVar == null) {
            pVar = ((g) c22082i3.getF42167b()).f177746a;
        }
        if (pVar2 == null) {
            pVar2 = ((g) c22082i3.getF42167b()).f177747b;
        }
        com.akita.compose.foundation.p pVar3 = ((g) c22082i3.getF42167b()).f177748c;
        com.akita.compose.foundation.p pVar4 = ((g) c22082i3.getF42167b()).f177749d;
        gVar.getClass();
        c22082i3.setValue(new g(pVar, pVar2, pVar3, pVar4));
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@l A a12, int i12) {
        B bE2 = a12.E(-164774780);
        if ((((bE2.B(this) ? 4 : 2) | i12) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(-313680951, new a(), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    @k
    public final com.avito.android.lib.compose.design.shared.stepsbar.b getCurrentStep() {
        return (com.avito.android.lib.compose.design.shared.stepsbar.b) ((List) ((C22082i3) this.f177692j).getF42167b()).get(((InterfaceC22196w1) this.f177693k).getF42167b().intValue());
    }

    public final void setCurrentStepProgressValue(@l Float currentStepProgressValue) {
        ((C22082i3) this.f177695m).setValue(currentStepProgressValue);
    }

    public final void setInfoAlpha(float infoAlpha) {
        this.f177698p.setValue(Float.valueOf(infoAlpha));
    }

    public final void setLastInfoEndAlignment(boolean lastInfoHasEndAlignment) {
        ((C22082i3) this.f177699q).setValue(Boolean.valueOf(lastInfoHasEndAlignment));
    }

    public final void setLastStepHasProgressDone(boolean lastStepHasProgressDone) {
        ((C22082i3) this.f177696n).setValue(Boolean.valueOf(lastStepHasProgressDone));
    }

    /* renamed from: setProgressHeight-0680j_4, reason: not valid java name */
    public final void m51setProgressHeight0680j_4(float progressHeight) {
        ((C22082i3) this.f177700r).setValue(h.a(progressHeight));
    }

    public final void setShowInfo(boolean showInfo) {
        ((C22082i3) this.f177697o).setValue(Boolean.valueOf(showInfo));
    }

    public final void setStepPosition(int stepPosition) {
        this.f177693k.setValue(Integer.valueOf(stepPosition));
    }

    public final void setSteps(@k List<com.avito.android.lib.compose.design.shared.stepsbar.b> steps) {
        int size = steps.size();
        InterfaceC22204y1<Integer> interfaceC22204y1 = this.f177694l;
        if (size < ((InterfaceC22196w1) interfaceC22204y1).getF42167b().intValue()) {
            interfaceC22204y1.setValue(Integer.valueOf(steps.size()));
        }
        ((C22082i3) this.f177692j).setValue(steps);
    }

    public final void setVisibleStepsCount(int visibleStepsCount) {
        this.f177694l.setValue(Integer.valueOf(visibleStepsCount));
    }

    @j
    public StepsBarView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        this.f177692j = C22126m3.g(C42784z0.f406748b);
        this.f177693k = U2.a(0);
        this.f177694l = U2.a(0);
        this.f177695m = C22126m3.g(null);
        Boolean bool = Boolean.FALSE;
        this.f177696n = C22126m3.g(bool);
        this.f177697o = C22126m3.g(Boolean.TRUE);
        this.f177698p = Q1.a(1.0f);
        this.f177699q = C22126m3.g(bool);
        this.f177700r = C22126m3.g(h.a(d.f177708a));
        this.f177701s = C22126m3.g(new g(null, null, null, null, 15, null));
    }
}
