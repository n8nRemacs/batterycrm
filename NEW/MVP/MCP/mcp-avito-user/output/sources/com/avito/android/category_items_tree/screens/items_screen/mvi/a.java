package com.avito.android.category_items_tree.screens.items_screen.mvi;

import Xn.C17026a;
import Y41.p;
import Yn.C18303c;
import Yn.InterfaceC18301a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_items_tree.screens.items_screen.CategoryItemsArguments;
import com.avito.android.category_items_tree.screens.items_screen.mvi.entity.CategoryItemsInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CategoryItemsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/category_items_tree/screens/items_screen/mvi/entity/CategoryItemsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.category_items_tree.screens.items_screen.mvi.CategoryItemsActor$process$1", f = "CategoryItemsActor.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super CategoryItemsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116970q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC18301a f116972s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C18303c f116973t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f116974u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC18301a interfaceC18301a, C18303c c18303c, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f116972s = interfaceC18301a;
        this.f116973t = c18303c;
        this.f116974u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f116972s, this.f116973t, this.f116974u, continuation);
        aVar.f116971r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CategoryItemsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116970q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f116971r;
            InterfaceC18301a interfaceC18301a = this.f116972s;
            boolean z12 = interfaceC18301a instanceof InterfaceC18301a.b;
            b bVar = this.f116974u;
            if (z12) {
                C18303c c18303c = this.f116973t;
                if (!c18303c.f19658e) {
                    InterfaceC43160i interfaceC43160iA = bVar.f116975a.a(c18303c.f19657d, false);
                    this.f116970q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (interfaceC18301a instanceof InterfaceC18301a.C1403a) {
                InterfaceC28373a interfaceC28373a = bVar.f116978d;
                InterfaceC18301a.C1403a c1403a = (InterfaceC18301a.C1403a) interfaceC18301a;
                String str = c1403a.f19648a;
                CategoryItemsArguments categoryItemsArguments = bVar.f116977c;
                interfaceC28373a.c(new C17026a(str, categoryItemsArguments.f116795b, categoryItemsArguments.f116799f, c1403a.f19649b));
                b.a.a(bVar.f116976b, c1403a.f19650c, null, null, 6);
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
