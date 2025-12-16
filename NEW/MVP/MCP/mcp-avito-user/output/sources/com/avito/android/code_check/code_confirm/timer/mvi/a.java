package com.avito.android.code_check.code_confirm.timer.mvi;

import Ko.InterfaceC14335a;
import Y41.q;
import Y61.k;
import Y61.l;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TimerBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/timer/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "LKo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.b<InterfaceC14335a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_check.d f118784a;

    /* compiled from: TimerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKo/a;", "", "timeoutLeft", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;J)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.code_confirm.timer.mvi.TimerBootstrap$produce$1", f = "TimerBootstrap.kt", i = {1, 1, 2, 2}, l = {21, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 31}, m = "invokeSuspend", n = {"$this$transformLatest", "timeoutEnd", "$this$transformLatest", "timeoutEnd"}, s = {"L$0", "J$0", "L$0", "J$0"})
    /* renamed from: com.avito.android.code_check.code_confirm.timer.mvi.a$a, reason: collision with other inner class name */
    public static final class C3462a extends SuspendLambda implements q<InterfaceC43172j<? super InterfaceC14335a>, Long, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public long f118785q;

        /* renamed from: r, reason: collision with root package name */
        public int f118786r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f118787s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Long f118788t;

        public C3462a(Continuation<? super C3462a> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC14335a> interfaceC43172j, Long l12, Continuation<? super G0> continuation) {
            C3462a c3462a = a.this.new C3462a(continuation);
            c3462a.f118787s = interfaceC43172j;
            c3462a.f118788t = l12;
            return c3462a.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008b -> B:28:0x008e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f118786r
                r3 = 1000(0x3e8, float:1.401E-42)
                r4 = 0
                r5 = 0
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                com.avito.android.code_check.code_confirm.timer.mvi.a r11 = com.avito.android.code_check.code_confirm.timer.mvi.a.this
                if (r2 == 0) goto L40
                if (r2 == r10) goto L3b
                if (r2 == r9) goto L33
                if (r2 == r8) goto L2a
                if (r2 != r7) goto L22
                kotlin.C42729a0.b(r18)
                goto Laa
            L22:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2a:
                long r12 = r0.f118785q
                kotlinx.coroutines.flow.j r2 = r0.f118787s
                kotlin.C42729a0.b(r18)
                r7 = r8
                goto L8e
            L33:
                long r12 = r0.f118785q
                kotlinx.coroutines.flow.j r2 = r0.f118787s
                kotlin.C42729a0.b(r18)
                goto L7e
            L3b:
                kotlin.C42729a0.b(r18)
                goto Lba
            L40:
                kotlin.C42729a0.b(r18)
                kotlinx.coroutines.flow.j r2 = r0.f118787s
                java.lang.Long r12 = r0.f118788t
                if (r12 == 0) goto Lad
                long r13 = r12.longValue()
                int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r13 >= 0) goto L52
                goto Lad
            L52:
                r11.getClass()
                long r13 = android.os.SystemClock.elapsedRealtime()
                long r7 = (long) r3
                long r13 = r13 / r7
                long r15 = r12.longValue()
                long r15 = r15 + r13
                long r12 = android.os.SystemClock.elapsedRealtime()
                long r12 = r12 / r7
                long r7 = r15 - r12
                r12 = r15
            L68:
                int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r10 <= 0) goto L9c
                Ko.a$b r10 = new Ko.a$b
                r10.<init>(r7)
                r0.f118787s = r2
                r0.f118785q = r12
                r0.f118786r = r9
                java.lang.Object r7 = r2.emit(r10, r0)
                if (r7 != r1) goto L7e
                return r1
            L7e:
                r0.f118787s = r2
                r0.f118785q = r12
                r7 = 3
                r0.f118786r = r7
                r5 = 100
                java.lang.Object r5 = kotlinx.coroutines.C43131e0.b(r5, r0)
                if (r5 != r1) goto L8e
                return r1
            L8e:
                r11.getClass()
                long r5 = android.os.SystemClock.elapsedRealtime()
                long r7 = (long) r3
                long r5 = r5 / r7
                long r7 = r12 - r5
                r5 = 0
                goto L68
            L9c:
                Ko.a$a r3 = Ko.InterfaceC14335a.C0596a.f9653a
                r0.f118787s = r4
                r4 = 4
                r0.f118786r = r4
                java.lang.Object r2 = r2.emit(r3, r0)
                if (r2 != r1) goto Laa
                return r1
            Laa:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            Lad:
                Ko.a$a r3 = Ko.InterfaceC14335a.C0596a.f9653a
                r0.f118787s = r4
                r0.f118786r = r10
                java.lang.Object r2 = r2.emit(r3, r0)
                if (r2 != r1) goto Lba
                return r1
            Lba:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.timer.mvi.a.C3462a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.code_check.d dVar) {
        this.f118784a = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<InterfaceC14335a> a() {
        return C43175k.Y(this.f118784a.x8(), new C3462a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
