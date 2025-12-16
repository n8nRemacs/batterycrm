package sberid.sdk.auth.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/auth/model/ButtonType;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ButtonType {

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonType f437752c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ButtonType[] f437753d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f437754e;

    /* renamed from: b, reason: collision with root package name */
    public final int f437755b;

    static {
        ButtonType buttonType = new ButtonType("DEFAULT_TYPE", 0, 0);
        f437752c = buttonType;
        ButtonType[] buttonTypeArr = {buttonType, new ButtonType("WHITE_TYPE", 1, 1)};
        f437753d = buttonTypeArr;
        f437754e = c.a(buttonTypeArr);
    }

    public ButtonType(String str, int i12, int i13) {
        this.f437755b = i13;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) f437753d.clone();
    }
}
