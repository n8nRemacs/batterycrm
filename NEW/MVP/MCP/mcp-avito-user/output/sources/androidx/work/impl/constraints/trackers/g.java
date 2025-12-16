package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ConstraintTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/g;", "T", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.utils.taskexecutor.b f55716a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f55717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f55718c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet<androidx.work.impl.constraints.a<T>> f55719d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public T f55720e;

    public g(@Y61.k Context context, @Y61.k androidx.work.impl.utils.taskexecutor.b bVar) {
        this.f55716a = bVar;
        this.f55717b = context.getApplicationContext();
    }

    public abstract T a();

    public final void b(T t12) {
        synchronized (this.f55718c) {
            T t13 = this.f55720e;
            if (t13 == null || !t13.equals(t12)) {
                this.f55720e = t12;
                this.f55716a.c().execute(new J11.c(19, C42745f0.M0(this.f55719d), this));
                G0 g02 = G0.f406611a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
