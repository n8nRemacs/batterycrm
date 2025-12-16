package com.avito.android.cv_actualization.view.code_input.mvi.action_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization.view.code_input.e;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JsxCvActualizationConfirmClickedActionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/action_handler/a;", "", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f131169a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f131170b;

    /* compiled from: JsxCvActualizationConfirmClickedActionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_actualization.view.code_input.mvi.action_handler.JsxCvActualizationConfirmClickedActionHandler$handle$1", f = "JsxCvActualizationConfirmClickedActionHandler.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 30, 31, 32, 40}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.cv_actualization.view.code_input.mvi.action_handler.a$a, reason: collision with other inner class name */
    public static final class C3906a extends SuspendLambda implements p<InterfaceC43172j<? super JsxCvActualizationCodeInputInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131171q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f131172r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f131174t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3906a(String str, Continuation<? super C3906a> continuation) {
            super(2, continuation);
            this.f131174t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C3906a c3906a = a.this.new C3906a(this.f131174t, continuation);
            c3906a.f131172r = obj;
            return c3906a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super JsxCvActualizationCodeInputInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3906a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_actualization.view.code_input.mvi.action_handler.a.C3906a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k @Named("PHONE_NUMBER") String str, @k e eVar) {
        this.f131169a = str;
        this.f131170b = eVar;
    }

    @k
    public final InterfaceC43160i<JsxCvActualizationCodeInputInternalAction> a(@k String str) {
        return C43175k.G(new C3906a(str, null));
    }
}
