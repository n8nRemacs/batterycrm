package Fc1;

import Fc1.F7;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.base.compose.components.FeedbackImageKt$FeedbackImage$1$1", f = "FeedbackImage.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class O7 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22204y1 f5133q;

    /* renamed from: r, reason: collision with root package name */
    public int f5134r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f5135s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<InterfaceC22280q0> f5136t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f5137u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(InterfaceC22204y1<Boolean> interfaceC22204y1, InterfaceC22204y1<InterfaceC22280q0> interfaceC22204y12, String str, Continuation<? super O7> continuation) {
        super(2, continuation);
        this.f5135s = interfaceC22204y1;
        this.f5136t = interfaceC22204y12;
        this.f5137u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new O7(this.f5135s, this.f5136t, this.f5137u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((O7) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC22204y1 interfaceC22204y1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5134r;
        InterfaceC22204y1<Boolean> interfaceC22204y12 = this.f5135s;
        try {
        } catch (Exception unused) {
            interfaceC22204y12.setValue(Boxing.boxBoolean(true));
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            if (!interfaceC22204y12.getF42167b().booleanValue()) {
                InterfaceC22204y1<InterfaceC22280q0> interfaceC22204y13 = this.f5136t;
                D6 d62 = F7.a.f4960a;
                if (d62 == null) {
                    d62 = null;
                }
                N6 n62 = (N6) d62.f4887z.get();
                String str = this.f5137u;
                this.f5133q = interfaceC22204y13;
                this.f5134r = 1;
                Object objA = n62.a(str, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC22204y1 = interfaceC22204y13;
                obj = objA;
            }
            return kotlin.G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC22204y1 = this.f5133q;
        C42729a0.b(obj);
        interfaceC22204y1.setValue(obj);
        return kotlin.G0.f406611a;
    }
}
