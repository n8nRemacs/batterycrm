package com.avito.android.cart_snippet_actions.feature;

import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.cart_snippet_actions.feature.entity.TrueCartSnippetActionsInternalAction;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.util.C35755b0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43200s1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rU.C47595a;
import tn.InterfaceC48692a;
import tn.InterfaceC48693b;
import un.C49080b;

/* compiled from: CartSnippetActionsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_snippet_actions/feature/k;", "Lcom/avito/android/arch/mvi/a;", "Ltn/a;", "Ltn/b;", "Ltn/d;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements com.avito.android.arch.mvi.a<InterfaceC48692a, InterfaceC48693b, tn.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.i f116223a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_snippet_actions.a f116224b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f116225c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f116226d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f116227e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FromPage f116228f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Srcp f116229g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final y f116230h;

    /* compiled from: CartSnippetActionsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ltn/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$process$1", f = "CartSnippetActionsActor.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC48693b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116231q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f116232r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48692a f116233s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ k f116234t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC48692a interfaceC48692a, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f116233s = interfaceC48692a;
            this.f116234t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f116233s, this.f116234t, continuation);
            aVar.f116232r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC48693b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f116231q;
            InterfaceC48692a interfaceC48692a = this.f116233s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f116232r;
                TrueCartSnippetActionsInternalAction.b bVar = new TrueCartSnippetActionsInternalAction.b(((InterfaceC48692a.c) interfaceC48692a).f439418a);
                this.f116231q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar = this.f116234t.f116227e;
            LinkedHashMap linkedHashMapC = C35755b0.c(((InterfaceC48692a.c) interfaceC48692a).f439418a);
            ArrayList arrayList = new ArrayList(linkedHashMapC.size());
            for (Map.Entry entry : linkedHashMapC.entrySet()) {
                String str = (String) entry.getKey();
                CartSnippetActionsStepper cartSnippetActionsStepper = (CartSnippetActionsStepper) entry.getValue();
                arrayList.add(new CartItem(str, new CartItemInfo(cartSnippetActionsStepper.getValue(), cartSnippetActionsStepper.getMaxValue())));
            }
            hVar.c(new C47595a(arrayList));
            return G0.f406611a;
        }
    }

    /* compiled from: CartSnippetActionsActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ltn/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cart_snippet_actions.feature.CartSnippetActionsActor$process$2", f = "CartSnippetActionsActor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC48693b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f116235q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f116236r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ tn.d f116237s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ k f116238t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tn.d dVar, k kVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f116237s = dVar;
            this.f116238t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f116237s, this.f116238t, continuation);
            bVar.f116236r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC48693b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f116235q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f116236r;
                Map<String, Stepper> map = this.f116237s.f439436e.f439440a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((Stepper) entry.getValue()) == null ? null : this.f116238t.f116227e.get((String) entry.getKey()));
                }
                TrueCartSnippetActionsInternalAction.j jVar = new TrueCartSnippetActionsInternalAction.j(linkedHashMap);
                this.f116235q = 1;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
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

    @Inject
    public k(@Y61.k com.avito.android.cart_snippet_actions.i iVar, @Y61.k com.avito.android.cart_snippet_actions.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.l C49080b c49080b, @Y61.k FromPage fromPage, @Y61.l Srcp srcp, @Y61.k y yVar) {
        this.f116223a = iVar;
        this.f116224b = aVar;
        this.f116225c = r02;
        this.f116226d = interfaceC35745a5;
        this.f116227e = hVar;
        this.f116228f = fromPage;
        this.f116229g = srcp;
        this.f116230h = yVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iC = C43175k.C(new m(this, aVar, null), c43197r1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(com.avito.android.cart_snippet_actions.utils.h.a(kotlinx.coroutines.rx3.y.b(new C43197r1(new c(linkedHashMap2, null), new com.avito.android.cart_snippet_actions.feature.b(new com.avito.android.cart_snippet_actions.feature.a(c43197r1)))), this.f116226d, this.f116227e, linkedHashMap, d.f116178l, new f(this, aVar, linkedHashMap2)));
        ArrayList arrayList = new ArrayList();
        return C43175k.N(interfaceC43160iC, interfaceC43160iA, C43175k.C(new l(2, null), C43175k.I(this.f116225c.c(), C43175k.B(new j(arrayList, this, aVar, null), C43175k.p(new h(new C43200s1(arrayList, new g(c43197r1), new i(3, null))), n.f116242a)))));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<InterfaceC48693b> b(@Y61.k InterfaceC48692a interfaceC48692a, @Y61.k tn.d dVar) {
        InterfaceC43160i<InterfaceC48693b> c43210w;
        if (interfaceC48692a instanceof InterfaceC48692a.c) {
            return C43175k.I(this.f116225c.a(), C43175k.G(new a(interfaceC48692a, this, null)));
        }
        if (interfaceC48692a instanceof tn.f) {
            tn.f fVar = (tn.f) interfaceC48692a;
            c43210w = new C43207v(new TrueCartSnippetActionsInternalAction[]{TrueCartSnippetActionsInternalAction.l.f116203b, new TrueCartSnippetActionsInternalAction.a(fVar.getF439413a(), fVar.getF439415c())});
        } else {
            if (interfaceC48692a instanceof InterfaceC48692a.d) {
                return C43175k.G(new b(dVar, this, null));
            }
            if (!(interfaceC48692a instanceof InterfaceC48692a.f)) {
                if (interfaceC48692a instanceof InterfaceC48692a.e) {
                    return new C43210w(new TrueCartSnippetActionsInternalAction.e(((InterfaceC48692a.e) interfaceC48692a).f439420a));
                }
                if (interfaceC48692a instanceof InterfaceC48692a.g) {
                    return new C43210w(new TrueCartSnippetActionsInternalAction.i(((InterfaceC48692a.g) interfaceC48692a).f439421a));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TrueCartSnippetActionsInternalAction.g());
        }
        return c43210w;
    }
}
