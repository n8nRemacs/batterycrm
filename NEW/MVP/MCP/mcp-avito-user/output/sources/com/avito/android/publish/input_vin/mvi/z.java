package com.avito.android.publish.input_vin.mvi;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.di.W;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import me0.C44072a;
import ne0.InterfaceC44385b;

/* compiled from: LoadCategoryParametersByVinUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/z;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PublishParametersInteractor f236731a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f236732b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C44072a f236733c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f236734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f236735e;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.LoadCategoryParametersByVinUseCase$execute$$inlined$flatMapLatest$1", f = "LoadCategoryParametersByVinUseCase.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC44385b>, AbstractC35806h3<? super CategoryParameters>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f236736q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f236737r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f236738s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ z f236739t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f236740u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, z zVar, String str) {
            super(3, continuation);
            this.f236739t = zVar;
            this.f236740u = str;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super InterfaceC44385b> interfaceC43172j, AbstractC35806h3<? super CategoryParameters> abstractC35806h3, Continuation<? super G0> continuation) {
            a aVar = new a(continuation, this.f236739t, this.f236740u);
            aVar.f236737r = interfaceC43172j;
            aVar.f236738s = abstractC35806h3;
            return aVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NotFoundException {
            InterfaceC43160i interfaceC43160iW;
            CategoryParameters categoryParametersCloneWithNewParameters;
            PublishState.StepState imei;
            PublishState.StepState imei2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f236736q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f236737r;
                AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) this.f236738s;
                boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.a;
                String str = this.f236740u;
                z zVar = this.f236739t;
                if (z12) {
                    ApiError apiError = ((AbstractC35806h3.a) abstractC35806h3).f318890a;
                    zVar.getClass();
                    if (apiError instanceof ApiError.NetworkIOError) {
                        interfaceC43160iW = new C43210w(new InterfaceC44385b.f(zVar.f236733c.f414655c));
                    } else {
                        PublishState publishState = zVar.f236734d.f231861Y;
                        Map<Integer, PublishState.StepState> mapK = publishState.k();
                        int i13 = zVar.f236735e;
                        Parcelable parcelable = (PublishState.StepState) mapK.get(Integer.valueOf(i13));
                        if (!(parcelable instanceof PublishState.StepState.Vin)) {
                            n0 n0Var = m0.f406844a;
                            kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.Vin.class);
                            if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                                imei2 = new PublishState.StepState.Wizard(null, null, null, 7, null);
                            } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                                imei2 = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                            } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                                imei2 = new PublishState.StepState.Vin(null, 1, null);
                            } else {
                                if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                                    throw new NotFoundException(n0Var.b(PublishState.StepState.Vin.class).toString(), (Throwable) null, 2, (C42822w) null);
                                }
                                imei2 = new PublishState.StepState.Imei(null, 1, null);
                            }
                            publishState.k().put(Integer.valueOf(i13), imei2);
                            parcelable = (PublishState.StepState.Vin) imei2;
                        }
                        ((PublishState.StepState.Vin) parcelable).g(str);
                        interfaceC43160iW = new C43210w(InterfaceC44385b.h.a.f415237a);
                    }
                } else if ((abstractC35806h3 instanceof AbstractC35806h3.b) || L.f(abstractC35806h3, AbstractC35806h3.c.f318892a)) {
                    interfaceC43160iW = C43175k.w();
                } else if (abstractC35806h3 instanceof AbstractC35806h3.d) {
                    CategoryParameters categoryParameters = (CategoryParameters) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
                    C0 c02 = zVar.f236734d;
                    PublishState publishState2 = c02.f231861Y;
                    Map<Integer, PublishState.StepState> mapK2 = publishState2.k();
                    int i14 = zVar.f236735e;
                    Parcelable parcelable2 = (PublishState.StepState) mapK2.get(Integer.valueOf(i14));
                    if (!(parcelable2 instanceof PublishState.StepState.Vin)) {
                        n0 n0Var2 = m0.f406844a;
                        kotlin.reflect.d dVarB2 = n0Var2.b(PublishState.StepState.Vin.class);
                        if (dVarB2.equals(n0Var2.b(PublishState.StepState.Wizard.class))) {
                            imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
                        } else if (dVarB2.equals(n0Var2.b(PublishState.StepState.CategoriesSuggestions.class))) {
                            imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                        } else if (dVarB2.equals(n0Var2.b(PublishState.StepState.Vin.class))) {
                            imei = new PublishState.StepState.Vin(null, 1, null);
                        } else {
                            if (!dVarB2.equals(n0Var2.b(PublishState.StepState.Imei.class))) {
                                throw new NotFoundException(n0Var2.b(PublishState.StepState.Vin.class).toString(), (Throwable) null, 2, (C42822w) null);
                            }
                            imei = new PublishState.StepState.Imei(null, 1, null);
                        }
                        publishState2.k().put(Integer.valueOf(i14), imei);
                        parcelable2 = (PublishState.StepState.Vin) imei;
                    }
                    ((PublishState.StepState.Vin) parcelable2).g(str);
                    CategoryParameters categoryParameters2 = c02.f231873k0;
                    if (categoryParameters2 != null && (categoryParametersCloneWithNewParameters = categoryParameters2.cloneWithNewParameters(categoryParameters.getParameters(), categoryParameters.getChangedIds())) != null) {
                        c02.Ke(categoryParametersCloneWithNewParameters);
                    }
                    interfaceC43160iW = new C43210w(InterfaceC44385b.h.C11867b.f415238a);
                } else if (L.f(abstractC35806h3, AbstractC35806h3.e.f318894a)) {
                    interfaceC43160iW = new C43210w(InterfaceC44385b.h.c.f415239a);
                } else {
                    if (!L.f(abstractC35806h3, AbstractC35806h3.f.f318895a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC43160iW = C43175k.w();
                }
                this.f236736q = 1;
                if (C43175k.u(this, interfaceC43160iW, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LoadCategoryParametersByVinUseCase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.input_vin.mvi.LoadCategoryParametersByVinUseCase$execute$1", f = "LoadCategoryParametersByVinUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AbstractC35806h3<? super CategoryParameters>>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f236741q;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AbstractC35806h3<? super CategoryParameters>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f236741q = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("Failed to loadAutoParamsByVin", this.f236741q);
            return G0.f406611a;
        }
    }

    @Inject
    public z(@Y61.k PublishParametersInteractor publishParametersInteractor, @Y61.k R0 r02, @Y61.k C44072a c44072a, @Y61.k C0 c02, @W int i12) {
        this.f236731a = publishParametersInteractor;
        this.f236732b = r02;
        this.f236733c = c44072a;
        this.f236734d = c02;
        this.f236735e = i12;
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC44385b> a(@Y61.k String str) {
        C0 c02 = this.f236734d;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null) {
            return C43175k.w();
        }
        return C43175k.Y(new C43152f0(C43175k.I(this.f236732b.a(), kotlinx.coroutines.rx3.y.a(this.f236731a.k(c02.f231861Y.getNavigation(), categoryParameters, str))), new b(3, null)), new a(null, this, str));
    }
}
