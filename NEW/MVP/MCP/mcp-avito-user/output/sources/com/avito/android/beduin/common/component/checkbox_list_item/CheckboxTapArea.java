package com.avito.android.beduin.common.component.checkbox_list_item;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckboxTapArea.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;", "", "(Ljava/lang/String;I)V", "COMPONENT", "CHECKBOX", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxTapArea {

    @com.google.gson.annotations.c("checkbox")
    public static final CheckboxTapArea CHECKBOX;

    @com.google.gson.annotations.c("component")
    public static final CheckboxTapArea COMPONENT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CheckboxTapArea[] f100970b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100971c;

    static {
        CheckboxTapArea checkboxTapArea = new CheckboxTapArea("COMPONENT", 0);
        COMPONENT = checkboxTapArea;
        CheckboxTapArea checkboxTapArea2 = new CheckboxTapArea("CHECKBOX", 1);
        CHECKBOX = checkboxTapArea2;
        CheckboxTapArea[] checkboxTapAreaArr = {checkboxTapArea, checkboxTapArea2};
        f100970b = checkboxTapAreaArr;
        f100971c = kotlin.enums.c.a(checkboxTapAreaArr);
    }

    private CheckboxTapArea(String str, int i12) {
    }

    public static CheckboxTapArea valueOf(String str) {
        return (CheckboxTapArea) Enum.valueOf(CheckboxTapArea.class, str);
    }

    public static CheckboxTapArea[] values() {
        return (CheckboxTapArea[]) f100970b.clone();
    }
}
