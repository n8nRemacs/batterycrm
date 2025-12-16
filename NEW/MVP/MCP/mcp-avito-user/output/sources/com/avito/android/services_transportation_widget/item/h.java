package com.avito.android.services_transportation_widget.item;

import Dv0.C13444a;
import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.interactor.ServiceTransportationWidgetSource;
import com.avito.android.services_transportation_widget.item.fields.switches.ServiceTransportationWidgetSwitchesItem;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import yv0.InterfaceC50307a;

/* compiled from: ServiceTransportationWidgetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/h;", "Lcom/avito/android/services_transportation_widget/item/d;", "Lcom/avito/android/services_transportation_widget/item/l;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements d, l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_transportation_widget.interactor.a f280628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f280629c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50307a f280630d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f280631e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_transportation_widget.dialog.a f280632f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f280633g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C13444a f280634h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f280635i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N0 f280636j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public ServiceTransportationWidgetItem f280637k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public j f280638l;

    /* compiled from: ServiceTransportationWidgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItemPresenterImpl$onValueSelected$2", f = "ServiceTransportationWidgetItemPresenter.kt", i = {0}, l = {130, 132}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280639q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280640r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ServiceTransportationWidget.Field<?> f280642t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ServiceTransportationWidget.FieldValue f280643u;

        /* compiled from: ServiceTransportationWidgetItemPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItemPresenterImpl$onValueSelected$2$1", f = "ServiceTransportationWidgetItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.services_transportation_widget.item.h$a$a, reason: collision with other inner class name */
        public static final class C8355a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ TypedResult<ServiceTransportationWidgetItem> f280644q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f280645r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8355a(TypedResult<ServiceTransportationWidgetItem> typedResult, h hVar, Continuation<? super C8355a> continuation) {
                super(2, continuation);
                this.f280644q = typedResult;
                this.f280645r = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C8355a(this.f280644q, this.f280645r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C8355a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                TypedResult<ServiceTransportationWidgetItem> typedResult = this.f280644q;
                boolean z12 = typedResult instanceof TypedResult.Error;
                h hVar = this.f280645r;
                if (z12) {
                    j jVar = hVar.f280638l;
                    if (jVar != null) {
                        jVar.y3();
                    }
                } else if (typedResult instanceof TypedResult.Success) {
                    ServiceTransportationWidgetItem serviceTransportationWidgetItem = (ServiceTransportationWidgetItem) ((TypedResult.Success) typedResult).getResult();
                    hVar.f280637k = serviceTransportationWidgetItem;
                    j jVar2 = hVar.f280638l;
                    if (jVar2 != null) {
                        jVar2.ip(serviceTransportationWidgetItem, false, false);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ServiceTransportationWidget.Field<?> field, ServiceTransportationWidget.FieldValue fieldValue, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f280642t = field;
            this.f280643u = fieldValue;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = h.this.new a(this.f280642t, this.f280643u, continuation);
            aVar.f280640r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            T t12;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280639q;
            h hVar = h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                t12 = (T) this.f280640r;
                com.avito.android.services_transportation_widget.interactor.a aVar = hVar.f280628b;
                ServiceTransportationWidgetItem serviceTransportationWidgetItem = hVar.f280637k;
                this.f280640r = t12;
                this.f280639q = 1;
                obj = aVar.a(serviceTransportationWidgetItem, this.f280642t, this.f280643u, ServiceTransportationWidgetSource.f280514b, this);
                if (obj == coroutine_suspended) {
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
                t12 = (T) this.f280640r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (!U.e(t12)) {
                return G0.f406611a;
            }
            AbstractC43129d1 abstractC43129d1B = hVar.f280629c.b();
            C8355a c8355a = new C8355a(typedResult, hVar, null);
            this.f280640r = null;
            this.f280639q = 2;
            if (C43259k.g(abstractC43129d1B, c8355a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractCoroutineContextElement implements N {
        @Override // kotlinx.coroutines.N
        public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
            V2.f318762a.f(th2);
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.services_transportation_widget.interactor.a aVar, @Y61.k R0 r02, @Y61.k InterfaceC50307a interfaceC50307a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.services_transportation_widget.dialog.a aVar3, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f280628b = aVar;
        this.f280629c = r02;
        this.f280630d = interfaceC50307a;
        this.f280631e = aVar2;
        this.f280632f = aVar3;
        this.f280633g = gVar;
        b bVar = new b(N.f410714t2);
        this.f280634h = new C13444a();
        this.f280635i = U.a(r02.a().plus(bVar));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = (ServiceTransportationWidgetItem) aVar;
        this.f280630d.d(serviceTransportationWidgetItem.f280536j);
        this.f280638l = jVar;
        this.f280637k = serviceTransportationWidgetItem;
        if (jVar != null) {
            jVar.ip(serviceTransportationWidgetItem, false, false);
        }
        jVar.YL(new e(this));
        jVar.ah(new f(this));
        jVar.kp(new g(this, i12, serviceTransportationWidgetItem));
    }

    @Override // com.avito.android.services_transportation_widget.item.l
    public final void d1(@Y61.k DeepLink deepLink) {
        b.a.a(this.f280631e, deepLink, null, null, 6);
    }

    @Override // com.avito.android.services_transportation_widget.item.l
    public final void f1(@Y61.k ServiceTransportationWidget.Field<?> field) {
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = this.f280637k;
        this.f280630d.c(serviceTransportationWidgetItem != null ? serviceTransportationWidgetItem.f280536j : null, field.getFieldId());
        this.f280632f.a(field, new com.avito.android.offlinization.ui.a(this, 26));
    }

    @Override // com.avito.android.services_transportation_widget.item.l
    public final void i1(@Y61.k ServiceTransportationWidget.SwitchGroupField switchGroupField, @Y61.k ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValue, boolean z12) {
        ServiceTransportationWidget.SwitchGroupField switchGroupField2;
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = this.f280637k;
        this.f280630d.c(serviceTransportationWidgetItem != null ? serviceTransportationWidgetItem.f280536j : null, switchValue.getId());
        List<ServiceTransportationWidget.SwitchGroupField.SwitchValue> switches = switchGroupField.getSwitches();
        ArrayList arrayList = new ArrayList(C42745f0.q(switches, 10));
        for (ServiceTransportationWidget.SwitchGroupField.SwitchValue switchValueCopy$default : switches) {
            if (L.f(switchValueCopy$default.getId(), switchValue.getId())) {
                switchValueCopy$default = ServiceTransportationWidget.SwitchGroupField.SwitchValue.copy$default(switchValue, null, null, null, z12, 7, null);
            }
            arrayList.add(switchValueCopy$default);
        }
        ServiceTransportationWidget.SwitchGroupField switchGroupFieldCopy$default = ServiceTransportationWidget.SwitchGroupField.copy$default(switchGroupField, null, null, arrayList, 3, null);
        ServiceTransportationWidgetItem serviceTransportationWidgetItem2 = this.f280637k;
        if (serviceTransportationWidgetItem2 != null) {
            List<ServicesTransportationWidgetBlueprintItem> list = serviceTransportationWidgetItem2.f280533g;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a aVarA : list) {
                if (aVarA instanceof ServiceTransportationWidgetSwitchesItem) {
                    aVarA = ServiceTransportationWidgetSwitchesItem.a((ServiceTransportationWidgetSwitchesItem) aVarA, switchGroupFieldCopy$default, false, false, 6);
                }
                arrayList2.add(aVarA);
            }
            switchGroupField2 = switchGroupFieldCopy$default;
            this.f280637k = new ServiceTransportationWidgetItem(serviceTransportationWidgetItem2.f280528b, serviceTransportationWidgetItem2.f280529c, serviceTransportationWidgetItem2.f280530d, serviceTransportationWidgetItem2.f280531e, serviceTransportationWidgetItem2.f280532f, arrayList2, serviceTransportationWidgetItem2.f280534h, serviceTransportationWidgetItem2.f280535i, serviceTransportationWidgetItem2.f280536j, serviceTransportationWidgetItem2.f280537k, serviceTransportationWidgetItem2.f280538l, serviceTransportationWidgetItem2.f280539m, serviceTransportationWidgetItem2.f280540n, serviceTransportationWidgetItem2.f280541o);
        } else {
            switchGroupField2 = switchGroupFieldCopy$default;
        }
        ServiceTransportationWidget.SwitchGroupField.Switches selectedValue = switchGroupField2.getSelectedValue();
        if (selectedValue != null) {
            k(switchGroupField2, selectedValue);
        }
    }

    public final void k(ServiceTransportationWidget.Field<?> field, ServiceTransportationWidget.FieldValue fieldValue) {
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = this.f280637k;
        this.f280630d.a(serviceTransportationWidgetItem != null ? serviceTransportationWidgetItem.f280536j : null, field.getFieldId(), fieldValue);
        ServiceTransportationWidgetItem serviceTransportationWidgetItem2 = this.f280637k;
        if (serviceTransportationWidgetItem2 != null) {
            this.f280637k = serviceTransportationWidgetItem2;
            j jVar = this.f280638l;
            if (jVar != null) {
                jVar.ip(serviceTransportationWidgetItem2, true, false);
            }
        }
        N0 n02 = this.f280636j;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f280636j = C43259k.d(this.f280635i, null, null, new a(field, fieldValue, null), 3);
    }
}
