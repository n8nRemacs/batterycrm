package com.avito.android.passport_lib;

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
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements InterfaceC43160i<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f213930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f213931c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f213932b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f213933c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.passport_lib.PassportStateRepositoryImpl$loadAndSavePassportAvailability$$inlined$map$1$2", f = "PassportStateRepository.kt", i = {0}, l = {221, 219}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: com.avito.android.passport_lib.o$a$a, reason: collision with other inner class name */
        public static final class C6416a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f213934q;

            /* renamed from: r, reason: collision with root package name */
            public int f213935r;

            /* renamed from: s, reason: collision with root package name */
            public a f213936s;

            /* renamed from: u, reason: collision with root package name */
            public InterfaceC43172j f213938u;

            public C6416a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f213934q = obj;
                this.f213935r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, q qVar) {
            this.f213932b = interfaceC43172j;
            this.f213933c = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.passport_lib.o.a.C6416a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.passport_lib.o$a$a r0 = (com.avito.android.passport_lib.o.a.C6416a) r0
                int r1 = r0.f213935r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f213935r = r1
                goto L18
            L13:
                com.avito.android.passport_lib.o$a$a r0 = new com.avito.android.passport_lib.o$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f213934q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f213935r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r8)
                goto L86
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                kotlinx.coroutines.flow.j r7 = r0.f213938u
                com.avito.android.passport_lib.o$a r2 = r0.f213936s
                kotlin.C42729a0.b(r8)
                goto L5c
            L3c:
                kotlin.C42729a0.b(r8)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                kotlinx.coroutines.flow.j r8 = r6.f213932b
                if (r7 == 0) goto L5f
                r0.f213936s = r6
                r0.f213938u = r8
                r0.f213935r = r4
                com.avito.android.passport_lib.q r7 = r6.f213933c
                java.lang.Object r7 = com.avito.android.passport_lib.q.b(r7, r0)
                if (r7 != r1) goto L58
                return r1
            L58:
                r2 = r6
                r5 = r8
                r8 = r7
                r7 = r5
            L5c:
                com.avito.android.passport_lib.m r8 = (com.avito.android.passport_lib.m) r8
                goto L69
            L5f:
                com.avito.android.passport_lib.m r7 = new com.avito.android.passport_lib.m
                r2 = 0
                r7.<init>(r2, r2)
                r2 = r6
                r5 = r8
                r8 = r7
                r7 = r5
            L69:
                com.avito.android.passport_lib.q r2 = r2.f213933c
                boolean r4 = r8.f213929b
                com.avito.android.account.G r2 = r2.f213943b
                r2.l(r4)
                boolean r8 = r8.f213928a
                java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
                r2 = 0
                r0.f213936s = r2
                r0.f213938u = r2
                r0.f213935r = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L86
                return r1
            L86:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport_lib.o.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public o(InterfaceC43160i interfaceC43160i, q qVar) {
        this.f213930b = interfaceC43160i;
        this.f213931c = qVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f213930b).collect(new a(interfaceC43172j, this.f213931c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
