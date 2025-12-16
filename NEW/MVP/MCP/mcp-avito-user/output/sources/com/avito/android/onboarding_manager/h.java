package com.avito.android.onboarding_manager;

import Y41.p;
import android.content.Context;
import android.content.SharedPreferences;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: OnboardingShowsStorageImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding_manager/h;", "Lcom/avito/android/onboarding_manager/f;", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43238h f209429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209430b;

    /* compiled from: OnboardingShowsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)I"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding_manager.OnboardingShowsStorageImpl$getShownTimes$1", f = "OnboardingShowsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Integer>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f209432r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f209432r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new a(this.f209432r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Integer> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxInt(h.this.g().getInt(this.f209432r, 0));
        }
    }

    /* compiled from: OnboardingShowsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SharedPreferences> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f209433l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f209433l = context;
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            return this.f209433l.getSharedPreferences("onboarding_shows_storage", 0);
        }
    }

    /* compiled from: OnboardingShowsStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding_manager.OnboardingShowsStorageImpl$removeAsync$1", f = "OnboardingShowsStorageImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f209435r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f209435r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new c(this.f209435r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            SharedPreferences.Editor editorEdit = h.this.g().edit();
            editorEdit.remove(this.f209435r);
            editorEdit.apply();
            return G0.f406611a;
        }
    }

    /* compiled from: OnboardingShowsStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding_manager.OnboardingShowsStorageImpl$saveShown$1", f = "OnboardingShowsStorageImpl.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {"showCounter"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.f f209436q;

        /* renamed from: r, reason: collision with root package name */
        public l0.f f209437r;

        /* renamed from: s, reason: collision with root package name */
        public int f209438s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f209440u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f209440u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new d(this.f209440u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            l0.f fVar;
            l0.f fVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209438s;
            String str = this.f209440u;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                l0.f fVar3 = new l0.f();
                InterfaceC43076a0<Integer> interfaceC43076a0C = hVar.c(str);
                this.f209436q = fVar3;
                this.f209437r = fVar3;
                this.f209438s = 1;
                Object objF = interfaceC43076a0C.F(this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar = fVar3;
                obj = objF;
                fVar2 = fVar;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = this.f209437r;
                fVar2 = this.f209436q;
                C42729a0.b(obj);
            }
            fVar.f406840b = ((Number) obj).intValue();
            SharedPreferences.Editor editorEdit = hVar.g().edit();
            int i13 = fVar2.f406840b + 1;
            fVar2.f406840b = i13;
            editorEdit.putInt(str, i13);
            editorEdit.apply();
            return G0.f406611a;
        }
    }

    /* compiled from: OnboardingShowsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding_manager.OnboardingShowsStorageImpl$wasShown$1", f = "OnboardingShowsStorageImpl.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209441q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f209443s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f209443s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new e(this.f209443s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209441q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43076a0<Integer> interfaceC43076a0C = h.this.c(this.f209443s);
                this.f209441q = 1;
                obj = interfaceC43076a0C.F(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return Boxing.boxBoolean(((Number) obj).intValue() > 0);
        }
    }

    @Inject
    public h(@Y61.k Context context, @Y61.k R0 r02) {
        this.f209429a = U.a(r02.a());
        this.f209430b = C42727D.c(new b(context));
    }

    @Override // com.avito.android.onboarding_manager.f
    @InterfaceC42830m
    public final int a(@Y61.k String str) {
        return g().getInt(str, 0);
    }

    @Override // com.avito.android.onboarding_manager.f
    @InterfaceC42830m
    public final boolean b(@Y61.k String str) {
        return a(str) > 0;
    }

    @Override // com.avito.android.onboarding_manager.f
    @Y61.k
    public final InterfaceC43076a0<Integer> c(@Y61.k String str) {
        return C43259k.b(this.f209429a, null, new a(str, null), 3);
    }

    @Override // com.avito.android.onboarding_manager.f
    @Y61.k
    public final InterfaceC43076a0<Boolean> d(@Y61.k String str) {
        return C43259k.b(this.f209429a, null, new e(str, null), 3);
    }

    @Override // com.avito.android.onboarding_manager.f
    public final void e(@Y61.k String str) {
        C43259k.d(this.f209429a, null, null, new d(str, null), 3);
    }

    @Override // com.avito.android.onboarding_manager.f
    @Y61.k
    public final InterfaceC43076a0<G0> f(@Y61.k String str) {
        return C43259k.b(this.f209429a, null, new c(str, null), 3);
    }

    public final SharedPreferences g() {
        return (SharedPreferences) this.f209430b.getValue();
    }
}
