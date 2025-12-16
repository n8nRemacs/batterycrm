package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.yandex.div.core.C37912g;
import com.yandex.div.core.C37916k;
import com.yandex.div.core.dagger.InterfaceC37908b;
import com.yandex.div.core.dagger.j;
import com.yandex.div.core.m0;
import com.yandex.div.core.n0;
import com.yandex.div.core.state.f;
import com.yandex.div.core.timer.Ticker;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div.core.view2.divs.C37980n;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.H0;
import com.yandex.div2.V7;
import j.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.WeakHashMap;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.v0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: Div2View.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u008a\u0001J\u000f\u0010\u0006\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00109\u001a\u0004\u0018\u0001008\u0010@\u0010X\u0091\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010@\u001a\u00020\u00118\u0010@\u0010X\u0091\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b?\u00108\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010>R\u001b\u0010F\u001a\u00020A8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER*\u0010L\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b;\u0010H\u001a\u0004\bI\u0010\u0010\"\u0004\bJ\u0010KR*\u0010Q\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010\u0010\"\u0004\bP\u0010KR.\u0010Y\u001a\u0004\u0018\u00010R2\b\u0010G\u001a\u0004\u0018\u00010R8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010a\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020b8\u0012X\u0093\u0004¢\u0006\f\n\u0004\bc\u0010d\u0012\u0004\be\u00108R\u001a\u0010l\u001a\u00020g8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR(\u0010w\u001a\u0004\u0018\u00010b2\b\u0010G\u001a\u0004\u0018\u00010b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010r\"\u0004\bu\u0010vR$\u0010}\u001a\u00020x2\u0006\u0010G\u001a\u00020x8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8RX\u0092\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018RX\u0092\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/yandex/div/core/view2/k;", "Lcom/yandex/div/internal/widget/f;", "Lcom/yandex/div/core/n0;", "Lcom/yandex/div/core/S;", "getCustomContainerChildFactory$div_release", "()Lcom/yandex/div/core/S;", "getCustomContainerChildFactory", "Lcom/yandex/div/core/m0;", "viewConfig", "Lkotlin/G0;", "setConfig", "(Lcom/yandex/div/core/m0;)V", "getConfig", "()Lcom/yandex/div/core/m0;", "Lq21/c;", "getDivTag", "()Lq21/c;", "", "getCurrentStateId", "()J", "Lcom/yandex/div/core/state/k;", "getCurrentState", "()Lcom/yandex/div/core/state/k;", "getView", "()Lcom/yandex/div/core/view2/k;", "Lcom/yandex/div/json/expressions/e;", "getExpressionResolver", "()Lcom/yandex/div/json/expressions/e;", "Lcom/yandex/div/core/dagger/b;", "n", "Lcom/yandex/div/core/dagger/b;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/b;", "div2Component", "Lcom/yandex/div/core/dagger/j;", "o", "Lcom/yandex/div/core/dagger/j;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/j;", "viewComponent", "Lcom/yandex/div/core/timer/a;", "z", "Lcom/yandex/div/core/timer/a;", "getDivTimerEventDispatcher$div_release", "()Lcom/yandex/div/core/timer/a;", "setDivTimerEventDispatcher$div_release", "(Lcom/yandex/div/core/timer/a;)V", "divTimerEventDispatcher", "Lcom/yandex/div/core/util/i;", "C", "Lcom/yandex/div/core/util/i;", "getBindOnAttachRunnable$div_release", "()Lcom/yandex/div/core/util/i;", "setBindOnAttachRunnable$div_release", "(Lcom/yandex/div/core/util/i;)V", "getBindOnAttachRunnable$div_release$annotations", "()V", "bindOnAttachRunnable", "F", "J", "getStateId$div_release", "setStateId$div_release", "(J)V", "getStateId$div_release$annotations", "stateId", "Lcom/yandex/div/histogram/e;", "I", "Lkotlin/C;", "getHistogramReporter", "()Lcom/yandex/div/histogram/e;", "histogramReporter", "value", "Lq21/c;", "getDataTag", "setDataTag$div_release", "(Lq21/c;)V", "dataTag", "<set-?>", "K", "getPrevDataTag", "setPrevDataTag$div_release", "prevDataTag", "Lcom/yandex/div2/H0;", "L", "Lcom/yandex/div2/H0;", "getDivData", "()Lcom/yandex/div2/H0;", "setDivData$div_release", "(Lcom/yandex/div2/H0;)V", "divData", "Lcom/yandex/div/core/k;", "M", "Lcom/yandex/div/core/k;", "getActionHandler", "()Lcom/yandex/div/core/k;", "setActionHandler", "(Lcom/yandex/div/core/k;)V", "actionHandler", "", "O", "Ljava/lang/String;", "getViewCreateCallType$annotations", "viewCreateCallType", "Lcom/yandex/div/core/view2/animations/b;", "Q", "Lcom/yandex/div/core/view2/animations/b;", "getDivTransitionHandler$div_release", "()Lcom/yandex/div/core/view2/animations/b;", "divTransitionHandler", "Lcom/yandex/div/core/view2/divs/widgets/D;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/D;", "releaseViewVisitor", "getLogId", "()Ljava/lang/String;", "logId", "getComponentName", "setComponentName", "(Ljava/lang/String;)V", "componentName", "", "getVisualErrorsEnabled", "()Z", "setVisualErrorsEnabled", "(Z)V", "visualErrorsEnabled", "Lcom/yandex/div/core/player/f;", "getDivVideoActionHandler", "()Lcom/yandex/div/core/player/f;", "divVideoActionHandler", "Lcom/yandex/div/core/tooltip/g;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/g;", "tooltipController", "Lcom/yandex/div/core/expression/variables/k;", "getVariableController", "()Lcom/yandex/div/core/expression/variables/k;", "variableController", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.div.core.view2.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38029k extends com.yandex.div.internal.widget.f implements n0 {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f369122R = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final Object f369123A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.util.i f369124B;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.core.util.i bindOnAttachRunnable;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.util.i f369126D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.util.i f369127E;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public long stateId;

    /* renamed from: G, reason: collision with root package name */
    public m0 f369129G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.yandex.div.histogram.v> f369130H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Object f369131I;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public q21.c dataTag;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public q21.c prevDataTag;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public H0 divData;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public C37916k actionHandler;

    /* renamed from: N, reason: collision with root package name */
    public long f369136N;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final String viewCreateCallType;

    /* renamed from: P, reason: collision with root package name */
    public boolean f369138P;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final com.yandex.div.core.view2.animations.b divTransitionHandler;

    /* renamed from: m, reason: collision with root package name */
    public final long f369140m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC37908b div2Component;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final com.yandex.div.core.dagger.j viewComponent;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f369143p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final e0 f369144q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C38026h f369145r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369146s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369147t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ArrayList f369148u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<View, AbstractC38330g> f369149v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final WeakHashMap<View, DivAccessibility.Mode> f369150w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final a f369151x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.expression.e f369152y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public com.yandex.div.core.timer.a divTimerEventDispatcher;

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/k$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.k$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f369154a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public H0.d f369155b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f369156c = new ArrayList();

        /* compiled from: View.kt */
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.view2.k$a$a, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC10887a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC10887a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                view.removeOnLayoutChangeListener(this);
                a.this.a(C38028j.f369121l);
            }
        }

        public a() {
        }

        public final void a(@Y61.k Y41.a<G0> aVar) {
            if (this.f369154a) {
                return;
            }
            this.f369154a = true;
            aVar.invoke();
            b();
            this.f369154a = false;
        }

        public final void b() {
            C38029k c38029k = C38029k.this;
            if (c38029k.getChildCount() == 0) {
                if (!com.yandex.div.core.util.q.b(c38029k) || c38029k.isLayoutRequested()) {
                    c38029k.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10887a());
                    return;
                } else {
                    a(C38028j.f369121l);
                    return;
                }
            }
            H0.d dVar = this.f369155b;
            if (dVar == null) {
                return;
            }
            B21.e eVarE = c38029k.getViewComponent().e();
            ArrayList arrayList = this.f369156c;
            eVarE.a(dVar, v0.g(arrayList) ? Collections.unmodifiableList(new ArrayList(arrayList)) : arrayList);
            this.f369155b = null;
            arrayList.clear();
        }

        public final void c(@Y61.l H0.d dVar, @Y61.k com.yandex.div.core.state.f fVar, boolean z12) {
            List listSingletonList = Collections.singletonList(fVar);
            H0.d dVar2 = this.f369155b;
            ArrayList arrayList = this.f369156c;
            if (dVar2 != null && !kotlin.jvm.internal.L.f(dVar, dVar2)) {
                arrayList.clear();
            }
            this.f369155b = dVar;
            List<com.yandex.div.core.state.f> list = listSingletonList;
            C42745f0.h(list, arrayList);
            for (com.yandex.div.core.state.f fVar2 : list) {
                C38029k c38029k = C38029k.this;
                c38029k.getDiv2Component().r().c(c38029k.getDivTag().f428995a, fVar2, z12);
            }
            if (this.f369154a) {
                return;
            }
            b();
        }
    }

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/histogram/e;", "invoke", "()Lcom/yandex/div/histogram/e;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.k$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<com.yandex.div.histogram.e> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.yandex.div.histogram.e invoke() {
            C38029k c38029k = C38029k.this;
            return new com.yandex.div.histogram.e(new r(c38029k), c38029k.f369130H);
        }
    }

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/yandex/div/histogram/v;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/yandex/div/histogram/v;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.k$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.yandex.div.histogram.v> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C37912g f369160l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C37912g c37912g) {
            super(0);
            this.f369160l = c37912g;
        }

        @Override // Y41.a
        public final com.yandex.div.histogram.v invoke() {
            return com.yandex.div.core.Z.f367267b.a(this.f369160l).f367270a.a().b().get();
        }
    }

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.k$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.yandex.div.histogram.e histogramReporter = C38029k.this.getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.f370005g = Long.valueOf(SystemClock.uptimeMillis());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.k$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.yandex.div.histogram.e histogramReporter = C38029k.this.getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.b();
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ C38029k(C37912g c37912g, AttributeSet attributeSet, int i12, long j12, int i13, C42822w c42822w) {
        this(c37912g, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, j12);
    }

    private com.yandex.div.core.player.f getDivVideoActionHandler() {
        return getDiv2Component().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public com.yandex.div.histogram.e getHistogramReporter() {
        return (com.yandex.div.histogram.e) this.f369131I.getValue();
    }

    private com.yandex.div.core.tooltip.g getTooltipController() {
        return getDiv2Component().f();
    }

    private com.yandex.div.core.expression.variables.k getVariableController() {
        com.yandex.div.core.expression.e eVar = this.f369152y;
        if (eVar == null) {
            return null;
        }
        return eVar.f367461b;
    }

    @Y61.l
    public final AbstractC38330g A(@Y61.k View view) {
        return this.f369149v.remove(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(com.yandex.div2.H0 r12, q21.c r13) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.C38029k.B(com.yandex.div2.H0, q21.c):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.n0
    public final void Cc(@Y61.k String str) {
        com.yandex.div.core.tooltip.g tooltipController = getTooltipController();
        tooltipController.getClass();
        kotlin.Q qC2 = com.yandex.div.core.tooltip.h.c(this, str);
        if (qC2 == null) {
            return;
        }
        DivTooltip divTooltip = (DivTooltip) qC2.f406619b;
        View view = (View) qC2.f406620c;
        if (tooltipController.f367768f.containsKey(divTooltip.f372140e)) {
            return;
        }
        if (!com.yandex.div.core.util.q.b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new com.yandex.div.core.tooltip.d(tooltipController, view, divTooltip, this));
        } else {
            com.yandex.div.core.tooltip.g.a(tooltipController, view, divTooltip, this);
        }
        if (com.yandex.div.core.util.q.b(view) || view.isLayoutRequested()) {
            return;
        }
        view.requestLayout();
    }

    @Override // com.yandex.div.core.n0
    public final void a(long j12, boolean z12) {
        synchronized (this.f369123A) {
            try {
                H0.c cVar = H0.f372502h;
                if (j12 != -1) {
                    com.yandex.div.core.util.i bindOnAttachRunnable = getBindOnAttachRunnable();
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.f367796a = null;
                    }
                    p(j12, z12);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.div.core.n0
    public final void b(@Y61.k String str) {
        getTooltipController().c(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.n0
    public final void d(@Y61.k com.yandex.div.core.state.f fVar, boolean z12) {
        List<H0.d> list;
        synchronized (this.f369123A) {
            try {
                long stateId = getStateId();
                long j12 = fVar.f367662a;
                if (stateId == j12) {
                    com.yandex.div.core.util.i bindOnAttachRunnable = getBindOnAttachRunnable();
                    H0.d dVar = null;
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.f367796a = null;
                    }
                    H0 divData = getDivData();
                    if (divData != null && (list = divData.f372511b) != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((H0.d) next).f372522b == fVar.f367662a) {
                                dVar = next;
                                break;
                            }
                        }
                        dVar = dVar;
                    }
                    this.f369151x.c(dVar, fVar, z12);
                } else {
                    H0.c cVar = H0.f372502h;
                    if (j12 != -1) {
                        getDiv2Component().r().c(getDataTag().f428995a, fVar, z12);
                        a(fVar.f367662a, z12);
                    }
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f369138P) {
            com.yandex.div.histogram.e histogramReporter = getHistogramReporter();
            histogramReporter.getClass();
            histogramReporter.f370009k = Long.valueOf(SystemClock.uptimeMillis());
        }
        C37931a.q(this, canvas);
        super.dispatchDraw(canvas);
        if (this.f369138P) {
            getHistogramReporter().c();
        }
    }

    @Override // android.view.View
    public final void draw(@Y61.l Canvas canvas) {
        this.f369138P = false;
        com.yandex.div.histogram.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.f370009k = Long.valueOf(SystemClock.uptimeMillis());
        super.draw(canvas);
        getHistogramReporter().c();
        this.f369138P = true;
    }

    @Y61.l
    public C37916k getActionHandler() {
        return this.actionHandler;
    }

    @Y61.l
    /* renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public com.yandex.div.core.util.i getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    @Y61.l
    public String getComponentName() {
        return getHistogramReporter().f370001c;
    }

    @Y61.k
    /* renamed from: getConfig, reason: from getter */
    public m0 getF369129G() {
        return this.f369129G;
    }

    @Y61.l
    public com.yandex.div.core.state.k getCurrentState() {
        H0 divData = getDivData();
        if (divData == null) {
            return null;
        }
        com.yandex.div.core.state.k kVarA = getDiv2Component().r().a(getDataTag());
        List<H0.d> list = divData.f372511b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long j12 = ((H0.d) it.next()).f372522b;
            if (kVarA != null && j12 == kVarA.f367666a) {
                return kVarA;
            }
        }
        return null;
    }

    public long getCurrentStateId() {
        return getStateId();
    }

    @Y61.k
    public com.yandex.div.core.S getCustomContainerChildFactory$div_release() {
        return getDiv2Component().j();
    }

    @Y61.k
    public q21.c getDataTag() {
        return this.dataTag;
    }

    @Y61.k
    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public InterfaceC37908b getDiv2Component() {
        return this.div2Component;
    }

    @Y61.l
    public H0 getDivData() {
        return this.divData;
    }

    @Y61.k
    public q21.c getDivTag() {
        return getDataTag();
    }

    @Y61.l
    /* renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public com.yandex.div.core.timer.a getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    @Y61.k
    /* renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public com.yandex.div.core.view2.animations.b getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    @Override // com.yandex.div.core.n0
    @Y61.k
    public com.yandex.div.json.expressions.e getExpressionResolver() {
        com.yandex.div.core.expression.e eVar = this.f369152y;
        com.yandex.div.core.expression.d dVar = eVar == null ? null : eVar.f367460a;
        return dVar == null ? com.yandex.div.json.expressions.e.f370568a : dVar;
    }

    @Y61.k
    public String getLogId() {
        String str;
        H0 divData = getDivData();
        return (divData == null || (str = divData.f372510a) == null) ? "" : str;
    }

    @Y61.k
    public q21.c getPrevDataTag() {
        return this.prevDataTag;
    }

    @Y61.k
    public com.yandex.div.core.view2.divs.widgets.D getReleaseViewVisitor$div_release() {
        return getViewComponent().g();
    }

    /* renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    @Override // com.yandex.div.core.n0
    @Y61.k
    public C38029k getView() {
        return this;
    }

    @Y61.k
    /* renamed from: getViewComponent$div_release, reason: from getter */
    public com.yandex.div.core.dagger.j getViewComponent() {
        return this.viewComponent;
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().c().f369098b;
    }

    public final void h(@Y61.k v21.e eVar) {
        synchronized (this.f369123A) {
            this.f369146s.add(eVar);
        }
    }

    public final boolean i(@Y61.k String str, @Y61.k String str2) {
        com.yandex.div.core.player.e playerView;
        getDivVideoActionHandler().getClass();
        com.yandex.div.core.view2.divs.widgets.v vVarA = com.yandex.div.core.player.f.a(this, str);
        com.yandex.div.core.player.a attachedPlayer = null;
        if (vVarA != null && (playerView = vVarA.getPlayerView()) != null) {
            attachedPlayer = playerView.getAttachedPlayer();
        }
        if (attachedPlayer == null) {
            return false;
        }
        if (str2.equals("start") || str2.equals("pause")) {
            return true;
        }
        int i12 = com.yandex.div.internal.n.f370123a;
        return false;
    }

    public final void k(@Y61.k View view, @Y61.k AbstractC38330g abstractC38330g) {
        this.f369149v.put(view, abstractC38330g);
    }

    public final View l(H0.d dVar, long j12, boolean z12) {
        getDiv2Component().r().b(getDataTag(), j12, z12);
        com.yandex.div.core.state.f.f367661c.getClass();
        com.yandex.div.core.state.f fVarA = f.a.a(dVar.f372522b);
        C38026h c38026h = this.f369145r;
        c38026h.getClass();
        com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
        P p12 = c38026h.f369113a;
        AbstractC38330g abstractC38330g = dVar.f372521a;
        View viewN = p12.n(abstractC38330g, expressionResolver);
        viewN.setLayoutParams(new com.yandex.div.internal.widget.c(-1, -2));
        try {
            c38026h.f369114b.b(viewN, abstractC38330g, this, fVarA);
        } catch (ParsingException e12) {
            if (!com.yandex.div.core.expression.b.a(e12)) {
                throw e12;
            }
        }
        getDiv2Component().s().a();
        return viewN;
    }

    public final void m(@Y61.k Y41.a<G0> aVar) {
        this.f369151x.a(aVar);
    }

    public final void n() {
        synchronized (this.f369123A) {
            this.f369147t.clear();
            G0 g02 = G0.f406611a;
        }
    }

    public final C43025h o(H0 h02, AbstractC38330g abstractC38330g) {
        com.yandex.div.json.expressions.b<DivTransitionSelector> bVar;
        com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
        C42754k c42754k = new C42754k();
        DivTransitionSelector divTransitionSelectorA = null;
        if (h02 != null && (bVar = h02.f372513d) != null) {
            divTransitionSelectorA = bVar.a(expressionResolver);
        }
        if (divTransitionSelectorA == null) {
            divTransitionSelectorA = DivTransitionSelector.NONE;
        }
        c42754k.addLast(divTransitionSelectorA);
        com.yandex.div.core.util.a aVar = new com.yandex.div.core.util.a(abstractC38330g, null, null, 0, 8, null);
        return C43033p.i(new com.yandex.div.core.util.a(aVar.f367781a, new C38033o(c42754k, expressionResolver), new C38034p(c42754k), aVar.f367784d), new C38035q(c42754k));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.yandex.div.core.util.i iVar = this.f369126D;
        if (iVar != null) {
            iVar.a();
        }
        com.yandex.div.core.util.i iVar2 = this.f369124B;
        if (iVar2 != null) {
            iVar2.a();
        }
        com.yandex.div.core.util.i bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.a();
        }
        com.yandex.div.core.util.i iVar3 = this.f369127E;
        if (iVar3 == null) {
            return;
        }
        iVar3.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
        com.yandex.div.core.timer.a divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher == null) {
            return;
        }
        divTimerEventDispatcher.a(this);
    }

    @Override // com.yandex.div.internal.widget.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        com.yandex.div.histogram.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.f370008j = Long.valueOf(SystemClock.uptimeMillis());
        super.onLayout(z12, i12, i13, i14, i15);
        z();
        com.yandex.div.histogram.e histogramReporter2 = getHistogramReporter();
        Long l12 = histogramReporter2.f370008j;
        if (l12 == null) {
            return;
        }
        histogramReporter2.a().f2862d += SystemClock.uptimeMillis() - l12.longValue();
    }

    @Override // com.yandex.div.internal.widget.f, android.view.View
    public final void onMeasure(int i12, int i13) {
        com.yandex.div.histogram.e histogramReporter = getHistogramReporter();
        histogramReporter.getClass();
        histogramReporter.f370007i = Long.valueOf(SystemClock.uptimeMillis());
        super.onMeasure(i12, i13);
        com.yandex.div.histogram.e histogramReporter2 = getHistogramReporter();
        Long l12 = histogramReporter2.f370007i;
        if (l12 == null) {
            return;
        }
        histogramReporter2.a().f2861c += SystemClock.uptimeMillis() - l12.longValue();
    }

    public final void p(long j12, boolean z12) {
        List<H0.d> list;
        Object next;
        H0.d dVar;
        List<H0.d> list2;
        Object next2;
        H0.d dVar2;
        setStateId$div_release(j12);
        com.yandex.div.core.state.k currentState = getCurrentState();
        Long lValueOf = currentState == null ? null : Long.valueOf(currentState.f367666a);
        H0 divData = getDivData();
        if (divData == null || (list = divData.f372511b) == null) {
            dVar = null;
        } else {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long j13 = ((H0.d) next).f372522b;
                if (lValueOf != null && j13 == lValueOf.longValue()) {
                    break;
                }
            }
            dVar = (H0.d) next;
        }
        H0 divData2 = getDivData();
        if (divData2 == null || (list2 = divData2.f372511b) == null) {
            dVar2 = null;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (((H0.d) next2).f372522b == j12) {
                        break;
                    }
                }
            }
            dVar2 = (H0.d) next2;
        }
        if (dVar2 == null) {
            return;
        }
        if (dVar != null) {
            X xT2 = getDiv2Component().t();
            AbstractC38330g abstractC38330g = dVar.f372521a;
            xT2.d(this, null, abstractC38330g, C37931a.u(abstractC38330g.a()));
        }
        y(dVar2);
        com.yandex.div.core.view2.animations.a aVar = com.yandex.div.core.view2.animations.a.f367913a;
        AbstractC38330g abstractC38330g2 = dVar != null ? dVar.f372521a : null;
        com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
        aVar.getClass();
        AbstractC38330g abstractC38330g3 = dVar2.f372521a;
        if (!com.yandex.div.core.view2.animations.a.b(abstractC38330g2, abstractC38330g3, expressionResolver)) {
            com.yandex.div.core.view2.divs.widgets.C.f368870a.getClass();
            com.yandex.div.core.view2.divs.widgets.C.a(this, this);
            addView(l(dVar2, j12, z12));
        } else {
            View childAt = getView().getChildAt(0);
            C38040w c38040wS = getDiv2Component().s();
            com.yandex.div.core.state.f.f367661c.getClass();
            c38040wS.b(childAt, abstractC38330g3, this, f.a.a(j12));
            getDiv2Component().r().b(getDataTag(), j12, z12);
            getDiv2Component().s().a();
        }
    }

    public final void q(H0 h02) {
        Object next;
        try {
            if (getChildCount() == 0) {
                B(h02, getDataTag());
                return;
            }
            com.yandex.div.histogram.e histogramReporter = getHistogramReporter();
            if (histogramReporter != null) {
                histogramReporter.f370006h = Long.valueOf(SystemClock.uptimeMillis());
            }
            com.yandex.div.core.view2.errors.d dVarA = getViewComponent().d().a(getDivData(), getDataTag());
            dVarA.f369070e.clear();
            dVarA.f369067b.clear();
            dVarA.c();
            Iterator<T> it = h02.f372511b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((H0.d) next).f372522b == getStateId()) {
                        break;
                    }
                }
            }
            H0.d dVar = (H0.d) next;
            if (dVar == null) {
                dVar = h02.f372511b.get(0);
            }
            View childAt = getChildAt(0);
            com.yandex.div2.H hA2 = dVar.f372521a.a();
            com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
            try {
                C37931a.m(childAt, expressionResolver, hA2);
                C37931a.d(childAt, expressionResolver, hA2);
                com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarM = hA2.m();
                DivAlignmentHorizontal divAlignmentHorizontalA = bVarM == null ? null : bVarM.a(expressionResolver);
                com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarU = hA2.u();
                C37931a.a(childAt, divAlignmentHorizontalA, bVarU == null ? null : bVarU.a(expressionResolver));
            } catch (ParsingException e12) {
                if (!com.yandex.div.core.expression.b.a(e12)) {
                    throw e12;
                }
            }
            setDivData$div_release(h02);
            C38040w c38040wS = getDiv2Component().s();
            AbstractC38330g abstractC38330g = dVar.f372521a;
            f.a aVar = com.yandex.div.core.state.f.f367661c;
            long stateId = getStateId();
            aVar.getClass();
            c38040wS.b(childAt, abstractC38330g, this, f.a.a(stateId));
            requestLayout();
            if (this.f369143p) {
                this.f369124B = new com.yandex.div.core.util.i(this, new C38030l(this));
            } else {
                com.yandex.div.core.expression.e eVar = this.f369152y;
                if (eVar != null) {
                    eVar.f367462c.b(this);
                }
            }
            com.yandex.div.histogram.e histogramReporter2 = getHistogramReporter();
            if (histogramReporter2 == null) {
                return;
            }
            Long l12 = histogramReporter2.f370006h;
            D21.a aVarA = histogramReporter2.a();
            if (l12 == null) {
                int i12 = com.yandex.div.internal.n.f370123a;
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis() - l12.longValue();
                aVarA.f2860b = jUptimeMillis;
                com.yandex.div.histogram.reporter.a.a((com.yandex.div.histogram.reporter.a) ((r) histogramReporter2.f369999a).invoke(), "Div.Rebinding", jUptimeMillis, histogramReporter2.f370001c, null, null, 24);
            }
            histogramReporter2.f370006h = null;
        } catch (Exception unused) {
            B(h02, getDataTag());
            int i13 = com.yandex.div.internal.n.f370123a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r16 = this;
            r0 = r16
            long r1 = r0.f369136N
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto Lb
            return
        Lb:
            com.yandex.div.core.dagger.b r1 = r16.getDiv2Component()
            com.yandex.div.core.Q r1 = r1.i()
            long r5 = r0.f369136N
            com.yandex.div.core.dagger.b r2 = r16.getDiv2Component()
            com.yandex.div.histogram.reporter.a r2 = r2.l()
            r1.getClass()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r14 = -1
            if (r7 >= 0) goto L28
            r2 = r14
            goto L60
        L28:
            long r7 = r0.f369140m
            long r9 = r5 - r7
            java.lang.String r12 = r0.viewCreateCallType
            r5 = 20
            java.lang.String r8 = "Div.View.Create"
            r11 = 0
            r13 = 0
            r7 = r2
            r14 = r5
            com.yandex.div.histogram.reporter.a.a(r7, r8, r9, r11, r12, r13, r14)
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.f367260c
            r6 = 0
            r7 = 1
            boolean r5 = r5.compareAndSet(r6, r7)
            if (r5 == 0) goto L49
            long r5 = r1.f367259b
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4c
        L49:
            r2 = -1
            goto L60
        L4c:
            long r3 = r1.f367258a
            long r9 = r5 - r3
            java.lang.String r12 = r1.f367261d
            r13 = 0
            java.lang.String r8 = "Div.Context.Create"
            r11 = 0
            r14 = 20
            r7 = r2
            com.yandex.div.histogram.reporter.a.a(r7, r8, r9, r11, r12, r13, r14)
            r2 = -1
            r1.f367259b = r2
        L60:
            r0.f369136N = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.C38029k.r():void");
    }

    public final void s(@Y61.l H0 h02, @Y61.k q21.c cVar) {
        H0 divData = getDivData();
        synchronized (this.f369123A) {
            if (h02 != null) {
                try {
                    if (!kotlin.jvm.internal.L.f(getDivData(), h02)) {
                        com.yandex.div.core.util.i bindOnAttachRunnable = getBindOnAttachRunnable();
                        H0 h03 = null;
                        if (bindOnAttachRunnable != null) {
                            bindOnAttachRunnable.f367796a = null;
                        }
                        boolean z12 = true;
                        getHistogramReporter().f370002d = true;
                        H0 divData2 = getDivData();
                        if (divData2 != null) {
                            divData = divData2;
                        }
                        com.yandex.div.core.view2.animations.a aVar = com.yandex.div.core.view2.animations.a.f367913a;
                        long stateId = getStateId();
                        com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
                        aVar.getClass();
                        if (com.yandex.div.core.view2.animations.a.e(divData, h02, stateId, expressionResolver)) {
                            h03 = divData;
                        }
                        setDataTag$div_release(cVar);
                        Iterator<T> it = h02.f372511b.iterator();
                        while (it.hasNext()) {
                            getDiv2Component().k().a(((H0.d) it.next()).f372521a, getExpressionResolver(), com.yandex.div.core.h0.f367542d);
                        }
                        if (h03 != null) {
                            int iOrdinal = h02.f372513d.a(getExpressionResolver()).ordinal();
                            if (iOrdinal != 1 && iOrdinal != 3) {
                                z12 = false;
                            }
                            if (z12) {
                                B(h02, cVar);
                            } else {
                                q(h02);
                            }
                            getDiv2Component().s().a();
                        } else {
                            B(h02, cVar);
                        }
                        r();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setActionHandler(@Y61.l C37916k c37916k) {
        this.actionHandler = c37916k;
    }

    public void setBindOnAttachRunnable$div_release(@Y61.l com.yandex.div.core.util.i iVar) {
        this.bindOnAttachRunnable = iVar;
    }

    public void setComponentName(@Y61.l String str) {
        getHistogramReporter().f370001c = str;
    }

    public void setConfig(@Y61.k m0 viewConfig) {
        this.f369129G = viewConfig;
    }

    public void setDataTag$div_release(@Y61.k q21.c cVar) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = cVar;
        this.f369144q.a(getDivData(), cVar);
    }

    public void setDivData$div_release(@Y61.l H0 h02) {
        com.yandex.div.core.timer.a divTimerEventDispatcher;
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        this.divData = h02;
        H0 divData = getDivData();
        if (divData != null) {
            com.yandex.div.core.expression.e eVar = this.f369152y;
            com.yandex.div.core.expression.e eVarA = getDiv2Component().e().a(divData, getDataTag());
            this.f369152y = eVarA;
            if (!kotlin.jvm.internal.L.f(eVar, eVarA) && eVar != null) {
                eVar.f367462c.a();
            }
        }
        H0 divData2 = getDivData();
        if (divData2 != null) {
            com.yandex.div.core.timer.b bVarQ = getDiv2Component().q();
            q21.c dataTag = getDataTag();
            com.yandex.div.json.expressions.e expressionResolver = getExpressionResolver();
            bVarQ.getClass();
            com.yandex.div.core.timer.a aVar = null;
            List<V7> list = divData2.f372512c;
            if (list != null) {
                com.yandex.div.core.view2.errors.d dVarA = bVarQ.f367707b.a(divData2, dataTag);
                Map<String, com.yandex.div.core.timer.a> map = bVarQ.f367708c;
                String str = dataTag.f428995a;
                com.yandex.div.core.timer.a aVar2 = map.get(str);
                C37916k c37916k = bVarQ.f367706a;
                if (aVar2 == null) {
                    aVar2 = new com.yandex.div.core.timer.a(dVarA);
                    for (V7 v72 : list) {
                        com.yandex.div.core.timer.i iVar = new com.yandex.div.core.timer.i(v72, c37916k, dVarA, expressionResolver);
                        String str2 = v72.f373758c;
                        LinkedHashMap linkedHashMap2 = aVar2.f367702b;
                        if (!linkedHashMap2.containsKey(str2)) {
                            linkedHashMap2.put(str2, iVar);
                        }
                    }
                    map.put(str, aVar2);
                }
                com.yandex.div.core.timer.a aVar3 = aVar2;
                List<V7> list2 = list;
                Iterator<T> it = list2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashSet = aVar3.f367703c;
                    linkedHashMap = aVar3.f367702b;
                    if (!zHasNext) {
                        break;
                    }
                    V7 v73 = (V7) it.next();
                    String str3 = v73.f373758c;
                    if ((linkedHashSet.contains(str3) ? (com.yandex.div.core.timer.i) linkedHashMap.get(str3) : null) == null) {
                        com.yandex.div.core.timer.i iVar2 = new com.yandex.div.core.timer.i(v73, c37916k, dVarA, expressionResolver);
                        String str4 = v73.f373758c;
                        if (!linkedHashMap.containsKey(str4)) {
                            linkedHashMap.put(str4, iVar2);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((V7) it2.next()).f373758c);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!arrayList.contains(entry.getKey())) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                for (com.yandex.div.core.timer.i iVar3 : linkedHashMap3.values()) {
                    iVar3.f367728e = null;
                    iVar3.f367733j.h();
                    iVar3.f367732i = true;
                }
                linkedHashSet.clear();
                linkedHashSet.addAll(arrayList);
                aVar = aVar3;
            }
            if (!kotlin.jvm.internal.L.f(getDivTimerEventDispatcher(), aVar) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
                divTimerEventDispatcher.a(this);
            }
            setDivTimerEventDispatcher$div_release(aVar);
            if (aVar != null) {
                Timer timer = new Timer();
                aVar.f367704d = timer;
                aVar.f367705e = this;
                Iterator it3 = aVar.f367703c.iterator();
                while (it3.hasNext()) {
                    com.yandex.div.core.timer.i iVar4 = (com.yandex.div.core.timer.i) aVar.f367702b.get((String) it3.next());
                    if (iVar4 != null) {
                        iVar4.f367728e = this;
                        Ticker ticker = iVar4.f367733j;
                        ticker.f367694o = timer;
                        if (iVar4.f367732i) {
                            ticker.g();
                            iVar4.f367732i = false;
                        }
                    }
                }
            }
        }
        this.f369144q.a(this.divData, getDataTag());
    }

    public void setDivTimerEventDispatcher$div_release(@Y61.l com.yandex.div.core.timer.a aVar) {
        this.divTimerEventDispatcher = aVar;
    }

    public void setPrevDataTag$div_release(@Y61.k q21.c cVar) {
        this.prevDataTag = cVar;
    }

    public void setStateId$div_release(long j12) {
        this.stateId = j12;
    }

    public void setVisualErrorsEnabled(boolean z12) {
        com.yandex.div.core.view2.errors.p pVarC = getViewComponent().c();
        pVarC.f369098b = z12;
        pVarC.b();
    }

    @Y61.l
    public final void t(@Y61.k String str, @Y61.k String str2) {
        com.yandex.div.core.expression.variables.k variableController = getVariableController();
        C21.h hVarC = variableController == null ? null : variableController.c(str);
        if (hVarC == null) {
            getViewComponent().d().a(getDivData(), getDivTag()).a(new VariableMutationException(AK.c.k("Variable '", str, "' not defined!"), null, 2, null));
            return;
        }
        try {
            hVarC.d(str2);
        } catch (VariableMutationException e12) {
            getViewComponent().d().a(getDivData(), getDivTag()).a(new VariableMutationException(AK.c.k("Variable '", str, "' mutation failed!"), e12));
        }
    }

    public final H0.d u(H0 h02) {
        Object next;
        long jV2 = v(h02);
        Iterator<T> it = h02.f372511b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((H0.d) next).f372522b == jV2) {
                break;
            }
        }
        return (H0.d) next;
    }

    public final long v(H0 h02) {
        com.yandex.div.core.state.k currentState = getCurrentState();
        Long lValueOf = currentState == null ? null : Long.valueOf(currentState.f367666a);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        List<H0.d> list = h02.f372511b;
        if (!list.isEmpty()) {
            return list.get(0).f372522b;
        }
        H0.c cVar = H0.f372502h;
        return -1L;
    }

    public final void w(@Y61.k C37980n c37980n) {
        synchronized (this.f369123A) {
            this.f369147t.add(c37980n);
        }
    }

    public final void x() {
        X xT2 = getDiv2Component().t();
        for (Map.Entry<View, AbstractC38330g> entry : this.f369149v.entrySet()) {
            View key = entry.getKey();
            AbstractC38330g value = entry.getValue();
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (key.isAttachedToWindow()) {
                xT2.d(this, key, value, C37931a.u(value.a()));
            }
        }
    }

    public final void y(H0.d dVar) {
        X xT2 = getDiv2Component().t();
        C38029k view = getView();
        AbstractC38330g abstractC38330g = dVar.f372521a;
        xT2.d(this, view, abstractC38330g, C37931a.u(abstractC38330g.a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        List<H0.d> list;
        H0 divData = getDivData();
        H0.d dVar = null;
        if (divData != null && (list = divData.f372511b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((H0.d) next).f372522b == getStateId()) {
                    dVar = next;
                    break;
                }
            }
            dVar = dVar;
        }
        if (dVar != null) {
            y(dVar);
        }
        x();
    }

    public C38029k(C37912g c37912g, AttributeSet attributeSet, int i12, long j12) {
        super(c37912g, attributeSet, i12);
        this.f369140m = j12;
        InterfaceC37908b interfaceC37908b = c37912g.f367538a;
        this.div2Component = interfaceC37908b;
        j.a aVarN = getDiv2Component().n();
        aVarN.a(this);
        this.viewComponent = aVarN.build();
        this.f369143p = getDiv2Component().o();
        this.f369144q = getViewComponent().h();
        this.f369145r = interfaceC37908b.p();
        this.f369146s = new ArrayList();
        this.f369147t = new ArrayList();
        this.f369148u = new ArrayList();
        this.f369149v = new WeakHashMap<>();
        this.f369150w = new WeakHashMap<>();
        this.f369151x = new a();
        this.f369123A = new Object();
        H0.c cVar = H0.f372502h;
        this.stateId = -1L;
        this.f369129G = m0.f367610m2;
        this.f369130H = new c(c37912g);
        this.f369131I = C42727D.b(LazyThreadSafetyMode.f406616d, new b());
        q21.c cVar2 = q21.c.f428994b;
        this.dataTag = cVar2;
        this.prevDataTag = cVar2;
        this.f369136N = -1L;
        this.viewCreateCallType = getDiv2Component().i().f367262e.compareAndSet(true, false) ? com.yandex.div.core.Q.f367257h.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
        this.f369138P = true;
        this.divTransitionHandler = new com.yandex.div.core.view2.animations.b(this);
        com.yandex.div.core.Q.f367255f.getClass();
        this.f369136N = SystemClock.uptimeMillis();
    }

    @k0
    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    @k0
    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    @com.yandex.div.histogram.j
    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public C38029k(C37912g c37912g, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(c37912g, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12, SystemClock.uptimeMillis());
    }
}
