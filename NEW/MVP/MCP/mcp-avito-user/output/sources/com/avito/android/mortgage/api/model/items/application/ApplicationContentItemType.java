package com.avito.android.mortgage.api.model.items.application;

import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationContentItemType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationContentItemType;", "", "<init>", "(Ljava/lang/String;I)V", "ISSUE", "TITLE", "BORROWER", "ADD_CO_BORROWER", "PROCESS_ACTIONS", "DISCLAIMER", "PRIVACY_POLICY", "APPLICATION_STATUS", "APPEALS", "CTA_BANNER", "IMMUTABLE_INFO", "INFO_BANNER", "STATUS", "TEAM", "APPLICATION_COMMENT", "APPEAL_BANNER", "MORTGAGE_PROGRESS", "REALTY_OBJECT", "REALTY_OBJECT_DETAILS", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationContentItemType {

    @c("addApplicant")
    public static final ApplicationContentItemType ADD_CO_BORROWER;

    @c("appeals")
    public static final ApplicationContentItemType APPEALS;

    @c("appealBanner")
    public static final ApplicationContentItemType APPEAL_BANNER;

    @c("applicationComment")
    public static final ApplicationContentItemType APPLICATION_COMMENT;

    @c("applicationStatus")
    public static final ApplicationContentItemType APPLICATION_STATUS;

    @c("applicant")
    public static final ApplicationContentItemType BORROWER;

    @c("ctaBanner")
    public static final ApplicationContentItemType CTA_BANNER;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    public static final ApplicationContentItemType DISCLAIMER;

    @c("immutableInfo")
    public static final ApplicationContentItemType IMMUTABLE_INFO;

    @c("infoBanner")
    public static final ApplicationContentItemType INFO_BANNER;

    @c("issue")
    public static final ApplicationContentItemType ISSUE;

    @c("mortgageProgress")
    public static final ApplicationContentItemType MORTGAGE_PROGRESS;

    @c("privacyPolicy")
    public static final ApplicationContentItemType PRIVACY_POLICY;

    @c("processActions")
    public static final ApplicationContentItemType PROCESS_ACTIONS;

    @c("realtyObject")
    public static final ApplicationContentItemType REALTY_OBJECT;

    @c("realtyObjectDetails")
    public static final ApplicationContentItemType REALTY_OBJECT_DETAILS;

    @c("status")
    public static final ApplicationContentItemType STATUS;

    @c("team")
    public static final ApplicationContentItemType TEAM;

    @c("title")
    public static final ApplicationContentItemType TITLE;

    /* renamed from: b, reason: collision with root package name */
    public static final ApplicationContentItemType f198215b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ApplicationContentItemType[] f198216c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f198217d;

    static {
        ApplicationContentItemType applicationContentItemType = new ApplicationContentItemType("ISSUE", 0);
        ISSUE = applicationContentItemType;
        ApplicationContentItemType applicationContentItemType2 = new ApplicationContentItemType("TITLE", 1);
        TITLE = applicationContentItemType2;
        ApplicationContentItemType applicationContentItemType3 = new ApplicationContentItemType("BORROWER", 2);
        BORROWER = applicationContentItemType3;
        ApplicationContentItemType applicationContentItemType4 = new ApplicationContentItemType("ADD_CO_BORROWER", 3);
        ADD_CO_BORROWER = applicationContentItemType4;
        ApplicationContentItemType applicationContentItemType5 = new ApplicationContentItemType("PROCESS_ACTIONS", 4);
        PROCESS_ACTIONS = applicationContentItemType5;
        ApplicationContentItemType applicationContentItemType6 = new ApplicationContentItemType("DISCLAIMER", 5);
        DISCLAIMER = applicationContentItemType6;
        ApplicationContentItemType applicationContentItemType7 = new ApplicationContentItemType("PRIVACY_POLICY", 6);
        PRIVACY_POLICY = applicationContentItemType7;
        ApplicationContentItemType applicationContentItemType8 = new ApplicationContentItemType("APPLICATION_STATUS", 7);
        APPLICATION_STATUS = applicationContentItemType8;
        ApplicationContentItemType applicationContentItemType9 = new ApplicationContentItemType("APPEALS", 8);
        APPEALS = applicationContentItemType9;
        ApplicationContentItemType applicationContentItemType10 = new ApplicationContentItemType("CTA_BANNER", 9);
        CTA_BANNER = applicationContentItemType10;
        ApplicationContentItemType applicationContentItemType11 = new ApplicationContentItemType("IMMUTABLE_INFO", 10);
        IMMUTABLE_INFO = applicationContentItemType11;
        ApplicationContentItemType applicationContentItemType12 = new ApplicationContentItemType("INFO_BANNER", 11);
        INFO_BANNER = applicationContentItemType12;
        ApplicationContentItemType applicationContentItemType13 = new ApplicationContentItemType("STATUS", 12);
        STATUS = applicationContentItemType13;
        ApplicationContentItemType applicationContentItemType14 = new ApplicationContentItemType("TEAM", 13);
        TEAM = applicationContentItemType14;
        ApplicationContentItemType applicationContentItemType15 = new ApplicationContentItemType("APPLICATION_COMMENT", 14);
        APPLICATION_COMMENT = applicationContentItemType15;
        ApplicationContentItemType applicationContentItemType16 = new ApplicationContentItemType("APPEAL_BANNER", 15);
        APPEAL_BANNER = applicationContentItemType16;
        ApplicationContentItemType applicationContentItemType17 = new ApplicationContentItemType("MORTGAGE_PROGRESS", 16);
        MORTGAGE_PROGRESS = applicationContentItemType17;
        ApplicationContentItemType applicationContentItemType18 = new ApplicationContentItemType("REALTY_OBJECT", 17);
        REALTY_OBJECT = applicationContentItemType18;
        ApplicationContentItemType applicationContentItemType19 = new ApplicationContentItemType("REALTY_OBJECT_DETAILS", 18);
        REALTY_OBJECT_DETAILS = applicationContentItemType19;
        ApplicationContentItemType applicationContentItemType20 = new ApplicationContentItemType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 19);
        f198215b = applicationContentItemType20;
        ApplicationContentItemType[] applicationContentItemTypeArr = {applicationContentItemType, applicationContentItemType2, applicationContentItemType3, applicationContentItemType4, applicationContentItemType5, applicationContentItemType6, applicationContentItemType7, applicationContentItemType8, applicationContentItemType9, applicationContentItemType10, applicationContentItemType11, applicationContentItemType12, applicationContentItemType13, applicationContentItemType14, applicationContentItemType15, applicationContentItemType16, applicationContentItemType17, applicationContentItemType18, applicationContentItemType19, applicationContentItemType20};
        f198216c = applicationContentItemTypeArr;
        f198217d = kotlin.enums.c.a(applicationContentItemTypeArr);
    }

    private ApplicationContentItemType(String str, int i12) {
    }

    public static ApplicationContentItemType valueOf(String str) {
        return (ApplicationContentItemType) Enum.valueOf(ApplicationContentItemType.class, str);
    }

    public static ApplicationContentItemType[] values() {
        return (ApplicationContentItemType[]) f198216c.clone();
    }
}
