package com.avito.android.lib.deprecated_design.select;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/SelectState;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectState {

    /* renamed from: e, reason: collision with root package name */
    public static final SelectState f178091e;

    /* renamed from: f, reason: collision with root package name */
    public static final SelectState f178092f;

    /* renamed from: g, reason: collision with root package name */
    public static final SelectState f178093g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ SelectState[] f178094h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f178095i;

    /* renamed from: b, reason: collision with root package name */
    public final int f178096b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178097c;

    /* renamed from: d, reason: collision with root package name */
    public final int f178098d;

    static {
        SelectState selectState = new SelectState("NORMAL", 0, R.attr.gray4, R.attr.gray12, R.attr.gray48);
        f178091e = selectState;
        SelectState selectState2 = new SelectState("WARNING", 1, R.attr.orange50, R.attr.orange200, R.attr.gray48);
        f178092f = selectState2;
        SelectState selectState3 = new SelectState("ERROR", 2, R.attr.red50, R.attr.red100, R.attr.red);
        f178093g = selectState3;
        SelectState[] selectStateArr = {selectState, selectState2, selectState3};
        f178094h = selectStateArr;
        f178095i = kotlin.enums.c.a(selectStateArr);
    }

    public SelectState(@InterfaceC42150f String str, @InterfaceC42150f int i12, @InterfaceC42150f int i13, int i14, int i15) {
        this.f178096b = i13;
        this.f178097c = i14;
        this.f178098d = i15;
    }

    public static SelectState valueOf(String str) {
        return (SelectState) Enum.valueOf(SelectState.class, str);
    }

    public static SelectState[] values() {
        return (SelectState[]) f178094h.clone();
    }
}
