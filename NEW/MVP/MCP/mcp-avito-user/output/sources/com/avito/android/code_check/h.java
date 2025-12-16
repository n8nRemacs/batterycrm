package com.avito.android.code_check;

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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements InterfaceC43160i<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f118834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f118835c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f118836b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f118837c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.code_check.CodeCheckDataViewModelImpl$getTimeLeft$$inlined$map$1$2", f = "CodeCheckDataViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.code_check.h$a$a, reason: collision with other inner class name */
        public static final class C3464a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f118838q;

            /* renamed from: r, reason: collision with root package name */
            public int f118839r;

            public C3464a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f118838q = obj;
                this.f118839r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, g gVar) {
            this.f118836b = interfaceC43172j;
            this.f118837c = gVar;
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
                boolean r0 = r10 instanceof com.avito.android.code_check.h.a.C3464a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.code_check.h$a$a r0 = (com.avito.android.code_check.h.a.C3464a) r0
                int r1 = r0.f118839r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f118839r = r1
                goto L18
            L13:
                com.avito.android.code_check.h$a$a r0 = new com.avito.android.code_check.h$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f118838q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f118839r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r10)
                goto L5b
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L31:
                kotlin.C42729a0.b(r10)
                java.lang.Long r9 = (java.lang.Long) r9
                if (r9 == 0) goto L4f
                long r9 = r9.longValue()
                com.avito.android.code_check.g r2 = r8.f118837c
                r2.getClass()
                long r4 = android.os.SystemClock.elapsedRealtime()
                r2 = 1000(0x3e8, float:1.401E-42)
                long r6 = (long) r2
                long r4 = r4 / r6
                long r9 = r9 - r4
                java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
                goto L50
            L4f:
                r9 = 0
            L50:
                r0.f118839r = r3
                kotlinx.coroutines.flow.j r10 = r8.f118836b
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L5b
                return r1
            L5b:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public h(InterfaceC43160i interfaceC43160i, g gVar) {
        this.f118834b = interfaceC43160i;
        this.f118835c = gVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Long> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f118834b.collect(new a(interfaceC43172j, this.f118835c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
