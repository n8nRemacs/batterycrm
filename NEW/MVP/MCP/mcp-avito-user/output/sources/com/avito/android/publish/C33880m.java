package com.avito.android.publish;

import com.avito.android.publish.InterfaceC33878l;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.fees.FeePricingParamsResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC35998b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FeesParamsInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/m;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/l;", "Lcom/avito/android/publish/O;", "c", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33880m extends androidx.view.M0 implements InterfaceC33878l, O {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H0 f237379E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f237380J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f237381K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35998b f237382L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final c f237383M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC33878l.a> f237384N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final BK0.a<InterfaceC33878l.a> f237385O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f237386P;

    /* compiled from: FeesParamsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u00012\u0018\u0010\u0004\u001a\u0014 \u0002*\t\u0018\u00010\u0000¢\u0006\u0002\b\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/publish/l$a;", "Lj41/e;", "kotlin.jvm.PlatformType", "oldMsg", "newMsg", "", "test", "(Lcom/avito/android/publish/l$a;Lcom/avito/android/publish/l$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.m$a */
    public static final class a<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T1, T2> f237387a = new a<>();

        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            return kotlin.jvm.internal.L.f(((InterfaceC33878l.a) obj).f237373a, ((InterfaceC33878l.a) obj2).f237373a);
        }
    }

    /* compiled from: FeesParamsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/l$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.m$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33880m.this.f237385O.onNext((InterfaceC33878l.a) obj);
        }
    }

    /* compiled from: FeesParamsInteractor.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/m$c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.m$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.remote.H0 f237389a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC35745a5 f237390b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public List<FeePricingParamsResult> f237391c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public io.reactivex.rxjava3.internal.observers.m f237392d;

        public c(@Y61.k com.avito.android.remote.H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
            this.f237389a = h02;
            this.f237390b = interfaceC35745a5;
        }
    }

    @Inject
    public C33880m(@Y61.k com.avito.android.remote.H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k InterfaceC35998b interfaceC35998b) {
        this.f237379E = h02;
        this.f237380J = interfaceC35745a5;
        this.f237381K = categoryParametersConverter;
        this.f237382L = interfaceC35998b;
        this.f237383M = new c(h02, interfaceC35745a5);
        com.jakewharton.rxrelay3.c<InterfaceC33878l.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237384N = cVar;
        this.f237385O = new BK0.a<>();
        cVar.B(a.f237387a).t0(new b());
    }

    @Override // com.avito.android.publish.O
    public final boolean E8(@Y61.k EditableParameter<?> editableParameter, @Y61.l Integer num) {
        List<FeePricingParamsResult> list;
        Object next;
        if (num == null || (list = this.f237383M.f237391c) == null) {
            return false;
        }
        if (editableParameter instanceof AddressParameter) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((FeePricingParamsResult) next).getCategoryId(), num.toString())) {
                break;
            }
        }
        FeePricingParamsResult feePricingParamsResult = (FeePricingParamsResult) next;
        if (feePricingParamsResult == null) {
            return false;
        }
        return feePricingParamsResult.getParamIds().contains(editableParameter.getId());
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InterfaceC33878l.a> H8() {
        return this.f237385O;
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void W8(@Y61.k EditableParameter<?> editableParameter, @Y61.l String str, @Y61.l Integer num, @Y61.l CategoryParameters categoryParameters) {
        AddressParameter.Value value;
        if (E8(editableParameter, num)) {
            String strValueOf = String.valueOf(num);
            if (categoryParameters != null) {
                io.reactivex.rxjava3.internal.observers.m mVar = this.f237386P;
                if (mVar != null) {
                    DisposableHelper.a(mVar);
                }
                Map<String, String> mapConvertToFieldMap = this.f237381K.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots());
                AddressParameter addressParameter = (AddressParameter) categoryParameters.getFirstParameterOfType(AddressParameter.class);
                io.reactivex.rxjava3.internal.operators.single.O oR2 = this.f237379E.J((addressParameter == null || (value = addressParameter.getValue()) == null) ? null : value.getJsonWebToken(), mapConvertToFieldMap, str, strValueOf).r(r.f239038b);
                InterfaceC35745a5 interfaceC35745a5 = this.f237380J;
                this.f237386P = (io.reactivex.rxjava3.internal.observers.m) oR2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new C33984s(editableParameter, this), C34140t.f245493b);
            }
        }
    }

    @Override // com.avito.android.publish.InterfaceC33878l
    public final void n6() {
        final c cVar = this.f237383M;
        if (cVar.f237391c != null) {
            return;
        }
        io.reactivex.rxjava3.internal.observers.m mVar = cVar.f237392d;
        if (mVar == null || mVar.getF318621e()) {
            io.reactivex.rxjava3.internal.operators.single.O oR2 = new C42007e(new l41.s() { // from class: com.avito.android.publish.n
                @Override // l41.s
                public final Object get() {
                    return cVar.f237389a.E();
                }
            }).r(C33884o.f237465b);
            InterfaceC35745a5 interfaceC35745a5 = cVar.f237390b;
            cVar.f237392d = (io.reactivex.rxjava3.internal.observers.m) oR2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new C33978p(cVar), C33981q.f239036b);
        }
    }
}
