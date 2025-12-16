package com.avito.android.serp.adapter.constructor.rich;

import android.net.Uri;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.service_order_widget.serp.ServiceOrderRequestLoadingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class w extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceOrderButtonModel f269707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f269708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f269709o;

    /* compiled from: ConstructorAdvertItemRichPresenter.kt */
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
    public w(SerpConstructorAdvertItem serpConstructorAdvertItem, ServiceOrderButtonModel serviceOrderButtonModel, z zVar, C c12) {
        super(0);
        this.f269706l = serpConstructorAdvertItem;
        this.f269707m = serviceOrderButtonModel;
        this.f269708n = zVar;
        this.f269709o = c12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269706l;
        if (serpConstructorAdvertItem.getServiceOrderRequestLoadingState().ordinal() == 0) {
            z zVar = this.f269708n;
            ServiceOrderButtonModel serviceOrderButtonModel = this.f269707m;
            DeepLink deeplinkToOverride = serviceOrderButtonModel.getDeeplinkToOverride();
            if (deeplinkToOverride == null) {
                String strFindServiceOrderDeeplinkAsString = serviceOrderButtonModel.findServiceOrderDeeplinkAsString();
                if (strFindServiceOrderDeeplinkAsString == null) {
                    strFindServiceOrderDeeplinkAsString = "";
                }
                deeplinkToOverride = zVar.f269722k.e(Uri.parse(strFindServiceOrderDeeplinkAsString));
            }
            serviceOrderButtonModel.setLoading(deeplinkToOverride instanceof com.avito.android.service_order_widget.link.a);
            this.f269709o.Ee(deeplinkToOverride instanceof com.avito.android.service_order_widget.link.a);
            com.avito.android.serp.adapter.constructor.q qVar = zVar.f269715d.get();
            String f75565j = serpConstructorAdvertItem.getF262931b();
            ContactSource contactSource = ContactSource.f89919d;
            qVar.y(deeplinkToOverride, f75565j);
        }
        return G0.f406611a;
    }
}
