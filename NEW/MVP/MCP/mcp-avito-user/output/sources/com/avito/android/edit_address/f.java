package com.avito.android.edit_address;

import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.AddressCoordinates;
import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.extended.common.GeoCoordinates;
import com.avito.android.remote.model.extended.common.GeoSchedule;
import com.avito.android.remote.model.extended.modification.GeoModification;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import jy.InterfaceC42444b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditAddressInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/f;", "Lcom/avito/android/edit_address/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f145912a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f145913b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f145914c;

    /* compiled from: EditAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljy/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_address.EditAddressInteractorImpl$addAddressField$1", f = "EditAddressInteractor.kt", i = {0, 1}, l = {59, 60, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC42444b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public f f145915q;

        /* renamed from: r, reason: collision with root package name */
        public int f145916r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f145917s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CommonValueId f145919u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AddressCoordinates f145920v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f145921w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f145922x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ List<AddressWorkSchedule> f145923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommonValueId commonValueId, AddressCoordinates addressCoordinates, String str, String str2, List<AddressWorkSchedule> list, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f145919u = commonValueId;
            this.f145920v = addressCoordinates;
            this.f145921w = str;
            this.f145922x = str2;
            this.f145923y = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f145919u, this.f145920v, this.f145921w, this.f145922x, this.f145923y, continuation);
            aVar.f145917s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42444b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f145916r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r14)
                goto L78
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                com.avito.android.edit_address.f r1 = r13.f145915q
                java.lang.Object r3 = r13.f145917s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r14)
                goto L64
            L27:
                java.lang.Object r1 = r13.f145917s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                r14 = r1
                goto L44
            L30:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f145917s
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                jy.b$j r1 = jy.InterfaceC42444b.j.f405911a
                r13.f145917s = r14
                r13.f145916r = r4
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L44
                return r0
            L44:
                com.avito.android.remote.model.extended.modification.GeoModification$OperationType r10 = com.avito.android.remote.model.extended.modification.GeoModification.OperationType.ADD
                r13.f145917s = r14
                com.avito.android.edit_address.f r1 = com.avito.android.edit_address.f.this
                r13.f145915q = r1
                r13.f145916r = r3
                java.lang.String r8 = r13.f145922x
                java.util.List<com.avito.android.edit_address.entity.AddressWorkSchedule> r9 = r13.f145923y
                com.avito.android.profile_settings_extended.entity.CommonValueId r5 = r13.f145919u
                com.avito.android.edit_address.entity.AddressCoordinates r6 = r13.f145920v
                java.lang.String r7 = r13.f145921w
                r4 = r1
                r11 = r13
                java.lang.Object r3 = com.avito.android.edit_address.f.d(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r3 != r0) goto L61
                return r0
            L61:
                r12 = r3
                r3 = r14
                r14 = r12
            L64:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                jy.b r14 = com.avito.android.edit_address.f.c(r1, r14)
                r1 = 0
                r13.f145917s = r1
                r13.f145915q = r1
                r13.f145916r = r2
                java.lang.Object r14 = r3.emit(r14, r13)
                if (r14 != r0) goto L78
                return r0
            L78:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EditAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljy/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_address.EditAddressInteractorImpl$updateAddressField$1", f = "EditAddressInteractor.kt", i = {0, 1}, l = {78, 79, 87}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC42444b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public f f145924q;

        /* renamed from: r, reason: collision with root package name */
        public int f145925r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f145926s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CommonValueId f145928u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AddressCoordinates f145929v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f145930w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f145931x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ List<AddressWorkSchedule> f145932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CommonValueId commonValueId, AddressCoordinates addressCoordinates, String str, String str2, List<AddressWorkSchedule> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f145928u = commonValueId;
            this.f145929v = addressCoordinates;
            this.f145930w = str;
            this.f145931x = str2;
            this.f145932y = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(this.f145928u, this.f145929v, this.f145930w, this.f145931x, this.f145932y, continuation);
            bVar.f145926s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42444b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f145925r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L30
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r14)
                goto L78
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                com.avito.android.edit_address.f r1 = r13.f145924q
                java.lang.Object r3 = r13.f145926s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r14)
                goto L64
            L27:
                java.lang.Object r1 = r13.f145926s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                r14 = r1
                goto L44
            L30:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f145926s
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                jy.b$j r1 = jy.InterfaceC42444b.j.f405911a
                r13.f145926s = r14
                r13.f145925r = r4
                java.lang.Object r1 = r14.emit(r1, r13)
                if (r1 != r0) goto L44
                return r0
            L44:
                com.avito.android.remote.model.extended.modification.GeoModification$OperationType r10 = com.avito.android.remote.model.extended.modification.GeoModification.OperationType.UPDATE
                r13.f145926s = r14
                com.avito.android.edit_address.f r1 = com.avito.android.edit_address.f.this
                r13.f145924q = r1
                r13.f145925r = r3
                java.lang.String r8 = r13.f145931x
                java.util.List<com.avito.android.edit_address.entity.AddressWorkSchedule> r9 = r13.f145932y
                com.avito.android.profile_settings_extended.entity.CommonValueId r5 = r13.f145928u
                com.avito.android.edit_address.entity.AddressCoordinates r6 = r13.f145929v
                java.lang.String r7 = r13.f145930w
                r4 = r1
                r11 = r13
                java.lang.Object r3 = com.avito.android.edit_address.f.d(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r3 != r0) goto L61
                return r0
            L61:
                r12 = r3
                r3 = r14
                r14 = r12
            L64:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                jy.b r14 = com.avito.android.edit_address.f.c(r1, r14)
                r1 = 0
                r13.f145926s = r1
                r13.f145924q = r1
                r13.f145925r = r2
                java.lang.Object r14 = r3.emit(r14, r13)
                if (r14 != r0) goto L78
                return r0
            L78:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k R0 r02, @Y61.k h31.e eVar, @Y61.k h31.e eVar2) {
        this.f145912a = eVar;
        this.f145913b = eVar2;
        this.f145914c = r02;
    }

    public static final InterfaceC42444b c(f fVar, TypedResult typedResult) {
        InterfaceC42444b mVar;
        fVar.getClass();
        if (typedResult instanceof TypedResult.Success) {
            ModificationResult modificationResult = (ModificationResult) ((TypedResult.Success) typedResult).getResult();
            if (modificationResult instanceof ModificationResult.Ok) {
                return new InterfaceC42444b.d(true);
            }
            if (!(modificationResult instanceof ModificationResult.IncorrectValues)) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = new InterfaceC42444b.n(C42745f0.O(((ModificationResult.IncorrectValues) modificationResult).getErrors(), " ", null, null, g.f145933l, 30));
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            mVar = new InterfaceC42444b.m(C35936s.a(error.getError(), error.getCause()));
        }
        return mVar;
    }

    public static final Object d(f fVar, CommonValueId commonValueId, AddressCoordinates addressCoordinates, String str, String str2, List list, GeoModification.OperationType operationType, SuspendLambda suspendLambda) {
        fVar.getClass();
        GeoCoordinates geoCoordinates = new GeoCoordinates(addressCoordinates.f145891b, addressCoordinates.f145892c);
        String str3 = (str == null || str.length() == 0) ? null : str;
        String str4 = (str2 == null || str2.length() == 0) ? null : str2;
        List<AddressWorkSchedule> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (AddressWorkSchedule addressWorkSchedule : list2) {
            AddressDaysArray addressDaysArray = addressWorkSchedule.f145897d;
            if (addressDaysArray == null) {
                throw new IllegalStateException("Work days must be set");
            }
            boolean[] zArr = addressDaysArray.f145894c;
            GeoSchedule.Days days = new GeoSchedule.Days(Boolean.valueOf(zArr[0]), Boolean.valueOf(zArr[1]), Boolean.valueOf(zArr[2]), Boolean.valueOf(zArr[3]), Boolean.valueOf(zArr[4]), Boolean.valueOf(zArr[5]), Boolean.valueOf(zArr[6]));
            TimeInterval timeInterval = addressWorkSchedule.f145898e;
            if (timeInterval == null) {
                throw new IllegalStateException("Work time must be set");
            }
            GeoSchedule.TimeRange timeRangeE = e(timeInterval);
            TimeInterval timeInterval2 = addressWorkSchedule.f145899f;
            arrayList.add(new GeoSchedule(days, timeRangeE, timeInterval2 != null ? e(timeInterval2) : null));
        }
        return fVar.f145912a.get().e(fVar.f145913b.get().l(new ModificationBody(Collections.singletonList(new GeoModification(commonValueId.f230265b, Collections.singletonList(new GeoModification.Operation(commonValueId.f230266c, operationType, new GeoModification.Operation.GeoModificationValue(geoCoordinates, str3, str4, arrayList))))))), suspendLambda);
    }

    public static GeoSchedule.TimeRange e(TimeInterval timeInterval) {
        return timeInterval.f145911d ? new GeoSchedule.TimeRange(null, Boolean.TRUE) : new GeoSchedule.TimeRange(C42745f0.U(Integer.valueOf(timeInterval.f145909b), Integer.valueOf(timeInterval.f145910c)), null);
    }

    @Override // com.avito.android.edit_address.e
    @Y61.k
    public final InterfaceC43160i<InterfaceC42444b> a(@Y61.k CommonValueId commonValueId, @Y61.k AddressCoordinates addressCoordinates, @Y61.l String str, @Y61.l String str2, @Y61.k List<AddressWorkSchedule> list) {
        return C43175k.I(this.f145914c.a(), C43175k.G(new b(commonValueId, addressCoordinates, str, str2, list, null)));
    }

    @Override // com.avito.android.edit_address.e
    @Y61.k
    public final InterfaceC43160i<InterfaceC42444b> b(@Y61.k CommonValueId commonValueId, @Y61.k AddressCoordinates addressCoordinates, @Y61.l String str, @Y61.l String str2, @Y61.k List<AddressWorkSchedule> list) {
        return C43175k.I(this.f145914c.a(), C43175k.G(new a(commonValueId, addressCoordinates, str, str2, list, null)));
    }
}
