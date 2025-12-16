package com.avito.android.lib.beduin_v2.component.webview;

import Y41.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.NoMatchLink;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: WebViewComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class b extends H implements l<Uri, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(Uri uri) {
        return Boolean.valueOf(!(((a) this.receiver).f175964m.e(uri) instanceof NoMatchLink));
    }
}
