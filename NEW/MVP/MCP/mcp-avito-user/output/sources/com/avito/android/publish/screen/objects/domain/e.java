package com.avito.android.publish.screen.objects.domain;

import Gd0.C13868b;
import Ge0.InterfaceC13872a;
import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.details.b;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.publish.screen.objects.di.InterfaceC34011b;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import com.avito.android.publish.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestSetFieldValue;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import yc.C50213a;

/* compiled from: ObjectFillFormItemsClicksInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/e;", "Lcom/avito/android/publish/screen/objects/domain/d;", "Lcom/avito/android/publish/view/a;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d, com.avito.android.publish.view.a, b.InterfaceC4110b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f239970b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ObjectFillFormScreenParams f239971c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PublishParametersInteractor f239972d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.details.b f239973e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.domain.repository.a f239974f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.publish.view.a f239975g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC28373a f239976h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C50213a f239977i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f239978j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.domain.repository.e f239979k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.publish.imv.f f239980l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC33535v f239981m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Q1 f239982n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f239983o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @k
    public final e2 f239984p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final j f239985q;

    /* compiled from: ObjectFillFormItemsClicksInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements l<ObjectFillFormInternalAction, G0> {
        @Override // Y41.l
        public final G0 invoke(ObjectFillFormInternalAction objectFillFormInternalAction) {
            ((Y1) this.receiver).K5(objectFillFormInternalAction);
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormItemsClicksInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f239987c;

        public b(String str) {
            this.f239987c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AbstractC35806h3 abstractC35806h3 = (AbstractC35806h3) obj;
            boolean zEquals = abstractC35806h3.equals(AbstractC35806h3.e.f318894a);
            e eVar = e.this;
            if (zEquals) {
                eVar.f239984p.K5(new ObjectFillFormInternalAction.UpdateValidationProgress(true));
                return;
            }
            boolean z12 = abstractC35806h3 instanceof AbstractC35806h3.d;
            String str = this.f239987c;
            if (z12) {
                eVar.f239979k.f();
                ParameterSlot parameterSlotFindParameter = eVar.f239974f.wa().findParameter(str);
                SelectParameter selectParameter = parameterSlotFindParameter instanceof SelectParameter ? (SelectParameter) parameterSlotFindParameter : null;
                if (selectParameter != null) {
                    selectParameter.applyChosenValue();
                }
                eVar.f239984p.K5(new ObjectFillFormInternalAction.UpdateValidationProgress(false));
                eVar.f();
                return;
            }
            if (abstractC35806h3 instanceof AbstractC35806h3.a) {
                ParameterSlot parameterSlotFindParameter2 = eVar.f239974f.wa().findParameter(str);
                MultiselectParameter multiselectParameter = parameterSlotFindParameter2 instanceof MultiselectParameter ? (MultiselectParameter) parameterSlotFindParameter2 : null;
                if (multiselectParameter != null) {
                    multiselectParameter.rollbackToOldValue();
                }
                e2 e2Var = eVar.f239984p;
                e2Var.K5(new ObjectFillFormInternalAction.UpdateValidationProgress(false));
                e2Var.K5(new ObjectFillFormInternalAction.UpdateValidationProgress(false));
                ApiError apiError = ((AbstractC35806h3.a) abstractC35806h3).f318890a;
                if (apiError instanceof ApiError.Unauthorized) {
                    e2Var.K5(ObjectFillFormInternalAction.NavigateToAuth.f240200b);
                } else {
                    e2Var.K5(new ObjectFillFormInternalAction.ShowErrorAlert(apiError.getF244063c()));
                }
            }
        }
    }

    /* compiled from: ObjectFillFormItemsClicksInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f239988b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to updateObjectForm onError", (Throwable) obj);
        }
    }

    @Inject
    public e(@InterfaceC34011b boolean z12, @k ObjectFillFormScreenParams objectFillFormScreenParams, @k PublishParametersInteractor publishParametersInteractor, @k com.avito.android.details.b bVar, @k com.avito.android.publish.screen.objects.domain.repository.a aVar, @k com.avito.android.publish.view.a aVar2, @k InterfaceC28373a interfaceC28373a, @k C50213a c50213a, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.publish.screen.objects.domain.repository.e eVar, @k com.avito.android.publish.imv.f fVar, @k InterfaceC33535v interfaceC33535v, @k Q1 q12) {
        this.f239970b = z12;
        this.f239971c = objectFillFormScreenParams;
        this.f239972d = publishParametersInteractor;
        this.f239973e = bVar;
        this.f239974f = aVar;
        this.f239975g = aVar2;
        this.f239976h = interfaceC28373a;
        this.f239977i = c50213a;
        this.f239978j = interfaceC35745a5;
        this.f239979k = eVar;
        this.f239980l = fVar;
        this.f239981m = interfaceC33535v;
        this.f239982n = q12;
        e2 e2VarB = f2.b(0, 32, null, 5);
        this.f239984p = e2VarB;
        this.f239985q = new j(new a(1, e2VarB, Y1.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8));
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        return this.f239975g.C0();
    }

    @Override // com.avito.android.publish.view.a
    public final void F(@k com.avito.android.details.a aVar) {
        this.f239975g.F(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void G(@k com.avito.conveyor_item.a aVar) {
        this.f239975g.G(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void Q9(@k ItemWithAdditionalButton itemWithAdditionalButton) {
        this.f239975g.Q9(itemWithAdditionalButton);
    }

    @Override // com.avito.android.publish.view.a
    public final void U7(@k ParameterElement.C29377e c29377e, @Y61.l Long l12) {
        this.f239975g.U7(c29377e, l12);
    }

    @Override // com.avito.android.publish.view.a
    public final void Z2(@k com.avito.android.items.d dVar, @k String str, boolean z12) {
        this.f239975g.Z2(dVar, str, z12);
    }

    @Override // com.avito.android.publish.screen.objects.domain.d
    public final void a(@k InterfaceC13872a.o oVar) {
        if (oVar instanceof InterfaceC13872a.o.C0360a) {
            InterfaceC13872a.o.C0360a c0360a = (InterfaceC13872a.o.C0360a) oVar;
            be(c0360a.f6644a, c0360a.f6645b, c0360a.f6646c, c0360a.f6647d, c0360a.f6648e);
            return;
        }
        if (oVar instanceof InterfaceC13872a.o.b) {
            G(((InterfaceC13872a.o.b) oVar).f6649a);
            return;
        }
        boolean z12 = oVar instanceof InterfaceC13872a.o.c;
        com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f239974f;
        if (z12) {
            InterfaceC13872a.o.c cVar = (InterfaceC13872a.o.c) oVar;
            com.avito.android.items.d dVar = cVar.f6650a;
            Z2(dVar, cVar.f6651b, cVar.f6652c);
            if (this.f239970b) {
                String strB8 = aVar.b8();
                String strDc = aVar.dc();
                this.f239976h.c(new C13868b(this.f239977i, dVar.getF117481f(), strB8, strDc, dVar.getF117480e(), aVar.Z5()));
                return;
            }
            return;
        }
        boolean z13 = oVar instanceof InterfaceC13872a.o.f;
        com.avito.android.details.b bVar = this.f239973e;
        if (z13) {
            InterfaceC13872a.o.f fVar = (InterfaceC13872a.o.f) oVar;
            bVar.j(fVar.f6656a, fVar.f6658c, fVar.f6657b);
            return;
        }
        if (oVar instanceof InterfaceC13872a.o.j) {
            SelectedSuggestInstitute selectedSuggestInstitute = ((InterfaceC13872a.o.j) oVar).f6664a;
            bVar.a0(selectedSuggestInstitute.f291979b, selectedSuggestInstitute.f291980c);
            return;
        }
        if (oVar instanceof InterfaceC13872a.o.k) {
            InterfaceC13872a.o.k kVar = (InterfaceC13872a.o.k) oVar;
            ParameterSlot parameterSlotFindParameter = aVar.wa().findParameter(kVar.f6665a.f8494a);
            if (parameterSlotFindParameter != null) {
                bVar.m3(kVar.f6665a, parameterSlotFindParameter, true);
                return;
            }
            return;
        }
        if (oVar instanceof InterfaceC13872a.o.d) {
            InterfaceC13872a.o.e eVar = ((InterfaceC13872a.o.d) oVar).f6653a;
            if (eVar != null) {
                ParameterSlot parameterSlotFindParameter2 = aVar.wa().findParameter(eVar.f6654a);
                PriceParameter priceParameter = parameterSlotFindParameter2 instanceof PriceParameter ? (PriceParameter) parameterSlotFindParameter2 : null;
                if (priceParameter != null) {
                    priceParameter.setValue(eVar.f6655b);
                }
            }
            f();
            return;
        }
        boolean z14 = oVar instanceof InterfaceC13872a.o.g;
        e2 e2Var = this.f239984p;
        if (z14) {
            InterfaceC13872a.o.g gVar = (InterfaceC13872a.o.g) oVar;
            e2Var.K5(new ObjectFillFormInternalAction.ShowDatePickerDialog(gVar.f6659a, gVar.f6660b));
        } else if (oVar instanceof InterfaceC13872a.o.h) {
            InterfaceC13872a.o.h hVar = (InterfaceC13872a.o.h) oVar;
            e2Var.K5(new ObjectFillFormInternalAction.ShowDateTimeRangeDialog(hVar.f6661a, hVar.f6662b));
        } else if (oVar instanceof InterfaceC13872a.o.i) {
            e2Var.K5(new ObjectFillFormInternalAction.ShowSuggestInstitutesDialog(((InterfaceC13872a.o.i) oVar).f6663a));
        }
    }

    @Override // com.avito.android.publish.view.a
    public final void be(@k ParameterElement.C29376d c29376d, @k ParameterElement.C29377e c29377e, @Y61.l Long l12, boolean z12, boolean z13) {
        this.f239975g.be(c29376d, c29377e, l12, z12, z13);
    }

    @Override // com.avito.android.publish.screen.objects.domain.d
    /* renamed from: c, reason: from getter */
    public final e2 getF239984p() {
        return this.f239984p;
    }

    @Override // com.avito.android.publish.view.a
    public final void c0() {
        this.f239975g.c0();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
        if (str == null) {
            f();
            return;
        }
        com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f239974f;
        aVar.C7();
        ObjectsParameter objectsParameterDc = aVar.Dc();
        List<ParameterSlot> parameters = aVar.C0().getParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
        for (ParameterSlot parameterSlot2 : parameters) {
            if ((parameterSlot2 instanceof ObjectsParameter) && L.f(parameterSlot2.getId(), objectsParameterDc.getId())) {
                parameterSlot2 = objectsParameterDc;
            }
            arrayList.add(parameterSlot2);
        }
        CategoryParameters categoryParametersCopy$default = CategoryParameters.copy$default(aVar.C0(), null, null, arrayList, null, null, null, null, false, null, 507, null);
        O oK2 = this.f239972d.c(aVar.C0().getNavigation(), categoryParametersCopy$default, null).K(new h(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f239978j;
        this.f239983o.b(oK2.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new b(str), c.f239988b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.publish.view.a
    public final void e(@k a.b bVar) {
        this.f239975g.e(bVar);
    }

    public final void f() {
        this.f239979k.b();
    }

    @Override // com.avito.android.publish.screen.objects.domain.d
    public final void f0() {
        this.f239983o.dispose();
        c0();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
        f();
    }

    @Override // com.avito.android.publish.screen.objects.domain.d
    public final void q() {
        e(this.f239985q);
        com.avito.android.publish.screen.objects.domain.repository.a aVar = this.f239974f;
        F(aVar);
        com.avito.android.details.b bVar = this.f239973e;
        bVar.L3(this);
        bVar.I(aVar);
        ObjectFillFormScreenParams objectFillFormScreenParams = this.f239971c;
        if (objectFillFormScreenParams.f237559d != null && this.f239982n.x().invoke().booleanValue()) {
            ObjectFillFormScreenParams.SelectedValue selectedValue = objectFillFormScreenParams.f237559d;
            Ij.b bVar2 = new Ij.b(selectedValue.f237560b, new m(selectedValue.f237561c, selectedValue.f237562d, null, true, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null), null, 4, null);
            ParameterSlot parameterSlotFindParameter = aVar.wa().findParameter(bVar2.f8494a);
            if (parameterSlotFindParameter != null) {
                bVar.m3(bVar2, parameterSlotFindParameter, true);
            }
        }
        I<com.avito.android.publish.imv.a> iA2 = this.f239980l.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f239978j;
        this.f239983o.b(iA2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new f(this), g.f239990b));
    }

    @Override // com.avito.android.publish.screen.objects.domain.d
    public final void s(@k BubbleInfo bubbleInfo) {
        List<SuggestAction> actions = bubbleInfo.getActions();
        if (actions == null) {
            actions = C42784z0.f406748b;
        }
        for (SuggestAction suggestAction : actions) {
            if (suggestAction instanceof SuggestAnalyticsEvent) {
                this.f239981m.w0((SuggestAnalyticsEvent) suggestAction);
            } else if (suggestAction instanceof SuggestSetFieldValue) {
                SuggestSetFieldValue suggestSetFieldValue = (SuggestSetFieldValue) suggestAction;
                String fieldId = suggestSetFieldValue.getFieldId();
                String value = suggestSetFieldValue.getValue();
                ParameterSlot parameterSlotFindParameter = this.f239974f.wa().findParameter(fieldId);
                PriceParameter priceParameter = parameterSlotFindParameter instanceof PriceParameter ? (PriceParameter) parameterSlotFindParameter : null;
                if (priceParameter != null) {
                    priceParameter.setValue(value);
                }
                f();
            }
        }
    }

    @Override // com.avito.android.details.e
    @Y61.l
    public final ParametersTree wa() {
        return this.f239975g.wa();
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@k AddressParameter addressParameter) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@k String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
    }
}
