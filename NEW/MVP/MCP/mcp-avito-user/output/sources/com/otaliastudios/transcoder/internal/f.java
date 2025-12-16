package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: Segment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/f;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TrackType f366121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.d f366123c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366124d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.otaliastudios.transcoder.internal.pipeline.k<G0> f366125e;

    public f(@Y61.k TrackType trackType, int i12, @Y61.k com.otaliastudios.transcoder.internal.pipeline.d dVar) {
        this.f366121a = trackType;
        this.f366122b = i12;
        this.f366123c = dVar;
        trackType.toString();
        this.f366124d = new com.otaliastudios.transcoder.internal.utils.j();
    }

    public final boolean a() {
        com.otaliastudios.transcoder.internal.pipeline.k<G0> aVar;
        com.otaliastudios.transcoder.internal.pipeline.d dVar = this.f366123c;
        List<com.otaliastudios.transcoder.internal.pipeline.l<Object, com.otaliastudios.transcoder.internal.pipeline.b, Object, com.otaliastudios.transcoder.internal.pipeline.b>> list = dVar.f366157a;
        list.size();
        list.size();
        dVar.f366158b.getClass();
        int i12 = dVar.f366160d;
        k.b<Object> bVarA = dVar.f366159c;
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                com.otaliastudios.transcoder.internal.pipeline.l lVar = (com.otaliastudios.transcoder.internal.pipeline.l) next;
                if (i13 >= i12) {
                    bVarA = com.otaliastudios.transcoder.internal.pipeline.d.a(bVarA, lVar, i12 == 0 || i13 != i12);
                    if (bVarA == null) {
                        m0.f406844a.b(lVar.getClass()).l0();
                        list.size();
                        Objects.toString(dVar.f366159c);
                        aVar = k.d.f366181a;
                        break;
                    }
                    if (bVarA instanceof k.a) {
                        m0.f406844a.b(lVar.getClass()).l0();
                        list.size();
                        dVar.f366159c = bVarA;
                        dVar.f366160d = i14;
                    }
                }
                i13 = i14;
            } else {
                aVar = (list.isEmpty() || (bVarA instanceof k.a)) ? new k.a<>(G0.f406611a) : new k.b<>(G0.f406611a);
            }
        }
        this.f366125e = aVar;
        return aVar instanceof k.b;
    }

    public final boolean b() {
        L.j(this.f366125e, "canAdvance(): state=");
        this.f366124d.getClass();
        com.otaliastudios.transcoder.internal.pipeline.k<G0> kVar = this.f366125e;
        return kVar == null || !(kVar instanceof k.a);
    }
}
