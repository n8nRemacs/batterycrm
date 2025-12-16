package com.avito.android.beduin.common.component.input.single_line;

import com.avito.android.remote.model.category_parameters.NumericParameter;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SingleLineInputModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/common/component/input/single_line/BeduinFormatterType;", "", "(Ljava/lang/String;I)V", "DECIMAL", "PHONE", "FLOATING", "EMAIL", "DATE", "ROUBLES", "NUMERIC", "PASSPORT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinFormatterType {

    @com.google.gson.annotations.c("date")
    public static final BeduinFormatterType DATE;

    @com.google.gson.annotations.c("decimal")
    public static final BeduinFormatterType DECIMAL;

    @com.google.gson.annotations.c("emailAddress")
    public static final BeduinFormatterType EMAIL;

    @com.google.gson.annotations.c("floatingPoint")
    public static final BeduinFormatterType FLOATING;

    @com.google.gson.annotations.c(NumericParameter.TYPE)
    public static final BeduinFormatterType NUMERIC;

    @com.google.gson.annotations.c("passport")
    public static final BeduinFormatterType PASSPORT;

    @com.google.gson.annotations.c("phoneNumber")
    public static final BeduinFormatterType PHONE;

    @com.google.gson.annotations.c("roubles")
    public static final BeduinFormatterType ROUBLES;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinFormatterType[] f101576b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101577c;

    static {
        BeduinFormatterType beduinFormatterType = new BeduinFormatterType("DECIMAL", 0);
        DECIMAL = beduinFormatterType;
        BeduinFormatterType beduinFormatterType2 = new BeduinFormatterType("PHONE", 1);
        PHONE = beduinFormatterType2;
        BeduinFormatterType beduinFormatterType3 = new BeduinFormatterType("FLOATING", 2);
        FLOATING = beduinFormatterType3;
        BeduinFormatterType beduinFormatterType4 = new BeduinFormatterType("EMAIL", 3);
        EMAIL = beduinFormatterType4;
        BeduinFormatterType beduinFormatterType5 = new BeduinFormatterType("DATE", 4);
        DATE = beduinFormatterType5;
        BeduinFormatterType beduinFormatterType6 = new BeduinFormatterType("ROUBLES", 5);
        ROUBLES = beduinFormatterType6;
        BeduinFormatterType beduinFormatterType7 = new BeduinFormatterType("NUMERIC", 6);
        NUMERIC = beduinFormatterType7;
        BeduinFormatterType beduinFormatterType8 = new BeduinFormatterType("PASSPORT", 7);
        PASSPORT = beduinFormatterType8;
        BeduinFormatterType[] beduinFormatterTypeArr = {beduinFormatterType, beduinFormatterType2, beduinFormatterType3, beduinFormatterType4, beduinFormatterType5, beduinFormatterType6, beduinFormatterType7, beduinFormatterType8};
        f101576b = beduinFormatterTypeArr;
        f101577c = kotlin.enums.c.a(beduinFormatterTypeArr);
    }

    private BeduinFormatterType(String str, int i12) {
    }

    public static BeduinFormatterType valueOf(String str) {
        return (BeduinFormatterType) Enum.valueOf(BeduinFormatterType.class, str);
    }

    public static BeduinFormatterType[] values() {
        return (BeduinFormatterType[]) f101576b.clone();
    }
}
