package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinTitleAlignment.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/network/model/BeduinTitleAlignment;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "a", "LEFT", "CENTER", "PLATFORM_NATIVE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinTitleAlignment implements Parcelable {

    @c("center")
    public static final BeduinTitleAlignment CENTER;

    @k
    public static final Parcelable.Creator<BeduinTitleAlignment> CREATOR;

    @c("left")
    public static final BeduinTitleAlignment LEFT;

    @c("platformNative")
    public static final BeduinTitleAlignment PLATFORM_NATIVE;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f104010b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final BeduinTitleAlignment f104011c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BeduinTitleAlignment[] f104012d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f104013e;

    /* compiled from: BeduinTitleAlignment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/network/model/BeduinTitleAlignment$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BeduinTitleAlignment beduinTitleAlignment = new BeduinTitleAlignment("LEFT", 0);
        LEFT = beduinTitleAlignment;
        BeduinTitleAlignment beduinTitleAlignment2 = new BeduinTitleAlignment("CENTER", 1);
        CENTER = beduinTitleAlignment2;
        BeduinTitleAlignment beduinTitleAlignment3 = new BeduinTitleAlignment("PLATFORM_NATIVE", 2);
        PLATFORM_NATIVE = beduinTitleAlignment3;
        BeduinTitleAlignment[] beduinTitleAlignmentArr = {beduinTitleAlignment, beduinTitleAlignment2, beduinTitleAlignment3};
        f104012d = beduinTitleAlignmentArr;
        f104013e = kotlin.enums.c.a(beduinTitleAlignmentArr);
        f104010b = new a(null);
        CREATOR = new Parcelable.Creator<BeduinTitleAlignment>() { // from class: com.avito.android.beduin.network.model.BeduinTitleAlignment.b
            @Override // android.os.Parcelable.Creator
            public final BeduinTitleAlignment createFromParcel(Parcel parcel) {
                return BeduinTitleAlignment.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BeduinTitleAlignment[] newArray(int i12) {
                return new BeduinTitleAlignment[i12];
            }
        };
        f104011c = beduinTitleAlignment3;
    }

    private BeduinTitleAlignment(String str, int i12) {
    }

    public static BeduinTitleAlignment valueOf(String str) {
        return (BeduinTitleAlignment) Enum.valueOf(BeduinTitleAlignment.class, str);
    }

    public static BeduinTitleAlignment[] values() {
        return (BeduinTitleAlignment[]) f104012d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
