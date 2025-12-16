package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", i = {}, l = {79, 80, 81}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20984q0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31774q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextContextMenuItems f31775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31776s;

    /* compiled from: ContextMenu.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.q0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TextContextMenuItems.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.f30549c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f30549c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.f30549c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.f30549c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20984q0(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, Continuation<? super C20984q0> continuation) {
        super(2, continuation);
        this.f31775r = textContextMenuItems;
        this.f31776s = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20984q0(this.f31775r, this.f31776s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20984q0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r62;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31774q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int iOrdinal = this.f31775r.ordinal();
            TextFieldSelectionState textFieldSelectionState = this.f31776s;
            if (iOrdinal == 0) {
                this.f31774q = 1;
                if (textFieldSelectionState.f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 1) {
                this.f31774q = 2;
                if (textFieldSelectionState.d(false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 2) {
                this.f31774q = 3;
                if (textFieldSelectionState.q(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 3) {
                textFieldSelectionState.s();
            } else if (iOrdinal == 4 && (r62 = textFieldSelectionState.f31268i) != 0) {
                r62.invoke();
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
