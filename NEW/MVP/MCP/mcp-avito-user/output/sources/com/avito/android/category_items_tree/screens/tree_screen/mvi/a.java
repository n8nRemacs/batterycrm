package com.avito.android.category_items_tree.screens.tree_screen.mvi;

import Y41.p;
import ao.C23642a;
import bo.InterfaceC25684a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.CategoryItemsDeepLink;
import com.avito.android.category_items_tree.screens.tree_screen.TreeArguments;
import com.avito.android.category_items_tree.screens.tree_screen.mvi.entity.TreeInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TreeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category_items_tree/screens/tree_screen/mvi/entity/TreeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category_items_tree.screens.tree_screen.mvi.TreeActor$process$1", f = "TreeActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super TreeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25684a f117150q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f117151r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC25684a interfaceC25684a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f117150q = interfaceC25684a;
        this.f117151r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f117150q, this.f117151r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TreeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC25684a interfaceC25684a = this.f117150q;
        if (interfaceC25684a instanceof InterfaceC25684a.C2015a) {
            b bVar = this.f117151r;
            InterfaceC28373a interfaceC28373a = bVar.f117154c;
            TreeArguments treeArguments = bVar.f117153b;
            InterfaceC25684a.C2015a c2015a = (InterfaceC25684a.C2015a) interfaceC25684a;
            interfaceC28373a.c(new C23642a(treeArguments.f117020b, c2015a.f57443c, c2015a.f57442b));
            b.a.a(bVar.f117152a, new CategoryItemsDeepLink(treeArguments.f117020b, treeArguments.f117021c, c2015a.f57441a, c2015a.f57442b, "tree"), null, null, 6);
        }
        return G0.f406611a;
    }
}
