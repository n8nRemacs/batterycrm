package com.avito.android.multi_message_send.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MultiMessageBannerCloseDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/a;", "LKu/a;", "Lcom/avito/android/multi_message_send/deeplink/MultiMessageBannerCloseDeeplink;", "<init>", "()V", "a", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC14350a<MultiMessageBannerCloseDeeplink> {

    /* compiled from: MultiMessageBannerCloseDeeplinkParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/a$a;", "", "<init>", "()V", "", "ITEM_ID_KEY", "Ljava/lang/String;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.multi_message_send.deeplink.a$a, reason: collision with other inner class name */
    public static final class C6152a {
        public /* synthetic */ C6152a(C42822w c42822w) {
            this();
        }

        public C6152a() {
        }
    }

    static {
        new C6152a(null);
    }

    @Inject
    public a() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new MultiMessageBannerCloseDeeplink(i.m(uri, "itemId"));
    }
}
