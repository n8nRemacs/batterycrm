package com.otaliastudios.transcoder.internal;

import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import x11.C49744b;

/* compiled from: DataSources.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/transcoder/internal/e;", "Lcom/otaliastudios/transcoder/internal/utils/m;", "", "Lx11/d;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class e implements com.otaliastudios.transcoder.internal.utils.m<List<? extends x11.d>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366117b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f366118c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<x11.d> f366119d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<x11.d> f366120e;

    /* compiled from: DataSources.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TrackType.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    public e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.z0] */
    public e(@Y61.k com.otaliastudios.transcoder.i iVar) {
        int i12;
        ArrayList arrayList = iVar.f365983b;
        ArrayList<x11.d> arrayList2 = iVar.f365984c;
        this.f366117b = new com.otaliastudios.transcoder.internal.utils.j();
        d(arrayList);
        d(arrayList2);
        this.f366118c = new ArrayList();
        int i13 = 0;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            i12 = 0;
            while (it.hasNext()) {
                if (((x11.d) it.next()).l(TrackType.f365975c) != null && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        } else {
            i12 = 0;
        }
        if (i12 == 0) {
            ?? r32 = C42784z0.f406748b;
            C42745f0.h(arrayList, this.f366118c);
            arrayList = r32;
        } else {
            arrayList.size();
        }
        this.f366119d = arrayList;
        TrackType trackType = TrackType.f365974b;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                if ((((x11.d) it2.next()).l(trackType) != null) && (i14 = i14 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
            i13 = i14;
        }
        com.otaliastudios.transcoder.internal.utils.j jVar = this.f366117b;
        L.j(Integer.valueOf(i13), "computing audioSources, valid=");
        jVar.getClass();
        if (i13 == 0) {
            ?? r02 = C42784z0.f406748b;
            C42745f0.h(arrayList2, this.f366118c);
            arrayList2 = r02;
        } else if (i13 != arrayList2.size()) {
            ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
            for (x11.d dVar : arrayList2) {
                if (dVar.l(trackType) == null) {
                    C49744b c49744b = new C49744b(dVar.d());
                    this.f366118c.add(dVar);
                    dVar = c49744b;
                }
                arrayList3.add(dVar);
            }
            arrayList2 = arrayList3;
        }
        this.f366120e = arrayList2;
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean K1(@Y61.k TrackType trackType) {
        return !n6(trackType).isEmpty();
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final List<? extends x11.d> L0() {
        return (List) m.a.a(this, TrackType.f365975c);
    }

    public final void a(List<? extends x11.d> list) {
        for (x11.d dVar : list) {
            Objects.toString(dVar);
            dVar.isInitialized();
            this.f366117b.getClass();
            if (dVar.isInitialized()) {
                dVar.g();
            }
        }
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List<x11.d> n6(@Y61.k TrackType trackType) {
        int iOrdinal = trackType.ordinal();
        if (iOrdinal == 0) {
            return this.f366120e;
        }
        if (iOrdinal == 1) {
            return this.f366119d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean b3() {
        return K1(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final List<? extends x11.d> c4(TrackType trackType) {
        return (List) m.a.a(this, trackType);
    }

    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x11.d dVar = (x11.d) it.next();
            Objects.toString(dVar);
            dVar.isInitialized();
            this.f366117b.getClass();
            if (!dVar.isInitialized()) {
                dVar.a();
            }
        }
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final List<? extends x11.d> g3() {
        return (List) m.a.a(this, TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final boolean getHasVideo() {
        return K1(TrackType.f365975c);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final int getSize() {
        throw null;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<List<x11.d>> iterator() {
        return m.a.b(this);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final List<? extends x11.d> q2() {
        return n6(TrackType.f365974b);
    }

    @Override // com.otaliastudios.transcoder.internal.utils.m
    public final List<? extends x11.d> u() {
        return n6(TrackType.f365975c);
    }
}
