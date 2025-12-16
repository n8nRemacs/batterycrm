package com.avito.android.user_adverts.tab_actions.host.mvi;

import YI0.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements InterfaceC43160i<a.d> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f314534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f314535c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f314536b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f314537c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$groupLoadingActions$$inlined$filter$2$2", f = "UserAdvertsActionsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C9716a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f314538q;

            /* renamed from: r, reason: collision with root package name */
            public int f314539r;

            public C9716a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f314538q = obj;
                this.f314539r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar) {
            this.f314536b = interfaceC43172j;
            this.f314537c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.k.a.C9716a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.user_adverts.tab_actions.host.mvi.k$a$a r0 = (com.avito.android.user_adverts.tab_actions.host.mvi.k.a.C9716a) r0
                int r1 = r0.f314539r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f314539r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_actions.host.mvi.k$a$a r0 = new com.avito.android.user_adverts.tab_actions.host.mvi.k$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f314538q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f314539r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r10)
                goto L6d
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L31:
                kotlin.C42729a0.b(r10)
                r10 = r9
                YI0.a$d r10 = (YI0.a.d) r10
                com.avito.android.user_adverts.model.UserAdvertActionType$Multiple r2 = r10.f19420c
                Y41.a r4 = r8.f314537c
                java.lang.Object r5 = r4.invoke()
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState) r5
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$ActionState r5 = r5.f314464c
                boolean r6 = r5 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.ActionState.AwaitConfirmation
                r7 = 0
                if (r6 == 0) goto L4b
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState$ActionState$AwaitConfirmation r5 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState.ActionState.AwaitConfirmation) r5
                goto L4c
            L4b:
                r5 = r7
            L4c:
                if (r5 == 0) goto L50
                com.avito.android.user_adverts.model.UserAdvertActionType r7 = r5.f314467b
            L50:
                if (r2 != r7) goto L6d
                java.lang.Object r2 = r4.invoke()
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState r2 = (com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState) r2
                java.lang.String r2 = r2.f314463b
                java.lang.String r10 = r10.f19419b
                boolean r10 = kotlin.jvm.internal.L.f(r10, r2)
                if (r10 == 0) goto L6d
                r0.f314539r = r3
                kotlinx.coroutines.flow.j r10 = r8.f314536b
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L6d
                return r1
            L6d:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.mvi.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public k(n nVar, Y41.a aVar) {
        this.f314534b = nVar;
        this.f314535c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super a.d> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f314534b.collect(new a(interfaceC43172j, this.f314535c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
