package com.avito.android.publish.deeplink;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.CollectPublishParamsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29681g;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CollectPublishParamsDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/n;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CollectPublishParamsLink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends AbstractC40161a<CollectPublishParamsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.g f232583f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.details.buyout.f f232584g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f232585h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f232586i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f232587j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f232588k;

    @Inject
    public n(@Y61.k Context context, @Y61.k a.g gVar, @Y61.k com.avito.android.publish.details.buyout.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f232583f = gVar;
        this.f232584g = fVar;
        this.f232585h = aVar;
        this.f232586i = interfaceC35745a5;
        this.f232587j = context.getResources().getString(R.string.unknown_error);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        HashMap mapG;
        CollectPublishParamsLink collectPublishParamsLink = (CollectPublishParamsLink) deepLink;
        if (bundle == null || (mapG = com.avito.android.util.G.g(bundle)) == null) {
            j(new InterfaceC29681g.a(this.f232587j));
        } else {
            com.avito.android.publish.details.buyout.f fVar = this.f232584g;
            this.f232588k = A1.h(fVar.f233574a.w(collectPublishParamsLink.f133111b, mapG).z(fVar.f233575b.a()).F().j0(this.f232586i.e()).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C33555j(this)).I(new C33556k(this)), new C33557l(this), new C33558m(this), 2);
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f232588k;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
