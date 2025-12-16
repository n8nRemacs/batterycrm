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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35643c implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35642b f314405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.d f314406c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.c$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f314407b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a.d f314408c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.mvi.UserAdvertsActionsActor$awaitCptMassActivation$$inlined$map$1$2", f = "UserAdvertsActionsActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C9707a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f314409q;

            /* renamed from: r, reason: collision with root package name */
            public int f314410r;

            public C9707a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f314409q = obj;
                this.f314410r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, a.d dVar) {
            this.f314407b = interfaceC43172j;
            this.f314408c = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_actions.host.mvi.C35643c.a.C9707a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.user_adverts.tab_actions.host.mvi.c$a$a r0 = (com.avito.android.user_adverts.tab_actions.host.mvi.C35643c.a.C9707a) r0
                int r1 = r0.f314410r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f314410r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_actions.host.mvi.c$a$a r0 = new com.avito.android.user_adverts.tab_actions.host.mvi.c$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f314409q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f314410r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L69
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                kv.a r7 = (kv.C43501a) r7
                Ju.c r7 = r7.f413261b
                boolean r8 = r7 instanceof com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink.b.C7613b
                if (r8 == 0) goto L4e
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Success r8 = new com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Success
                YI0.a$d r2 = r6.f314408c
                java.util.Map<com.avito.android.user_adverts.model.UserAdvertsShortcutGroup, com.avito.android.user_adverts.model.UserAdvertsGroupInfo> r4 = r2.f19418a
                com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink$b$b r7 = (com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink.b.C7613b) r7
                hm0.a r7 = r7.f254392b
                java.lang.String r5 = r2.f19419b
                com.avito.android.user_adverts.model.UserAdvertActionType$Multiple r2 = r2.f19420c
                r8.<init>(r4, r5, r2, r7)
                goto L5e
            L4e:
                boolean r8 = r7 instanceof com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink.b.a
                if (r8 == 0) goto L5c
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ErrorActionHandling r8 = new com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ErrorActionHandling
                com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink$b$a r7 = (com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink.b.a) r7
                com.avito.android.remote.error.ApiError r7 = r7.f254391b
                r8.<init>(r7)
                goto L5e
            L5c:
                com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction$ResultActionHandling$Multiple$Cancelled r8 = com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction.ResultActionHandling.Multiple.Cancelled.f314437b
            L5e:
                r0.f314410r = r3
                kotlinx.coroutines.flow.j r7 = r6.f314407b
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L69
                return r1
            L69:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_actions.host.mvi.C35643c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35643c(C35642b c35642b, a.d dVar) {
        this.f314405b = c35642b;
        this.f314406c = dVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f314405b.collect(new a(interfaceC43172j, this.f314406c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
