package com.avito.android.beduin.common.component;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinComponentTheme.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "", "Landroid/os/Parcelable;", "", "res", "<init>", "(Ljava/lang/String;II)V", "a", "AVITO", "AVITO_LOOK_AND_FEEL", "RE_23", "AVITO_RE_23", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinComponentTheme implements Parcelable {

    @com.google.gson.annotations.c("avito")
    public static final BeduinComponentTheme AVITO;

    @com.google.gson.annotations.c("avitoLookAndFeel")
    public static final BeduinComponentTheme AVITO_LOOK_AND_FEEL;

    @com.google.gson.annotations.c("avitoRe23")
    public static final BeduinComponentTheme AVITO_RE_23;

    @Y61.k
    public static final Parcelable.Creator<BeduinComponentTheme> CREATOR;

    @com.google.gson.annotations.c("re23")
    public static final BeduinComponentTheme RE_23;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f100605c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BeduinComponentTheme[] f100606d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100607e;

    /* renamed from: b, reason: collision with root package name */
    public final int f100608b;

    /* compiled from: BeduinComponentTheme.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/BeduinComponentTheme$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BeduinComponentTheme a(@Y61.l String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1906561885) {
                    if (iHashCode != -182907729) {
                        if (iHashCode == 3494836 && str.equals("re23")) {
                            return BeduinComponentTheme.RE_23;
                        }
                    } else if (str.equals("avitoLookAndFeel")) {
                        return BeduinComponentTheme.AVITO_LOOK_AND_FEEL;
                    }
                } else if (str.equals("avitoRe23")) {
                    return BeduinComponentTheme.AVITO_RE_23;
                }
            }
            return BeduinComponentTheme.AVITO;
        }

        public a() {
        }
    }

    static {
        BeduinComponentTheme beduinComponentTheme = new BeduinComponentTheme("AVITO", 0, R.style.Theme_DesignSystem_Legacy);
        AVITO = beduinComponentTheme;
        BeduinComponentTheme beduinComponentTheme2 = new BeduinComponentTheme("AVITO_LOOK_AND_FEEL", 1, R.style.Theme_DesignSystem_LookAndFeel);
        AVITO_LOOK_AND_FEEL = beduinComponentTheme2;
        BeduinComponentTheme beduinComponentTheme3 = new BeduinComponentTheme("RE_23", 2, R.style.Theme_DesignSystem_Re23);
        RE_23 = beduinComponentTheme3;
        BeduinComponentTheme beduinComponentTheme4 = new BeduinComponentTheme("AVITO_RE_23", 3, R.style.Theme_DesignSystem_Re23);
        AVITO_RE_23 = beduinComponentTheme4;
        BeduinComponentTheme[] beduinComponentThemeArr = {beduinComponentTheme, beduinComponentTheme2, beduinComponentTheme3, beduinComponentTheme4};
        f100606d = beduinComponentThemeArr;
        f100607e = kotlin.enums.c.a(beduinComponentThemeArr);
        f100605c = new a(null);
        CREATOR = new Parcelable.Creator<BeduinComponentTheme>() { // from class: com.avito.android.beduin.common.component.BeduinComponentTheme.b
            @Override // android.os.Parcelable.Creator
            public final BeduinComponentTheme createFromParcel(Parcel parcel) {
                return BeduinComponentTheme.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BeduinComponentTheme[] newArray(int i12) {
                return new BeduinComponentTheme[i12];
            }
        };
    }

    private BeduinComponentTheme(String str, int i12, int i13) {
        this.f100608b = i13;
    }

    public static BeduinComponentTheme valueOf(String str) {
        return (BeduinComponentTheme) Enum.valueOf(BeduinComponentTheme.class, str);
    }

    public static BeduinComponentTheme[] values() {
        return (BeduinComponentTheme[]) f100606d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
