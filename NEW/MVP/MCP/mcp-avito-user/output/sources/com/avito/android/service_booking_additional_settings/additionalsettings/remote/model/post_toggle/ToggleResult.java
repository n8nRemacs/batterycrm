package com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.post_toggle;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ToggleResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult;", "", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast;", "toast", "<init>", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast;)V", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast;", "a", "()Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast;", "Toast", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToggleResult {

    @c("toast")
    @k
    private final Toast toast;

    /* compiled from: ToggleResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast;", "", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast$ToastType;", "type", "", "button", "text", "<init>", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast$ToastType;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast$ToastType;", "c", "()Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast$ToastType;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "ToastType", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Toast {

        @c("buttonText")
        @l
        private final String button;

        @c("text")
        @k
        private final String text;

        @c("type")
        @k
        private final ToastType type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ToggleResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/post_toggle/ToggleResult$Toast$ToastType;", "", "(Ljava/lang/String;I)V", "HIDE_ON_CLICK", "PLAIN_TOAST", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ToastType {

            @c("hideOnButtonClick")
            public static final ToastType HIDE_ON_CLICK;

            @c("plainToast")
            public static final ToastType PLAIN_TOAST;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ToastType[] f275105b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ a f275106c;

            static {
                ToastType toastType = new ToastType("HIDE_ON_CLICK", 0);
                HIDE_ON_CLICK = toastType;
                ToastType toastType2 = new ToastType("PLAIN_TOAST", 1);
                PLAIN_TOAST = toastType2;
                ToastType[] toastTypeArr = {toastType, toastType2};
                f275105b = toastTypeArr;
                f275106c = kotlin.enums.c.a(toastTypeArr);
            }

            private ToastType(String str, int i12) {
            }

            public static ToastType valueOf(String str) {
                return (ToastType) Enum.valueOf(ToastType.class, str);
            }

            public static ToastType[] values() {
                return (ToastType[]) f275105b.clone();
            }
        }

        public Toast(@k ToastType toastType, @l String str, @k String str2) {
            this.type = toastType;
            this.button = str;
            this.text = str2;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getButton() {
            return this.button;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ToastType getType() {
            return this.type;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) obj;
            return this.type == toast.type && L.f(this.button, toast.button) && L.f(this.text, toast.text);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.button;
            return this.text.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toast(type=");
            sb2.append(this.type);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }
    }

    public ToggleResult(@k Toast toast) {
        this.toast = toast;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Toast getToast() {
        return this.toast;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToggleResult) && L.f(this.toast, ((ToggleResult) obj).toast);
    }

    public final int hashCode() {
        return this.toast.hashCode();
    }

    @k
    public final String toString() {
        return "ToggleResult(toast=" + this.toast + ')';
    }
}
