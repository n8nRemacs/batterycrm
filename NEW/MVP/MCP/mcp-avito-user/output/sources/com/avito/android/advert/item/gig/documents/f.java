package com.avito.android.advert.item.gig.documents;

import Y41.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.authorization.AuthSource;
import com.avito.android.confirm_documents_bottom_sheet.models.DocumentButtonItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GigPersonalInfoPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/confirm_documents_bottom_sheet/models/DocumentButtonItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements l<DocumentButtonItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f75730l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f75730l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(DocumentButtonItem documentButtonItem) {
        DocumentButtonItem documentButtonItem2 = documentButtonItem;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = documentButtonItem2.f125593f;
        g gVar = this.f75730l;
        if (parametrizedClickStreamEvent != null) {
            gVar.f75732c.c(parametrizedClickStreamEvent);
        }
        DeepLink deepLink = documentButtonItem2.f125592e;
        if (deepLink != null) {
            boolean zB2 = gVar.f75733d.b();
            com.avito.android.deeplink_handler.handler.composite.a aVar = gVar.f75731b;
            if (zB2) {
                b.a.a(aVar, deepLink, null, null, 6);
            } else {
                b.a.a(aVar, new AuthenticateLink(AuthSource.f92707i0, false, deepLink, 2, (C42822w) null), null, null, 6);
            }
        }
        return G0.f406611a;
    }
}
