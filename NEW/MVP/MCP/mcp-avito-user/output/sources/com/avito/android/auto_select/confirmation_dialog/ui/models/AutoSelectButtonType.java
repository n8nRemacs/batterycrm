package com.avito.android.auto_select.confirmation_dialog.ui.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectConfirmationDialogContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/ui/models/AutoSelectButtonType;", "", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectButtonType {

    /* renamed from: b, reason: collision with root package name */
    public static final AutoSelectButtonType f95916b;

    /* renamed from: c, reason: collision with root package name */
    public static final AutoSelectButtonType f95917c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AutoSelectButtonType[] f95918d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f95919e;

    static {
        AutoSelectButtonType autoSelectButtonType = new AutoSelectButtonType("URL", 0);
        f95916b = autoSelectButtonType;
        AutoSelectButtonType autoSelectButtonType2 = new AutoSelectButtonType("BACK", 1);
        f95917c = autoSelectButtonType2;
        AutoSelectButtonType[] autoSelectButtonTypeArr = {autoSelectButtonType, autoSelectButtonType2};
        f95918d = autoSelectButtonTypeArr;
        f95919e = c.a(autoSelectButtonTypeArr);
    }

    public AutoSelectButtonType() {
        throw null;
    }

    public static AutoSelectButtonType valueOf(String str) {
        return (AutoSelectButtonType) Enum.valueOf(AutoSelectButtonType.class, str);
    }

    public static AutoSelectButtonType[] values() {
        return (AutoSelectButtonType[]) f95918d.clone();
    }
}
