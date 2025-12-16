package com.avito.android.notification_center.counter;

import Ek0.InterfaceC13498a;
import Hk0.C14000a;
import Y41.p;
import com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.notification.NotificationsCount;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: NotificationCenterCounter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/counter/d;", "Lcom/avito/android/notification_center/counter/a;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.notification_center.counter.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC13498a> f207489a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<CrmNotificationCenterBeduinRedesignTestGroup> f207490b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<NotificationsCount> f207491c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f207492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public NotificationsCount f207493e;

    /* compiled from: NotificationCenterCounter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notification_center.counter.NotificationCenterCounterImpl$markAsRead$1", f = "NotificationCenterCounter.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207494q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f207496s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f207496s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new a(this.f207496s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            TypedResult typedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207494q;
            d dVar = d.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC13498a interfaceC13498a = dVar.f207489a.get();
                    String str = this.f207496s;
                    this.f207494q = 1;
                    obj = interfaceC13498a.e(str, "android", this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                typedResult = (TypedResult) obj;
            } catch (Throwable th2) {
                V2.f318762a.a("NotificationCenterCounter", "Error updating notification counter", th2);
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    throw C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause());
                }
                throw new NoWhenBranchMatchedException();
            }
            NotificationsCount notificationsCount = new NotificationsCount((int) ((C14000a) ((TypedResult.Success) typedResult).getResult()).getUnread());
            dVar.f207493e = notificationsCount;
            dVar.f207491c.accept(notificationsCount);
            return G0.f406611a;
        }
    }

    /* compiled from: NotificationCenterCounter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notification_center.counter.NotificationCenterCounterImpl$update$1", f = "NotificationCenterCounter.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207497q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return d.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            TypedResult typedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207497q;
            d dVar = d.this;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f207497q = 1;
                    obj = d.c(dVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                typedResult = (TypedResult) obj;
            } catch (Throwable th2) {
                V2.f318762a.a("NotificationCenterCounter", "Error updating notification counter", th2);
            }
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    throw C35936s.a(((TypedResult.Error) typedResult).getError(), ((TypedResult.Error) typedResult).getCause());
                }
                throw new NoWhenBranchMatchedException();
            }
            NotificationsCount notificationsCount = new NotificationsCount((int) ((Number) ((TypedResult.Success) typedResult).getResult()).longValue());
            dVar.f207493e = notificationsCount;
            dVar.f207491c.accept(notificationsCount);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k h31.e<InterfaceC13498a> eVar, @Y61.k u3.l<CrmNotificationCenterBeduinRedesignTestGroup> lVar, @Y61.k R0 r02) {
        this.f207489a = eVar;
        this.f207490b = lVar;
        this.f207492d = U.a(r02.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.notification_center.counter.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof com.avito.android.notification_center.counter.c
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.notification_center.counter.c r0 = (com.avito.android.notification_center.counter.c) r0
            int r1 = r0.f207488s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f207488s = r1
            goto L1b
        L16:
            com.avito.android.notification_center.counter.c r0 = new com.avito.android.notification_center.counter.c
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f207486q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207488s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r7)
            goto L65
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r7)
            goto L9c
        L3b:
            kotlin.C42729a0.b(r7)
            u3.l<com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup> r7 = r6.f207490b
            u3.m<T> r7 = r7.f439745a
            T r7 = r7.f439749b
            com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup r7 = (com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup) r7
            r7.getClass()
            com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup r2 = com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup.f67789d
            java.lang.String r5 = "android"
            h31.e<Ek0.a> r6 = r6.f207489a
            if (r7 == r2) goto L8d
            com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup r2 = com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup.f67791f
            if (r7 != r2) goto L56
            goto L8d
        L56:
            java.lang.Object r6 = r6.get()
            Ek0.a r6 = (Ek0.InterfaceC13498a) r6
            r0.f207488s = r3
            java.lang.Object r7 = r6.d(r5, r0)
            if (r7 != r1) goto L65
            goto Lbd
        L65:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            Fk0.a r6 = (Fk0.C13813a) r6
            long r6 = r6.getUnread()
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r6)
            goto L85
        L81:
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L87
        L85:
            r1 = r7
            goto Lbd
        L87:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L8d:
            java.lang.Object r6 = r6.get()
            Ek0.a r6 = (Ek0.InterfaceC13498a) r6
            r0.f207488s = r4
            java.lang.Object r7 = r6.f(r5, r0)
            if (r7 != r1) goto L9c
            goto Lbd
        L9c:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto Lb8
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            Gk0.a r6 = (Gk0.C13893a) r6
            long r6 = r6.getUnread()
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r6)
            goto Lbc
        Lb8:
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto Lbe
        Lbc:
            goto L85
        Lbd:
            return r1
        Lbe:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification_center.counter.d.c(com.avito.android.notification_center.counter.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.notification_center.counter.j
    public final void a() {
        C43259k.d(this.f207492d, null, null, new b(null), 3);
    }

    @Override // com.avito.android.notification_center.counter.h
    public final void b(@Y61.k String str) {
        C43259k.d(this.f207492d, null, null, new a(str, null), 3);
    }

    @Override // com.avito.android.notification_center.counter.b
    public final void clear() {
        NotificationsCount notificationsCount = new NotificationsCount(0);
        this.f207493e = notificationsCount;
        this.f207491c.accept(notificationsCount);
    }

    @Override // com.avito.android.notification_center.counter.f
    @Y61.k
    public final z<NotificationsCount> getCount() {
        NotificationsCount notificationsCount = this.f207493e;
        com.jakewharton.rxrelay3.c<NotificationsCount> cVar = this.f207491c;
        if (notificationsCount == null) {
            return cVar;
        }
        C41998x0 c41998x0C0 = z.c0(notificationsCount);
        cVar.getClass();
        return z.q(c41998x0C0, cVar);
    }
}
