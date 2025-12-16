package com.avito.android.authorization.complete_registration.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CompleteRegistrationAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/entity/InputType;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputType {

    /* renamed from: b, reason: collision with root package name */
    public static final InputType f93479b;

    /* renamed from: c, reason: collision with root package name */
    public static final InputType f93480c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ InputType[] f93481d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f93482e;

    static {
        InputType inputType = new InputType("NAME", 0);
        f93479b = inputType;
        InputType inputType2 = new InputType("PASSWORD", 1);
        f93480c = inputType2;
        InputType[] inputTypeArr = {inputType, inputType2};
        f93481d = inputTypeArr;
        f93482e = c.a(inputTypeArr);
    }

    public InputType() {
        throw null;
    }

    public static InputType valueOf(String str) {
        return (InputType) Enum.valueOf(InputType.class, str);
    }

    public static InputType[] values() {
        return (InputType[]) f93481d.clone();
    }
}
