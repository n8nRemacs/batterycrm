package com.avito.android.services_realty_sheet.link;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import pv0.C47154c;

/* compiled from: ServicesRealtySheetLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f280424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f280425m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, String str) {
        super(1);
        this.f280424l = eVar;
        this.f280425m = str;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        e eVar = this.f280424l;
        eVar.f280434j.c(new C47154c(this.f280425m));
        b.a.a(eVar.f280431g, deepLink, null, null, 6);
        return G0.f406611a;
    }
}
