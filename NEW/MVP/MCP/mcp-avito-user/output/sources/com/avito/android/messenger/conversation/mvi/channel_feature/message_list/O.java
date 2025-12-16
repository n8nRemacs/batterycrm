package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O implements InterfaceC43160i<NY.l> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f189870b;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f189871b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$combineWithVideoInfo$$inlined$map$1$2", f = "MessageListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O$a$a, reason: collision with other inner class name */
        public static final class C5605a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f189872q;

            /* renamed from: r, reason: collision with root package name */
            public int f189873r;

            public C5605a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f189872q = obj;
                this.f189873r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f189871b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r7 instanceof com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O.a.C5605a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O$a$a r0 = (com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O.a.C5605a) r0
                int r1 = r0.f189873r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f189873r = r1
                goto L18
            L13:
                com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O$a$a r0 = new com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f189872q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f189873r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L52
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                kotlin.Q r6 = (kotlin.Q) r6
                A r7 = r6.f406619b
                java.util.List r7 = (java.util.List) r7
                B r6 = r6.f406620c
                arrow.core.Y0 r6 = (arrow.core.Y0) r6
                NY.l r2 = new NY.l
                java.util.Map r4 = kotlin.collections.P0.c()
                r2.<init>(r7, r6, r4)
                r0.f189873r = r3
                kotlinx.coroutines.flow.j r6 = r5.f189871b
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L52
                return r1
            L52:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.O.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public O(C43197r1 c43197r1) {
        this.f189870b = c43197r1;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super NY.l> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f189870b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
