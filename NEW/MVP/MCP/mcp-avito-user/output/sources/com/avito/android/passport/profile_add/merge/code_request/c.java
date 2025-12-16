package com.avito.android.passport.profile_add.merge.code_request;

import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import c60.b;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmArgs;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qK0.C47313c;

/* compiled from: CodeRequestFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$observeViewModel$2", f = "CodeRequestFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212848q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeRequestFragment f212849r;

    /* compiled from: CodeRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$observeViewModel$2$1", f = "CodeRequestFragment.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212850q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CodeRequestFragment f212851r;

        /* compiled from: CodeRequestFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.code_request.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6369a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CodeRequestFragment f212852b;

            public C6369a(CodeRequestFragment codeRequestFragment) {
                this.f212852b = codeRequestFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                c60.b bVar = (c60.b) obj;
                CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
                CodeRequestFragment codeRequestFragment = this.f212852b;
                if (bVar instanceof b.C2031b) {
                    ActivityC22955m activityC22955mRequireActivity = codeRequestFragment.requireActivity();
                    b.C2031b c2031b = (b.C2031b) bVar;
                    String str = c2031b.f57655a;
                    H hE2 = activityC22955mRequireActivity.getSupportFragmentManager().e();
                    hE2.c(CodeConfirmFragment.class.getName());
                    CodeConfirmFragment.a aVar2 = CodeConfirmFragment.f212682G0;
                    CodeConfirmArgs codeConfirmArgs = new CodeConfirmArgs(str, c2031b.f57656b);
                    aVar2.getClass();
                    hE2.n(R.id.fragment_container, CodeConfirmFragment.a.a(codeConfirmArgs), null);
                    hE2.e();
                } else if (bVar instanceof b.a) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    C47313c c47313c = codeRequestFragment.f212829s0;
                    kotlin.reflect.n<Object> nVar = CodeRequestFragment.f212822C0[0];
                    ViewGroup viewGroup = (ViewGroup) c47313c.a();
                    b.a aVar3 = (b.a) bVar;
                    String str2 = aVar3.f57652a;
                    PrintableText printableTextF = str2 != null ? com.avito.android.printable_text.b.f(str2) : com.avito.android.printable_text.b.c(R.string.passport_common_error, new Serializable[0]);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, viewGroup, printableTextF, null, null, null, f.c.a.a(aVar3.f57653b, aVar3.f57654c), 0, toastBarPosition, null, false, false, null, null, 4014);
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f212852b, CodeRequestFragment.class, "renderEvents", "renderEvents(Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CodeRequestFragment codeRequestFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212851r = codeRequestFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f212851r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212850q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
                CodeRequestFragment codeRequestFragment = this.f212851r;
                n nVarR5 = codeRequestFragment.r5();
                C6369a c6369a = new C6369a(codeRequestFragment);
                this.f212850q = 1;
                if (nVarR5.ke(c6369a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CodeRequestFragment codeRequestFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f212849r = codeRequestFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f212849r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212848q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            CodeRequestFragment codeRequestFragment = this.f212849r;
            a aVar = new a(codeRequestFragment, null);
            this.f212848q = 1;
            if (C23056p0.b(codeRequestFragment, state, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
