package com.avito.android.beduin.common.shared.tabs;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinTabCounterStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounterStyle;", "", "(Ljava/lang/String;I)V", "NORMAL", "NOTIFICATION", "BADGE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinTabCounterStyle {

    @com.google.gson.annotations.c("badge")
    public static final BeduinTabCounterStyle BADGE;

    @com.google.gson.annotations.c(Constants.NORMAL)
    public static final BeduinTabCounterStyle NORMAL;

    @com.google.gson.annotations.c(NotificationsSettings.Section.SECTION_PAID_SERVICES)
    public static final BeduinTabCounterStyle NOTIFICATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinTabCounterStyle[] f103460b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103461c;

    static {
        BeduinTabCounterStyle beduinTabCounterStyle = new BeduinTabCounterStyle("NORMAL", 0);
        NORMAL = beduinTabCounterStyle;
        BeduinTabCounterStyle beduinTabCounterStyle2 = new BeduinTabCounterStyle("NOTIFICATION", 1);
        NOTIFICATION = beduinTabCounterStyle2;
        BeduinTabCounterStyle beduinTabCounterStyle3 = new BeduinTabCounterStyle("BADGE", 2);
        BADGE = beduinTabCounterStyle3;
        BeduinTabCounterStyle[] beduinTabCounterStyleArr = {beduinTabCounterStyle, beduinTabCounterStyle2, beduinTabCounterStyle3};
        f103460b = beduinTabCounterStyleArr;
        f103461c = kotlin.enums.c.a(beduinTabCounterStyleArr);
    }

    private BeduinTabCounterStyle(String str, int i12) {
    }

    public static BeduinTabCounterStyle valueOf(String str) {
        return (BeduinTabCounterStyle) Enum.valueOf(BeduinTabCounterStyle.class, str);
    }

    public static BeduinTabCounterStyle[] values() {
        return (BeduinTabCounterStyle[]) f103460b.clone();
    }
}
