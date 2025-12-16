package com.avito.android.rating_form.step.validations;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.validations.u;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StepValidationCoroutineInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/validations/s;", "Lcom/avito/android/rating_form/step/validations/r;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s implements r {

    /* compiled from: StepValidationCoroutineInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249755a;

        static {
            int[] iArr = new int[RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Rule.values().length];
            try {
                iArr[RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Rule.REQUIRED_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f249755a = iArr;
        }
    }

    @Inject
    public s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    @Override // com.avito.android.rating_form.step.validations.r
    @Y61.l
    public final LinkedHashMap a(@Y61.k StepIdentifier stepIdentifier, @Y61.k List list, @Y61.k Map map) {
        RatingFormAddValueType.StepsList.StepsListData.Step step;
        Object next;
        LinkedHashMap linkedHashMapA;
        List<RatingFormAddValueType.StepsList.StepsListData.Step.Validation> listF;
        Iterator it;
        ?? SingletonList;
        Object next2;
        RatingFormField ratingFormField;
        Iterator it2;
        u aVar;
        RatingFormField next3;
        RatingFormField ratingFormField2;
        Object next4;
        Object next5;
        StepIdentifier stepIdentifier2 = stepIdentifier;
        if (stepIdentifier.c()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it3.next();
                if (L.f(((RatingFormAddValueType.StepsList.StepsListData.Step) next5).getSlug(), stepIdentifier2.f247924c)) {
                    break;
                }
            }
            step = (RatingFormAddValueType.StepsList.StepsListData.Step) next5;
        } else if (stepIdentifier.c()) {
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (((RatingFormAddValueType.StepsList.StepsListData.Step) next).getId() == stepIdentifier2.f247923b) {
                    break;
                }
            }
            step = (RatingFormAddValueType.StepsList.StepsListData.Step) next;
        } else {
            step = null;
        }
        if (step == null || (listF = step.f()) == null) {
            linkedHashMapA = null;
        } else {
            List<RatingFormAddValueType.StepsList.StepsListData.Step.Validation> list2 = listF;
            int i12 = 10;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                RatingFormAddValueType.StepsList.StepsListData.Step.Validation validation = (RatingFormAddValueType.StepsList.StepsListData.Step.Validation) it5.next();
                RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Rule rule = validation.getRule();
                int i13 = 1;
                if ((rule == null ? -1 : a.f249755a[rule.ordinal()]) == 1) {
                    List<RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field> listC = validation.c();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, i12));
                    Iterator it6 = listC.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(((RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field) it6.next()).getSlug());
                    }
                    List list3 = (List) map.get(stepIdentifier2);
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it7 = map.entrySet().iterator();
                    while (it7.hasNext()) {
                        arrayList3.add((List) ((Map.Entry) it7.next()).getValue());
                    }
                    ArrayList arrayListH = C42745f0.H(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it8 = arrayListH.iterator();
                    while (it8.hasNext()) {
                        Object next6 = it8.next();
                        if (arrayList2.contains(((RatingFormField) next6).getSlug())) {
                            arrayList4.add(next6);
                        }
                    }
                    Iterator it9 = arrayList4.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it9.next();
                        RatingFormField.ValueType value = ((RatingFormField) next2).getValue();
                        RatingFormField.ValueType.StringValue stringValue = value instanceof RatingFormField.ValueType.StringValue ? (RatingFormField.ValueType.StringValue) value : null;
                        String str = stringValue != null ? stringValue.f248003b : null;
                        if (str != null && str.length() != 0) {
                            break;
                        }
                        RatingFormField.ValueType.LongValue longValue = value instanceof RatingFormField.ValueType.LongValue ? (RatingFormField.ValueType.LongValue) value : null;
                        if ((longValue != null ? Long.valueOf(longValue.f248001b) : null) != null) {
                            break;
                        }
                        RatingFormField.ValueType.IntArrayValue intArrayValue = value instanceof RatingFormField.ValueType.IntArrayValue ? (RatingFormField.ValueType.IntArrayValue) value : null;
                        if (O2.a(intArrayValue != null ? intArrayValue.f247999b : null)) {
                            break;
                        }
                    }
                    if (next2 != null) {
                        SingletonList = Collections.singletonList(u.b.f249761a);
                    } else {
                        List<RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field> listC2 = validation.c();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : listC2) {
                            RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field field = (RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field) obj;
                            if (list3 != null) {
                                Iterator it10 = list3.iterator();
                                while (true) {
                                    if (!it10.hasNext()) {
                                        next4 = null;
                                        break;
                                    }
                                    next4 = it10.next();
                                    if (L.f(((RatingFormField) next4).getSlug(), field.getSlug())) {
                                        break;
                                    }
                                }
                                ratingFormField2 = (RatingFormField) next4;
                            } else {
                                ratingFormField2 = null;
                            }
                            if (ratingFormField2 != null) {
                                arrayList5.add(obj);
                            }
                        }
                        SingletonList = new ArrayList(C42745f0.q(arrayList5, i12));
                        Iterator it11 = arrayList5.iterator();
                        int i14 = 0;
                        while (it11.hasNext()) {
                            Object next7 = it11.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field field2 = (RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field) next7;
                            if (list3 != null) {
                                Iterator it12 = list3.iterator();
                                while (true) {
                                    if (!it12.hasNext()) {
                                        next3 = 0;
                                        break;
                                    }
                                    next3 = it12.next();
                                    if (L.f(((RatingFormField) next3).getSlug(), field2.getSlug())) {
                                        break;
                                    }
                                }
                                ratingFormField = next3;
                            } else {
                                ratingFormField = null;
                            }
                            List<String> listC3 = field2.c();
                            String str2 = listC3 != null ? (String) C42745f0.G(listC3) : null;
                            if (i14 != arrayList5.size() - 1) {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (ratingFormField != null) {
                                FieldIdentifier fieldIdentifier = new FieldIdentifier(ratingFormField.getId(), ratingFormField.getSlug());
                                ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, i12));
                                Iterator it13 = arrayList5.iterator();
                                while (it13.hasNext()) {
                                    arrayList6.add(new FieldIdentifier(0, ((RatingFormAddValueType.StepsList.StepsListData.Step.Validation.Field) it13.next()).getSlug(), i13, null));
                                    it5 = it5;
                                }
                                it2 = it5;
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it14 = arrayList6.iterator();
                                while (it14.hasNext()) {
                                    Object next8 = it14.next();
                                    if (!L.f((FieldIdentifier) next8, fieldIdentifier)) {
                                        arrayList7.add(next8);
                                    }
                                }
                                aVar = new u.a(fieldIdentifier, str2, false, arrayList7);
                            } else {
                                it2 = it5;
                                aVar = u.b.f249761a;
                            }
                            SingletonList.add(aVar);
                            i14 = i15;
                            it5 = it2;
                            i12 = 10;
                        }
                    }
                    it = it5;
                } else {
                    it = it5;
                    SingletonList = Collections.singletonList(u.b.f249761a);
                }
                arrayList.add(SingletonList);
                stepIdentifier2 = stepIdentifier;
                it5 = it;
                i12 = 10;
            }
            ArrayList arrayListH2 = C42745f0.H(arrayList);
            ArrayList arrayList8 = new ArrayList();
            Iterator it15 = arrayListH2.iterator();
            while (it15.hasNext()) {
                Object next9 = it15.next();
                if (next9 instanceof u.a) {
                    arrayList8.add(next9);
                }
            }
            linkedHashMapA = v.a(arrayList8);
        }
        return linkedHashMapA == null ? new LinkedHashMap() : linkedHashMapA;
    }
}
