package com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacUIWaitBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/wait_bottom_sheet/IacUIWaitBottomSheetType;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacUIWaitBottomSheetType {

    /* renamed from: b, reason: collision with root package name */
    public static final IacUIWaitBottomSheetType f167398b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacUIWaitBottomSheetType f167399c;

    /* renamed from: d, reason: collision with root package name */
    public static final IacUIWaitBottomSheetType f167400d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ IacUIWaitBottomSheetType[] f167401e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f167402f;

    static {
        IacUIWaitBottomSheetType iacUIWaitBottomSheetType = new IacUIWaitBottomSheetType("Dialing", 0);
        f167398b = iacUIWaitBottomSheetType;
        IacUIWaitBottomSheetType iacUIWaitBottomSheetType2 = new IacUIWaitBottomSheetType("Ringing", 1);
        f167399c = iacUIWaitBottomSheetType2;
        IacUIWaitBottomSheetType iacUIWaitBottomSheetType3 = new IacUIWaitBottomSheetType("Gsm", 2);
        f167400d = iacUIWaitBottomSheetType3;
        IacUIWaitBottomSheetType[] iacUIWaitBottomSheetTypeArr = {iacUIWaitBottomSheetType, iacUIWaitBottomSheetType2, iacUIWaitBottomSheetType3};
        f167401e = iacUIWaitBottomSheetTypeArr;
        f167402f = kotlin.enums.c.a(iacUIWaitBottomSheetTypeArr);
    }

    public IacUIWaitBottomSheetType() {
        throw null;
    }

    public static IacUIWaitBottomSheetType valueOf(String str) {
        return (IacUIWaitBottomSheetType) Enum.valueOf(IacUIWaitBottomSheetType.class, str);
    }

    public static IacUIWaitBottomSheetType[] values() {
        return (IacUIWaitBottomSheetType[]) f167401e.clone();
    }
}
