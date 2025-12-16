package com.avito.android.publish.details;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AddressParameter f233213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K1 f233214m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(AddressParameter addressParameter, K1 k12) {
        super(0);
        this.f233213l = addressParameter;
        this.f233214m = k12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        AddressParameter.Widget.Config config;
        TooltipOptions tooltipOptions;
        TooltipOptions.Button button;
        DeepLink deeplink;
        AddressParameter.Widget widget = this.f233213l.getWidget();
        if (widget != null && (config = widget.getConfig()) != null && (tooltipOptions = config.getTooltipOptions()) != null && (button = tooltipOptions.getButton()) != null && (deeplink = button.getDeeplink()) != null) {
            b.a.a(this.f233214m.f232981d0, deeplink, null, null, 6);
        }
        return kotlin.G0.f406611a;
    }
}
