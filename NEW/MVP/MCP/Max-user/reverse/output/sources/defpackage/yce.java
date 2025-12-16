package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class yce extends Segment {
    public final /* synthetic */ AtomicReferenceArray a;

    public yce(long j, yce yceVar, int i) {
        super(j, yceVar, i);
        this.a = new AtomicReferenceArray(xce.f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return xce.f;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void onCancellation(int i, Throwable th, x74 x74Var) {
        this.a.set(i, xce.e);
        onSlotCleaned();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
