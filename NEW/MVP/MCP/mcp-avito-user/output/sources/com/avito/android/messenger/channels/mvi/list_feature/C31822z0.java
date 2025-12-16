package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31822z0 implements InterfaceC43160i<Set<? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f188279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f188280c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f188281b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W f188282c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToInterlocutorIdsForLastActivityPolling$$inlined$map$2$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.z0$a$a, reason: collision with other inner class name */
        public static final class C5550a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f188283q;

            /* renamed from: r, reason: collision with root package name */
            public int f188284r;

            public C5550a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f188283q = obj;
                this.f188284r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, W w12) {
            this.f188281b = interfaceC43172j;
            this.f188282c = w12;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r9 instanceof com.avito.android.messenger.channels.mvi.list_feature.C31822z0.a.C5550a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.messenger.channels.mvi.list_feature.z0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.C31822z0.a.C5550a) r0
                int r1 = r0.f188284r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f188284r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.z0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.z0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f188283q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f188284r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r9)
                goto L73
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C42729a0.b(r9)
                kotlin.Q r8 = (kotlin.Q) r8
                A r9 = r8.f406619b
                HY.m r9 = (HY.m) r9
                B r8 = r8.f406620c
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L66
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r8 = r9.f7254e
                r2 = 0
                ru.avito.messenger.MessengerUserHashInfo r4 = r9.f7250a
                if (r4 == 0) goto L4e
                java.lang.String r5 = r4.f430682d
                goto L4f
            L4e:
                r5 = r2
            L4f:
                com.avito.android.messenger.channels.mvi.list_feature.W r6 = r7.f188282c
                java.util.Set r8 = com.avito.android.messenger.channels.mvi.list_feature.W.b(r6, r8, r5)
                if (r4 == 0) goto L59
                java.lang.String r2 = r4.f430682d
            L59:
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r9 = r9.f7257h
                java.util.Set r9 = com.avito.android.messenger.channels.mvi.list_feature.W.b(r6, r9, r2)
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.LinkedHashSet r8 = kotlin.collections.b1.h(r8, r9)
                goto L68
            L66:
                kotlin.collections.B0 r8 = kotlin.collections.B0.f406639b
            L68:
                r0.f188284r = r3
                kotlinx.coroutines.flow.j r9 = r7.f188281b
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L73
                return r1
            L73:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31822z0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C31822z0(InterfaceC43160i interfaceC43160i, W w12) {
        this.f188279b = interfaceC43160i;
        this.f188280c = w12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Set<? extends String>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f188279b.collect(new a(interfaceC43172j, this.f188280c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
