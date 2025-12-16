package com.avito.android.user_adverts.root_screen.adverts_host.binder;

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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC43160i<DI0.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f312410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a f312411c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312412b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a f312413c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.binder.HeaderEventBinder$bindHostEvent$$inlined$mapNotNull$1$2", f = "HeaderEventBinder.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.binder.b$a$a, reason: collision with other inner class name */
        public static final class C9536a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312414q;

            /* renamed from: r, reason: collision with root package name */
            public int f312415r;

            public C9536a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312414q = obj;
                this.f312415r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a aVar) {
            this.f312412b = interfaceC43172j;
            this.f312413c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.binder.b.a.C9536a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.user_adverts.root_screen.adverts_host.binder.b$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.binder.b.a.C9536a) r0
                int r1 = r0.f312415r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f312415r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.binder.b$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.binder.b$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f312414q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f312415r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L86
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                AI0.b r5 = (AI0.b) r5
                com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a r6 = r4.f312413c
                r6.getClass()
                boolean r6 = r5 instanceof AI0.b.a
                r2 = 0
                if (r6 == 0) goto L64
                AI0.b$a r5 = (AI0.b.a) r5
                II0.c r5 = r5.f266a
                boolean r6 = r5 instanceof II0.c.b
                if (r6 == 0) goto L52
                DI0.b$a r2 = new DI0.b$a
                II0.c$b r5 = (II0.c.b) r5
                com.avito.android.deep_linking.links.DeepLink r5 = r5.f8100a
                r2.<init>(r5)
                goto L79
            L52:
                boolean r6 = r5 instanceof II0.c.C0456c
                if (r6 == 0) goto L59
                DI0.b$e r2 = DI0.b.e.f3150a
                goto L79
            L59:
                boolean r5 = r5 instanceof II0.c.a
                if (r5 == 0) goto L5e
                goto L79
            L5e:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L64:
                boolean r6 = r5 instanceof AI0.b.C0015b
                if (r6 == 0) goto L79
                AI0.b$b r5 = (AI0.b.C0015b) r5
                MI0.c r5 = r5.f267a
                boolean r6 = r5 instanceof MI0.c.a
                if (r6 == 0) goto L79
                DI0.b$d r2 = new DI0.b$d
                MI0.c$a r5 = (MI0.c.a) r5
                KI0.a r5 = r5.f10574a
                r2.<init>(r5)
            L79:
                if (r2 == 0) goto L86
                r0.f312415r = r3
                kotlinx.coroutines.flow.j r5 = r4.f312412b
                java.lang.Object r5 = r5.emit(r2, r0)
                if (r5 != r1) goto L86
                return r1
            L86:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.binder.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(InterfaceC43160i interfaceC43160i, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.a aVar) {
        this.f312410b = interfaceC43160i;
        this.f312411c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super DI0.b> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312410b.collect(new a(interfaceC43172j, this.f312411c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
