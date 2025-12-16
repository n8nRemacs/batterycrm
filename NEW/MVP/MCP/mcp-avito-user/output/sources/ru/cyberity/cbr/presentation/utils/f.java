package ru.cyberity.cbr.presentation.utils;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;
import ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener;

/* compiled from: ApplicantDataViewUtils.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006\u001a+\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Lru/cyberity/cbr/domain/c;", "resources", "", "b", "(Landroid/view/ViewGroup;Lru/cyberity/cbr/domain/c;)Ljava/lang/String;", "c", "Lru/cyberity/cbr/core/data/model/FieldName;", "field", "a", "(Lru/cyberity/cbr/core/data/model/FieldName;Landroid/view/ViewGroup;Lru/cyberity/cbr/domain/c;)Ljava/lang/String;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "view", "Lru/cyberity/cbr/domain/a;", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Landroid/view/ViewGroup;Lru/cyberity/cbr/domain/c;)Lru/cyberity/cbr/domain/a;", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435619a;

        static {
            int[] iArr = new int[FieldName.values().length];
            iArr[FieldName.gender.ordinal()] = 1;
            iArr[FieldName.country.ordinal()] = 2;
            iArr[FieldName.countryOfBirth.ordinal()] = 3;
            iArr[FieldName.nationality.ordinal()] = 4;
            iArr[FieldName.state.ordinal()] = 5;
            iArr[FieldName.stateOfBirth.ordinal()] = 6;
            f435619a = iArr;
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a$a;", "it", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/h$e$a$a;)V"}, k = 3, mv = {1, 7, 1})
    final class b extends N implements l<h.e.a.C12451a, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.utils.a f435620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.e f435621b;

        public final void a(@k h.e.a.C12451a c12451a) {
            ru.cyberity.cbr.presentation.utils.a aVar = this.f435620a;
            if (aVar != null) {
                aVar.a(this.f435621b, c12451a);
            }
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(h.e.a.C12451a c12451a) {
            a(c12451a);
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    final class c extends N implements l<String, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.utils.a f435622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.d f435623b;

        public final void a(@Y61.l String str) {
            ru.cyberity.cbr.presentation.utils.a aVar = this.f435622a;
            if (aVar != null) {
                aVar.a(this.f435623b, str);
            }
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "it", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V"}, k = 3, mv = {1, 7, 1})
    final class d extends N implements l<CBRCountryPicker.CountryItem, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.utils.a f435624a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.d f435625b;

        public final void a(@k CBRCountryPicker.CountryItem countryItem) {
            ru.cyberity.cbr.presentation.utils.a aVar = this.f435624a;
            if (aVar != null) {
                aVar.a(this.f435625b, countryItem);
            }
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(CBRCountryPicker.CountryItem countryItem) {
            a(countryItem);
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "it", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V"}, k = 3, mv = {1, 7, 1})
    final class e extends N implements l<CBRCountryPicker.CountryItem, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.utils.a f435626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.d f435627b;

        public final void a(@k CBRCountryPicker.CountryItem countryItem) {
            ru.cyberity.cbr.presentation.utils.a aVar = this.f435626a;
            if (aVar != null) {
                aVar.a(this.f435627b, countryItem);
            }
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(CBRCountryPicker.CountryItem countryItem) {
            a(countryItem);
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/cyberity/cbr/presentation/utils/f$f", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "", "isValid", "isBlank", "Lkotlin/G0;", "onValidate", "(ZZ)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.utils.f$f, reason: collision with other inner class name */
    public final class C12541f implements ValidationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.presentation.utils.a f435628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.d f435629b;

        @Override // ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener
        public void onValidate(boolean isValid, boolean isBlank) {
            ru.cyberity.cbr.presentation.utils.a aVar = this.f435628a;
            if (aVar != null) {
                aVar.a(this.f435629b, isValid, isBlank);
            }
        }
    }

    /* compiled from: ApplicantDataViewUtils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lru/cyberity/cbr/domain/a;", "a", "(Landroid/view/View;)Lru/cyberity/cbr/domain/a;"}, k = 3, mv = {1, 7, 1})
    final class g extends N implements l<View, ru.cyberity.cbr.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f435630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.domain.c f435631b;

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.cyberity.cbr.domain.a invoke(@k View view) {
            CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView = view instanceof CBRApplicantDataBaseFieldView ? (CBRApplicantDataBaseFieldView) view : null;
            if (cBRApplicantDataBaseFieldView != null) {
                return f.b(cBRApplicantDataBaseFieldView, this.f435630a, this.f435631b);
            }
            return null;
        }
    }

    private static final String a(FieldName fieldName, ViewGroup viewGroup, ru.cyberity.cbr.domain.c cVar) {
        View view;
        Object next;
        Object next2;
        if (viewGroup != null) {
            Iterator itA = C22816e.a(viewGroup);
            while (true) {
                if (!itA.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = itA.next();
                Object tag = ((View) next2).getTag();
                h.d dVar = tag instanceof h.d ? (h.d) tag : null;
                if ((dVar != null ? dVar.getName() : null) == fieldName) {
                    break;
                }
            }
            view = (View) next2;
        } else {
            view = null;
        }
        CBRApplicantDataFieldView cBRApplicantDataFieldView = view instanceof CBRApplicantDataFieldView ? (CBRApplicantDataFieldView) view : null;
        Iterator<T> it = cVar.h().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Map.Entry) next).getValue(), cBRApplicantDataFieldView != null ? cBRApplicantDataFieldView.getValue() : null)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getKey();
        }
        return null;
    }

    private static final String b(ViewGroup viewGroup, ru.cyberity.cbr.domain.c cVar) {
        return a(FieldName.country, viewGroup, cVar);
    }

    private static final String c(ViewGroup viewGroup, ru.cyberity.cbr.domain.c cVar) {
        return a(FieldName.countryOfBirth, viewGroup, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.cyberity.cbr.domain.a b(CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, ViewGroup viewGroup, ru.cyberity.cbr.domain.c cVar) {
        Set<Map.Entry<String, String>> setEntrySet;
        Set<Map.Entry<String, String>> setEntrySet2;
        Object tag = cBRApplicantDataBaseFieldView.getTag();
        Object obj = null;
        if (!(tag instanceof h.d)) {
            if ((tag instanceof h.c) || (tag instanceof h.e)) {
                return new ru.cyberity.cbr.domain.a((h) tag, cBRApplicantDataBaseFieldView.getValue(), null, null, null, 28, null);
            }
            return null;
        }
        FieldName name = ((h.d) tag).getName();
        switch (name == null ? -1 : a.f435619a[name.ordinal()]) {
            case 1:
                Iterator<T> it = cVar.j().entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (L.f(((Map.Entry) next).getValue(), cBRApplicantDataBaseFieldView.getValue())) {
                            obj = next;
                        }
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null && (r4 = (String) entry.getKey()) != null) {
                    break;
                } else {
                    break;
                }
            case 2:
            case 3:
            case 4:
                Iterator<T> it2 = cVar.h().entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (L.f(((Map.Entry) next2).getValue(), cBRApplicantDataBaseFieldView.getValue())) {
                            obj = next2;
                        }
                    }
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 != null && (r4 = (String) entry2.getKey()) != null) {
                    break;
                } else {
                    break;
                }
                break;
            case 5:
                Map<String, String> map = cVar.i().get(b(viewGroup, cVar));
                if (map != null && (setEntrySet = map.entrySet()) != null) {
                    Iterator<T> it3 = setEntrySet.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next3 = it3.next();
                            if (L.f(((Map.Entry) next3).getValue(), cBRApplicantDataBaseFieldView.getValue())) {
                                obj = next3;
                            }
                        }
                    }
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (entry3 != null && (r4 = (String) entry3.getKey()) != null) {
                        break;
                    }
                }
                break;
            case 6:
                Map<String, String> map2 = cVar.i().get(c(viewGroup, cVar));
                if (map2 != null && (setEntrySet2 = map2.entrySet()) != null) {
                    Iterator<T> it4 = setEntrySet2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next4 = it4.next();
                            if (L.f(((Map.Entry) next4).getValue(), cBRApplicantDataBaseFieldView.getValue())) {
                                obj = next4;
                            }
                        }
                    }
                    Map.Entry entry4 = (Map.Entry) obj;
                    if (entry4 != null && (r4 = (String) entry4.getKey()) != null) {
                        break;
                    }
                }
                break;
        }
        return new ru.cyberity.cbr.domain.a((h) tag, cBRApplicantDataBaseFieldView.getValue(), null, null, null, 28, null);
    }
}
