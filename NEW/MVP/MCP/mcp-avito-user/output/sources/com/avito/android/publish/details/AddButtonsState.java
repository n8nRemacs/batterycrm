package com.avito.android.publish.details;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishDetailsButtonHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/AddButtonsState;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddButtonsState {

    /* renamed from: b, reason: collision with root package name */
    public static final AddButtonsState f232618b;

    /* renamed from: c, reason: collision with root package name */
    public static final AddButtonsState f232619c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AddButtonsState[] f232620d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f232621e;

    static {
        AddButtonsState addButtonsState = new AddButtonsState("SHOWING_NAVIGATION_BUTTON", 0);
        f232618b = addButtonsState;
        AddButtonsState addButtonsState2 = new AddButtonsState("HIDING_ALL_BUTTON", 1);
        f232619c = addButtonsState2;
        AddButtonsState[] addButtonsStateArr = {addButtonsState, addButtonsState2};
        f232620d = addButtonsStateArr;
        f232621e = kotlin.enums.c.a(addButtonsStateArr);
    }

    public AddButtonsState() {
        throw null;
    }

    public static AddButtonsState valueOf(String str) {
        return (AddButtonsState) Enum.valueOf(AddButtonsState.class, str);
    }

    public static AddButtonsState[] values() {
        return (AddButtonsState[]) f232620d.clone();
    }
}
