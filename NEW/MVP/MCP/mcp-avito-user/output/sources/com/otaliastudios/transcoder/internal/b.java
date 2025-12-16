package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Codecs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/b;", "Lcom/otaliastudios/transcoder/internal/utils/m;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements com.otaliastudios.transcoder.internal.utils.m<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f366035b;

    public b(d dVar) {
        this.f366035b = dVar;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean L0() {
        return (Boolean) m.a.a(this, TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return true;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean c4(TrackType trackType) {
        return (Boolean) m.a.a(this, trackType);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean g3() {
        return (Boolean) m.a.a(this, TrackType.f365974b);
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
    public final Iterator<Boolean> iterator() {
        return m.a.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean n6(TrackType trackType) {
        return Boolean.valueOf(((Number) this.f366035b.f366092c.n6(trackType)).intValue() == 0);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean q2() {
        return (Boolean) n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final Boolean u() {
        return (Boolean) n6(TrackType.f365975c);
    }
}
