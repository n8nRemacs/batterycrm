package com.avito.android.publish.screen.wrongcategory.mvi;

import Qe0.InterfaceC14888b;
import Y41.p;
import com.avito.android.publish.screen.wrongcategory.mvi.entity.WrongCategoryState;
import com.avito.android.publish.screen.wrongcategory.ui.SelectListWidget;
import com.avito.android.remote.model.CategoryModel;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WrongCategoryActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQe0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.wrongcategory.mvi.WrongCategoryActor$processMainButtonClick$1", f = "WrongCategoryActor.kt", i = {}, l = {33, 38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14888b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242587q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f242588r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WrongCategoryState f242589s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f242590t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WrongCategoryState wrongCategoryState, c cVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f242589s = wrongCategoryState;
        this.f242590t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f242589s, this.f242590t, continuation);
        bVar.f242588r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14888b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f242587q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f242588r;
            SelectListWidget.Data data = this.f242589s.f242600c;
            if (data == null) {
                return G0.f406611a;
            }
            c cVar = this.f242590t;
            String string = cVar.f242591a.getSelectedCategory().getNavigation().toString();
            String str = data.f242618d;
            if (L.f(str, string)) {
                InterfaceC14888b.e eVar = InterfaceC14888b.e.f13959a;
                this.f242587q = 1;
                if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Iterator<T> it = cVar.f242591a.getCategories().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((CategoryModel) next).getNavigation().toString(), str)) {
                        break;
                    }
                }
                InterfaceC14888b.a aVar = new InterfaceC14888b.a((CategoryModel) next);
                this.f242587q = 2;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
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
