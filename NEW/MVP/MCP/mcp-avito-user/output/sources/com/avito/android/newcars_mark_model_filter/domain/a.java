package com.avito.android.newcars_mark_model_filter.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.newcars_mark_model_filter.presentation.mvi.entity.NewCarsBrandModelFilterInternalAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35936s;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import s30.InterfaceC47990a;
import t30.C48495a;
import u30.C48782a;
import u30.C48783b;
import u30.C48784c;
import u30.C48785d;
import v30.C49155a;
import v30.C49156b;
import v30.C49157c;

/* compiled from: NewCarsBrandModelFilterInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/domain/a;", "", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47990a f207255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f207256b;

    /* compiled from: NewCarsBrandModelFilterInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.domain.NewCarsBrandModelFilterInteractor$applyBrandsModels$1", f = "NewCarsBrandModelFilterInteractor.kt", i = {0}, l = {50, 53, 56}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.newcars_mark_model_filter.domain.a$a, reason: collision with other inner class name */
    public static final class C6181a extends SuspendLambda implements p<InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207257q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207258r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Long> f207260t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List<Long> f207261u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6181a(List<Long> list, List<Long> list2, Continuation<? super C6181a> continuation) {
            super(2, continuation);
            this.f207260t = list;
            this.f207261u = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6181a c6181a = a.this.new C6181a(this.f207260t, this.f207261u, continuation);
            c6181a.f207258r = obj;
            return c6181a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6181a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207257q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f207258r;
                InterfaceC47990a interfaceC47990a = a.this.f207255a;
                this.f207258r = interfaceC43172j;
                this.f207257q = 1;
                obj = interfaceC47990a.a(this.f207260t, this.f207261u, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f207258r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                NewCarsBrandModelFilterInternalAction.Apply apply = new NewCarsBrandModelFilterInternalAction.Apply(((C48495a) ((TypedResult.Success) typedResult).getResult()).getRedirectUri());
                this.f207258r = null;
                this.f207257q = 2;
                if (interfaceC43172j.emit(apply, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                NewCarsBrandModelFilterInternalAction.LoadError loadError = new NewCarsBrandModelFilterInternalAction.LoadError(C35936s.a(error.getError(), error.getCause()));
                this.f207258r = null;
                this.f207257q = 3;
                if (interfaceC43172j.emit(loadError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.domain.NewCarsBrandModelFilterInteractor$getBrandsFromApi$1", f = "NewCarsBrandModelFilterInteractor.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207262q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207263r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f207263r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207262q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f207263r;
                InterfaceC47990a interfaceC47990a = aVar.f207255a;
                this.f207263r = interfaceC43172j;
                this.f207262q = 1;
                objB = interfaceC47990a.b(this);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f207263r;
                C42729a0.b(obj);
                objB = obj;
            }
            TypedResult typedResult = (TypedResult) objB;
            if (typedResult instanceof TypedResult.Success) {
                List<C48783b> listA = ((C48782a) ((TypedResult.Success) typedResult).getResult()).a();
                aVar.getClass();
                List<C48783b> list = listA;
                int i13 = 10;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (C48783b c48783b : list) {
                    long id2 = c48783b.getId();
                    String label = c48783b.getLabel();
                    List<C48784c> listC = c48783b.c();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, i13));
                    for (C48784c c48784c : listC) {
                        long id3 = c48784c.getId();
                        String text = c48784c.getText();
                        C48785d icon = c48784c.getIcon();
                        Image value = icon != null ? icon.getValue() : null;
                        C48785d icon2 = c48784c.getIcon();
                        arrayList2.add(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.b(id3, text, false, new UniversalImage(value, icon2 != null ? icon2.getValueDark() : null)));
                    }
                    arrayList.add(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a(id2, label, arrayList2));
                    i13 = 10;
                }
                NewCarsBrandModelFilterInternalAction.BrandsLoaded brandsLoaded = new NewCarsBrandModelFilterInternalAction.BrandsLoaded(arrayList);
                this.f207263r = null;
                this.f207262q = 2;
                if (interfaceC43172j.emit(brandsLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                NewCarsBrandModelFilterInternalAction.LoadError loadError = new NewCarsBrandModelFilterInternalAction.LoadError(C35936s.a(error.getError(), error.getCause()));
                this.f207263r = null;
                this.f207262q = 3;
                if (interfaceC43172j.emit(loadError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NewCarsBrandModelFilterInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/newcars_mark_model_filter/presentation/mvi/entity/NewCarsBrandModelFilterInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.newcars_mark_model_filter.domain.NewCarsBrandModelFilterInteractor$getModelsFromApi$1", f = "NewCarsBrandModelFilterInteractor.kt", i = {0}, l = {36, 39, 44}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207265q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207266r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Long> f207268t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Long> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f207268t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f207268t, continuation);
            cVar.f207266r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super NewCarsBrandModelFilterInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207265q;
            List<Long> list = this.f207268t;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f207266r;
                InterfaceC47990a interfaceC47990a = aVar.f207255a;
                this.f207266r = interfaceC43172j;
                this.f207265q = 1;
                objC = interfaceC47990a.c(list, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f207266r;
                C42729a0.b(obj);
                objC = obj;
            }
            TypedResult typedResult = (TypedResult) objC;
            if (typedResult instanceof TypedResult.Success) {
                List<C49156b> listA = ((C49155a) ((TypedResult.Success) typedResult).getResult()).a();
                aVar.getClass();
                List<C49156b> list2 = listA;
                int i13 = 10;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C49156b c49156b = (C49156b) it.next();
                    long id2 = c49156b.getId();
                    String label = c49156b.getLabel();
                    List<C49157c> listC = c49156b.c();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, i13));
                    for (C49157c c49157c : listC) {
                        arrayList2.add(new com.avito.android.newcars_mark_model_filter.presentation.recycler.model.b(c49157c.getText(), false, c49157c.getId()));
                        it = it;
                    }
                    arrayList.add(new com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a(id2, label, arrayList2));
                    it = it;
                    i13 = 10;
                }
                NewCarsBrandModelFilterInternalAction.ModelsLoaded modelsLoaded = new NewCarsBrandModelFilterInternalAction.ModelsLoaded(arrayList, list);
                this.f207266r = null;
                this.f207265q = 2;
                if (interfaceC43172j.emit(modelsLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                NewCarsBrandModelFilterInternalAction.LoadError loadError = new NewCarsBrandModelFilterInternalAction.LoadError(C35936s.a(error.getError(), error.getCause()));
                this.f207266r = null;
                this.f207265q = 3;
                if (interfaceC43172j.emit(loadError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC47990a interfaceC47990a, @k R0 r02) {
        this.f207255a = interfaceC47990a;
        this.f207256b = r02;
    }

    @k
    public final InterfaceC43160i<NewCarsBrandModelFilterInternalAction> a(@l List<Long> list, @l List<Long> list2) {
        return C43175k.I(this.f207256b.a(), C43175k.G(new C6181a(list, list2, null)));
    }

    @k
    public final InterfaceC43160i<NewCarsBrandModelFilterInternalAction> b() {
        return C43175k.I(this.f207256b.a(), C43175k.G(new b(null)));
    }

    @k
    public final InterfaceC43160i<NewCarsBrandModelFilterInternalAction> c(@k List<Long> list) {
        return C43175k.I(this.f207256b.a(), C43175k.G(new c(list, null)));
    }
}
