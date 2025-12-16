package com.avito.android.widget_filters.mvi;

import OP0.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.widget_filters.analytics.LocationSelectMethod;
import com.avito.android.widget_filters.mvi.entity.LoadingType;
import com.avito.android.widget_filters.mvi.entity.WidgetFiltersInternalAction;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.WidgetFiltersWidget;
import com.facebook.imageutils.JfifUtil;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetFiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/widget_filters/mvi/n;", "Lcom/avito/android/arch/mvi/a;", "LOP0/a;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lcom/avito/android/widget_filters/mvi/entity/c;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements com.avito.android.arch.mvi.a<OP0.a, WidgetFiltersInternalAction, com.avito.android.widget_filters.mvi.entity.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.use_case.a f330182a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.B f330183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.g f330184c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.utils.b f330185d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.y f330186e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.domain.o f330187f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.analytics.b f330188g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.widget_filters.analytics.e f330189h;

    /* compiled from: WidgetFiltersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$1", f = "WidgetFiltersActor.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330190q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330191r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f330192s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f330193t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f330192s = cVar;
            this.f330193t = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f330193t, this.f330192s, continuation);
            aVar.f330191r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330190q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f330191r;
                com.avito.android.widget_filters.mvi.entity.c cVar = this.f330192s;
                int i13 = cVar.f330105l + 1;
                this.f330190q = 1;
                if (n.c(this.f330193t, interfaceC43172j, i13, cVar, null, null, this, 28) == coroutine_suspended) {
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

    /* compiled from: WidgetFiltersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$2", f = "WidgetFiltersActor.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330194q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330195r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ OP0.a f330196s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f330197t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f330198u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OP0.a aVar, n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f330196s = aVar;
            this.f330197t = nVar;
            this.f330198u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f330196s, this.f330197t, this.f330198u, continuation);
            bVar.f330195r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330194q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f330195r;
                int i13 = ((a.C) this.f330196s).f12236a;
                this.f330194q = 1;
                if (n.c(this.f330197t, interfaceC43172j, i13, this.f330198u, null, null, this, 28) == coroutine_suspended) {
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

    /* compiled from: WidgetFiltersActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.widget_filters.mvi.WidgetFiltersActor$process$3", f = "WidgetFiltersActor.kt", i = {}, l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WidgetFiltersInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330199q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330200r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.widget_filters.mvi.entity.c f330201s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n f330202t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f330201s = cVar;
            this.f330202t = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f330202t, this.f330201s, continuation);
            cVar.f330200r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WidgetFiltersInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330199q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f330200r;
                com.avito.android.widget_filters.mvi.entity.c cVar = this.f330201s;
                int i13 = cVar.f330105l - 1;
                this.f330199q = 1;
                if (n.c(this.f330202t, interfaceC43172j, i13, cVar, null, null, this, 28) == coroutine_suspended) {
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
    public n(@Y61.k com.avito.android.widget_filters.domain.use_case.a aVar, @Y61.k com.avito.android.widget_filters.domain.B b12, @Y61.k com.avito.android.widget_filters.domain.g gVar, @Y61.k com.avito.android.widget_filters.utils.b bVar, @Y61.k com.avito.android.widget_filters.domain.y yVar, @Y61.k com.avito.android.widget_filters.domain.o oVar, @Y61.k com.avito.android.widget_filters.analytics.b bVar2, @Y61.k com.avito.android.widget_filters.analytics.e eVar) {
        this.f330182a = aVar;
        this.f330183b = b12;
        this.f330184c = gVar;
        this.f330185d = bVar;
        this.f330186e = yVar;
        this.f330187f = oVar;
        this.f330188g = bVar2;
        this.f330189h = eVar;
    }

    public static Object c(n nVar, InterfaceC43172j interfaceC43172j, int i12, com.avito.android.widget_filters.mvi.entity.c cVar, WidgetFiltersInternalAction widgetFiltersInternalAction, Map map, SuspendLambda suspendLambda, int i13) {
        LocationSelectMethod locationSelectMethod;
        boolean z12 = (i13 & 4) == 0;
        String str = null;
        if ((i13 & 8) != 0) {
            widgetFiltersInternalAction = null;
        }
        if ((i13 & 16) != 0) {
            map = cVar.f330100g;
        }
        nVar.getClass();
        int size = cVar.f330099f.size();
        int i14 = (cVar.f330097d ? 0 : -1) + i12;
        int i15 = i14 >= 0 ? i14 : 0;
        if (i12 >= size || i12 == cVar.f330105l) {
            return G0.f406611a;
        }
        com.avito.android.widget_filters.analytics.b bVar = nVar.f330188g;
        if (!z12 && i12 != -1) {
            WidgetFiltersWidget.WidgetType widgetType = cVar.f330107n.get(Integer.valueOf(i12));
            bVar.f(widgetType != null ? widgetType.f330269b : null);
        }
        WidgetFiltersWidget.WidgetType widgetType2 = cVar.f330106m;
        String str2 = widgetType2 != null ? widgetType2.f330269b : null;
        WidgetFiltersInternalAction.UpdateLocation.SelectLocation selectLocation = widgetFiltersInternalAction instanceof WidgetFiltersInternalAction.UpdateLocation.SelectLocation ? (WidgetFiltersInternalAction.UpdateLocation.SelectLocation) widgetFiltersInternalAction : null;
        if (selectLocation != null && (locationSelectMethod = selectLocation.f330042c) != null) {
            str = locationSelectMethod.f329702b;
        }
        bVar.c(str2, str, map);
        Object objEmit = interfaceC43172j.emit(new WidgetFiltersInternalAction.ChangeExpandedWidgetPosition(i12, i15, z12), suspendLambda);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    public static InterfaceC43160i d(n nVar, com.avito.android.widget_filters.mvi.entity.c cVar, WidgetFiltersInternalAction widgetFiltersInternalAction, boolean z12) {
        int i12 = cVar.f330105l;
        nVar.getClass();
        return C43175k.G(new C36160d(widgetFiltersInternalAction, nVar, cVar, z12, i12, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new o(aVar, this, null), c43197r1), C43175k.Y(C43175k.n(new j(c43197r1), 300L), new l(null, this)), C43175k.Y(new k(c43197r1), new m(aVar, this, null)));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<WidgetFiltersInternalAction> b(@Y61.k OP0.a aVar, @Y61.k com.avito.android.widget_filters.mvi.entity.c cVar) {
        C43210w c43210w;
        NP0.g gVar;
        NP0.j jVar;
        NP0.j jVar2;
        List<NP0.f> list;
        NP0.g gVar2;
        NP0.i iVar;
        NP0.g gVar3;
        NP0.i iVar2;
        if (aVar instanceof a.l) {
            return new C43210w(new WidgetFiltersInternalAction.ToggleKeyboard(((a.l) aVar).f12254a));
        }
        if (aVar instanceof a.n) {
            a.n nVar = (a.n) aVar;
            return C43175k.G(new C36160d(new WidgetFiltersInternalAction.UpdateLocation.SelectLocation(nVar.f12256a, nVar.f12258c), this, cVar, nVar.f12257b, cVar.f330105l + 1, null));
        }
        PrintableText printableText = null;
        if (aVar instanceof a.r) {
            a.r rVar = (a.r) aVar;
            return C43175k.G(new e(this, rVar.f12263b, rVar.f12262a, null));
        }
        if (aVar instanceof a.m) {
            return d(this, cVar, WidgetFiltersInternalAction.UpdateLocation.ClearSelectedLocation.f330039b, ((a.m) aVar).f12255a);
        }
        if (aVar instanceof a.o) {
            return new C43210w(new WidgetFiltersInternalAction.UpdateLocation.ChangeLocationInputFocus(((a.o) aVar).f12259a));
        }
        if (aVar instanceof a.q) {
            return new C43210w(new WidgetFiltersInternalAction.UpdateLocation.ChangeLocationInputText(((a.q) aVar).f12261a));
        }
        if (aVar instanceof a.p) {
            c43210w = new C43210w(WidgetFiltersInternalAction.UpdateLocation.RequestLocationInputFocus.f330040b);
        } else {
            if (aVar instanceof a.s) {
                return C43175k.G(new C36157a(cVar, ((a.s) aVar).f12264a, this, null));
            }
            if (aVar instanceof a.u) {
                return C43175k.G(new C36159c(this, cVar, null));
            }
            if (aVar instanceof a.t) {
                return C43175k.G(new C36158b(this, cVar, null));
            }
            if (aVar instanceof a.y) {
                return C43175k.G(new f(cVar, this, ((a.y) aVar).f12271a, null));
            }
            boolean z12 = aVar instanceof a.e;
            d.b bVar = cVar.f330102i;
            if (z12) {
                return C43175k.G(new i((bVar == null || (iVar2 = bVar.f330128k) == null) ? null : iVar2.f11466i, this, null));
            }
            if (aVar instanceof a.w) {
                a.w wVar = (a.w) aVar;
                return C43175k.G(new g(this, wVar.f12268a, wVar.f12269b, null));
            }
            int size = 0;
            if (aVar instanceof a.C14638b) {
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateDates.SelectDate(((a.C14638b) aVar).f12238a), (bVar == null || (gVar3 = bVar.f330127j) == null || !gVar3.f11446c) ? false : true);
            }
            if (aVar instanceof a.g) {
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateDates.SelectFlexSearchOption(((a.g) aVar).f12245a), (bVar == null || (iVar = bVar.f330128k) == null || !iVar.f11460c) ? false : true);
            }
            if (aVar instanceof a.C0791a) {
                if (bVar == null || (gVar2 = bVar.f330127j) == null) {
                    return C43175k.w();
                }
                SelectedDateRange selectedDateRange = gVar2.f11451h;
                Date date = selectedDateRange != null ? selectedDateRange.f286645b : null;
                return (gVar2.f11454k || date == null || (selectedDateRange != null ? selectedDateRange.f286646c : null) != null) ? C43175k.w() : d(this, cVar, new WidgetFiltersInternalAction.UpdateDates.SelectDate(com.avito.android.util.G0.a(date, 5)), gVar2.f11446c);
            }
            if (aVar instanceof a.h) {
                a.h hVar = (a.h) aVar;
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateGuests.ChangeAdultsValue(hVar.f12246a), hVar.f12247b);
            }
            if (aVar instanceof a.j) {
                a.j jVar3 = (a.j) aVar;
                String str = jVar3.f12250a.f11418a;
                d.c cVar2 = cVar.f330104k;
                if (cVar2 != null && (jVar2 = cVar2.f330135i) != null && (list = jVar2.f11484r) != null) {
                    size = list.size();
                }
                Object obj = (cVar2 == null || (jVar = cVar2.f330135i) == null) ? null : jVar.f11485s;
                PrintableText printableTextL = this.f330185d.l(size + 1);
                if (obj != null) {
                    for (NP0.a aVar2 : (Iterable) obj) {
                        if (L.f(aVar2.f11418a, str)) {
                            printableText = aVar2.f11419b;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateGuests.AddChild(new NP0.f(printableTextL, printableText, str)), jVar3.f12251b);
            }
            if (aVar instanceof a.k) {
                a.k kVar = (a.k) aVar;
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateGuests.RemoveChild(kVar.f12252a), kVar.f12253b);
            }
            if (aVar instanceof a.i) {
                a.i iVar3 = (a.i) aVar;
                return d(this, cVar, new WidgetFiltersInternalAction.UpdateGuests.ChangeAnimalsSelected(iVar3.f12248a), iVar3.f12249b);
            }
            if (aVar instanceof a.C14639c) {
                return C43175k.w();
            }
            if (aVar instanceof a.v) {
                return C43175k.G(new a(this, cVar, null));
            }
            if (aVar instanceof a.C) {
                return C43175k.G(new b(aVar, this, cVar, null));
            }
            if (aVar instanceof a.z) {
                return d(this, cVar, WidgetFiltersInternalAction.UpdateDates.ResetDates.f330030b, (bVar == null || (gVar = bVar.f330127j) == null || !gVar.f11446c) ? false : true);
            }
            if (aVar instanceof a.B) {
                return C43175k.G(new h(this, cVar, null));
            }
            if (aVar instanceof a.A) {
                return this.f330184c.a(cVar.f330100g, LoadingType.f329982d);
            }
            if (!(aVar instanceof a.d)) {
                if (aVar instanceof a.f) {
                    return C43175k.G(new c(this, cVar, null));
                }
                if (aVar instanceof a.x) {
                    return new C43210w(new WidgetFiltersInternalAction.UpdateOrientation(((a.x) aVar).f12270a));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(WidgetFiltersInternalAction.CloseScreen.f330015b);
        }
        return c43210w;
    }
}
