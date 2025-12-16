package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ukh {
    public static final ukh X;
    public static final ukh Y;
    public static final ukh Z;
    public static final ukh c;
    public static final ukh d;
    public static final ukh o;
    public static final ukh s0;
    public static final /* synthetic */ ukh[] t0;
    public static final /* synthetic */ zg5 u0;
    public final String a;
    public final int b;

    static {
        ukh ukhVar = new ukh("MONEY_BUTTON", 0, 1, "money_button");
        ukh ukhVar2 = new ukh("START_BUTTON", 1, 2, "start_button");
        ukh ukhVar3 = new ukh("URL", 2, 3, KwsFeaturesConfigProviderImpl.URL_KEY);
        c = ukhVar3;
        ukh ukhVar4 = new ukh("FOLDER", 3, 4, "folder");
        d = ukhVar4;
        ukh ukhVar5 = new ukh("INLINE_BUTTON", 4, 5, "inline_button");
        o = ukhVar5;
        ukh ukhVar6 = new ukh("WEB_APP", 5, 6, "web_app");
        X = ukhVar6;
        ukh ukhVar7 = new ukh("SETTINGS", 6, 7, "settings");
        ukh ukhVar8 = new ukh("EXTERNAL_CALLBACK", 7, 8, "external_callback");
        Y = ukhVar8;
        ukh ukhVar9 = new ukh("SETTINGS_PRIVACY", 8, 9, "settings_privacy");
        ukh ukhVar10 = new ukh("CHAT_PROFILE", 9, 11, "chat_profile");
        ukh ukhVar11 = new ukh("SUPPORT_FROM_PRIVACY", 10, 1000, "support_from_privacy");
        ukh ukhVar12 = new ukh("FROM_NOTIFICATION", 11, 1001, "from_notification");
        Z = ukhVar12;
        ukh ukhVar13 = new ukh("FROM_SEARCH", 12, 10, "from_search");
        s0 = ukhVar13;
        ukh[] ukhVarArr = {ukhVar, ukhVar2, ukhVar3, ukhVar4, ukhVar5, ukhVar6, ukhVar7, ukhVar8, ukhVar9, ukhVar10, ukhVar11, ukhVar12, ukhVar13};
        t0 = ukhVarArr;
        u0 = new zg5(ukhVarArr);
    }

    public ukh(String str, int i, int i2, String str2) {
        this.a = str2;
        this.b = i2;
    }

    public static ukh valueOf(String str) {
        return (ukh) Enum.valueOf(ukh.class, str);
    }

    public static ukh[] values() {
        return (ukh[]) t0.clone();
    }
}
