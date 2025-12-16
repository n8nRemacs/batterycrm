package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.jk0;
import defpackage.mpd;
import defpackage.rai;
import defpackage.rw0;
import defpackage.s5j;
import defpackage.w4j;
import defpackage.yai;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends mpd> extends w4j {
    public static final rw0 j = new rw0(11);
    public mpd e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(yai yaiVar) {
        new jk0(yaiVar != null ? yaiVar.a.f : Looper.getMainLooper(), 2);
        new WeakReference(yaiVar);
    }

    public final void b(rai raiVar) {
        synchronized (this.a) {
            try {
                if (e()) {
                    raiVar.a(this.f);
                } else {
                    this.c.add(raiVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract mpd c(Status status);

    public final void d(Status status) {
        synchronized (this.a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.b.getCount() == 0;
    }

    public final void f(mpd mpdVar) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    return;
                }
                e();
                s5j.i("Results have already been set", !e());
                s5j.i("Result has already been consumed", !this.g);
                this.e = mpdVar;
                this.f = mpdVar.a();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((rai) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
