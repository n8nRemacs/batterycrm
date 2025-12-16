package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.yandex.mobile.ads.impl.o81;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes8.dex */
public final class n81 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o81 f388185a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f388186b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f388187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private k81 f388188d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final ArrayList f388189e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f388190f;

    public n81(@Y61.k o81 o81Var, @Y61.k String str) {
        this.f388185a = o81Var;
        this.f388186b = str;
    }

    public final void a(@Y61.l k81 k81Var) {
        this.f388188d = k81Var;
    }

    public final boolean b() {
        k81 k81Var = this.f388188d;
        if (k81Var != null && k81Var.a()) {
            this.f388190f = true;
        }
        boolean z12 = false;
        for (int size = this.f388189e.size() - 1; -1 < size; size--) {
            if (((k81) this.f388189e.get(size)).a()) {
                k81 k81Var2 = (k81) this.f388189e.get(size);
                o81 o81Var = o81.f388458h;
                if (o81.b.a().isLoggable(Level.FINE)) {
                    l81.a(k81Var2, this, PaymentStateKt.PAYMENT_STATE_CANCELED);
                }
                this.f388189e.remove(size);
                z12 = true;
            }
        }
        return z12;
    }

    @Y61.l
    public final k81 c() {
        return this.f388188d;
    }

    public final boolean d() {
        return this.f388190f;
    }

    @Y61.k
    public final ArrayList e() {
        return this.f388189e;
    }

    @Y61.k
    public final String f() {
        return this.f388186b;
    }

    public final boolean g() {
        return this.f388187c;
    }

    @Y61.k
    public final o81 h() {
        return this.f388185a;
    }

    public final void i() {
        this.f388190f = false;
    }

    public final void j() {
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.f388185a) {
            try {
                this.f388187c = true;
                if (b()) {
                    this.f388185a.a(this);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Y61.k
    public final String toString() {
        return this.f388186b;
    }

    public final void a(@Y61.k k81 k81Var, long j12) {
        synchronized (this.f388185a) {
            if (this.f388187c) {
                if (k81Var.a()) {
                    o81 o81Var = o81.f388458h;
                    if (o81.b.a().isLoggable(Level.FINE)) {
                        l81.a(k81Var, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    o81 o81Var2 = o81.f388458h;
                    if (o81.b.a().isLoggable(Level.FINE)) {
                        l81.a(k81Var, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (a(k81Var, j12, false)) {
                this.f388185a.a(this);
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final boolean a(@Y61.k k81 k81Var, long j12, boolean z12) {
        String string;
        k81Var.a(this);
        long jA2 = this.f388185a.d().a();
        long j13 = jA2 + j12;
        int iIndexOf = this.f388189e.indexOf(k81Var);
        if (iIndexOf != -1) {
            if (k81Var.c() <= j13) {
                o81 o81Var = o81.f388458h;
                if (o81.b.a().isLoggable(Level.FINE)) {
                    l81.a(k81Var, this, "already scheduled");
                }
                return false;
            }
            this.f388189e.remove(iIndexOf);
        }
        k81Var.a(j13);
        o81 o81Var2 = o81.f388458h;
        if (o81.b.a().isLoggable(Level.FINE)) {
            if (z12) {
                StringBuilder sbA = Cif.a("run again after ");
                sbA.append(l81.a(j13 - jA2));
                string = sbA.toString();
            } else {
                StringBuilder sbA2 = Cif.a("scheduled after ");
                sbA2.append(l81.a(j13 - jA2));
                string = sbA2.toString();
            }
            l81.a(k81Var, this, string);
        }
        Iterator it = this.f388189e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((k81) it.next()).c() - jA2 > j12) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f388189e.size();
        }
        this.f388189e.add(size, k81Var);
        return size == 0;
    }

    public final void a() {
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.f388185a) {
            try {
                if (b()) {
                    this.f388185a.a(this);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
