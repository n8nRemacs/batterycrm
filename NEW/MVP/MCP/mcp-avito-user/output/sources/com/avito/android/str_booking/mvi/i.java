package com.avito.android.str_booking.mvi;

import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements com.avito.android.arch.mvi.b<StrBookingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AnimationOverlayUrl f285833a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.domain.d f285834b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f285835c;

    /* compiled from: StrBookingBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_booking.mvi.StrBookingBootstrap$produce$1", f = "StrBookingBootstrap.kt", i = {0}, l = {21, 22}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285836q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285837r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f285837r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285836q;
            i iVar = i.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f285837r;
                if (iVar.f285835c) {
                    return G0.f406611a;
                }
                com.avito.android.str_booking.domain.d dVar = iVar.f285834b;
                boolean z12 = false;
                boolean z13 = dVar.f285576a.getBoolean("guest_profile_shown", false);
                int i13 = dVar.f285576a.getInt("guest_profile_tooltip_shown_count", 0);
                if (!z13 && i13 < 5) {
                    z12 = true;
                }
                StrBookingInternalAction.Init init = new StrBookingInternalAction.Init(z12);
                this.f285837r = interfaceC43172j;
                this.f285836q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    iVar.f285835c = true;
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f285837r;
                C42729a0.b(obj);
            }
            AnimationOverlayUrl animationOverlayUrl = iVar.f285833a;
            if (animationOverlayUrl != null) {
                StrBookingInternalAction.ShowStartAnimation showStartAnimation = new StrBookingInternalAction.ShowStartAnimation(animationOverlayUrl);
                this.f285837r = null;
                this.f285836q = 2;
                if (interfaceC43172j.emit(showStartAnimation, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            iVar.f285835c = true;
            return G0.f406611a;
        }
    }

    @Inject
    public i(@Y61.l AnimationOverlayUrl animationOverlayUrl, @Y61.k com.avito.android.str_booking.domain.d dVar) {
        this.f285833a = animationOverlayUrl;
        this.f285834b = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrBookingInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
