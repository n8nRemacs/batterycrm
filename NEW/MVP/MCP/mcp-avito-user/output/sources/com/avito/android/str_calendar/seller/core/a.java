package com.avito.android.str_calendar.seller.core;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: StrSellerCalendarCoreDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$handleUpdateCalendar$1", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f287799q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287800r;

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$handleUpdateCalendar$1$1", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.str_calendar.seller.core.a$a, reason: collision with other inner class name */
    public static final class C8642a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287801q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287802r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8642a(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment, Continuation<? super C8642a> continuation) {
            super(2, continuation);
            this.f287802r = strSellerCalendarCoreDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C8642a(this.f287802r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C8642a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287801q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = this.f287802r.f287778i0;
                if (cVar == null) {
                    cVar = null;
                }
                this.f287801q = 1;
                if (cVar.b(this) == coroutine_suspended) {
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

    /* compiled from: StrSellerCalendarCoreDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment$handleUpdateCalendar$1$2", f = "StrSellerCalendarCoreDialogFragment.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f287803q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ StrSellerCalendarCoreDialogFragment f287804r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f287804r = strSellerCalendarCoreDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f287804r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f287803q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = this.f287804r.f287778i0;
                if (cVar == null) {
                    cVar = null;
                }
                this.f287803q = 1;
                if (cVar.k(this) == coroutine_suspended) {
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
    public a(StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f287800r = strSellerCalendarCoreDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f287800r, continuation);
        aVar.f287799q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f287799q;
        StrSellerCalendarCoreDialogFragment strSellerCalendarCoreDialogFragment = this.f287800r;
        C43259k.d(t12, null, null, new C8642a(strSellerCalendarCoreDialogFragment, null), 3);
        C43259k.d(t12, null, null, new b(strSellerCalendarCoreDialogFragment, null), 3);
        return G0.f406611a;
    }
}
