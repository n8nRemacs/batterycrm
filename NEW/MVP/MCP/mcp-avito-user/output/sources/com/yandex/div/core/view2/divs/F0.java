package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.InterfaceC37911f;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38304f2;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DivGridBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/F0;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/f2;", "Lcom/yandex/div/core/view2/divs/widgets/h;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class F0 implements com.yandex.div.core.view2.N<C38304f2, com.yandex.div.core.view2.divs.widgets.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368058a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.n f368059b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.downloader.k f368060c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f368061d;

    /* compiled from: DivGridBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "columnCount", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.h f368062l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.yandex.div.core.view2.divs.widgets.h hVar) {
            super(1);
            this.f368062l = hVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            int i12;
            long jLongValue = l12.longValue();
            long j12 = jLongValue >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue;
            } else {
                int i13 = com.yandex.div.internal.n.f370123a;
                i12 = jLongValue > 0 ? Integer.MAX_VALUE : BeduinInputModel.MIN_TEXT_VERSION;
            }
            this.f368062l.setColumnCount(i12);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public F0(@Y61.k C38006w c38006w, @Y61.k com.yandex.div.core.downloader.n nVar, @Y61.k com.yandex.div.core.downloader.k kVar, @Y61.k dagger.internal.f fVar) {
        this.f368058a = c38006w;
        this.f368059b = nVar;
        this.f368060c = kVar;
        this.f368061d = fVar;
    }

    public static void a(View view, com.yandex.div.json.expressions.e eVar, com.yandex.div2.H h12) {
        Long lA2;
        Long lA3;
        int i12;
        com.yandex.div.json.expressions.b<Long> bVarJ = h12.j();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar = layoutParams instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams : null;
        int i13 = BeduinInputModel.MIN_TEXT_VERSION;
        int i14 = 1;
        if (cVar != null) {
            if (bVarJ == null || (lA3 = bVarJ.a(eVar)) == null) {
                i12 = 1;
            } else {
                long jLongValue = lA3.longValue();
                long j12 = jLongValue >> 31;
                if (j12 == 0 || j12 == -1) {
                    i12 = (int) jLongValue;
                } else {
                    int i15 = com.yandex.div.internal.n.f370123a;
                    i12 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if (cVar.f370247e != i12) {
                cVar.f370247e = i12;
                view.requestLayout();
            }
        }
        com.yandex.div.json.expressions.b<Long> bVarL = h12.l();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        com.yandex.div.internal.widget.c cVar2 = layoutParams2 instanceof com.yandex.div.internal.widget.c ? (com.yandex.div.internal.widget.c) layoutParams2 : null;
        if (cVar2 == null) {
            return;
        }
        if (bVarL != null && (lA2 = bVarL.a(eVar)) != null) {
            long jLongValue2 = lA2.longValue();
            long j13 = jLongValue2 >> 31;
            if (j13 == 0 || j13 == -1) {
                i14 = (int) jLongValue2;
            } else {
                int i16 = com.yandex.div.internal.n.f370123a;
                if (jLongValue2 > 0) {
                    i13 = Integer.MAX_VALUE;
                }
                i14 = i13;
            }
        }
        if (cVar2.f370248f != i14) {
            cVar2.f370248f = i14;
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@Y61.k com.yandex.div.core.view2.divs.widgets.h hVar, @Y61.k C38304f2 c38304f2, @Y61.k C38029k c38029k, @Y61.k com.yandex.div.core.state.f fVar) {
        int size;
        int iJ2;
        C38304f2 div = hVar.getDiv();
        c38304f2.equals(div);
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        hVar.g();
        hVar.setDiv$div_release(c38304f2);
        hVar.setReleaseViewVisitor$div_release(c38029k.getReleaseViewVisitor$div_release());
        C38006w c38006w = this.f368058a;
        if (div != null) {
            c38006w.h(c38029k, hVar, div);
        }
        c38006w.d(hVar, c38304f2, div, c38029k);
        C37931a.c(hVar, c38029k, c38304f2.f374815b, c38304f2.f374817d, c38304f2.f374834u, c38304f2.f374828o, c38304f2.f374816c);
        hVar.e(c38304f2.f374823j.e(expressionResolver, new a(hVar)));
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVar = c38304f2.f374825l;
        DivAlignmentHorizontal divAlignmentHorizontalA = bVar.a(expressionResolver);
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVar2 = c38304f2.f374826m;
        hVar.setGravity(C37931a.r(divAlignmentHorizontalA, bVar2.a(expressionResolver)));
        G0 g02 = new G0(hVar, bVar, expressionResolver, bVar2);
        hVar.e(bVar.d(expressionResolver, g02));
        hVar.e(bVar2.d(expressionResolver, g02));
        List<AbstractC38330g> list = c38304f2.f374833t;
        if (div != null && (size = list.size()) <= (iJ2 = C42745f0.J(div.f374833t))) {
            while (true) {
                int i12 = size + 1;
                c38029k.A(hVar.getChildAt(size));
                if (size == iJ2) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        int size2 = list.size();
        int i13 = 0;
        while (i13 < size2) {
            int i14 = i13 + 1;
            com.yandex.div2.H hA2 = list.get(i13).a();
            View childAt = hVar.getChildAt(i13);
            if (hA2.getF371376s() != null) {
                this.f368059b.f367432a.a(c38029k.getDataTag());
                this.f368060c.a(c38029k.getDataTag());
            }
            childAt.setLayoutParams(new com.yandex.div.internal.widget.c(-2, -2));
            ((C38040w) this.f368061d.get()).b(childAt, list.get(i13), c38029k, fVar);
            c38006w.c(childAt, hA2, null, expressionResolver);
            a(childAt, expressionResolver, hA2);
            if (childAt instanceof F21.b) {
                Y41.l<? super Long, kotlin.G0> e02 = new E0(this, childAt, expressionResolver, hA2);
                F21.b bVar3 = (F21.b) childAt;
                com.yandex.div.json.expressions.b<Long> bVarJ = hA2.j();
                InterfaceC37911f interfaceC37911fD = bVarJ == null ? null : bVarJ.d(expressionResolver, e02);
                if (interfaceC37911fD == null) {
                    interfaceC37911fD = InterfaceC37911f.f367528l2;
                }
                bVar3.e(interfaceC37911fD);
                com.yandex.div.json.expressions.b<Long> bVarL = hA2.l();
                InterfaceC37911f interfaceC37911fD2 = bVarL == null ? null : bVarL.d(expressionResolver, e02);
                if (interfaceC37911fD2 == null) {
                    interfaceC37911fD2 = InterfaceC37911f.f367528l2;
                }
                bVar3.e(interfaceC37911fD2);
            }
            if (C37931a.v(hA2)) {
                c38029k.k(childAt, list.get(i13));
            } else {
                c38029k.A(childAt);
            }
            i13 = i14;
        }
        C37931a.S(hVar, list, div == null ? null : div.f374833t, c38029k);
    }
}
