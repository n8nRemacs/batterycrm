package androidx.media3.common;

import aZ0.InterfaceC19845a;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.C23110a;

/* compiled from: FlagSet.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23107s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f47700a;

    /* compiled from: FlagSet.java */
    /* renamed from: androidx.media3.common.s$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f47701a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f47702b;

        @InterfaceC19845a
        public final void a(int i12) {
            C23110a.g(!this.f47702b);
            this.f47701a.append(i12, true);
        }

        @InterfaceC19845a
        public final void b(int... iArr) {
            for (int i12 : iArr) {
                a(i12);
            }
        }

        public final C23107s c() {
            C23110a.g(!this.f47702b);
            this.f47702b = true;
            return new C23107s(this.f47701a, null);
        }
    }

    public C23107s(SparseBooleanArray sparseBooleanArray, a aVar) {
        this.f47700a = sparseBooleanArray;
    }

    public final boolean a(int... iArr) {
        for (int i12 : iArr) {
            if (this.f47700a.get(i12)) {
                return true;
            }
        }
        return false;
    }

    public final int b(int i12) {
        SparseBooleanArray sparseBooleanArray = this.f47700a;
        C23110a.c(i12, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i12);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23107s)) {
            return false;
        }
        C23107s c23107s = (C23107s) obj;
        int i12 = androidx.media3.common.util.M.f47887a;
        SparseBooleanArray sparseBooleanArray = this.f47700a;
        if (i12 >= 24) {
            return sparseBooleanArray.equals(c23107s.f47700a);
        }
        if (sparseBooleanArray.size() != c23107s.f47700a.size()) {
            return false;
        }
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            if (b(i13) != c23107s.b(i13)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i12 = androidx.media3.common.util.M.f47887a;
        SparseBooleanArray sparseBooleanArray = this.f47700a;
        if (i12 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            size = (size * 31) + b(i13);
        }
        return size;
    }
}
