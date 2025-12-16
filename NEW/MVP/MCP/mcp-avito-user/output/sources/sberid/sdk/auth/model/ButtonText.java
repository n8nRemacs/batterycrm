package sberid.sdk.auth.model;

import com.avito.android.R;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lsberid/sdk/auth/model/ButtonText;", "", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ButtonText {

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonText f437748c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ButtonText[] f437749d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f437750e;

    /* renamed from: b, reason: collision with root package name */
    public final int f437751b;

    static {
        ButtonText buttonText = new ButtonText("LOGIN", 0, 0, R.string.login_sber_id_logo_text);
        f437748c = buttonText;
        ButtonText[] buttonTextArr = {buttonText, new ButtonText("LOGIN_SHORT", 1, 1, R.string.login_short_sber_id_logo_text), new ButtonText("CONTINUE", 2, 2, R.string.continue_sber_id_logo_text), new ButtonText("FILL", 3, 3, R.string.fill_sber_id_logo_text)};
        f437749d = buttonTextArr;
        f437750e = c.a(buttonTextArr);
    }

    public ButtonText(String str, int i12, int i13, int i14) {
        this.f437751b = i13;
    }

    public static ButtonText valueOf(String str) {
        return (ButtonText) Enum.valueOf(ButtonText.class, str);
    }

    public static ButtonText[] values() {
        return (ButtonText[]) f437749d.clone();
    }
}
