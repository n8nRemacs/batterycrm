package com.avito.android.str_cancellation_settings.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
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
public final class g implements InterfaceC43160i<StrCancellationSettingsInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f288341b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f288342b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.str_cancellation_settings.domain.StrCancellationSettingsInteractorImpl$applyStrCancellationSettings$$inlined$map$2$2", f = "StrCancellationSettingsInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.str_cancellation_settings.domain.g$a$a, reason: collision with other inner class name */
        public static final class C8668a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f288343q;

            /* renamed from: r, reason: collision with root package name */
            public int f288344r;

            public C8668a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f288343q = obj;
                this.f288344r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f288342b = interfaceC43172j;
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
                boolean r0 = r6 instanceof com.avito.android.str_cancellation_settings.domain.g.a.C8668a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.str_cancellation_settings.domain.g$a$a r0 = (com.avito.android.str_cancellation_settings.domain.g.a.C8668a) r0
                int r1 = r0.f288344r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f288344r = r1
                goto L18
            L13:
                com.avito.android.str_cancellation_settings.domain.g$a$a r0 = new com.avito.android.str_cancellation_settings.domain.g$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f288343q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f288344r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L84
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.util.P2 r5 = (com.avito.android.util.P2) r5
                boolean r6 = r5 instanceof com.avito.android.util.P2.c
                if (r6 == 0) goto L40
                com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestStartLoading r5 = new com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestStartLoading
                r5.<init>()
                goto L79
            L40:
                boolean r6 = r5 instanceof com.avito.android.util.P2.a
                if (r6 == 0) goto L4f
                com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestLoadingError r6 = new com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestLoadingError
                com.avito.android.util.P2$a r5 = (com.avito.android.util.P2.a) r5
                com.avito.android.remote.error.ApiError r5 = r5.f318719a
                r6.<init>(r5)
            L4d:
                r5 = r6
                goto L79
            L4f:
                boolean r6 = r5 instanceof com.avito.android.util.P2.b
                if (r6 == 0) goto L8d
                com.avito.android.util.P2$b r5 = (com.avito.android.util.P2.b) r5
                T r5 = r5.f318720a
                Py0.a r5 = (Py0.InterfaceC14857a) r5
                boolean r6 = r5 instanceof Py0.InterfaceC14857a.b
                if (r6 == 0) goto L69
                com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestSuccess r6 = new com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ApplyRequestSuccess
                Py0.a$b r5 = (Py0.InterfaceC14857a.b) r5
                java.lang.String r5 = r5.getNewParameterTitle()
                r6.<init>(r5)
                goto L4d
            L69:
                boolean r6 = r5 instanceof Py0.InterfaceC14857a.C0875a
                if (r6 == 0) goto L87
                com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ShowDiscountInputError r6 = new com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction$ShowDiscountInputError
                Py0.a$a r5 = (Py0.InterfaceC14857a.C0875a) r5
                java.lang.String r5 = r5.getMessage()
                r6.<init>(r5)
                goto L4d
            L79:
                r0.f288344r = r3
                kotlinx.coroutines.flow.j r6 = r4.f288342b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L84
                return r1
            L84:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            L87:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L8d:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_cancellation_settings.domain.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public g(InterfaceC43160i interfaceC43160i) {
        this.f288341b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super StrCancellationSettingsInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f288341b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
