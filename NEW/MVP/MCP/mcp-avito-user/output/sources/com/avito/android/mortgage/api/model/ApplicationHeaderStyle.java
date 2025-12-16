package com.avito.android.mortgage.api.model;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationHeaderStyle;", "", "(Ljava/lang/String;I)V", "DRAFT", "INFO", "SUCCESS", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationHeaderStyle {

    @c("edit")
    public static final ApplicationHeaderStyle DRAFT;

    @c(RequestReviewResultKt.INFO_TYPE)
    public static final ApplicationHeaderStyle INFO;

    @c("success")
    public static final ApplicationHeaderStyle SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ApplicationHeaderStyle[] f198201b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198202c;

    static {
        ApplicationHeaderStyle applicationHeaderStyle = new ApplicationHeaderStyle("DRAFT", 0);
        DRAFT = applicationHeaderStyle;
        ApplicationHeaderStyle applicationHeaderStyle2 = new ApplicationHeaderStyle("INFO", 1);
        INFO = applicationHeaderStyle2;
        ApplicationHeaderStyle applicationHeaderStyle3 = new ApplicationHeaderStyle("SUCCESS", 2);
        SUCCESS = applicationHeaderStyle3;
        ApplicationHeaderStyle[] applicationHeaderStyleArr = {applicationHeaderStyle, applicationHeaderStyle2, applicationHeaderStyle3};
        f198201b = applicationHeaderStyleArr;
        f198202c = kotlin.enums.c.a(applicationHeaderStyleArr);
    }

    private ApplicationHeaderStyle(String str, int i12) {
    }

    public static ApplicationHeaderStyle valueOf(String str) {
        return (ApplicationHeaderStyle) Enum.valueOf(ApplicationHeaderStyle.class, str);
    }

    public static ApplicationHeaderStyle[] values() {
        return (ApplicationHeaderStyle[]) f198201b.clone();
    }
}
