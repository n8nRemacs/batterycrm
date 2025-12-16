package com.avito.android.short_term_rent.bookingform.domain;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtractInputUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/InputType;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputType {

    /* renamed from: b, reason: collision with root package name */
    public static final InputType f281323b;

    /* renamed from: c, reason: collision with root package name */
    public static final InputType f281324c;

    /* renamed from: d, reason: collision with root package name */
    public static final InputType f281325d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InputType[] f281326e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f281327f;

    static {
        InputType inputType = new InputType("NAME", 0);
        f281323b = inputType;
        InputType inputType2 = new InputType("PHONE", 1);
        f281324c = inputType2;
        InputType inputType3 = new InputType("EMAIL", 2);
        f281325d = inputType3;
        InputType[] inputTypeArr = {inputType, inputType2, inputType3};
        f281326e = inputTypeArr;
        f281327f = kotlin.enums.c.a(inputTypeArr);
    }

    public InputType() {
        throw null;
    }

    public static InputType valueOf(String str) {
        return (InputType) Enum.valueOf(InputType.class, str);
    }

    public static InputType[] values() {
        return (InputType[]) f281326e.clone();
    }
}
