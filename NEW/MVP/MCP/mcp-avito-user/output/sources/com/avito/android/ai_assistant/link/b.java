package com.avito.android.ai_assistant.link;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.ai_assistant.AiAssistantOpenLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AiAssistantOpenLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/link/b;", "Lev/a;", "Lcom/avito/android/ai_assistant/AiAssistantOpenLink;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AiAssistantOpenLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Ib.c f89094f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f89095g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f89096h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f89097i;

    @Inject
    public b(@k Ib.c cVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar, @k C25719a c25719a) {
        this.f89094f = cVar;
        this.f89095g = interfaceC4053a;
        this.f89096h = aVar;
        this.f89097i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AiAssistantOpenLink aiAssistantOpenLink = (AiAssistantOpenLink) deepLink;
        this.f89097i.a(aiAssistantOpenLink, this, AuthSource.f92725r0, new a(this, aiAssistantOpenLink));
    }
}
