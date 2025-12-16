package defpackage;

import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class by4 {
    public static final SecureRandom j = new SecureRandom();
    public int e;
    public int g;
    public boolean h;
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final ue i = new ue(13, this);
    public final int d = 4;
    public final int f = j.nextInt();

    public final zx4 a() {
        zx4 zx4Var = new zx4("rlottie-pool-" + this.f + "-" + j.nextInt());
        zx4Var.setPriority(10);
        return zx4Var;
    }

    public final void b(Runnable runnable) {
        zx4 zx4VarA;
        LinkedList linkedList = this.c;
        boolean zIsEmpty = linkedList.isEmpty();
        int i = this.d;
        LinkedList linkedList2 = this.a;
        if (!zIsEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i))) {
            try {
                zx4VarA = (zx4) linkedList.removeFirst();
            } catch (NoSuchElementException e) {
                RLottie.getLogger().d(e);
                zx4VarA = null;
            }
        } else if (linkedList2.isEmpty()) {
            zx4VarA = a();
            this.e++;
        } else {
            zx4VarA = (zx4) linkedList2.removeFirst();
        }
        if (!this.h) {
            ie.e(this.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            this.h = true;
        }
        if (zx4VarA == null) {
            rca logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i2 = this.g;
            int size2 = linkedList2.size();
            int i3 = this.e;
            StringBuilder sbK = wy1.k("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i2, ", queues.size=");
            hf3.g(sbK, size2, ", createdCount=", i3, ", maxCount=");
            sbK.append(i);
            logger.c(sbK.toString(), new IllegalStateException("queue is null"));
            zx4VarA = a();
            this.e++;
        }
        int i4 = zx4VarA.d;
        this.g++;
        linkedList.add(zx4VarA);
        SparseIntArray sparseIntArray = this.b;
        sparseIntArray.put(i4, sparseIntArray.get(i4, 0) + 1);
        if (zx4VarA.getPriority() != 10) {
            zx4VarA.setPriority(10);
        }
        zx4VarA.b(new cj(this, runnable, zx4VarA, 22));
    }
}
