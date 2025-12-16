package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ he(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zx4 zx4Var;
        switch (this.a) {
            case 0:
                ((ScheduledExecutorService) sxi.a.f.a.getValue()).schedule(new he(this.b, 1), 36L, TimeUnit.MILLISECONDS);
                break;
            case 1:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
                        ((WeakReference) arrayList.get(i)).clear();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                bitmap.recycle();
                            } catch (Throwable th) {
                                RLottie.getLogger().d(th);
                            }
                        }
                        i++;
                    }
                }
                break;
            case 2:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                break;
            case 3:
                cy4 cy4Var = cy4.k;
                SparseIntArray sparseIntArray = cy4Var.b;
                ArrayList arrayList2 = cy4Var.a;
                ArrayList arrayList3 = cy4Var.c;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList4 = this.b;
                    if (i2 >= arrayList4.size()) {
                        arrayList4.clear();
                        ie.d(new he(arrayList4, 4));
                        break;
                    } else {
                        Runnable runnable = (Runnable) arrayList4.get(i2);
                        if (runnable != null) {
                            if (!arrayList3.isEmpty() && (cy4Var.g / 2 <= arrayList3.size() || (arrayList2.isEmpty() && cy4Var.e >= cy4Var.d))) {
                                zx4Var = (zx4) arrayList3.remove(0);
                            } else if (arrayList2.isEmpty()) {
                                zx4Var = new zx4("rlottie-bg-pool" + cy4Var.f + "-" + by4.j.nextInt());
                                zx4Var.setPriority(10);
                                cy4Var.e = cy4Var.e + 1;
                            } else {
                                zx4Var = (zx4) arrayList2.remove(0);
                            }
                            if (!cy4Var.h) {
                                ((ScheduledExecutorService) sxi.a.f.a.getValue()).schedule(cy4Var.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                                cy4Var.h = true;
                            }
                            cy4Var.g++;
                            arrayList3.add(zx4Var);
                            sparseIntArray.put(zx4Var.d, sparseIntArray.get(zx4Var.d, 0) + 1);
                            if (zx4Var.getPriority() != 10) {
                                zx4Var.setPriority(10);
                            }
                            zx4Var.b(new cj(cy4Var, runnable, zx4Var, 23));
                        }
                        i2++;
                    }
                }
                break;
            default:
                cy4.l.add(this.b);
                break;
        }
    }
}
