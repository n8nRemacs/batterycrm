package com.avito.beduin.v2.interaction.network.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.engine.InterfaceC36238a;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements InterfaceC43160i<dU0.f> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f337665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f337666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f337667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337668e;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f337669b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f337670c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f337671d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337672e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.beduin.v2.interaction.network.flow.NetworkRequestInteractionHandler$handle$$inlined$mapNotNull$1$2", f = "NetworkRequestInteractionHandler.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.beduin.v2.interaction.network.flow.j$a$a, reason: collision with other inner class name */
        public static final class C10466a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f337673q;

            /* renamed from: r, reason: collision with root package name */
            public int f337674r;

            public C10466a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f337673q = obj;
                this.f337674r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, h hVar, g gVar, InterfaceC36238a interfaceC36238a) {
            this.f337669b = interfaceC43172j;
            this.f337670c = hVar;
            this.f337671d = gVar;
            this.f337672e = interfaceC36238a;
        }

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
                boolean r0 = r9 instanceof com.avito.beduin.v2.interaction.network.flow.j.a.C10466a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.beduin.v2.interaction.network.flow.j$a$a r0 = (com.avito.beduin.v2.interaction.network.flow.j.a.C10466a) r0
                int r1 = r0.f337674r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f337674r = r1
                goto L18
            L13:
                com.avito.beduin.v2.interaction.network.flow.j$a$a r0 = new com.avito.beduin.v2.interaction.network.flow.j$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f337673q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f337674r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r9)
                goto L9a
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C42729a0.b(r9)
                com.avito.beduin.v2.interaction.network.flow.h$b r8 = (com.avito.beduin.v2.interaction.network.flow.h.b) r8
                com.avito.beduin.v2.engine.a r9 = r7.f337672e
                com.avito.beduin.v2.engine.i r9 = r9.c()
                int r2 = com.avito.beduin.v2.interaction.network.flow.h.f337640i
                com.avito.beduin.v2.interaction.network.flow.h r2 = r7.f337670c
                r2.getClass()
                com.avito.beduin.v2.engine.field.entity.A r9 = r8.a(r9)
                RU0.b r2 = RU0.b.f14467a
                com.avito.beduin.v2.logger.LogLevel[] r4 = com.avito.beduin.v2.logger.LogLevel.f337864b
                r2.getClass()
                int r2 = RU0.b.f14469c
                if (r3 < r2) goto L72
                RU0.c r2 = RU0.b.f14468b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = RU0.b.f14470d
                java.lang.String r6 = ":NetworkRequest"
                java.lang.String r4 = AK.c.s(r4, r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "NetworkRequest args: "
                r5.<init>(r6)
                r5.append(r9)
                java.lang.String r5 = r5.toString()
                r2.d(r4, r5)
            L72:
                boolean r8 = r8 instanceof com.avito.beduin.v2.interaction.network.flow.h.b.c
                com.avito.beduin.v2.interaction.network.flow.g r2 = r7.f337671d
                if (r8 == 0) goto L83
                Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> r8 = r2.f337627i
                com.avito.beduin.v2.interaction.network.flow.g$a$c r8 = (com.avito.beduin.v2.interaction.network.flow.g.a.c) r8
                java.lang.Object r8 = r8.invoke(r9)
                dU0.f r8 = (dU0.f) r8
                goto L8d
            L83:
                Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> r8 = r2.f337625g
                com.avito.beduin.v2.interaction.network.flow.g$a$a r8 = (com.avito.beduin.v2.interaction.network.flow.g.a.C10463a) r8
                java.lang.Object r8 = r8.invoke(r9)
                dU0.f r8 = (dU0.f) r8
            L8d:
                if (r8 == 0) goto L9a
                r0.f337674r = r3
                kotlinx.coroutines.flow.j r9 = r7.f337669b
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L9a
                return r1
            L9a:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.interaction.network.flow.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public j(InterfaceC43160i interfaceC43160i, h hVar, g gVar, InterfaceC36238a interfaceC36238a) {
        this.f337665b = interfaceC43160i;
        this.f337666c = hVar;
        this.f337667d = gVar;
        this.f337668e = interfaceC36238a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super dU0.f> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f337665b.collect(new a(interfaceC43172j, this.f337666c, this.f337667d, this.f337668e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
