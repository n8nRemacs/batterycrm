package com.yandex.div.core.player;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DivVideoSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/player/j;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Uri f367625a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f367626b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f367627c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f367628d;

    public j(@k Uri uri, @k String str, @l i iVar, @l Long l12) {
        this.f367625a = uri;
        this.f367626b = str;
        this.f367627c = iVar;
        this.f367628d = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f367625a, jVar.f367625a) && L.f(this.f367626b, jVar.f367626b) && L.f(this.f367627c, jVar.f367627c) && L.f(this.f367628d, jVar.f367628d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f367625a.hashCode() * 31, 31, this.f367626b);
        i iVar = this.f367627c;
        int iHashCode = (iD2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Long l12 = this.f367628d;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DivVideoSource(url=");
        sb2.append(this.f367625a);
        sb2.append(", mimeType=");
        sb2.append(this.f367626b);
        sb2.append(", resolution=");
        sb2.append(this.f367627c);
        sb2.append(", bitrate=");
        return m.m(sb2, this.f367628d, ')');
    }

    public /* synthetic */ j(Uri uri, String str, i iVar, Long l12, int i12, C42822w c42822w) {
        this(uri, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? null : iVar, (i12 & 8) != 0 ? null : l12);
    }
}
