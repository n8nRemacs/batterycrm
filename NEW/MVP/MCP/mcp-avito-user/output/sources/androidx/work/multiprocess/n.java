package androidx.work.multiprocess;

import android.os.IBinder;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;

/* compiled from: RemoteExecute.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/IInterface;", "T", "Lkotlin/G0;", "binderDied", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class n implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f56174a;

    public n(SafeContinuation safeContinuation) {
        this.f56174a = safeContinuation;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i12 = Z.f406624c;
        this.f56174a.resumeWith(new Z.b(new RuntimeException("Binder died")));
    }
}
