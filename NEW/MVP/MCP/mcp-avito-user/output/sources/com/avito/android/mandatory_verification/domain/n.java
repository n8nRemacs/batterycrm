package com.avito.android.mandatory_verification.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
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
/* loaded from: classes14.dex */
public final class n implements InterfaceC43160i<MandatoryVerificationInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f184595b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f184596b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.mandatory_verification.domain.UploadFileUseCase$uploadFileFlow$$inlined$mapNotNull$1$2", f = "UploadFileUseCase.kt", i = {}, l = {241}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.mandatory_verification.domain.n$a$a, reason: collision with other inner class name */
        public static final class C5419a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f184597q;

            /* renamed from: r, reason: collision with root package name */
            public int f184598r;

            public C5419a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f184597q = obj;
                this.f184598r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f184596b = interfaceC43172j;
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
                boolean r0 = r10 instanceof com.avito.android.mandatory_verification.domain.n.a.C5419a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.mandatory_verification.domain.n$a$a r0 = (com.avito.android.mandatory_verification.domain.n.a.C5419a) r0
                int r1 = r0.f184598r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f184598r = r1
                goto L18
            L13:
                com.avito.android.mandatory_verification.domain.n$a$a r0 = new com.avito.android.mandatory_verification.domain.n$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f184597q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f184598r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r10)
                goto L77
            L29:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L31:
                kotlin.C42729a0.b(r10)
                com.avito.android.mandatory_verification.domain.file_uploader.l r9 = (com.avito.android.mandatory_verification.domain.file_uploader.l) r9
                boolean r10 = r9 instanceof com.avito.android.mandatory_verification.domain.file_uploader.l.e
                if (r10 == 0) goto L4d
                com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildFileUploadSuccess r10 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildFileUploadSuccess
                com.avito.android.mandatory_verification.domain.file_uploader.a r2 = new com.avito.android.mandatory_verification.domain.file_uploader.a
                com.avito.android.mandatory_verification.domain.file_uploader.l$e r9 = (com.avito.android.mandatory_verification.domain.file_uploader.l.e) r9
                java.lang.String r4 = r9.f184571a
                java.lang.String r5 = r9.f184572b
                long r6 = r9.f184573c
                r2.<init>(r4, r5, r6)
                r10.<init>(r2)
                goto L6a
            L4d:
                boolean r10 = r9 instanceof com.avito.android.mandatory_verification.domain.file_uploader.l.b
                if (r10 == 0) goto L5b
                com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildFileUploadError r10 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$BuildFileUploadError
                com.avito.android.mandatory_verification.domain.file_uploader.l$b r9 = (com.avito.android.mandatory_verification.domain.file_uploader.l.b) r9
                com.avito.android.printable_text.PrintableText r9 = r9.f184568a
                r10.<init>(r9)
                goto L6a
            L5b:
                boolean r10 = r9 instanceof com.avito.android.mandatory_verification.domain.file_uploader.l.c
                if (r10 == 0) goto L69
                com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast r10 = new com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction$ShowToast
                com.avito.android.mandatory_verification.domain.file_uploader.l$c r9 = (com.avito.android.mandatory_verification.domain.file_uploader.l.c) r9
                com.avito.android.printable_text.PrintableText r9 = r9.f184569a
                r10.<init>(r9)
                goto L6a
            L69:
                r10 = 0
            L6a:
                if (r10 == 0) goto L77
                r0.f184598r = r3
                kotlinx.coroutines.flow.j r9 = r8.f184596b
                java.lang.Object r9 = r9.emit(r10, r0)
                if (r9 != r1) goto L77
                return r1
            L77:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.domain.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public n(InterfaceC43160i interfaceC43160i) {
        this.f184595b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super MandatoryVerificationInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f184595b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
