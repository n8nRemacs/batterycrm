package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.RefreshLink;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/RefreshLink;", "it", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<Uri, RefreshLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final B f134197l = new B();

    public B() {
        super(1);
    }

    @Override // Y41.l
    public final RefreshLink invoke(Uri uri) {
        return new RefreshLink();
    }
}
