package com.avito.android.guests_selector.mvi;

import Y41.p;
import com.avito.android.guests_selector.GuestsSelectorOpenParams;
import com.avito.android.guests_selector.io.GuestsSelectorAvailableAge;
import com.avito.android.guests_selector.io.GuestsSelectorChild;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import iI.C41289a;
import iI.C41290b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GuestsSelectorBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.b<GuestsSelectorInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GuestsSelectorOpenParams f161526a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f161527b;

    /* compiled from: GuestsSelectorBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.guests_selector.mvi.GuestsSelectorBootstrap$produce$1", f = "GuestsSelectorBootstrap.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super GuestsSelectorInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f161528q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f161529r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f161529r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super GuestsSelectorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            d dVar;
            boolean z12 = true;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f161528q;
            d dVar2 = d.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f161529r;
                if (dVar2.f161527b) {
                    return G0.f406611a;
                }
                ActivePageType activePageType = ActivePageType.f161554b;
                GuestsSelectorOpenParams guestsSelectorOpenParams = dVar2.f161526a;
                int i13 = guestsSelectorOpenParams.f161368c;
                int size = guestsSelectorOpenParams.f161374i.size();
                int i14 = guestsSelectorOpenParams.f161369d;
                int i15 = i14 - size;
                int iMin = Math.min(guestsSelectorOpenParams.f161373h, guestsSelectorOpenParams.f161369d);
                GuestsSelectorAvailableAge guestsSelectorAvailableAge = (GuestsSelectorAvailableAge) C42745f0.G(guestsSelectorOpenParams.f161372g);
                String id2 = guestsSelectorAvailableAge != null ? guestsSelectorAvailableAge.getId() : null;
                List<GuestsSelectorChild> list = guestsSelectorOpenParams.f161374i;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                int i16 = 0;
                for (Object obj2 : list) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    arrayList.add(new C41290b(i16, ((GuestsSelectorChild) obj2).getAgeId()));
                    i16 = i17;
                }
                List<GuestsSelectorAvailableAge> list2 = guestsSelectorOpenParams.f161372g;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                for (GuestsSelectorAvailableAge guestsSelectorAvailableAge2 : list2) {
                    arrayList2.add(new C41289a(guestsSelectorAvailableAge2.getId(), guestsSelectorAvailableAge2.getTitle()));
                }
                GuestsSelectorInternalAction.Initial initial = new GuestsSelectorInternalAction.Initial(i13, i14, guestsSelectorOpenParams.f161370e, guestsSelectorOpenParams.f161371f, i13, i15, iMin, id2, arrayList, arrayList2, guestsSelectorOpenParams.f161376k, guestsSelectorOpenParams.f161377l);
                z12 = true;
                this.f161528q = 1;
                if (interfaceC43172j.emit(initial, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dVar = dVar2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                dVar = dVar2;
            }
            dVar.f161527b = z12;
            return G0.f406611a;
        }
    }

    @Inject
    public d(@Y61.k GuestsSelectorOpenParams guestsSelectorOpenParams) {
        this.f161526a = guestsSelectorOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<GuestsSelectorInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
