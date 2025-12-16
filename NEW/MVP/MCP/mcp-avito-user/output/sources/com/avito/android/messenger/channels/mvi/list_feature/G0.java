package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class G0 implements InterfaceC43160i<kotlin.Q<? extends HY.m, ? extends HY.m>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f187728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f187729c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f187730b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W f187731c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToLogouts$$inlined$filter$1$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.G0$a$a, reason: collision with other inner class name */
        public static final class C5511a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f187732q;

            /* renamed from: r, reason: collision with root package name */
            public int f187733r;

            public C5511a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f187732q = obj;
                this.f187733r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, W w12) {
            this.f187730b = interfaceC43172j;
            this.f187731c = w12;
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
                boolean r0 = r7 instanceof com.avito.android.messenger.channels.mvi.list_feature.G0.a.C5511a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.messenger.channels.mvi.list_feature.G0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.G0.a.C5511a) r0
                int r1 = r0.f187733r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f187733r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.G0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.G0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f187732q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f187733r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L5b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                r7 = r6
                kotlin.Q r7 = (kotlin.Q) r7
                A r2 = r7.f406619b
                HY.m r2 = (HY.m) r2
                B r7 = r7.f406620c
                HY.m r7 = (HY.m) r7
                if (r2 != 0) goto L42
                goto L5b
            L42:
                com.avito.android.messenger.channels.mvi.list_feature.W r4 = r5.f187731c
                boolean r2 = com.avito.android.messenger.channels.mvi.list_feature.W.c(r4, r2)
                boolean r7 = com.avito.android.messenger.channels.mvi.list_feature.W.c(r4, r7)
                if (r2 != 0) goto L5b
                if (r7 == 0) goto L5b
                r0.f187733r = r3
                kotlinx.coroutines.flow.j r7 = r5.f187730b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L5b
                return r1
            L5b:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.G0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public G0(InterfaceC43160i interfaceC43160i, W w12) {
        this.f187728b = interfaceC43160i;
        this.f187729c = w12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super kotlin.Q<? extends HY.m, ? extends HY.m>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f187728b.collect(new a(interfaceC43172j, this.f187729c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
