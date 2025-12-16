package com.avito.android.travel_guest_profile.mvi;

import Y41.p;
import com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TravelGuestProfileBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.b<TravelGuestProfileInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.interactors.c f302150a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.interactors.f f302151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f302152c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f302153d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f302154e;

    /* compiled from: TravelGuestProfileBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_guest_profile/mvi/entity/TravelGuestProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_guest_profile.mvi.TravelGuestProfileBootstrap$produce$1", f = "TravelGuestProfileBootstrap.kt", i = {0}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TravelGuestProfileInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f302155q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f302156r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f302156r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TravelGuestProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f302155q;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f302156r;
                TravelGuestProfileInternalAction.Init init = new TravelGuestProfileInternalAction.Init(cVar.f302152c, cVar.f302153d, cVar.f302154e);
                this.f302156r = interfaceC43172j;
                this.f302155q = 1;
                if (interfaceC43172j.emit(init, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f302156r;
                C42729a0.b(obj);
            }
            com.avito.android.travel_guest_profile.domain.interactors.c cVar2 = cVar.f302150a;
            String str = cVar.f302152c;
            kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(cVar2.a(str), cVar.f302151b.a(str, cVar.f302153d, P0.c()));
            this.f302156r = null;
            this.f302155q = 2;
            if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k com.avito.android.travel_guest_profile.domain.interactors.c cVar, @Y61.k com.avito.android.travel_guest_profile.domain.interactors.f fVar, @com.avito.android.travel_guest_profile.di.j @Y61.k String str, @Y61.l @com.avito.android.travel_guest_profile.di.b String str2, @com.avito.android.travel_guest_profile.di.a @Y61.l String str3) {
        this.f302150a = cVar;
        this.f302151b = fVar;
        this.f302152c = str;
        this.f302153d = str2;
        this.f302154e = str3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TravelGuestProfileInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
