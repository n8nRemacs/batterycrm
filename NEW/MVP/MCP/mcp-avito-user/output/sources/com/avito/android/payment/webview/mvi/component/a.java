package com.avito.android.payment.webview.mvi.component;

import Ru.b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryCourierOrderPaymentSuccessLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.SbpPaymentAppLink;
import com.avito.android.deep_linking.links.StrBookingPaymentSuccessLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_events.events.DeeplinkHandlingResultStatus;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.external_apps.deep_linking.ExternalAppLink;
import com.avito.android.payment.webview.mvi.entity.WebPaymentMviState;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import w60.C49452c;
import x60.InterfaceC49775a;
import x60.b;

/* compiled from: WebPaymentMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment/webview/mvi/component/a;", "Lcom/avito/android/arch/mvi/a;", "Lx60/a;", "Lx60/b;", "Lcom/avito/android/payment/webview/mvi/entity/WebPaymentMviState;", "a", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49775a, x60.b, WebPaymentMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f214857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_events.registry.d f214858b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f214859c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f214860d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final E f214861e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.webview.mvi.a f214862f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f214863g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f214864h;

    /* compiled from: WebPaymentMviActor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0081T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/payment/webview/mvi/component/a$a;", "", "<init>", "()V", "", "ACTUAL_LOADING_PROGRESS_RATIO", "D", "", "ENOUGH_LOADING_PROGRESS_PERCENTAGE", "I", "", "POST_MESSAGE_REDIRECT_KEY", "Ljava/lang/String;", "RESULT_PARAM_CLOSE_SCREEN_KEY", "RESULT_PARAM_LINK_KEY", "RESULT_PARAM_REFRESH_SCREEN_KEY", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.webview.mvi.component.a$a, reason: collision with other inner class name */
    public static final class C6440a {
        public /* synthetic */ C6440a(C42822w c42822w) {
            this();
        }

        public C6440a() {
        }
    }

    /* compiled from: WebPaymentMviActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new C6440a(null);
    }

    @Inject
    public a(@Y61.k x xVar, @Y61.k com.avito.android.deeplink_events.registry.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k com.avito.android.payment.webview.mvi.a aVar2, @Y61.k h31.e<Gson> eVar, @Y61.k R0 r02) {
        this.f214857a = xVar;
        this.f214858b = dVar;
        this.f214859c = aVar;
        this.f214860d = interfaceC28373a;
        this.f214861e = e12;
        this.f214862f = aVar2;
        this.f214863g = eVar;
        this.f214864h = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.payment.webview.mvi.component.a r8, kotlinx.coroutines.flow.InterfaceC43172j r9, Ju.InterfaceC14249c r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof com.avito.android.payment.webview.mvi.component.c
            if (r0 == 0) goto L16
            r0 = r11
            com.avito.android.payment.webview.mvi.component.c r0 = (com.avito.android.payment.webview.mvi.component.c) r0
            int r1 = r0.f214875u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f214875u = r1
            goto L1b
        L16:
            com.avito.android.payment.webview.mvi.component.c r0 = new com.avito.android.payment.webview.mvi.component.c
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f214873s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f214875u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L42
            if (r2 == r3) goto L3e
            if (r2 != r4) goto L36
            com.avito.android.deep_linking.links.DeepLink r8 = r0.f214872r
            com.avito.android.payment.webview.mvi.component.a r9 = r0.f214871q
            kotlin.C42729a0.b(r11)
            r11 = r8
            r8 = r9
            goto Lb6
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.C42729a0.b(r11)
            goto La2
        L42:
            kotlin.C42729a0.b(r11)
            boolean r11 = r10 instanceof com.avito.android.deep_linking.links.BeduinUniversalPageLink.b.C3987b
            if (r11 == 0) goto La2
            com.avito.android.deep_linking.links.BeduinUniversalPageLink$b$b r10 = (com.avito.android.deep_linking.links.BeduinUniversalPageLink.b.C3987b) r10
            java.util.Map<java.lang.String, java.lang.Object> r11 = r10.f133046b
            java.lang.String r2 = "link"
            java.lang.Object r11 = r11.get(r2)
            boolean r2 = r11 instanceof java.lang.String
            r5 = 0
            if (r2 == 0) goto L5b
            java.lang.String r11 = (java.lang.String) r11
            goto L5c
        L5b:
            r11 = r5
        L5c:
            if (r11 == 0) goto L65
            com.avito.android.deep_linking.x r2 = r8.f214857a
            com.avito.android.deep_linking.links.DeepLink r11 = r2.b(r11)
            goto L66
        L65:
            r11 = r5
        L66:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r10.f133046b
            java.lang.String r2 = "refreshScreen"
            java.lang.Object r2 = r10.get(r2)
            boolean r6 = r2 instanceof java.lang.Boolean
            if (r6 == 0) goto L75
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L76
        L75:
            r2 = r5
        L76:
            r6 = 0
            if (r2 == 0) goto L7e
            boolean r2 = r2.booleanValue()
            goto L7f
        L7e:
            r2 = r6
        L7f:
            java.lang.String r7 = "closeScreen"
            java.lang.Object r10 = r10.get(r7)
            boolean r7 = r10 instanceof java.lang.Boolean
            if (r7 == 0) goto L8c
            r5 = r10
            java.lang.Boolean r5 = (java.lang.Boolean) r5
        L8c:
            if (r5 == 0) goto L92
            boolean r6 = r5.booleanValue()
        L92:
            if (r6 == 0) goto La5
            x60.b$a r8 = new x60.b$a
            r8.<init>(r11)
            r0.f214875u = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto La2
            goto Lbc
        La2:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lbc
        La5:
            if (r2 == 0) goto Lb6
            x60.b$c r10 = x60.b.c.f442230a
            r0.f214871q = r8
            r0.f214872r = r11
            r0.f214875u = r4
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto Lb6
            goto Lbc
        Lb6:
            com.avito.android.deeplink_handler.handler.composite.a r8 = r8.f214859c
            com.avito.android.deeplink_handler.handler.composite.b.a(r8, r11)
            goto La2
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.payment.webview.mvi.component.a.c(com.avito.android.payment.webview.mvi.component.a, kotlinx.coroutines.flow.j, Ju.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new e(new d(C40482a.a(this.f214859c)), null, this)), C43175k.C(new f(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<x60.b> b(@Y61.k InterfaceC49775a interfaceC49775a, @Y61.k WebPaymentMviState webPaymentMviState) {
        C43210w c43210w;
        Object gVar;
        int i12;
        boolean z12 = interfaceC49775a instanceof InterfaceC49775a.C12845a;
        E e12 = this.f214861e;
        com.avito.android.payment.webview.mvi.a aVar = this.f214862f;
        InterfaceC28373a interfaceC28373a = this.f214860d;
        if (z12) {
            if (webPaymentMviState instanceof WebPaymentMviState.Loading) {
                i12 = ((WebPaymentMviState.Loading) webPaymentMviState).f214923d;
            } else if (webPaymentMviState instanceof WebPaymentMviState.Error) {
                i12 = ((WebPaymentMviState.Error) webPaymentMviState).f214922d;
            } else {
                if (!(webPaymentMviState instanceof WebPaymentMviState.Content)) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 100;
            }
            String strA = e12.a();
            interfaceC28373a.c(new C49452c(strA != null ? strA : "", aVar.f214850a, i12));
            return new C43210w(b.d.f442231a);
        }
        if (interfaceC49775a instanceof InterfaceC49775a.f) {
            String strA2 = e12.a();
            interfaceC28373a.c(new w60.g(aVar.f214853d, aVar.f214854e, strA2 == null ? "" : strA2, aVar.f214850a, aVar.f214852c));
            return new C43210w(b.C12846b.f442229a);
        }
        if (interfaceC49775a instanceof InterfaceC49775a.d) {
            return new C43210w(new b.f(0));
        }
        if (interfaceC49775a instanceof InterfaceC49775a.c) {
            PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = ((InterfaceC49775a.c) interfaceC49775a).f442224a;
            int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
            if (iOrdinal == 0) {
                gVar = new b.g(0);
            } else if (iOrdinal != 1) {
                int i13 = powerWebViewStateChangeEvent.f392938b;
                if (iOrdinal == 2) {
                    gVar = i13 < 80 ? new b.g((int) (i13 * 1.25d)) : b.e.f442232a;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new b.f(i13);
                }
            } else {
                gVar = b.e.f442232a;
            }
            c43210w = new C43210w(gVar);
        } else {
            if (!(interfaceC49775a instanceof InterfaceC49775a.e)) {
                if (interfaceC49775a instanceof InterfaceC49775a.b) {
                    return C43175k.G(new com.avito.android.payment.webview.mvi.component.b(this, ((InterfaceC49775a.b) interfaceC49775a).f442223a, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            DeepLink deepLinkE = ((InterfaceC49775a.e) interfaceC49775a).f442226a;
            boolean z13 = deepLinkE instanceof StrBookingPaymentSuccessLink;
            com.avito.android.deeplink_events.registry.d dVar = this.f214858b;
            x xVar = this.f214857a;
            if (z13) {
                deepLinkE = xVar.e(((StrBookingPaymentSuccessLink) deepLinkE).f133690b);
                DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = DeeplinkHandlingResultStatus.f134138c;
                dVar.b(new b.a(deepLinkE));
            } else if (deepLinkE instanceof DeliveryCourierOrderPaymentSuccessLink) {
                deepLinkE = xVar.e(((DeliveryCourierOrderPaymentSuccessLink) deepLinkE).f133183b);
                DeeplinkHandlingResultStatus deeplinkHandlingResultStatus2 = DeeplinkHandlingResultStatus.f134138c;
                dVar.b(new b.a(deepLinkE));
            }
            if (deepLinkE instanceof NoMatchLink ? true : deepLinkE instanceof ExternalAppLink ? true : deepLinkE instanceof SbpPaymentAppLink ? true : deepLinkE instanceof InAppBrowserLink ? true : deepLinkE instanceof DialogDeepLink) {
                b.a.a(this.f214859c, deepLinkE, null, null, 6);
                return C43175k.w();
            }
            c43210w = new C43210w(new b.a(deepLinkE));
        }
        return c43210w;
    }
}
