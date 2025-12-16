package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.CalledFrom;
import com.avito.android.app_foreground_provider.util_module.AppForegroundStatus;
import com.avito.android.util.C35967w2;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: UnreadPopupsFirstFragmentListener.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/p;", "Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/o;", "a", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements o {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f197789h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f197790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f197791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Application f197792c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f197793d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f197794e;

    /* renamed from: f, reason: collision with root package name */
    public long f197795f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f197796g = f2.b(0, 1, BufferOverflow.f410778c, 1);

    /* compiled from: UnreadPopupsFirstFragmentListener.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/p$a;", "", "<init>", "()V", "", "TIME_DELTA_FOR_SEARCH_FRAGMENT", "J", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UnreadPopupsFirstFragmentListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadPopupsFirstFragmentListenerImpl$init$1", f = "UnreadPopupsFirstFragmentListener.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f197797q;

        /* compiled from: UnreadPopupsFirstFragmentListener.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "appForegroundStatus", "Lkotlin/G0;", "emit", "(Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f197799b;

            public a(p pVar) {
                this.f197799b = pVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                if (((AppForegroundStatus) obj).isForeground()) {
                    p pVar = this.f197799b;
                    pVar.f197795f = pVar.f197791b.now();
                    pVar.f197794e = true;
                }
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return p.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f197797q;
            if (i12 == 0) {
                C42729a0.b(obj);
                p pVar = p.this;
                C43188o0 c43188o0T = C43175k.t(pVar.f197790a.a(), 2);
                a aVar = new a(pVar);
                this.f197797q = 1;
                if (c43188o0T.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UnreadPopupsFirstFragmentListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger_unread_counter/impl_module/unread_popups/p$c", "Lid/i;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends id.i {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f197800b;

        /* compiled from: UnreadPopupsFirstFragmentListener.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/messenger_unread_counter/impl_module/unread_popups/p$c$a", "Landroidx/fragment/app/FragmentManager$n;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends FragmentManager.n {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p f197802a;

            public a(p pVar) {
                this.f197802a = pVar;
            }

            @Override // androidx.fragment.app.FragmentManager.n
            public final void onFragmentResumed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
                p pVar = this.f197802a;
                if (pVar.f197794e) {
                    long jNow = pVar.f197791b.now() - pVar.f197795f;
                    e2 e2Var = pVar.f197796g;
                    if (jNow >= 150) {
                        pVar.f197794e = false;
                        e2Var.K5(Boolean.FALSE);
                        return;
                    }
                    Bundle arguments = fragment.getArguments();
                    if (arguments == null || !arguments.getBoolean("FRAGMENT_FOR_NEW_UNREAD_POPUPS", false)) {
                        return;
                    }
                    pVar.f197794e = false;
                    e2Var.K5(Boolean.TRUE);
                }
            }
        }

        public c() {
            this.f197800b = new a(p.this);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.e0(this.f197800b, true);
            }
            boolean z12 = C35967w2.a(activity.getIntent()) instanceof CalledFrom.Push;
            int i12 = p.f197789h;
            p.this.getClass();
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            ActivityC22955m activityC22955m = activity instanceof ActivityC22955m ? (ActivityC22955m) activity : null;
            FragmentManager supportFragmentManager = activityC22955m != null ? activityC22955m.getSupportFragmentManager() : null;
            if (supportFragmentManager != null) {
                supportFragmentManager.v0(this.f197800b);
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p(@Y61.k com.avito.android.app_foreground_provider.util_module.a aVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k Application application, @Y61.k R0 r02) {
        this.f197790a = aVar;
        this.f197791b = fVar;
        this.f197792c = application;
        this.f197793d = r02;
    }

    @Override // com.avito.android.messenger_unread_counter.impl_module.unread_popups.o
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF197796g() {
        return this.f197796g;
    }

    @Override // com.avito.android.messenger_unread_counter.impl_module.unread_popups.o
    public final void b() {
        C43259k.d(U.a(this.f197793d.c()), null, null, new b(null), 3);
        this.f197792c.registerActivityLifecycleCallbacks(new c());
    }
}
