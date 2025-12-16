package com.avito.android.version_conflict;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.remote.H;
import com.avito.android.webview.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: VersionConflictWebViewIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/m;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.webview.m f325928a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f325929b;

    @Inject
    public m(@Y61.k com.avito.android.webview.m mVar, @Y61.k H h12) {
        this.f325928a = mVar;
        this.f325929b = h12;
    }

    @Y61.k
    public final Intent a() {
        return l.a.a(this.f325928a, Uri.parse("https://m.avito.ru"), new WebViewLinkSettings(true, true, false, true, false, null, P0.g(new Q("x-webview", "android"), new Q("x-device-id", this.f325929b.getValue())), false, false, false, false, 1844, null), 4);
    }
}
