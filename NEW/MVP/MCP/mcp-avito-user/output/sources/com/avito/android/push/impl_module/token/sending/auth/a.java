package com.avito.android.push.impl_module.token.sending.auth;

import A3.a;
import Y41.l;
import Y61.k;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import com.avito.android.util.V2;
import fg0.InterfaceC40417a;
import ig0.AbstractC41398a;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import jg0.InterfaceC42375a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import l41.o;

/* compiled from: SendPushTokenOnLogoutAuthPlugin.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/auth/a;", "LA3/b;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42375a f246022a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40417a f246023b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SendPushTokenInteractor f246024c;

    /* compiled from: SendPushTokenOnLogoutAuthPlugin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/auth/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.push.impl_module.token.sending.auth.a$a, reason: collision with other inner class name */
    public static final class C7374a {
        public /* synthetic */ C7374a(C42822w c42822w) {
            this();
        }

        public C7374a() {
        }
    }

    /* compiled from: SendPushTokenOnLogoutAuthPlugin.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/push/PushToken;", "<anonymous parameter 0>", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/push/public_module/token/sending/sending_interactor/SendPushTokenInteractor$TokenRegistrationResult;", "apply", "(Lcom/avito/android/push/PushToken;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return a.this.f246024c.a(AbstractC41398a.f.f398619c, false);
        }
    }

    /* compiled from: SendPushTokenOnLogoutAuthPlugin.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f246026l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.c("SendPushTokenOnLogoutAuthPlugin", "Failed to retrieve token", th2);
            return G0.f406611a;
        }
    }

    static {
        new C7374a(null);
    }

    @Inject
    public a(@k InterfaceC42375a interfaceC42375a, @k InterfaceC40417a interfaceC40417a, @k SendPushTokenInteractor sendPushTokenInteractor) {
        this.f246022a = interfaceC42375a;
        this.f246023b = interfaceC40417a;
        this.f246024c = sendPushTokenInteractor;
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
        V2.f318762a.c("SendPushTokenOnLogoutAuthPlugin", "Clear push tokens", null);
        this.f246022a.clear();
        A1.g(this.f246023b.c("SendPushTokenOnLogoutAuthPlugin").n(new b()), c.f246026l, null, 2);
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
    }

    @Override // A3.b
    public final void m(@Y61.l Boolean bool, @k String str) {
    }
}
