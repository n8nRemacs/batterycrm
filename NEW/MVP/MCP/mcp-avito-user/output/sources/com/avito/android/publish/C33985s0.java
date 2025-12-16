package com.avito.android.publish;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlotConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;

/* compiled from: PublishParametersInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "result", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.s0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33985s0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CategoryParameters f239109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33883n0 f239110c;

    public C33985s0(CategoryParameters categoryParameters, C33883n0 c33883n0) {
        this.f239109b = categoryParameters;
        this.f239110c = c33883n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        CategoryParameters categoryParameters;
        List<CategoryPublishStep> steps;
        SlotWidget<AccordionSlotConfig> widget;
        AccordionSlotConfig accordionSlotConfig;
        List<ParameterSlot> parameters;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success) || (steps = (categoryParameters = (CategoryParameters) ((TypedResult.Success) typedResult).getResult()).getSteps()) == null) {
            return typedResult;
        }
        List<CategoryPublishStep> list = steps;
        if ((list instanceof Collection) && list.isEmpty()) {
            return typedResult;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((CategoryPublishStep) it.next()) instanceof CategoryPublishStep.Accordion) {
                ArrayList arrayList = new ArrayList();
                for (T t12 : list) {
                    if (t12 instanceof CategoryPublishStep.Accordion) {
                        arrayList.add(t12);
                    }
                }
                Iterator it2 = arrayList.iterator();
                CategoryParameters categoryParametersCopy$default = categoryParameters;
                while (it2.hasNext()) {
                    CategoryPublishStep.Accordion accordion = (CategoryPublishStep.Accordion) it2.next();
                    int iIndexOf = steps.indexOf(accordion) - 1;
                    if (iIndexOf >= 0) {
                        CategoryPublishStep categoryPublishStep = steps.get(iIndexOf);
                        AccordionSlot accordionSlot = null;
                        CategoryPublishStep.Params params = categoryPublishStep instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStep : null;
                        if (params != null) {
                            CategoryParameters categoryParameters2 = this.f239109b;
                            if (categoryParameters2 != null && (parameters = categoryParameters2.getParameters()) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (T t13 : parameters) {
                                    if (t13 instanceof AccordionSlot) {
                                        arrayList2.add(t13);
                                    }
                                }
                                Iterator it3 = arrayList2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next = it3.next();
                                    if (kotlin.jvm.internal.L.f(((AccordionSlot) next).getId(), accordion.getId())) {
                                        accordionSlot = next;
                                        break;
                                    }
                                }
                                accordionSlot = accordionSlot;
                            }
                            AccordionSlot accordionSlot2 = new AccordionSlot(accordion.getId(), accordion.getTitle(), new SlotWidget(SlotType.ACCORDION, new AccordionSlotConfig(accordion.getFields(), (accordionSlot == null || (widget = accordionSlot.getWidget()) == null || (accordionSlotConfig = (AccordionSlotConfig) widget.getConfig()) == null) ? false : accordionSlotConfig.getIsExpanded())));
                            ArrayList arrayList3 = new ArrayList(params.getFields());
                            arrayList3.add(accordion.getId());
                            if (((AccordionSlotConfig) accordionSlot2.getWidget().getConfig()).getIsExpanded()) {
                                arrayList3.addAll(accordion.getFields());
                            }
                            ArrayList arrayList4 = new ArrayList(categoryParametersCopy$default.getParameters());
                            if (accordionSlot != null) {
                                final C33983r0 c33983r0 = new C33983r0(accordionSlot);
                                arrayList4.removeIf(new Predicate() { // from class: com.avito.android.publish.q0
                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj2) {
                                        return ((Boolean) c33983r0.invoke(obj2)).booleanValue();
                                    }
                                });
                            }
                            arrayList4.add(accordionSlot2);
                            String str = C33883n0.f237442k;
                            this.f239110c.getClass();
                            CategoryPublishStep.Params params2 = new CategoryPublishStep.Params(params.getId(), params.getHash(), params.getSubtype(), arrayList3, params.getTitle(), params.getShortTitle(), params.getSubtitle(), params.getSkipOnBackwards(), params.getConfig());
                            ArrayList arrayList5 = new ArrayList(steps);
                            arrayList5.set(iIndexOf, params2);
                            steps = arrayList5;
                            categoryParametersCopy$default = CategoryParameters.copy$default(categoryParametersCopy$default, null, null, arrayList4, arrayList5, null, null, null, false, null, 499, null);
                        }
                    }
                }
                return new TypedResult.Success(categoryParametersCopy$default);
            }
        }
        return typedResult;
    }
}
