package com.avito.android.beduin.common.component.payment_webview;

import android.webkit.JavascriptInterface;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WebPaymentPostMessagesHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/z;", "", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f101908a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f101909b;

    /* compiled from: WebPaymentPostMessagesHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/z$a;", "", "", "type", "message", "data", "Lkotlin/G0;", "receiveMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Y41.l<String, G0> f101910a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @JavascriptInterface
        public final void receiveMessage(@Y61.l String type, @Y61.l String message, @Y61.l String data) {
            Y41.l<String, G0> lVar;
            if (type != null && (lVar = this.f101910a) != null) {
                lVar.invoke(type);
            }
            V2.f318762a.c("WebPayment", type + " : " + message + " : " + data, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.l Y41.l<? super String, G0> lVar) {
            this.f101910a = lVar;
        }

        public /* synthetic */ a(Y41.l lVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : lVar);
        }
    }

    public z(@Y61.k String str, @Y61.k Y41.l lVar) {
        this.f101908a = lVar;
        this.f101909b = str;
    }
}
