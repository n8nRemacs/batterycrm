package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.widget.slider.d;
import com.yandex.div2.T5;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/M1;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/T5;", "Lcom/yandex/div/core/view2/divs/widgets/r;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class M1 implements com.yandex.div.core.view2.N<T5, com.yandex.div.core.view2.divs.widgets.r> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368150a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37915j f368151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.font.a f368152c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.expression.variables.f f368153d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368154e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368155f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.yandex.div.core.view2.errors.d f368156g;

    /* compiled from: DivSliderBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "minValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368157l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ M1 f368158m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.yandex.div.core.view2.divs.widgets.r rVar, M1 m12) {
            super(1);
            this.f368157l = rVar;
            this.f368158m = m12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            float fLongValue = l12.longValue();
            com.yandex.div.core.view2.divs.widgets.r rVar = this.f368157l;
            rVar.setMinValue(fLongValue);
            this.f368158m.b(rVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivSliderBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "maxValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368159l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ M1 f368160m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.yandex.div.core.view2.divs.widgets.r rVar, M1 m12) {
            super(1);
            this.f368159l = rVar;
            this.f368160m = m12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            float fLongValue = l12.longValue();
            com.yandex.div.core.view2.divs.widgets.r rVar = this.f368159l;
            rVar.setMaxValue(fLongValue);
            this.f368160m.b(rVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V", "androidx/core/view/v0"}, k = 3, mv = {1, 5, 1})
    public static final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368161b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M1 f368162c;

        public c(com.yandex.div.core.view2.divs.widgets.r rVar, com.yandex.div.core.view2.divs.widgets.r rVar2, M1 m12) {
            this.f368161b = rVar2;
            this.f368162c = m12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            M1 m12;
            com.yandex.div.core.view2.errors.d dVar;
            com.yandex.div.core.view2.errors.d dVar2;
            com.yandex.div.core.view2.divs.widgets.r rVar = this.f368161b;
            if (rVar.getActiveTickMarkDrawable() == null && rVar.getInactiveTickMarkDrawable() == null) {
                return;
            }
            float maxValue = rVar.getMaxValue() - rVar.getMinValue();
            Drawable activeTickMarkDrawable = rVar.getActiveTickMarkDrawable();
            boolean z12 = false;
            int intrinsicWidth = activeTickMarkDrawable == null ? 0 : activeTickMarkDrawable.getIntrinsicWidth();
            if (Math.max(intrinsicWidth, rVar.getInactiveTickMarkDrawable() == null ? 0 : r4.getIntrinsicWidth()) * maxValue <= rVar.getWidth() || (dVar = (m12 = this.f368162c).f368156g) == null) {
                return;
            }
            ListIterator listIterator = dVar.f369070e.listIterator();
            while (listIterator.hasNext()) {
                if (kotlin.jvm.internal.L.f(((Throwable) listIterator.next()).getMessage(), "Slider ticks overlap each other.")) {
                    z12 = true;
                }
            }
            if (z12 || (dVar2 = m12.f368156g) == null) {
                return;
            }
            dVar2.b(new Throwable("Slider ticks overlap each other."));
        }
    }

    @Inject
    public M1(@Y61.k C38006w c38006w, @Y61.k InterfaceC37915j interfaceC37915j, @Y61.k com.yandex.div.core.font.a aVar, @Y61.k com.yandex.div.core.expression.variables.f fVar, @Y61.k com.yandex.div.core.view2.errors.f fVar2, @com.yandex.div.core.dagger.B boolean z12) {
        this.f368150a = c38006w;
        this.f368151b = interfaceC37915j;
        this.f368152c = aVar;
        this.f368153d = fVar;
        this.f368154e = fVar2;
        this.f368155f = z12;
    }

    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.r rVar, @Y61.k T5 t52, @Y61.k C38029k c38029k) {
        kotlin.G0 g02;
        T5 div = rVar.getDiv();
        this.f368156g = this.f368154e.a(c38029k.getDivData(), c38029k.getDataTag());
        if (t52.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        rVar.g();
        rVar.setDiv$div_release(t52);
        C38006w c38006w = this.f368150a;
        if (div != null) {
            c38006w.h(c38029k, rVar, div);
        }
        c38006w.d(rVar, t52, div, c38029k);
        rVar.e(t52.f373639o.e(expressionResolver, new a(rVar, this)));
        rVar.e(t52.f373638n.e(expressionResolver, new b(rVar, this)));
        com.yandex.div.core.q0<d.b> q0Var = rVar.f370347c;
        q0Var.getClass();
        int i12 = q0Var.f367631c;
        ArrayList arrayList = q0Var.f367630b;
        if (i12 == 0) {
            arrayList.clear();
        } else {
            int size = arrayList.size();
            q0Var.f367632d |= size != 0;
            for (int i13 = 0; i13 < size; i13++) {
                arrayList.set(i13, null);
            }
        }
        com.yandex.div.core.expression.variables.f fVar = this.f368153d;
        String str = t52.f373648x;
        if (str != null) {
            rVar.e(fVar.a(c38029k, str, new S1(rVar, this, c38029k)));
        }
        Q1 q12 = new Q1(this, rVar, expressionResolver);
        com.yandex.div2.W0 w02 = t52.f373646v;
        C37931a.E(rVar, expressionResolver, w02, q12);
        com.yandex.div.core.font.a aVar = this.f368152c;
        T5.f fVar2 = t52.f373647w;
        rVar.setThumbTextDrawable(fVar2 == null ? null : new L21.b(X1.a(fVar2, rVar.getResources().getDisplayMetrics(), aVar, expressionResolver)));
        if (fVar2 != null) {
            rVar.e(fVar2.f373667e.d(expressionResolver, new R1(this, rVar, expressionResolver, fVar2)));
        }
        String str2 = t52.f373645u;
        if (str2 == null) {
            rVar.setThumbSecondaryDrawable(null);
            rVar.l(null, false, true);
        } else {
            rVar.e(fVar.a(c38029k, str2, new P1(rVar, this, c38029k)));
            com.yandex.div2.W0 w03 = t52.f373643s;
            if (w03 == null) {
                g02 = null;
            } else {
                C37931a.E(rVar, expressionResolver, w03, new N1(this, rVar, expressionResolver));
                g02 = kotlin.G0.f406611a;
            }
            if (g02 == null) {
                C37931a.E(rVar, expressionResolver, w02, new N1(this, rVar, expressionResolver));
            }
            T5.f fVar3 = t52.f373644t;
            rVar.setThumbSecondTextDrawable(fVar3 != null ? new L21.b(X1.a(fVar3, rVar.getResources().getDisplayMetrics(), aVar, expressionResolver)) : null);
            if (fVar3 != null) {
                rVar.e(fVar3.f373667e.d(expressionResolver, new O1(this, rVar, expressionResolver, fVar3)));
            }
        }
        C37931a.E(rVar, expressionResolver, t52.f373614B, new V1(this, rVar, expressionResolver));
        C37931a.E(rVar, expressionResolver, t52.f373615C, new W1(this, rVar, expressionResolver));
        com.yandex.div2.W0 w04 = t52.f373649y;
        if (w04 != null) {
            C37931a.E(rVar, expressionResolver, w04, new T1(this, rVar, expressionResolver));
        }
        com.yandex.div2.W0 w05 = t52.f373650z;
        if (w05 == null) {
            return;
        }
        C37931a.E(rVar, expressionResolver, w05, new U1(this, rVar, expressionResolver));
    }

    public final void b(com.yandex.div.core.view2.divs.widgets.r rVar) {
        if (!this.f368155f || this.f368156g == null) {
            return;
        }
        androidx.core.view.P.b(rVar, new c(rVar, rVar, this));
    }
}
