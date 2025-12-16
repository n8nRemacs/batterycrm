package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchActor$process$3", f = "RealtyAgencySearchActor.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29878m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138924q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138925r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29866a f138926s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lw.c f138927t;

    /* compiled from: RealtyAgencySearchActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.m$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f138450c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f138451d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29878m(Lw.c cVar, C29866a c29866a, Continuation continuation) {
        super(2, continuation);
        this.f138926s = c29866a;
        this.f138927t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29878m c29878m = new C29878m(this.f138927t, this.f138926s, continuation);
        c29878m.f138925r = obj;
        return c29878m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29878m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        RealtyAgencySearchInternalAction realtyAgencySearchInternalAction;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138924q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138925r;
            this.f138926s.f138786c.a(RealtyAgencySearchInternalAction.AnalyticsEvent.SortingSelectorClicked.f138832b);
            int iOrdinal = this.f138927t.f10248l.ordinal();
            if (iOrdinal == 0) {
                realtyAgencySearchInternalAction = RealtyAgencySearchInternalAction.ShowDevelopmentSortingTypeDialogSelector.f138876b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                realtyAgencySearchInternalAction = RealtyAgencySearchInternalAction.ShowLotSortingTypeDialogSelector.f138882b;
            }
            this.f138924q = 1;
            if (interfaceC43172j.emit(realtyAgencySearchInternalAction, this) == coroutine_suspended) {
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
