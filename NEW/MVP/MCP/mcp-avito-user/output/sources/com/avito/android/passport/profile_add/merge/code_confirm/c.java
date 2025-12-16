package com.avito.android.passport.profile_add.merge.code_confirm;

import android.widget.TextView;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.a;
import com.avito.android.passport.profile_add.merge.code_confirm.view_state.e;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$observeViewModel$1", f = "CodeConfirmFragment.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212715q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f212716r;

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$observeViewModel$1$1", f = "CodeConfirmFragment.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212717q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CodeConfirmFragment f212718r;

        /* compiled from: CodeConfirmFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.code_confirm.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6362a extends H implements Y41.l<com.avito.android.passport.profile_add.merge.code_confirm.view_state.b, G0> {
            @Override // Y41.l
            public final G0 invoke(com.avito.android.passport.profile_add.merge.code_confirm.view_state.b bVar) {
                com.avito.android.passport.profile_add.merge.code_confirm.view_state.b bVar2 = bVar;
                CodeConfirmFragment codeConfirmFragment = (CodeConfirmFragment) this.receiver;
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                codeConfirmFragment.getClass();
                String str = codeConfirmFragment.f212689F0;
                String str2 = bVar2.f212812b;
                if (!L.f(str2, str)) {
                    codeConfirmFragment.f212689F0 = str2;
                    C47313c c47313c = codeConfirmFragment.f212686C0;
                    kotlin.reflect.n<Object> nVar = CodeConfirmFragment.f212683H0[6];
                    com.avito.android.util.text.j.c((TextView) c47313c.a(), new AttributedText(codeConfirmFragment.getString(R.string.passport_accounts_merge_check_ownership_code_confirm_subtitle), Collections.singletonList(new FontAttribute("phone_number", bVar2.f212812b.replace(' ', (char) 160), com.avito.android.advert.item.delivery_suggests.l.u(null, "h5"))), 1), null);
                }
                Input inputR5 = codeConfirmFragment.r5();
                boolean z12 = bVar2.f212816f;
                inputR5.setEnabled(z12);
                codeConfirmFragment.s5().setClickable(z12);
                codeConfirmFragment.t5().setClickable(z12);
                Button buttonS5 = codeConfirmFragment.s5();
                com.avito.android.passport.profile_add.merge.code_confirm.view_state.a aVar2 = bVar2.f212815e;
                buttonS5.setEnabled(!(aVar2 instanceof a.c));
                codeConfirmFragment.s5().setLoading(aVar2 instanceof a.b);
                C47313c c47313c2 = codeConfirmFragment.f212702z0;
                PrintableText printableText = bVar2.f212813c;
                if (printableText != null) {
                    kotlin.reflect.n<Object> nVar2 = CodeConfirmFragment.f212683H0[3];
                    ComponentContainer.n((ComponentContainer) c47313c2.a(), printableText.k0(codeConfirmFragment.requireContext()), 2);
                } else {
                    kotlin.reflect.n<Object> nVar3 = CodeConfirmFragment.f212683H0[3];
                    ComponentContainer componentContainer = (ComponentContainer) c47313c2.a();
                    componentContainer.q(componentContainer.f178848i);
                }
                com.avito.android.passport.profile_add.merge.code_confirm.view_state.e eVar = bVar2.f212814d;
                boolean z13 = eVar instanceof e.a;
                C47313c c47313c3 = codeConfirmFragment.f212688E0;
                if (z13) {
                    long j12 = ((e.a) eVar).f212818a;
                    com.avito.android.server_time.a aVar3 = codeConfirmFragment.f212692p0;
                    long jA2 = j12 - com.avito.android.server_time.i.a(aVar3 != null ? aVar3 : null);
                    if (jA2 > 0) {
                        kotlin.reflect.n<Object> nVar4 = CodeConfirmFragment.f212683H0[8];
                        com.avito.android.lib.design.ticking_button.b bVar3 = (com.avito.android.lib.design.ticking_button.b) c47313c3.a();
                        y yVar = bVar3.f180944d;
                        if (yVar != null) {
                            DisposableHelper.a(yVar);
                        }
                        bVar3.f180946f = jA2;
                        bVar3.f180945e = jA2;
                        bVar3.a();
                    } else {
                        kotlin.reflect.n<Object> nVar5 = CodeConfirmFragment.f212683H0[8];
                        com.avito.android.lib.design.ticking_button.b bVar4 = (com.avito.android.lib.design.ticking_button.b) c47313c3.a();
                        y yVar2 = bVar4.f180944d;
                        if (yVar2 != null) {
                            DisposableHelper.a(yVar2);
                        }
                        bVar4.f180945e = bVar4.f180946f;
                        Button button = bVar4.f180941a;
                        button.setEnabled(true);
                        button.setText(bVar4.f180942b);
                    }
                    codeConfirmFragment.t5().setLoading(false);
                } else {
                    boolean z14 = eVar instanceof e.b;
                    if (z14) {
                        kotlin.reflect.n<Object> nVar6 = CodeConfirmFragment.f212683H0[8];
                        com.avito.android.lib.design.ticking_button.b bVar5 = (com.avito.android.lib.design.ticking_button.b) c47313c3.a();
                        y yVar3 = bVar5.f180944d;
                        if (yVar3 != null) {
                            DisposableHelper.a(yVar3);
                        }
                        bVar5.f180945e = bVar5.f180946f;
                        Button button2 = bVar5.f180941a;
                        button2.setEnabled(true);
                        button2.setText(bVar5.f180942b);
                    }
                    codeConfirmFragment.t5().setLoading(z14);
                    codeConfirmFragment.t5().setEnabled(false);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CodeConfirmFragment codeConfirmFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212718r = codeConfirmFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f212718r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212717q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                CodeConfirmFragment codeConfirmFragment = this.f212718r;
                n2<com.avito.android.passport.profile_add.merge.code_confirm.view_state.b> n2Var = codeConfirmFragment.u5().f212734L;
                ScreenPerformanceTracker screenPerformanceTracker = codeConfirmFragment.f212693q0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6362a c6362a = new C6362a(1, codeConfirmFragment, CodeConfirmFragment.class, "renderState", "renderState(Lcom/avito/android/passport/profile_add/merge/code_confirm/view_state/CodeConfirmViewState;)V", 0);
                this.f212717q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(n2Var, screenPerformanceTracker, c6362a, this) == coroutine_suspended) {
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
    public c(CodeConfirmFragment codeConfirmFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f212716r = codeConfirmFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f212716r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212715q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            CodeConfirmFragment codeConfirmFragment = this.f212716r;
            a aVar = new a(codeConfirmFragment, null);
            this.f212715q = 1;
            if (C23056p0.b(codeConfirmFragment, state, aVar, this) == coroutine_suspended) {
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
