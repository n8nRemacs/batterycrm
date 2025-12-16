package com.avito.android.fps;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FrameData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fps/a;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Duration f158617a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Duration f158618b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Duration f158619c;

    /* renamed from: d, reason: collision with root package name */
    public final long f158620d;

    public a(@k Duration duration, @k Duration duration2, @k Duration duration3, long j12) {
        this.f158617a = duration;
        this.f158618b = duration2;
        this.f158619c = duration3;
        this.f158620d = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f158617a, aVar.f158617a) && L.f(this.f158618b, aVar.f158618b) && L.f(this.f158619c, aVar.f158619c) && this.f158620d == aVar.f158620d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f158620d) + ((this.f158619c.hashCode() + ((this.f158618b.hashCode() + (this.f158617a.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FrameData(durationUI=");
        sb2.append(this.f158617a);
        sb2.append(", durationVisible=");
        sb2.append(this.f158618b);
        sb2.append(", hitchDuration=");
        sb2.append(this.f158619c);
        sb2.append(", endTimeUI=");
        return r.u(sb2, this.f158620d, ')');
    }
}
