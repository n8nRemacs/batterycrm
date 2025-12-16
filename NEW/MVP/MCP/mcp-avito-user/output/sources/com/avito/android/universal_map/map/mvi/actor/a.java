package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.arch.mvi.a;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.universal_map.map.mvi.entity.b;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
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
import qG0.C47293d;
import rG0.AbstractC47541a;

/* compiled from: FiltersActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/a;", "Lcom/avito/android/arch/mvi/a;", "LrG0/a$a;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<AbstractC47541a.AbstractC12359a, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.domain.a f305261a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305262b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f305263c;

    /* compiled from: FiltersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.FiltersActor$process$1", f = "FiltersActor.kt", i = {0}, l = {30, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.universal_map.map.mvi.actor.a$a, reason: collision with other inner class name */
    public static final class C9370a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305264q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305265r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305267t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9370a(com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation<? super C9370a> continuation) {
            super(2, continuation);
            this.f305267t = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C9370a c9370a = a.this.new C9370a(this.f305267t, continuation);
            c9370a.f305265r = obj;
            return c9370a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9370a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305264q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f305265r;
                UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet hidePointInfoBottomSheet = UniversalMapInternalAction.PointInfoInternalAction.HidePointInfoBottomSheet.f305516b;
                this.f305265r = interfaceC43172j;
                this.f305264q = 1;
                if (interfaceC43172j.emit(hidePointInfoBottomSheet, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f305265r;
                C42729a0.b(obj);
            }
            com.avito.android.universal_map.map_mvi.domain.a aVar = a.this.f305261a;
            com.avito.android.universal_map.map.mvi.entity.e eVar = this.f305267t;
            InterfaceC43160i<UniversalMapInternalAction> interfaceC43160iA = aVar.a(eVar.f305596c.f305573b, eVar.f305597d.f305560c);
            this.f305265r = null;
            this.f305264q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FiltersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.FiltersActor$process$2", f = "FiltersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305268q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ a f305269r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation continuation) {
            super(2, continuation);
            this.f305268q = eVar;
            this.f305269r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f305269r, this.f305268q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            b.a aVar = this.f305268q.f305597d.f305561d;
            b.a.c cVar = aVar instanceof b.a.c ? (b.a.c) aVar : null;
            com.avito.android.beduin_shared.model.utils.a.a(this.f305269r.f305262b, cVar != null ? cVar.f305570a : null);
            return G0.f406611a;
        }
    }

    /* compiled from: FiltersActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.FiltersActor$process$3", f = "FiltersActor.kt", i = {0}, l = {53, 55}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305270q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f305271r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.universal_map.map.mvi.entity.e f305272s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.universal_map.map.mvi.entity.e eVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f305272s = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f305272s, continuation);
            cVar.f305271r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305270q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f305271r;
                C47293d c47293d = this.f305272s.f305597d.f305559b;
                if (c47293d != null) {
                    if (!c47293d.a()) {
                        c47293d = null;
                    }
                    if (c47293d != null) {
                        UniversalMapInternalAction.FiltersInternalAction.ShowFiltersTooltip showFiltersTooltip = new UniversalMapInternalAction.FiltersInternalAction.ShowFiltersTooltip(c47293d);
                        this.f305271r = interfaceC43172j;
                        this.f305270q = 1;
                        if (interfaceC43172j.emit(showFiltersTooltip, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f305271r;
                C42729a0.b(obj);
            }
            UniversalMapInternalAction.FiltersInternalAction.FiltersTooltipDataChanged filtersTooltipDataChanged = new UniversalMapInternalAction.FiltersInternalAction.FiltersTooltipDataChanged(null);
            this.f305271r = null;
            this.f305270q = 2;
            if (interfaceC43172j.emit(filtersTooltipDataChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.universal_map.map_mvi.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k R0 r02) {
        this.f305261a = aVar;
        this.f305262b = interfaceC40691b;
        this.f305263c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UniversalMapInternalAction> b(@Y61.k AbstractC47541a.AbstractC12359a abstractC12359a, @Y61.k com.avito.android.universal_map.map.mvi.entity.e eVar) {
        if (abstractC12359a.equals(AbstractC47541a.AbstractC12359a.d.f429675a)) {
            return C43175k.G(new C9370a(eVar, null));
        }
        if (abstractC12359a instanceof AbstractC47541a.AbstractC12359a.c) {
            return new C43210w(new UniversalMapInternalAction.FiltersInternalAction.HideFiltersBottomSheet(((AbstractC47541a.AbstractC12359a.c) abstractC12359a).f429674a));
        }
        if (abstractC12359a.equals(AbstractC47541a.AbstractC12359a.b.f429673a)) {
            return C43175k.I(this.f305263c.b(), C43175k.G(new b(this, eVar, null)));
        }
        if (abstractC12359a.equals(AbstractC47541a.AbstractC12359a.C12360a.f429672a)) {
            return C43175k.G(new c(eVar, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
