package com.avito.android.advert.item.beduin;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.BeduinItems;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBeduinViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/beduin/l;", "Lcom/avito/android/advert/item/beduin/k;", "Landroidx/lifecycle/M0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends M0 implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.beduin.a f73239E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73240J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f73241K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final H f73242L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<BeduinModel>> f73243M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f73244N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f73245O;

    /* compiled from: AdvertDetailsBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/BeduinItems;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                l.this.f73243M.setValue(((BeduinItems) ((TypedResult.Success) typedResult).getResult()).getItems());
            } else if (typedResult instanceof TypedResult.Error) {
                V2.f318762a.c("AdvertDetailsBeduinViewModel", "Error loadBeduinItems " + ((TypedResult.Error) typedResult).getError().getF244063c(), null);
            }
        }
    }

    /* compiled from: AdvertDetailsBeduinViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f73247b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("AdvertDetailsBeduinViewModel", "Error loadBeduinItems", (Throwable) obj);
        }
    }

    public l(@Y61.k com.avito.android.advert.item.beduin.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k H h12) {
        this.f73239E = aVar;
        this.f73240J = interfaceC35745a5;
        this.f73241K = interfaceC40691b;
        this.f73242L = h12;
        C23038g0<List<BeduinModel>> c23038g0 = new C23038g0<>();
        this.f73243M = c23038g0;
        this.f73244N = c23038g0;
    }

    @Override // com.avito.android.advert.item.beduin.k
    public final void B(@Y61.k String str) {
        Collection collection = (Collection) this.f73244N.getValue();
        if (collection == null || collection.isEmpty()) {
            io.reactivex.rxjava3.internal.observers.m mVar = this.f73245O;
            if (mVar != null) {
                DisposableHelper.a(mVar);
            }
            this.f73245O = (io.reactivex.rxjava3.internal.observers.m) this.f73239E.B(str).s(this.f73240J.e()).x(new a(), b.f73247b);
        }
    }

    @Override // com.avito.android.advert.item.beduin.k
    @Y61.k
    /* renamed from: R2, reason: from getter */
    public final H getF73242L() {
        return this.f73242L;
    }

    @Override // com.avito.android.advert.item.beduin.k
    @Y61.k
    /* renamed from: V, reason: from getter */
    public final InterfaceC40691b getF73241K() {
        return this.f73241K;
    }

    @Override // com.avito.android.advert.item.beduin.k
    @Y61.k
    /* renamed from: cc, reason: from getter */
    public final C23038g0 getF73244N() {
        return this.f73244N;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f73242L.b(true);
        io.reactivex.rxjava3.internal.observers.m mVar = this.f73245O;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f73241K.onCleared();
    }
}
