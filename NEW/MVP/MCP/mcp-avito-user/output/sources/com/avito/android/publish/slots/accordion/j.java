package com.avito.android.publish.slots.accordion;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category_parameters.f;
import com.avito.android.publish.C0;
import com.avito.android.publish.slots.q;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlotConfig;
import com.avito.android.util.P2;
import com.avito.android.validation.C36018l;
import com.avito.android.validation.d1;
import com.avito.android.validation.n1;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: AccordionSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/accordion/j;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/accordion/AccordionSlot;", "Lcom/avito/android/publish/slots/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends com.avito.android.category_parameters.k<AccordionSlot> implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AccordionSlot f242807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C0 f242808c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d1 f242809d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f242810e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C50213a f242811f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f242812g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f242813h = new com.jakewharton.rxrelay3.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Set<String> f242814i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final JO.a f242815j;

    /* compiled from: AccordionSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<String, Boolean> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(j.this.f242814i.contains(str));
        }
    }

    @i31.c
    public j(@InterfaceC41220a @Y61.k AccordionSlot accordionSlot, @Y61.k C0 c02, @Y61.k d1 d1Var, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f242807b = accordionSlot;
        this.f242808c = c02;
        this.f242809d = d1Var;
        this.f242810e = interfaceC28373a;
        this.f242811f = c50213a;
        this.f242812g = aVar;
        this.f242814i = C42745f0.P0(((AccordionSlotConfig) accordionSlot.getWidget().getConfig()).getContentFields());
        this.f242815j = new JO.a(accordionSlot.getId(), accordionSlot.getLabel(), ((AccordionSlotConfig) accordionSlot.getWidget().getConfig()).getIsExpanded());
    }

    @Override // com.avito.android.publish.slots.q
    @Y61.k
    public final z<com.avito.android.category_parameters.f> a() {
        return this.f242813h;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final z<P2<SuccessResult>> c() {
        CategoryParameters categoryParameters;
        C41998x0 c41998x0C0 = z.c0(new P2.b(new SuccessResult(null)));
        if (this.f242815j.f8935d || (categoryParameters = this.f242808c.f231873k0) == null) {
            return c41998x0C0;
        }
        List<ParameterSlot> parameters = categoryParameters.getParameters();
        SimpleParametersTree simpleParametersTree = new SimpleParametersTree(parameters);
        boolean z12 = false;
        for (ParameterSlot parameterSlot : parameters) {
            if (this.f242814i.contains(parameterSlot.getId())) {
                EditableParameter<?> editableParameter = parameterSlot instanceof EditableParameter ? (EditableParameter) parameterSlot : null;
                if (editableParameter != null) {
                    n1 n1VarA = this.f242809d.a(editableParameter, simpleParametersTree, false);
                    if (n1VarA instanceof n1.a) {
                        EditableParameter editableParameter2 = (EditableParameter) parameterSlot;
                        editableParameter2.setErrorMessage(n1VarA instanceof n1.a.c ? C36018l.a((n1.a.c) n1VarA, editableParameter2) : n1VarA instanceof n1.a.b ? ((n1.a.b) n1VarA).f319404c : null);
                        z12 = true;
                    }
                }
            }
        }
        if (!z12) {
            return c41998x0C0;
        }
        l(parameters, true);
        return z.c0(new P2.a(new AccordionSlotError()));
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (aVar instanceof JO.a) {
            l(null, !((JO.a) aVar).f8935d);
        }
        return f.c.f117644b;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f242807b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        return this.f242814i.isEmpty() ? C42784z0.f406748b : Collections.singletonList(this.f242815j);
    }

    public final void l(List list, boolean z12) {
        List<CategoryPublishStep> steps;
        String strSe;
        ((AccordionSlotConfig) this.f242807b.getWidget().getConfig()).setExpanded(z12);
        JO.a aVar = this.f242815j;
        aVar.f8935d = z12;
        C0 c02 = this.f242808c;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null || (steps = categoryParameters.getSteps()) == null || (strSe = c02.se()) == null) {
            return;
        }
        Iterator<CategoryPublishStep> it = steps.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(it.next().getId(), strSe)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            return;
        }
        CategoryPublishStep categoryPublishStep = steps.get(i12);
        CategoryPublishStep.Params params = categoryPublishStep instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStep : null;
        if (params == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(params.getFields());
        if (z12) {
            arrayList.addAll(this.f242814i);
        } else {
            arrayList.removeIf(new C28081y0(new a(), 11));
        }
        CategoryPublishStep.Params params2 = new CategoryPublishStep.Params(params.getId(), params.getHash(), params.getSubtype(), arrayList, params.getTitle(), params.getShortTitle(), params.getSubtitle(), params.getSkipOnBackwards(), params.getConfig());
        ArrayList arrayList2 = new ArrayList(steps);
        arrayList2.set(i12, params2);
        c02.Le(new CategoryParameters(categoryParameters.getNavigation(), categoryParameters.getRootNavigation(), list == null ? categoryParameters.getParameters() : list, arrayList2, categoryParameters.getTargetStepId(), categoryParameters.getChangedIds(), categoryParameters.getDraft(), categoryParameters.getShouldSaveDraft(), categoryParameters.getRedirectUri()));
        if (z12) {
            String strA = this.f242812g.a();
            Integer categoryId = categoryParameters.getNavigation().getCategoryId();
            String string = categoryId != null ? categoryId.toString() : null;
            Integer categoryId2 = categoryParameters.getNavigation().getCategoryId();
            this.f242810e.c(new c(strA, string, categoryId2 != null ? categoryId2.toString() : null, this.f242811f.b(), aVar.f8934c));
        }
    }

    @Override // com.avito.android.publish.slots.q
    public final void clear() {
    }
}
