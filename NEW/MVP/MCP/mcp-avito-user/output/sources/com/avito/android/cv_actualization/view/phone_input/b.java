package com.avito.android.cv_actualization.view.phone_input;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import com.avito.android.lib.design.input.Input;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tt.AbstractC48713a;
import ut.C49108a;

/* compiled from: JsxCvActualizationPhoneInputFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment$setupListeners$3", f = "JsxCvActualizationPhoneInputFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ JsxCvActualizationPhoneInputFragment f131251q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f131251q = jsxCvActualizationPhoneInputFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f131251q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((b) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        JsxCvActualizationPhoneInputFragment.a aVar = JsxCvActualizationPhoneInputFragment.f131228z0;
        JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment = this.f131251q;
        C49108a c49108aQ5 = jsxCvActualizationPhoneInputFragment.q5();
        Input input = jsxCvActualizationPhoneInputFragment.f131234s0;
        if (input == null) {
            input = null;
        }
        c49108aQ5.accept(new AbstractC48713a.C12689a(String.valueOf(input.m53getText())));
        return G0.f406611a;
    }
}
