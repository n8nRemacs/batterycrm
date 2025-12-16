package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/k;", "Lcom/otaliastudios/transcoder/internal/utils/m;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k implements com.otaliastudios.transcoder.internal.utils.m<Double> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f366138b;

    public k(l lVar) {
        this.f366138b = lVar;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double L0() {
        return (Double) m.a.a(this, TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double c4(TrackType trackType) {
        return (Double) m.a.a(this, trackType);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double g3() {
        return (Double) m.a.a(this, TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean getHasVideo() {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final int getSize() {
        throw null;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<Double> iterator() {
        return m.a.b(this);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double n6(TrackType trackType) {
        l lVar = this.f366138b;
        long jLongValue = ((Number) lVar.f366143e.n6(trackType)).longValue();
        long jLongValue2 = ((Number) lVar.f366144f.n6(trackType)).longValue();
        return Double.valueOf(jLongValue2 == 0 ? 0.0d : jLongValue / jLongValue2);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double q2() {
        return (Double) n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Double u() {
        return (Double) n6(TrackType.f365975c);
    }
}
