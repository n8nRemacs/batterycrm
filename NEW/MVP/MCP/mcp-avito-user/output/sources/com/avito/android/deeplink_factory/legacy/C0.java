package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ExtendedProfileSettingsLink;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ExtendedProfileSettingsLink;", "it", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class C0 extends kotlin.jvm.internal.N implements Y41.l<Uri, ExtendedProfileSettingsLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final C0 f134202l = new C0();

    public C0() {
        super(1);
    }

    @Override // Y41.l
    public final ExtendedProfileSettingsLink invoke(Uri uri) {
        return new ExtendedProfileSettingsLink();
    }
}
