package com.avito.android.category_items_tree.screens.items_screen;

import Tn.InterfaceC15379a;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoryItemsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/i;", "Lcom/avito/android/category_items_tree/screens/items_screen/h;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CategoryItemsArguments f116956a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15379a> f116957b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f116958c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f116959d;

    /* compiled from: CategoryItemsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.category_items_tree.screens.items_screen.CategoryItemsInteractorImpl$getCategoryTreeItems$1", f = "CategoryItemsInteractor.kt", i = {0, 1}, l = {31, 32, 42, 57}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CategoryItemsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116960q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f116961r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f116962s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ i f116963t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f116964u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, i iVar, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f116962s = z12;
            this.f116963t = iVar;
            this.f116964u = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f116962s, this.f116963t, this.f116964u, continuation);
            aVar.f116961r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CategoryItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.category_items_tree.screens.items_screen.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@Y61.k CategoryItemsArguments categoryItemsArguments, @Y61.k h31.e<InterfaceC15379a> eVar, @Y61.k R0 r02, @Y61.k n nVar) {
        this.f116956a = categoryItemsArguments;
        this.f116957b = eVar;
        this.f116958c = r02;
        this.f116959d = nVar;
    }

    @Override // com.avito.android.category_items_tree.screens.items_screen.h
    @Y61.k
    public final InterfaceC43160i a(int i12, boolean z12) {
        return C43175k.I(this.f116958c.a(), C43175k.G(new a(z12, this, i12, null)));
    }
}
