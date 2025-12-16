package com.avito.android.comfortable_deal.deal.item.callrecord;

import Y61.k;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaySpeed.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/callrecord/PlaySpeed;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaySpeed {

    /* renamed from: d, reason: collision with root package name */
    public static final PlaySpeed f121202d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PlaySpeed[] f121203e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f121204f;

    /* renamed from: b, reason: collision with root package name */
    public final float f121205b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DecimalFormat f121206c = new DecimalFormat("#.#");

    static {
        PlaySpeed playSpeed = new PlaySpeed(1.0f, "Normal", 0);
        f121202d = playSpeed;
        PlaySpeed[] playSpeedArr = {playSpeed, new PlaySpeed(1.5f, "Faster", 1), new PlaySpeed(2.0f, "Fastest", 2)};
        f121203e = playSpeedArr;
        f121204f = c.a(playSpeedArr);
    }

    public PlaySpeed(float f12, String str, int i12) {
        this.f121205b = f12;
    }

    public static PlaySpeed valueOf(String str) {
        return (PlaySpeed) Enum.valueOf(PlaySpeed.class, str);
    }

    public static PlaySpeed[] values() {
        return (PlaySpeed[]) f121203e.clone();
    }
}
