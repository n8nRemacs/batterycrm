package com.avito.android.bbl.screens.configure.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BblConfigureSaveDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bbl/screens/configure/deeplink/f;", "Lev/a;", "Lcom/avito/android/bbl/screens/configure/deeplink/BblConfigureSaveLink;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC40161a<BblConfigureSaveLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f99136f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f99137g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f99138h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.bbl.screens.configure.mvi.domain.d f99139i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f99140j;

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k com.avito.android.bbl.screens.configure.mvi.domain.d dVar, @k R0 r02) {
        this.f99136f = aVar;
        this.f99137g = gVar;
        this.f99138h = iVar;
        this.f99139i = dVar;
        this.f99140j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f99140j, null, null, new e(bundle, this, (BblConfigureSaveLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f99140j, null);
    }
}
