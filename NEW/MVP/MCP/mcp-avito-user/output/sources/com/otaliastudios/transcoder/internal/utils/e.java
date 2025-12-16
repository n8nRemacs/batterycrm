package com.otaliastudios.transcoder.internal.utils;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: TrackMap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/utils/e;", "T", "Lcom/otaliastudios/transcoder/internal/utils/k;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class e<T> implements k<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f366215b;

    public e(@Y61.l T t12, @Y61.l T t13) {
        this.f366215b = P0.j(new Q(TrackType.f365975c, t12), new Q(TrackType.f365974b, t13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.utils.k
    public final void D3(Integer num) {
        a5(TrackType.f365974b, num);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return this.f366215b.get(trackType) != null;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    @Y61.l
    public final T L0() {
        return (T) m.a.a(this, TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.k
    public final void a5(@Y61.k TrackType trackType, @Y61.l T t12) {
        this.f366215b.put(trackType, t12);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return K1(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    @Y61.l
    public final T c4(@Y61.k TrackType trackType) {
        return (T) m.a.a(this, trackType);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    @Y61.l
    public final T g3() {
        return (T) m.a.a(this, TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean getHasVideo() {
        return K1(TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final int getSize() {
        return C42756l.B(new Object[]{m.a.a(this, TrackType.f365975c), m.a.a(this, TrackType.f365974b)}).size();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return m.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.utils.k
    public final void j1(Integer num) {
        a5(TrackType.f365975c, num);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final T n6(@Y61.k TrackType trackType) {
        T t12 = (T) this.f366215b.get(trackType);
        if (t12 != null) {
            return t12;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final T q2() {
        return n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final T u() {
        return n6(TrackType.f365975c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.utils.k
    public final void v1(@Y61.l Long l12, @Y61.l Long l13) {
        a5(TrackType.f365975c, l12);
        a5(TrackType.f365974b, l13);
    }
}
