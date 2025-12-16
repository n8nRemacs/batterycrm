package androidx.core.os;

import android.os.OutcomeReceiver;
import j.X;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: OutcomeReceiver.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/core/os/h;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* renamed from: androidx.core.os.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22780h<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.r f44802b;

    public C22780h(@Y61.k kotlinx.coroutines.r rVar) {
        super(false);
        this.f44802b = rVar;
    }

    public final void onError(@Y61.k E e12) {
        if (compareAndSet(false, true)) {
            kotlinx.coroutines.r rVar = this.f44802b;
            int i12 = Z.f406624c;
            rVar.resumeWith(new Z.b(e12));
        }
    }

    public final void onResult(R r12) {
        if (compareAndSet(false, true)) {
            kotlinx.coroutines.r rVar = this.f44802b;
            int i12 = Z.f406624c;
            rVar.resumeWith(r12);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @Y61.k
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
