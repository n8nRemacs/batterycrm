package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.DivAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivStateBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/Z1;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368289a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.P f368290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f368291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.state.a f368292d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.state.n f368293e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C37955g f368294f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.n f368295g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368296h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC37915j f368297i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.X f368298j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.view2.errors.f f368299k;

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/u0", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C38029k f368301c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f368302d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AbstractC38330g f368303e;

        public a(C38029k c38029k, View view, AbstractC38330g abstractC38330g) {
            this.f368301c = c38029k;
            this.f368302d = view;
            this.f368303e = abstractC38330g;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            com.yandex.div.core.view2.X x12 = Z1.this.f368298j;
            View view2 = this.f368302d;
            AbstractC38330g abstractC38330g = this.f368303e;
            x12.d(this.f368301c, view2, abstractC38330g, C37931a.u(abstractC38330g.a()));
        }
    }

    /* compiled from: DivStateBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C38029k f368304l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<DivAction> f368305m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Z1 f368306n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.t f368307o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38029k c38029k, Z1 z12, com.yandex.div.core.view2.divs.widgets.t tVar, List list) {
            super(0);
            this.f368304l = c38029k;
            this.f368305m = list;
            this.f368306n = z12;
            this.f368307o = tVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.yandex.div.core.view2.divs.widgets.t tVar = this.f368307o;
            List<DivAction> list = this.f368305m;
            Z1 z12 = this.f368306n;
            C38029k c38029k = this.f368304l;
            c38029k.m(new C37934a2(c38029k, z12, tVar, list));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DivStateBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C38029k f368309m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.state.f f368310n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38029k c38029k, com.yandex.div.core.state.f fVar) {
            super(0);
            this.f368309m = c38029k;
            this.f368310n = fVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.yandex.div.core.view2.errors.f fVar = Z1.this.f368299k;
            C38029k c38029k = this.f368309m;
            fVar.a(c38029k.getDivData(), c38029k.getDataTag()).a(new ParsingException(ParsingExceptionReason.f370545c, AK.c.k("Value for key 'id' at path '", this.f368310n.toString(), "' is missing"), null, null, null, 28, null));
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public Z1(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.view2.P p12, @Y61.k dagger.internal.f fVar, @Y61.k com.yandex.div.state.a aVar, @Y61.k com.yandex.div.core.state.n nVar, @Y61.k C37955g c37955g, @Y61.k com.yandex.div.core.downloader.n nVar2, @Y61.k com.yandex.div.core.downloader.k kVar, @Y61.k InterfaceC37915j interfaceC37915j, @Y61.k com.yandex.div.core.view2.X x12, @Y61.k com.yandex.div.core.view2.errors.f fVar2) {
        this.f368289a = c38006w;
        this.f368290b = p12;
        this.f368291c = fVar;
        this.f368292d = aVar;
        this.f368293e = nVar;
        this.f368294f = c37955g;
        this.f368295g = nVar2;
        this.f368296h = kVar;
        this.f368297i = interfaceC37915j;
        this.f368298j = x12;
        this.f368299k = fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.t r28, @Y61.k com.yandex.div2.C38404j6 r29, @Y61.k com.yandex.div.core.view2.C38029k r30, @Y61.k com.yandex.div.core.state.f r31) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.Z1.a(com.yandex.div.core.view2.divs.widgets.t, com.yandex.div2.j6, com.yandex.div.core.view2.k, com.yandex.div.core.state.f):void");
    }

    public final void b(View view, C38029k c38029k) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        Iterator itA = C22816e.a((ViewGroup) view);
        while (true) {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                return;
            }
            View view2 = (View) c22833m0.next();
            AbstractC38330g abstractC38330gA = c38029k.A(view2);
            if (abstractC38330gA != null) {
                this.f368298j.d(c38029k, null, abstractC38330gA, C37931a.u(abstractC38330gA.a()));
            }
            b(view2, c38029k);
        }
    }
}
