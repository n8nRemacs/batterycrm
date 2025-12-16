package com.avito.android.messenger.deeplink;

import android.content.Context;
import android.os.Bundle;
import androidx.view.C23060r0;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SendMessageByItemLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SendMessageByItemDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/O0;", "Lev/a;", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O0 extends AbstractC40161a<SendMessageByItemLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f195387f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f195388g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195389h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f195390i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.g f195391j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f195392k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195393l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final MessengerApi f195394m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195395n = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SendMessageByItemDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(O0.this);
        }
    }

    /* compiled from: SendMessageByItemDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrv/a;", "result", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;", "apply", "(Lrv/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (((C47918a) obj).f437156b != -1) {
                return io.reactivex.rxjava3.core.z.c0(SendMessageByItemLink.b.a.f133653b);
            }
            O0 o02 = O0.this;
            C23060r0 c23060r0 = o02.f395446d;
            if (c23060r0 == null) {
                c23060r0 = null;
            }
            Object objD = c23060r0.d("itemId");
            if (objD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str = (String) objD;
            C23060r0 c23060r02 = o02.f395446d;
            if (c23060r02 == null) {
                c23060r02 = null;
            }
            Object objD2 = c23060r02.d("message");
            if (objD2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String str2 = (String) objD2;
            C23060r0 c23060r03 = o02.f395446d;
            return O0.k(o02, str, str2, (String) (c23060r03 != null ? c23060r03 : null).d(SearchParamsConverterKt.SOURCE)).p(P0.f195403b);
        }
    }

    /* compiled from: SendMessageByItemDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            O0.this.j(SendMessageByItemLink.b.a.f133653b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SendMessageByItemDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<SendMessageByItemLink.b, kotlin.G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(SendMessageByItemLink.b bVar) {
            O0.this.j(bVar);
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public O0(@Y61.k Context context, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k C25719a c25719a, @Y61.k a.g gVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k MessengerApi messengerApi) {
        this.f195387f = context;
        this.f195388g = bVar;
        this.f195389h = interfaceC4053a;
        this.f195390i = c25719a;
        this.f195391j = gVar;
        this.f195392k = interfaceC35863o4;
        this.f195393l = interfaceC35745a5;
        this.f195394m = messengerApi;
    }

    public static final C42017o k(O0 o02, String str, String str2, String str3) {
        C42026y c42026yN = o02.f195394m.createChat(str, str3, null, null).n(new J0(o02, str2));
        InterfaceC35745a5 interfaceC35745a5 = o02.f195393l;
        return new C42017o(c42026yN.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new K0(o02)), new C31684n(o02, 4));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SendMessageByItemLink sendMessageByItemLink = (SendMessageByItemLink) deepLink;
        this.f195390i.a(sendMessageByItemLink, this, AuthSource.f92714m, new N0(this, sendMessageByItemLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f195395n.b(A1.h(this.f195388g.Q().N(new a()).T(new b(), Integer.MAX_VALUE), new c(), new d(), 2));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195395n.e();
    }

    @Override // ev.AbstractC40161a, com.avito.android.deeplink_handler.handler.lifecycle.c
    public final void nc() {
        C23060r0 c23060r0 = this.f395446d;
        if (c23060r0 == null) {
            c23060r0 = null;
        }
        if (((Boolean) c23060r0.d("sendingStatus")) != null) {
            this.f195391j.g(d(), true);
        }
    }
}
