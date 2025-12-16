package com.avito.android.advert.item.consultation.view_model;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.F;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.o;
import ow.InterfaceC44946a;

/* compiled from: ConsultationDataViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/view_model/e;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/advert/item/consultation/view_model/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends M0 implements com.avito.android.advert.item.consultation.view_model.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f74839E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44946a> f74840J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C23038g0<P2<ContactInfoResponse>> f74841K = new C23038g0<>();

    /* renamed from: L, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f74842L = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ConsultationDataViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f74843b = new a<>();

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

    /* compiled from: ConsultationDataViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/developments_advice/remote/model/ContactInfoResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.this.f74841K.setValue((P2) obj);
        }
    }

    /* compiled from: ConsultationDataViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C23038g0<P2<ContactInfoResponse>> c23038g0 = e.this.f74841K;
            String message = ((Throwable) obj).getMessage();
            if (message == null) {
                message = "";
            }
            c23038g0.setValue(new P2.a(new ApiError.Failure(message)));
        }
    }

    public e(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e<InterfaceC44946a> eVar) {
        this.f74839E = interfaceC35745a5;
        this.f74840J = eVar;
    }

    @Override // com.avito.android.advert.item.consultation.view_model.a
    @k
    public final C23038g0<P2<ContactInfoResponse>> j5() {
        return this.f74841K;
    }

    @Override // com.avito.android.advert.item.consultation.view_model.a
    public final void o(boolean z12) {
        F f12 = new F(new d(0, this, z12));
        InterfaceC35745a5 interfaceC35745a5 = this.f74839E;
        this.f74842L.b(f12.x0(interfaceC35745a5.a()).d0(a.f74843b).r0(P2.c.f318721a).j0(interfaceC35745a5.e()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f74842L.e();
        super.onCleared();
    }
}
