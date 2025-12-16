package com.avito.android.publish.screen.step.params.view;

import com.avito.android.remote.model.category_parameters.TooltipOptions;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TooltipOptions f241649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f241650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f241651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TooltipOptions tooltipOptions, Y41.a<G0> aVar, j jVar) {
        super(1);
        this.f241649l = tooltipOptions;
        this.f241650m = aVar;
        this.f241651n = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        String text;
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        TooltipOptions tooltipOptions = this.f241649l;
        String text2 = tooltipOptions.getText();
        if (text2 != null) {
            oVar2.b(text2);
        }
        TooltipOptions.Button button = tooltipOptions.getButton();
        if (button != null && (text = button.getText()) != null) {
            oVar2.d(text);
            oVar2.c(new com.avito.android.publish.details.adapter.edit_category.h(22, this.f241650m));
        }
        oVar2.f(true);
        oVar2.e(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this.f241651n, 17));
        return G0.f406611a;
    }
}
