package com.avito.android.messenger_unread_counter.impl_module;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.messenger.w0;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.N;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.o0;

/* compiled from: UnreadChatsCounterSyncAgent.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/d;", "Lcom/avito/android/messenger_unread_counter/impl_module/b;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class d implements com.avito.android.messenger_unread_counter.impl_module.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f197715a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w0 f197716b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger_unread_counter.impl_module.short_task.g f197717c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f197718d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<G0> f197719e = C31685o.m();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197720f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UnreadChatsCounterSyncAgent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f197717c.a();
        }
    }

    /* compiled from: UnreadChatsCounterSyncAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", ChannelContext.Item.USER_ID, "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) obj;
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Thread.currentThread().getName() + ']');
            sb2.append(" Subscribed to userId & events: ");
            sb2.append(str);
            v22.i("UnreadChatsCounterSyncAgent", sb2.toString(), null);
            if (!o0.a(str)) {
                return z.c0(G0.f406611a);
            }
            d dVar = d.this;
            H hC2 = dVar.f197718d.c();
            InterfaceC47842z interfaceC47842z = dVar.f197715a;
            return z.g0(interfaceC47842z.b().j0(hC2), interfaceC47842z.C(Object.class).j0(hC2).N(new com.avito.android.messenger_unread_counter.impl_module.c(dVar, str))).r0(G0.f406611a);
        }
    }

    /* compiled from: UnreadChatsCounterSyncAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(@Y61.k Object obj) {
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Thread.currentThread().getName() + ']');
            sb2.append(" updateTriggers");
            v22.c("UnreadChatsCounterSyncAgent", sb2.toString(), null);
            d.this.f197719e.accept(G0.f406611a);
        }
    }

    /* compiled from: UnreadChatsCounterSyncAgent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger_unread_counter.impl_module.d$d, reason: collision with other inner class name */
    public static final class C5826d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C5826d<T> f197724b = new C5826d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[" + Thread.currentThread().getName() + ']');
            sb2.append(" Subscription to userId & events has encountered an error");
            v22.a("UnreadChatsCounterSyncAgent", sb2.toString(), (Throwable) obj);
        }
    }

    @Inject
    public d(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k w0 w0Var, @Y61.k com.avito.android.messenger_unread_counter.impl_module.short_task.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f197715a = interfaceC47842z;
        this.f197716b = w0Var;
        this.f197717c = gVar;
        this.f197718d = interfaceC35745a5;
    }

    @Override // com.avito.android.messenger_unread_counter.impl_module.b
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f197720f;
        cVar.e();
        com.jakewharton.rxrelay3.d<G0> dVar = this.f197719e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f197718d;
        cVar.b(dVar.D0(3000L, timeUnit, interfaceC35745a5.c()).t0(new a()));
        z<R> zVarY0 = this.f197716b.e().j0(interfaceC35745a5.c()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new b());
        com.avito.android.advert_core.task.a aVar = new com.avito.android.advert_core.task.a(15);
        zVarY0.getClass();
        cVar.b(new N(zVarY0, aVar).v0(new c(), C5826d.f197724b, new com.avito.android.advert_core.task.a(16)));
    }
}
