package com.avito.android.bbl.generated.api.api_1_get_available_contacts;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1GetAvailableContactsResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar;", "", "Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar$Color;", "color", "", "description", "", "value", "<init>", "(Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar$Color;Ljava/lang/String;D)V", "Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar$Color;", "a", "()Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar$Color;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "D", "c", "()D", "Color", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProgressBar {

    @c("color")
    @k
    private final Color color;

    @c("description")
    @k
    private final String description;

    @c("value")
    private final double value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1GetAvailableContactsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_1_get_available_contacts/ProgressBar$Color;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Orange", "Green", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        @c("green")
        public static final Color Green;

        @c("orange")
        public static final Color Orange;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Color[] f99073b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f99074c;

        static {
            Color color = new Color("Orange", 0, "orange");
            Orange = color;
            Color color2 = new Color("Green", 1, "green");
            Green = color2;
            Color[] colorArr = {color, color2};
            f99073b = colorArr;
            f99074c = kotlin.enums.c.a(colorArr);
        }

        private Color(String str, int i12, String str2) {
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f99073b.clone();
        }
    }

    public ProgressBar(@k Color color, @k String str, double d12) {
        this.color = color;
        this.description = str;
        this.value = d12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final double getValue() {
        return this.value;
    }
}
