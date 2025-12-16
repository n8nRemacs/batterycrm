package com.avito.android.verification.links.start;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import zz.InterfaceC50647a;

/* compiled from: VerificationStartLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/start/d;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/deep_linking/links/VerificationStartLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VerificationStartLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324510g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f324511h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f324512i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final g f324513j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC50647a f324514k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final R0 f324515l;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k g gVar2, @k InterfaceC50647a interfaceC50647a, @k R0 r02) {
        super(r02);
        this.f324510g = aVar;
        this.f324511h = gVar;
        this.f324512i = iVar;
        this.f324513j = gVar2;
        this.f324514k = interfaceC50647a;
        this.f324515l = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((VerificationStartLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.deep_linking.links.VerificationStartLink r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.start.d.o(com.avito.android.deep_linking.links.VerificationStartLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
