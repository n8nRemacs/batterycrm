package com.avito.android.categories_global;

import Hn.InterfaceC14010a;
import Ln.C14417b;
import com.avito.android.categories_global.domain.CategoriesModel;
import com.avito.android.categories_global.mvi.entity.CategoriesInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import java.util.List;
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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoriesInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/categories_global/mvi/entity/CategoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.categories_global.CategoriesInteractorImpl$getCategories$1", f = "CategoriesInteractorImpl.kt", i = {0}, l = {44, 52, 56}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.categories_global.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29364a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CategoriesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116307q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116308r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29365b f116309s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f116310t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29364a(C29365b c29365b, String str, Continuation<? super C29364a> continuation) {
        super(2, continuation);
        this.f116309s = c29365b;
        this.f116310t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29364a c29364a = new C29364a(this.f116309s, this.f116310t, continuation);
        c29364a.f116308r = obj;
        return c29364a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CategoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29364a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        List<CategoriesModel.Category> listC;
        CategoriesModel.Category category;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116307q;
        String str = this.f116310t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f116308r;
            InterfaceC14010a interfaceC14010a = this.f116309s.f116311a.get();
            this.f116308r = interfaceC43172j;
            this.f116307q = 1;
            obj = interfaceC14010a.a(str, null, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f116308r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            CategoriesModel categoriesModel = (CategoriesModel) ((TypedResult.Success) typedResult).getResult();
            C14417b c14417bA = (str == null || (listC = categoriesModel.c()) == null || (category = (CategoriesModel.Category) C42745f0.G(listC)) == null) ? d.a(categoriesModel) : d.b(category);
            CategoriesInternalAction.ContentLoaded contentLoaded = new CategoriesInternalAction.ContentLoaded(c14417bA);
            this.f116308r = null;
            this.f116307q = 2;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            CategoriesInternalAction.Error error2 = new CategoriesInternalAction.Error(C35936s.a(error.getError(), error.getCause()));
            this.f116308r = null;
            this.f116307q = 3;
            if (interfaceC43172j.emit(error2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
