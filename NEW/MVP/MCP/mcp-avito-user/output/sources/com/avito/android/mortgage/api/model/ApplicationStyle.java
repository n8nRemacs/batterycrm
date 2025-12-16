package com.avito.android.mortgage.api.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationsListModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationStyle;", "", "<init>", "(Ljava/lang/String;I)V", "a", "SUCCESS", "DRAFT", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicationStyle {

    @c("draft")
    public static final ApplicationStyle DRAFT;

    @c("success")
    public static final ApplicationStyle SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f198205b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ApplicationStyle[] f198206c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198207d;

    /* compiled from: ApplicationsListModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationStyle$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ApplicationStyle applicationStyle = new ApplicationStyle("SUCCESS", 0);
        SUCCESS = applicationStyle;
        ApplicationStyle applicationStyle2 = new ApplicationStyle("DRAFT", 1);
        DRAFT = applicationStyle2;
        ApplicationStyle[] applicationStyleArr = {applicationStyle, applicationStyle2};
        f198206c = applicationStyleArr;
        f198207d = kotlin.enums.c.a(applicationStyleArr);
        f198205b = new a(null);
    }

    private ApplicationStyle(String str, int i12) {
    }

    public static ApplicationStyle valueOf(String str) {
        return (ApplicationStyle) Enum.valueOf(ApplicationStyle.class, str);
    }

    public static ApplicationStyle[] values() {
        return (ApplicationStyle[]) f198206c.clone();
    }
}
