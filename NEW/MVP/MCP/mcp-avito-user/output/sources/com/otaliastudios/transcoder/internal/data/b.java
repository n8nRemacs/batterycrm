package com.otaliastudios.transcoder.internal.data;

import Y61.k;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.b;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.utils.j;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import x11.d;

/* compiled from: Reader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/otaliastudios/transcoder/internal/data/b;", "Lcom/otaliastudios/transcoder/internal/pipeline/a;", "Lkotlin/G0;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lcom/otaliastudios/transcoder/internal/data/d;", "Lcom/otaliastudios/transcoder/internal/data/c;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends com.otaliastudios.transcoder.internal.pipeline.a<G0, com.otaliastudios.transcoder.internal.pipeline.b, d, c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x11.d f366100c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TrackType f366101d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f366102e = new j();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b.a f366103f = com.otaliastudios.transcoder.internal.pipeline.b.f366153a;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final d.a f366104g = new d.a();

    public b(@k x11.d dVar, @k TrackType trackType) {
        this.f366100c = dVar;
        this.f366101d = trackType;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366103f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    @k
    public final com.otaliastudios.transcoder.internal.pipeline.k<d> s(@k k.b<G0> bVar, boolean z12) {
        x11.d dVar = this.f366100c;
        boolean zE2 = dVar.e();
        d.a aVar = this.f366104g;
        j jVar = this.f366102e;
        if (zE2) {
            jVar.getClass();
            Object obj = this.f366152b;
            Q<ByteBuffer, Integer> qA2 = ((c) (obj != null ? obj : null)).a();
            if (qA2 == null) {
                return k.d.f366181a;
            }
            int iIntValue = qA2.f406620c.intValue();
            ByteBuffer byteBuffer = qA2.f406619b;
            byteBuffer.limit(0);
            aVar.f442094a = byteBuffer;
            aVar.f442095b = false;
            aVar.f442097d = true;
            return new k.a(new d(aVar, iIntValue));
        }
        TrackType trackType = this.f366101d;
        if (!dVar.h(trackType)) {
            Objects.toString(trackType);
            jVar.getClass();
            return k.d.f366181a;
        }
        Object obj2 = this.f366152b;
        Q<ByteBuffer, Integer> qA3 = ((c) (obj2 != null ? obj2 : null)).a();
        if (qA3 == null) {
            jVar.getClass();
            return k.d.f366181a;
        }
        int iIntValue2 = qA3.f406620c.intValue();
        aVar.f442094a = qA3.f406619b;
        dVar.k(aVar);
        return new k.b(new d(aVar, iIntValue2));
    }
}
