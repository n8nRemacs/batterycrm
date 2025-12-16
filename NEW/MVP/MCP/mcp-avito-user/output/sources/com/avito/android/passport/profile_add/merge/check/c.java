package com.avito.android.passport.profile_add.merge.check;

import Y41.l;
import Y41.p;
import Y61.k;
import android.widget.TextView;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: CheckMergePossibilityFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment$observeViewModel$2", f = "CheckMergePossibilityFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212620q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CheckMergePossibilityFragment f212621r;

    /* compiled from: CheckMergePossibilityFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment$observeViewModel$2$1", f = "CheckMergePossibilityFragment.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212622q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CheckMergePossibilityFragment f212623r;

        /* compiled from: CheckMergePossibilityFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.check.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6356a extends H implements l<a60.c, G0> {
            @Override // Y41.l
            public final G0 invoke(a60.c cVar) {
                a60.c cVar2 = cVar;
                CheckMergePossibilityFragment checkMergePossibilityFragment = (CheckMergePossibilityFragment) this.receiver;
                C47313c c47313c = checkMergePossibilityFragment.f212605t0;
                n<Object>[] nVarArr = CheckMergePossibilityFragment.f212598y0;
                n<Object> nVar = nVarArr[1];
                TextView textView = (TextView) c47313c.a();
                boolean z12 = cVar2.f20745c;
                textView.setVisibility(z12 ? 0 : 8);
                C47313c c47313c2 = checkMergePossibilityFragment.f212606u0;
                n<Object> nVar2 = nVarArr[2];
                ((TextView) c47313c2.a()).setVisibility(z12 ? 0 : 8);
                C47313c c47313c3 = checkMergePossibilityFragment.f212608w0;
                n<Object> nVar3 = nVarArr[4];
                ((Button) c47313c3.a()).setVisibility(z12 ? 0 : 8);
                C47313c c47313c4 = checkMergePossibilityFragment.f212607v0;
                n<Object> nVar4 = nVarArr[3];
                ((Spinner) c47313c4.a()).setVisibility(cVar2.f20744b ? 0 : 8);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CheckMergePossibilityFragment checkMergePossibilityFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212623r = checkMergePossibilityFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f212623r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212622q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CheckMergePossibilityFragment.a aVar = CheckMergePossibilityFragment.f212597x0;
                CheckMergePossibilityFragment checkMergePossibilityFragment = this.f212623r;
                n2<a60.c> state = ((f) checkMergePossibilityFragment.f212600o0.getValue()).getState();
                ScreenPerformanceTracker screenPerformanceTracker = checkMergePossibilityFragment.f212603r0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                C6356a c6356a = new C6356a(1, checkMergePossibilityFragment, CheckMergePossibilityFragment.class, "renderState", "renderState(Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityState;)V", 0);
                this.f212622q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6356a, this) == coroutine_suspended) {
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
    public c(CheckMergePossibilityFragment checkMergePossibilityFragment, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f212621r = checkMergePossibilityFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new c(this.f212621r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212620q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46681d;
            CheckMergePossibilityFragment checkMergePossibilityFragment = this.f212621r;
            a aVar = new a(checkMergePossibilityFragment, null);
            this.f212620q = 1;
            if (C23056p0.b(checkMergePossibilityFragment, state, aVar, this) == coroutine_suspended) {
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
