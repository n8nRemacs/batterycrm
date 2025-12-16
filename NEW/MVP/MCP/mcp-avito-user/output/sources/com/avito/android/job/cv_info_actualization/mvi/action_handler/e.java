package com.avito.android.job.cv_info_actualization.mvi.action_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.job.cv_info_actualization.mvi.domain.i;
import com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: JsxCvInfoActualizationOnActionButtonActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/action_handler/e;", "", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f174098a;

    /* compiled from: JsxCvInfoActualizationOnActionButtonActionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.job.cv_info_actualization.mvi.action_handler.JsxCvInfoActualizationOnActionButtonActionHandler$handle$1", f = "JsxCvInfoActualizationOnActionButtonActionHandler.kt", i = {0, 0, 1}, l = {21, 22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow", "actualizationInfo", "$this$flow"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super JsxCvInfoActualizationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public com.avito.android.job.cv_info_actualization.mvi.domain.a f174099q;

        /* renamed from: r, reason: collision with root package name */
        public int f174100r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f174101s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.job.cv_info_actualization.mvi.domain.a f174102t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e f174103u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.job.cv_info_actualization.mvi.domain.a aVar, e eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f174102t = aVar;
            this.f174103u = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f174102t, this.f174103u, continuation);
            aVar.f174101s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super JsxCvInfoActualizationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_info_actualization.mvi.action_handler.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@k i iVar) {
        this.f174098a = iVar;
    }

    @k
    public final InterfaceC43160i<JsxCvInfoActualizationInternalAction> a(@l com.avito.android.job.cv_info_actualization.mvi.domain.a aVar) {
        return C43175k.G(new a(aVar, this, null));
    }
}
