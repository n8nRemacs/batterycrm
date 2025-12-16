package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: EventLoop.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/M;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43300s0 extends M {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f412136f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f412137c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f412138d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C42754k<AbstractC43229i0<?>> f412139e;

    public final void B(@Y61.k AbstractC43229i0<?> abstractC43229i0) {
        C42754k<AbstractC43229i0<?>> c42754k = this.f412139e;
        if (c42754k == null) {
            c42754k = new C42754k<>();
            this.f412139e = c42754k;
        }
        c42754k.addLast(abstractC43229i0);
    }

    public final void D(boolean z12) {
        this.f412137c = (z12 ? 4294967296L : 1L) + this.f412137c;
        if (z12) {
            return;
        }
        this.f412138d = true;
    }

    public final boolean G() {
        return this.f412137c >= 4294967296L;
    }

    public long H() {
        return !I() ? Long.MAX_VALUE : 0L;
    }

    public final boolean I() {
        AbstractC43229i0<?> abstractC43229i0V;
        C42754k<AbstractC43229i0<?>> c42754k = this.f412139e;
        if (c42754k == null || (abstractC43229i0V = c42754k.v()) == null) {
            return false;
        }
        abstractC43229i0V.run();
        return true;
    }

    public final void y(boolean z12) {
        long j12 = this.f412137c - (z12 ? 4294967296L : 1L);
        this.f412137c = j12;
        if (j12 <= 0 && this.f412138d) {
            shutdown();
        }
    }

    public void shutdown() {
    }
}
