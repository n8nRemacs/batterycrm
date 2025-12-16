package com.avito.android.select.new_location_common.ui;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckBoxExpandableLineState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_location_common/ui/CheckBoxExpandableLineState;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckBoxExpandableLineState {

    /* renamed from: b, reason: collision with root package name */
    public static final CheckBoxExpandableLineState f265893b;

    /* renamed from: c, reason: collision with root package name */
    public static final CheckBoxExpandableLineState f265894c;

    /* renamed from: d, reason: collision with root package name */
    public static final CheckBoxExpandableLineState f265895d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CheckBoxExpandableLineState[] f265896e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f265897f;

    static {
        CheckBoxExpandableLineState checkBoxExpandableLineState = new CheckBoxExpandableLineState("None", 0);
        f265893b = checkBoxExpandableLineState;
        CheckBoxExpandableLineState checkBoxExpandableLineState2 = new CheckBoxExpandableLineState("Partly", 1);
        f265894c = checkBoxExpandableLineState2;
        CheckBoxExpandableLineState checkBoxExpandableLineState3 = new CheckBoxExpandableLineState("All", 2);
        f265895d = checkBoxExpandableLineState3;
        CheckBoxExpandableLineState[] checkBoxExpandableLineStateArr = {checkBoxExpandableLineState, checkBoxExpandableLineState2, checkBoxExpandableLineState3};
        f265896e = checkBoxExpandableLineStateArr;
        f265897f = c.a(checkBoxExpandableLineStateArr);
    }

    public CheckBoxExpandableLineState() {
        throw null;
    }

    public static CheckBoxExpandableLineState valueOf(String str) {
        return (CheckBoxExpandableLineState) Enum.valueOf(CheckBoxExpandableLineState.class, str);
    }

    public static CheckBoxExpandableLineState[] values() {
        return (CheckBoxExpandableLineState[]) f265896e.clone();
    }
}
