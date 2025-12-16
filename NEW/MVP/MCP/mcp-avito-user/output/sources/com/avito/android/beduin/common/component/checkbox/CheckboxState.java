package com.avito.android.beduin.common.component.checkbox;

import Y61.k;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckboxState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "", "", "string", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CHECKED", "INDETERMINATE", "UNCHECKED", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckboxState {

    @com.google.gson.annotations.c(BeduinCartItemModel.CHECKED_STRING)
    public static final CheckboxState CHECKED;

    @com.google.gson.annotations.c("indeterminate")
    public static final CheckboxState INDETERMINATE;

    @com.google.gson.annotations.c(BeduinCartItemModel.UNCHECKED_STRING)
    public static final CheckboxState UNCHECKED;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CheckboxState[] f100925c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100926d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f100927b;

    static {
        CheckboxState checkboxState = new CheckboxState("CHECKED", 0, BeduinCartItemModel.CHECKED_STRING);
        CHECKED = checkboxState;
        CheckboxState checkboxState2 = new CheckboxState("INDETERMINATE", 1, "indeterminate");
        INDETERMINATE = checkboxState2;
        CheckboxState checkboxState3 = new CheckboxState("UNCHECKED", 2, BeduinCartItemModel.UNCHECKED_STRING);
        UNCHECKED = checkboxState3;
        CheckboxState[] checkboxStateArr = {checkboxState, checkboxState2, checkboxState3};
        f100925c = checkboxStateArr;
        f100926d = kotlin.enums.c.a(checkboxStateArr);
    }

    private CheckboxState(String str, int i12, String str2) {
        this.f100927b = str2;
    }

    public static CheckboxState valueOf(String str) {
        return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
    }

    public static CheckboxState[] values() {
        return (CheckboxState[]) f100925c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f100927b;
    }
}
