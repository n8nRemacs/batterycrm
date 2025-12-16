package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.view.View;
import com.yandex.div.core.dagger.InterfaceC37908b;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37989q;
import com.yandex.div.internal.drawable.ScalingDrawable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import v21.C49153a;

/* compiled from: DivBackgroundBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/r;", "Lcom/yandex/div/core/Y;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class r extends com.yandex.div.core.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C38029k f368687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f368688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37989q.a.C10877a f368689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ScalingDrawable f368691e;

    /* compiled from: DivBackgroundBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Bitmap, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScalingDrawable f368692l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScalingDrawable scalingDrawable) {
            super(1);
            this.f368692l = scalingDrawable;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Bitmap bitmap) {
            ScalingDrawable scalingDrawable = this.f368692l;
            scalingDrawable.f370073d = bitmap;
            scalingDrawable.f370076g = true;
            scalingDrawable.invalidateSelf();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C38029k c38029k, View view, C37989q.a.C10877a c10877a, com.yandex.div.json.expressions.e eVar, ScalingDrawable scalingDrawable) {
        super(c38029k);
        this.f368687a = c38029k;
        this.f368688b = view;
        this.f368689c = c10877a;
        this.f368690d = eVar;
        this.f368691e = scalingDrawable;
    }

    @Override // v21.b
    @j.j0
    public final void b(@Y61.k C49153a c49153a) {
        ArrayList arrayList;
        Bitmap bitmap = c49153a.f440420a;
        C37989q.a.C10877a c10877a = this.f368689c;
        ArrayList<C37989q.a.C10877a.AbstractC10878a> arrayList2 = c10877a.f368620g;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            for (C37989q.a.C10877a.AbstractC10878a abstractC10878a : arrayList2) {
                abstractC10878a.getClass();
                if (!(abstractC10878a instanceof C37989q.a.C10877a.AbstractC10878a.C10879a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList3.add(((C37989q.a.C10877a.AbstractC10878a.C10879a) abstractC10878a).f368622b);
            }
            arrayList = arrayList3;
        }
        InterfaceC37908b div2Component = this.f368687a.getDiv2Component();
        ScalingDrawable scalingDrawable = this.f368691e;
        com.yandex.div.core.view2.divs.widgets.z.a(new a(scalingDrawable), bitmap, this.f368688b, div2Component, this.f368690d, arrayList);
        scalingDrawable.setAlpha((int) (c10877a.f368614a * 255));
        int iOrdinal = c10877a.f368619f.ordinal();
        scalingDrawable.f370070a = iOrdinal != 0 ? iOrdinal != 2 ? iOrdinal != 3 ? ScalingDrawable.ScaleType.f370089b : ScalingDrawable.ScaleType.f370092e : ScalingDrawable.ScaleType.f370090c : ScalingDrawable.ScaleType.f370091d;
        int iOrdinal2 = c10877a.f368615b.ordinal();
        scalingDrawable.f370071b = iOrdinal2 != 1 ? iOrdinal2 != 2 ? ScalingDrawable.AlignmentHorizontal.f370081b : ScalingDrawable.AlignmentHorizontal.f370083d : ScalingDrawable.AlignmentHorizontal.f370082c;
        int iOrdinal3 = c10877a.f368616c.ordinal();
        scalingDrawable.f370072c = iOrdinal3 != 1 ? iOrdinal3 != 2 ? ScalingDrawable.AlignmentVertical.f370085b : ScalingDrawable.AlignmentVertical.f370087d : ScalingDrawable.AlignmentVertical.f370086c;
    }
}
