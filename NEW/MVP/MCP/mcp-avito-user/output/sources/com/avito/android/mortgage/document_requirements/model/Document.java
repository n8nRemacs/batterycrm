package com.avito.android.mortgage.document_requirements.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.BulletAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.remote.model.text.LinkAttribute;
import j.e0;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Document.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/model/Document;", "", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Document implements Parcelable {

    @k
    public static final Parcelable.Creator<Document> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Document[] f198967e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198968f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f198970c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<RequirementParagraph> f198971d;

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        Document document = new Document("Passport", 0, "passport", R.string.documents_requirements_passport_title, Collections.singletonList(new RequirementParagraph(null, new AttributedText("Сделайте фото или скан оригинала — все страницы:\n— если обложка закрывает часть паспорта, снимите её;\n— пальцы не должны перекрывать информацию;\n— нет бликов или посторонних предметов.", c42784z0, 1), 0, 4, null)));
        Document document2 = new Document("SNILS", 1, "snils", R.string.documents_requirements_snils_title, Collections.singletonList(new RequirementParagraph(null, new AttributedText("Сделайте фото или скан оригинала — лицевая сторона страхового свидетельства с номером:\n— пальцы не должны перекрывать информацию;\n— нет бликов или посторонних предметов.", c42784z0, 1), 0, 4, null)));
        Integer numValueOf = Integer.valueOf(R.string.documents_requirements_labor_title_hired);
        FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
        FontParameter.TextStyleParameter textStyleParameter = new FontParameter.TextStyleParameter(null, "m20");
        FontParameter.UnderlineParameter underlineParameter = FontParameter.UnderlineParameter.INSTANCE;
        Document document3 = new Document("LaborActivity", 2, "laborActivity", R.string.documents_requirements_labor_title, C42745f0.U(new RequirementParagraph(numValueOf, new AttributedText("Подойдёт выписка из электронной трудовой книжки или копия бумажной.\nВыписку из электронной трудовой книжки можно получить {{link}} в разделе «Справки, выписки».\nКопию бумажной трудовой книжки можно взять на работе. Она:\n— должна быть заверена на каждой странице;\n— или иметь заверительную надпись на последней странице, если есть подпись и печать работодателя на каждой странице копии;\n— или быть прошита и заверена на последней странице с указанием количества листов.\nСрок действия документа не должен превышать 30 дней.", Collections.singletonList(new LinkAttribute("link", "на Госуслугах", "https://www.gosuslugi.ru/", C42745f0.U(colorParameter, textStyleParameter, underlineParameter))), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_labor_title_self_employed), new AttributedText("Справка о постановке на учёт:\n— формируется в приложении «Мой налог». Нужно зайти в раздел «Прочее» в правом нижнем углу экрана и выбрать вкладку «Справки»;\n— или в {{link}}. Нужно зайти в раздел «Настройки» и выбрать вкладку «Справки».", Collections.singletonList(new LinkAttribute("link", "личном кабинете налогоплательщика", "https://lknpd.nalog.ru/auth/login", C42745f0.U(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), new FontParameter.TextStyleParameter(null, "m20"), underlineParameter))), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_labor_title_entrepreneur), new AttributedText("Занятость можно подтвердить:\n— копией свидетельства о государственной регистрации физического лица в качестве индивидуального предпринимателя;\n— или выпиской ЕГРИП в формате PDF. Скачать её можно на сайте {{link}}. Срок действия — 30 дней.", Collections.singletonList(new LinkAttribute("link", "ФНС России", "https://egrul.nalog.ru/index.html", C42745f0.U(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), new FontParameter.TextStyleParameter(null, "m20"), underlineParameter))), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_labor_title_business), new AttributedText("Занятость можно подтвердить:\n— копией свидетельства о государственной регистрации юридического лица;\n— или выпиской ЕГРЮЛ в формате PDF. Скачать её можно на сайте {{link}}. Срок действия — 30 дней.", Collections.singletonList(new LinkAttribute("link", "ФНС России", "https://egrul.nalog.ru/index.html", C42745f0.U(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), new FontParameter.TextStyleParameter(null, "m20"), underlineParameter))), 1), 0, 4, null)));
        Document document4 = new Document("Income", 3, "income", R.string.documents_requirements_income_title, C42745f0.U(new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_income_title_hired), new AttributedText("Справка о доходах (2-НДФЛ) или по форме банка:\n— должна подтверждать доходы на текущем месте работы за последние 12 месяцев;\n— если вы работаете меньше года — за количество отработанных месяцев;\n— срок действия справки не больше 30 дней.", c42784z0, 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_income_title_self_employed), new AttributedText("Справка о доходах:\n— формируется в приложении «Мой налог». Нужно зайти в раздел «Прочее» в правом нижнем углу экрана и выбрать вкладку «Справки»;\n— или в {{link}}. Нужно зайти в раздел «Настройки» и выбрать вкладку «Справки».", Collections.singletonList(new LinkAttribute("link", "личном кабинете налогоплательщика", "https://lknpd.nalog.ru/auth/login", C42745f0.U(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), new FontParameter.TextStyleParameter(null, "m20"), underlineParameter))), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_income_title_entrepreneur), new AttributedText("Налоговая декларация должна быть составлена по форме, установленной для вашей системы налогообложения.\n{{usn}}: за последний налоговый период — завершённый календарный год.\n{{evdn}}: за последние 4 налоговых периода — 4 квартала.\n{{3ndfl}}: за последний налоговый период — завершённый календарный год.\nВ копии должна быть отметка налоговой о её принятии.", C42745f0.U(new FontAttribute("usn", "УСН", Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD))), new FontAttribute("evdn", "ЕВДН", Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD))), new FontAttribute("3ndfl", "3-НДФЛ", Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.documents_requirements_income_title_business), new AttributedText("Доходы физического лица можно подтвердить налоговой декларацией: \u20283-НДФЛ за последний налоговый период — завершённый календарный год. В копии должна быть отметка налоговой о её принятии.\nИли справкой 2-НДФЛ — о размере дохода по полученным дивидендам:\n— справка должна подтверждать доходы и сумму налога за последние 12 месяцев;\n— если вы получаете доход меньше года — за количество месяцев;\n— срок действия справки не больше 30 дней.", c42784z0, 1), 0, 4, null)));
        List listU = C42745f0.U(new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_egrn_title_what_is), new AttributedText("Выписка подтверждает, что объект недвижимости зарегистрирован и права на него официально оформлены.", c42784z0, 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_egrn_title_where), new AttributedText("Заказать на Госуслугах. \nЭто может сделать любой участник сделки, но удобнее всего получать выписку собственнику:\n— это бесплатно;\n— займёт пару минут;\n— в выписке укажут основания для регистрации права собственности.\nЕсли выписку заказывает другой участник, эти данные будут скрыты, а услугу понадобится оплатить.", c42784z0, 1), 0, 4, null));
        Document document5 = new Document("EGRN", 4, "egrn", R.string.mortgage_documents_requirements_egrn_title, listU);
        List listU2 = C42745f0.U(new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_passport_for_object_title_where), new AttributedText("Если у недвижимости несколько собственников, нужно приложить паспорта каждого. Есть два варианта:\n{{firstPoint}}Попросить собственников прислать фото или сканы и загрузить их самостоятельно.\n{{secondPoint}}Пригласить собственников или их агента в сделку, чтобы они сами всё загрузили.", C42745f0.U(new BulletAttribute("firstPoint", null, "1.", null, null, null, 34, null), new BulletAttribute("secondPoint", null, "2.", null, null, null, 34, null)), 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_passport_for_object_title_how), new AttributedText("Сделайте фото или сканы всех разворотов:\n— если обложка закрывает часть паспорта, снимите её;\n— пальцы не должны перекрывать информацию;\n— нет бликов или посторонних предметов.", c42784z0, 1), 0, 4, null));
        Document document6 = new Document("PASSPORTS_FOR_OBJECT", 5, "passportsForObject", R.string.mortgage_documents_requirements_passport_for_object_title, listU2);
        Document document7 = new Document("OBJECT_PROPERTY", 6, "objectPropertyDocuments", R.string.mortgage_documents_requirements_object_property_title, C42745f0.U(new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_object_property_title_what_is), new AttributedText("Эти документы подтверждают, каким образом у владельца возникло право собственности на недвижимость.", c42784z0, 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_object_property_title_where), new AttributedText("У собственника. Проверьте документы-основания в выписке ЕГРН — именно они вам и нужны. \nВот какие документы это могут быть:\n— договор купли-продажи, дарения, мены или уступки прав требования;\n— свидетельство о праве на наследство;\n— договор приватизации, долевого участия в строительстве или ренты;\n— решение суда или соглашение о разделе имущества супругов.", c42784z0, 1), 0, 4, null)));
        List listU3 = C42745f0.U(new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_equity_participation_title_what_is), new AttributedText("Договор между покупателем и застройщиком. ДДУ позволяет купить квартиру в доме, который ещё не достроен.\nПо договору покупатель получает статус дольщика и вкладывает деньги в строительство жилья, а продавец обязуется передать ему готовую квартиру, которая соответствует характеристикам в документах.", c42784z0, 1), 0, 4, null), new RequirementParagraph(Integer.valueOf(R.string.mortgage_documents_requirements_equity_participation_title_where), new AttributedText("У застройщика, у которого вы покупаете квартиру. Он сам подготовит договор, а когда вы его подпишете, сам зарегистрирует в Росреестре.", c42784z0, 1), 0, 4, null));
        Document document8 = new Document("EQUITY_PARTICIPATION", 7, "equityParticipationAgreement", R.string.mortgage_documents_requirements_equity_participation_title, listU3);
        List list = listU3;
        Document[] documentArr = {document, document2, document3, document4, document5, document6, document7, document8, new Document("REALTY_OBJECT_PRIMARY", 8, "realtyObjectPrimary", R.string.mortgage_documents_requirements_realty_object_primary_title, C42745f0.h0(list, Collections.singletonList(new RequirementParagraph(null, new AttributedText("{{title}}", Collections.singletonList(new FontAttribute("title", "Договор долевого участия", l.u(null, "h30"))), 1), 12)))), new Document("REALTY_OBJECT_SECONDARY", 9, "realtyObjectSecondary", R.string.mortgage_documents_requirements_realty_object_secondary_title, C42745f0.h0(list, C42745f0.h0(Collections.singletonList(new RequirementParagraph(null, new AttributedText("{{title}}", Collections.singletonList(new FontAttribute("title", "Правоустанавливающие документы", l.u(null, "h30"))), 1), 12)), C42745f0.h0(listU, C42745f0.h0(Collections.singletonList(new RequirementParagraph(null, new AttributedText("{{title}}", Collections.singletonList(new FontAttribute("title", "Выписка из ЕГРН", l.u(null, "h30"))), 1), 12)), C42745f0.h0(listU2, Collections.singletonList(new RequirementParagraph(null, new AttributedText("{{title}}", Collections.singletonList(new FontAttribute("title", "Паспорт РФ", l.u(null, "h30"))), 1), 12))))))))};
        f198967e = documentArr;
        f198968f = c.a(documentArr);
        CREATOR = new Parcelable.Creator<Document>() { // from class: com.avito.android.mortgage.document_requirements.model.Document.a
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                return Document.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i12) {
                return new Document[i12];
            }
        };
    }

    public Document(String str, @e0 int i12, String str2, int i13, List list) {
        this.f198969b = str2;
        this.f198970c = i13;
        this.f198971d = list;
    }

    public static Document valueOf(String str) {
        return (Document) Enum.valueOf(Document.class, str);
    }

    public static Document[] values() {
        return (Document[]) f198967e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
