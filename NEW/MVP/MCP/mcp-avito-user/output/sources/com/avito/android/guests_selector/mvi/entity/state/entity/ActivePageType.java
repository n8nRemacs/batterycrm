package com.avito.android.guests_selector.mvi.entity.state.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActivePageType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/mvi/entity/state/entity/ActivePageType;", "", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivePageType {

    /* renamed from: b, reason: collision with root package name */
    public static final ActivePageType f161554b;

    /* renamed from: c, reason: collision with root package name */
    public static final ActivePageType f161555c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ActivePageType[] f161556d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f161557e;

    static {
        ActivePageType activePageType = new ActivePageType("GUESTS_LIST", 0);
        f161554b = activePageType;
        ActivePageType activePageType2 = new ActivePageType("CHILD_AGE_PICKER", 1);
        f161555c = activePageType2;
        ActivePageType[] activePageTypeArr = {activePageType, activePageType2};
        f161556d = activePageTypeArr;
        f161557e = c.a(activePageTypeArr);
    }

    public ActivePageType() {
        throw null;
    }

    public static ActivePageType valueOf(String str) {
        return (ActivePageType) Enum.valueOf(ActivePageType.class, str);
    }

    public static ActivePageType[] values() {
        return (ActivePageType[]) f161556d.clone();
    }
}
