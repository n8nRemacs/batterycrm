package com.avito.android.delivery_tarifikator.analytics.clickstream;

import Y61.k;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Events.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/analytics/clickstream/ErrorLevel;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorLevel {

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorLevel f135224c;

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorLevel f135225d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ErrorLevel[] f135226e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f135227f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135228b;

    static {
        ErrorLevel errorLevel = new ErrorLevel("WARNING", 0, ConstraintKt.WARNING);
        f135224c = errorLevel;
        ErrorLevel errorLevel2 = new ErrorLevel("ERROR", 1, "error");
        f135225d = errorLevel2;
        ErrorLevel[] errorLevelArr = {errorLevel, errorLevel2};
        f135226e = errorLevelArr;
        f135227f = c.a(errorLevelArr);
    }

    public ErrorLevel(String str, int i12, String str2) {
        this.f135228b = str2;
    }

    public static ErrorLevel valueOf(String str) {
        return (ErrorLevel) Enum.valueOf(ErrorLevel.class, str);
    }

    public static ErrorLevel[] values() {
        return (ErrorLevel[]) f135226e.clone();
    }
}
