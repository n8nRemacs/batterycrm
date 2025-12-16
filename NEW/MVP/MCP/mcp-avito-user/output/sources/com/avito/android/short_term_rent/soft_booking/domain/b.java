package com.avito.android.short_term_rent.soft_booking.domain;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.short_term_rent.soft_booking.domain.a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import com.avito.android.validation.InterfaceC36020m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pw0.C47158b;
import pw0.C47159c;

/* compiled from: ContactsValidateInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/b;", "Lcom/avito/android/short_term_rent/soft_booking/domain/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.short_term_rent.soft_booking.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36020m f282592a;

    /* compiled from: ContactsValidateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.domain.ContactsValidateInteractorImpl$invoke$1", f = "ContactsValidateInteractor.kt", i = {}, l = {57, 60}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282593q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f282594r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282595s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f282596t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f282597u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f282598v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, b bVar, Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar, Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f282595s = aVar;
            this.f282596t = bVar;
            this.f282597u = (SuspendLambda) qVar;
            this.f282598v = (SuspendLambda) qVar2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f282595s, this.f282596t, this.f282597u, this.f282598v, continuation);
            aVar.f282594r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        /* JADX WARN: Type inference failed for: r3v6, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object next;
            Object next2;
            Object next3;
            StrSoftBookingContactFieldType strSoftBookingContactFieldType;
            String singleMessage;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282593q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282594r;
                C47159c c47159c = this.f282595s.f282796e;
                C47158b c47158b = c47159c.f428859a;
                C47158b c47158bA = c47158b != null ? C47158b.a(c47158b, null, null, 7) : null;
                C47158b c47158b2 = c47159c.f428860b;
                C47158b c47158bA2 = c47158b2 != null ? C47158b.a(c47158b2, null, null, 7) : null;
                C47158b c47158b3 = c47159c.f428861c;
                C47159c c47159cA = C47159c.a(c47159c, c47158bA, c47158bA2, c47158b3 != null ? C47158b.a(c47158b3, null, null, 7) : null, null, 8);
                ParametersTree parametersTree = c47159cA.f428862d;
                if (parametersTree == null) {
                    return G0.f406611a;
                }
                Map<String, PretendErrorValue> errors = this.f282596t.f282592a.a(parametersTree).getErrors();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, PretendErrorValue> entry : errors.entrySet()) {
                    String key = entry.getKey();
                    C47158b c47158b4 = c47159cA.f428859a;
                    if (L.f(key, c47158b4 != null ? c47158b4.f428855a : null)) {
                        strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                    } else {
                        C47158b c47158b5 = c47159cA.f428860b;
                        if (L.f(key, c47158b5 != null ? c47158b5.f428855a : null)) {
                            strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282655c;
                        } else {
                            C47158b c47158b6 = c47159cA.f428861c;
                            strSoftBookingContactFieldType = L.f(key, c47158b6 != null ? c47158b6.f428855a : null) ? StrSoftBookingContactFieldType.f282656d : null;
                        }
                    }
                    a.C8445a c8445a = (strSoftBookingContactFieldType == null || (singleMessage = entry.getValue().getSingleMessage()) == null) ? null : new a.C8445a(strSoftBookingContactFieldType, singleMessage);
                    if (c8445a != null) {
                        arrayList.add(c8445a);
                    }
                }
                if (arrayList.isEmpty()) {
                    ?? r12 = this.f282597u;
                    this.f282593q = 1;
                    if (r12.invoke(interfaceC43172j, c47159cA, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((a.C8445a) next).f282590a == StrSoftBookingContactFieldType.f282654b) {
                            break;
                        }
                    }
                    a.C8445a c8445a2 = (a.C8445a) next;
                    String str = c8445a2 != null ? c8445a2.f282591b : null;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((a.C8445a) next2).f282590a == StrSoftBookingContactFieldType.f282655c) {
                            break;
                        }
                    }
                    a.C8445a c8445a3 = (a.C8445a) next2;
                    String str2 = c8445a3 != null ? c8445a3.f282591b : null;
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        if (((a.C8445a) next3).f282590a == StrSoftBookingContactFieldType.f282656d) {
                            break;
                        }
                    }
                    a.C8445a c8445a4 = (a.C8445a) next3;
                    String str3 = c8445a4 != null ? c8445a4.f282591b : null;
                    C47158b c47158b7 = c47159c.f428859a;
                    C47158b c47158bA3 = c47158b7 != null ? C47158b.a(c47158b7, null, str, 7) : null;
                    C47158b c47158b8 = c47159c.f428860b;
                    C47158b c47158bA4 = c47158b8 != null ? C47158b.a(c47158b8, null, str2, 7) : null;
                    C47158b c47158b9 = c47159c.f428861c;
                    C47159c c47159cA2 = C47159c.a(c47159c, c47158bA3, c47158bA4, c47158b9 != null ? C47158b.a(c47158b9, null, str3, 7) : null, null, 8);
                    ?? r32 = this.f282598v;
                    this.f282593q = 2;
                    if (r32.invoke(interfaceC43172j, c47159cA2, this) == coroutine_suspended) {
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
    public b(@Y61.k InterfaceC36020m interfaceC36020m) {
        this.f282592a = interfaceC36020m;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.domain.a
    @Y61.k
    public final InterfaceC43160i<StrSoftBookingInternalAction> a(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, @Y61.l Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar, @Y61.l Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar2) {
        return C43175k.G(new a(aVar, this, qVar, qVar2, null));
    }
}
