package androidx.view;

import Y41.a;
import Y61.k;
import androidx.annotation.RestrictTo;
import j.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FullyDrawnReporter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/s;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Executor f21275a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final k f21276b;

    /* renamed from: d, reason: collision with root package name */
    @B
    public int f21278d;

    /* renamed from: e, reason: collision with root package name */
    @B
    public boolean f21279e;

    /* renamed from: f, reason: collision with root package name */
    @B
    public boolean f21280f;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f21277c = new Object();

    /* renamed from: g, reason: collision with root package name */
    @B
    @k
    public final ArrayList f21281g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final q f21282h = new q(this, 3);

    public s(@k Executor executor, @k k kVar) {
        this.f21275a = executor;
        this.f21276b = kVar;
    }

    @RestrictTo
    public final void a() {
        synchronized (this.f21277c) {
            try {
                this.f21280f = true;
                Iterator it = this.f21281g.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).invoke();
                }
                this.f21281g.clear();
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        int i12;
        synchronized (this.f21277c) {
            try {
                if (!this.f21280f && (i12 = this.f21278d) > 0) {
                    int i13 = i12 - 1;
                    this.f21278d = i13;
                    if (!this.f21279e && i13 == 0) {
                        this.f21279e = true;
                        this.f21275a.execute(this.f21282h);
                    }
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
