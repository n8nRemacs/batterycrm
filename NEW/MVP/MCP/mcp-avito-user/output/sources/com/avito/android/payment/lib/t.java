package com.avito.android.payment.lib;

import A60.b;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.autoteka.deeplinks.AutotekaWaitingForPaymentLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.payment.ModalState;
import com.avito.android.payment.lib.G;
import com.avito.android.payment.lib.PaymentSessionType;
import com.avito.android.remote.model.SimpleUserDialog;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.payment.PaymentMethod;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.avito.android.remote.model.payment.service.OrderItem;
import com.avito.android.remote.model.payment.service.PaymentSessionResult;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.A4;
import com.avito.android.util.C35989z3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import io.reactivex.rxjava3.internal.operators.observable.P1;
import io.reactivex.rxjava3.internal.operators.observable.Q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kv.C43501a;
import l41.InterfaceC43543a;
import ru.avito.component.payments.method.PaymentLabel;
import u60.InterfaceC48808a;

/* compiled from: PaymentMethodsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/t;", "Landroidx/lifecycle/M0;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f214695E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.lib.D f214696J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.e f214697K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C33020e f214698L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.processing.y f214699M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final PaymentSessionType f214700N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f214701O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f214702P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f214703Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f214704R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214705S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<G> f214706T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f214707U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f214708V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f214709W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f214710X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f214711Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<PaymentResult> f214712Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<ModalState> f214713a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f214714b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<PaymentSessionResult> f214715c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214716d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214717e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f214718f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Integer> f214719g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f214720h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f214721i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f214722j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f214723k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<A60.b> f214724l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<C33016a> f214725m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f214726n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214727o0;

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Q;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Q;", "com/avito/android/util/rx3/p0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final C<T1, T2, R> f214730b = new C<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q(obj, obj2);
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T1", "T2", "T3", "t1", "t2", "t3", "Lkotlin/l0;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/l0;", "com/avito/android/util/rx3/q0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class D<T1, T2, T3, R> implements l41.h {

        /* renamed from: a, reason: collision with root package name */
        public static final D<T1, T2, T3, R> f214731a = new D<>();

        @Override // l41.h
        public final Object a(Object obj, Object obj2, Object obj3) {
            return new C42829l0(obj, obj2, obj3);
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Q;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Q;", "com/avito/android/util/rx3/p0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class E<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final E<T1, T2, R> f214732b = new E<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q(obj, obj2);
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.f214713a0.setValue(ModalState.SBOLAppLaunchError.f213979b);
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f214740b = new h<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413260a.f134520a instanceof AutotekaWaitingForPaymentLink;
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lkv/a;", "LA60/b;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            A60.b bVar = (A60.b) ((Q) obj).f406620c;
            t tVar = t.this;
            tVar.getClass();
            if (bVar instanceof b.c) {
                tVar.f214712Z.setValue(t.me(((b.c) bVar).f106a));
            }
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "it", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final k<T, R> f214743b = new k<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((PaymentSessionResult) obj).getPaymentMethods();
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062&\u0010\u0005\u001a\"\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "", "kotlin.jvm.PlatformType", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {
        public l() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Boolean isButtonDisabled;
            Q q12 = (Q) obj;
            Integer num = (Integer) q12.f406619b;
            List list = (List) q12.f406620c;
            int iIntValue = num.intValue();
            t tVar = t.this;
            tVar.getClass();
            List list2 = list;
            PaymentMethod paymentMethod = (PaymentMethod) C42745f0.H(list2).get(iIntValue);
            C23038g0<G> c23038g0 = tVar.f214706T;
            String signature = paymentMethod.getSignature();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayListB = C42745f0.B((List) it.next(), PaymentMethod.SelectableMethod.class);
                String label = arrayListB.isEmpty() ? null : ((PaymentMethod.SelectableMethod) C42745f0.E(arrayListB)).getLabel();
                if (C42745f0.r(C42745f0.U(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_MASTERCARD, PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_VISA, PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_MIR, PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CREDIT), label)) {
                    label = PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD;
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListB, 10));
                Iterator it2 = arrayListB.iterator();
                while (it2.hasNext()) {
                    PaymentMethod.SelectableMethod selectableMethod = (PaymentMethod.SelectableMethod) it2.next();
                    String str = "PaymentMethod " + selectableMethod.getSignature();
                    String title = selectableMethod.getTitle();
                    DeepLink deepLink = selectableMethod.getDeepLink();
                    String description = selectableMethod.getDescription();
                    String str2 = description == null ? "" : description;
                    String label2 = selectableMethod.getLabel();
                    PaymentLabel paymentLabelA = label2 != null ? com.avito.android.payment.lib.C.a(label2) : label != null ? com.avito.android.payment.lib.C.a(label) : PaymentLabel.f430381p;
                    selectableMethod.getSignature();
                    boolean zF2 = L.f(selectableMethod.getSignature(), signature);
                    String information = selectableMethod.getInformation();
                    arrayList2.add(new O81.b(str, title, deepLink, str2, paymentLabelA, zF2, information == null ? "" : information, selectableMethod.getErrorMessage()));
                    it = it;
                }
                C42745f0.h(arrayList2, arrayList);
            }
            c23038g0.setValue(new G.c(arrayList));
            tVar.f214719g0.setValue(num);
            C23038g0<Boolean> c23038g02 = tVar.f214720h0;
            PaymentMethod.SelectableMethod selectableMethod2 = paymentMethod instanceof PaymentMethod.SelectableMethod ? (PaymentMethod.SelectableMethod) paymentMethod : null;
            c23038g02.setValue((selectableMethod2 == null || (isButtonDisabled = selectableMethod2.getIsButtonDisabled()) == null) ? Boolean.TRUE : Boolean.valueOf(!isButtonDisabled.booleanValue()));
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\n\u001a\u00020\u000123\u0010\u0007\u001a/\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00060\u00060\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/l0;", "Lkotlin/G0;", "kotlin.jvm.PlatformType", "", "Lcom/avito/android/remote/model/payment/PaymentMethod$SelectableMethod;", "Lkotlin/internal/i;", "", "<name for destructuring parameter 0>", "accept", "(Lkotlin/l0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o<T> implements l41.g {
        public o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            C42829l0 c42829l0 = (C42829l0) obj;
            List list = (List) c42829l0.f406872c;
            int iIntValue = ((Integer) c42829l0.f406873d).intValue();
            t tVar = t.this;
            tVar.getClass();
            tVar.f214710X.setValue(((PaymentMethod.SelectableMethod) list.get(iIntValue)).getDeepLink());
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q<T> implements l41.g {
        public q() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.le(true);
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Q;", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Q;", "com/avito/android/util/rx3/p0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.lib.t$t, reason: collision with other inner class name */
    public static final class C6438t<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final C6438t<T1, T2, R> f214752b = new C6438t<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return new Q(obj, obj2);
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "it", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class u<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final u<T, R> f214753b = new u<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return C42745f0.H(((PaymentSessionResult) obj).getPaymentMethods());
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/status/PaymentStatusResult;", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f214755c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f214756d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f214757e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f214758f;

        public v(String str, int i12, String str2, String str3) {
            this.f214755c = str;
            this.f214756d = i12;
            this.f214757e = str2;
            this.f214758f = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            int i12;
            P2 p22 = (P2) ((Q) obj).f406619b;
            t tVar = t.this;
            tVar.getClass();
            boolean z12 = p22 instanceof P2.b;
            C23038g0<Boolean> c23038g0 = tVar.f214722j0;
            if (!z12) {
                if (!(p22 instanceof P2.a)) {
                    L.f(p22, P2.c.f318721a);
                    return;
                } else {
                    tVar.f214706T.setValue(new G.a(com.avito.android.error.z.k(((P2.a) p22).f318719a)));
                    c23038g0.setValue(Boolean.FALSE);
                    return;
                }
            }
            PaymentStatusResult paymentStatusResult = (PaymentStatusResult) ((P2.b) p22).f318720a;
            boolean z13 = paymentStatusResult instanceof PaymentStatusResult.PaymentStatus;
            String str = this.f214758f;
            com.avito.android.util.architecture_components.D<DeepLink> d12 = tVar.f214710X;
            com.avito.android.util.architecture_components.D<String> d13 = tVar.f214711Y;
            com.avito.android.deep_linking.x xVar = tVar.f214702P;
            if (!z13) {
                if (paymentStatusResult instanceof PaymentStatusResult.ForbiddenPayment) {
                    DeepLink deepLinkB = xVar.b(str);
                    if (deepLinkB instanceof NoMatchLink) {
                        d13.setValue(str);
                    } else {
                        d12.setValue(deepLinkB);
                    }
                    c23038g0.setValue(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (L.f(((PaymentStatusResult.PaymentStatus) paymentStatusResult).getState(), "active") && (i12 = this.f214756d) < 3) {
                tVar.ke(i12 + 1, this.f214755c, this.f214757e, str);
                return;
            }
            DeepLink deepLinkB2 = xVar.b(str);
            if (deepLinkB2 instanceof NoMatchLink) {
                d13.setValue(str);
            } else {
                d12.setValue(deepLinkB2);
            }
            c23038g0.setValue(Boolean.FALSE);
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "nativeMethods", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "apply", "(Ljava/util/Set;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x<T, R> implements l41.o {
        public x() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            io.reactivex.rxjava3.core.z<TypedResult<PaymentSessionResult>> zVarG;
            t tVar = t.this;
            com.avito.android.payment.lib.D d12 = tVar.f214696J;
            d12.getClass();
            A4.f318516a.getClass();
            HashMap mapG = A4.g("nativeMethods", (Set) obj);
            PaymentSessionType paymentSessionType = tVar.f214700N;
            boolean z12 = paymentSessionType instanceof PaymentSessionType.Wallet;
            InterfaceC48808a interfaceC48808a = d12.f214529a;
            if (z12) {
                zVarG = interfaceC48808a.c(C35989z3.a(((PaymentSessionType.Wallet) paymentSessionType).f214562c), mapG);
            } else if (paymentSessionType instanceof PaymentSessionType.CPA) {
                zVarG = interfaceC48808a.f(((PaymentSessionType.CPA) paymentSessionType).f214556c, mapG);
            } else {
                if (!(paymentSessionType instanceof PaymentSessionType.Services)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentSessionType.Services services = (PaymentSessionType.Services) paymentSessionType;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i12 = 0;
                for (T t12 : services.f214557c) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    OrderItem orderItem = (OrderItem) t12;
                    linkedHashMap.put(androidx.camera.camera2.internal.G.e(i12, "orderItems[", "][serviceSlug]"), orderItem.getServiceSlug());
                    linkedHashMap.put("orderItems[" + i12 + "][externalId]", orderItem.getExternalId());
                    i12 = i13;
                }
                zVarG = interfaceC48808a.g(linkedHashMap, services.f214558d, mapG, services.f214559e);
            }
            return zVarG.x0(tVar.f214695E.a());
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final y<T, R> f214761b = new y<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaymentMethodsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class z<T, R> implements l41.o {
        public z() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(t.this.f214701O.a((Throwable) obj));
        }
    }

    public t(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.payment.lib.D d12, @Y61.k com.avito.android.payment.e eVar, @Y61.k C33020e c33020e, @Y61.k com.avito.android.payment.processing.y yVar, @Y61.k PaymentSessionType paymentSessionType, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, boolean z12) {
        this.f214695E = interfaceC35745a5;
        this.f214696J = d12;
        this.f214697K = eVar;
        this.f214698L = c33020e;
        this.f214699M = yVar;
        this.f214700N = paymentSessionType;
        this.f214701O = fVar;
        this.f214702P = xVar;
        this.f214703Q = aVar;
        this.f214704R = z12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f214705S = cVar;
        C23038g0<G> c23038g0 = new C23038g0<>();
        this.f214706T = c23038g0;
        this.f214707U = c23038g0;
        C23038g0<String> c23038g02 = new C23038g0<>();
        this.f214708V = c23038g02;
        this.f214709W = c23038g02;
        this.f214710X = new com.avito.android.util.architecture_components.D<>();
        this.f214711Y = new com.avito.android.util.architecture_components.D<>();
        this.f214712Z = new com.avito.android.util.architecture_components.D<>();
        C23038g0<ModalState> c23038g03 = new C23038g0<>();
        this.f214713a0 = c23038g03;
        c23038g03.setValue(ModalState.a.f213981b);
        this.f214714b0 = c23038g03;
        com.jakewharton.rxrelay3.b<PaymentSessionResult> bVar = new com.jakewharton.rxrelay3.b<>();
        this.f214715c0 = bVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f214716d0 = cVar2;
        com.jakewharton.rxrelay3.c<G0> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f214717e0 = cVar3;
        com.jakewharton.rxrelay3.c<Integer> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f214718f0 = cVar4;
        this.f214719g0 = new C23038g0<>();
        C23038g0<Boolean> c23038g04 = new C23038g0<>();
        this.f214720h0 = c23038g04;
        this.f214721i0 = c23038g04;
        C23038g0<Boolean> c23038g05 = new C23038g0<>();
        this.f214722j0 = c23038g05;
        this.f214723k0 = c23038g05;
        com.jakewharton.rxrelay3.c<A60.b> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f214724l0 = cVar5;
        com.jakewharton.rxrelay3.c<C33016a> cVar6 = new com.jakewharton.rxrelay3.c<>();
        this.f214725m0 = cVar6;
        com.jakewharton.rxrelay3.c<Boolean> cVar7 = new com.jakewharton.rxrelay3.c<>();
        this.f214726n0 = cVar7;
        com.jakewharton.rxrelay3.c<G0> cVar8 = new com.jakewharton.rxrelay3.c<>();
        this.f214727o0 = cVar8;
        P1 p1I0 = cVar4.I0(bVar.d0(k.f214743b), C.f214730b);
        l lVar = new l();
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar = new l41.g() { // from class: com.avito.android.payment.lib.t.m
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(p1I0.v0(lVar, gVar, interfaceC43543a));
        B0 b0D0 = bVar.d0(new l41.o() { // from class: com.avito.android.payment.lib.t.n
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43033p.D(C43033p.i(C43033p.r(new C42770s0(((PaymentSessionResult) obj).getPaymentMethods())), com.avito.android.payment.lib.B.f214528l));
            }
        });
        l41.h hVar = D.f214731a;
        Objects.requireNonNull(hVar, "combiner is null");
        cVar.b(new Q1(cVar2, new io.reactivex.rxjava3.core.E[]{b0D0, cVar4}, io.reactivex.rxjava3.internal.functions.a.n(hVar)).v0(new o(), new l41.g() { // from class: com.avito.android.payment.lib.t.p
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(cVar3.v0(new q(), new l41.g() { // from class: com.avito.android.payment.lib.t.r
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(cVar5.j0(interfaceC35745a5.e()).v0(new l41.g() { // from class: com.avito.android.payment.lib.t.s
            @Override // l41.g
            public final void accept(Object obj) {
                A60.b bVar2 = (A60.b) obj;
                t tVar = t.this;
                tVar.getClass();
                if (bVar2 instanceof b.d) {
                    String str = ((b.d) bVar2).f107a;
                    DeepLink deepLinkB = tVar.f214702P.b(str);
                    if (deepLinkB instanceof NoMatchLink) {
                        tVar.f214711Y.setValue(str);
                        return;
                    } else {
                        tVar.f214710X.setValue(deepLinkB);
                        return;
                    }
                }
                boolean z13 = bVar2 instanceof b.c;
                C23038g0<ModalState> c23038g06 = tVar.f214713a0;
                if (!z13) {
                    if (bVar2 instanceof b.C0008b) {
                        c23038g06.setValue(new ModalState.b(((b.C0008b) bVar2).f105a, null, 2, null));
                        return;
                    } else {
                        boolean z14 = bVar2 instanceof b.a;
                        return;
                    }
                }
                PaymentStatusResult.PaymentStatus paymentStatus = ((b.c) bVar2).f106a;
                if (paymentStatus.getRedirectDeeplink() != null && paymentStatus.getUserDialog() == null) {
                    DeepLink redirectDeeplink = paymentStatus.getRedirectDeeplink();
                    if (redirectDeeplink != null) {
                        b.a.a(tVar.f214703Q, redirectDeeplink, null, null, 6);
                        return;
                    }
                    return;
                }
                if (paymentStatus.getUserDialog() == null) {
                    c23038g06.setValue(ModalState.a.f213981b);
                    tVar.f214712Z.setValue(t.me(paymentStatus));
                } else {
                    SimpleUserDialog userDialog = paymentStatus.getUserDialog();
                    if (userDialog != null) {
                        c23038g06.setValue(new ModalState.NotifyingDialog(userDialog, !L.f(paymentStatus.getState(), PaymentStateKt.PAYMENT_STATE_FAILED), paymentStatus));
                    }
                }
            }
        }, new l41.g() { // from class: com.avito.android.payment.lib.t.a
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(cVar7.v0(new l41.g() { // from class: com.avito.android.payment.lib.t.b
            @Override // l41.g
            public final void accept(Object obj) {
                t.this.f214713a0.setValue(new ModalState.SBOLResultDialog(((Boolean) obj).booleanValue()));
            }
        }, new l41.g() { // from class: com.avito.android.payment.lib.t.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(cVar6.v0(new l41.g() { // from class: com.avito.android.payment.lib.t.d
            @Override // l41.g
            public final void accept(Object obj) {
                C33016a c33016a = (C33016a) obj;
                t tVar = t.this;
                tVar.f214713a0.setValue(ModalState.a.f213981b);
                if (c33016a.f214564b || !tVar.f214704R) {
                    PaymentStatusResult.PaymentStatus paymentStatus = c33016a.f214563a;
                    tVar.f214712Z.setValue(paymentStatus != null ? t.me(paymentStatus) : PaymentResult.f214549c);
                }
            }
        }, new l41.g() { // from class: com.avito.android.payment.lib.t.e
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(cVar8.v0(new f(), new l41.g() { // from class: com.avito.android.payment.lib.t.g
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        cVar.b(aVar.d9().N(h.f214740b).I0(cVar5, E.f214732b).v0(new i(), new l41.g() { // from class: com.avito.android.payment.lib.t.j
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
    }

    public static PaymentResult me(PaymentStatusResult.PaymentStatus paymentStatus) {
        String state = paymentStatus.getState();
        return L.f(state, "active") ? PaymentResult.f214549c : L.f(state, PaymentStateKt.PAYMENT_STATE_DONE) ? PaymentResult.f214550d : PaymentResult.f214551e;
    }

    public final void ke(int i12, String str, String str2, String str3) {
        io.reactivex.rxjava3.core.z<P2<PaymentStatusResult>> zVarA = this.f214699M.a(str2);
        long jC2 = kotlin.math.b.c((float) Math.pow(2.0f, i12));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f214695E;
        P1 p1I0 = zVarA.z(jC2, timeUnit, interfaceC35745a5.c()).x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).I0(this.f214715c0.d0(u.f214753b), C6438t.f214752b);
        v vVar = new v(str, i12, str2, str3);
        final V2 v22 = V2.f318762a;
        this.f214705S.b(p1I0.v0(vVar, new l41.g() { // from class: com.avito.android.payment.lib.t.w
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void le(boolean z12) {
        G value = this.f214706T.getValue();
        G.c cVar = value instanceof G.c ? (G.c) value : null;
        ArrayList arrayList = cVar != null ? cVar.f214532a : null;
        if (z12 || !O2.a(arrayList)) {
            L0 l0M0 = this.f214697K.a().T(new x(), Integer.MAX_VALUE).d0(y.f214761b).r0(P2.c.f318721a).m0(new z());
            InterfaceC35745a5 interfaceC35745a5 = this.f214695E;
            I0 i0J0 = l0M0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
            l41.g gVar = new l41.g() { // from class: com.avito.android.payment.lib.t.A
                /* JADX WARN: Multi-variable type inference failed */
                @Override // l41.g
                public final void accept(Object obj) {
                    P2 p22 = (P2) obj;
                    t tVar = t.this;
                    tVar.getClass();
                    if (p22 instanceof P2.b) {
                        T t12 = ((P2.b) p22).f318720a;
                        tVar.f214715c0.accept(t12);
                        tVar.f214718f0.accept(0);
                        tVar.f214708V.setValue(((PaymentSessionResult) t12).getSubmitText());
                        return;
                    }
                    boolean z13 = p22 instanceof P2.c;
                    C23038g0<G> c23038g0 = tVar.f214706T;
                    if (z13) {
                        c23038g0.setValue(G.b.f214531a);
                    } else if (p22 instanceof P2.a) {
                        c23038g0.setValue(new G.a(((P2.a) p22).f318719a.getF244063c()));
                    }
                }
            };
            final V2 v22 = V2.f318762a;
            this.f214705S.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.payment.lib.t.B
                @Override // l41.g
                public final void accept(Object obj) {
                    v22.f((Throwable) obj);
                }
            }, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f214705S.e();
    }
}
