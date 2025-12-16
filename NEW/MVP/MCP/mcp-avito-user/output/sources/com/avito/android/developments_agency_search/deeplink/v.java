package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import rw.InterfaceC47923a;

/* compiled from: RealtyAgencySearchLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/v;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/developments_agency_search/deeplink/RealtyAgencySearchLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v extends com.avito.android.deeplink_handler.handler.base.coroutines.a<RealtyAgencySearchLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f136467g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f136468h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f136469i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47923a f136470j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Resources f136471k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14939a f136472l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f136473m;

    @Inject
    public v(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC47923a interfaceC47923a, @Y61.k Resources resources, @Y61.k InterfaceC14939a interfaceC14939a, @Y61.k R0 r02) {
        super(r02);
        this.f136467g = interfaceC4053a;
        this.f136468h = gVar;
        this.f136469i = iVar;
        this.f136470j = interfaceC47923a;
        this.f136471k = resources;
        this.f136472l = interfaceC14939a;
        this.f136473m = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((RealtyAgencySearchLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLink r57, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r58) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.deeplink.v.o(com.avito.android.developments_agency_search.deeplink.RealtyAgencySearchLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
