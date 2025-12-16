package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23416g {

    /* renamed from: a, reason: collision with root package name */
    public final K f54010a;

    /* renamed from: b, reason: collision with root package name */
    public final a f54011b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f54012c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f54013a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f54014b;

        public final void a(int i12) {
            if (i12 < 64) {
                this.f54013a &= ~(1 << i12);
                return;
            }
            a aVar = this.f54014b;
            if (aVar != null) {
                aVar.a(i12 - 64);
            }
        }

        public final int b(int i12) {
            a aVar = this.f54014b;
            if (aVar == null) {
                return i12 >= 64 ? Long.bitCount(this.f54013a) : Long.bitCount(this.f54013a & ((1 << i12) - 1));
            }
            if (i12 < 64) {
                return Long.bitCount(this.f54013a & ((1 << i12) - 1));
            }
            return Long.bitCount(this.f54013a) + aVar.b(i12 - 64);
        }

        public final void c() {
            if (this.f54014b == null) {
                this.f54014b = new a();
            }
        }

        public final boolean d(int i12) {
            if (i12 < 64) {
                return (this.f54013a & (1 << i12)) != 0;
            }
            c();
            return this.f54014b.d(i12 - 64);
        }

        public final void e(int i12, boolean z12) {
            if (i12 >= 64) {
                c();
                this.f54014b.e(i12 - 64, z12);
                return;
            }
            long j12 = this.f54013a;
            boolean z13 = (Long.MIN_VALUE & j12) != 0;
            long j13 = (1 << i12) - 1;
            this.f54013a = ((j12 & (~j13)) << 1) | (j12 & j13);
            if (z12) {
                h(i12);
            } else {
                a(i12);
            }
            if (z13 || this.f54014b != null) {
                c();
                this.f54014b.e(0, z13);
            }
        }

        public final boolean f(int i12) {
            if (i12 >= 64) {
                c();
                return this.f54014b.f(i12 - 64);
            }
            long j12 = 1 << i12;
            long j13 = this.f54013a;
            boolean z12 = (j13 & j12) != 0;
            long j14 = j13 & (~j12);
            this.f54013a = j14;
            long j15 = j12 - 1;
            this.f54013a = (j14 & j15) | Long.rotateRight((~j15) & j14, 1);
            a aVar = this.f54014b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f54014b.f(0);
            }
            return z12;
        }

        public final void g() {
            this.f54013a = 0L;
            a aVar = this.f54014b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i12) {
            if (i12 < 64) {
                this.f54013a |= 1 << i12;
            } else {
                c();
                this.f54014b.h(i12 - 64);
            }
        }

        public final String toString() {
            if (this.f54014b == null) {
                return Long.toBinaryString(this.f54013a);
            }
            return this.f54014b.toString() + "xx" + Long.toBinaryString(this.f54013a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.g$b */
    public interface b {
    }

    public C23416g(K k12) {
        this.f54010a = k12;
    }

    public final void a(View view, int i12, ViewGroup.LayoutParams layoutParams, boolean z12) {
        K k12 = this.f54010a;
        RecyclerView recyclerView = k12.f53682a;
        int childCount = i12 < 0 ? recyclerView.getChildCount() : d(i12);
        this.f54011b.e(childCount, z12);
        if (z12) {
            this.f54012c.add(view);
            RecyclerView.C cX2 = RecyclerView.X(view);
            if (cX2 != null) {
                cX2.onEnteredHiddenState(k12.f53682a);
            }
        }
        RecyclerView.C cX3 = RecyclerView.X(view);
        if (cX3 != null) {
            if (!cX3.isTmpDetached() && !cX3.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(cX3);
                throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.j(recyclerView, sb2));
            }
            cX3.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final View b(int i12) {
        return this.f54010a.f53682a.getChildAt(d(i12));
    }

    public final int c() {
        return this.f54010a.f53682a.getChildCount() - this.f54012c.size();
    }

    public final int d(int i12) {
        if (i12 < 0) {
            return -1;
        }
        int childCount = this.f54010a.f53682a.getChildCount();
        int i13 = i12;
        while (i13 < childCount) {
            a aVar = this.f54011b;
            int iB2 = i12 - (i13 - aVar.b(i13));
            if (iB2 == 0) {
                while (aVar.d(i13)) {
                    i13++;
                }
                return i13;
            }
            i13 += iB2;
        }
        return -1;
    }

    public final int e(View view) {
        int iIndexOfChild = this.f54010a.f53682a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        a aVar = this.f54011b;
        if (aVar.d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - aVar.b(iIndexOfChild);
    }

    public final void f(View view) {
        if (this.f54012c.remove(view)) {
            this.f54010a.a(view);
        }
    }

    public final String toString() {
        return this.f54011b.toString() + ", hidden list:" + this.f54012c.size();
    }
}
