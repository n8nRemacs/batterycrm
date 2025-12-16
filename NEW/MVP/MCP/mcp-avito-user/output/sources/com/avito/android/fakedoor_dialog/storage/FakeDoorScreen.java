package com.avito.android.fakedoor_dialog.storage;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FakeDoorStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fakedoor_dialog/storage/FakeDoorScreen;", "", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FakeDoorScreen {

    /* renamed from: b, reason: collision with root package name */
    public static final FakeDoorScreen f155149b;

    /* renamed from: c, reason: collision with root package name */
    public static final FakeDoorScreen f155150c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FakeDoorScreen[] f155151d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f155152e;

    static {
        FakeDoorScreen fakeDoorScreen = new FakeDoorScreen("ADVERT_DETAILS", 0);
        f155149b = fakeDoorScreen;
        FakeDoorScreen fakeDoorScreen2 = new FakeDoorScreen("SELLER_ADVERT_DETAILS", 1);
        f155150c = fakeDoorScreen2;
        FakeDoorScreen[] fakeDoorScreenArr = {fakeDoorScreen, fakeDoorScreen2};
        f155151d = fakeDoorScreenArr;
        f155152e = c.a(fakeDoorScreenArr);
    }

    public static FakeDoorScreen valueOf(String str) {
        return (FakeDoorScreen) Enum.valueOf(FakeDoorScreen.class, str);
    }

    public static FakeDoorScreen[] values() {
        return (FakeDoorScreen[]) f155151d.clone();
    }
}
