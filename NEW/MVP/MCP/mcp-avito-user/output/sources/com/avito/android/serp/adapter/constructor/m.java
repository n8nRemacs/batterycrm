package com.avito.android.serp.adapter.constructor;

import android.net.Uri;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_order_widget.serp.ServiceOrderRequestLoadingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorAdvertItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceOrderButtonModel f269512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f269513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.n f269514o;

    /* compiled from: ConstructorAdvertItemPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ServiceOrderRequestLoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ServiceOrderRequestLoadingState serviceOrderRequestLoadingState = ServiceOrderRequestLoadingState.f279048b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SerpConstructorAdvertItem serpConstructorAdvertItem, ServiceOrderButtonModel serviceOrderButtonModel, o oVar, com.avito.android.constructor_advert.ui.serp.constructor.n nVar) {
        super(0);
        this.f269511l = serpConstructorAdvertItem;
        this.f269512m = serviceOrderButtonModel;
        this.f269513n = oVar;
        this.f269514o = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269511l;
        if (serpConstructorAdvertItem.getServiceOrderRequestLoadingState().ordinal() == 0) {
            ServiceOrderButtonModel serviceOrderButtonModel = this.f269512m;
            DeepLink deeplinkToOverride = serviceOrderButtonModel.getDeeplinkToOverride();
            o oVar = this.f269513n;
            if (deeplinkToOverride == null) {
                com.avito.android.deep_linking.x xVar = oVar.f269521m;
                String strFindServiceOrderDeeplinkAsString = serviceOrderButtonModel.findServiceOrderDeeplinkAsString();
                if (strFindServiceOrderDeeplinkAsString == null) {
                    strFindServiceOrderDeeplinkAsString = "";
                }
                deeplinkToOverride = xVar.e(Uri.parse(strFindServiceOrderDeeplinkAsString));
            }
            serviceOrderButtonModel.setLoading(deeplinkToOverride instanceof com.avito.android.service_order_widget.link.a);
            this.f269514o.Ee(deeplinkToOverride instanceof com.avito.android.service_order_widget.link.a);
            q qVar = oVar.f269517i.get();
            String f84108c = serpConstructorAdvertItem.getF327359b();
            ContactSource contactSource = ContactSource.f89919d;
            qVar.y(deeplinkToOverride, f84108c);
        }
        return G0.f406611a;
    }
}
