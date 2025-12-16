package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
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
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31762n implements InterfaceC43160i<b.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.internal.l f187572b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.n$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f187573b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderBootstrap$subscribeToAssistantSettingsDeeplinkChanges$$inlined$map$1$2", f = "ChannelsHeaderBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.n$a$a, reason: collision with other inner class name */
        public static final class C5499a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f187574q;

            /* renamed from: r, reason: collision with root package name */
            public int f187575r;

            public C5499a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f187574q = obj;
                this.f187575r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f187573b = interfaceC43172j;
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
                boolean r0 = r8 instanceof com.avito.android.messenger.channels.mvi.header_feature.C31762n.a.C5499a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.messenger.channels.mvi.header_feature.n$a$a r0 = (com.avito.android.messenger.channels.mvi.header_feature.C31762n.a.C5499a) r0
                int r1 = r0.f187575r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f187575r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.header_feature.n$a$a r0 = new com.avito.android.messenger.channels.mvi.header_feature.n$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f187574q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f187575r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L74
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r2 = 0
                if (r8 == 0) goto L4d
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                XY.a r7 = (XY.a) r7
                com.avito.android.deep_linking.links.DeepLink r7 = r7.getDeeplink()
                boolean r8 = r7 instanceof com.avito.android.deep_linking.links.NoMatchLink
                if (r8 != 0) goto L64
                r2 = r7
                goto L64
            L4d:
                boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r8 == 0) goto L77
                com.avito.android.util.X2 r8 = com.avito.android.util.X2.f318778a
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r7, r2)
                java.lang.String r4 = "ChannelsHeaderBootstrap"
                java.lang.String r5 = "getAssistantSettingsDeeplink request error!"
                r8.a(r4, r5, r7)
            L64:
                FY.b$a r7 = new FY.b$a
                r7.<init>(r2)
                r0.f187575r = r3
                kotlinx.coroutines.flow.j r8 = r6.f187573b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L74
                return r1
            L74:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L77:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.header_feature.C31762n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C31762n(kotlinx.coroutines.flow.internal.l lVar) {
        this.f187572b = lVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super b.a> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f187572b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
