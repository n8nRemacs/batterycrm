package com.avito.android.user_adverts.root_screen.adverts_host;

import TI0.c;
import android.content.res.Resources;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectShortcutsViewState$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1153}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35640z extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314184q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f314185r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f314186s;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI0/c;", VoiceInfo.STATE, "LTI0/c$b;", "invoke", "(LTI0/c;)LTI0/c$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.z$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<TI0.c, c.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f314187l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final c.b invoke(TI0.c cVar) {
            return cVar.f15561j;
        }
    }

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LTI0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.z$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<TI0.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b0 f314188l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var) {
            super(1);
            this.f314188l = b0Var;
        }

        @Override // Y41.l
        public final G0 invoke(TI0.c cVar) throws Resources.NotFoundException {
            this.f314188l.e(cVar.f15561j);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35640z(UserAdvertsHostFragment userAdvertsHostFragment, b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.f314185r = userAdvertsHostFragment;
        this.f314186s = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35640z(this.f314185r, this.f314186s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35640z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314184q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsHostFragment userAdvertsHostFragment = this.f314185r;
            com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
            if (e0Var == null) {
                e0Var = null;
            }
            InterfaceC43160i interfaceC43160iS = C43175k.s(e0Var.getState(), a.f314187l);
            R0 r02 = userAdvertsHostFragment.f312300J0;
            if (r02 == null) {
                r02 = null;
            }
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iS);
            ScreenPerformanceTracker screenPerformanceTracker = userAdvertsHostFragment.f312291A0;
            ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
            b bVar = new b(this.f314186s);
            this.f314184q = 1;
            if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iI, screenPerformanceTracker2, bVar, this) == coroutine_suspended) {
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
