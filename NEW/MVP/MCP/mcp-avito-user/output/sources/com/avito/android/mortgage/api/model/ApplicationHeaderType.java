package com.avito.android.mortgage.api.model;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationHeaderType;", "", "(Ljava/lang/String;I)V", "MORTGAGE", "SELECTED_APPEAL", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationHeaderType {

    @c("mortgage")
    public static final ApplicationHeaderType MORTGAGE;

    @c("selected_appeal")
    public static final ApplicationHeaderType SELECTED_APPEAL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ApplicationHeaderType[] f198203b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198204c;

    static {
        ApplicationHeaderType applicationHeaderType = new ApplicationHeaderType("MORTGAGE", 0);
        MORTGAGE = applicationHeaderType;
        ApplicationHeaderType applicationHeaderType2 = new ApplicationHeaderType("SELECTED_APPEAL", 1);
        SELECTED_APPEAL = applicationHeaderType2;
        ApplicationHeaderType[] applicationHeaderTypeArr = {applicationHeaderType, applicationHeaderType2};
        f198203b = applicationHeaderTypeArr;
        f198204c = kotlin.enums.c.a(applicationHeaderTypeArr);
    }

    private ApplicationHeaderType(String str, int i12) {
    }

    public static ApplicationHeaderType valueOf(String str) {
        return (ApplicationHeaderType) Enum.valueOf(ApplicationHeaderType.class, str);
    }

    public static ApplicationHeaderType[] values() {
        return (ApplicationHeaderType[]) f198203b.clone();
    }
}
