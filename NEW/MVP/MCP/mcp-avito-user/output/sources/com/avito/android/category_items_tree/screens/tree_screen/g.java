package com.avito.android.category_items_tree.screens.tree_screen;

import Tn.InterfaceC15379a;
import Un.C15539b;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TreeInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/g;", "Lcom/avito/android/category_items_tree/screens/tree_screen/f;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15379a> f117128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f117129b;

    /* compiled from: TreeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.category_items_tree.screens.tree_screen.TreeInteractorImpl$getPromoCategoryTree$1", f = "TreeInteractor.kt", i = {0}, l = {34, 35}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TreeInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f117130q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f117131r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f117133t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f117134u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f117133t = str;
            this.f117134u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f117133t, this.f117134u, continuation);
            aVar.f117131r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TreeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f117130q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f117131r;
                TreeInternalAction.Loading loading = new TreeInternalAction.Loading();
                this.f117131r = interfaceC43172j;
                this.f117130q = 1;
                if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f117131r;
                C42729a0.b(obj);
            }
            g gVar = g.this;
            gVar.getClass();
            InterfaceC43160i interfaceC43160iI = C43175k.I(gVar.f117129b.a(), C43175k.G(new h(gVar, this.f117133t, this.f117134u, null)));
            this.f117131r = null;
            this.f117130q = 2;
            if (C43175k.u(this, interfaceC43160iI, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f117128a = eVar;
        this.f117129b = r02;
    }

    public static void b(ArrayList arrayList, C15539b c15539b, int i12) {
        arrayList.add(new k(i12, String.valueOf(c15539b.getId()), c15539b.getName(), c15539b.getHasItems(), c15539b.getIsVertical()));
        List<C15539b> listA = c15539b.a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                b(arrayList, (C15539b) it.next(), i12 + 1);
            }
        }
    }

    @Override // com.avito.android.category_items_tree.screens.tree_screen.f
    @Y61.k
    public final InterfaceC43160i<TreeInternalAction> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new a(str, str2, null));
    }
}
