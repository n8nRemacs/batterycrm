package com.avito.android.notifications_permission_messenger;

import Ck0.InterfaceC13317a;
import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup;
import com.avito.android.permissions.G;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkProviderImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/c;", "Lcom/avito/android/notifications_permission_messenger/b;", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class c implements com.avito.android.notifications_permission_messenger.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final U30.a f207907a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final V30.a f207908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f207909c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13317a f207910d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notifications_settings.profile.a f207911e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f207912f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final T30.a f207913g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final G f207914h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final P30.a f207915i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final I30.d f207916j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C f207917k;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/c$a;", "", "<init>", "()V", "", "DIALOG_PERIOD_MILLIS", "J", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<com.avito.android.notifications_permission_messenger.a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f207918b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f207919c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f207920b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f207921c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.notifications_permission_messenger.NotificationPermissionMessengerDialogDeeplinkProviderImpl$getDeeplinkIfNeeded$$inlined$map$1$2", f = "NotificationPermissionMessengerDialogDeeplinkProviderImpl.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.notifications_permission_messenger.c$b$a$a, reason: collision with other inner class name */
            public static final class C6202a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f207922q;

                /* renamed from: r, reason: collision with root package name */
                public int f207923r;

                public C6202a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f207922q = obj;
                    this.f207923r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, c cVar) {
                this.f207920b = interfaceC43172j;
                this.f207921c = cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.avito.android.notifications_permission_messenger.c.b.a.C6202a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.android.notifications_permission_messenger.c$b$a$a r0 = (com.avito.android.notifications_permission_messenger.c.b.a.C6202a) r0
                    int r1 = r0.f207923r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f207923r = r1
                    goto L18
                L13:
                    com.avito.android.notifications_permission_messenger.c$b$a$a r0 = new com.avito.android.notifications_permission_messenger.c$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f207922q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f207923r
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.C42729a0.b(r9)
                    goto Le3
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    kotlin.C42729a0.b(r9)
                    java.util.List r8 = (java.util.List) r8
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    r2 = r8
                    java.util.Collection r2 = (java.util.Collection) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L4d
                    com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$ProfileMessengerPushDisabled r2 = new com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$ProfileMessengerPushDisabled
                    r2.<init>(r8)
                    r9.add(r2)
                L4d:
                    com.avito.android.notifications_permission_messenger.c r8 = r7.f207921c
                    com.avito.android.util.C r2 = r8.f207917k
                    int r2 = r2.getF125487g()
                    r4 = 33
                    if (r2 < r4) goto L84
                    P30.a r2 = r8.f207915i
                    boolean r2 = r2.a()
                    if (r2 != 0) goto L94
                    com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled r2 = new com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled
                    com.avito.android.permissions.G r4 = r8.f207914h
                    java.lang.Boolean r5 = r4.k()
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                    boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
                    if (r5 != 0) goto L7c
                    java.lang.Boolean r4 = r4.k()
                    if (r4 != 0) goto L7a
                    goto L7c
                L7a:
                    r4 = 0
                    goto L7d
                L7c:
                    r4 = r3
                L7d:
                    r2.<init>(r4)
                    r9.add(r2)
                    goto L94
                L84:
                    I30.d r2 = r8.f207916j
                    boolean r2 = r2.b()
                    if (r2 != 0) goto L94
                    com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled r2 = new com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$SystemPermissionDisabled
                    r2.<init>(r3)
                    r9.add(r2)
                L94:
                    Ck0.a r2 = r8.f207910d
                    boolean r2 = r2.b()
                    if (r2 != 0) goto La1
                    com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink$Problem$MessengerNotificationChannelDisabled r2 = com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink.Problem.MessengerNotificationChannelDisabled.f207941b
                    r9.add(r2)
                La1:
                    boolean r2 = r9.isEmpty()
                    r4 = 0
                    if (r2 == 0) goto Lae
                    com.avito.android.notifications_permission_messenger.a r8 = new com.avito.android.notifications_permission_messenger.a
                    r8.<init>(r4)
                    goto Ld8
                Lae:
                    T30.a r8 = r8.f207913g
                    u3.l r2 = r8.a()
                    r2.b()
                    u3.l r8 = r8.a()
                    u3.m<T> r8 = r8.f439745a
                    T r8 = r8.f439749b
                    com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup r8 = (com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup) r8
                    r8.getClass()
                    com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup r2 = com.avito.android.notifications_permission_messenger.ab_test.config.NotificationPermissionMessengerTestGroup.f207903d
                    if (r8 != r2) goto Ld3
                    com.avito.android.notifications_permission_messenger.a r8 = new com.avito.android.notifications_permission_messenger.a
                    com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink r2 = new com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink
                    r2.<init>(r9)
                    r8.<init>(r2)
                    goto Ld8
                Ld3:
                    com.avito.android.notifications_permission_messenger.a r8 = new com.avito.android.notifications_permission_messenger.a
                    r8.<init>(r4)
                Ld8:
                    r0.f207923r = r3
                    kotlinx.coroutines.flow.j r9 = r7.f207920b
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto Le3
                    return r1
                Le3:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_permission_messenger.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, c cVar) {
            this.f207918b = interfaceC43160i;
            this.f207919c = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.notifications_permission_messenger.a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f207918b.collect(new a(interfaceC43172j, this.f207919c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notifications_permission_messenger.NotificationPermissionMessengerDialogDeeplinkProviderImpl$getDeeplinkIfNeeded$1", f = "NotificationPermissionMessengerDialogDeeplinkProviderImpl.kt", i = {}, l = {55, 55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.notifications_permission_messenger.c$c, reason: collision with other inner class name */
    public static final class C6203c extends SuspendLambda implements p<InterfaceC43172j<? super List<? extends String>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207925q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207926r;

        public C6203c(Continuation<? super C6203c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C6203c c6203c = c.this.new C6203c(continuation);
            c6203c.f207926r = obj;
            return c6203c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super List<? extends String>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6203c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207925q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f207926r;
                com.avito.android.notifications_settings.profile.a aVar = c.this.f207911e;
                this.f207926r = interfaceC43172j;
                this.f207925q = 1;
                obj = aVar.b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f207926r;
                C42729a0.b(obj);
            }
            this.f207926r = null;
            this.f207925q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k U30.a aVar, @Y61.k V30.a aVar2, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC13317a interfaceC13317a, @Y61.k com.avito.android.notifications_settings.profile.a aVar3, @Y61.k R0 r02, @Y61.k T30.a aVar4, @Y61.k G g12, @Y61.k P30.a aVar5, @Y61.k I30.d dVar, @Y61.k C c12) {
        this.f207907a = aVar;
        this.f207908b = aVar2;
        this.f207909c = fVar;
        this.f207910d = interfaceC13317a;
        this.f207911e = aVar3;
        this.f207912f = r02;
        this.f207913g = aVar4;
        this.f207914h = g12;
        this.f207915i = aVar5;
        this.f207916j = dVar;
        this.f207917k = c12;
    }

    @Override // com.avito.android.notifications_permission_messenger.b
    @Y61.k
    public final I<com.avito.android.notifications_permission_messenger.a> a() {
        U30.a aVar = this.f207907a;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = U30.a.f16148c[0];
        if (!((Boolean) aVar.f16149b.a().invoke()).booleanValue()) {
            return I.q(new com.avito.android.notifications_permission_messenger.a(null));
        }
        if (this.f207909c.now() - this.f207908b.a() < 604800000) {
            return I.q(new com.avito.android.notifications_permission_messenger.a(null));
        }
        NotificationPermissionMessengerTestGroup notificationPermissionMessengerTestGroup = this.f207913g.a().f439745a.f439749b;
        notificationPermissionMessengerTestGroup.getClass();
        if (notificationPermissionMessengerTestGroup != NotificationPermissionMessengerTestGroup.f207903d && notificationPermissionMessengerTestGroup != NotificationPermissionMessengerTestGroup.f207902c) {
            return I.q(new com.avito.android.notifications_permission_messenger.a(null));
        }
        return y.b(new b(C43175k.I(this.f207912f.a(), C43175k.G(new C6203c(null))), this)).S();
    }
}
