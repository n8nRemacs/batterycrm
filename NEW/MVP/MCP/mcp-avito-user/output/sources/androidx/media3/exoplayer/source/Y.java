package androidx.media3.exoplayer.source;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23114e;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: TrackGroupArray.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class Y implements InterfaceC23096j {

    /* renamed from: e, reason: collision with root package name */
    public static final Y f49705e = new Y(new androidx.media3.common.Q[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final String f49706f;

    /* renamed from: g, reason: collision with root package name */
    public static final N f49707g;

    /* renamed from: b, reason: collision with root package name */
    public final int f49708b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37401r1<androidx.media3.common.Q> f49709c;

    /* renamed from: d, reason: collision with root package name */
    public int f49710d;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f49706f = Integer.toString(0, 36);
        f49707g = new N(2);
    }

    public Y(androidx.media3.common.Q... qArr) {
        this.f49709c = AbstractC37401r1.w(qArr);
        this.f49708b = qArr.length;
        int i12 = 0;
        while (true) {
            AbstractC37401r1<androidx.media3.common.Q> abstractC37401r1 = this.f49709c;
            if (i12 >= abstractC37401r1.size()) {
                return;
            }
            int i13 = i12 + 1;
            for (int i14 = i13; i14 < abstractC37401r1.size(); i14++) {
                if (abstractC37401r1.get(i12).equals(abstractC37401r1.get(i14))) {
                    androidx.media3.common.util.s.d("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i12 = i13;
        }
    }

    public final androidx.media3.common.Q a(int i12) {
        return this.f49709c.get(i12);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y12 = (Y) obj;
        return this.f49708b == y12.f49708b && this.f49709c.equals(y12.f49709c);
    }

    public final int hashCode() {
        if (this.f49710d == 0) {
            this.f49710d = this.f49709c.hashCode();
        }
        return this.f49710d;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f49706f, C23114e.b(this.f49709c));
        return bundle;
    }
}
