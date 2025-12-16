package com.avito.android.verification.links.redirect;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import zz.InterfaceC50647a;

/* compiled from: VerificationRedirectLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/redirect/d;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/verification/links/redirect/VerificationRedirectLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VerificationRedirectLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f324345g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f324346h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f324347i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final g f324348j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f324349k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f324350l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R0 f324351m;

    @Inject
    public d(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k g gVar2, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02) {
        super(r02);
        this.f324345g = aVar;
        this.f324346h = gVar;
        this.f324347i = iVar;
        this.f324348j = gVar2;
        this.f324349k = interfaceC50647a;
        this.f324350l = interfaceC28373a;
        this.f324351m = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((VerificationRedirectLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.verification.links.redirect.VerificationRedirectLink r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.redirect.d.o(com.avito.android.verification.links.redirect.VerificationRedirectLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
