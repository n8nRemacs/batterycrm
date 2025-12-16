package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20872h0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22204y1 f30718q;

    /* renamed from: r, reason: collision with root package name */
    public int f30719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<F1> f30720s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30721t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20872h0(InterfaceC22204y1<F1> interfaceC22204y1, C21011f1 c21011f1, Continuation<? super C20872h0> continuation) {
        super(2, continuation);
        this.f30720s = interfaceC22204y1;
        this.f30721t = c21011f1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20872h0(this.f30720s, this.f30721t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20872h0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC22204y1 interfaceC22204y1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f30719r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22204y1<F1> interfaceC22204y12 = this.f30720s;
            this.f30718q = interfaceC22204y12;
            this.f30719r = 1;
            Object objC = C21064w0.c(this.f30721t, this);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC22204y1 = interfaceC22204y12;
            obj = objC;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC22204y1 = this.f30718q;
            C42729a0.b(obj);
        }
        interfaceC22204y1.setValue(obj);
        return kotlin.G0.f406611a;
    }
}
