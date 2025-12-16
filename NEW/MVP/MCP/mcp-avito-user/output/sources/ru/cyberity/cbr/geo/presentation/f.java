package ru.cyberity.cbr.geo.presentation;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.source.applicant.remote.o;
import ru.cyberity.cbr.core.presentation.form.model.CountriesData;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: LocationItemExtensions.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/geo/presentation/e;", "Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "countriesData", "", "", "countryStates", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "a", "(Lru/cyberity/cbr/geo/presentation/e;Lru/cyberity/cbr/core/presentation/form/model/CountriesData;Ljava/util/Map;)Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "(Lru/cyberity/cbr/geo/presentation/e;)Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {

    /* compiled from: LocationItemExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434606a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.country.ordinal()] = 1;
            iArr[FieldName.town.ordinal()] = 2;
            iArr[FieldName.street.ordinal()] = 3;
            iArr[FieldName.subStreet.ordinal()] = 4;
            iArr[FieldName.postCode.ordinal()] = 5;
            iArr[FieldName.flatNumber.ordinal()] = 6;
            iArr[FieldName.buildingNumber.ordinal()] = 7;
            iArr[FieldName.state.ordinal()] = 8;
            f434606a = iArr;
        }
    }

    @l
    public static final FormItem a(@k e eVar, @k CountriesData countriesData, @k Map<String, ? extends Map<String, String>> map) {
        FormItem.Text text;
        Set<Map.Entry<String, String>> setEntrySet;
        ru.cyberity.cbr.core.data.source.applicant.remote.h hVarA = a(eVar);
        FieldName name = eVar.getField().getName();
        arrayList = null;
        ArrayList arrayList = null;
        switch (name == null ? -1 : a.f434606a[name.ordinal()]) {
            case 1:
                Map<String, String> mapH = countriesData.getCountriesData().h();
                if (mapH == null) {
                    mapH = P0.c();
                }
                Map<String, String> map2 = mapH;
                CharSequence value = eVar.getValue();
                String string = value != null ? value.toString() : null;
                CharSequence value2 = eVar.getValue();
                return new FormItem.CountrySelect("geo+poa", hVarA, map2, string, value2 == null || C43066x.K(value2), eVar.getError());
            case 2:
                CharSequence value3 = eVar.getValue();
                String string2 = value3 != null ? value3.toString() : null;
                CharSequence value4 = eVar.getValue();
                text = new FormItem.Text(hVarA, "geo+poa", string2, value4 == null || C43066x.K(value4), eVar.getError(), null, 32, null);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                CharSequence value5 = eVar.getValue();
                text = new FormItem.Text(hVarA, "geo+poa", value5 != null ? value5.toString() : null, false, eVar.getError(), null, 40, null);
                break;
            case 8:
                CharSequence value6 = eVar.getValue();
                String string3 = value6 != null ? value6.toString() : null;
                CharSequence value7 = eVar.getValue();
                boolean z12 = value7 == null || C43066x.K(value7);
                CharSequence error = eVar.getError();
                FieldName name2 = eVar.getField().getName();
                String value8 = name2 != null ? name2.getValue() : null;
                CharSequence title = eVar.getTitle();
                String string4 = title != null ? title.toString() : null;
                CharSequence hint = eVar.getHint();
                String string5 = hint != null ? hint.toString() : null;
                Boolean boolValueOf = Boolean.valueOf(eVar.getField().getIsRequired());
                String currentCountryKey = countriesData.getCountriesData().getCurrentCountryKey();
                if (currentCountryKey == null) {
                    currentCountryKey = "";
                }
                Map<String, String> map3 = map.get(currentCountryKey);
                if (map3 != null && (setEntrySet = map3.entrySet()) != null) {
                    arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(new o((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
                return new FormItem.SelectDropdown(new ru.cyberity.cbr.core.data.source.applicant.remote.h(value8, string4, string5, (String) null, boolValueOf, (String) null, (String) null, (String) null, arrayList, 232, (C42822w) null), "geo+poa", string3, z12, error);
            default:
                return null;
        }
        return text;
    }

    private static final ru.cyberity.cbr.core.data.source.applicant.remote.h a(e eVar) {
        String strB = eVar.getField().b();
        CharSequence title = eVar.getTitle();
        String string = title != null ? title.toString() : null;
        CharSequence hint = eVar.getHint();
        return new ru.cyberity.cbr.core.data.source.applicant.remote.h(strB, string, hint != null ? hint.toString() : null, (String) null, Boolean.valueOf(eVar.getField().getIsRequired()), "android_tetxt_cap_words", (String) null, (String) null, (List) null, 456, (C42822w) null);
    }
}
