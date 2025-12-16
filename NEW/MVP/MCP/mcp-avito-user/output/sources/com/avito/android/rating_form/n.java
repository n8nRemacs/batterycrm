package com.avito.android.rating_form;

import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormFieldsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/n;", "Lcom/avito/android/rating_form/m;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final int f248808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.item.photo_picker.r f248809b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public StepIdentifier f248810c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Integer f248812e;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public List<RatingFormAddValueType.StepsList.StepsListData.Step> f248811d = C42784z0.f406748b;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248813f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248814g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248815h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248816i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248817j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248818k = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248819l = new LinkedHashMap();

    /* compiled from: RatingFormFieldsStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/n$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f248820a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f248821b;

        public a(@Y61.l String str, @Y61.l String str2) {
            this.f248820a = str;
            this.f248821b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f248820a, aVar.f248820a) && L.f(this.f248821b, aVar.f248821b);
        }

        public final int hashCode() {
            String str = this.f248820a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f248821b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishButtonTitlesHolder(finishButtonTitle=");
            sb2.append(this.f248820a);
            sb2.append(", emptyStepFinishButtonTitle=");
            return C22026a.c(sb2, this.f248821b, ')');
        }
    }

    public n(int i12, @Y61.k com.avito.android.rating_form.item.photo_picker.r rVar) {
        this.f248808a = i12;
        this.f248809b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (((com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.StringValue) r3).f248003b.length() == 0) goto L12;
     */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType r3) {
        /*
            boolean r0 = r3 instanceof com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.IntArrayValue
            if (r0 == 0) goto Ld
            com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType$IntArrayValue r3 = (com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.IntArrayValue) r3
            java.lang.Object r3 = r3.f247999b
            boolean r3 = r3.isEmpty()
            goto L43
        Ld:
            boolean r0 = r3 instanceof com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.LongArrayValue
            if (r0 == 0) goto L1a
            com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType$LongArrayValue r3 = (com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.LongArrayValue) r3
            java.util.ArrayList r3 = r3.f248000b
            boolean r3 = r3.isEmpty()
            goto L43
        L1a:
            boolean r0 = r3 instanceof com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.StringValue
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2e
            com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType$StringValue r3 = (com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.StringValue) r3
            java.lang.String r3 = r3.f248003b
            int r3 = r3.length()
            if (r3 != 0) goto L2c
        L2a:
            r3 = r2
            goto L43
        L2c:
            r3 = r1
            goto L43
        L2e:
            boolean r0 = r3 instanceof com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.StringArrayValue
            if (r0 == 0) goto L3b
            com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType$StringArrayValue r3 = (com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.StringArrayValue) r3
            java.lang.Object r3 = r3.f248002b
            boolean r3 = r3.isEmpty()
            goto L43
        L3b:
            boolean r0 = r3 instanceof com.avito.android.rating_form.api.remote.model.RatingFormField.ValueType.LongValue
            if (r0 == 0) goto L40
            goto L2c
        L40:
            if (r3 != 0) goto L44
            goto L2a
        L43:
            return r3
        L44:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.n.B(com.avito.android.rating_form.api.remote.model.RatingFormField$ValueType):boolean");
    }

    @Y61.l
    public final RatingFormAddValueType.StepsList.StepsListData.Step A(@Y61.l StepIdentifier stepIdentifier) {
        Object obj = null;
        if (stepIdentifier == null) {
            return null;
        }
        if (stepIdentifier.c()) {
            Iterator<T> it = this.f248811d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((RatingFormAddValueType.StepsList.StepsListData.Step) next).getSlug(), stepIdentifier.f247924c)) {
                    obj = next;
                    break;
                }
            }
            return (RatingFormAddValueType.StepsList.StepsListData.Step) obj;
        }
        int i12 = stepIdentifier.f247923b;
        if (i12 == -1) {
            return null;
        }
        Iterator<T> it2 = this.f248811d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((RatingFormAddValueType.StepsList.StepsListData.Step) next2).getId() == i12) {
                obj = next2;
                break;
            }
        }
        return (RatingFormAddValueType.StepsList.StepsListData.Step) obj;
    }

    public final void C(StepIdentifier stepIdentifier, String str, List<RatingFormField> list) {
        Object next;
        Map<String, ? extends Object> mapE;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((RatingFormField) next).e() != null) {
                    break;
                }
            }
        }
        RatingFormField ratingFormField = (RatingFormField) next;
        if (ratingFormField == null || (mapE = ratingFormField.e()) == null) {
            return;
        }
        this.f248809b.a(B.b(this.f248808a, stepIdentifier), str, mapE);
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final RatingFormAddValueType.StepsList.StepsListData.Step a() {
        return A(this.f248810c);
    }

    @Override // com.avito.android.rating_form.m
    public final void b(@Y61.l Integer num) {
        this.f248812e = num;
    }

    @Override // com.avito.android.rating_form.m
    public final boolean c(@Y61.l StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.FieldUpdate fieldUpdate) {
        ArrayList arrayList;
        Object next;
        List list = (List) this.f248813f.get(stepIdentifier);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof RatingFormField) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RatingFormField) next).getId() == fieldUpdate.getData().getFieldId()) {
                    break;
                }
            }
            RatingFormField ratingFormField = (RatingFormField) next;
            if (ratingFormField == null) {
                return false;
            }
            int iIndexOf = arrayList.indexOf(ratingFormField);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.set(numValueOf.intValue(), RatingFormField.a(ratingFormField, fieldUpdate.getData().e(), null, fieldUpdate.getData().getDisabled(), 4177855));
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.rating_form.m
    public final void d(@Y61.k List<RatingFormAddValueType.StepsList.StepsListData.Step> list) {
        this.f248811d = list;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.k
    public final LinkedHashMap e() {
        Map mapQ = P0.q(this.f248813f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapQ.size()));
        for (Map.Entry entry : mapQ.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof RatingFormField) {
                    RatingFormField ratingFormField = (RatingFormField) obj;
                    if (!((Boolean) this.f248819l.getOrDefault(new FieldIdentifier(ratingFormField.getId(), ratingFormField.getSlug()), Boolean.FALSE)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
            }
            linkedHashMap.put(key, new ArrayList(arrayList));
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final RatingFormField f(@Y61.k StepIdentifier stepIdentifier, @Y61.k FieldIdentifier fieldIdentifier, @Y61.l RatingFormField.ValueType valueType) {
        ArrayList arrayList;
        Object next;
        RatingFormField ratingFormField;
        Object next2;
        LinkedHashMap linkedHashMap = this.f248813f;
        List list = (List) linkedHashMap.get(stepIdentifier);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof RatingFormField) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            if (fieldIdentifier.d()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (L.f(((RatingFormField) next2).getSlug(), fieldIdentifier.f247886c)) {
                        break;
                    }
                }
                ratingFormField = (RatingFormField) next2;
            } else if (fieldIdentifier.c()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((RatingFormField) next).getId() == fieldIdentifier.f247885b) {
                        break;
                    }
                }
                ratingFormField = (RatingFormField) next;
            }
            if (ratingFormField == null) {
                return null;
            }
            int iIndexOf = arrayList.indexOf(ratingFormField);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf == -1) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                RatingFormField ratingFormFieldA = RatingFormField.a(ratingFormField, null, valueType, false, 4194175);
                List list2 = (List) linkedHashMap.get(stepIdentifier);
                if (list2 != null) {
                }
                return ratingFormFieldA;
            }
        }
        return null;
    }

    @Override // com.avito.android.rating_form.m
    public final void g(@Y61.k RatingFormAddValueType.HiddenFields.HiddenFieldsData hiddenFieldsData) {
        Map<String, RatingFormAddValueType.HiddenFields.HiddenFieldsData.HiddenFieldData> mapC = hiddenFieldsData.c();
        ArrayList arrayList = new ArrayList(mapC.size());
        for (Map.Entry<String, RatingFormAddValueType.HiddenFields.HiddenFieldsData.HiddenFieldData> entry : mapC.entrySet()) {
            arrayList.add(new Q(new FieldIdentifier(0, entry.getKey(), 1, null), Boolean.valueOf(entry.getValue().getHidden())));
        }
        for (Map.Entry entry2 : P0.p(arrayList).entrySet()) {
            FieldIdentifier fieldIdentifier = (FieldIdentifier) entry2.getKey();
            Boolean bool = (Boolean) entry2.getValue();
            bool.getClass();
            this.f248819l.putIfAbsent(fieldIdentifier, bool);
        }
    }

    @Override // com.avito.android.rating_form.m
    public final void h(@Y61.k RatingFormField ratingFormField) {
        this.f248818k.put(ratingFormField.k(), ratingFormField);
    }

    @Override // com.avito.android.rating_form.m
    public final void i(@Y61.l StepIdentifier stepIdentifier) {
        this.f248810c = stepIdentifier;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.k
    public final List<RatingFormAddValueType.StepsList.StepsListData.Step> j() {
        return this.f248811d;
    }

    @Override // com.avito.android.rating_form.m
    public final void k(@Y61.k FieldIdentifier fieldIdentifier) {
        this.f248818k.remove(fieldIdentifier);
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final String l(@Y61.k StepIdentifier stepIdentifier) {
        RatingFormAddValueType.StepsList.StepsListData.Step stepA = A(stepIdentifier);
        if (stepA != null) {
            return stepA.getFocusOnField();
        }
        return null;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    /* renamed from: m, reason: from getter */
    public final StepIdentifier getF248810c() {
        return this.f248810c;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.k
    public final ArrayList n() {
        LinkedHashMap linkedHashMap = this.f248818k;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((RatingFormField) ((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final String o(@Y61.k StepIdentifier stepIdentifier) {
        RatingFormAddValueType.StepsList.StepsListData.Step step;
        Object next;
        Object next2;
        if (stepIdentifier.c()) {
            Iterator<T> it = this.f248811d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (L.f(((RatingFormAddValueType.StepsList.StepsListData.Step) next2).getSlug(), stepIdentifier.f247924c)) {
                    break;
                }
            }
            step = (RatingFormAddValueType.StepsList.StepsListData.Step) next2;
        } else {
            int i12 = stepIdentifier.f247923b;
            if (i12 != -1) {
                Iterator<T> it2 = this.f248811d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((RatingFormAddValueType.StepsList.StepsListData.Step) next).getId() == i12) {
                        break;
                    }
                }
                step = (RatingFormAddValueType.StepsList.StepsListData.Step) next;
            } else {
                step = null;
            }
        }
        if (step != null) {
            return step.getTitle();
        }
        return null;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final String p(@Y61.k StepIdentifier stepIdentifier) {
        return (String) this.f248817j.get(stepIdentifier);
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final String q(@Y61.k StepIdentifier stepIdentifier) {
        List list;
        a aVar = (a) this.f248814g.get(stepIdentifier);
        if (aVar == null || (list = (List) this.f248813f.get(stepIdentifier)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof RatingFormField) {
                arrayList.add(obj);
            }
        }
        boolean z12 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!B(((RatingFormField) it.next()).getValue())) {
                    z12 = false;
                    break;
                }
            }
        }
        String str = aVar.f248821b;
        if (str != null) {
            String str2 = z12 ? str : null;
            if (str2 != null) {
                return str2;
            }
        }
        return aVar.f248820a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final ArrayList r(@Y61.l StepIdentifier stepIdentifier) {
        RatingFormField ratingFormField;
        RatingFormField next;
        Object next2;
        List<Parcelable> list = (List) this.f248813f.get(stepIdentifier);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelableA : list) {
            if (!(parcelableA instanceof RatingFormAddValueType.RatingFormText ? true : parcelableA instanceof RatingFormAddValueType.RatingFormPromoBlock)) {
                if (!(parcelableA instanceof RatingFormField)) {
                    throw new NoWhenBranchMatchedException();
                }
                RatingFormField ratingFormField2 = (RatingFormField) parcelableA;
                FieldIdentifier fieldIdentifierK = ratingFormField2.k();
                boolean zD2 = fieldIdentifierK.d();
                LinkedHashMap linkedHashMap = this.f248818k;
                if (zD2) {
                    Iterator it = linkedHashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        if (L.f(((RatingFormField) next2).getSlug(), fieldIdentifierK.f247886c)) {
                            break;
                        }
                    }
                    ratingFormField = (RatingFormField) next2;
                } else if (fieldIdentifierK.c()) {
                    Iterator it2 = linkedHashMap.values().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = 0;
                            break;
                        }
                        next = it2.next();
                        if (((RatingFormField) next).getId() == fieldIdentifierK.f247885b) {
                            break;
                        }
                    }
                    ratingFormField = next;
                } else {
                    ratingFormField = null;
                }
                if (L.f(this.f248819l.get(fieldIdentifierK), Boolean.TRUE)) {
                    parcelableA = null;
                } else {
                    RatingFormField.ValueType value = ratingFormField != null ? ratingFormField.getValue() : null;
                    if (value == null) {
                        value = ratingFormField2.getValue();
                    }
                    parcelableA = RatingFormField.a(ratingFormField2, null, value, false, 4194175);
                }
            }
            if (parcelableA != null) {
                arrayList.add(parcelableA);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final AttributedText s(@Y61.k StepIdentifier stepIdentifier) {
        return (AttributedText) this.f248816i.get(stepIdentifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    @Override // com.avito.android.rating_form.m
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.rating_form.C34198a> t(@Y61.k com.avito.android.rating_form.StepIdentifier r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.n.t(com.avito.android.rating_form.StepIdentifier):java.util.List");
    }

    @Override // com.avito.android.rating_form.m
    public final void u(@Y61.k StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.RenderList.RenderListData renderListData, boolean z12, @Y61.l String str, boolean z13) {
        ArrayList arrayList = new ArrayList(renderListData.getItems());
        a aVar = new a(renderListData.getFinishButtonTitle(), renderListData.getEmptyStepFinishButtonTitle());
        LinkedHashMap linkedHashMap = this.f248813f;
        LinkedHashMap linkedHashMap2 = this.f248814g;
        if (z12 || !z13) {
            if (z13) {
                linkedHashMap2.put(stepIdentifier, aVar);
            } else {
                LinkedHashMap linkedHashMap3 = this.f248815h;
                List<RatingFormAddValueType.Button> listC = renderListData.c();
                if (listC == null) {
                    listC = C42784z0.f406748b;
                }
                linkedHashMap3.put(stepIdentifier, listC);
            }
            linkedHashMap.put(stepIdentifier, arrayList);
        } else {
            linkedHashMap2.putIfAbsent(stepIdentifier, aVar);
            linkedHashMap.putIfAbsent(stepIdentifier, arrayList);
        }
        if (str != null) {
            List<RatingFormAddValueType.RatingFormItem> items = renderListData.getItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof RatingFormField) {
                    arrayList2.add(obj);
                }
            }
            C(stepIdentifier, str, arrayList2);
        }
        AttributedText disclaimer = renderListData.getDisclaimer();
        if (disclaimer != null) {
            this.f248816i.put(stepIdentifier, disclaimer);
        }
        String toastErrorMessage = renderListData.getToastErrorMessage();
        if (toastErrorMessage != null) {
            this.f248817j.put(stepIdentifier, toastErrorMessage);
        }
    }

    @Override // com.avito.android.rating_form.m
    public final void v(@Y61.k List<? extends List<String>> list) {
        Object next;
        LinkedHashMap linkedHashMap = this.f248819l;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldIdentifier) it.next()).f247886c);
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (arrayList.containsAll((List) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        List list2 = (List) next;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                linkedHashMap.put(new FieldIdentifier(0, (String) it3.next(), 1, null), Boolean.FALSE);
            }
        }
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    /* renamed from: w, reason: from getter */
    public final Integer getF248812e() {
        return this.f248812e;
    }

    @Override // com.avito.android.rating_form.m
    public final void x(@Y61.k StepIdentifier stepIdentifier, @Y61.k RatingFormAddValueType.FieldsList.FieldsListData fieldsListData, boolean z12, @Y61.l String str, boolean z13) {
        ArrayList arrayList = new ArrayList(fieldsListData.f());
        a aVar = new a(fieldsListData.getFinishButtonTitle(), fieldsListData.getEmptyStepFinishButtonTitle());
        LinkedHashMap linkedHashMap = this.f248813f;
        LinkedHashMap linkedHashMap2 = this.f248814g;
        if (z12 || !z13) {
            if (z13) {
                linkedHashMap2.put(stepIdentifier, aVar);
            } else {
                LinkedHashMap linkedHashMap3 = this.f248815h;
                List<RatingFormAddValueType.Button> listC = fieldsListData.c();
                if (listC == null) {
                    listC = C42784z0.f406748b;
                }
                linkedHashMap3.put(stepIdentifier, listC);
            }
            linkedHashMap.put(stepIdentifier, arrayList);
        } else {
            linkedHashMap2.putIfAbsent(stepIdentifier, aVar);
            linkedHashMap.putIfAbsent(stepIdentifier, arrayList);
        }
        if (str != null) {
            C(stepIdentifier, str, fieldsListData.f());
        }
        AttributedText disclaimer = fieldsListData.getDisclaimer();
        if (disclaimer != null) {
            this.f248816i.put(stepIdentifier, disclaimer);
        }
        String toastErrorMessage = fieldsListData.getToastErrorMessage();
        if (toastErrorMessage != null) {
            this.f248817j.put(stepIdentifier, toastErrorMessage);
        }
    }

    @Override // com.avito.android.rating_form.m
    @Y61.l
    public final ArrayList y(@Y61.l StepIdentifier stepIdentifier) {
        ArrayList arrayListR = r(stepIdentifier);
        if (arrayListR == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (obj instanceof RatingFormField) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.rating_form.m
    public final int z(@Y61.l StepIdentifier stepIdentifier) {
        List<RatingFormAddValueType.StepsList.StepsListData.Step> list = this.f248811d;
        if (stepIdentifier == null) {
            return -1;
        }
        int i12 = 0;
        if (stepIdentifier.c()) {
            Iterator<RatingFormAddValueType.StepsList.StepsListData.Step> it = list.iterator();
            while (it.hasNext()) {
                if (!L.f(it.next().getSlug(), stepIdentifier.f247924c)) {
                    i12++;
                }
            }
            return -1;
        }
        int i13 = stepIdentifier.f247923b;
        if (i13 == -1) {
            return -1;
        }
        Iterator<RatingFormAddValueType.StepsList.StepsListData.Step> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().getId() != i13) {
                i12++;
            }
        }
        return -1;
        return i12;
    }
}
