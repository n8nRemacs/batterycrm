package com.avito.android.mortgage.person_form.mvi.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.mortgage.api.model.FormItemValueModel;
import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.InputFormContentType;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.items.form.SuggestFormFillsIn;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.alert_banner.AlertBannerItem;
import com.avito.android.mortgage.person_form.list.items.checkbox.CheckboxItem;
import com.avito.android.mortgage.person_form.list.items.child.ChildItem;
import com.avito.android.mortgage.person_form.list.items.child_button.ChildButtonItem;
import com.avito.android.mortgage.person_form.list.items.chips.ChipsItem;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import com.avito.android.mortgage.person_form.list.items.select.SelectItem;
import com.avito.android.mortgage.person_form.list.items.suggestion_banner.SuggestionBannerItem;
import com.avito.android.mortgage.person_form.list.items.text.TextItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: PersonFormDomainToUiMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/mapper/b;", "Lcom/avito/android/mortgage/person_form/mvi/mapper/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.mortgage.person_form.mvi.mapper.a {

    /* compiled from: PersonFormDomainToUiMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201269a;

        static {
            int[] iArr = new int[InputFormContentType.values().length];
            try {
                iArr[InputFormContentType.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputFormContentType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputFormContentType.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputFormContentType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InputFormContentType.PERCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InputFormContentType.NUMBER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InputFormContentType.FMS_UNIT_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InputFormContentType.PASSPORT_SERIES_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InputFormContentType.PERSON_INN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InputFormContentType.ORGANIZATION_INN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InputFormContentType.MONEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InputFormContentType.SHILS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f201269a = iArr;
        }
    }

    @Inject
    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(com.avito.android.mortgage.api.model.items.form.d r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "employees"
            boolean r0 = kotlin.jvm.internal.L.f(r10, r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = " сотрудников"
            goto L18
        Lb:
            java.lang.String r0 = "age"
            boolean r0 = kotlin.jvm.internal.L.f(r10, r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = " компании"
            goto L18
        L16:
            java.lang.String r0 = ""
        L18:
            java.lang.String r1 = "phone"
            boolean r10 = kotlin.jvm.internal.L.f(r10, r1)
            boolean r1 = r9 instanceof com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue
            r2 = 0
            if (r1 == 0) goto L60
            com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue r9 = (com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue) r9
            if (r10 == 0) goto L5a
            java.lang.String r4 = r9.getValue()
            if (r4 == 0) goto L57
            com.avito.android.lib.design.input.FormatterType$a r9 = com.avito.android.lib.design.input.FormatterType.f179288e
            r9.getClass()
            com.avito.android.lib.design.input.FormatterType r9 = com.avito.android.lib.design.input.FormatterType.f179290g
            com.avito.android.lib.design.input.MaskParameters r10 = r9.f179302d
            if (r10 == 0) goto L41
            java.lang.String r1 = "+7 "
            r3 = 2046(0x7fe, float:2.867E-42)
            com.avito.android.lib.design.input.MaskParameters r10 = com.avito.android.lib.design.input.MaskParameters.a(r10, r1, r2, r3)
            goto L42
        L41:
            r10 = r2
        L42:
            com.avito.android.lib.design.input.FormatterType r3 = com.avito.android.lib.design.input.FormatterType.a(r9, r10)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            java.lang.String r5 = ""
            r6 = 2147483647(0x7fffffff, float:NaN)
            com.avito.android.lib.design.input.d r9 = com.avito.android.lib.design.input.c.d(r3, r4, r5, r6, r7, r8)
            java.lang.String r9 = r9.f179394a
            goto Ldd
        L57:
            r9 = r2
            goto Ldd
        L5a:
            java.lang.String r9 = r9.getValue()
            goto Ldd
        L60:
            boolean r10 = r9 instanceof com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue
            if (r10 == 0) goto L72
            com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue r9 = (com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue) r9
            com.avito.android.mortgage.api.model.FormItemValueModel r9 = r9.getValue()
            if (r9 == 0) goto L57
            java.lang.String r9 = r9.getValue()
            goto Ldd
        L72:
            boolean r10 = r9 instanceof com.avito.android.mortgage.api.model.items.form.c
            if (r10 == 0) goto La8
            com.avito.android.mortgage.api.model.items.form.c r9 = (com.avito.android.mortgage.api.model.items.form.c) r9
            java.util.List r10 = r9.d()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L82:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r10.next()
            r3 = r1
            LZ.d r3 = (LZ.d) r3
            java.lang.String r3 = r3.getValue()
            java.lang.String r4 = r9.g()
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 == 0) goto L82
            goto L9f
        L9e:
            r1 = r2
        L9f:
            LZ.d r1 = (LZ.d) r1
            if (r1 == 0) goto L57
            java.lang.String r9 = r1.getLabel()
            goto Ldd
        La8:
            boolean r10 = r9 instanceof com.avito.android.mortgage.api.model.items.form.e
            if (r10 == 0) goto L57
            com.avito.android.mortgage.api.model.items.form.e r9 = (com.avito.android.mortgage.api.model.items.form.e) r9
            java.util.List r10 = r9.c()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        Lb8:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r10.next()
            r3 = r1
            LZ.d r3 = (LZ.d) r3
            java.lang.String r3 = r3.getValue()
            java.lang.String r4 = r9.g()
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 == 0) goto Lb8
            goto Ld5
        Ld4:
            r1 = r2
        Ld5:
            LZ.d r1 = (LZ.d) r1
            if (r1 == 0) goto L57
            java.lang.String r9 = r1.getLabel()
        Ldd:
            if (r9 == 0) goto Le3
            java.lang.String r2 = r9.concat(r0)
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.mapper.b.b(com.avito.android.mortgage.api.model.items.form.d, java.lang.String):java.lang.String");
    }

    public static InputItem c(InputFormContentItemValue inputFormContentItemValue) {
        FormatterType formatterTypeB;
        Set setL0 = C42756l.l0(new InputFormContentType[]{InputFormContentType.DATE, InputFormContentType.FMS_UNIT_CODE});
        String id2 = inputFormContentItemValue.getId();
        String name = inputFormContentItemValue.getName();
        String title = inputFormContentItemValue.getTitle();
        String placeholder = inputFormContentItemValue.getPlaceholder();
        String str = placeholder == null ? "" : placeholder;
        String value = inputFormContentItemValue.getValue();
        String str2 = value == null ? "" : value;
        String subtitle = inputFormContentItemValue.getSubtitle();
        AttributedText attributedSubtitle = inputFormContentItemValue.getAttributedSubtitle();
        PrintableText error = inputFormContentItemValue.getError();
        switch (a.f201269a[inputFormContentItemValue.d().ordinal()]) {
            case 1:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179289f;
                break;
            case 2:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179290g;
                break;
            case 3:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.a.b();
                break;
            case 4:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179294k;
                break;
            case 5:
                FormatterType.f179288e.getClass();
                com.avito.android.lib.design.input.e eVar = com.avito.android.lib.design.input.e.f179396a;
                Locale locale = Locale.getDefault();
                eVar.getClass();
                locale.getLanguage();
                formatterTypeB = com.avito.android.lib.design.input.e.f179400e;
                break;
            case 6:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.a.c();
                break;
            case 7:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179297n;
                break;
            case 8:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179295l;
                break;
            case 9:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179296m;
                break;
            case 10:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179296m;
                break;
            case 11:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179291h;
                break;
            case 12:
                FormatterType.f179288e.getClass();
                formatterTypeB = FormatterType.f179299p;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new InputItem(id2, name, title, str, str2, subtitle, attributedSubtitle, error, formatterTypeB, inputFormContentItemValue.getIsMasked(), inputFormContentItemValue.getIsCompact(), setL0.contains(inputFormContentItemValue.d()), false, 4096, null);
    }

    @Override // com.avito.android.mortgage.person_form.mvi.mapper.a
    @k
    public final ArrayList a(@k List list) {
        List listSingletonList;
        Object next;
        String value;
        char c12 = 0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.android.mortgage.api.model.items.form.d dVar = ((LZ.c) obj).f9996b;
            if (!(dVar instanceof SuggestFormContentItemValue ? ((SuggestFormContentItemValue) dVar).getIsHidden() || ((SuggestFormContentItemValue) dVar).getIsDisclosed() : dVar.getIsHidden())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (((LZ.c) next2).f9995a == FormContentItemType.SUGGEST) {
                arrayList2.add(next2);
            }
        }
        int i12 = 10;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((SuggestFormContentItemValue) ((LZ.c) it2.next()).f9996b);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            if (!((SuggestFormContentItemValue) next3).f198235c) {
                arrayList4.add(next3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            C42745f0.h(((SuggestFormContentItemValue) it4.next()).g(), arrayList5);
        }
        o0 o0Var = new o0(C43033p.i(C43033p.i(C43033p.i(new C42770s0(arrayList), new c(C42745f0.P0(arrayList5))), new d(this)), e.f201272l), f.f201273l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o0.a aVar = new o0.a(o0Var);
        while (aVar.f410559b.hasNext()) {
            Object next4 = aVar.next();
            linkedHashMap.put(((com.avito.android.mortgage.api.model.items.form.d) next4).getId(), next4);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            if (!linkedHashMap.containsKey(((LZ.c) next5).f9996b.getId())) {
                arrayList6.add(next5);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            com.avito.android.mortgage.api.model.items.form.d dVar2 = ((LZ.c) it6.next()).f9996b;
            if (dVar2 instanceof com.avito.android.mortgage.api.model.items.form.a) {
                com.avito.android.mortgage.api.model.items.form.a aVar2 = (com.avito.android.mortgage.api.model.items.form.a) dVar2;
                listSingletonList = Collections.singletonList(new AlertBannerItem(aVar2.getId(), aVar2.getText(), false, 4, null));
            } else if (dVar2 instanceof com.avito.android.mortgage.api.model.items.form.b) {
                com.avito.android.mortgage.api.model.items.form.b bVar = (com.avito.android.mortgage.api.model.items.form.b) dVar2;
                listSingletonList = Collections.singletonList(new CheckboxItem(bVar.getId(), bVar.getName(), bVar.getValue(), bVar.getTitle(), false, 16, null));
            } else if (dVar2 instanceof LZ.b) {
                LZ.b bVar2 = (LZ.b) dVar2;
                List<LZ.a> listD = bVar2.d();
                ArrayList arrayList8 = new ArrayList(C42745f0.q(listD, i12));
                for (LZ.a aVar3 : listD) {
                    String id2 = aVar3.getId();
                    String id3 = bVar2.getId();
                    String title = aVar3.getTitle();
                    InputItem inputItemC = c(aVar3.getInput());
                    com.avito.android.mortgage.api.model.items.form.b checkbox = aVar3.getCheckbox();
                    arrayList8.add(new ChildItem(id2, id3, title, inputItemC, new CheckboxItem(checkbox.getId(), checkbox.getName(), checkbox.getValue(), checkbox.getTitle(), false, 16, null), false, 32, null));
                }
                ArrayList arrayList9 = new ArrayList(arrayList8);
                if (bVar2.getAddButtonTitle() != null) {
                    arrayList9.add(new ChildButtonItem(bVar2.getId(), bVar2.getAddButtonTitle(), false, 4, null));
                }
                listSingletonList = arrayList9;
            } else {
                if (dVar2 instanceof com.avito.android.mortgage.api.model.items.form.c) {
                    com.avito.android.mortgage.api.model.items.form.c cVar = (com.avito.android.mortgage.api.model.items.form.c) dVar2;
                    String id4 = cVar.getId();
                    String title2 = cVar.getTitle();
                    String subtitle = cVar.getSubtitle();
                    AttributedText attributedSubtitle = cVar.getAttributedSubtitle();
                    List<LZ.d> listD2 = cVar.d();
                    ArrayList arrayList10 = new ArrayList(C42745f0.q(listD2, i12));
                    for (LZ.d dVar3 : listD2) {
                        arrayList10.add(new ChipsItem.Chip(dVar3.getValue(), dVar3.getLabel()));
                    }
                    listSingletonList = Collections.singletonList(new ChipsItem(id4, title2, subtitle, attributedSubtitle, arrayList10, cVar.g(), cVar.getError(), !cVar.getIsRequired(), cVar.getCanEdit(), false, 512, null));
                } else if (dVar2 instanceof InputFormContentItemValue) {
                    listSingletonList = Collections.singletonList(c((InputFormContentItemValue) dVar2));
                } else if (dVar2 instanceof SuggestFormContentItemValue) {
                    SuggestFormContentItemValue suggestFormContentItemValue = (SuggestFormContentItemValue) dVar2;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (suggestFormContentItemValue.g().contains((String) entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    List<SuggestFormFillsIn> listF = suggestFormContentItemValue.f();
                    if (listF == null) {
                        listF = C42784z0.f406748b;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj2 : listF) {
                        if (((SuggestFormFillsIn) obj2).getIsPrimary()) {
                            arrayList11.add(obj2);
                        }
                    }
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it7 = arrayList11.iterator();
                    while (it7.hasNext()) {
                        SuggestFormFillsIn suggestFormFillsIn = (SuggestFormFillsIn) it7.next();
                        com.avito.android.mortgage.api.model.items.form.d dVar4 = (com.avito.android.mortgage.api.model.items.form.d) linkedHashMap2.get(suggestFormFillsIn.getId());
                        String strB = dVar4 != null ? b(dVar4, suggestFormFillsIn.getDataAttr()) : null;
                        if (strB != null) {
                            arrayList12.add(strB);
                        }
                    }
                    List<SuggestFormFillsIn> listF2 = suggestFormContentItemValue.f();
                    if (listF2 == null) {
                        listF2 = C42784z0.f406748b;
                    }
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj3 : listF2) {
                        if (!((SuggestFormFillsIn) obj3).getIsPrimary()) {
                            arrayList13.add(obj3);
                        }
                    }
                    ArrayList arrayList14 = new ArrayList();
                    Iterator it8 = arrayList13.iterator();
                    while (it8.hasNext()) {
                        SuggestFormFillsIn suggestFormFillsIn2 = (SuggestFormFillsIn) it8.next();
                        com.avito.android.mortgage.api.model.items.form.d dVar5 = (com.avito.android.mortgage.api.model.items.form.d) linkedHashMap2.get(suggestFormFillsIn2.getId());
                        String strB2 = dVar5 != null ? b(dVar5, suggestFormFillsIn2.getDataAttr()) : null;
                        if (strB2 != null) {
                            arrayList14.add(strB2);
                        }
                    }
                    String id5 = suggestFormContentItemValue.getId();
                    String name = suggestFormContentItemValue.getName();
                    String title3 = suggestFormContentItemValue.getTitle();
                    String placeholder = suggestFormContentItemValue.getPlaceholder();
                    FormItemValueModel value2 = suggestFormContentItemValue.getValue();
                    String str = (value2 == null || (value = value2.getValue()) == null) ? "" : value;
                    String subtitle2 = suggestFormContentItemValue.getSubtitle();
                    AttributedText attributedSubtitle2 = suggestFormContentItemValue.getAttributedSubtitle();
                    PrintableText error = suggestFormContentItemValue.getError();
                    FormatterType.f179288e.getClass();
                    PersonFormItem[] personFormItemArr = new PersonFormItem[1];
                    personFormItemArr[c12] = new InputItem(id5, name, title3, placeholder, str, subtitle2, attributedSubtitle2, error, FormatterType.f179289f, suggestFormContentItemValue.getIsMasked(), suggestFormContentItemValue.getIsCompact(), false, false, 4096, null);
                    ArrayList arrayListE0 = C42745f0.e0(personFormItemArr);
                    if (!arrayList12.isEmpty() || !arrayList14.isEmpty()) {
                        arrayListE0.add(new SuggestionBannerItem("banner-" + suggestFormContentItemValue.getId(), suggestFormContentItemValue.getId(), arrayList12, arrayList14, false, 16, null));
                    }
                    listSingletonList = arrayListE0;
                } else if (dVar2 instanceof com.avito.android.mortgage.api.model.items.form.e) {
                    com.avito.android.mortgage.api.model.items.form.e eVar = (com.avito.android.mortgage.api.model.items.form.e) dVar2;
                    String id6 = eVar.getId();
                    String title4 = eVar.getTitle();
                    String subtitle3 = eVar.getSubtitle();
                    AttributedText attributedSubtitle3 = eVar.getAttributedSubtitle();
                    String placeholder2 = eVar.getPlaceholder();
                    String str2 = placeholder2 == null ? "" : placeholder2;
                    PrintableText error2 = eVar.getError();
                    List<LZ.d> listC = eVar.c();
                    ArrayList arrayList15 = new ArrayList(C42745f0.q(listC, 10));
                    for (LZ.d dVar6 : listC) {
                        arrayList15.add(new SelectItem.Option(dVar6.getValue(), dVar6.getLabel()));
                    }
                    boolean z12 = !eVar.getIsRequired();
                    Iterator<T> it9 = eVar.c().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        if (L.f(((LZ.d) next).getValue(), eVar.g())) {
                            break;
                        }
                    }
                    LZ.d dVar7 = (LZ.d) next;
                    SelectItem.Option option = dVar7 != null ? new SelectItem.Option(dVar7.getValue(), dVar7.getLabel()) : null;
                    i12 = 10;
                    listSingletonList = Collections.singletonList(new SelectItem(id6, title4, subtitle3, attributedSubtitle3, str2, error2, arrayList15, option, z12, eVar.getIsCompact(), false, 1024, null));
                } else {
                    i12 = 10;
                    if (!(dVar2 instanceof com.avito.android.mortgage.api.model.items.form.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.mortgage.api.model.items.form.f fVar = (com.avito.android.mortgage.api.model.items.form.f) dVar2;
                    listSingletonList = Collections.singletonList(new TextItem(fVar.getId(), fVar.getText(), false, 4, null));
                }
                i12 = 10;
            }
            C42745f0.h(listSingletonList, arrayList7);
            c12 = 0;
        }
        return arrayList7;
    }
}
