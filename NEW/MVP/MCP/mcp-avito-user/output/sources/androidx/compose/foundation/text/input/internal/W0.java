package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {385, 386, 387}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class W0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ KeyCommand f31010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ R0 f31011s;

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[16] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KeyCommand keyCommand = KeyCommand.f30426c;
                iArr[18] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KeyCommand keyCommand2 = KeyCommand.f30426c;
                iArr[17] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(KeyCommand keyCommand, R0 r02, Continuation<? super W0> continuation) {
        super(2, continuation);
        this.f31010r = keyCommand;
        this.f31011s = r02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new W0(this.f31010r, this.f31011s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((W0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31009q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int iOrdinal = this.f31010r.ordinal();
            R0 r02 = this.f31011s;
            switch (iOrdinal) {
                case 16:
                    TextFieldSelectionState textFieldSelectionState = r02.f30917t;
                    this.f31009q = 1;
                    if (textFieldSelectionState.d(false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 17:
                    TextFieldSelectionState textFieldSelectionState2 = r02.f30917t;
                    this.f31009q = 3;
                    if (textFieldSelectionState2.q(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 18:
                    TextFieldSelectionState textFieldSelectionState3 = r02.f30917t;
                    this.f31009q = 2;
                    if (textFieldSelectionState3.f(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
