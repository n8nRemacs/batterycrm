package com.avito.android.str_cancellation_settings.domain;

import Qy0.C14950a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.P2;
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
/* loaded from: classes4.dex */
public final class j implements InterfaceC43160i<P2<? super C14950a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f288358b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f288359b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_cancellation_settings.domain.StrCancellationSettingsInteractorImpl$loadStrCancellationSettings$$inlined$map$1$2", f = "StrCancellationSettingsInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_cancellation_settings.domain.j$a$a, reason: collision with other inner class name */
        public static final class C8669a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f288360q;

            /* renamed from: r, reason: collision with root package name */
            public int f288361r;

            public C8669a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f288360q = obj;
                this.f288361r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f288359b = interfaceC43172j;
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
                boolean r0 = r6 instanceof com.avito.android.str_cancellation_settings.domain.j.a.C8669a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.str_cancellation_settings.domain.j$a$a r0 = (com.avito.android.str_cancellation_settings.domain.j.a.C8669a) r0
                int r1 = r0.f288361r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f288361r = r1
                goto L18
            L13:
                com.avito.android.str_cancellation_settings.domain.j$a$a r0 = new com.avito.android.str_cancellation_settings.domain.j$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f288360q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f288361r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L60
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto L46
                com.avito.android.util.P2$b r6 = new com.avito.android.util.P2$b
                com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                java.lang.Object r5 = r5.getResult()
                r6.<init>(r5)
                goto L55
            L46:
                boolean r6 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r6 == 0) goto L63
                com.avito.android.util.P2$a r6 = new com.avito.android.util.P2$a
                com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
                com.avito.android.remote.error.ApiError r5 = r5.getError()
                r6.<init>(r5)
            L55:
                r0.f288361r = r3
                kotlinx.coroutines.flow.j r5 = r4.f288359b
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L60
                return r1
            L60:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L63:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.domain.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public j(InterfaceC43160i interfaceC43160i) {
        this.f288358b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super P2<? super C14950a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f288358b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
