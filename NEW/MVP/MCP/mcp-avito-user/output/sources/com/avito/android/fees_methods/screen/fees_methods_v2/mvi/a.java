package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import GE.a;
import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity.FeesMethodsV2InternalAction;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.FeesMethodsV2LimitsInfoItem;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wZ.C49578b;

/* compiled from: FeesMethodsV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LGE/a;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "LGE/c;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<GE.a, FeesMethodsV2InternalAction, GE.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.fees_methods.screen.fees_methods_v2.domain.a f158269a;

    /* compiled from: FeesMethodsV2Actor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.fees_methods.screen.fees_methods_v2.mvi.FeesMethodsV2Actor$process$1", f = "FeesMethodsV2Actor.kt", i = {0}, l = {41, 46}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.fees_methods.screen.fees_methods_v2.mvi.a$a, reason: collision with other inner class name */
    public static final class C4626a extends SuspendLambda implements p<InterfaceC43172j<? super FeesMethodsV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158270q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f158271r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ GE.a f158272s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ GE.c f158273t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4626a(GE.a aVar, GE.c cVar, Continuation<? super C4626a> continuation) {
            super(2, continuation);
            this.f158272s = aVar;
            this.f158273t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C4626a c4626a = new C4626a(this.f158272s, this.f158273t, continuation);
            c4626a.f158271r = obj;
            return c4626a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FeesMethodsV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C4626a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object next;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f158270q;
            GE.a aVar = this.f158272s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f158271r;
                FeesMethodsV2InternalAction.HandleDeeplink handleDeeplink = new FeesMethodsV2InternalAction.HandleDeeplink(((a.c) aVar).f6381a);
                this.f158271r = interfaceC43172j;
                this.f158270q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f158271r;
                C42729a0.b(obj);
            }
            Iterator<T> it = this.f158273t.f6393d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof FeesMethodsV2LimitsInfoItem) {
                    break;
                }
            }
            if (!(next instanceof FeesMethodsV2LimitsInfoItem)) {
                next = null;
            }
            FeesMethodsV2LimitsInfoItem feesMethodsV2LimitsInfoItem = (FeesMethodsV2LimitsInfoItem) next;
            if (feesMethodsV2LimitsInfoItem == null || (str = feesMethodsV2LimitsInfoItem.f158409b) == null) {
                return G0.f406611a;
            }
            FeesMethodsV2InternalAction.FeesMethodClicked feesMethodClicked = new FeesMethodsV2InternalAction.FeesMethodClicked(str, ((a.c) aVar).f6382b, feesMethodsV2LimitsInfoItem.f158416i);
            this.f158271r = null;
            this.f158270q = 2;
            if (interfaceC43172j.emit(feesMethodClicked, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.fees_methods.screen.fees_methods_v2.domain.a aVar) {
        this.f158269a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, b.f158274l, new c(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<FeesMethodsV2InternalAction> b(@Y61.k GE.a aVar, @Y61.k GE.c cVar) {
        C49578b c49578b;
        if (aVar instanceof a.C0333a) {
            return new C43210w(cVar.f6392c ? FeesMethodsV2InternalAction.FinishFlow.f158287b : FeesMethodsV2InternalAction.Back.f158279b);
        }
        DeepLink deepLink = null;
        if (aVar instanceof a.d) {
            wZ.j jVar = cVar.f6391b;
            if (jVar != null && (c49578b = jVar.f441570b) != null) {
                deepLink = c49578b.f441547b;
            }
            return new C43210w(new FeesMethodsV2InternalAction.HandleDeeplink(deepLink));
        }
        if (aVar instanceof a.e) {
            return this.f158269a.invoke();
        }
        if (aVar instanceof a.b) {
            return new C43210w(new FeesMethodsV2InternalAction.HandleDeeplink(((a.b) aVar).f6380a));
        }
        if (aVar instanceof a.c) {
            return C43175k.G(new C4626a(aVar, cVar, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
