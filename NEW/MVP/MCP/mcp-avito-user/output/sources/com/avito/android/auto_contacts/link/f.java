package com.avito.android.auto_contacts.link;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.auto_contacts.link.AutoContactsPackagesLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoContactsPackagesLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/link/f;", "Lev/a;", "Lcom/avito/android/auto_contacts/link/AutoContactsPackagesLink;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC40161a<AutoContactsPackagesLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f94900f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25719a f94901g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Context f94902h;

    @Inject
    public f(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f94900f = interfaceC4053a;
        this.f94901g = c25719a;
        this.f94902h = context;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92692a0;
        e eVar = new e(this);
        this.f94901g.a((AutoContactsPackagesLink) deepLink, this, authSource, eVar);
        j(AutoContactsPackagesLink.b.f94885b);
    }
}
