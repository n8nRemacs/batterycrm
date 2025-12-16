package com.avito.android.mortgage.api.model.items.application;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationPersonalStatusItemValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationLegacyStatusType;", "", "(Ljava/lang/String;I)V", "VALIDATION", "SUCCESS", "ERROR", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationLegacyStatusType {

    @c("error")
    public static final ApplicationLegacyStatusType ERROR;

    @c("success")
    public static final ApplicationLegacyStatusType SUCCESS;

    @c("validation")
    public static final ApplicationLegacyStatusType VALIDATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ApplicationLegacyStatusType[] f198218b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198219c;

    static {
        ApplicationLegacyStatusType applicationLegacyStatusType = new ApplicationLegacyStatusType("VALIDATION", 0);
        VALIDATION = applicationLegacyStatusType;
        ApplicationLegacyStatusType applicationLegacyStatusType2 = new ApplicationLegacyStatusType("SUCCESS", 1);
        SUCCESS = applicationLegacyStatusType2;
        ApplicationLegacyStatusType applicationLegacyStatusType3 = new ApplicationLegacyStatusType("ERROR", 2);
        ERROR = applicationLegacyStatusType3;
        ApplicationLegacyStatusType[] applicationLegacyStatusTypeArr = {applicationLegacyStatusType, applicationLegacyStatusType2, applicationLegacyStatusType3};
        f198218b = applicationLegacyStatusTypeArr;
        f198219c = kotlin.enums.c.a(applicationLegacyStatusTypeArr);
    }

    private ApplicationLegacyStatusType(String str, int i12) {
    }

    public static ApplicationLegacyStatusType valueOf(String str) {
        return (ApplicationLegacyStatusType) Enum.valueOf(ApplicationLegacyStatusType.class, str);
    }

    public static ApplicationLegacyStatusType[] values() {
        return (ApplicationLegacyStatusType[]) f198218b.clone();
    }
}
