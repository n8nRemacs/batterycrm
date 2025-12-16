package com.avito.android.user_adverts.root_screen.adverts_host.binder;

import AI0.a;
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
public final class k implements InterfaceC43160i<a.m> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f312455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e f312456c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312457b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e f312458c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.binder.HostViewActionBinder$bindProfileHeaderAction$$inlined$mapNotNull$2$2", f = "HostViewActionBinder.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.binder.k$a$a, reason: collision with other inner class name */
        public static final class C9541a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312459q;

            /* renamed from: r, reason: collision with root package name */
            public int f312460r;

            public C9541a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312459q = obj;
                this.f312460r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e eVar) {
            this.f312457b = interfaceC43172j;
            this.f312458c = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r21, @Y61.k kotlin.coroutines.Continuation r22) {
            /*
                r20 = this;
                r0 = r20
                r1 = r22
                boolean r2 = r1 instanceof com.avito.android.user_adverts.root_screen.adverts_host.binder.k.a.C9541a
                if (r2 == 0) goto L17
                r2 = r1
                com.avito.android.user_adverts.root_screen.adverts_host.binder.k$a$a r2 = (com.avito.android.user_adverts.root_screen.adverts_host.binder.k.a.C9541a) r2
                int r3 = r2.f312460r
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f312460r = r3
                goto L1c
            L17:
                com.avito.android.user_adverts.root_screen.adverts_host.binder.k$a$a r2 = new com.avito.android.user_adverts.root_screen.adverts_host.binder.k$a$a
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f312459q
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r2.f312460r
                r5 = 1
                if (r4 == 0) goto L35
                if (r4 != r5) goto L2d
                kotlin.C42729a0.b(r1)
                goto L6b
            L2d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L35:
                kotlin.C42729a0.b(r1)
                r1 = r21
                com.avito.android.user_adverts.root_screen.adverts_host.host_view.a r1 = (com.avito.android.user_adverts.root_screen.adverts_host.host_view.a) r1
                com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e r4 = r0.f312458c
                r4.getClass()
                boolean r1 = r1 instanceof com.avito.android.user_adverts.root_screen.adverts_host.host_view.a.d
                if (r1 == 0) goto L5d
                AI0.a$m r1 = new AI0.a$m
                r18 = 1523(0x5f3, float:2.134E-42)
                r19 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 1
                r17 = 0
                r6 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                goto L5e
            L5d:
                r1 = 0
            L5e:
                if (r1 == 0) goto L6b
                r2.f312460r = r5
                kotlinx.coroutines.flow.j r4 = r0.f312457b
                java.lang.Object r1 = r4.emit(r1, r2)
                if (r1 != r3) goto L6b
                return r3
            L6b:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.binder.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public k(InterfaceC43160i interfaceC43160i, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.e eVar) {
        this.f312455b = interfaceC43160i;
        this.f312456c = eVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super a.m> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312455b.collect(new a(interfaceC43172j, this.f312456c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
