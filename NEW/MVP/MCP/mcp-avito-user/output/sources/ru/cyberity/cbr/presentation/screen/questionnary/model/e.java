package ru.cyberity.cbr.presentation.screen.questionnary.model;

import Y61.k;
import Y61.l;
import androidx.camera.core.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.FieldType;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.r;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.v;
import ru.cyberity.cbr.core.data.source.applicant.remote.y;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.model.CountriesData;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt;

/* compiled from: QuestionnaireResponseExtensions.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001aF\u0010\n\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u001c\u0010\n\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "countriesData", "Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "initialValues", "", "", "strings", "", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "a", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "sectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaire", "applicantId", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "imageId", "cyberity-mobile-sdk-internal_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e {

    /* compiled from: QuestionnaireResponseExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f435495a;

        static {
            int[] iArr = new int[FieldType.values().length];
            iArr[FieldType.text.ordinal()] = 1;
            iArr[FieldType.textArea.ordinal()] = 2;
            iArr[FieldType.phone.ordinal()] = 3;
            iArr[FieldType.date.ordinal()] = 4;
            iArr[FieldType.dateTime.ordinal()] = 5;
            iArr[FieldType.bool.ordinal()] = 6;
            iArr[FieldType.select.ordinal()] = 7;
            iArr[FieldType.selectDropdown.ordinal()] = 8;
            iArr[FieldType.multiSelect.ordinal()] = 9;
            iArr[FieldType.countrySelect.ordinal()] = 10;
            iArr[FieldType.fileAttachment.ordinal()] = 11;
            iArr[FieldType.multiFileAttachments.ordinal()] = 12;
            f435495a = iArr;
        }
    }

    @k
    public static final List<HostViewModel.Page> a(@k t tVar, @k CountriesData countriesData, @l v vVar, @k Map<String, String> map) {
        r rVar;
        List<r> listE;
        Object next;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        if (vVar == null || (listE = vVar.e()) == null) {
            rVar = null;
        } else {
            Iterator<T> it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((r) next).getId(), tVar.getId())) {
                    break;
                }
            }
            rVar = (r) next;
        }
        List<y> listU = tVar.u();
        if (listU != null) {
            int i12 = 0;
            ArrayList arrayList3 = null;
            for (Object obj : listU) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                y yVar = (y) obj;
                if (L.f(yVar.getDelimiter(), Boolean.TRUE)) {
                    if (arrayList3 != null) {
                        arrayList.add(new HostViewModel.Page(arrayList.size(), tVar.getTitle(), tVar.getDesc(), new ArrayList(arrayList3)));
                    }
                    arrayList3 = null;
                    i12 = i13;
                } else {
                    h hVar = new h((String) null, yVar.getTitle(), yVar.getDesc(), "section", Boolean.FALSE, (String) null, (String) null, yVar.getCondition(), (List) null, 256, (C42822w) null);
                    String id2 = yVar.getId();
                    if (id2 == null) {
                        id2 = "sectionId";
                    }
                    FormItem.Section section = new FormItem.Section(hVar, id2);
                    section.setCondition(yVar.getCondition());
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(section);
                    List<h> listR = yVar.r();
                    if (listR != null) {
                        for (h hVar2 : listR) {
                            String id3 = yVar.getId();
                            if (id3 == null) {
                                id3 = "";
                            }
                            FormItem formItemA = a(hVar2, id3, countriesData, rVar, map, vVar != null ? vVar.getApplicantId() : null);
                            if (formItemA != null) {
                                arrayList4.add(formItemA);
                            }
                        }
                    }
                    i12 = i13;
                    arrayList3 = arrayList4;
                }
            }
            arrayList2 = arrayList3;
        }
        if (arrayList2 != null) {
            int size = arrayList.size();
            String title = tVar.getTitle();
            String desc = tVar.getDesc();
            Collection collectionM0 = C42745f0.M0(arrayList2);
            if (collectionM0 == null) {
                collectionM0 = C42784z0.f406748b;
            }
            arrayList.add(new HostViewModel.Page(size, title, desc, new ArrayList(collectionM0)));
        }
        return arrayList;
    }

    @l
    public static final FormItem a(@k h hVar, @k String str, @k CountriesData countriesData, @l r rVar, @k Map<String, String> map, @l String str2) {
        FormItem text;
        LinkedHashMap linkedHashMap;
        String format;
        FieldType fieldTypeTypeEnum = QuestionnaireResponseExtensionsKt.typeEnum(hVar);
        switch (fieldTypeTypeEnum == null ? -1 : a.f435495a[fieldTypeTypeEnum.ordinal()]) {
            case -1:
                text = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (QuestionnaireResponseExtensionsKt.getFieldFormat(hVar) instanceof q.m) {
                    Map<String, String> mapH = countriesData.getCountriesData().h();
                    if (mapH == null) {
                        mapH = P0.c();
                    }
                    Map<String, String> map2 = mapH;
                    Map<String, ru.cyberity.cbr.core.data.model.remote.c> mapK = countriesData.getCountriesData().k();
                    if (mapK == null) {
                        mapK = P0.c();
                    }
                    text = new FormItem.Phone(str, hVar, map2, mapK, countriesData.getCountriesData().getCurrentCountryKey(), false, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 160, null);
                    break;
                } else {
                    text = new FormItem.Text(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, true, null, null, 48, null);
                    break;
                }
            case 2:
                text = new FormItem.TextArea(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 8, null);
                break;
            case 3:
                Map<String, String> mapH2 = countriesData.getCountriesData().h();
                if (mapH2 == null) {
                    mapH2 = P0.c();
                }
                Map<String, String> map3 = mapH2;
                Map<String, ru.cyberity.cbr.core.data.model.remote.c> mapK2 = countriesData.getCountriesData().k();
                if (mapK2 == null) {
                    mapK2 = P0.c();
                }
                text = new FormItem.Phone(str, hVar, map3, mapK2, countriesData.getCountriesData().getCurrentCountryKey(), false, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 160, null);
                break;
            case 4:
                text = new FormItem.Date(hVar, str, false, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 20, null);
                break;
            case 5:
                text = new FormItem.DateTime(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 8, null);
                break;
            case 6:
                text = new FormItem.Bool(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 8, null);
                break;
            case 7:
                text = new FormItem.Select(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, null, 8, null);
                break;
            case 8:
                text = new FormItem.SelectDropdown(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, false, null, 24, null);
                break;
            case 9:
                text = new FormItem.MultiSelect(hVar, str, rVar != null ? f.b(rVar, str, hVar.getId()) : null, null, false, 24, null);
                break;
            case 10:
                Map<String, String> mapH3 = countriesData.getCountriesData().h();
                if (mapH3 == null) {
                    mapH3 = P0.c();
                }
                text = new FormItem.CountrySelect(str, hVar, mapH3, rVar != null ? f.a(rVar, str, hVar.getId()) : null, true, null, 32, null);
                break;
            case 11:
                text = new FormItem.FileAttachment(hVar, str, rVar != null ? f.a(rVar, str, hVar.getId()) : null, map.get("cbr_quiestionnaire_action_addFile"), null, null, null, a(str2, rVar != null ? f.a(rVar, str, hVar.getId()) : null), 112, null);
                break;
            case 12:
                List<String> listB = rVar != null ? f.b(rVar, str, hVar.getId()) : null;
                h hVarA = (L.f(hVar.getRequired(), Boolean.TRUE) && ((format = hVar.getFormat()) == null || format.length() == 0)) ? null : hVar;
                if (hVarA == null) {
                    hVarA = hVar.a((479 & 1) != 0 ? hVar.id : null, (479 & 2) != 0 ? hVar.title : null, (479 & 4) != 0 ? hVar.desc : null, (479 & 8) != 0 ? hVar.type : null, (479 & 16) != 0 ? hVar.required : null, (479 & 32) != 0 ? hVar.format : "min_value:1", (479 & 64) != 0 ? hVar.com.avito.android.remote.model.messenger.context.ChannelContext.Item.PLACEHOLDER java.lang.String : null, (479 & 128) != 0 ? hVar.condition : null, (479 & 256) != 0 ? hVar.options : null);
                }
                h hVar2 = hVarA;
                String str3 = map.get("cbr_quiestionnaire_action_addFile");
                if (listB != null) {
                    int iF2 = P0.f(C42745f0.q(listB, 10));
                    if (iF2 < 16) {
                        iF2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iF2);
                    for (String str4 : listB) {
                        linkedHashMap2.put(str4, a(str2, str4));
                    }
                    linkedHashMap = linkedHashMap2;
                } else {
                    linkedHashMap = null;
                }
                text = new FormItem.MultiFileAttachments(hVar2, str, listB, str3, null, false, null, null, linkedHashMap, 240, null);
                break;
        }
        if (text == null) {
            return null;
        }
        text.setCondition(hVar.getCondition());
        return text;
    }

    private static final String a(String str, String str2) {
        return Q.a("resources/applicants/", str, "/resources/", str2, "?preview=true");
    }
}
