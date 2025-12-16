package com.avito.android.beduin.common.component.countdown_timer;

import com.avito.android.avito_map.AvitoMapMarkerKt;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinCountDownTimerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/BeduinCountDownTimerStyle;", "", "(Ljava/lang/String;I)V", "BLACK", "WHITE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinCountDownTimerStyle {

    @com.google.gson.annotations.c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
    public static final BeduinCountDownTimerStyle BLACK;

    @com.google.gson.annotations.c("white")
    public static final BeduinCountDownTimerStyle WHITE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ BeduinCountDownTimerStyle[] f101097b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101098c;

    static {
        BeduinCountDownTimerStyle beduinCountDownTimerStyle = new BeduinCountDownTimerStyle("BLACK", 0);
        BLACK = beduinCountDownTimerStyle;
        BeduinCountDownTimerStyle beduinCountDownTimerStyle2 = new BeduinCountDownTimerStyle("WHITE", 1);
        WHITE = beduinCountDownTimerStyle2;
        BeduinCountDownTimerStyle[] beduinCountDownTimerStyleArr = {beduinCountDownTimerStyle, beduinCountDownTimerStyle2};
        f101097b = beduinCountDownTimerStyleArr;
        f101098c = kotlin.enums.c.a(beduinCountDownTimerStyleArr);
    }

    private BeduinCountDownTimerStyle(String str, int i12) {
    }

    public static BeduinCountDownTimerStyle valueOf(String str) {
        return (BeduinCountDownTimerStyle) Enum.valueOf(BeduinCountDownTimerStyle.class, str);
    }

    public static BeduinCountDownTimerStyle[] values() {
        return (BeduinCountDownTimerStyle[]) f101097b.clone();
    }
}
