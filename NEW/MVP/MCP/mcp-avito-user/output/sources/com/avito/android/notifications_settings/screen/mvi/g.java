package com.avito.android.notifications_settings.screen.mvi;

import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationsSettingsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.arch.mvi.b<NotificationsSettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f208134a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f208135b;

    /* compiled from: NotificationsSettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsBootstrap$produce$1", f = "NotificationsSettingsBootstrap.kt", i = {0, 1}, l = {19, 20, 21}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super NotificationsSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208136q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208137r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f208137r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super NotificationsSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f208136q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L67
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f208137r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L54
            L25:
                java.lang.Object r1 = r5.f208137r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L45
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f208137r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction$Loading r1 = new com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction$Loading
                r1.<init>()
                r5.f208137r = r6
                r5.f208136q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L44
                return r0
            L44:
                r1 = r6
            L45:
                com.avito.android.notifications_settings.screen.mvi.g r6 = com.avito.android.notifications_settings.screen.mvi.g.this
                com.avito.android.notifications_settings.screen.mvi.l r6 = r6.f208134a
                r5.f208137r = r1
                r5.f208136q = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L54
                return r0
            L54:
                com.avito.android.remote.model.notifications_settings.NotificationsSettings r6 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings) r6
                com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction$Content r3 = new com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction$Content
                r3.<init>(r6)
                r6 = 0
                r5.f208137r = r6
                r5.f208136q = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L67
                return r0
            L67:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.screen.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NotificationsSettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notifications_settings.screen.mvi.NotificationsSettingsBootstrap$produce$2", f = "NotificationsSettingsBootstrap.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super NotificationsSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208139q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f208140r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f208141s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super NotificationsSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f208140r = interfaceC43172j;
            bVar.f208141s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208139q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f208140r;
                NotificationsSettingsInternalAction.Error error = new NotificationsSettingsInternalAction.Error(this.f208141s);
                this.f208140r = null;
                this.f208139q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
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

    @Inject
    public g(@Y61.k l lVar, boolean z12) {
        this.f208134a = lVar;
        this.f208135b = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<NotificationsSettingsInternalAction> a() {
        return !this.f208135b ? new C43152f0(C43175k.G(new a(null)), new b(3, null)) : new C43210w(NotificationsSettingsInternalAction.UpdateNotificationsEnabled.f208125b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
