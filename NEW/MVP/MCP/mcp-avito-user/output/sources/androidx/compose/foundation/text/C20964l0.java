package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", f = "ContextMenu.android.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20964l0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22204y1 f31561q;

    /* renamed from: r, reason: collision with root package name */
    public int f31562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<F1> f31563s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31564t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20964l0(InterfaceC22204y1<F1> interfaceC22204y1, TextFieldSelectionState textFieldSelectionState, Continuation<? super C20964l0> continuation) {
        super(2, continuation);
        this.f31563s = interfaceC22204y1;
        this.f31564t = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20964l0(this.f31563s, this.f31564t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20964l0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC22204y1 interfaceC22204y1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31562r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22204y1<F1> interfaceC22204y12 = this.f31563s;
            this.f31561q = interfaceC22204y12;
            this.f31562r = 1;
            Object objB = C21064w0.b(this.f31564t, this);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC22204y1 = interfaceC22204y12;
            obj = objB;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC22204y1 = this.f31561q;
            C42729a0.b(obj);
        }
        interfaceC22204y1.setValue(obj);
        return kotlin.G0.f406611a;
    }
}
