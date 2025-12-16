package com.avito.android.passport.profile_add.merge.profile_to_convert;

import Y41.p;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment;
import e60.InterfaceC39957b;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileToConvertFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment$observeViewModel$2", f = "ProfileToConvertFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213124q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileToConvertFragment f213125r;

    /* compiled from: ProfileToConvertFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment$observeViewModel$2$1", f = "ProfileToConvertFragment.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213126q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ProfileToConvertFragment f213127r;

        /* compiled from: ProfileToConvertFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.profile_to_convert.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6383a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileToConvertFragment f213128b;

            public C6383a(ProfileToConvertFragment profileToConvertFragment) {
                this.f213128b = profileToConvertFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC39957b interfaceC39957b = (InterfaceC39957b) obj;
                ProfileToConvertFragment.a aVar = ProfileToConvertFragment.f213078w0;
                ProfileToConvertFragment profileToConvertFragment = this.f213128b;
                if (interfaceC39957b instanceof InterfaceC39957b.a) {
                    InterfaceC39957b.a aVar2 = (InterfaceC39957b.a) interfaceC39957b;
                    com.avito.android.passport.profile_add.merge.b.c(profileToConvertFragment.requireActivity(), aVar2.f394960a, aVar2.f394961b);
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
                return new C42801a(2, this.f213128b, ProfileToConvertFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileToConvertFragment profileToConvertFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f213127r = profileToConvertFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f213127r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213126q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ProfileToConvertFragment.a aVar = ProfileToConvertFragment.f213078w0;
                ProfileToConvertFragment profileToConvertFragment = this.f213127r;
                InterfaceC43160i<InterfaceC39957b> events = profileToConvertFragment.q5().getEvents();
                C6383a c6383a = new C6383a(profileToConvertFragment);
                this.f213126q = 1;
                if (events.collect(c6383a, this) == coroutine_suspended) {
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
    public d(ProfileToConvertFragment profileToConvertFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f213125r = profileToConvertFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f213125r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213124q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ProfileToConvertFragment profileToConvertFragment = this.f213125r;
            a aVar = new a(profileToConvertFragment, null);
            this.f213124q = 1;
            if (C23056p0.b(profileToConvertFragment, state, aVar, this) == coroutine_suspended) {
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
