package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes10.dex */
final class r implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<r> f54130f = new ThreadLocal<>();

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<c> f54131g = new a();

    /* renamed from: c, reason: collision with root package name */
    public long f54133c;

    /* renamed from: d, reason: collision with root package name */
    public long f54134d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<RecyclerView> f54132b = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<c> f54135e = new ArrayList<>();

    /* compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int compare(androidx.recyclerview.widget.r.c r7, androidx.recyclerview.widget.r.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.r$c r7 = (androidx.recyclerview.widget.r.c) r7
                androidx.recyclerview.widget.r$c r8 = (androidx.recyclerview.widget.r.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f54143d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f54143d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f54140a
                boolean r3 = r8.f54140a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f54141b
                int r2 = r7.f54141b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f54142c
                int r8 = r8.f54142c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.m.c {

        /* renamed from: a, reason: collision with root package name */
        public int f54136a;

        /* renamed from: b, reason: collision with root package name */
        public int f54137b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f54138c;

        /* renamed from: d, reason: collision with root package name */
        public int f54139d;

        public final void a(int i12, int i13) {
            if (i12 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i13 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i14 = this.f54139d;
            int i15 = i14 * 2;
            int[] iArr = this.f54138c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f54138c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i15 >= iArr.length) {
                int[] iArr3 = new int[i14 * 4];
                this.f54138c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f54138c;
            iArr4[i15] = i12;
            iArr4[i15 + 1] = i13;
            this.f54139d++;
        }

        public final void b(RecyclerView recyclerView, boolean z12) {
            this.f54139d = 0;
            int[] iArr = this.f54138c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.f53787n;
            if (recyclerView.f53785m == null || mVar == null || !mVar.f53845k) {
                return;
            }
            if (z12) {
                if (!recyclerView.f53769e.g()) {
                    mVar.N(recyclerView.f53785m.getItemCount(), this);
                }
            } else if (!recyclerView.b0()) {
                mVar.M(this.f54136a, this.f54137b, recyclerView.f53778i0, this);
            }
            int i12 = this.f54139d;
            if (i12 > mVar.f53846l) {
                mVar.f53846l = i12;
                mVar.f53847m = z12;
                recyclerView.f53765c.l();
            }
        }
    }

    /* compiled from: GapWorker.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f54140a;

        /* renamed from: b, reason: collision with root package name */
        public int f54141b;

        /* renamed from: c, reason: collision with root package name */
        public int f54142c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f54143d;

        /* renamed from: e, reason: collision with root package name */
        public int f54144e;
    }

    public static RecyclerView.C c(RecyclerView recyclerView, int i12, long j12) {
        int childCount = recyclerView.f53771f.f54010a.f53682a.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            RecyclerView.C cX2 = RecyclerView.X(recyclerView.f53771f.f54010a.f53682a.getChildAt(i13));
            if (cX2.mPosition == i12 && !cX2.isInvalid()) {
                return null;
            }
        }
        RecyclerView.u uVar = recyclerView.f53765c;
        try {
            recyclerView.i0();
            RecyclerView.C cJ2 = uVar.j(i12, j12);
            if (cJ2 != null) {
                if (!cJ2.isBound() || cJ2.isInvalid()) {
                    uVar.a(cJ2, false);
                } else {
                    uVar.g(cJ2.itemView);
                }
            }
            recyclerView.j0(false);
            return cJ2;
        } catch (Throwable th2) {
            recyclerView.j0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i12, int i13) {
        if (recyclerView.f53799t && this.f54133c == 0) {
            this.f54133c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f53776h0;
        bVar.f54136a = i12;
        bVar.f54137b = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.r.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i12 = androidx.core.os.K.f44794a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f54132b;
            if (arrayList.isEmpty()) {
                this.f54133c = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView recyclerView = arrayList.get(i13);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f54133c = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f54134d);
                this.f54133c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th2) {
            this.f54133c = 0L;
            int i14 = androidx.core.os.K.f44794a;
            Trace.endSection();
            throw th2;
        }
    }
}
