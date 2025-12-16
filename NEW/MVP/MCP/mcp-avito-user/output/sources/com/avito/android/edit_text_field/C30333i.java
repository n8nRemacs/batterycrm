package com.avito.android.edit_text_field;

import Ay.InterfaceC13103a;
import Ay.InterfaceC13104b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditTextFieldInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LAy/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldInteractorImpl$editBasicSettingsTextField$2", f = "EditTextFieldInteractor.kt", i = {}, l = {153, 155}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.edit_text_field.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30333i extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC13104b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146983q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f146984r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f146985s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f146986t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30333i(String str, Continuation<? super C30333i> continuation) {
        super(3, continuation);
        this.f146986t = str;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC13104b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        C30333i c30333i = new C30333i(this.f146986t, continuation);
        c30333i.f146984r = interfaceC43172j;
        c30333i.f146985s = th2;
        return c30333i.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f146983q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f146984r;
            Throwable th2 = this.f146985s;
            if (!(th2 instanceof CancellationException)) {
                ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
                ApiError apiError = apiException != null ? apiException.f318522b : null;
                if (apiError instanceof ApiError.IncorrectData) {
                    InterfaceC13104b.f fVar = new InterfaceC13104b.f(((ApiError.IncorrectData) apiError).getF244063c());
                    this.f146984r = null;
                    this.f146983q = 1;
                    if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC13104b.e eVar = new InterfaceC13104b.e(th2, new InterfaceC13103a.g(this.f146986t));
                    this.f146984r = null;
                    this.f146983q = 2;
                    if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
