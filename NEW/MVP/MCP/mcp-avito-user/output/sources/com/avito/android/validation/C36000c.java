package com.avito.android.validation;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.Quarter;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SubLocationParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSelect;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.O2;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;

/* compiled from: CategoryParameterStringValueConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/validation/c;", "Lcom/avito/android/validation/b;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.validation.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36000c implements InterfaceC35998b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NumberFormat f319348a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f319349b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Locale f319350c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f319351d;

    /* compiled from: CategoryParameterStringValueConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/validation/c$a;", "", "<init>", "()V", "", "COMMA_SEPARATOR", "Ljava/lang/String;", "DOT_SEPARATOR", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
    /* renamed from: com.avito.android.validation.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C36000c(@Y61.k NumberFormat numberFormat, @Y61.k InterfaceC35945t1<String> interfaceC35945t1, @Y61.k Locale locale, @Y61.k Resources resources) {
        this.f319348a = numberFormat;
        this.f319349b = interfaceC35945t1;
        this.f319350c = locale;
        this.f319351d = resources;
    }

    public static String b(EditableParameter editableParameter) {
        Object value;
        if (!editableParameter.hasValue() || (value = editableParameter.getValue()) == null) {
            return null;
        }
        return value.toString();
    }

    @Override // com.avito.android.validation.InterfaceC35998b
    @Y61.l
    public final String a(@Y61.k CategoryParameter categoryParameter) {
        List<? extends District> value;
        List<? extends Metro> value2;
        Date date;
        DateRangeParameter.FormattedDateParameter checkOut;
        Date date2;
        String string;
        Object next;
        List<SectionedMultiselectParameter.Tab> tabs;
        SectionedMultiselectParameter.Displaying displaying;
        List<String> titlePlural;
        List<SectionedMultiselectParameter.Tab> tabs2;
        int size;
        Object next2;
        if (categoryParameter instanceof ResidentialComplexSelect) {
            SelectParameter.Value selectedValue = ((ResidentialComplexSelect) categoryParameter).getSelectedValue();
            if (selectedValue != null) {
                return selectedValue.getTitle();
            }
        } else if (categoryParameter instanceof SelectParameter) {
            SelectParameter.Value selectedValue2 = ((SelectParameter) categoryParameter).getSelectedValue();
            if (selectedValue2 != null) {
                return selectedValue2.getTitle();
            }
        } else {
            if (categoryParameter instanceof MultiselectParameter) {
                MultiselectParameter multiselectParameter = (MultiselectParameter) categoryParameter;
                List<? extends String> value3 = multiselectParameter.getValue();
                if (value3 != null && (size = value3.size()) != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : value3) {
                            Iterator<T> it = multiselectParameter.getValues().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                if (kotlin.jvm.internal.L.f(((MultiselectParameter.Value) next2).getId(), str)) {
                                    break;
                                }
                            }
                            MultiselectParameter.Value value4 = (MultiselectParameter.Value) next2;
                            String title = value4 != null ? value4.getTitle() : null;
                            if (title != null) {
                                arrayList.add(title);
                            }
                        }
                        return C42745f0.O(arrayList, null, null, null, null, 63);
                    }
                    Iterator<T> it2 = multiselectParameter.getValues().iterator();
                    Object obj = null;
                    while (true) {
                        if (it2.hasNext()) {
                            Object next3 = it2.next();
                            if (value3.contains(((MultiselectParameter.Value) next3).getId())) {
                                if (i != 0) {
                                    break;
                                }
                                i = 1;
                                obj = next3;
                            }
                        } else if (i == 0) {
                            break;
                        }
                    }
                    obj = null;
                    MultiselectParameter.Value value5 = (MultiselectParameter.Value) obj;
                    if (value5 != null) {
                        return value5.getTitle();
                    }
                }
            } else {
                boolean z12 = categoryParameter instanceof SectionedMultiselectParameter;
                Resources resources = this.f319351d;
                if (z12) {
                    SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) categoryParameter;
                    SectionedMultiselectParameter.Displaying displaying2 = sectionedMultiselectParameter.getDisplaying();
                    if (O2.a(displaying2 != null ? displaying2.getTitlePlural() : null)) {
                        Set<? extends String> value6 = sectionedMultiselectParameter.getValue();
                        if (value6 != null && !value6.isEmpty() && (displaying = sectionedMultiselectParameter.getDisplaying()) != null && (titlePlural = displaying.getTitlePlural()) != null) {
                            int size2 = value6.size();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            SectionedMultiselectParameter.Displaying displaying3 = sectionedMultiselectParameter.getDisplaying();
                            if (displaying3 != null && (tabs2 = displaying3.getTabs()) != null) {
                                for (SectionedMultiselectParameter.Tab tab : tabs2) {
                                    List<SectionedMultiselectParameter.Value> values = sectionedMultiselectParameter.getValues();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : values) {
                                        if (tab.getGroupIds().contains(((SectionedMultiselectParameter.Value) obj2).getId())) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        List<SectionedMultiselectParameter.Value> options = ((SectionedMultiselectParameter.Value) it3.next()).getOptions();
                                        if (options == null) {
                                            options = C42784z0.f406748b;
                                        }
                                        C42745f0.h(options, arrayList3);
                                    }
                                    linkedHashMap.put(tab, arrayList3);
                                }
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                Iterable iterable = (Iterable) entry.getValue();
                                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    Iterator it4 = iterable.iterator();
                                    while (it4.hasNext()) {
                                        if (!value6.contains(((SectionedMultiselectParameter.Value) it4.next()).getId())) {
                                            break;
                                        }
                                    }
                                }
                                size2 -= ((List) entry.getValue()).size();
                            }
                            if (size2 != 0) {
                                C35996a c35996a = C35996a.f319338a;
                                String str2 = (String) C42745f0.K(0, titlePlural);
                                String str3 = (String) C42745f0.K(1, titlePlural);
                                String str4 = (String) C42745f0.K(2, titlePlural);
                                c35996a.getClass();
                                int i12 = size2 % 10;
                                switch (size2 % 100) {
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        str2 = str4;
                                        break;
                                    default:
                                        if (i12 != 1) {
                                            if (i12 == 2 || i12 == 3 || i12 == 4) {
                                                if (str3 != null) {
                                                    str2 = str3;
                                                    break;
                                                }
                                            } else if (str4 != null) {
                                                str2 = str4;
                                                break;
                                            }
                                            str2 = "";
                                            break;
                                        } else if (str2 == null) {
                                            str2 = "";
                                        }
                                        break;
                                }
                                return resources.getString(R.string.section_multiselect_value, Integer.valueOf(size2), str2);
                            }
                        }
                    } else {
                        SectionedMultiselectParameter.Displaying displaying4 = sectionedMultiselectParameter.getDisplaying();
                        if ((displaying4 != null ? displaying4.getTabs() : null) != null) {
                            Set<? extends String> value7 = sectionedMultiselectParameter.getValue();
                            if (value7 != null && !value7.isEmpty()) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                SectionedMultiselectParameter.Displaying displaying5 = sectionedMultiselectParameter.getDisplaying();
                                if (displaying5 != null && (tabs = displaying5.getTabs()) != null) {
                                    for (SectionedMultiselectParameter.Tab tab2 : tabs) {
                                        List<SectionedMultiselectParameter.Value> values2 = sectionedMultiselectParameter.getValues();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj3 : values2) {
                                            if (tab2.getGroupIds().contains(((SectionedMultiselectParameter.Value) obj3).getId())) {
                                                arrayList4.add(obj3);
                                            }
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it5 = arrayList4.iterator();
                                        while (it5.hasNext()) {
                                            List<SectionedMultiselectParameter.Value> options2 = ((SectionedMultiselectParameter.Value) it5.next()).getOptions();
                                            if (options2 == null) {
                                                options2 = C42784z0.f406748b;
                                            }
                                            C42745f0.h(options2, arrayList5);
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it6 = arrayList5.iterator();
                                        while (it6.hasNext()) {
                                            Object next4 = it6.next();
                                            if (value7.contains(((SectionedMultiselectParameter.Value) next4).getId())) {
                                                arrayList6.add(next4);
                                            }
                                        }
                                        linkedHashMap2.put(tab2, C42745f0.O0(arrayList6));
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList(linkedHashMap2.size());
                                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                    List<String> groupIds = ((SectionedMultiselectParameter.Tab) entry2.getKey()).getGroupIds();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (String str5 : groupIds) {
                                        Iterator<T> it7 = sectionedMultiselectParameter.getValues().iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it7.next();
                                            if (kotlin.jvm.internal.L.f(((SectionedMultiselectParameter.Value) next).getId(), str5)) {
                                                break;
                                            }
                                        }
                                        SectionedMultiselectParameter.Value value8 = (SectionedMultiselectParameter.Value) next;
                                        if (value8 != null) {
                                            arrayList8.add(value8);
                                        }
                                    }
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it8 = arrayList8.iterator();
                                    while (it8.hasNext()) {
                                        List<SectionedMultiselectParameter.Value> options3 = ((SectionedMultiselectParameter.Value) it8.next()).getOptions();
                                        if (options3 == null) {
                                            options3 = C42784z0.f406748b;
                                        }
                                        C42745f0.h(options3, arrayList9);
                                    }
                                    int size3 = C42745f0.P0(arrayList9).size();
                                    if (((Collection) entry2.getValue()).isEmpty() || ((Set) entry2.getValue()).size() == size3) {
                                        string = resources.getString(R.string.sectioned_multiselect_title_prefix, ((SectionedMultiselectParameter.Tab) entry2.getKey()).getTabTitle());
                                    } else {
                                        string = C42745f0.O((Iterable) entry2.getValue(), ", ", null, null, C36008g.f319375l, 30);
                                        if (string.length() == 0) {
                                            string = null;
                                        }
                                    }
                                    arrayList7.add(string);
                                }
                                String strO = C42745f0.O(arrayList7, " · ", null, null, null, 62);
                                if (strO.length() != 0) {
                                    return strO;
                                }
                            }
                        } else {
                            Set<? extends String> value9 = sectionedMultiselectParameter.getValue();
                            if (value9 != null && !value9.isEmpty()) {
                                Set setF = C43033p.F(C43033p.y(C43033p.i(C43033p.p(new C42770s0(sectionedMultiselectParameter.getValues()), C36002d.f319356l), new C36004e(value9)), C36006f.f319369l));
                                if (!setF.isEmpty()) {
                                    return C42745f0.O(setF, " · ", null, null, null, 62);
                                }
                            }
                        }
                    }
                } else if (categoryParameter instanceof LocationParameter) {
                    Location value10 = ((LocationParameter) categoryParameter).getValue();
                    if (value10 != null) {
                        return value10.getName(1);
                    }
                } else if (categoryParameter instanceof SubLocationParameter) {
                    Sublocation value11 = ((SubLocationParameter) categoryParameter).getValue();
                    if (value11 != null) {
                        return value11.getTitle();
                    }
                } else if (categoryParameter instanceof AddressParameter) {
                    AddressParameter.Value value12 = ((AddressParameter) categoryParameter).getValue();
                    if (value12 != null) {
                        return value12.getText();
                    }
                } else if (categoryParameter instanceof RadiusParameter) {
                    Radius value13 = ((RadiusParameter) categoryParameter).getValue();
                    if (value13 != null) {
                        return value13.getTitle();
                    }
                } else if (categoryParameter instanceof NumericParameter) {
                    Double value14 = ((NumericParameter) categoryParameter).getValue();
                    if (value14 != null) {
                        return this.f319348a.format(value14.doubleValue());
                    }
                } else if (categoryParameter instanceof DateRangeParameter) {
                    DateRangeParameter dateRangeParameter = (DateRangeParameter) categoryParameter;
                    DateRangeParameter.FormattedDateParameter checkIn = dateRangeParameter.getCheckIn();
                    if (checkIn != null && (date = checkIn.toDate()) != null && (checkOut = dateRangeParameter.getCheckOut()) != null && (date2 = checkOut.toDate()) != null) {
                        String string2 = resources.getString(R.string.date_format);
                        Locale locale = this.f319350c;
                        return resources.getString(R.string.date_range, new SimpleDateFormat(string2, locale).format(date), new SimpleDateFormat(resources.getString(R.string.date_format), locale).format(date2));
                    }
                } else if (categoryParameter instanceof MetroParameter) {
                    MetroParameter metroParameter = (MetroParameter) categoryParameter;
                    List<? extends Metro> value15 = metroParameter.getValue();
                    if ((value15 != null ? value15.size() : 0) != 0 && (value2 = metroParameter.getValue()) != null) {
                        return C43066x.A0(C42745f0.O(value2, ", ", null, null, C36012i.f319383l, 30)).toString();
                    }
                } else if (categoryParameter instanceof DistrictParameter) {
                    DistrictParameter districtParameter = (DistrictParameter) categoryParameter;
                    List<? extends District> value16 = districtParameter.getValue();
                    if ((value16 != null ? value16.size() : 0) != 0 && (value = districtParameter.getValue()) != null) {
                        return C43066x.A0(C42745f0.O(value, ", ", null, null, C36010h.f319378l, 30)).toString();
                    }
                } else if (categoryParameter instanceof QuartersParameter) {
                    Quarter selectedValue3 = ((QuartersParameter) categoryParameter).getSelectedValue();
                    if (selectedValue3 != null) {
                        return selectedValue3.getTitle();
                    }
                } else {
                    if (categoryParameter instanceof CharParameter) {
                        return b((EditableParameter) categoryParameter);
                    }
                    if (categoryParameter instanceof PhoneParameter) {
                        return this.f319349b.a(b((EditableParameter) categoryParameter));
                    }
                    if (categoryParameter instanceof EditableParameter) {
                        return b((EditableParameter) categoryParameter);
                    }
                }
            }
        }
        return null;
    }
}
