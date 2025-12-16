package com.avito.android.messenger.channels.mvi.list_feature;

import HY.d;
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
public final class P0 implements InterfaceC43160i<d.g> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f187813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f187814c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f187815b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W f187816c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$subscribeToPrivateBannerStateUpdates$$inlined$map$1$2", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.P0$a$a, reason: collision with other inner class name */
        public static final class C5519a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f187817q;

            /* renamed from: r, reason: collision with root package name */
            public int f187818r;

            public C5519a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f187817q = obj;
                this.f187818r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, W w12) {
            this.f187815b = interfaceC43172j;
            this.f187816c = w12;
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
                boolean r0 = r10 instanceof com.avito.android.messenger.channels.mvi.list_feature.P0.a.C5519a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.messenger.channels.mvi.list_feature.P0$a$a r0 = (com.avito.android.messenger.channels.mvi.list_feature.P0.a.C5519a) r0
                int r1 = r0.f187818r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f187818r = r1
                goto L18
            L13:
                com.avito.android.messenger.channels.mvi.list_feature.P0$a$a r0 = new com.avito.android.messenger.channels.mvi.list_feature.P0$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f187817q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f187818r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r10)
                goto La8
            L2a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L32:
                kotlin.C42729a0.b(r10)
                HY.j r9 = (HY.j) r9
                HY.d$g r10 = new HY.d$g
                com.avito.android.messenger.channels.action_banner.d r9 = r9.f7247a
                r2 = 0
                if (r9 == 0) goto L9a
                com.avito.android.messenger.channels.mvi.list_feature.W r4 = r8.f187816c
                r4.getClass()
                boolean r4 = r9 instanceof com.avito.android.messenger.channels.action_banner.d.b
                int r5 = r9.f186718c
                java.lang.Integer r6 = r9.f186717b
                if (r4 == 0) goto L5a
                if (r6 != 0) goto L4e
                goto L9a
            L4e:
                com.avito.android.messenger.channels.adapter.ChannelsListItem$d r2 = new com.avito.android.messenger.channels.adapter.ChannelsListItem$d
                int r9 = r6.intValue()
                com.avito.android.remote.model.UniversalImage r4 = com.avito.android.messenger.channels.action_banner.d.b.f186726i
                r2.<init>(r9, r5, r4)
                goto L9a
            L5a:
                boolean r4 = r9 instanceof com.avito.android.messenger.channels.action_banner.d.c
                java.lang.Integer r7 = r9.f186719d
                if (r4 == 0) goto L75
                if (r6 == 0) goto L9a
                if (r7 != 0) goto L65
                goto L9a
            L65:
                com.avito.android.messenger.channels.adapter.ChannelsListItem$e r2 = new com.avito.android.messenger.channels.adapter.ChannelsListItem$e
                int r9 = r6.intValue()
                int r4 = r7.intValue()
                com.avito.android.remote.model.UniversalImage r6 = com.avito.android.messenger.channels.action_banner.d.c.f186729i
                r2.<init>(r9, r5, r4, r6)
                goto L9a
            L75:
                boolean r4 = r9 instanceof com.avito.android.messenger.channels.action_banner.d.a
                if (r4 == 0) goto L94
                if (r6 == 0) goto L9a
                if (r7 == 0) goto L9a
                java.lang.Integer r9 = r9.f186721f
                if (r9 != 0) goto L82
                goto L9a
            L82:
                com.avito.android.messenger.channels.adapter.ChannelsListItem$a r2 = new com.avito.android.messenger.channels.adapter.ChannelsListItem$a
                int r4 = r6.intValue()
                int r9 = r9.intValue()
                int r6 = r7.intValue()
                r2.<init>(r4, r9, r5, r6)
                goto L9a
            L94:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            L9a:
                r10.<init>(r2)
                r0.f187818r = r3
                kotlinx.coroutines.flow.j r9 = r8.f187815b
                java.lang.Object r9 = r9.emit(r10, r0)
                if (r9 != r1) goto La8
                return r1
            La8:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.P0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public P0(C43197r1 c43197r1, W w12) {
        this.f187813b = c43197r1;
        this.f187814c = w12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super d.g> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f187813b.collect(new a(interfaceC43172j, this.f187814c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
