package com.avito.android.payment.deeplink;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SbpPaymentAppLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SbpPaymentAppLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/payment/deeplink/A;", "Lev/b;", "Lcom/avito/android/deep_linking/links/SbpPaymentAppLink;", "a", "b", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A extends AbstractC40162b<SbpPaymentAppLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f214004d;

    /* compiled from: SbpPaymentAppLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/payment/deeplink/A$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbpPaymentAppLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/payment/deeplink/A$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/payment/deeplink/A$b$a;", "Lcom/avito/android/payment/deeplink/A$b$b;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: SbpPaymentAppLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/deeplink/A$b$a;", "Lcom/avito/android/payment/deeplink/A$b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {
            static {
                new a();
            }

            public a() {
                super(null);
            }
        }

        /* compiled from: SbpPaymentAppLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/deeplink/A$b$b;", "Lcom/avito/android/payment/deeplink/A$b;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.payment.deeplink.A$b$b, reason: collision with other inner class name */
        public static final class C6418b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6418b f214005b = new C6418b();

            public C6418b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public A(@Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f214004d = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", ((SbpPaymentAppLink) deepLink).f133645b);
        intent.addFlags(268435456);
        this.f214004d.R(intent, B.f214006l);
        return b.C6418b.f214005b;
    }
}
