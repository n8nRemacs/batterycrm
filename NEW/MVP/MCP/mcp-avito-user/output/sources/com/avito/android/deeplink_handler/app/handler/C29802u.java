package com.avito.android.deeplink_handler.app.handler;

import Ju.C14248b;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import ev.AbstractC40162b;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkNotFoundHandler.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/u;", "Lcom/avito/android/deeplink_handler/handler/d;", "Lev/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "a", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_handler.app.handler.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29802u extends AbstractC40162b<DeepLink> implements com.avito.android.deeplink_handler.handler.d {

    /* compiled from: DeeplinkNotFoundHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/u$a;", "", "<init>", "()V", "", "HANDLER_NOT_FOUND_MESSAGE", "Ljava/lang/String;", "TAG", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink_handler.app.handler.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C29802u() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ev.AbstractC40162b
    @Y61.k
    public final InterfaceC14249c.b c(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        V2.f318762a.g("DefaultDeeplinkHandler", String.format("DeeplinkHandler wasn't found for deeplink: %s.", Arrays.copyOf(new Object[]{deepLink instanceof NoMatchLink ? "NoMatchLink" : com.avito.android.deep_linking.links.storage.a.f134018a.a(deepLink.getClass())}, 1)));
        return new C14248b(deepLink);
    }
}
