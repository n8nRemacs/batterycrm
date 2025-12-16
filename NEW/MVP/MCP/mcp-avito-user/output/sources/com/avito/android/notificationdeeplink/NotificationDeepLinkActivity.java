package com.avito.android.notificationdeeplink;

import Cd.C13243a;
import K30.c;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.AnalyticParams;
import com.avito.android.L;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.di.C29972i;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.notificationdeeplink.di.b;
import com.avito.android.notificationdeeplink.error.BadDeeplinkException;
import com.avito.android.notificationdeeplink.error.BadParcelableNotificationDeeplinkException;
import com.avito.android.notificationdeeplink.mvi.entity.NotificationDeepLinkState;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.NotificationIdentifier;
import com.avito.android.util.C35974x2;
import com.avito.android.util.H;
import com.avito.android.util.V2;
import cv.InterfaceC39417a;
import iR.C41336a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kv.C43501a;
import l41.r;
import vz.InterfaceC49400a;
import y30.InterfaceC50050d;
import z1.AbstractC50339a;

/* compiled from: NotificationDeepLinkActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/notificationdeeplink/NotificationDeepLinkActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lvz/f;", "<init>", "()V", "a", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationDeepLinkActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, vz.f {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f207736u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.notificationdeeplink.h f207737m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f207739o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f207740p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public L f207741q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC50050d f207742r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f207743s;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f207738n = new O0(m0.f406844a.b(com.avito.android.notificationdeeplink.g.class), new g(), new f(new i()), new h());

    /* renamed from: t, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f207744t = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: NotificationDeepLinkActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/notificationdeeplink/NotificationDeepLinkActivity$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NotificationDeepLinkActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/notificationdeeplink/NotificationDeepLinkActivity$b", "Lcom/avito/android/deeplink_handler/view/a$a;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a.InterfaceC4053a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.C4058a f207745b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.C4058a f207746c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ NotificationDeepLinkActivity f207747d;

        public b(a.C4058a c4058a, NotificationDeepLinkActivity notificationDeepLinkActivity) {
            this.f207746c = c4058a;
            this.f207747d = notificationDeepLinkActivity;
            this.f207745b = c4058a;
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void J(@k Intent intent, int i12, @k l<? super Exception, G0> lVar) {
            this.f207745b.J(intent, i12, lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void R(@k Intent intent, @k l<? super Exception, G0> lVar) {
            ComponentName component = intent.getComponent();
            boolean zF2 = kotlin.jvm.internal.L.f(component != null ? component.getClassName() : null, "com.avito.android.Launcher");
            a.C4058a c4058a = this.f207746c;
            if (zF2) {
                c4058a.R(intent, lVar);
                return;
            }
            NotificationDeepLinkActivity notificationDeepLinkActivity = this.f207747d;
            if (!notificationDeepLinkActivity.isTaskRoot() || intent.hasExtra("up_intent")) {
                c4058a.R(intent, lVar);
                return;
            }
            L l12 = notificationDeepLinkActivity.f207741q;
            if (l12 == null) {
                l12 = null;
            }
            Intent[] intentArr = {L.a.a(l12, null, 3), intent};
            ArrayList arrayList = new ArrayList(2);
            for (int i12 = 0; i12 < 2; i12++) {
                Intent intent2 = intentArr[i12];
                C35974x2.d(intent2);
                arrayList.add(intent2);
            }
            try {
                notificationDeepLinkActivity.startActivities((Intent[]) arrayList.toArray(new Intent[0]));
            } catch (Exception e12) {
                lVar.invoke(e12);
            }
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void X(int i12, @k Intent intent) {
            this.f207745b.X(i12, intent);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void g1(@k l<? super Context, G0> lVar) {
            this.f207745b.g1(lVar);
        }

        @Override // com.avito.android.deeplink_handler.view.a.InterfaceC4053a
        public final void s1() {
            this.f207745b.s1();
        }
    }

    /* compiled from: NotificationDeepLinkActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f207748b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return kotlin.jvm.internal.L.f(((C43501a) obj).f413260a.f134521b, "notification_deeplink_handler");
        }
    }

    /* compiled from: NotificationDeepLinkActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = NotificationDeepLinkActivity.f207736u;
            NotificationDeepLinkActivity.this.finish();
        }
    }

    /* compiled from: NotificationDeepLinkActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$onCreate$3", f = "NotificationDeepLinkActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207750q;

        /* compiled from: NotificationDeepLinkActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$onCreate$3$1", f = "NotificationDeepLinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f207752q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ NotificationDeepLinkActivity f207753r;

            /* compiled from: NotificationDeepLinkActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$onCreate$3$1$1", f = "NotificationDeepLinkActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$e$a$a, reason: collision with other inner class name */
            public static final class C6195a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f207754q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationDeepLinkActivity f207755r;

                /* compiled from: NotificationDeepLinkActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$e$a$a$a, reason: collision with other inner class name */
                public static final class C6196a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C6196a<T> f207756b = new C6196a<>();

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6195a(NotificationDeepLinkActivity notificationDeepLinkActivity, Continuation<? super C6195a> continuation) {
                    super(2, continuation);
                    this.f207755r = notificationDeepLinkActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C6195a(this.f207755r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6195a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f207754q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        n2<NotificationDeepLinkState> state = ((com.avito.android.notificationdeeplink.g) this.f207755r.f207738n.getValue()).getState();
                        InterfaceC43172j<? super NotificationDeepLinkState> interfaceC43172j = C6196a.f207756b;
                        this.f207754q = 1;
                        if (state.collect(interfaceC43172j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: NotificationDeepLinkActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$onCreate$3$1$2", f = "NotificationDeepLinkActivity.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f207757q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ NotificationDeepLinkActivity f207758r;

                /* compiled from: NotificationDeepLinkActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.notificationdeeplink.NotificationDeepLinkActivity$e$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6197a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ NotificationDeepLinkActivity f207759b;

                    public C6197a(NotificationDeepLinkActivity notificationDeepLinkActivity) {
                        this.f207759b = notificationDeepLinkActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        K30.c cVar = (K30.c) obj;
                        int i12 = NotificationDeepLinkActivity.f207736u;
                        NotificationDeepLinkActivity notificationDeepLinkActivity = this.f207759b;
                        if (!notificationDeepLinkActivity.isFinishing()) {
                            if (kotlin.jvm.internal.L.f(cVar, c.a.f9239a)) {
                                notificationDeepLinkActivity.finish();
                            } else if (cVar instanceof c.b) {
                                Bundle bundle = new Bundle();
                                c.b bVar = (c.b) cVar;
                                H.c(bundle, bVar.f9241b);
                                bundle.putParcelable("analytic_params", bVar.f9242c);
                                bundle.putBoolean("is_task_root", bVar.f9243d);
                                com.avito.android.deeplink_handler.handler.composite.a aVar = notificationDeepLinkActivity.f207740p;
                                if (aVar == null) {
                                    aVar = null;
                                }
                                aVar.r6(bundle, bVar.f9240a, "notification_deeplink_handler");
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f207759b, NotificationDeepLinkActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/notificationdeeplink/mvi/entity/NotificationDeepLinkOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(NotificationDeepLinkActivity notificationDeepLinkActivity, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f207758r = notificationDeepLinkActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new b(this.f207758r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f207757q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        NotificationDeepLinkActivity notificationDeepLinkActivity = this.f207758r;
                        InterfaceC43160i<K30.c> events = ((com.avito.android.notificationdeeplink.g) notificationDeepLinkActivity.f207738n.getValue()).getEvents();
                        C6197a c6197a = new C6197a(notificationDeepLinkActivity);
                        this.f207757q = 1;
                        if (events.collect(c6197a, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationDeepLinkActivity notificationDeepLinkActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f207753r = notificationDeepLinkActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f207753r, continuation);
                aVar.f207752q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f207752q;
                NotificationDeepLinkActivity notificationDeepLinkActivity = this.f207753r;
                C43259k.d(t12, null, null, new C6195a(notificationDeepLinkActivity, null), 3);
                C43259k.d(t12, null, null, new b(notificationDeepLinkActivity, null), 3);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return NotificationDeepLinkActivity.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207750q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                NotificationDeepLinkActivity notificationDeepLinkActivity = NotificationDeepLinkActivity.this;
                a aVar = new a(notificationDeepLinkActivity, null);
                this.f207750q = 1;
                if (C23056p0.b(notificationDeepLinkActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f207760l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f207760l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f207760l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return NotificationDeepLinkActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return NotificationDeepLinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: NotificationDeepLinkActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/notificationdeeplink/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/notificationdeeplink/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.notificationdeeplink.g> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.notificationdeeplink.g invoke() {
            com.avito.android.notificationdeeplink.h hVar = NotificationDeepLinkActivity.this.f207737m;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.notificationdeeplink.g) hVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // vz.f
    @k
    public final InterfaceC49400a G0() {
        return InterfaceC49400a.d.f441064a;
    }

    @Override // com.avito.android.ui.activity.a
    @k
    public final a.InterfaceC4053a N1() {
        return new b(new a.C4058a(this), this);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        try {
            b.a aVarA = com.avito.android.notificationdeeplink.di.a.a();
            com.avito.android.notificationdeeplink.di.c cVar = (com.avito.android.notificationdeeplink.di.c) C29972i.a(C29972i.b(this), com.avito.android.notificationdeeplink.di.c.class);
            InterfaceC39417a interfaceC39417aA = cv.c.a(this);
            DeepLink deepLinkA2 = a2();
            Intent intent = getIntent();
            int i12 = Build.VERSION.SDK_INT;
            NotificationIdentifier notificationIdentifier = (NotificationIdentifier) (i12 >= 33 ? (Parcelable) intent.getParcelableExtra("key_identifier", NotificationIdentifier.class) : intent.getParcelableExtra("key_identifier"));
            Intent intent2 = getIntent();
            Payload payload = (Payload) (i12 >= 33 ? (Parcelable) intent2.getParcelableExtra("key_payload", Payload.class) : intent2.getParcelableExtra("key_payload"));
            Intent intent3 = getIntent();
            aVarA.a(cVar, interfaceC39417aA, this, deepLinkA2, notificationIdentifier, payload, (AnalyticParams) (i12 >= 33 ? (Parcelable) intent3.getParcelableExtra("key_analytics", AnalyticParams.class) : intent3.getParcelableExtra("key_analytics")), getIntent().getStringExtra("key_push_provider"), isTaskRoot()).a(this);
        } catch (Exception e12) {
            String stringExtra = getIntent().getStringExtra("key_deep_link_uri");
            if (stringExtra == null) {
                stringExtra = "emptyUri";
            }
            BadParcelableNotificationDeeplinkException badParcelableNotificationDeeplinkException = new BadParcelableNotificationDeeplinkException(stringExtra);
            InterfaceC28373a interfaceC28373a = this.f207743s;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new NonFatalErrorEvent(badParcelableNotificationDeeplinkException.getMessage(), badParcelableNotificationDeeplinkException.getCause(), null, null, 12, null));
            V2.f318762a.c("NotificationDeeplinkActivityMvi", "accept error: " + e12, null);
        }
    }

    public final DeepLink a2() {
        try {
            Intent intent = getIntent();
            return (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_deep_link", DeepLink.class) : intent.getParcelableExtra("key_deep_link"));
        } catch (Throwable th2) {
            V2.f318762a.f(th2);
            BadDeeplinkException badDeeplinkException = new BadDeeplinkException(getIntent().getStringExtra("key_deep_link_uri"));
            InterfaceC28373a interfaceC28373a = this.f207743s;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new NonFatalErrorEvent(badDeeplinkException.f207785b, badDeeplinkException, null, null, 12, null));
            return null;
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C41336a.C11375a.b();
        if (isTaskRoot()) {
            InterfaceC50050d interfaceC50050d = this.f207742r;
            if (interfaceC50050d == null) {
                interfaceC50050d = null;
            }
            interfaceC50050d.b(null);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f207740p;
        if (aVar == null) {
            aVar = null;
        }
        this.f207744t.b(aVar.d9().N(c.f207748b).t0(new d()));
        com.avito.android.deeplink_handler.view.d dVar = this.f207739o;
        if (dVar == null) {
            dVar = null;
        }
        d.a.a(dVar, this, new com.avito.android.deeplink_handler.view.impl.i(this), (b) N1(), 12);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new e(null), 3);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        this.f207744t.e();
        super.onDestroy();
    }
}
