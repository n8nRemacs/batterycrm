package com.avito.android.beduin.ui.screen.fragment;

import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.beduin.ui.screen.fragment.i;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import qi.InterfaceC47401b;

/* compiled from: ScreenViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/k;", "Lqi/b;", "Model", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "State", "Landroidx/lifecycle/M0;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class k<Model extends InterfaceC47401b, State extends i> extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final l f104251E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final j<Model, State> f104252J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C23038g0<State> f104253K = new C23038g0<>();

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final D<ApiError> f104254L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final D f104255M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f104256N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D f104257O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final AbstractC22991Y<com.avito.android.beduin.common.local_deeplink.a> f104258P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f104259Q;

    /* compiled from: ScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqi/b;", "Model", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "State", "it", "apply", "(Lqi/b;)Lqi/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f104260b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return (InterfaceC47401b) obj;
        }
    }

    /* compiled from: ScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqi/b;", "Model", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "State", "it", "Lkotlin/G0;", "accept", "(Lqi/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k<Model, State> f104261b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k<? extends Model, State> kVar) {
            this.f104261b = kVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f104261b.f104251E.f104269d.getF103564j().c(((InterfaceC47401b) obj).getId());
        }
    }

    /* compiled from: ScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqi/b;", "Model", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "State", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/ui/screen/fragment/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k<Model, State> f104263b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(k<? extends Model, State> kVar) {
            this.f104263b = kVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f104263b.f104253K.setValue((i) obj);
        }
    }

    /* compiled from: ScreenViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            k kVar = (k) this.receiver;
            kVar.f104256N.postValue(Boolean.TRUE);
            return G0.f406611a;
        }
    }

    /* compiled from: ScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqi/b;", "Model", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "State", "Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin_shared/model/action/BeduinActionsResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<BeduinActionsResponse, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<Model, State> f104265l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(k<? extends Model, State> kVar) {
            super(1);
            this.f104265l = kVar;
        }

        @Override // Y41.l
        public final G0 invoke(BeduinActionsResponse beduinActionsResponse) {
            this.f104265l.f104256N.postValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: ScreenViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<ApiError, G0> {
        @Override // Y41.l
        public final G0 invoke(ApiError apiError) {
            k kVar = (k) this.receiver;
            kVar.f104254L.postValue(apiError);
            kVar.f104256N.postValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.k l lVar, @Y61.k final j<? super Model, ? extends State> jVar, @Y61.k BeduinScreenOpenParams beduinScreenOpenParams) {
        this.f104251E = lVar;
        this.f104252J = jVar;
        D<ApiError> d12 = new D<>();
        this.f104254L = d12;
        this.f104255M = d12;
        D<Boolean> d13 = new D<>();
        this.f104256N = d13;
        this.f104257O = d13;
        this.f104258P = lVar.f104267b.getF103429a();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f104259Q = cVar;
        O oR2 = lVar.f104266a.a(beduinScreenOpenParams.f104142b).r(a.f104260b).s(lVar.f104268c.e()).k(new b(this)).r(new l41.o() { // from class: com.avito.android.beduin.ui.screen.fragment.k.c
            @Override // l41.o
            public final Object apply(Object obj) {
                return jVar.a((InterfaceC47401b) obj);
            }
        });
        d dVar = new d(this);
        final V2 v22 = V2.f318762a;
        cVar.b(oR2.x(dVar, new l41.g() { // from class: com.avito.android.beduin.ui.screen.fragment.k.e
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }));
        cVar.b(com.avito.android.beduin.common.l.a(lVar.f104269d.q(), new f(0, this, k.class, "onExecutingRequest", "onExecutingRequest()V", 0), new g(this), new h(1, this, k.class, "onExecuteRequestError", "onExecuteRequestError(Lcom/avito/android/remote/error/ApiError;)V", 0)));
    }

    public final void ke(@Y61.l List<? extends BeduinAction> list) {
        com.avito.android.beduin_shared.model.utils.a.a(this.f104251E.f104269d, list);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f104259Q.dispose();
        this.f104251E.f104269d.onCleared();
    }
}
