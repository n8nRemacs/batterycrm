package com.avito.android.video_picker.ui.item.video_card;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoCardItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_picker/ui/item/video_card/c;", "Lcom/avito/conveyor_item/a;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f325985b;

    /* renamed from: c, reason: collision with root package name */
    public final long f325986c;

    /* renamed from: d, reason: collision with root package name */
    public final long f325987d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f325988e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f325989f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Long f325990g;

    public c(@k String str, long j12, long j13, @l Long l12, @l Long l13, @l Long l14) {
        this.f325985b = str;
        this.f325986c = j12;
        this.f325987d = j13;
        this.f325988e = l12;
        this.f325989f = l13;
        this.f325990g = l14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f325985b, cVar.f325985b) && this.f325986c == cVar.f325986c && this.f325987d == cVar.f325987d && L.f(this.f325988e, cVar.f325988e) && L.f(this.f325989f, cVar.f325989f) && L.f(this.f325990g, cVar.f325990g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF318502b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318502b() {
        return this.f325985b;
    }

    public final int hashCode() {
        int iG2 = r.g(r.g(this.f325985b.hashCode() * 31, 31, this.f325986c), 31, this.f325987d);
        Long l12 = this.f325988e;
        int iHashCode = (iG2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f325989f;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f325990g;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoCardItem(stringId=");
        sb2.append(this.f325985b);
        sb2.append(", duration=");
        sb2.append(this.f325986c);
        sb2.append(", size=");
        sb2.append(this.f325987d);
        sb2.append(", maxVideoDuration=");
        sb2.append(this.f325988e);
        sb2.append(", minVideoDuration=");
        sb2.append(this.f325989f);
        sb2.append(", maxVideoSize=");
        return m.m(sb2, this.f325990g, ')');
    }
}
