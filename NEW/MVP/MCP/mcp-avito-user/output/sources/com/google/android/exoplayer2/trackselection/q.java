package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36588d;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes6.dex */
public final class q implements InterfaceC36525h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f347278d = new InterfaceC36525h.a() { // from class: com.google.android.exoplayer2.trackselection.h

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f347266b = 1;

        @Override // com.google.android.exoplayer2.InterfaceC36525h.a
        public final InterfaceC36525h fromBundle(Bundle bundle) {
            switch (this.f347266b) {
                case 0:
                    boolean z12 = false;
                    int i12 = bundle.getInt(Integer.toString(0, 36), -1);
                    int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                    int i13 = bundle.getInt(Integer.toString(2, 36), -1);
                    if (i12 >= 0 && i13 >= 0) {
                        z12 = true;
                    }
                    C36585a.b(z12);
                    intArray.getClass();
                    return new g.f(i12, i13, intArray);
                default:
                    Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
                    bundle2.getClass();
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                    V v12 = new V(bundle2.getString(Integer.toString(1, 36), ""), (I[]) (parcelableArrayList == null ? AbstractC37401r1.C() : C36588d.a(I.f343457I, parcelableArrayList)).toArray(new I[0]));
                    int[] intArray2 = bundle.getIntArray(Integer.toString(1, 36));
                    intArray2.getClass();
                    return new q(v12, com.google.common.primitives.l.a(intArray2));
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final V f347279b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37401r1<Integer> f347280c;

    public q(V v12, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= v12.f346148b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f347279b = v12;
        this.f347280c = AbstractC37401r1.v(list);
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f347279b.equals(qVar.f347279b) && this.f347280c.equals(qVar.f347280c);
    }

    public final int hashCode() {
        return (this.f347280c.hashCode() * 31) + this.f347279b.hashCode();
    }
}
