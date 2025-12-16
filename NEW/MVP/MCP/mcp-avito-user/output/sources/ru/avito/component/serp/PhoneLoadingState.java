package ru.avito.component.serp;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AsyncPhoneItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/PhoneLoadingState;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PhoneLoadingState {

    /* renamed from: b, reason: collision with root package name */
    public static final PhoneLoadingState f430441b;

    /* renamed from: c, reason: collision with root package name */
    public static final PhoneLoadingState f430442c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhoneLoadingState f430443d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PhoneLoadingState[] f430444e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f430445f;

    static {
        PhoneLoadingState phoneLoadingState = new PhoneLoadingState("IDLE", 0);
        f430441b = phoneLoadingState;
        PhoneLoadingState phoneLoadingState2 = new PhoneLoadingState("LOADING", 1);
        f430442c = phoneLoadingState2;
        PhoneLoadingState phoneLoadingState3 = new PhoneLoadingState("BLOCKED", 2);
        f430443d = phoneLoadingState3;
        PhoneLoadingState[] phoneLoadingStateArr = {phoneLoadingState, phoneLoadingState2, phoneLoadingState3};
        f430444e = phoneLoadingStateArr;
        f430445f = c.a(phoneLoadingStateArr);
    }

    public PhoneLoadingState() {
        throw null;
    }

    public static PhoneLoadingState valueOf(String str) {
        return (PhoneLoadingState) Enum.valueOf(PhoneLoadingState.class, str);
    }

    public static PhoneLoadingState[] values() {
        return (PhoneLoadingState[]) f430444e.clone();
    }
}
