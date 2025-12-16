package com.my.tracker.ads;

import com.my.tracker.obfuscated.r0;

/* loaded from: classes7.dex */
public final class AdEvent extends r0 {
    public final String adFormat;
    public final String adId;
    public final String currency;
    public final int network;
    public final String placementId;
    public final double revenue;
    public final String source;

    public AdEvent(int i12, int i13, double d12, String str, String str2, String str3, String str4, String str5) {
        super(i12);
        this.network = i13;
        this.revenue = d12;
        this.currency = str;
        this.source = str2;
        this.placementId = str3;
        this.adId = str4;
        this.adFormat = str5;
    }
}
