package com.avito.android.push.impl_module.token.sending.sender;

import Ek0.InterfaceC13498a;
import Y61.k;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.public_module.token.sending.sender.PushTokenSender;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.A;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.rx3.Q;

/* compiled from: PushTokenSenderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/sender/a;", "Lcom/avito/android/push/public_module/token/sending/sender/PushTokenSender;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements PushTokenSender {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13498a> f246031a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f246032b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P f246033c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f246034d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f246035e;

    /* compiled from: PushTokenSenderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/sender/a$a;", "", "<init>", "()V", "", "CALL_API_NOTIFICATION_TOKEN", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.push.impl_module.token.sending.sender.a$a, reason: collision with other inner class name */
    public static final class C7375a {
        public /* synthetic */ C7375a(C42822w c42822w) {
            this();
        }

        public C7375a() {
        }
    }

    static {
        new C7375a(null);
    }

    @Inject
    public a(@k h31.e<InterfaceC13498a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k P p12, @k InterfaceC28373a interfaceC28373a, @k R0 r02) {
        this.f246031a = eVar;
        this.f246032b = interfaceC35745a5;
        this.f246033c = p12;
        this.f246034d = interfaceC28373a;
        this.f246035e = r02;
    }

    @Override // com.avito.android.push.public_module.token.sending.sender.PushTokenSender
    @k
    public final A a(@k String str, @k String str2, boolean z12) {
        O oR2 = g1.a(Q.a(this.f246035e.a(), new f(this, z12, str2, str, null))).r(g.f246045b);
        InterfaceC35745a5 interfaceC35745a5 = this.f246032b;
        return (A) oR2.z(interfaceC35745a5.a()).s(interfaceC35745a5.c()).j(new b(this)).i(new c(this)).k(new d(this)).o(e.f246039b);
    }
}
