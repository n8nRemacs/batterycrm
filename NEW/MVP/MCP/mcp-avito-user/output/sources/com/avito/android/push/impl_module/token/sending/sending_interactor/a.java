package com.avito.android.push.impl_module.token.sending.sending_interactor;

import Y61.k;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.messenger.service.direct_reply.i;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.push.public_module.token.sending.sender.PushTokenSender;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.avito.android.server_time.f;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import fg0.InterfaceC40417a;
import gg0.C40677a;
import gg0.C40679c;
import hg0.InterfaceC40932a;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.M;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import jg0.InterfaceC42375a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import l41.g;
import l41.o;

/* compiled from: SendPushTokenInteractorImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/sending_interactor/a;", "Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements SendPushTokenInteractor {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PushTokenSender f246052a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42375a f246053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f246054c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28533a f246055d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final P f246056e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC40417a f246057f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246058g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC40932a f246059h;

    /* compiled from: SendPushTokenInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/sending_interactor/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TOKEN_SYNC_PERIOD_DAYS", "J", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.push.impl_module.token.sending.sending_interactor.a$a, reason: collision with other inner class name */
    public static final class C7376a {
        public /* synthetic */ C7376a(C42822w c42822w) {
            this();
        }

        public C7376a() {
        }
    }

    /* compiled from: SendPushTokenInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "exception", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f246061c;

        public b(boolean z12) {
            this.f246061c = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String strA;
            Throwable th2 = (Throwable) obj;
            a aVar = a.this;
            InterfaceC28373a interfaceC28373a = aVar.f246058g;
            InterfaceC40417a interfaceC40417a = aVar.f246057f;
            PushService pushServiceA = interfaceC40417a.a();
            if (pushServiceA != null) {
                Qf0.b.f13970a.getClass();
                strA = Qf0.b.a(pushServiceA);
            } else {
                strA = null;
            }
            interfaceC28373a.c(new C40679c(strA, null, true, interfaceC40417a.b(th2), this.f246061c));
        }
    }

    /* compiled from: SendPushTokenInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/push/PushToken;", "pushToken", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/push/PushToken;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f246063c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f246064d;

        public c(boolean z12, String str) {
            this.f246063c = z12;
            this.f246064d = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC41768a abstractC41768aA;
            PushToken pushToken = (PushToken) obj;
            a aVar = a.this;
            InterfaceC28373a interfaceC28373a = aVar.f246058g;
            Qf0.b bVar = Qf0.b.f13970a;
            PushService pushService = pushToken.f245933c;
            bVar.getClass();
            interfaceC28373a.c(new C40679c(Qf0.b.a(pushService), pushToken.f245932b, true, this.f246063c, null, 16, null));
            boolean z12 = this.f246063c;
            if (!z12 || pushService == PushService.f245927b) {
                String strA = Qf0.b.a(pushService);
                abstractC41768aA = aVar.f246052a.a(pushToken.f245932b, strA, z12);
            } else {
                abstractC41768aA = AbstractC41768a.o(new WrongPushServiceForVoipTokenError(Qf0.b.a(pushService)));
            }
            String str = this.f246064d;
            return abstractC41768aA.k(new i(pushToken, aVar, str, z12)).l(new com.avito.android.push.impl_module.token.sending.sending_interactor.b(pushToken, aVar, str, z12));
        }
    }

    static {
        new C7376a(null);
    }

    @Inject
    public a(@k PushTokenSender pushTokenSender, @k InterfaceC42375a interfaceC42375a, @k f fVar, @k InterfaceC28533a interfaceC28533a, @k P p12, @k InterfaceC40417a interfaceC40417a, @k InterfaceC28373a interfaceC28373a, @k InterfaceC40932a interfaceC40932a) {
        this.f246052a = pushTokenSender;
        this.f246053b = interfaceC42375a;
        this.f246054c = fVar;
        this.f246055d = interfaceC28533a;
        this.f246056e = p12;
        this.f246057f = interfaceC40417a;
        this.f246058g = interfaceC28373a;
        this.f246059h = interfaceC40932a;
    }

    public static M b(String str, String str2) {
        V2.f318762a.c("SendPushTokenInteractor", e.n("[", str, "] Push token registration is not needed yet cause: ", str2), null);
        return I.q(SendPushTokenInteractor.TokenRegistrationResult.f246087c);
    }

    @Override // com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor
    @k
    public final I<SendPushTokenInteractor.TokenRegistrationResult> a(@k AbstractC41398a abstractC41398a, boolean z12) {
        String str = "SendPushTokenInteractor(isVoip=" + z12 + ", " + abstractC41398a + ')';
        V2.f318762a.c("SendPushTokenInteractor", AK.c.k("[", str, "] sendPushToken()"), null);
        if (this.f246059h.getF17351b() && L.f(abstractC41398a, AbstractC41398a.b.f398616c)) {
            return b(str, "isFirstAppStart");
        }
        if (!abstractC41398a.equals(AbstractC41398a.d.f398617c) && !abstractC41398a.equals(AbstractC41398a.b.f398616c)) {
            InterfaceC42375a interfaceC42375a = this.f246053b;
            if (this.f246054c.now() - (z12 ? interfaceC42375a.g() : interfaceC42375a.c()) <= TimeUnit.DAYS.toMillis(14L)) {
                if ((z12 ? interfaceC42375a.b() : interfaceC42375a.e()).equals(this.f246056e.f().invoke())) {
                    return b(str, "isTheSamePeriod_&&_isTheSameAppVersion");
                }
            }
        }
        this.f246058g.c(new C40677a(abstractC41398a.f398614a, z12, null, 4, null));
        return this.f246057f.c(str).i(new b(z12)).o(new c(z12, str)).B(SendPushTokenInteractor.TokenRegistrationResult.f246086b);
    }
}
