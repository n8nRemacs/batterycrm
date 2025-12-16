package com.avito.android.comfortable_deal.deeplink;

import Uq0.InterfaceC15559a;
import Wp.InterfaceC15788a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ComfortableDealClientRoomDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/c;", "Lev/a;", "Lcom/avito/android/comfortable_deal/deeplink/ComfortableDealClientRoomDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29462c extends AbstractC40161a<ComfortableDealClientRoomDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f121899f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f121900g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f121901h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15788a f121902i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15559a f121903j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f121904k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.domain.a f121905l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C43238h f121906m;

    @Inject
    public C29462c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC15788a interfaceC15788a, @Y61.k InterfaceC15559a interfaceC15559a, @Y61.k com.avito.android.comfortable_deal.repository.a aVar, @Y61.k com.avito.android.comfortable_deal.domain.a aVar2, @Y61.k R0 r02) {
        this.f121899f = interfaceC4053a;
        this.f121900g = gVar;
        this.f121901h = iVar;
        this.f121902i = interfaceC15788a;
        this.f121903j = interfaceC15559a;
        this.f121904k = aVar;
        this.f121905l = aVar2;
        this.f121906m = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.comfortable_deal.deeplink.C29462c r21, com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplink r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.C29462c.k(com.avito.android.comfortable_deal.deeplink.c, com.avito.android.comfortable_deal.deeplink.ComfortableDealClientRoomDeeplink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f121906m, null, null, new C29460a(this, (ComfortableDealClientRoomDeeplink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f121906m, null);
    }
}
