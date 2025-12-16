package com.avito.android.beduin.common.component.input.single_line;

import com.avito.android.remote.model.category_parameters.NumericParameter;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SingleLineInputModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/input/single_line/KeyboardType;", "", "(Ljava/lang/String;I)V", "NUMERIC", "PHONE", "EMAIL", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class KeyboardType {

    @com.google.gson.annotations.c("emailAddress")
    public static final KeyboardType EMAIL;

    @com.google.gson.annotations.c(NumericParameter.TYPE)
    public static final KeyboardType NUMERIC;

    @com.google.gson.annotations.c("phoneNumber")
    public static final KeyboardType PHONE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KeyboardType[] f101578b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101579c;

    static {
        KeyboardType keyboardType = new KeyboardType("NUMERIC", 0);
        NUMERIC = keyboardType;
        KeyboardType keyboardType2 = new KeyboardType("PHONE", 1);
        PHONE = keyboardType2;
        KeyboardType keyboardType3 = new KeyboardType("EMAIL", 2);
        EMAIL = keyboardType3;
        KeyboardType[] keyboardTypeArr = {keyboardType, keyboardType2, keyboardType3};
        f101578b = keyboardTypeArr;
        f101579c = kotlin.enums.c.a(keyboardTypeArr);
    }

    private KeyboardType(String str, int i12) {
    }

    public static KeyboardType valueOf(String str) {
        return (KeyboardType) Enum.valueOf(KeyboardType.class, str);
    }

    public static KeyboardType[] values() {
        return (KeyboardType[]) f101578b.clone();
    }
}
