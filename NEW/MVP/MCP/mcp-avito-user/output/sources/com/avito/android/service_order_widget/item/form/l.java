package com.avito.android.service_order_widget.item.form;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.service_order_widget.item.form.c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderFormWidgetView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "lineSpaceAvailable", "", "position", "Lkotlin/G0;", "invoke", "(ZI)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements p<Boolean, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f278919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f278920m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f278921n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, String str, c cVar) {
        super(2);
        this.f278919l = iVar;
        this.f278920m = str;
        this.f278921n = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(Boolean bool, Integer num) {
        DeepLink noMatchLink;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        i iVar = this.f278919l;
        if (!iVar.f278914i.isEmpty() && !zBooleanValue && 1 <= iIntValue && iIntValue < iVar.f278914i.size()) {
            List<com.avito.android.lib.design.chips.h> listSubList = iVar.f278914i.subList(0, iIntValue - 1);
            iVar.f278914i = listSubList;
            ServiceOrderWidget.ServiceOrderWidgetAction serviceOrderWidgetAction = this.f278921n.f278892g;
            if (serviceOrderWidgetAction == null || (noMatchLink = serviceOrderWidgetAction.getUri()) == null) {
                noMatchLink = new NoMatchLink();
            }
            listSubList.add(new c.a(this.f278920m, noMatchLink));
            iVar.f278909d.post(new com.avito.android.publish.screen.objects.view.actions.h(iVar, 16));
        }
        return G0.f406611a;
    }
}
