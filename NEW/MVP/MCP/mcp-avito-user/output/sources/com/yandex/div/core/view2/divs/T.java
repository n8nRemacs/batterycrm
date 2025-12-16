package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.animations.b;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: DivBaseBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/DivVisibility;", "visibility", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/DivVisibility;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<DivVisibility, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f368222l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div2.H f368223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368224n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C38006w f368225o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C38029k f368226p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(View view, com.yandex.div2.H h12, com.yandex.div.json.expressions.e eVar, C38006w c38006w, C38029k c38029k) {
        super(1);
        this.f368222l = view;
        this.f368223m = h12;
        this.f368224n = eVar;
        this.f368225o = c38006w;
        this.f368226p = c38029k;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(DivVisibility divVisibility) {
        int i12;
        DivVisibility divVisibility2 = divVisibility;
        DivVisibility divVisibility3 = DivVisibility.GONE;
        com.yandex.div.json.expressions.e eVar = this.f368224n;
        com.yandex.div2.H h12 = this.f368223m;
        View view = this.f368222l;
        if (divVisibility2 != divVisibility3) {
            C37931a.l(view, eVar, h12);
        }
        this.f368225o.getClass();
        C38029k c38029k = this.f368226p;
        com.yandex.div.core.view2.animations.b divTransitionHandler = c38029k.getDivTransitionHandler();
        int iOrdinal = divVisibility2.ordinal();
        if (iOrdinal == 0) {
            i12 = 0;
        } else if (iOrdinal == 1) {
            i12 = 4;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 8;
        }
        if (divVisibility2 != DivVisibility.VISIBLE) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List<DivTransitionTrigger> listO = h12.o();
        androidx.transition.L lB2 = null;
        if (listO == null || listO.contains(DivTransitionTrigger.VISIBILITY_CHANGE)) {
            b.a.C10867a c10867a = (b.a.C10867a) C42745f0.S(com.yandex.div.core.view2.animations.b.b(view, divTransitionHandler.f367915b));
            if (c10867a == null && (c10867a = (b.a.C10867a) C42745f0.S(com.yandex.div.core.view2.animations.b.b(view, divTransitionHandler.f367916c))) == null) {
                c10867a = null;
            }
            if (c10867a != null) {
                visibility = c10867a.f367918a;
            }
            com.yandex.div.core.view2.H hA2 = c38029k.getViewComponent().a();
            if ((visibility == 4 || visibility == 8) && i12 == 0) {
                com.yandex.div2.B f371351g = h12.getF374807C();
                if (f371351g == null) {
                    hA2.getClass();
                } else {
                    lB2 = hA2.b(f371351g, 1, eVar);
                }
            } else if ((i12 == 4 || i12 == 8) && visibility == 0) {
                com.yandex.div2.B f371352h = h12.getF374808D();
                if (f371352h == null) {
                    hA2.getClass();
                } else {
                    lB2 = hA2.b(f371352h, 2, eVar);
                }
            } else if (c10867a != null) {
                androidx.transition.Q.b(c38029k);
            }
            if (lB2 != null) {
                lB2.b(view);
            }
        }
        if (lB2 != null) {
            divTransitionHandler.c(lB2, view, new b.a.C10867a(i12));
        } else {
            view.setVisibility(i12);
        }
        c38029k.x();
        return kotlin.G0.f406611a;
    }
}
