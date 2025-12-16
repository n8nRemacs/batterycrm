package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import arrow.core.Y0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class U implements InterfaceC43160i<Y0<? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f189892b;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f189893b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToChannelContextInteractorStateUpdates$$inlined$map$2$2", f = "MessageListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U$a$a, reason: collision with other inner class name */
        public static final class C5607a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f189894q;

            /* renamed from: r, reason: collision with root package name */
            public int f189895r;

            public C5607a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f189894q = obj;
                this.f189895r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f189893b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U.a.C5607a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U.a.C5607a) r0
                int r1 = r0.f189895r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f189895r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f189894q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f189895r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L81
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.messenger.conversation.mvi.context.a$a r6 = (com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a) r6
                com.avito.android.mvi.b<com.avito.android.remote.model.messenger.Channel> r7 = r6.f190237b
                boolean r2 = r7 instanceof com.avito.android.mvi.b.d
                r4 = 0
                if (r2 == 0) goto L40
                com.avito.android.mvi.b$d r7 = (com.avito.android.mvi.b.d) r7
                goto L41
            L40:
                r7 = r4
            L41:
                if (r7 == 0) goto L45
                T r4 = r7.f207035a
            L45:
                com.avito.android.remote.model.messenger.Channel r4 = (com.avito.android.remote.model.messenger.Channel) r4
                if (r4 == 0) goto L6a
                com.avito.android.remote.model.messenger.InputState r7 = r4.getInputState()
                if (r7 == 0) goto L56
                boolean r7 = r7.isDisabled()
                if (r7 != r3) goto L56
                goto L62
            L56:
                com.avito.android.remote.model.messenger.InputState r7 = r4.getInputState()
                if (r7 != 0) goto L6a
                com.avito.android.remote.model.messenger.ReadOnlyState r7 = r4.getReadOnlyState()
                if (r7 == 0) goto L6a
            L62:
                arrow.core.Y0$a r6 = arrow.core.Y0.f56266a
                r6.getClass()
                arrow.core.X0 r6 = arrow.core.X0.f56264b
                goto L76
            L6a:
                java.util.Set<java.lang.String> r6 = r6.f190238c
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.lang.Object r6 = kotlin.collections.C42745f0.R(r6)
                arrow.core.Y0 r6 = arrow.core.Z0.b(r6)
            L76:
                r0.f189895r = r3
                kotlinx.coroutines.flow.j r7 = r5.f189893b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L81
                return r1
            L81:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.U.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public U(InterfaceC43160i interfaceC43160i) {
        this.f189892b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Y0<? extends String>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f189892b).collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
