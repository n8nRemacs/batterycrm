package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
/* loaded from: classes15.dex */
public final class V0 implements InterfaceC43160i<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f187858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f187859c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f187860b;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToTypingEvents$$inlined$map$1$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.V0$a$a, reason: collision with other inner class name */
        public static final class C5522a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f187861q;

            /* renamed from: r, reason: collision with root package name */
            public int f187862r;

            public C5522a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f187861q = obj;
                this.f187862r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, W w12) {
            this.f187860b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.messenger.channels.mvi.list_feature.V0.a.C5522a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.messenger.channels.mvi.list_feature.V0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.V0.a.C5522a) r0
                int r1 = r0.f187862r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f187862r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.V0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.V0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f187861q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f187862r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L72
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                HY.m r5 = (HY.m) r5
                HY.m$c r6 = r5.f7251b
                HY.m$c$b r2 = HY.m.c.b.f7265a
                boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                if (r6 == 0) goto L62
                HY.m$b r6 = r5.f7255f
                if (r6 == 0) goto L62
                HY.m$d r6 = r6.f7263b
                boolean r6 = r6.getF7270b()
                if (r6 != 0) goto L62
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r6 = r5.f7254e
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L60
                java.util.List<kotlin.Q<com.avito.android.remote.model.messenger.Channel, com.avito.android.persistence.messenger.P0>> r5 = r5.f7257h
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L62
            L60:
                r5 = r3
                goto L63
            L62:
                r5 = 0
            L63:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                r0.f187862r = r3
                kotlinx.coroutines.flow.j r6 = r4.f187860b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L72
                return r1
            L72:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.V0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public V0(n2 n2Var, W w12) {
        this.f187858b = n2Var;
        this.f187859c = w12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f187858b.collect(new a(interfaceC43172j, this.f187859c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
