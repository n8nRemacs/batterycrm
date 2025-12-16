package com.avito.android.publish.slots.address_from_profile;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.address_from_profile.j;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot;
import com.avito.android.remote.model.category_parameters.slot.select_address_in_list.SelectAddressInListSlotConfig;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import i31.InterfaceC41220a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kl0.C42710a;
import kl0.C42711b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SelectAddressInListSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/z;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/select_address_in_list/AddressesFromProfileSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z extends com.avito.android.category_parameters.k<AddressesFromProfileSlot> implements com.avito.android.publish.slots.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AddressesFromProfileSlot f242966b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f242967c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g f242968d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242969e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f242970f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C0 f242971g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.slots.address_from_profile.publish_item.s f242972h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f242973i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final N0 f242974j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C43238h f242975k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final N0 f242976l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> f242977m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f242978n;

    /* compiled from: SelectAddressInListSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListSlotWrapper$1", f = "SelectAddressInListSlotWrapper.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f242979q;

        /* compiled from: SelectAddressInListSlotWrapper.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "emit", "(Lkotlin/G0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish.slots.address_from_profile.z$a$a, reason: collision with other inner class name */
        public static final class C7283a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f242981b;

            public C7283a(z zVar) {
                this.f242981b = zVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r6 = this;
                    boolean r0 = r7 instanceof com.avito.android.publish.slots.address_from_profile.y
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.publish.slots.address_from_profile.y r0 = (com.avito.android.publish.slots.address_from_profile.y) r0
                    int r1 = r0.f242965t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f242965t = r1
                    goto L18
                L13:
                    com.avito.android.publish.slots.address_from_profile.y r0 = new com.avito.android.publish.slots.address_from_profile.y
                    r0.<init>(r6, r7)
                L18:
                    java.lang.Object r7 = r0.f242963r
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f242965t
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r0 = r0.f242962q
                    com.avito.android.publish.slots.address_from_profile.z$a$a r0 = (com.avito.android.publish.slots.address_from_profile.z.a.C7283a) r0
                    kotlin.C42729a0.b(r7)
                    goto L59
                L2d:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L35:
                    kotlin.C42729a0.b(r7)
                    com.avito.android.publish.slots.address_from_profile.z r7 = r6.f242981b
                    com.avito.android.publish.slots.address_from_profile.k r2 = r7.f242967c
                    com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot r7 = r7.f242966b
                    com.avito.android.remote.model.category_parameters.slot.SlotWidget r7 = r7.getWidget()
                    com.avito.android.remote.model.category_parameters.slot.SlotConfig r7 = r7.getConfig()
                    com.avito.android.remote.model.category_parameters.slot.select_address_in_list.SelectAddressInListSlotConfig r7 = (com.avito.android.remote.model.category_parameters.slot.select_address_in_list.SelectAddressInListSlotConfig) r7
                    int r7 = r7.getVerticalId()
                    long r4 = (long) r7
                    r0.f242962q = r6
                    r0.f242965t = r3
                    java.lang.Object r7 = r2.a(r4, r0)
                    if (r7 != r1) goto L58
                    return r1
                L58:
                    r0 = r6
                L59:
                    com.avito.android.publish.slots.address_from_profile.j r7 = (com.avito.android.publish.slots.address_from_profile.j) r7
                    com.avito.android.publish.slots.address_from_profile.z r1 = r0.f242981b
                    com.avito.android.publish.slots.address_from_profile.publish_item.s r7 = com.avito.android.publish.slots.address_from_profile.z.l(r1, r7)
                    r1.f242972h = r7
                    com.avito.android.publish.slots.address_from_profile.z r7 = r0.f242981b
                    com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> r0 = r7.f242977m
                    com.avito.android.category_parameters.f$b r1 = new com.avito.android.category_parameters.f$b
                    com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot r7 = r7.f242966b
                    com.avito.android.remote.model.category_parameters.slot.SlotType r7 = r7.getSlotType()
                    r2 = 0
                    r1.<init>(r7, r2)
                    r0.accept(r1)
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.address_from_profile.z.a.C7283a.a(kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(continuation);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return z.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f242979q;
            if (i12 == 0) {
                C42729a0.b(obj);
                z zVar = z.this;
                d2<G0> d2VarA = zVar.f242968d.a();
                C7283a c7283a = new C7283a(zVar);
                this.f242979q = 1;
                if (d2VarA.collect(c7283a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectAddressInListSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/j;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/publish/slots/address_from_profile/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.slots.address_from_profile.SelectAddressInListSlotWrapper$2", f = "SelectAddressInListSlotWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<j, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f242982q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = z.this.new b(continuation);
            bVar.f242982q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(j jVar, Continuation<? super G0> continuation) {
            return ((b) create(jVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            j jVar = (j) this.f242982q;
            z zVar = z.this;
            zVar.f242972h = z.l(zVar, jVar);
            zVar.f242977m.accept(new f.b(zVar.f242966b.getSlotType(), null));
            return G0.f406611a;
        }
    }

    @i31.c
    public z(@InterfaceC41220a @Y61.k AddressesFromProfileSlot addressesFromProfileSlot, @Y61.k k kVar, @Y61.k R0 r02, @Y61.k g gVar, @Y61.k com.avito.android.details.a aVar, @Y61.k com.avito.android.category_parameters.a aVar2, @Y61.k C0 c02) {
        AddressParameter addressParameter;
        List<ParameterSlot> parameters;
        Object next;
        this.f242966b = addressesFromProfileSlot;
        this.f242967c = kVar;
        this.f242968d = gVar;
        this.f242969e = aVar;
        this.f242970f = aVar2;
        this.f242971g = c02;
        this.f242973i = U.a(r02.a());
        this.f242975k = U.a(r02.a());
        com.jakewharton.rxrelay3.c<com.avito.android.category_parameters.f> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f242977m = cVar;
        this.f242978n = cVar;
        CategoryParameters categoryParametersC0 = aVar.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (next instanceof AddressParameter) {
                        break;
                    }
                }
            }
            addressParameter = (AddressParameter) (next instanceof AddressParameter ? next : null);
        }
        if (addressParameter != null) {
            addressParameter.setErrorPlace(AddressParameter.EmptyValueErrorPlace.LOCATION_WIDGET);
        }
        if (addressParameter != null) {
            addressParameter.clearError();
        }
        N0 n02 = this.f242976l;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f242976l = C43259k.d(this.f242975k, null, null, new a(null), 3);
        N0 n03 = this.f242974j;
        if (n03 != null) {
            n03.c(null);
        }
        this.f242974j = C43175k.K(new C43197r1(new b(null), this.f242967c.b(((SelectAddressInListSlotConfig) this.f242966b.getWidget().getConfig()).getVerticalId())), this.f242973i);
    }

    public static final com.avito.android.publish.slots.address_from_profile.publish_item.s l(z zVar, j jVar) {
        AddressParameter addressParameter;
        AddressParameter.Value.PublishValueSellerAddressData addressData;
        List<ParameterSlot> parameters;
        Object next;
        zVar.getClass();
        if (jVar instanceof j.a) {
            return com.avito.android.publish.slots.address_from_profile.publish_item.n.f242934b;
        }
        if (jVar instanceof j.b) {
            return com.avito.android.publish.slots.address_from_profile.publish_item.p.f242941b;
        }
        if (!(jVar instanceof j.c)) {
            throw new NoWhenBranchMatchedException();
        }
        j.c cVar = (j.c) jVar;
        CategoryParameters categoryParametersC0 = zVar.f242969e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof AddressParameter) {
                    break;
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        if (addressParameter != null) {
            addressParameter.setAddressesLoaded(Boolean.TRUE);
        }
        if (addressParameter != null) {
            addressParameter.clearError();
        }
        AddressParameter.Value value = addressParameter != null ? addressParameter.getValue() : null;
        String id2 = (value == null || (addressData = value.getAddressData()) == null) ? null : addressData.getId();
        C42710a c42710a = cVar.f242842a;
        ArrayList arrayList = new ArrayList(c42710a.a());
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        Integer numValueOf = null;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C42711b c42711b = (C42711b) next2;
            com.avito.android.publish.slots.address_from_profile.publish_item.k kVar = new com.avito.android.publish.slots.address_from_profile.publish_item.k(c42711b.getId(), c42711b.getHouse(), c42711b.getLocation(), c42711b.getName(), c42711b.getValue(), false, false);
            boolean z12 = true;
            if (!L.f(id2, c42711b.getId()) && arrayList.size() != 1) {
                z12 = false;
            }
            if (z12) {
                numValueOf = Integer.valueOf(i12);
            }
            arrayList2.add(com.avito.android.publish.slots.address_from_profile.publish_item.k.a(kVar, false, z12, 63));
            i12 = i13;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        if (numValueOf != null) {
            arrayList3.add(0, (com.avito.android.publish.slots.address_from_profile.publish_item.k) arrayList3.remove(numValueOf.intValue()));
        }
        kotlin.random.f.f406882b.getClass();
        return new com.avito.android.publish.slots.address_from_profile.publish_item.r(String.valueOf(kotlin.random.f.f406883c.i()), arrayList3, c42710a.getEsid(), c42710a.getLoadErrorText(), c42710a.getNeedSearch(), c42710a.getSearchErrorText(), c42710a.getSearchPlaceholder(), c42710a.getValidationErrorText(), false, 256, null);
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.category_parameters.f> a() {
        return this.f242978n;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<SuccessResult>> c() {
        AddressParameter addressParameter;
        String strMo56getErrorMessage;
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f242969e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof AddressParameter) {
                    break;
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        if (addressParameter != null) {
            addressParameter.setError((!L.f(addressParameter.isAddressesLoaded(), Boolean.TRUE) || addressParameter.getSelectedValue() == null) ? addressParameter.mo56getErrorMessage() != null ? new HasError.Error.WithMessage(addressParameter.mo56getErrorMessage()) : HasError.Error.WithoutMessage.INSTANCE : null);
        }
        this.f242977m.accept(new f.b(this.f242966b.getSlotType(), null));
        if (addressParameter != null && !addressParameter.hasError()) {
            return io.reactivex.rxjava3.core.z.c0(new P2.b(new SuccessResult(null, 1, null)));
        }
        if (addressParameter == null || (strMo56getErrorMessage = addressParameter.mo56getErrorMessage()) == null) {
            strMo56getErrorMessage = "";
        }
        return io.reactivex.rxjava3.core.z.c0(new P2.a(new ApiError.Failure(strMo56getErrorMessage)));
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
        N0 n02 = this.f242974j;
        if (n02 != null) {
            n02.c(null);
        }
        N0 n03 = this.f242976l;
        if (n03 != null) {
            ((V0) n03).c(null);
        }
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        return new f.b(this.f242966b.getSlotType(), null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f242966b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        AddressParameter addressParameter;
        AddressParameter.Value.PublishValueSellerAddressData addressData;
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f242969e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof AddressParameter) {
                    break;
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        com.avito.android.publish.slots.address_from_profile.publish_item.s rVar = this.f242972h;
        if (rVar == null) {
            return C42784z0.f406748b;
        }
        boolean z12 = rVar instanceof com.avito.android.publish.slots.address_from_profile.publish_item.r;
        boolean z13 = z12 && O2.a(((com.avito.android.publish.slots.address_from_profile.publish_item.r) rVar).f242946c);
        if (addressParameter != null) {
            addressParameter.setAddressesLoaded(Boolean.valueOf(z13));
        }
        if (addressParameter != null) {
            addressParameter.setErrorPlace(L.f(addressParameter.isAddressesLoaded(), Boolean.TRUE) ? AddressParameter.EmptyValueErrorPlace.ADDRESSES_LIST : AddressParameter.EmptyValueErrorPlace.LOCATION_WIDGET);
        }
        com.avito.conveyor_item.a aVar = addressParameter != null ? (com.avito.conveyor_item.a) C42745f0.E(com.avito.android.category_parameters.a.c(this.f242970f, new UV0.c(Collections.singletonList(addressParameter)), null, null, this.f242971g.ve(), 14)) : null;
        ParameterElement.C.b bVar = aVar instanceof ParameterElement.C.b ? (ParameterElement.C.b) aVar : null;
        if (bVar == null) {
            return Collections.singletonList(rVar);
        }
        if (z12) {
            com.avito.android.publish.slots.address_from_profile.publish_item.r rVar2 = (com.avito.android.publish.slots.address_from_profile.publish_item.r) rVar;
            List<com.avito.android.publish.slots.address_from_profile.publish_item.k> list = rVar2.f242946c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.android.publish.slots.address_from_profile.publish_item.k kVar : list) {
                AddressParameter.Value value = addressParameter.getValue();
                arrayList.add(com.avito.android.publish.slots.address_from_profile.publish_item.k.a(kVar, false, L.f((value == null || (addressData = value.getAddressData()) == null) ? null : addressData.getId(), kVar.f242922b), 63));
            }
            rVar = new com.avito.android.publish.slots.address_from_profile.publish_item.r(rVar2.f242945b, arrayList, rVar2.f242947d, rVar2.f242948e, rVar2.f242949f, rVar2.f242950g, rVar2.f242951h, rVar2.f242952i, rVar2.f242953j);
        }
        return C42745f0.U(bVar, rVar);
    }
}
