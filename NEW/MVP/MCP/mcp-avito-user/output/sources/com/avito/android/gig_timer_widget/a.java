package com.avito.android.gig_timer_widget;

import X41.j;
import Y41.r;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.serp_core.timer.CounterFormat;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ts0.C48712a;
import ts0.d;
import ts0.e;
import ts0.g;

/* compiled from: GigTimerView.kt */
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\u00198\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/avito/android/gig_timer_widget/a;", "Landroid/widget/LinearLayout;", "Lts0/g;", "", "hours", "Lkotlin/G0;", "setHours", "(Ljava/lang/String;)V", "minutes", "setMinutes", "seconds", "setSeconds", "Lkotlin/Function0;", "finishListener", "setOnFinishListener", "(LY41/a;)V", "b", "LY41/a;", "getFinishListener", "()LY41/a;", "setFinishListener", "c", "getOnStepListener", "setOnStepListener", "onStepListener", "Lts0/e;", "d", "Lts0/e;", "getCounterUp", "()Lts0/e;", "setCounterUp", "(Lts0/e;)V", "counterUp", "Lts0/a;", "e", "Lts0/a;", "getCounterDown", "()Lts0/a;", "setCounterDown", "(Lts0/a;)V", "counterDown", "_avito_gig_timer-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class a extends LinearLayout implements g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> finishListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> onStepListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public e counterUp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public C48712a counterDown;

    /* compiled from: GigTimerView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "days", "hours", "minutes", "seconds", "Lkotlin/G0;", "invoke", "(JJJJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.gig_timer_widget.a$a, reason: collision with other inner class name */
    public static final class C4712a extends N implements r<Long, Long, Long, Long, G0> {
        public C4712a() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(Long l12, Long l13, Long l14, Long l15) {
            a.this.b(l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), true);
            return G0.f406611a;
        }
    }

    /* compiled from: GigTimerView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "days", "hours", "minutes", "seconds", "Lkotlin/G0;", "invoke", "(JJJJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements r<Long, Long, Long, Long, G0> {
        public b() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(Long l12, Long l13, Long l14, Long l15) {
            a.this.b(l12.longValue(), l13.longValue(), l14.longValue(), l15.longValue(), false);
            return G0.f406611a;
        }
    }

    @j
    public a(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // ts0.g
    public final void a() {
        Y41.a<G0> onStepListener = getOnStepListener();
        if (onStepListener != null) {
            onStepListener.invoke();
        }
    }

    public abstract void b(long j12, long j13, long j14, long j15, boolean z12);

    public void c(long j12, boolean z12) {
        d();
        if (z12) {
            C48712a c48712a = new C48712a(j12, 1000L, 60000L, CounterFormat.f273988b, new C4712a());
            c48712a.b(this);
            setCounterDown(c48712a);
            return;
        }
        e eVar = new e(j12, 1000L, new b());
        eVar.f439614d = this;
        if (eVar.f439615e == null) {
            d dVar = new d(eVar, 1000L);
            dVar.start();
            eVar.f439615e = dVar;
        }
        setCounterUp(eVar);
    }

    public final void d() {
        C48712a counterDown = getCounterDown();
        if (counterDown != null) {
            ts0.b bVar = counterDown.f439608g;
            if (bVar != null) {
                bVar.cancel();
            }
            counterDown.f439608g = null;
            counterDown.f439607f = null;
        }
        e counterUp = getCounterUp();
        if (counterUp != null) {
            d dVar = counterUp.f439615e;
            if (dVar != null) {
                dVar.cancel();
            }
            counterUp.f439615e = null;
            counterUp.f439614d = null;
        }
        setCounterDown(null);
        setCounterUp(null);
    }

    @l
    public C48712a getCounterDown() {
        return this.counterDown;
    }

    @l
    public e getCounterUp() {
        return this.counterUp;
    }

    @l
    public Y41.a<G0> getFinishListener() {
        return this.finishListener;
    }

    @l
    public Y41.a<G0> getOnStepListener() {
        return this.onStepListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C48712a counterDown = getCounterDown();
        if (counterDown != null) {
            counterDown.b(this);
        }
        e counterUp = getCounterUp();
        if (counterUp != null) {
            counterUp.f439614d = this;
            if (counterUp.f439615e == null) {
                d dVar = new d(counterUp, counterUp.f439612b);
                dVar.start();
                counterUp.f439615e = dVar;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    @Override // ts0.g
    public final void s0() {
        Y41.a<G0> finishListener = getFinishListener();
        if (finishListener != null) {
            finishListener.invoke();
        }
    }

    public void setCounterDown(@l C48712a c48712a) {
        this.counterDown = c48712a;
    }

    public void setCounterUp(@l e eVar) {
        this.counterUp = eVar;
    }

    public void setFinishListener(@l Y41.a<G0> aVar) {
        this.finishListener = aVar;
    }

    public final void setOnFinishListener(@k Y41.a<G0> finishListener) {
        setFinishListener(finishListener);
    }

    public void setOnStepListener(@l Y41.a<G0> aVar) {
        this.onStepListener = aVar;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @j
    public a(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        context.setTheme(R.style.Theme_DesignSystem_Re23);
    }

    @Override // ts0.g
    public void setHours(@k String hours) {
    }

    @Override // ts0.g
    public void setMinutes(@k String minutes) {
    }

    @Override // ts0.g
    public void setSeconds(@k String seconds) {
    }
}
