package androidx.room;

import Z1.c;
import android.os.CancellationSignal;
import kotlin.Metadata;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.room.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23478w extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f54417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.N0 f54418m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23478w(CancellationSignal cancellationSignal, kotlinx.coroutines.N0 n02) {
        super(1);
        this.f54417l = cancellationSignal;
        this.f54418m = n02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        CancellationSignal cancellationSignal = this.f54417l;
        int i12 = c.a.f19817a;
        cancellationSignal.cancel();
        ((kotlinx.coroutines.V0) this.f54418m).c(null);
        return kotlin.G0.f406611a;
    }
}
