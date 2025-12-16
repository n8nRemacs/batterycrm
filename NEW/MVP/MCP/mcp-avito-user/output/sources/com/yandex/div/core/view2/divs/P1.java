package com.yandex.div.core.view2.divs;

import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.expression.variables.f;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.internal.widget.slider.d;
import kotlin.Metadata;

/* compiled from: DivSliderBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/P1;", "Lcom/yandex/div/core/expression/variables/f$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class P1 implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.r f368191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f368192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C38029k f368193c;

    /* compiled from: DivSliderBinder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/view2/divs/P1$a", "Lcom/yandex/div/internal/widget/slider/d$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ M1 f368194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, kotlin.G0> f368195b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(M1 m12, C38029k c38029k, com.yandex.div.core.view2.divs.widgets.r rVar, Y41.l<? super Long, kotlin.G0> lVar) {
            this.f368194a = m12;
            this.f368195b = lVar;
        }

        @Override // com.yandex.div.internal.widget.slider.d.b
        public final void b(@Y61.l Float f12) {
            this.f368194a.f368151b.getClass();
            InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
            this.f368195b.invoke(Long.valueOf(f12 == null ? 0L : kotlin.math.b.c(f12.floatValue())));
        }
    }

    public P1(com.yandex.div.core.view2.divs.widgets.r rVar, M1 m12, C38029k c38029k) {
        this.f368191a = rVar;
        this.f368192b = m12;
        this.f368193c = c38029k;
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void a(Long l12) {
        this.f368191a.l(l12 == null ? null : Float.valueOf(r4.longValue()), false, true);
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void b(@Y61.k Y41.l<? super Long, kotlin.G0> lVar) {
        M1 m12 = this.f368192b;
        C38029k c38029k = this.f368193c;
        com.yandex.div.core.view2.divs.widgets.r rVar = this.f368191a;
        rVar.f370347c.b(new a(m12, c38029k, rVar, lVar));
    }
}
