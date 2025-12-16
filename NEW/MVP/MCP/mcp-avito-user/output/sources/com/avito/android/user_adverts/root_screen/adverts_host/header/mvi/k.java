package com.avito.android.user_adverts.root_screen.adverts_host.header.mvi;

import AI0.c;
import II0.d;
import MI0.d;
import Y41.q;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import java.util.Collections;
import java.util.ListIterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vI0.InterfaceC49220b;
import xI0.InterfaceC49845b;
import yI0.InterfaceC50119b;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/D1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements InterfaceC43160i<AI0.c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i[] f312744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b f312745c;

    /* compiled from: Zip.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/G1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<Object[]> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i[] f312746l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i[] interfaceC43160iArr) {
            super(0);
            this.f312746l = interfaceC43160iArr;
        }

        @Override // Y41.a
        public final Object[] invoke() {
            return new Object[this.f312746l.length];
        }
    }

    /* compiled from: Zip.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/H1"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$bindMainState$$inlined$combine$1$3", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super AI0.c>, Object[], Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312747q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f312748r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object[] f312749s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b f312750t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b bVar, Continuation continuation) {
            super(3, continuation);
            this.f312750t = bVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AI0.c> interfaceC43172j, Object[] objArr, Continuation<? super G0> continuation) {
            b bVar = new b(this.f312750t, continuation);
            bVar.f312748r = interfaceC43172j;
            bVar.f312749s = objArr;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312747q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f312748r;
                Object[] objArr = this.f312749s;
                int i13 = 0;
                Object obj2 = objArr[0];
                if (!(obj2 instanceof MI0.d)) {
                    obj2 = null;
                }
                MI0.d dVar = (MI0.d) obj2;
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj3 = objArr[1];
                if (!(obj3 instanceof II0.d)) {
                    obj3 = null;
                }
                II0.d dVar2 = (II0.d) obj3;
                if (dVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj4 = objArr[2];
                if (!(obj4 instanceof PI0.b)) {
                    obj4 = null;
                }
                PI0.b bVar = (PI0.b) obj4;
                if (bVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj5 = objArr[3];
                if (!(obj5 instanceof InterfaceC49845b)) {
                    obj5 = null;
                }
                InterfaceC49845b interfaceC49845b = (InterfaceC49845b) obj5;
                if (interfaceC49845b == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj6 = objArr[4];
                if (!(obj6 instanceof RI0.b)) {
                    obj6 = null;
                }
                RI0.b bVar2 = (RI0.b) obj6;
                if (bVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj7 = objArr[5];
                if (!(obj7 instanceof InterfaceC49220b)) {
                    obj7 = null;
                }
                InterfaceC49220b interfaceC49220b = (InterfaceC49220b) obj7;
                if (interfaceC49220b == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object obj8 = objArr[6];
                InterfaceC50119b interfaceC50119b = (InterfaceC50119b) (obj8 instanceof InterfaceC50119b ? obj8 : null);
                if (interfaceC50119b == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f312750t.getClass();
                kotlin.collections.builders.b bVarT = C42745f0.t();
                d.a aVar = dVar2.f8103b;
                bVarT.addAll(aVar instanceof d.a.b ? ((d.a.b) aVar).f8117l : aVar instanceof d.a.c ? ((d.a.c) aVar).f8118a : C42784z0.f406748b);
                d.a aVar2 = dVar.f10579c;
                bVarT.addAll(aVar2 instanceof d.a.c ? Collections.singletonList(((d.a.c) aVar2).f10583a) : aVar2 instanceof d.a.C0673d ? C42745f0.V(((d.a.C0673d) aVar2).f10584a) : C42784z0.f406748b);
                kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
                ListIterator listIterator = bVarP.listIterator(0);
                while (true) {
                    if (!listIterator.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a aVar3 = (com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a) listIterator.next();
                    if (aVar3 instanceof PanelCardItem) {
                        PanelCardItem panelCardItem = (PanelCardItem) aVar3;
                        if (panelCardItem.getF9898d() || panelCardItem.getF9899e() != null) {
                            break;
                        }
                    }
                    i13++;
                }
                AI0.c cVar = new AI0.c(dVar, dVar2, bVar, interfaceC49845b, bVar2, interfaceC49220b, new c.a(bVarP, i13), interfaceC50119b);
                this.f312747q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    public k(InterfaceC43160i[] interfaceC43160iArr, com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b bVar) {
        this.f312744b = interfaceC43160iArr;
        this.f312745c = bVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super AI0.c> interfaceC43172j, @Y61.k Continuation continuation) {
        InterfaceC43160i[] interfaceC43160iArr = this.f312744b;
        Object objA = kotlinx.coroutines.flow.internal.n.a(new a(interfaceC43160iArr), new b(this.f312745c, null), continuation, interfaceC43172j, interfaceC43160iArr);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
