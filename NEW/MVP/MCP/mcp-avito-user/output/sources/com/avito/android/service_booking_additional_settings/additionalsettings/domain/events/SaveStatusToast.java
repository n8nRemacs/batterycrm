package com.avito.android.service_booking_additional_settings.additionalsettings.domain.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SaveStatusToastEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/events/SaveStatusToast;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveStatusToast {

    /* renamed from: c, reason: collision with root package name */
    public static final SaveStatusToast f274867c;

    /* renamed from: d, reason: collision with root package name */
    public static final SaveStatusToast f274868d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SaveStatusToast[] f274869e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f274870f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f274871b;

    static {
        SaveStatusToast saveStatusToast = new SaveStatusToast("SUCCESS", 0, "success");
        f274867c = saveStatusToast;
        SaveStatusToast saveStatusToast2 = new SaveStatusToast("ERROR", 1, "error");
        f274868d = saveStatusToast2;
        SaveStatusToast[] saveStatusToastArr = {saveStatusToast, saveStatusToast2};
        f274869e = saveStatusToastArr;
        f274870f = c.a(saveStatusToastArr);
    }

    public SaveStatusToast(String str, int i12, String str2) {
        this.f274871b = str2;
    }

    public static SaveStatusToast valueOf(String str) {
        return (SaveStatusToast) Enum.valueOf(SaveStatusToast.class, str);
    }

    public static SaveStatusToast[] values() {
        return (SaveStatusToast[]) f274869e.clone();
    }
}
