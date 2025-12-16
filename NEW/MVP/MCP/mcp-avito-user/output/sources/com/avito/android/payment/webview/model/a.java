package com.avito.android.payment.webview.model;

import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: WebPaymentRedirectPostMessage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/webview/model/a;", "", "a", "Lcom/avito/android/payment/webview/model/a$a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: WebPaymentRedirectPostMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/payment/webview/model/a$a;", "Lcom/avito/android/payment/webview/model/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "closeScreen", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.webview.model.a$a, reason: collision with other inner class name */
    public static final class C6439a implements a {

        @c("closeScreen")
        @l
        private final Boolean closeScreen;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        public C6439a(@l DeepLink deepLink, @l Boolean bool) {
            this.deeplink = deepLink;
            this.closeScreen = bool;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final Boolean getCloseScreen() {
            return this.closeScreen;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }
}
