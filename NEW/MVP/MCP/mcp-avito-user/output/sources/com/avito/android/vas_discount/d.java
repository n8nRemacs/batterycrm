package com.avito.android.vas_discount;

import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: DiscountActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/d;", "Lcom/avito/android/vas_discount/a;", "Landroidx/lifecycle/M0;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends M0 implements com.avito.android.vas_discount.a {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f319619E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final D<P2<DiscountResponse>> f319620J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final D<P2<DiscountResponse>> f319621K;

    /* compiled from: DiscountActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/vas_discount/remote/model/DiscountResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.f319620J.postValue((P2) obj);
        }
    }

    /* compiled from: DiscountActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f319623b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public d(@Y61.l @com.avito.android.vas_discount.di.c String str, @Y61.k com.avito.android.vas_discount.business.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f319619E = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        D<P2<DiscountResponse>> d12 = new D<>();
        this.f319620J = d12;
        this.f319621K = d12;
        this.f319619E = (AtomicReference) aVar.a(str).j0(interfaceC35745a5.e()).v0(new a(), b.f319623b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.vas_discount.a
    @Y61.k
    public final D<P2<DiscountResponse>> K() {
        return this.f319621K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f319619E.dispose();
    }
}
