package com.otaliastudios.transcoder.internal;

import Y41.r;
import android.media.MediaFormat;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import com.otaliastudios.transcoder.internal.utils.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: Segments.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/g;", "", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f366126a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f366127b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r<TrackType, Integer, TrackStatus, MediaFormat, com.otaliastudios.transcoder.internal.pipeline.d> f366128c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.k<f> f366129d = n.b(null, null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.k<Integer> f366130e = n.b(-1, -1);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.k<Integer> f366131f = n.b(0, 0);

    /* compiled from: Segments.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k e eVar, @Y61.k m mVar, @Y61.k r<? super TrackType, ? super Integer, ? super TrackStatus, ? super MediaFormat, com.otaliastudios.transcoder.internal.pipeline.d> rVar) {
        this.f366126a = eVar;
        this.f366127b = mVar;
        this.f366128c = rVar;
    }

    public final void a(f fVar) {
        Iterator<T> it = fVar.f366123c.f366157a.iterator();
        while (it.hasNext()) {
            ((com.otaliastudios.transcoder.internal.pipeline.l) it.next()).release();
        }
        e eVar = this.f366126a;
        TrackType trackType = fVar.f366121a;
        List<x11.d> listN6 = eVar.n6(trackType);
        int i12 = fVar.f366122b;
        x11.d dVar = listN6.get(i12);
        if (this.f366127b.f366149c.K1(trackType)) {
            dVar.i(trackType);
        }
        this.f366131f.a5(trackType, Integer.valueOf(i12 + 1));
    }

    public final boolean b(@Y61.k TrackType trackType) {
        e eVar = this.f366126a;
        if (!eVar.K1(trackType)) {
            return false;
        }
        trackType.toString();
        com.otaliastudios.transcoder.internal.utils.k<f> kVar = this.f366129d;
        Objects.toString(kVar.c4(trackType));
        List list = (List) m.a.a(eVar, trackType);
        if (list != null) {
            list.size();
        }
        f fVarC4 = kVar.c4(trackType);
        if (fVarC4 != null) {
            fVarC4.b();
        }
        f fVarC42 = kVar.c4(trackType);
        if (fVarC42 == null) {
            return true;
        }
        List list2 = (List) m.a.a(eVar, trackType);
        Integer numValueOf = list2 == null ? null : Integer.valueOf(list2.size() - 1);
        if (numValueOf == null) {
            return false;
        }
        return fVarC42.b() || fVarC42.f366122b < numValueOf.intValue();
    }

    @Y61.l
    public final f c(@Y61.k TrackType trackType) {
        TrackType trackType2;
        com.otaliastudios.transcoder.internal.utils.k<Integer> kVar = this.f366130e;
        int iIntValue = kVar.n6(trackType).intValue();
        int iIntValue2 = this.f366131f.n6(trackType).intValue();
        if (iIntValue2 < iIntValue) {
            throw new IllegalStateException(("Requested index " + iIntValue2 + " smaller than " + iIntValue + '.').toString());
        }
        com.otaliastudios.transcoder.internal.utils.k<f> kVar2 = this.f366129d;
        if (iIntValue2 <= iIntValue) {
            if (kVar2.n6(trackType).b()) {
                return kVar2.n6(trackType);
            }
            a(kVar2.n6(trackType));
            return c(trackType);
        }
        e eVar = this.f366126a;
        x11.d dVar = (x11.d) C42745f0.K(iIntValue2, eVar.n6(trackType));
        if (dVar == null) {
            return null;
        }
        trackType.toString();
        m mVar = this.f366127b;
        com.otaliastudios.transcoder.internal.utils.m<TrackStatus> mVar2 = mVar.f366149c;
        if (mVar2.K1(trackType)) {
            dVar.f(trackType);
            int iOrdinal = trackType.ordinal();
            if (iOrdinal == 0) {
                trackType2 = TrackType.f365975c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                trackType2 = TrackType.f365974b;
            }
            if (mVar2.K1(trackType2)) {
                List<x11.d> listN6 = eVar.n6(trackType2);
                if (!(listN6 instanceof Collection) || !listN6.isEmpty()) {
                    Iterator<T> it = listN6.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((x11.d) it.next()) == dVar) {
                            dVar.f(trackType2);
                            break;
                        }
                    }
                }
            }
        }
        kVar.a5(trackType, Integer.valueOf(iIntValue2));
        f fVar = new f(trackType, iIntValue2, this.f366128c.invoke(trackType, Integer.valueOf(iIntValue2), mVar.f366147a.n6(trackType), mVar.f366148b.n6(trackType)));
        kVar2.a5(trackType, fVar);
        return fVar;
    }
}
