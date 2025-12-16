package com.avito.android.messenger.channels.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.D0;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;

/* compiled from: RefreshLockTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/k;", "Lcom/avito/android/messenger/channels/analytics/i;", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187126a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f187127b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.analytics.b f187128c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<e> f187129d;

    /* compiled from: RefreshLockTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/k$e;", "kotlin.jvm.PlatformType", "refresh", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/messenger/channels/analytics/k$e;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            e eVar = (e) obj;
            if (L.f(eVar, e.a.f187134a)) {
                return H0.f403644b;
            }
            if (eVar instanceof e.b) {
                return z.F0(34L, TimeUnit.SECONDS, k.this.f187127b.a()).d0(new j(eVar));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: RefreshLockTracker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "", "it", "", "test", "(Lio/reactivex/rxjava3/core/y;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f187131b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((y) obj).e();
        }
    }

    /* compiled from: RefreshLockTracker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/y;", "", "scenario", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/core/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            k kVar = k.this;
            kVar.f187126a.c(new NonFatalErrorEvent("ChannelInteractor swipe to refresh locked", null, null, null, 14, null));
            String str = (String) ((y) obj).c();
            if (str != null) {
                kVar.f187128c.f(str);
            }
        }
    }

    /* compiled from: RefreshLockTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f187133b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.b("Refresh timer tracker error", (Throwable) obj);
        }
    }

    /* compiled from: RefreshLockTracker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/k$e;", "", "a", "b", "Lcom/avito/android/messenger/channels/analytics/k$e$a;", "Lcom/avito/android/messenger/channels/analytics/k$e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {

        /* compiled from: RefreshLockTracker.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/k$e$a;", "Lcom/avito/android/messenger/channels/analytics/k$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f187134a = new a();
        }

        /* compiled from: RefreshLockTracker.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/k$e$b;", "Lcom/avito/android/messenger/channels/analytics/k$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f187135a;

            public b(@Y61.k String str) {
                this.f187135a = str;
            }
        }
    }

    @Inject
    public k(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.messenger.channels.analytics.b bVar) {
        this.f187126a = interfaceC28373a;
        this.f187127b = interfaceC35745a5;
        this.f187128c = bVar;
        com.jakewharton.rxrelay3.b<e> bVar2 = new com.jakewharton.rxrelay3.b<>();
        this.f187129d = bVar2;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        z<R> zVarY0 = bVar2.x0(interfaceC35745a5.a()).y0(new a());
        zVarY0.getClass();
        cVar.b(new D0(zVarY0).N(b.f187131b).v0(new c(), d.f187133b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.messenger.channels.analytics.i
    public final void a() {
        this.f187129d.accept(e.a.f187134a);
    }

    @Override // com.avito.android.messenger.channels.analytics.i
    public final void b(@Y61.k String str) {
        this.f187129d.accept(new e.b(str));
    }
}
