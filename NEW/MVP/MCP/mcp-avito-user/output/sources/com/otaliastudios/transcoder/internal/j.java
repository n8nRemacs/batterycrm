package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/j;", "Lcom/otaliastudios/transcoder/internal/utils/m;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j implements com.otaliastudios.transcoder.internal.utils.m<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f366137b;

    public j(l lVar) {
        this.f366137b = lVar;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long L0() {
        return (Long) m.a.a(this, TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long c4(TrackType trackType) {
        return (Long) m.a.a(this, trackType);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long g3() {
        return (Long) m.a.a(this, TrackType.f365974b);
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
    public final Iterator<Long> iterator() {
        return m.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long n6(TrackType trackType) {
        l lVar = this.f366137b;
        long jC2 = 0;
        if (lVar.f366141c.f366149c.K1(trackType)) {
            List<x11.d> listN6 = lVar.f366140b.n6(trackType);
            int iIntValue = ((Number) lVar.f366142d.n6(trackType)).intValue();
            int i12 = 0;
            for (Object obj : listN6) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                x11.d dVar = (x11.d) obj;
                if (i12 <= iIntValue) {
                    jC2 = dVar.c() + jC2;
                }
                i12 = i13;
            }
        }
        return Long.valueOf(jC2);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long q2() {
        return (Long) n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Long u() {
        return (Long) n6(TrackType.f365975c);
    }
}
