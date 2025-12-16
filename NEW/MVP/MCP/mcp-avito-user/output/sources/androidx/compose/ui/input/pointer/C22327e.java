package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerEvent.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "", "uptimeMillis", "Ll0/g;", "position", "<init>", "(JJLkotlin/jvm/internal/w;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22327e {

    /* renamed from: a, reason: collision with root package name */
    public final long f40209a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40210b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40211c;

    public C22327e(long j12, long j13, C42822w c42822w) {
        this.f40209a = j12;
        this.f40210b = j13;
        l0.g.f413384b.getClass();
        this.f40211c = 0L;
    }

    @Y61.k
    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f40209a + ", position=" + ((Object) l0.g.l(this.f40210b)) + ')';
    }

    public C22327e(long j12, long j13, long j14, C42822w c42822w) {
        this(j12, j13, null);
        this.f40211c = j14;
    }
}
