package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.d0;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f412281a = d0.d(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a0 f412282b = new a0("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a0 f412283c = new a0("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a0 f412284d = new a0("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a0 f412285e = new a0("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    public static final int f412286f = d0.d(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
}
