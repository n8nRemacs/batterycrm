package com.avito.android.passport.profile_add.merge.check;

import Y41.p;
import Y61.k;
import Y61.l;
import a60.InterfaceC19687b;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment;
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
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckMergePossibilityFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment$observeViewModel$1", f = "CheckMergePossibilityFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CheckMergePossibilityFragment f212616r;

    /* compiled from: CheckMergePossibilityFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.check.CheckMergePossibilityFragment$observeViewModel$1$1", f = "CheckMergePossibilityFragment.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212617q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CheckMergePossibilityFragment f212618r;

        /* compiled from: CheckMergePossibilityFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.check.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6355a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckMergePossibilityFragment f212619b;

            public C6355a(CheckMergePossibilityFragment checkMergePossibilityFragment) {
                this.f212619b = checkMergePossibilityFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC19687b interfaceC19687b = (InterfaceC19687b) obj;
                CheckMergePossibilityFragment.a aVar = CheckMergePossibilityFragment.f212597x0;
                CheckMergePossibilityFragment checkMergePossibilityFragment = this.f212619b;
                if (interfaceC19687b instanceof InterfaceC19687b.C1483b) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = checkMergePossibilityFragment.f212601p0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, ((InterfaceC19687b.C1483b) interfaceC19687b).f20743a, null, null, 6);
                } else if (L.f(interfaceC19687b, InterfaceC19687b.a.f20742a)) {
                    ActivityC22955m activityC22955mRequireActivity = checkMergePossibilityFragment.requireActivity();
                    Intent intent = activityC22955mRequireActivity.getIntent();
                    intent.putExtra("PassportMergeAccountsActivity_mergeSuccessText", (Parcelable) null);
                    intent.putExtra("PassportMergeAccountsActivity_closedByCross", true);
                    activityC22955mRequireActivity.setResult(0, intent);
                    activityC22955mRequireActivity.finish();
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f212619b, CheckMergePossibilityFragment.class, "renderEvent", "renderEvent(Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CheckMergePossibilityFragment checkMergePossibilityFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212618r = checkMergePossibilityFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f212618r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212617q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CheckMergePossibilityFragment.a aVar = CheckMergePossibilityFragment.f212597x0;
                CheckMergePossibilityFragment checkMergePossibilityFragment = this.f212618r;
                f fVar = (f) checkMergePossibilityFragment.f212600o0.getValue();
                C6355a c6355a = new C6355a(checkMergePossibilityFragment);
                this.f212617q = 1;
                if (fVar.ke(c6355a, this) == coroutine_suspended) {
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
    public b(CheckMergePossibilityFragment checkMergePossibilityFragment, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f212616r = checkMergePossibilityFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f212616r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212615q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46681d;
            CheckMergePossibilityFragment checkMergePossibilityFragment = this.f212616r;
            a aVar = new a(checkMergePossibilityFragment, null);
            this.f212615q = 1;
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
