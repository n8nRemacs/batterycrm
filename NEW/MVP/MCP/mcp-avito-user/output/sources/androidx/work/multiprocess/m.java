package androidx.work.multiprocess;

import androidx.work.multiprocess.InterfaceC23622c;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.SafeContinuation;

/* compiled from: RemoteExecute.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/multiprocess/m;", "Landroidx/work/multiprocess/c$b;", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends InterfaceC23622c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f56173a;

    public m(SafeContinuation safeContinuation) {
        this.f56173a = safeContinuation;
    }

    @Override // androidx.work.multiprocess.InterfaceC23622c
    public final void F0(byte[] bArr) {
        int i12 = Z.f406624c;
        this.f56173a.resumeWith(bArr);
    }

    @Override // androidx.work.multiprocess.InterfaceC23622c
    public final void onFailure(String str) {
        int i12 = Z.f406624c;
        this.f56173a.resumeWith(new Z.b(new RuntimeException(str)));
    }
}
