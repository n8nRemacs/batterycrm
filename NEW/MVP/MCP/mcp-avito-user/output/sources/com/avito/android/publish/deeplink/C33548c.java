package com.avito.android.publish.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertEditDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$EditV1;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33548c extends AbstractC40161a<MyAdvertLink.EditV1> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f232549f;

    @Inject
    public C33548c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f232549f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MyAdvertLink.EditV1 editV1 = (MyAdvertLink.EditV1) deepLink;
        i(MyAdvertLink.EditV1.b.f133504b, this.f232549f, new MyAdvertLink.Edit(editV1.f133499c, editV1.f() ? new MyAdvertLink.ActivateV2(editV1.f133499c, false, null) : null, editV1.f133501e, editV1.f133502f, editV1.f133503g, null, 32, null));
    }
}
