package com.avito.android.evidence_request.repository;

import Y41.p;
import Y61.k;
import android.annotation.SuppressLint;
import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.evidence_request.details.headerDescription.HeaderDescriptionItem;
import com.avito.android.evidence_request.repository.model.EvidenceContent;
import com.avito.android.evidence_request.repository.model.ProofDetailsContent;
import com.avito.android.evidence_request.repository.model.ProofType;
import com.avito.android.evidence_request.repository.model.ProofTypesContent;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.HeaderDescriptionParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlotConfig;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.facebook.imageutils.JfifUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EvidenceRequestRepository.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/repository/b;", "Lcom/avito/android/evidence_request/repository/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes13.dex */
public final class b implements com.avito.android.evidence_request.repository.a {

    /* compiled from: EvidenceRequestRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ModerationEvidence.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModerationEvidence moderationEvidence = ModerationEvidence.f253035c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ModerationEvidence moderationEvidence2 = ModerationEvidence.f253035c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ModerationEvidence moderationEvidence3 = ModerationEvidence.f253035c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ModerationEvidence moderationEvidence4 = ModerationEvidence.f253035c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EvidenceRequestRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "Lcom/avito/android/evidence_request/repository/model/ProofDetailsContent;", "details", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/evidence_request/repository/model/ProofDetailsContent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.repository.b$b, reason: collision with other inner class name */
    public static final class C4378b extends N implements p<String, ProofDetailsContent, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f149197l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4378b(LinkedHashMap linkedHashMap) {
            super(2);
            this.f149197l = linkedHashMap;
        }

        @Override // Y41.p
        public final G0 invoke(String str, ProofDetailsContent proofDetailsContent) {
            this.f149197l.put(str, proofDetailsContent);
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
    }

    public static EmailParameter c() {
        return new EmailParameter("email", "Почта", true, false, null, null, null, null, Collections.singletonList(new Constraint.Regex("", null, "Адрес электронной почты содержит недопустимые знаки", "error", "email:regexp", null, null, 98, null)), "", null, null, 3312, null);
    }

    public static PhotoParameter d(String str) {
        return new PhotoParameter("files_id", "Документ", str, null, 100, Collections.singletonList(new Constraint.Limit(Float.valueOf(1.0f), null, "error", "Загрузите хотя бы один файл", "files_id:limit", null, null, 98, null)), null, true, false, null, null, null, null, 8008, null);
    }

    public static CharParameter e(String str, String str2, String str3, String str4) {
        CharParameter.InputType inputType = CharParameter.InputType.URI;
        return new CharParameter(str, str2, true, false, str3 != null ? new AttributedText(str3, C42784z0.f406748b, 0, 4, null) : null, null, null, null, null, Collections.singletonList(new Constraint.Regex("\\S+\\.\\S+", null, "Некорректная ссылка — возможно, вы опечатались", "error", str.concat(":regexp"), null, null, 98, null)), null, str4, null, inputType, null, null, null, null, 251360, null);
    }

    public static CharParameter f() {
        return new CharParameter("fullName", "Ваше имя", true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex("[a-zа-яё]{2,}", null, "Имя содержит недопустимые знаки", "error", "name:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null);
    }

    public static ProofType g(String str, String str2, p pVar, String str3, AttributedText attributedText, List list, List list2, boolean z12) {
        List listI0;
        if (z12) {
            listI0 = list;
        } else {
            listI0 = C42745f0.i0(new InformationSlot(ServiceTransportationWidget.DisclaimerField.TYPE, "", new SlotWidget(SlotType.INFORMATION, new InformationSlotConfig(new AttributedText("Нажимая «Отправить», вы подтверждаете согласие c {{agreement}}", Collections.singletonList(new DeepLinkAttribute("agreement", "политикой обработки данных.", new WebViewLink.AnyDomain(Uri.parse("https://www.avito.ru/safety/personal/company"), null, null, 6, null), null, null, null, 56, null)), 0, 4, null), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null))), list);
        }
        ((C4378b) pVar).invoke(str, new ProofDetailsContent(str3, list2, listI0, z12, attributedText));
        return new ProofType(str, str2);
    }

    public static ProofType h(b bVar, String str, String str2, p pVar, AttributedText attributedText, List list, int i12) {
        if ((i12 & 16) != 0) {
            bVar.getClass();
            attributedText = i("Обычно проверка занимает не больше суток.");
        }
        C42784z0 c42784z0 = C42784z0.f406748b;
        bVar.getClass();
        return g(str, str2, pVar, "Приложите доказательства", attributedText, list, c42784z0, false);
    }

    public static AttributedText i(String str) {
        return new AttributedText(str, C42784z0.f406748b, 0, 4, null);
    }

    @Override // com.avito.android.evidence_request.repository.a
    @k
    public final EvidenceContent a(@k ModerationEvidence moderationEvidence) {
        List listSingletonList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4378b c4378b = new C4378b(linkedHashMap);
        int iOrdinal = moderationEvidence.ordinal();
        if (iOrdinal == 0) {
            listSingletonList = Collections.singletonList(h(this, "cadastral_number", "Кадастровый номер", c4378b, i("Укажите информацию о квартире — она нигде не публикуется и никому не передаётся. Данные нужны только для доказательства, что вы действительно предлагаете эту квартиру."), C42745f0.U(new CharParameter("surname", "Фамилия собственника", true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex("[а-яё ]{2,}$", null, "Фамилия введена некорректно — возможно, вы опечатались", "error", "surname:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("name", "Имя собственника", true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex("[а-яё ]{2,}$", null, "Имя введено некорректно — возможно, вы опечатались", "error", "name:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("patronymic", "Отчество собственника", false, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex("[а-яё ]{2,}$", null, "Отчество введено некорректно — возможно, вы опечатались", "error", "patronymic:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("cadastral_number", "Кадастровый номер квартиры", true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex("[0-9]{2}\\:[0-9]{2}\\:[0-9]{6,7}\\:[0-9]{1,}$", null, "Некорректный номер — возможно, вы опечатались", "error", "cadastral_number:regexp", null, null, 98, null)), null, "12:34:567890:0000", null, null, null, null, null, null, 259568, null)), 200));
        } else if (iOrdinal == 1) {
            listSingletonList = Collections.singletonList(h(this, "video_way", "Видео", c4378b, i("Наша проверка показала, что объявление может быть недостоверным. Снимите видео для доказательства, что вы действительно предлагаете эту недвижимость. Ролик нигде не публикуется и никому не передаётся. \n\nИнструкция для съёмки:\n\n1. Видео должно быть без пауз и склеек — не выключайте камеру, пока не покажете всё из списка.\n\n2. Начните съёмку с таблички с номером дома и названием улицы. Если её нет, обернитесь с камерой вокруг себя возле входа в здание.\n\n3. Снимите интерьер — пройдите до кухни, не выключая камеру. Если кухни нет, покажите санузел или комнату, которая есть на фотографиях в объявлении.\n\n4. Покажите табличку с номером объявления — её нужно заранее распечатать или написать на листе бумаги.\n\n5. Ролик можно выложить на YouTube, Яндекс.Диск или Google Drive. Не забудьте открыть к нему доступ.\n"), C42745f0.U(e("videoURL", "Ссылка на видео", "Выложите ролик, например на YouTube, Яндекс.Диск или Google Drivе, и вставьте ссылку на него с открытым доступом.", "Например: https://www.youtube.com/watch?v=s1kNPtadcj0"), f(), c()), 200));
        } else if (iOrdinal == 2) {
            listSingletonList = C42745f0.U(b("video_way", "Непрерывное видео, на котором показан путь от таблички с номером дома до кухни", c4378b, Collections.singletonList(e("videoURL", "Ссылка на видео", "Выложите ролик, например на YouTube, Яндекс.Диск или Google Drivе, и вставьте ссылку на него с открытым доступом.", "Например: https://www.youtube.com/watch?v=s1kNPtadcj0"))), b("ownership_certificate", "Фото документа, который подтверждает ваше право собственности: нужны страницы с адресом, печатью и подписью", c4378b, Collections.singletonList(d("Свидетельство о регистрации права собственности или выписка из ЕГРН с печатью."))), b("contract", "Фото договора долевого участия в строительстве, купли-продажи или дарения: страницы с адресом, планировкой, печатью и подписью, а если это новостройка — то и с планировкой. Персональные данные на фото можно скрыть", c4378b, Collections.singletonList(d("Договор долевого участия, купли-продажи или дарения: страницы с адресом и печатью, а для новостройки — ещё и с планировкой. Данные паспорта можно скрыть."))), b("new_building_flat_link", "Только для новостроек: ссылка на квартиру на сайте застройщика", c4378b, Collections.singletonList(e("flatLink", "Ссылка на квартиру на сайте застройщика", null, ""))), b("new_building_project_declaration", "Только для новостроек: условный номер квартиры, ссылка на проектную декларацию и номер страницы, на которой указана эта квартира", c4378b, C42745f0.U(new IntParameter("flatNumber", "Номер квартиры", true, false, null, null, null, null, null, null, "Например, 15", null, null, null, null, 31728, null), e("projectDeclarationURL", "Ссылка на проектную декларацию на сайте застройщика или портале наш.дом.рф", null, ""), new IntParameter("projectDeclarationFlatPageNumber", "Номер страницы в проектной декларации, на которой указана эта квартира", true, false, null, null, null, null, null, null, "Например, 3", null, null, null, null, 31728, null))));
        } else if (iOrdinal == 3) {
            listSingletonList = Collections.singletonList(g("archive_extract", "Архив", c4378b, "Проверка достоверности", new AttributedText("Подтвердите, что это ваше объявление: укажите ФИО собственника и пришлите выписку из ЕГРН. Она делается онлайн. {{howto}}", Collections.singletonList(new DeepLinkAttribute("howto", "Как получить выписку бесплатно", new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2815"), null, null, 6, null), null, null, null, 56, null)), 0, 4, null), C42745f0.U(new HeaderDescriptionParameter("Данные собственника", "Если собственников несколько, можно ввести данные любого из них."), new CharParameter("surname", "Фамилия", false, false, i("Указывать ФИО не обязательно"), null, null, null, null, null, null, "", null, null, null, null, null, null, 260064, null), new CharParameter("name", "Имя", false, false, null, null, null, null, null, null, null, "", null, null, null, null, null, null, 260080, null), new CharParameter("patronymic", "Отчество", false, false, null, null, null, null, null, null, null, "", null, null, null, null, null, null, 260080, null), new PhotoParameter("files", "Выписка из ЕГРН", "Приложите архив с выпиской в формате ZIP.", null, 10, null, null, false, false, null, null, null, null, 8040, null)), Collections.singletonList(new HeaderDescriptionItem("header", "Данные собственника", i("Если собственников несколько, можно ввести данные любого из них."))), true));
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listSingletonList = C42784z0.f406748b;
        }
        return new EvidenceContent(new ProofTypesContent("Выберите способ подтверждения", "Мы хотим убедиться, что вы действительно предлагаете эту недвижимость. Данные нигде не публикуются и никому не передаются.", listSingletonList), linkedHashMap);
    }

    public final ProofType b(String str, String str2, p<? super String, ? super ProofDetailsContent, G0> pVar, List<? extends ParameterSlot> list) {
        return h(this, str, str2, pVar, null, C42745f0.h0(list, C42745f0.e0(f(), c())), JfifUtil.MARKER_SOI);
    }
}
