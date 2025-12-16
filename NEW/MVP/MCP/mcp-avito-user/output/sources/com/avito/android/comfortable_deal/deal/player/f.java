package com.avito.android.comfortable_deal.deal.player;

import androidx.compose.runtime.internal.P;
import androidx.media3.common.H;
import aq.InterfaceC23651a;
import com.avito.android.di.B;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AudioPlayerHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/f;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23651a f121764a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f121765b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43238h f121766c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z1<Boolean> f121767d;

    /* compiled from: AudioPlayerHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/media3/common/H$g;", "invoke", "()Landroidx/media3/common/H$g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<H.g> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final H.g invoke() {
            return new e(f.this);
        }
    }

    /* compiled from: AudioPlayerHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.player.AudioPlayerHelper$getProgressObservable$1", f = "AudioPlayerHelper.kt", i = {0, 1}, l = {61, 62}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Integer>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121769q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121770r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f121770r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Integer> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006f -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f121769q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r10.f121770r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
            L15:
                r11 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                java.lang.Object r1 = r10.f121770r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L65
            L27:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f121770r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
            L2e:
                kotlin.coroutines.CoroutineContext r1 = r10.get$context()
                boolean r1 = kotlinx.coroutines.Q0.h(r1)
                if (r1 == 0) goto L72
                com.avito.android.comfortable_deal.deal.player.f r1 = com.avito.android.comfortable_deal.deal.player.f.this
                aq.a r1 = r1.f121764a
                androidx.media3.exoplayer.m r1 = r1.a()
                long r4 = r1.getCurrentPosition()
                double r4 = (double) r4
                long r6 = r1.getDuration()
                double r6 = (double) r6
                r8 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r6 = r6 / r8
                double r4 = r4 / r6
                int r1 = kotlin.math.b.a(r4)
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                r10.f121770r = r11
                r10.f121769q = r3
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L64
                return r0
            L64:
                r1 = r11
            L65:
                r10.f121770r = r1
                r10.f121769q = r2
                r4 = 100
                java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r4, r10)
                if (r11 != r0) goto L15
                return r0
            L72:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.player.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AudioPlayerHelper.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.deal.player.AudioPlayerHelper$getTimeObservable$1", f = "AudioPlayerHelper.kt", i = {0, 1}, l = {52, 53}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super String>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f121772q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f121773r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Long f121775t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f121775t = l12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(this.f121775t, continuation);
            cVar.f121773r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super String> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f121772q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f121773r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
            L15:
                r7 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f121773r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4c
            L27:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f121773r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            L2e:
                kotlin.coroutines.CoroutineContext r1 = r6.get$context()
                boolean r1 = kotlinx.coroutines.Q0.h(r1)
                if (r1 == 0) goto L59
                com.avito.android.comfortable_deal.deal.player.f r1 = com.avito.android.comfortable_deal.deal.player.f.this
                java.lang.Long r4 = r6.f121775t
                java.lang.String r1 = r1.a(r4)
                r6.f121773r = r7
                r6.f121772q = r3
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r7
            L4c:
                r6.f121773r = r1
                r6.f121772q = r2
                r4 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r7 = kotlinx.coroutines.C43131e0.b(r4, r6)
                if (r7 != r0) goto L15
                return r0
            L59:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.player.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k InterfaceC23651a interfaceC23651a, @Y61.k R0 r02) {
        this.f121764a = interfaceC23651a;
        this.f121765b = r02;
        this.f121766c = U.a(r02.b());
        this.f121767d = p2.a(Boolean.valueOf(interfaceC23651a.a().k()));
        interfaceC23651a.g("player_key", new a());
    }

    @Y61.k
    public final String a(@Y61.l Long l12) {
        InterfaceC23651a interfaceC23651a = this.f121764a;
        return interfaceC23651a.a().getCurrentPosition() <= 0 ? l12 != null ? r.b(l12.longValue()) : r.a(interfaceC23651a.a().getDuration()) : r.a(interfaceC23651a.a().getCurrentPosition());
    }

    @Y61.k
    public final InterfaceC43160i<Integer> b() {
        return C43175k.I(this.f121765b.d(), C43175k.r(C43175k.G(new b(null))));
    }

    @Y61.k
    public final InterfaceC43160i<String> c(@Y61.l Long l12) {
        return C43175k.I(this.f121765b.d(), C43175k.r(C43175k.G(new c(l12, null))));
    }
}
