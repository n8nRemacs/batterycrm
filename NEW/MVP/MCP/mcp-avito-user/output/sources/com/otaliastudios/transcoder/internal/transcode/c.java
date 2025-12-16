package com.otaliastudios.transcoder.internal.transcode;

import com.otaliastudios.transcoder.common.TrackType;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DefaultTranscodeEngine.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
final class c extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f366199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TrackType f366200m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, TrackType trackType) {
        super(0);
        this.f366199l = aVar;
        this.f366200m = trackType;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        a aVar = this.f366199l;
        return Boolean.valueOf(((Number) aVar.f366195k.f366143e.n6(this.f366200m)).longValue() > aVar.f366195k.a() + 100);
    }
}
