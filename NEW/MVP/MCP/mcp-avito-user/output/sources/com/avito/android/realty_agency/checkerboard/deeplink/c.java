package com.avito.android.realty_agency.checkerboard.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bi0.InterfaceC25655a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.realty_agency.checkerboard.j;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: CheckerboardLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/deeplink/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/realty_agency/checkerboard/deeplink/CheckerboardLink;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<CheckerboardLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f251096g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f251097h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f251098i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final j f251099j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final R0 f251100k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC25655a f251101l;

    @Inject
    public c(@k a.InterfaceC4053a interfaceC4053a, @k a.g gVar, @k a.i iVar, @k j jVar, @k R0 r02, @k InterfaceC25655a interfaceC25655a) {
        super(r02);
        this.f251096g = interfaceC4053a;
        this.f251097h = gVar;
        this.f251098i = iVar;
        this.f251099j = jVar;
        this.f251100k = r02;
        this.f251101l = interfaceC25655a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((CheckerboardLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.realty_agency.checkerboard.deeplink.CheckerboardLink r54, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r55) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.deeplink.c.o(com.avito.android.realty_agency.checkerboard.deeplink.CheckerboardLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
