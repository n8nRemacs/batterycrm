package com.avito.android.user_adverts.tab_actions.info;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import bJ0.C25520c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsActionResultInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfoFragment$observeViewModel$1", f = "UserAdvertsActionResultInfoFragment.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314629q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsActionResultInfoFragment f314630r;

    /* compiled from: UserAdvertsActionResultInfoFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.info.UserAdvertsActionResultInfoFragment$observeViewModel$1$1", f = "UserAdvertsActionResultInfoFragment.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_actions.info.a$a, reason: collision with other inner class name */
    public static final class C9726a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314631q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsActionResultInfoFragment f314632r;

        /* compiled from: UserAdvertsActionResultInfoFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbJ0/c;", VoiceInfo.STATE, "LbJ0/c$a;", "invoke", "(LbJ0/c;)LbJ0/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_actions.info.a$a$a, reason: collision with other inner class name */
        public static final class C9727a extends N implements l<C25520c, C25520c.a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C9727a f314633l = new C9727a();

            public C9727a() {
                super(1);
            }

            @Override // Y41.l
            public final C25520c.a invoke(C25520c c25520c) {
                return c25520c.f57036c;
            }
        }

        /* compiled from: UserAdvertsActionResultInfoFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbJ0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LbJ0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_actions.info.a$a$b */
        public static final class b extends N implements l<C25520c, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsActionResultInfoFragment f314634l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment) {
                super(1);
                this.f314634l = userAdvertsActionResultInfoFragment;
            }

            @Override // Y41.l
            public final G0 invoke(C25520c c25520c) {
                C25520c.a aVar = c25520c.f57036c;
                if (aVar instanceof C25520c.a.C1998a) {
                    com.avito.konveyor.adapter.d dVar = this.f314634l.f314613h0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(((C25520c.a.C1998a) aVar).f57037a, null);
                } else {
                    boolean z12 = aVar instanceof C25520c.a.b;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9726a(UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment, Continuation<? super C9726a> continuation) {
            super(2, continuation);
            this.f314632r = userAdvertsActionResultInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new C9726a(this.f314632r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C9726a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314631q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment = this.f314632r;
                InterfaceC43160i interfaceC43160iS = C43175k.s(((c) userAdvertsActionResultInfoFragment.f314618m0.getValue()).getState(), C9727a.f314633l);
                ScreenPerformanceTracker screenPerformanceTracker = userAdvertsActionResultInfoFragment.f314616k0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                b bVar = new b(userAdvertsActionResultInfoFragment);
                this.f314631q = 1;
                if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iS, screenPerformanceTracker, bVar, this) == coroutine_suspended) {
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
    public a(UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f314630r = userAdvertsActionResultInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f314630r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314629q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            UserAdvertsActionResultInfoFragment userAdvertsActionResultInfoFragment = this.f314630r;
            C9726a c9726a = new C9726a(userAdvertsActionResultInfoFragment, null);
            this.f314629q = 1;
            if (C23056p0.b(userAdvertsActionResultInfoFragment, state, c9726a, this) == coroutine_suspended) {
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
