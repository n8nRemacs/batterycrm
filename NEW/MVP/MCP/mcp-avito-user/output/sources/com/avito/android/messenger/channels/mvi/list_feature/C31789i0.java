package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.channels.mvi.list_feature.W;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.i0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31789i0 implements InterfaceC43160i<W.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f188083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f188084c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.i0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f188085b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W f188086c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToChannelTags$$inlined$map$1$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.i0$a$a, reason: collision with other inner class name */
        public static final class C5537a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f188087q;

            /* renamed from: r, reason: collision with root package name */
            public int f188088r;

            public C5537a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f188087q = obj;
                this.f188088r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, W w12) {
            this.f188085b = interfaceC43172j;
            this.f188086c = w12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof com.avito.android.messenger.channels.mvi.list_feature.C31789i0.a.C5537a
                if (r0 == 0) goto L13
                r0 = r14
                com.avito.android.messenger.channels.mvi.list_feature.i0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.C31789i0.a.C5537a) r0
                int r1 = r0.f188088r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f188088r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.i0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.i0$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f188087q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f188088r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r14)
                goto L6c
            L29:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L31:
                kotlin.C42729a0.b(r14)
                HY.m r13 = (HY.m) r13
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r14 = r13.f7254e
                com.avito.android.messenger.channels.mvi.list_feature.W r2 = r12.f188086c
                java.util.ArrayList r14 = com.avito.android.messenger.channels.mvi.list_feature.W.a(r2, r14)
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r4 = r13.f7257h
                java.util.ArrayList r2 = com.avito.android.messenger.channels.mvi.list_feature.W.a(r2, r4)
                com.avito.android.messenger.channels.mvi.list_feature.W$a r11 = new com.avito.android.messenger.channels.mvi.list_feature.W$a
                ru.avito.messenger.MessengerUserHashInfo r13 = r13.f7250a
                if (r13 == 0) goto L4e
                java.lang.String r13 = r13.f430682d
            L4c:
                r5 = r13
                goto L50
            L4e:
                r13 = 0
                goto L4c
            L50:
                kotlin.collections.z0 r7 = kotlin.collections.C42784z0.f406748b
                java.util.ArrayList r13 = kotlin.collections.C42745f0.h0(r2, r14)
                java.util.List r8 = kotlin.collections.C42745f0.v(r13)
                r10 = 0
                r6 = 0
                r9 = 2
                r4 = r11
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.f188088r = r3
                kotlinx.coroutines.flow.j r13 = r12.f188085b
                java.lang.Object r13 = r13.emit(r11, r0)
                if (r13 != r1) goto L6c
                return r1
            L6c:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31789i0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C31789i0(n2 n2Var, W w12) {
        this.f188083b = n2Var;
        this.f188084c = w12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super W.a> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f188083b.collect(new a(interfaceC43172j, this.f188084c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
