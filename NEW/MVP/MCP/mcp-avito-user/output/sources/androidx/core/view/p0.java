package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC43032o;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, 412}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: classes.dex */
final class p0 extends RestrictedSuspendLambda implements Y41.p<AbstractC43032o<? super View>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f45084q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f45085r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f45086s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(View view, Continuation<? super p0> continuation) {
        super(2, continuation);
        this.f45086s = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        p0 p0Var = new p0(this.f45086s, continuation);
        p0Var.f45085r = obj;
        return p0Var;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC43032o<? super View> abstractC43032o, Continuation<? super kotlin.G0> continuation) {
        return ((p0) create(abstractC43032o, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC43032o abstractC43032o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f45084q;
        View view = this.f45086s;
        if (i12 == 0) {
            C42729a0.b(obj);
            abstractC43032o = (AbstractC43032o) this.f45085r;
            this.f45085r = abstractC43032o;
            this.f45084q = 1;
            if (abstractC43032o.a(view, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            abstractC43032o = (AbstractC43032o) this.f45085r;
            C42729a0.b(obj);
        }
        if (view instanceof ViewGroup) {
            C22835n0 c22835n0 = new C22835n0((ViewGroup) view);
            this.f45085r = null;
            this.f45084q = 2;
            abstractC43032o.getClass();
            Object objB = abstractC43032o.b(c22835n0.iterator(), this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = kotlin.G0.f406611a;
            }
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.G0.f406611a;
    }
}
