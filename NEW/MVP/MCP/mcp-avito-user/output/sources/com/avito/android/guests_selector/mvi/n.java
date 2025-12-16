package com.avito.android.guests_selector.mvi;

import com.avito.android.R;
import com.avito.android.guests_selector.io.Parameter;
import com.avito.android.guests_selector.io.ParameterBoolean;
import com.avito.android.guests_selector.items.adults_stepper.AdultsStepperItem;
import com.avito.android.guests_selector.items.child.ChildItem;
import com.avito.android.guests_selector.items.children_add_button.ChildrenAddButtonItem;
import com.avito.android.guests_selector.items.swither.SwitcherItem;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import hI.C40827a;
import hI.C40828b;
import hI.C40829c;
import iI.C41289a;
import iI.C41290b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GuestsSelectorViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/n;", "Lcom/avito/android/guests_selector/mvi/m;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.guests_selector.converter.a f161571a;

    /* compiled from: GuestsSelectorViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActivePageType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActivePageType activePageType = ActivePageType.f161554b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public n(@Y61.k com.avito.android.guests_selector.converter.a aVar) {
        this.f161571a = aVar;
    }

    @Override // com.avito.android.guests_selector.mvi.m
    @Y61.k
    public final C40827a a(@Y61.k C40827a c40827a, @Y61.k String str, boolean z12) {
        ArrayList arrayList = new ArrayList(c40827a.f397143l);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Parameter parameterBoolean = (Parameter) it.next();
            if (parameterBoolean instanceof ParameterBoolean) {
                if (L.f(parameterBoolean.getId(), str)) {
                    parameterBoolean = new ParameterBoolean(parameterBoolean.getId(), Boolean.valueOf(z12), ((ParameterBoolean) parameterBoolean).getTitle());
                } else {
                    parameterBoolean = (ParameterBoolean) parameterBoolean;
                }
            }
            arrayList2.add(parameterBoolean);
        }
        return b(C40827a.a(c40827a, null, 0, 0, 0, 0, 0, null, null, null, false, arrayList2, null, 3071));
    }

    @Override // com.avito.android.guests_selector.mvi.m
    @Y61.k
    public final C40827a b(@Y61.k C40827a c40827a) {
        PrintableText printableTextC;
        Object next;
        char c12 = 0;
        ActivePageType activePageType = c40827a.f397133b;
        int iOrdinal = activePageType.ordinal();
        List<C41290b> list = c40827a.f397140i;
        if (iOrdinal == 0) {
            printableTextC = com.avito.android.printable_text.b.c(R.string.guests_page_toolbar_title, new Serializable[0]);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            printableTextC = com.avito.android.printable_text.b.c(R.string.age_picker_toolbar_title, Integer.valueOf(list.size() + 1));
        }
        PrintableText printableText = printableTextC;
        int i12 = c40827a.f397135d;
        PrintableText printableTextB = ((i12 != Integer.MAX_VALUE) && (activePageType == ActivePageType.f161554b)) ? com.avito.android.printable_text.b.b(R.plurals.max_guests_title_plurals, i12, Integer.valueOf(i12)) : null;
        List<C41289a> list2 = c40827a.f397141j;
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (C41289a c41289a : list2) {
            linkedHashMap.put(c41289a.f398464a, c41289a.f398465b);
        }
        C40829c c40829c = new C40829c(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.adults_stepper_item_title, new Serializable[0]);
        PrintableText printableTextC3 = com.avito.android.printable_text.b.c(R.string.adults_stepper_item_description, new Serializable[0]);
        int size = i12 - list.size();
        int i13 = c40827a.f397136e;
        arrayList.add(new AdultsStepperItem(printableTextC2, printableTextC3, c40827a.f397138g, c40827a.f397134c, size > i13 ? i13 : size, null, 32, null));
        if (c40827a.f397142k) {
            arrayList.add(new ChildrenAddButtonItem(com.avito.android.printable_text.b.c(R.string.children_add_button_item_title, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.children_add_button_item_description, new Serializable[0]), i12 > list.size() + c40827a.f397138g && list.size() < c40827a.f397137f, null, 8, null));
            List<C41290b> list3 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            int i14 = 0;
            for (Object obj : list3) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C41290b c41290b = (C41290b) obj;
                Serializable[] serializableArr = new Serializable[1];
                serializableArr[c12] = Integer.valueOf(i15);
                PrintableText printableTextC4 = com.avito.android.printable_text.b.c(R.string.child_item_title, serializableArr);
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((C41289a) next).f398464a, c41290b.f398467b)) {
                        break;
                    }
                }
                C41289a c41289a2 = (C41289a) next;
                PrintableText printableText2 = c41289a2 != null ? c41289a2.f398465b : null;
                int i16 = c41290b.f398466a;
                arrayList2.add(new ChildItem(i16, printableTextC4, printableText2, String.valueOf(i16)));
                i14 = i15;
                c12 = 0;
            }
            arrayList.addAll(arrayList2);
        }
        this.f161571a.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Parameter parameter : c40827a.f397143l) {
            if (parameter instanceof ParameterBoolean) {
                String id2 = parameter.getId();
                ParameterBoolean parameterBoolean = (ParameterBoolean) parameter;
                AttributedText title = parameterBoolean.getTitle();
                Boolean value = parameterBoolean.getValue();
                arrayList3.add(new SwitcherItem(title, id2, value != null ? value.booleanValue() : false));
            }
        }
        arrayList.addAll(arrayList3);
        c40827a.f397144m.getClass();
        return C40827a.a(c40827a, null, 0, 0, 0, 0, 0, null, null, null, false, null, new C40828b(activePageType, printableText, printableTextB, c40829c, arrayList), 2047);
    }
}
