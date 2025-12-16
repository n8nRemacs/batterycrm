package C91;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.mts.biometry.api.dataSource.j;
import ru.mts.biometry.api.entity.state.ApiDocumentCountryLocalized;
import ru.mts.biometry.api.entity.state.ApiDocumentData;
import ru.mts.biometry.api.entity.state.ApiDocumentPropLocalized;
import ru.mts.biometry.api.entity.state.ApiDocumentType;
import ru.mts.biometry.api.entity.state.ApiDocumentTypeSelectionState;
import ru.mts.biometry.api.entity.state.ApiDocumentTypeSelectionTexts;
import ru.mts.biometry.api.entity.state.ApiDocumentTypeSelectionUiSettings;
import ru.mts.biometry.api.entity.state.ApiErrorState;
import ru.mts.biometry.api.entity.state.ApiErrorTexts;
import ru.mts.biometry.api.entity.state.ApiIdentificationState;
import ru.mts.biometry.api.entity.state.ApiSelectedDocumentBody;
import ru.mts.biometry.api.entity.state.screen.ApiDocumentConfirmationState;
import ru.mts.biometry.api.entity.state.screen.ApiDocumentConfirmationTexts;
import ru.mts.biometry.api.entity.state.screen.ApiOnboardingState;
import ru.mts.biometry.api.entity.state.screen.ApiOnboardingTexts;
import ru.mts.biometry.api.entity.state.screen.ApiOnboardingUiSettings;
import ru.mts.biometry.api.entity.state.screen.ApiPhotoCaptureState;
import ru.mts.biometry.api.entity.state.screen.ApiPhotoCaptureTexts;
import ru.mts.biometry.api.entity.state.screen.DocumentConfirmationField;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ru.mts.biometry.api.d f2037a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2038b;

    /* renamed from: c, reason: collision with root package name */
    public final W91.h f2039c;

    /* renamed from: d, reason: collision with root package name */
    public final z91.d f2040d;

    /* renamed from: e, reason: collision with root package name */
    public SuspendLambda f2041e;

    /* renamed from: f, reason: collision with root package name */
    public ApiIdentificationState f2042f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC43160i f2043g = C43175k.G(new c(this, null));

    public h(ru.mts.biometry.api.d dVar, j jVar, W91.h hVar, z91.d dVar2) {
        this.f2037a = dVar;
        this.f2038b = jVar;
        this.f2039c = hVar;
        this.f2040d = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final void a(ApiIdentificationState apiIdentificationState) {
        E91.f fVar;
        E91.g gVar;
        E91.h hVar;
        E91.c cVar;
        P91.e eVar;
        ?? arrayList;
        Map mapC;
        Map mapC2;
        ?? arrayList2;
        String photoPageDescription;
        Boolean boolB;
        String strA;
        String title;
        String description;
        if (apiIdentificationState == null) {
            return;
        }
        E91.b bVar = a.f2018e;
        ApiErrorState apiErrorStateE = apiIdentificationState.getError();
        String str = "";
        E91.a aVar = null;
        if (apiErrorStateE != null) {
            ApiErrorTexts texts = apiErrorStateE.getTexts();
            if (texts == null || (title = texts.getTitle()) == null) {
                title = "";
            }
            ApiErrorTexts texts2 = apiErrorStateE.getTexts();
            if (texts2 == null || (description = texts2.getDescription()) == null) {
                description = "";
            }
            ApiErrorTexts texts3 = apiErrorStateE.getTexts();
            fVar = new E91.f(title, description, D91.b.a(texts3 != null ? texts3.getRecommendations() : null));
        } else {
            fVar = null;
        }
        ApiOnboardingState apiOnboardingStateF = apiIdentificationState.getOnboarding();
        if (apiOnboardingStateF != null) {
            ApiOnboardingUiSettings apiOnboardingUiSettingsB = apiOnboardingStateF.getUiSettings();
            String str2 = (apiOnboardingUiSettingsB == null || (strA = apiOnboardingUiSettingsB.getIcon()) == null) ? "" : strA;
            ApiOnboardingTexts apiOnboardingTextsA = apiOnboardingStateF.getTexts();
            String title2 = apiOnboardingTextsA != null ? apiOnboardingTextsA.getTitle() : null;
            ApiOnboardingTexts apiOnboardingTextsA2 = apiOnboardingStateF.getTexts();
            List listA = D91.b.a(apiOnboardingTextsA2 != null ? apiOnboardingTextsA2.getRecommendationShort() : null);
            if (listA == null) {
                listA = C42784z0.f406748b;
            }
            List list = listA;
            ApiOnboardingTexts apiOnboardingTextsA3 = apiOnboardingStateF.getTexts();
            List listA2 = D91.b.a(apiOnboardingTextsA3 != null ? apiOnboardingTextsA3.getRecommendationFull() : null);
            if (listA2 == null) {
                listA2 = C42784z0.f406748b;
            }
            List list2 = listA2;
            ApiOnboardingUiSettings apiOnboardingUiSettingsB2 = apiOnboardingStateF.getUiSettings();
            gVar = new E91.g(str2, title2, list, list2, (apiOnboardingUiSettingsB2 == null || (boolB = apiOnboardingUiSettingsB2.getIsRecommendationButtonEnabled()) == null) ? false : boolB.booleanValue());
        } else {
            gVar = null;
        }
        ApiPhotoCaptureState apiPhotoCaptureStateG = apiIdentificationState.getPhotoCapture();
        if (apiPhotoCaptureStateG != null) {
            String type = apiPhotoCaptureStateG.getType();
            String str3 = type == null ? "" : type;
            Float ratio = apiPhotoCaptureStateG.getRatio();
            float fFloatValue = ratio != null ? ratio.floatValue() : 1.4285715f;
            Integer photoCount = apiPhotoCaptureStateG.getPhotoCount();
            int iIntValue = photoCount != null ? photoCount.intValue() : 3;
            ApiPhotoCaptureTexts texts4 = apiPhotoCaptureStateG.getTexts();
            String navBarText = texts4 != null ? texts4.getNavBarText() : null;
            ApiPhotoCaptureTexts texts5 = apiPhotoCaptureStateG.getTexts();
            String photoPageText = texts5 != null ? texts5.getPhotoPageText() : null;
            ApiPhotoCaptureTexts texts6 = apiPhotoCaptureStateG.getTexts();
            String str4 = (texts6 == null || (photoPageDescription = texts6.getPhotoPageDescription()) == null) ? "" : photoPageDescription;
            ApiPhotoCaptureTexts texts7 = apiPhotoCaptureStateG.getTexts();
            String okPageText = texts7 != null ? texts7.getOkPageText() : null;
            ApiPhotoCaptureTexts texts8 = apiPhotoCaptureStateG.getTexts();
            String recognitionProcessingPageText = texts8 != null ? texts8.getRecognitionProcessingPageText() : null;
            ApiPhotoCaptureTexts texts9 = apiPhotoCaptureStateG.getTexts();
            hVar = new E91.h(str3, fFloatValue, iIntValue, navBarText, photoPageText, str4, okPageText, recognitionProcessingPageText, D91.b.a(texts9 != null ? texts9.getRecommendations() : null));
        } else {
            hVar = null;
        }
        ApiDocumentConfirmationState apiDocumentConfirmationStateA = apiIdentificationState.getDocumentConfirmation();
        if (apiDocumentConfirmationStateA != null) {
            ApiDocumentConfirmationTexts apiDocumentConfirmationTextsB = apiDocumentConfirmationStateA.getTexts();
            String title3 = apiDocumentConfirmationTextsB != null ? apiDocumentConfirmationTextsB.getTitle() : null;
            ApiDocumentConfirmationTexts apiDocumentConfirmationTextsB2 = apiDocumentConfirmationStateA.getTexts();
            String description2 = apiDocumentConfirmationTextsB2 != null ? apiDocumentConfirmationTextsB2.getDescription() : null;
            List<DocumentConfirmationField> listA3 = apiDocumentConfirmationStateA.a();
            if (listA3 != null) {
                arrayList2 = new ArrayList(C42745f0.q(listA3, 10));
                for (DocumentConfirmationField documentConfirmationField : listA3) {
                    String displayName = documentConfirmationField.getDisplayName();
                    if (displayName == null) {
                        displayName = "";
                    }
                    String value = documentConfirmationField.getValue();
                    if (value == null) {
                        value = "";
                    }
                    arrayList2.add(new E91.e(displayName, value));
                }
            } else {
                arrayList2 = C42784z0.f406748b;
            }
            cVar = new E91.c(title3, description2, arrayList2);
        } else {
            cVar = null;
        }
        ApiDocumentData apiDocumentDataC = apiIdentificationState.getDocumentRecognitionFormData();
        E91.d dVar = apiDocumentDataC != null ? new E91.d(apiDocumentDataC.getType(), apiDocumentDataC.getCountryCode(), apiDocumentDataC.o(), apiDocumentDataC.getSeries(), apiDocumentDataC.getNumber(), apiDocumentDataC.getSurname(), apiDocumentDataC.getAuthority(), apiDocumentDataC.getBirthdate(), apiDocumentDataC.getFirstName(), apiDocumentDataC.getBirthplace(), apiDocumentDataC.getIssuedDate(), apiDocumentDataC.getMiddleName(), apiDocumentDataC.getAuthorityCode(), apiDocumentDataC.getExpiryDate(), apiDocumentDataC.getCitizenship(), apiDocumentDataC.getCitizenshipCode()) : null;
        ApiSelectedDocumentBody apiSelectedDocumentBodyI = apiIdentificationState.getSelectedDocument();
        if (apiSelectedDocumentBodyI != null) {
            P91.c cVar2 = ru.mts.biometry.sdk.feature.document.intro.domain.d.f436438b;
            String strC = apiSelectedDocumentBodyI.getType();
            cVar2.getClass();
            ru.mts.biometry.sdk.feature.document.intro.domain.d dVarA = P91.c.a(strC);
            if (dVarA == null) {
                return;
            } else {
                eVar = new P91.e(apiSelectedDocumentBodyI.getCountryCode(), dVarA);
            }
        } else {
            eVar = null;
        }
        ApiDocumentTypeSelectionState apiDocumentTypeSelectionStateD = apiIdentificationState.getDocumentTypeSelection();
        if (apiDocumentTypeSelectionStateD != null) {
            ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTextsD = apiDocumentTypeSelectionStateD.getTexts();
            String title4 = apiDocumentTypeSelectionTextsD != null ? apiDocumentTypeSelectionTextsD.getTitle() : null;
            ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTextsD2 = apiDocumentTypeSelectionStateD.getTexts();
            String description3 = apiDocumentTypeSelectionTextsD2 != null ? apiDocumentTypeSelectionTextsD2.getDescription() : null;
            ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTextsD3 = apiDocumentTypeSelectionStateD.getTexts();
            String countryTitle = apiDocumentTypeSelectionTextsD3 != null ? apiDocumentTypeSelectionTextsD3.getCountryTitle() : null;
            ApiDocumentTypeSelectionTexts apiDocumentTypeSelectionTextsD4 = apiDocumentTypeSelectionStateD.getTexts();
            String documentTypeTitle = apiDocumentTypeSelectionTextsD4 != null ? apiDocumentTypeSelectionTextsD4.getDocumentTypeTitle() : null;
            ApiDocumentTypeSelectionUiSettings apiDocumentTypeSelectionUiSettingsE = apiDocumentTypeSelectionStateD.getUiSettings();
            boolean isSingleDocumentTypeSelectorEnabled = apiDocumentTypeSelectionUiSettingsE != null ? apiDocumentTypeSelectionUiSettingsE.getIsSingleDocumentTypeSelectorEnabled() : false;
            Map<String, ApiDocumentCountryLocalized> mapB = apiDocumentTypeSelectionStateD.b();
            if (mapB != null) {
                arrayList = new ArrayList(mapB.size());
                Iterator<Map.Entry<String, ApiDocumentCountryLocalized>> it = mapB.entrySet().iterator();
                while (it.hasNext()) {
                    ApiDocumentCountryLocalized value2 = it.next().getValue();
                    String strA2 = value2.getCode();
                    String str5 = strA2 == null ? str : strA2;
                    String strC2 = value2.getName();
                    String str6 = str;
                    if (strC2 != null) {
                        str = strC2;
                    }
                    List<String> listB = value2.b();
                    if (listB == null) {
                        listB = C42784z0.f406748b;
                    }
                    arrayList.add(new ru.mts.biometry.sdk.domain.entity.selector.d(str5, str, listB));
                    str = str6;
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            Map<String, ApiDocumentPropLocalized> mapC3 = apiDocumentTypeSelectionStateD.c();
            if (mapC3 != null) {
                mapC = new LinkedHashMap(P0.f(mapC3.size()));
                for (Iterator it2 = mapC3.entrySet().iterator(); it2.hasNext(); it2 = it2) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    ApiDocumentPropLocalized apiDocumentPropLocalized = (ApiDocumentPropLocalized) entry.getValue();
                    mapC.put(key, new ru.mts.biometry.sdk.domain.entity.selector.b(apiDocumentPropLocalized.getType(), apiDocumentPropLocalized.getName()));
                }
            } else {
                mapC = P0.c();
            }
            List<ApiDocumentType> listA4 = apiDocumentTypeSelectionStateD.a();
            if (listA4 != null) {
                int iF2 = P0.f(C42745f0.q(listA4, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                mapC2 = new LinkedHashMap(iF2);
                for (ApiDocumentType apiDocumentType : listA4) {
                    mapC2.put(apiDocumentType.getType(), apiDocumentType.a());
                }
            } else {
                mapC2 = P0.c();
            }
            aVar = new E91.a(title4, description3, documentTypeTitle, countryTitle, isSingleDocumentTypeSelectorEnabled, new ru.mts.biometry.sdk.domain.entity.selector.f(mapC, mapC2, arrayList));
        }
        if (fVar == null) {
            fVar = bVar.f3815a;
        }
        E91.f fVar2 = fVar;
        if (gVar == null) {
            gVar = bVar.f3816b;
        }
        E91.g gVar2 = gVar;
        if (hVar == null) {
            hVar = bVar.f3817c;
        }
        E91.h hVar2 = hVar;
        if (cVar == null) {
            cVar = bVar.f3818d;
        }
        E91.c cVar3 = cVar;
        if (dVar == null) {
            dVar = bVar.f3819e;
        }
        E91.d dVar2 = dVar;
        if (eVar == null) {
            eVar = bVar.f3820f;
        }
        P91.e eVar2 = eVar;
        if (aVar == null) {
            aVar = bVar.f3821g;
        } else {
            bVar.getClass();
        }
        a.f2018e = new E91.b(fVar2, gVar2, hVar2, cVar3, dVar2, eVar2, aVar);
        if (a.f2016c == null) {
            a.f2016c = apiIdentificationState.k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public static boolean b() {
        Object next;
        E91.a aVar = a.f2018e.f3821g;
        if (aVar == null) {
            return false;
        }
        ru.mts.biometry.sdk.domain.entity.selector.f fVar = aVar.f3814f;
        if (fVar.f436416c.size() > 1) {
            return true;
        }
        ?? r02 = fVar.f436415b;
        if (r02.size() == 1) {
            return false;
        }
        Iterator it = r02.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ru.mts.biometry.sdk.domain.entity.selector.d) next).f436412b, "_any_")) {
                break;
            }
        }
        return ((ru.mts.biometry.sdk.domain.entity.selector.d) next) == null;
    }
}
