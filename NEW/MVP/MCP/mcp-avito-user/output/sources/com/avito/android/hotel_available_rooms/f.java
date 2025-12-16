package com.avito.android.hotel_available_rooms;

import JI.a;
import Y41.p;
import Y61.l;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: HotelAvailableRoomsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity$observeOnDeeplinkResult$1", f = "HotelAvailableRoomsActivity.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f162818q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ HotelAvailableRoomsActivity f162819r;

    /* compiled from: HotelAvailableRoomsActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity$observeOnDeeplinkResult$1$1", f = "HotelAvailableRoomsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f162820q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ HotelAvailableRoomsActivity f162821r;

        /* compiled from: HotelAvailableRoomsActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.hotel_available_rooms.HotelAvailableRoomsActivity$observeOnDeeplinkResult$1$1$1", f = "HotelAvailableRoomsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.hotel_available_rooms.f$a$a, reason: collision with other inner class name */
        public static final class C4758a extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f162822q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ HotelAvailableRoomsActivity f162823r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4758a(HotelAvailableRoomsActivity hotelAvailableRoomsActivity, Continuation<? super C4758a> continuation) {
                super(2, continuation);
                this.f162823r = hotelAvailableRoomsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                C4758a c4758a = new C4758a(this.f162823r, continuation);
                c4758a.f162822q = obj;
                return c4758a;
            }

            @Override // Y41.p
            public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
                return ((C4758a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43501a c43501a = (C43501a) this.f162822q;
                HotelAvailableRoomsActivity.a aVar = HotelAvailableRoomsActivity.f162646u;
                j jVarB2 = this.f162823r.b2();
                com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
                jVarB2.accept(new a.j(aVar2.f134521b, c43501a.f413261b));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HotelAvailableRoomsActivity hotelAvailableRoomsActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f162821r = hotelAvailableRoomsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f162821r, continuation);
            aVar.f162820q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f162820q;
            HotelAvailableRoomsActivity hotelAvailableRoomsActivity = this.f162821r;
            com.avito.android.deeplink_handler.handler.composite.a aVar = hotelAvailableRoomsActivity.f162650p;
            if (aVar == null) {
                aVar = null;
            }
            C43175k.K(new C43197r1(new C4758a(hotelAvailableRoomsActivity, null), y.a(aVar.V9())), t12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HotelAvailableRoomsActivity hotelAvailableRoomsActivity, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f162819r = hotelAvailableRoomsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f162819r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f162818q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            HotelAvailableRoomsActivity hotelAvailableRoomsActivity = this.f162819r;
            a aVar = new a(hotelAvailableRoomsActivity, null);
            this.f162818q = 1;
            if (C23056p0.b(hotelAvailableRoomsActivity, state, aVar, this) == coroutine_suspended) {
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
