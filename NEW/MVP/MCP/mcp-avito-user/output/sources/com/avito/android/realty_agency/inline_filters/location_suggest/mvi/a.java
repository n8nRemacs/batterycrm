package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import com.avito.android.R;
import com.avito.android.realty_agency.inline_filters.location_suggest.mvi.entity.LocationSuggestInternalAction;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import ji0.InterfaceC42386a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oi0.C44782a;
import oi0.C44783b;

/* compiled from: LocationSuggestActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lji0/a;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lji0/c;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC42386a, LocationSuggestInternalAction, ji0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f251678a;

    /* compiled from: LocationSuggestActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.location_suggest.mvi.LocationSuggestActor$process$1", f = "LocationSuggestActor.kt", i = {0}, l = {30, 32}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.realty_agency.inline_filters.location_suggest.mvi.a$a, reason: collision with other inner class name */
    public static final class C7551a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f251679q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f251680r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42386a f251681s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ji0.c f251682t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ a f251683u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7551a(InterfaceC42386a interfaceC42386a, ji0.c cVar, a aVar, Continuation<? super C7551a> continuation) {
            super(2, continuation);
            this.f251681s = interfaceC42386a;
            this.f251682t = cVar;
            this.f251683u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7551a c7551a = new C7551a(this.f251681s, this.f251682t, this.f251683u, continuation);
            c7551a.f251680r = obj;
            return c7551a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LocationSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7551a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f251679q;
            InterfaceC42386a interfaceC42386a = this.f251681s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f251680r;
                InterfaceC42386a.b bVar = (InterfaceC42386a.b) interfaceC42386a;
                if (L.f(bVar.f405764a, this.f251682t.f405771c)) {
                    return G0.f406611a;
                }
                LocationSuggestInternalAction.UpdateQueryString updateQueryString = new LocationSuggestInternalAction.UpdateQueryString(bVar.f405764a);
                this.f251680r = interfaceC43172j;
                this.f251679q = 1;
                if (interfaceC43172j.emit(updateQueryString, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f251680r;
                C42729a0.b(obj);
            }
            l lVar = this.f251683u.f251678a;
            String str = ((InterfaceC42386a.b) interfaceC42386a).f405764a;
            lVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new k(lVar, str, null));
            this.f251680r = null;
            this.f251679q = 2;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationSuggestActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.inline_filters.location_suggest.mvi.LocationSuggestActor$process$2", f = "LocationSuggestActor.kt", i = {}, l = {42, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LocationSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f251684q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f251685r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ji0.c f251686s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42386a f251687t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ji0.c cVar, InterfaceC42386a interfaceC42386a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f251686s = cVar;
            this.f251687t = interfaceC42386a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f251686s, this.f251687t, continuation);
            bVar.f251685r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super LocationSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f251684q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251685r;
                C44782a c44782a = this.f251686s.f405772d;
                C44783b c44783b = null;
                if (c44782a != null) {
                    long j12 = ((InterfaceC42386a.C11575a) this.f251687t).f405763a;
                    List<C44783b> listB = c44782a.b();
                    if (listB == null) {
                        listB = C42784z0.f406748b;
                    }
                    List<C44783b> list = listB;
                    List<C44783b> listA = c44782a.a();
                    if (listA == null) {
                        listA = C42784z0.f406748b;
                    }
                    Iterator it = C42745f0.h0(listA, list).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((C44783b) next).getId() == j12) {
                            c44783b = next;
                            break;
                        }
                    }
                    c44783b = c44783b;
                }
                if (c44783b == null) {
                    LocationSuggestInternalAction.ShowToast showToast = new LocationSuggestInternalAction.ShowToast(com.avito.android.printable_text.b.c(R.string.realty_agency_inline_filters_something_went_wrong, new Serializable[0]));
                    this.f251684q = 1;
                    if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    LocationSuggestInternalAction.CloseScreenWithSelectedLocation closeScreenWithSelectedLocation = new LocationSuggestInternalAction.CloseScreenWithSelectedLocation(c44783b);
                    this.f251684q = 2;
                    if (interfaceC43172j.emit(closeScreenWithSelectedLocation, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k l lVar) {
        this.f251678a = lVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(this, aVar, null), C43175k.o(c43197r1, com.avito.android.realty_agency.inline_filters.location_suggest.mvi.b.f251688l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<LocationSuggestInternalAction> b(@Y61.k InterfaceC42386a interfaceC42386a, @Y61.k ji0.c cVar) {
        if (interfaceC42386a instanceof InterfaceC42386a.c) {
            String str = cVar.f405771c;
            l lVar = this.f251678a;
            lVar.getClass();
            return C43175k.G(new k(lVar, str, null));
        }
        if (interfaceC42386a instanceof InterfaceC42386a.b) {
            return C43175k.G(new C7551a(interfaceC42386a, cVar, this, null));
        }
        if (interfaceC42386a instanceof InterfaceC42386a.C11575a) {
            return C43175k.G(new b(cVar, interfaceC42386a, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
