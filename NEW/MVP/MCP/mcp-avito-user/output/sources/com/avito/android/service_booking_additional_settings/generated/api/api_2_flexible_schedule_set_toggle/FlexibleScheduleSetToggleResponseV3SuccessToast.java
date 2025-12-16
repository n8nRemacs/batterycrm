package com.avito.android.service_booking_additional_settings.generated.api.api_2_flexible_schedule_set_toggle;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2FlexibleScheduleSetToggleResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast;", "", "", "buttonText", "text", "Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast$Type;", "c", "()Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast$Type;", "Type", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlexibleScheduleSetToggleResponseV3SuccessToast {

    @c("buttonText")
    @l
    private final String buttonText;

    @c("text")
    @k
    private final String text;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2FlexibleScheduleSetToggleResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/generated/api/api_2_flexible_schedule_set_toggle/FlexibleScheduleSetToggleResponseV3SuccessToast$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PlainToast", "HideOnButtonClick", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("hideOnButtonClick")
        public static final Type HideOnButtonClick;

        @c("plainToast")
        public static final Type PlainToast;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f275227b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f275228c;

        static {
            Type type = new Type("PlainToast", 0, "plainToast");
            PlainToast = type;
            Type type2 = new Type("HideOnButtonClick", 1, "hideOnButtonClick");
            HideOnButtonClick = type2;
            Type[] typeArr = {type, type2};
            f275227b = typeArr;
            f275228c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f275227b.clone();
        }
    }

    public FlexibleScheduleSetToggleResponseV3SuccessToast(@l String str, @k String str2, @k Type type) {
        this.buttonText = str;
        this.text = str2;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
