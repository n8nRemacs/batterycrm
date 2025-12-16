package androidx.view;

import Fc1.G3;
import X41.f;
import X41.j;
import Y61.k;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.b;
import j.l0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComputableLiveData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/j;", "T", "", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23043j<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Executor f46802a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23041i f46803b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicBoolean f46804c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicBoolean f46805d;

    /* renamed from: e, reason: collision with root package name */
    @f
    @k
    public final G3 f46806e;

    @j
    public AbstractC23043j() {
        this(null, 1, null);
    }

    @l0
    public abstract T a();

    public AbstractC23043j(Executor executor, int i12, C42822w c42822w) {
        this.f46802a = (i12 & 1) != 0 ? b.f22694c : executor;
        this.f46803b = new C23041i(this);
        this.f46804c = new AtomicBoolean(true);
        this.f46805d = new AtomicBoolean(false);
        this.f46806e = new G3(this, 12);
    }
}
