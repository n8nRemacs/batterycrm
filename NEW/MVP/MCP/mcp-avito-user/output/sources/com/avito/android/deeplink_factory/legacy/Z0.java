package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ThemeSettingsLink;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ThemeSettingsLink;", "it", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Z0 extends kotlin.jvm.internal.N implements Y41.l<Uri, ThemeSettingsLink> {

    /* renamed from: l, reason: collision with root package name */
    public static final Z0 f134275l = new Z0();

    public Z0() {
        super(1);
    }

    @Override // Y41.l
    public final ThemeSettingsLink invoke(Uri uri) {
        return new ThemeSettingsLink();
    }
}
