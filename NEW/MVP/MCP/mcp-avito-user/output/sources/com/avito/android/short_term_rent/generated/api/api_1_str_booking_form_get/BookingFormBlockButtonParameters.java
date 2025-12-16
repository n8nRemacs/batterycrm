package com.avito.android.short_term_rent.generated.api.api_1_str_booking_form_get;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1StrBookingFormGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters;", "", "", "fullWidth", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Preset;", "preset", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Size;", "size", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Preset;Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Size;)V", "Ljava/lang/Boolean;", "getFullWidth", "()Ljava/lang/Boolean;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Preset;", "getPreset", "()Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Preset;", "Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Size;", "getSize", "()Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Size;", "Preset", "Size", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFormBlockButtonParameters {

    @c("fullWidth")
    @l
    private final Boolean fullWidth;

    @c("preset")
    @l
    private final Preset preset;

    @c("size")
    @l
    private final Size size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Preset;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preset {

        @c("primary")
        public static final Preset Primary;

        @c("secondary")
        public static final Preset Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Preset[] f282351b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f282352c;

        static {
            Preset preset = new Preset("Primary", 0, "primary");
            Primary = preset;
            Preset preset2 = new Preset("Secondary", 1, "secondary");
            Secondary = preset2;
            Preset[] presetArr = {preset, preset2};
            f282351b = presetArr;
            f282352c = kotlin.enums.c.a(presetArr);
        }

        private Preset(String str, int i12, String str2) {
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) f282351b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1StrBookingFormGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/short_term_rent/generated/api/api_1_str_booking_form_get/BookingFormBlockButtonParameters$Size;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Xs", "S", "M", "L", "Xl", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Size {

        /* renamed from: L, reason: collision with root package name */
        @c("l")
        public static final Size f282353L;

        /* renamed from: M, reason: collision with root package name */
        @c("m")
        public static final Size f282354M;

        /* renamed from: S, reason: collision with root package name */
        @c("s")
        public static final Size f282355S;

        /* renamed from: Xl, reason: collision with root package name */
        @c("xl")
        public static final Size f282356Xl;

        /* renamed from: Xs, reason: collision with root package name */
        @c("xs")
        public static final Size f282357Xs;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Size[] f282358b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f282359c;

        static {
            Size size = new Size("Xs", 0, "xs");
            f282357Xs = size;
            Size size2 = new Size("S", 1, "s");
            f282355S = size2;
            Size size3 = new Size("M", 2, "m");
            f282354M = size3;
            Size size4 = new Size("L", 3, "l");
            f282353L = size4;
            Size size5 = new Size("Xl", 4, "xl");
            f282356Xl = size5;
            Size[] sizeArr = {size, size2, size3, size4, size5};
            f282358b = sizeArr;
            f282359c = kotlin.enums.c.a(sizeArr);
        }

        private Size(String str, int i12, String str2) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) f282358b.clone();
        }
    }

    public BookingFormBlockButtonParameters(@l Boolean bool, @l Preset preset, @l Size size) {
        this.fullWidth = bool;
        this.preset = preset;
        this.size = size;
    }
}
