package com.avito.android.user_advert.advert.delegate.deliverySettings;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.m;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.delegate.deliverySettings.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.facebook.imageutils.JfifUtil;
import fH0.AbstractC40291a;
import gj.InterfaceC40691b;
import iI0.H;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import kotlinx.coroutines.t1;
import l41.o;
import lj.InterfaceC43779a;

/* compiled from: DeliverySettingsPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/b;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.deliverySettings.b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f308564i = 0;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.clientEventBus.a f308565d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.deliveryPromoBlock.a f308566e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC40691b f308567f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C43238h f308568g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public N0 f308569h;

    /* compiled from: DeliverySettingsPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/c$a;", "", "<init>", "()V", "", "DEBOUNCE_TIME_MS", "J", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.deliverySettings.DeliverySettingsPresenterDelegateImpl$handleDeliverySettingsUpdates$$inlined$flatMapLatest$1", f = "DeliverySettingsPresenterDelegate.kt", i = {}, l = {JfifUtil.MARKER_EOI, 189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super TypedResult<MyAdvertDetails.DeliverySettings>>, H, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308570q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f308571r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f308572s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f308573t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f308574u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f308575v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f308576w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, String str, c cVar, String str2, String str3) {
            super(3, continuation);
            this.f308573t = str;
            this.f308574u = cVar;
            this.f308575v = str2;
            this.f308576w = str3;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super TypedResult<MyAdvertDetails.DeliverySettings>> interfaceC43172j, H h12, Continuation<? super G0> continuation) {
            b bVar = new b(continuation, this.f308573t, this.f308574u, this.f308575v, this.f308576w);
            bVar.f308571r = interfaceC43172j;
            bVar.f308572s = h12;
            return bVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f308570q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.C42729a0.b(r8)
                goto L6e
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlinx.coroutines.flow.j r1 = r7.f308571r
                kotlin.C42729a0.b(r8)
                goto L58
            L20:
                kotlin.C42729a0.b(r8)
                kotlinx.coroutines.flow.j r1 = r7.f308571r
                java.lang.Object r8 = r7.f308572s
                iI0.H r8 = (iI0.H) r8
                long r4 = r8.getItemId()
                java.lang.String r8 = java.lang.String.valueOf(r4)
                java.lang.String r4 = r7.f308573t
                boolean r8 = kotlin.jvm.internal.L.f(r8, r4)
                if (r8 == 0) goto L5e
                int r8 = com.avito.android.user_advert.advert.delegate.deliverySettings.c.f308564i
                com.avito.android.user_advert.advert.delegate.deliverySettings.c r8 = r7.f308574u
                com.jakewharton.rxrelay3.c<fH0.b> r4 = r8.f395801b
                com.avito.android.user_advert.advert.delegate.deliverySettings.a$c r5 = new com.avito.android.user_advert.advert.delegate.deliverySettings.a$c
                java.lang.String r6 = r7.f308575v
                r5.<init>(r6)
                r4.accept(r5)
                r7.f308571r = r1
                r7.f308570q = r3
                java.lang.String r3 = r7.f308576w
                com.avito.android.user_advert.advert.deliveryPromoBlock.a r8 = r8.f308566e
                java.lang.Object r8 = r8.a(r3, r7)
                if (r8 != r0) goto L58
                return r0
            L58:
                kotlinx.coroutines.flow.w r3 = new kotlinx.coroutines.flow.w
                r3.<init>(r8)
                goto L62
            L5e:
                kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.C43175k.w()
            L62:
                r8 = 0
                r7.f308571r = r8
                r7.f308570q = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r3, r1)
                if (r8 != r0) goto L6e
                return r0
            L6e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_advert.advert.delegate.deliverySettings.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.delegate.deliverySettings.c$c, reason: collision with other inner class name */
    public static final class C9465c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.clientEventBus.a f308577b;

        public C9465c(com.avito.android.clientEventBus.a aVar) {
            this.f308577b = aVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return com.avito.android.user_advert.advert.delegate.deliverySettings.d.f308581a[((ConnectionState) obj).ordinal()] == 1 ? this.f308577b.c(H.class).l0(e.f308582b) : U.f403867b;
        }
    }

    /* compiled from: DeliverySettingsPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/adverts/MyAdvertDetails$DeliverySettings;", "result", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/TypedResult;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.deliverySettings.DeliverySettingsPresenterDelegateImpl$handleDeliverySettingsUpdates$2", f = "DeliverySettingsPresenterDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<TypedResult<MyAdvertDetails.DeliverySettings>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f308578q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f308580s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f308580s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = c.this.new d(this.f308580s, continuation);
            dVar.f308578q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(TypedResult<MyAdvertDetails.DeliverySettings> typedResult, Continuation<? super G0> continuation) {
            return ((d) create(typedResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult typedResult = (TypedResult) this.f308578q;
            boolean z12 = typedResult instanceof TypedResult.Error;
            c cVar = c.this;
            if (z12) {
                V2.f318762a.e("Failed to fetchDeliverySettingsPromoBlock", ((TypedResult.Error) typedResult).getCause());
                int i12 = c.f308564i;
                cVar.f395801b.accept(new a.C9464a(this.f308580s));
            } else if (typedResult instanceof TypedResult.Success) {
                BeduinForm form = ((MyAdvertDetails.DeliverySettings) ((TypedResult.Success) typedResult).getResult()).getForm();
                InterfaceC43779a interfaceC43779aJ = cVar.f308567f.getF103565k().get(form.getId());
                if (interfaceC43779aJ == null) {
                    interfaceC43779aJ = cVar.f308567f.j();
                }
                m.b(interfaceC43779aJ, form);
                cVar.f395801b.accept(new a.b(form));
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k com.avito.android.clientEventBus.a aVar, @k com.avito.android.user_advert.advert.deliveryPromoBlock.a aVar2, @k InterfaceC40691b interfaceC40691b, @k R0 r02) {
        this.f308565d = aVar;
        this.f308566e = aVar2;
        this.f308567f = interfaceC40691b;
        this.f308568g = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.deliverySettings.b
    public final void I(@k List<? extends com.avito.conveyor_item.a> list, @k MyAdvertDetails.DeliverySettings deliverySettings) {
        com.avito.android.beduin_items.item_with_loader.a next;
        List<BeduinModel> listF;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = 0;
                break;
            } else {
                next = it.next();
                if (L.f(((com.avito.conveyor_item.a) next).getF294787b(), deliverySettings.getForm().getId())) {
                    break;
                }
            }
        }
        com.avito.android.beduin_items.item_with_loader.a aVar = next instanceof com.avito.android.beduin_items.item_with_loader.a ? next : null;
        if (aVar != null) {
            com.avito.android.beduin.common.form.store.b f103565k = this.f308567f.getF103565k();
            String str = aVar.f105254b;
            InterfaceC43779a interfaceC43779a = f103565k.get(str);
            if (interfaceC43779a == null || (listF = interfaceC43779a.f()) == null) {
                return;
            }
            deliverySettings.setForm(new com.avito.android.beduin_shared.model.form.BeduinForm(str, listF));
        }
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        kotlinx.coroutines.U.b(this.f308568g, null);
    }

    @Override // com.avito.android.user_advert.advert.delegate.deliverySettings.b
    public final void n(@k String str, @k String str2, @k String str3) {
        N0 n02 = this.f308569h;
        if (n02 != null) {
            n02.c(null);
        }
        com.avito.android.clientEventBus.a aVar = this.f308565d;
        this.f308569h = C43175k.K(new C43197r1(new d(str2, null), C43175k.Y(C43175k.n(y.a(aVar.a().y0(new C9465c(aVar))), 1000L), new b(null, str3, this, str2, str))), this.f308568g);
    }
}
