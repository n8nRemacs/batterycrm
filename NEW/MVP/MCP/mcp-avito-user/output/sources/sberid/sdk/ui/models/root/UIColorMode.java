package sberid.sdk.ui.models.root;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/ui/models/root/UIColorMode;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UIColorMode {

    /* renamed from: b, reason: collision with root package name */
    public static final UIColorMode f437788b;

    /* renamed from: c, reason: collision with root package name */
    public static final UIColorMode f437789c;

    /* renamed from: d, reason: collision with root package name */
    public static final UIColorMode f437790d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UIColorMode[] f437791e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f437792f;

    static {
        UIColorMode uIColorMode = new UIColorMode("LIGHT", 0);
        f437788b = uIColorMode;
        UIColorMode uIColorMode2 = new UIColorMode("DARK", 1);
        f437789c = uIColorMode2;
        UIColorMode uIColorMode3 = new UIColorMode("AUTO", 2);
        f437790d = uIColorMode3;
        UIColorMode[] uIColorModeArr = {uIColorMode, uIColorMode2, uIColorMode3};
        f437791e = uIColorModeArr;
        f437792f = c.a(uIColorModeArr);
    }

    public UIColorMode() {
        throw null;
    }

    public static UIColorMode valueOf(String str) {
        return (UIColorMode) Enum.valueOf(UIColorMode.class, str);
    }

    public static UIColorMode[] values() {
        return (UIColorMode[]) f437791e.clone();
    }
}
