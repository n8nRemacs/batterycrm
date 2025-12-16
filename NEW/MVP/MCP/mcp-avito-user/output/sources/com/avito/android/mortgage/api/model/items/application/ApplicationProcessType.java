package com.avito.android.mortgage.api.model.items.application;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationProcessItemValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationProcessType;", "", "(Ljava/lang/String;I)V", "NEXT", "PREVIOUS", "SAVE", "CONFIRM_REALTY_OBJECT", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationProcessType {

    @c("confirmRealtyObject")
    public static final ApplicationProcessType CONFIRM_REALTY_OBJECT;

    @c("nextStep")
    public static final ApplicationProcessType NEXT;

    @c("previousStep")
    public static final ApplicationProcessType PREVIOUS;

    @c("saveApplication")
    public static final ApplicationProcessType SAVE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ApplicationProcessType[] f198220b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198221c;

    static {
        ApplicationProcessType applicationProcessType = new ApplicationProcessType("NEXT", 0);
        NEXT = applicationProcessType;
        ApplicationProcessType applicationProcessType2 = new ApplicationProcessType("PREVIOUS", 1);
        PREVIOUS = applicationProcessType2;
        ApplicationProcessType applicationProcessType3 = new ApplicationProcessType("SAVE", 2);
        SAVE = applicationProcessType3;
        ApplicationProcessType applicationProcessType4 = new ApplicationProcessType("CONFIRM_REALTY_OBJECT", 3);
        CONFIRM_REALTY_OBJECT = applicationProcessType4;
        ApplicationProcessType[] applicationProcessTypeArr = {applicationProcessType, applicationProcessType2, applicationProcessType3, applicationProcessType4};
        f198220b = applicationProcessTypeArr;
        f198221c = kotlin.enums.c.a(applicationProcessTypeArr);
    }

    private ApplicationProcessType(String str, int i12) {
    }

    public static ApplicationProcessType valueOf(String str) {
        return (ApplicationProcessType) Enum.valueOf(ApplicationProcessType.class, str);
    }

    public static ApplicationProcessType[] values() {
        return (ApplicationProcessType[]) f198220b.clone();
    }
}
